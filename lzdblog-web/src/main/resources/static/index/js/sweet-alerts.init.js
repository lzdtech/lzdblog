!
function(t) {
    "use strict";
    var n = function() {};
    n.prototype.init = function() {
        t("#sa-title").on("click",
        function() {
            swal({
            	title: "互联网？",
                text: "那东西还在吗？",
                type: "question",
                confirmButtonClass: "btn btn-confirm mt-2"
            }).
            catch(swal.noop)
        })
    },
    t.SweetAlert = new n,
    t.SweetAlert.Constructor = n
} (window.jQuery),
function(t) {
    "使用严格";
    t.SweetAlert.init()
} (window.jQuery);