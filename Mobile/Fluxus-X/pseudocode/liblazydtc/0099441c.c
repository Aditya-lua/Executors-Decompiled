/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099441c
 */

/* ix::WebSocketServer::makeBroadcastServer() */

void __thiscall ix::WebSocketServer::makeBroadcastServer(WebSocketServer *this)

{
  long lVar1;
  code *pcVar2;
  undefined **local_90;
  WebSocketServer *pWStack_88;
  long *local_70;
  undefined **local_60;
  WebSocketServer *pWStack_58;
  undefined ***local_40;
  long local_28;
  
  local_70 = (long *)&local_90;
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_90 = &PTR_LAB_00c523c8;
  local_60 = &PTR_LAB_00c523c8;
  pWStack_88 = this;
  pWStack_58 = this;
  local_40 = &local_60;
  std::__ndk1::
  function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
  ::swap((function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
          *)&local_60,(function *)(this + 0x280));
  if (&local_60 == local_40) {
    pcVar2 = (code *)(*local_40)[4];
LAB_0099448c:
    (*pcVar2)();
  }
  else if (local_40 != (undefined ***)0x0) {
    pcVar2 = (code *)(*local_40)[5];
    goto LAB_0099448c;
  }
  if (&local_90 == (undefined ***)local_70) {
    pcVar2 = *(code **)(*local_70 + 0x20);
  }
  else {
    if (local_70 == (long *)0x0) goto LAB_009944bc;
    pcVar2 = *(code **)(*local_70 + 0x28);
  }
  (*pcVar2)();
LAB_009944bc:
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

