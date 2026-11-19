/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f3204
 */

/* cpr::Session::SetOption(cpr::Interface const&) */

void __thiscall cpr::Session::SetOption(Session *this,Interface *param_1)

{
  ulong uVar1;
  Interface IVar2;
  Interface *pIVar3;
  
  IVar2 = param_1[8];
  uVar1 = (ulong)((byte)IVar2 >> 1);
  if (((byte)IVar2 & 1) != 0) {
    uVar1 = *(ulong *)(param_1 + 0x10);
  }
  if (uVar1 == 0) {
    curl_easy_setopt(**(undefined8 **)(this + 0x18),0x274e,0);
    return;
  }
  pIVar3 = *(Interface **)(param_1 + 0x18);
  if (((byte)IVar2 & 1) == 0) {
    pIVar3 = param_1 + 9;
  }
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x274e,pIVar3);
  return;
}

