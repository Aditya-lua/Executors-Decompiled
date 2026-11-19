/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097c7c8
 */

/* ix::HttpServer::makeDebugServer() */

void __thiscall ix::HttpServer::makeDebugServer(HttpServer *this)

{
  long lVar1;
  code *pcVar2;
  undefined **local_90;
  HttpServer *pHStack_88;
  long *local_70;
  undefined **local_60;
  HttpServer *pHStack_58;
  undefined ***local_40;
  long local_28;
  
  local_70 = (long *)&local_90;
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_90 = &PTR_LAB_00c51b58;
  local_60 = &PTR_LAB_00c51b58;
  pHStack_88 = this;
  pHStack_58 = this;
  local_40 = &local_60;
  std::__ndk1::
  function<std::__ndk1::shared_ptr<ix::HttpResponse>(std::__ndk1::shared_ptr<ix::HttpRequest>,std::__ndk1::shared_ptr<ix::ConnectionState>)>
  ::swap((function<std::__ndk1::shared_ptr<ix::HttpResponse>(std::__ndk1::shared_ptr<ix::HttpRequest>,std::__ndk1::shared_ptr<ix::ConnectionState>)>
          *)&local_60,(function *)(this + 0x2f0));
  if (&local_60 == local_40) {
    pcVar2 = (code *)(*local_40)[4];
LAB_0097c838:
    (*pcVar2)();
  }
  else if (local_40 != (undefined ***)0x0) {
    pcVar2 = (code *)(*local_40)[5];
    goto LAB_0097c838;
  }
  if (&local_90 == (undefined ***)local_70) {
    pcVar2 = *(code **)(*local_70 + 0x20);
  }
  else {
    if (local_70 == (long *)0x0) goto LAB_0097c868;
    pcVar2 = *(code **)(*local_70 + 0x28);
  }
  (*pcVar2)();
LAB_0097c868:
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

