(defproject cljs-landing "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.597"]]
  :repl-options {:init-ns cljs-landing.core}
  :plugins [[lein-cljsbuild "1.1.7"]]
  :clean-targets ˆ {:protect false} ["resources/public/js/out" "resources/public/js/bundle.js"]
  :cljs-build {:builds {:dev {:source-paths ["src"]
                              :compiler {:main cljs-landing.core
                                         :output-to "resources/public/js/bundle.js"
                                         :output-dir "resources/public/js/out"
                                         :asset-path "js/out"
                                         :optimizations :none
                                         :source-map true}}}})
