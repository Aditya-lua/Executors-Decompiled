/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00993378
 */

/* std::__ndk1::function<void (std::__ndk1::weak_ptr<ix::WebSocket>,
   std::__ndk1::shared_ptr<ix::ConnectionState>)>::~function() */

void __thiscall
std::__ndk1::
function<void(std::__ndk1::weak_ptr<ix::WebSocket>,std::__ndk1::shared_ptr<ix::ConnectionState>)>::
~function(function<void(std::__ndk1::weak_ptr<ix::WebSocket>,std::__ndk1::shared_ptr<ix::ConnectionState>)>
          *this)

{
  function<void(std::__ndk1::weak_ptr<ix::WebSocket>,std::__ndk1::shared_ptr<ix::ConnectionState>)>
  *pfVar1;
  
  pfVar1 = *(function<void(std::__ndk1::weak_ptr<ix::WebSocket>,std::__ndk1::shared_ptr<ix::ConnectionState>)>
             **)(this + 0x20);
  if (this == pfVar1) {
                    /* WARNING: Could not recover jumptable at 0x009933a0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*(long *)pfVar1 + 0x20))();
    return;
  }
  if (pfVar1 == (function<void(std::__ndk1::weak_ptr<ix::WebSocket>,std::__ndk1::shared_ptr<ix::ConnectionState>)>
                 *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00993394. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)pfVar1 + 0x28))();
  return;
}

