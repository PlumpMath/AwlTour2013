(ns browser-repl
  (:require [com.ewen.utils-cljs.utils :refer [add-load-event]]
            [com.ewen.utils-cljs.dev :refer [connect-repl]]
            [awl-tour-2013.goog-map :refer [map-obj]]))

(add-load-event #(google.maps.event/addListenerOnce map-obj "idle" connect-repl))

#_(connect-repl)