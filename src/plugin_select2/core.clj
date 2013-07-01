(ns plugin-select2.core
  (:require
    [plugin-jquery.core :as jquery]))

(def css
  [:link {:rel "stylesheet"
          :href "/plugins/select2/select2.css"}])

(def js
  (list jquery/js
        [:script {:src "/plugins/select2/select2.min.js"}]))

(def js-debug
  (list jquery/js
        [:script {:src "/plugins/select2/select2.js"}]))
