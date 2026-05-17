FROM ubuntu
# Shell form: whatever command will be executed as a child process, current processes + 1 process
# CMD ps
# Exec form: no new shell created, only one process
# CMD ["ps"]
#####
# with shell form, this is correctly executed 
# CMD echo $PATH
# with exec form, this is interpreted literally,
CMD ["echo", "$PATH"]