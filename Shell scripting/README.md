## Introduction
* https://www.guru99.com/introduction-to-shell-scripting.html
* https://swcarpentry.github.io/shell-novice/reference/


## Commands
* `$@` refers to all of a shell script’s command-line arguments. (Similar to `args[]` in java). 
Usage:
`./test.sh foo bar`
```shell script
# inside test.sh
some_var $@   # will store "foo" and "bar" in some_var 
```
* `$<`
* `S`


### Curl 
* flags
 -s => `--silent` option. It doesn't show progress bar with this flag
 -L => (HTTP/HTTPS) If the server reports that the requested page has a different location (indicated with the header line Location:) this flag will let curl attempt to reattempt the get on the new place. 
 -o => `--output <file>`. It writes output to file instead of stdout
 
### `Crontab` for running cron jobs
```sh
* * * * * command to be executed
- - - - -
| | | | |
| | | | ----- Day of week (0 - 7) (Sunday=0 or 7)
| | | ------- Month (1 - 12)
| | --------- Day of month (1 - 31)
| ----------- Hour (0 - 23)
------------- Minute (0 - 59)
```

https://www.cyberciti.biz/faq/how-do-i-add-jobs-to-cron-under-linux-or-unix-oses/ 


## Makefile

* Automatic variables in Makefile
    `$@`
    `$<`
<br/>Refer to :
    - https://stackoverflow.com/questions/3220277/what-do-the-makefile-symbols-and-mean
    - https://www.gnu.org/software/make/manual/html_node/Automatic-Variables.html