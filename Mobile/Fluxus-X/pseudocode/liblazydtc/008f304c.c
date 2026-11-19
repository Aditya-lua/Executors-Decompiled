/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f304c
 */

/* cpr::Session::SetOption(cpr::Body const&) */

void __thiscall cpr::Session::SetOption(Session *this,Body *param_1)

{
  ulong uVar1;
  Body *pBVar2;
  
  this[0x10] = (Session)0x1;
  uVar1 = (ulong)((byte)param_1[8] >> 1);
  if (((byte)param_1[8] & 1) != 0) {
    uVar1 = *(ulong *)(param_1 + 0x10);
  }
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x75a8,uVar1);
  pBVar2 = param_1 + 9;
  if (((byte)param_1[8] & 1) != 0) {
    pBVar2 = *(Body **)(param_1 + 0x18);
  }
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x271f,pBVar2);
  return;
}

