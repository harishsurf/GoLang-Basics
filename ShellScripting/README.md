## Top Linux Commands everyone should know

- https://www.freecodecamp.org/news/the-linux-commands-handbook/

## Introduction

- https://www.guru99.com/introduction-to-shell-scripting.html
- https://swcarpentry.github.io/shell-novice/reference/

## Commands

- `$@` refers to an array-like construct of all shell script’s command-line arguments. (Similar to `args[]` in java).
  Usage:
  `./test.sh foo bar`

```shell script
# inside test.sh
some_var $@   # will store "foo" and "bar" in some_var
```

- `$<`
- `$0`: Name of the shell script
- `$1`: 1st arg `$2`: 2nd arg

### Curl

- flags

* s => `--silent` option. It doesn't show progress bar with this flag
* L => (HTTP/HTTPS) If the server reports that the requested page has a different location (indicated with the header line Location:) this flag will let curl attempt to reattempt the get on the new place.
* o => `--output <file>`. It writes output to file instead of stdout

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

#### Syntax:

A Makefile consists of a set of rules. A rule generally looks like this:

```sh
targets : prerequisities
   command
   command
   command
```

- The targets are file names, seperated by spaces. Typically, there is only one per rule.
- The commands are a series of steps typically used to make the target(s). These need to start with a tab character, not spaces.
- The prerequisites are also file names, seperated by spaces. These files need to exist before the commands for the target are run.

* Automatic variables in Makefile
  `$@` : evaluates to target
  `$<` : evaluates to 1st prerequisite (usually a source file in the command)
  <br/>Refer to : - https://stackoverflow.com/questions/3220277/what-do-the-makefile-symbols-and-mean - https://www.gnu.org/software/make/manual/html_node/Automatic-Variables.html

## sed

- Is a powerful text Stream EDitor.
- Can do insertion, deletion, search and replace(substitution).

```shell script
sed 's/unix/linux/g' geekfile.txt
```

- “s” specifies the substitution operation.
- The “/” are delimiters - You could use `@`, `;` etc as delimiters.
- The “unix” is the search pattern and the “linux” is the replacement string.
- /g (global replacement) - /1, /2 etc flags to replace the first, second occurrence of a pattern

Reference: https://www.geeksforgeeks.org/sed-command-in-linux-unix-with-examples/
