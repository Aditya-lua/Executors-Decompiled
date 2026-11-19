/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ebd68
 */

/* cpr::Session::SetRedirect(cpr::Redirect const&) */

void __thiscall cpr::Session::SetRedirect(Session *this,Redirect *param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x34,param_1[8]);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x44,*(undefined8 *)param_1);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x69,param_1[9]);
  operator&(param_1[10],1);
  uVar2 = any();
  operator&(param_1[10],2);
  uVar3 = any();
  uVar1 = uVar2 & 1 | 2;
  if ((uVar3 & 1) == 0) {
    uVar1 = uVar2 & 1;
  }
  operator&(param_1[10],4);
  uVar3 = any();
  uVar2 = uVar1 | 4;
  if ((uVar3 & 1) == 0) {
    uVar2 = uVar1;
  }
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0xa1,uVar2);
  return;
}

