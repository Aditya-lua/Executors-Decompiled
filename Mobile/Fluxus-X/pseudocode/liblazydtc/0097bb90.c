/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097bb90
 */

/* ix::HttpServer::HttpServer(int, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, int, unsigned long, int, int, int) */

void __thiscall
ix::HttpServer::HttpServer
          (HttpServer *this,int param_1,basic_string_conflict *param_2,int param_3,ulong param_4,
          int param_5,int param_6,int param_7)

{
  long lVar1;
  code *pcVar2;
  undefined **local_a0;
  HttpServer *pHStack_98;
  long *local_80;
  undefined **local_70;
  HttpServer *pHStack_68;
  undefined ***local_50;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  WebSocketServer::WebSocketServer
            ((WebSocketServer *)this,param_1,param_2,param_3,param_4,param_7,param_5);
  *(int *)(this + 800) = param_6;
  *(undefined ***)this = &PTR__HttpServer_00c51a00;
  *(undefined8 *)(this + 0x310) = 0;
  local_a0 = &PTR_LAB_00c51a58;
  local_70 = &PTR_LAB_00c51a58;
  pHStack_98 = this;
  local_80 = (long *)&local_a0;
  pHStack_68 = this;
  local_50 = &local_70;
  std::__ndk1::
  function<std::__ndk1::shared_ptr<ix::HttpResponse>(std::__ndk1::shared_ptr<ix::HttpRequest>,std::__ndk1::shared_ptr<ix::ConnectionState>)>
  ::swap((function<std::__ndk1::shared_ptr<ix::HttpResponse>(std::__ndk1::shared_ptr<ix::HttpRequest>,std::__ndk1::shared_ptr<ix::ConnectionState>)>
          *)&local_70,(function *)(this + 0x2f0));
  if (&local_70 == local_50) {
    pcVar2 = (code *)(*local_50)[4];
LAB_0097bc30:
    (*pcVar2)();
  }
  else if (local_50 != (undefined ***)0x0) {
    pcVar2 = (code *)(*local_50)[5];
    goto LAB_0097bc30;
  }
  if (&local_a0 == (undefined ***)local_80) {
    pcVar2 = *(code **)(*local_80 + 0x20);
  }
  else {
    if (local_80 == (long *)0x0) goto LAB_0097bc60;
    pcVar2 = *(code **)(*local_80 + 0x28);
  }
  (*pcVar2)();
LAB_0097bc60:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

