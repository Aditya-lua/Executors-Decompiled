/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2fb4
 */

/* cpr::Session::SetOption(cpr::ProxyAuthentication&&) */

void __thiscall cpr::Session::SetOption(Session *this,ProxyAuthentication *param_1)

{
  ProxyAuthentication *pPVar1;
  long lVar2;
  long lVar3;
  Session *pSVar4;
  
  pSVar4 = this + 0x88;
  FUN_00826780(this + 0x80,*(undefined8 *)pSVar4);
  *(undefined8 *)(this + 0x80) = *(undefined8 *)param_1;
  pPVar1 = param_1 + 8;
  lVar2 = *(long *)pPVar1;
  *(long *)pSVar4 = lVar2;
  lVar3 = *(long *)(param_1 + 0x10);
  *(long *)(this + 0x90) = lVar3;
  if (lVar3 == 0) {
    *(Session **)(this + 0x80) = pSVar4;
  }
  else {
    *(Session **)(lVar2 + 0x10) = pSVar4;
    *(ProxyAuthentication **)param_1 = pPVar1;
    *(undefined8 *)pPVar1 = 0;
    *(undefined8 *)(param_1 + 0x10) = 0;
  }
  return;
}

