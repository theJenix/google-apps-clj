(defproject google-apps-clj "0.2.3"
  :description "A Clojure library that wraps the Google Java API"
  :url "https://github.com/SparkFund/google-apps-clj"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/core.typed "0.3.0-alpha2"]
                 [com.google.apis/google-api-services-calendar "v3-rev128-1.20.0"]
                 [com.google.apis/google-api-services-drive "v2-rev168-1.20.0"]
                 [com.google.gdata/core "1.47.1"]])
