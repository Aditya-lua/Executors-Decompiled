/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ee344
 */

/* cpr::Session::SetAuth(cpr::Authentication const&) */

void __thiscall cpr::Session::SetAuth(Session *this,Authentication *param_1)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  
  iVar1 = Authentication::GetAuthMode(param_1);
  if (iVar1 == 2) {
    puVar3 = *(undefined8 **)(this + 0x18);
    uVar2 = 8;
  }
  else if (iVar1 == 1) {
    puVar3 = *(undefined8 **)(this + 0x18);
    uVar2 = 2;
  }
  else {
    if (iVar1 != 0) {
      return;
    }
    puVar3 = *(undefined8 **)(this + 0x18);
    uVar2 = 1;
  }
  curl_easy_setopt(*puVar3,0x6b,uVar2);
  uVar4 = **(undefined8 **)(this + 0x18);
  uVar2 = Authentication::GetAuthString(param_1);
  curl_easy_setopt(uVar4,0x2715,uVar2);
  return;
}

