/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ed118
 */

/* cpr::Session::SetReadCallback(cpr::ReadCallback const&) */

void __thiscall cpr::Session::SetReadCallback(Session *this,ReadCallback *param_1)

{
  long lVar1;
  ReadCallback *pRVar2;
  code *pcVar3;
  undefined8 uVar4;
  function<bool(char*,unsigned_long&,long)> afStack_80 [32];
  long *local_60;
  long local_48;
  
  local_60 = (long *)afStack_80;
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  uVar4 = *(undefined8 *)param_1;
  *(undefined8 *)(this + 0xe8) = *(undefined8 *)(param_1 + 8);
  *(undefined8 *)(this + 0xe0) = uVar4;
  pRVar2 = *(ReadCallback **)(param_1 + 0x30);
  if (pRVar2 == (ReadCallback *)0x0) {
    local_60 = (long *)0x0;
  }
  else if (param_1 + 0x10 == pRVar2) {
    (**(code **)(*(long *)pRVar2 + 0x18))(pRVar2,afStack_80);
  }
  else {
    local_60 = (long *)(**(code **)(*(long *)pRVar2 + 0x10))();
  }
  std::__ndk1::function<bool(char*,unsigned_long&,long)>::swap(afStack_80,(function *)(this + 0xf0))
  ;
  if (afStack_80 == (function<bool(char*,unsigned_long&,long)> *)local_60) {
    pcVar3 = *(code **)(*local_60 + 0x20);
  }
  else {
    if (local_60 == (long *)0x0) goto LAB_008ed1d4;
    pcVar3 = *(code **)(*local_60 + 0x28);
  }
  (*pcVar3)();
LAB_008ed1d4:
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x75a3,*(undefined8 *)(param_1 + 8));
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x75a8,*(undefined8 *)(param_1 + 8));
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x4e2c,util::readUserFunction);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2719,this + 0xe0);
  this[0x11] = (Session)(*(long *)(param_1 + 8) == -1);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

