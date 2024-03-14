(defproject protojure-repro "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [io.github.protojure/io "2.8.2"]
                 [io.github.protojure/core "2.8.2"]
                 [io.github.protojure/grpc-client "2.8.2"]
                 [io.github.protojure/grpc-server "2.8.2"]
                 [io.github.protojure/google.protobuf "2.0.1"]
                 [org.eclipse.jetty.http2/http2-client "11.0.20"]
                 [org.eclipse.jetty/jetty-alpn-java-client "11.0.20"]]
  :main ^:skip-aot protojure-repro.core)
