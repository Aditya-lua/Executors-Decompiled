/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009970f0
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* ix::WebSocketTransport::setReadyState(ix::WebSocketTransport::ReadyState) */

void __thiscall ix::WebSocketTransport::setReadyState(WebSocketTransport *this,int param_2)

{
  ulong uVar1;
  undefined2 uVar2;
  long lVar3;
  char *pcVar4;
  long *plVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  WebSocketTransport *pWVar8;
  byte local_5c [4];
  undefined8 local_58;
  undefined2 local_4c [2];
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  if (*(int *)(this + 0xe0) == param_2) goto LAB_00997244;
  if (param_2 == 3) {
    std::__ndk1::mutex::lock((mutex *)(this + 0x2b0));
    uVar6 = std::__ndk1::chrono::steady_clock::now();
    *(undefined8 *)(this + 0x2d8) = uVar6;
    std::__ndk1::mutex::unlock((mutex *)(this + 0x2b0));
    pWVar8 = this + 0x280;
LAB_00997238:
    *pWVar8 = (WebSocketTransport)0x0;
  }
  else if (param_2 == 1) {
    if (*(long *)(this + 0x110) != 0) {
      uVar2 = *(undefined2 *)(this + 0x160);
      std::__ndk1::mutex::lock((mutex *)(this + 0x138));
      std::__ndk1::mutex::unlock((mutex *)(this + 0x138));
      local_58 = *(undefined8 *)(this + 0x168);
      local_5c[0] = (byte)this[0x170] & 1;
      plVar5 = *(long **)(this + 0x110);
      local_4c[0] = uVar2;
      if (plVar5 == (long *)0x0) {
        puVar7 = (undefined8 *)__cxa_allocate_exception(8);
        *puVar7 = &PTR__bad_function_call_00cac7b8;
                    /* WARNING: Subroutine does not return */
        __cxa_throw(puVar7,&std::__ndk1::bad_function_call::typeinfo,
                    std::bad_exception::~bad_exception);
      }
      (**(code **)(*plVar5 + 0x30))(plVar5,local_4c,this + 0x120,&local_58,local_5c);
    }
    std::__ndk1::mutex::lock((mutex *)(this + 0x138));
    if ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
        (this + 0x120) !=
        (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
        &WebSocketCloseConstants::kInternalErrorMessage) {
      if ((WebSocketCloseConstants::kInternalErrorMessage & 1) == 0) {
        uVar1 = (ulong)(WebSocketCloseConstants::kInternalErrorMessage >> 1);
        pcVar4 = (char *)&DAT_00d21729;
      }
      else {
        uVar1 = ram0x00d21730;
        pcVar4 = DAT_00d21738;
      }
                    /* try { // try from 00997208 to 0099720f has its CatchHandler @ 0099729c */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             (this + 0x120),pcVar4,uVar1);
    }
    std::__ndk1::mutex::unlock((mutex *)(this + 0x138));
    *(undefined2 *)(this + 0x160) = 0x3f3;
    *(undefined8 *)(this + 0x168) = 0;
    pWVar8 = this + 0x170;
    goto LAB_00997238;
  }
  *(int *)(this + 0xe0) = param_2;
LAB_00997244:
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

