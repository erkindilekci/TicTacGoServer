# TicTacGo Server

<img src="https://repository-images.githubusercontent.com/40136600/f3f5fd00-c59e-11e9-8284-cb297d193133" alt="Ktor" width="400" style="max-width:100%;">


[Ktor](https://ktor.io/) is an asynchronous framework for creating microservices, web applications and more. Written in Kotlin from the ground up.

- [Routing](https://ktor.io/docs/routing-in-ktor.html) - Routing is the core Ktor plugin for handling incoming requests in a server application. In addition to routing HTTP requests, Ktor also provides support for WebSockets, allowing you to implement WebSocket endpoints and facilitate real-time, bidirectional communication between the server and the client.
- [Content Negotiation and Serialization](https://ktor.io/docs/serialization.html) - Ktor supports content negotiation and serialization, which involves serializing and deserializing the content in a specific format. Out-of-the-box, Ktor supports popular formats such as JSON, XML, and CBOR. It also seamlessly integrates with Kotlinx Serialization, a library for serializing Kotlin objects to and from JSON or other formats. This enables you to easily handle data interchange between the server and clients in a flexible and efficient manner.
- [Monitoring](https://ktor.io/docs/call-logging.html) - Ktor provides features for monitoring and logging requests and responses. The Call Logging feature allows you to capture and log detailed information about incoming requests and the corresponding responses. This enables you to monitor and analyze the performance and behavior of your Ktor application, aiding in troubleshooting and optimization.
- [WebSockets](https://ktor.io/docs/servers-raw-sockets.html): Additionally, Ktor provides built-in support for WebSockets. With the WebSockets feature, you can establish real-time, bidirectional communication between the server and clients over a persistent connection. This allows you to create interactive web applications that can push data from the server to connected clients instantly.


## License
```xml
Copyright 2023 Erkin Dilekci

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
