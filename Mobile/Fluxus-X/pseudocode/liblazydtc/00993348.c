/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00993348
 */

/* std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::ConnectionState>, ix::WebSocket&,
   std::__ndk1::unique_ptr<ix::WebSocketMessage, std::__ndk1::default_delete<ix::WebSocketMessage> >
   const&)>::~function() */

void __thiscall
std::__ndk1::
function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
::~function(function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
            *this)

{
  function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
  *pfVar1;
  
  pfVar1 = *(function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
             **)(this + 0x20);
  if (this == pfVar1) {
                    /* WARNING: Could not recover jumptable at 0x00993370. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*(long *)pfVar1 + 0x20))();
    return;
  }
  if (pfVar1 == (function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
                 *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00993364. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)pfVar1 + 0x28))();
  return;
}

