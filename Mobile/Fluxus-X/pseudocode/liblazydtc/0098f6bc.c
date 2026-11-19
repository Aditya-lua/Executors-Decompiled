/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098f6bc
 */

/* ix::WebSocket::setOnMessageCallback(std::__ndk1::function<void
   (std::__ndk1::unique_ptr<ix::WebSocketMessage, std::__ndk1::default_delete<ix::WebSocketMessage>
   > const&)> const&) */

void __thiscall ix::WebSocket::setOnMessageCallback(WebSocket *this,function *param_1)

{
  long lVar1;
  function *pfVar2;
  code *pcVar3;
  function<void(std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
  afStack_70 [32];
  long *local_50;
  long local_38;
  
  local_50 = (long *)afStack_70;
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  pfVar2 = *(function **)(param_1 + 0x20);
  if (pfVar2 == (function *)0x0) {
    local_50 = (long *)0x0;
  }
  else if (param_1 == pfVar2) {
    (**(code **)(*(long *)pfVar2 + 0x18))(pfVar2,afStack_70);
  }
  else {
    local_50 = (long *)(**(code **)(*(long *)pfVar2 + 0x10))(pfVar2);
  }
  std::__ndk1::
  function<void(std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
  ::swap(afStack_70,(function *)(this + 0x3d0));
  if (afStack_70 ==
      (function<void(std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
       *)local_50) {
    pcVar3 = *(code **)(*local_50 + 0x20);
  }
  else {
    if (local_50 == (long *)0x0) goto LAB_0098f764;
    pcVar3 = *(code **)(*local_50 + 0x28);
  }
  (*pcVar3)();
LAB_0098f764:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

