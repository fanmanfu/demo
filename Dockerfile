#来自基础镜像
FROM centos:7
#指定镜像创建者信息
MAINTAINER fanmanfu

RUN sh -c "$(wget https://raw.github.com/robbyrussell/oh-my-zsh/master/tools/install.sh -O -)"  || true; \
    echo "PROMPT='\$fg_bold[blue]%}(docker)\${ret_status} %{\$fg[cyan]%}%c%{\$reset_color%} \$(git_prompt_info)'" >> /root/.zshrc
ENV FLASK_ENV dev
ENV FLASK_APP main.py
ENV APP_DIR /code
WORKDIR /code/Vote

EXPOSE 5000

CMD ["bin/bash"]

