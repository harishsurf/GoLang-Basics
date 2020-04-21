## Intro to channels

* Channels are the pipes that connect concurrent goroutines. You can send values into channels from one goroutine and receive those values into another goroutine.
* To create a new channel: `make(chan val-type)`
```shell script
messages := make(chan string)
```
* Syntax to send a message TO the channel `channelName <- value`
```shell script
 go func() { messages <- "ping" }()
```
Here we send "ping" to the messages channel we made above, from a new goroutine.

* Syntax to receive a value FROM the channel `<-channel`
```shell script
msg := <-messages
fmt.Println(msg)
```
 Here we receive the "ping" message we sent above and print it out.

