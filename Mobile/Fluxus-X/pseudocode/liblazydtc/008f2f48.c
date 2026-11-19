/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2f48
 */

/* cpr::Session::SetOption(cpr::Proxies&&) */

void __thiscall cpr::Session::SetOption(Session *this,Proxies *param_1)

{
  Proxies *pPVar1;
  long lVar2;
  long lVar3;
  Session *pSVar4;
  
  pSVar4 = this + 0x70;
  FUN_008267e4(this + 0x68,*(undefined8 *)pSVar4);
  *(undefined8 *)(this + 0x68) = *(undefined8 *)param_1;
  pPVar1 = param_1 + 8;
  lVar2 = *(long *)pPVar1;
  *(long *)pSVar4 = lVar2;
  lVar3 = *(long *)(param_1 + 0x10);
  *(long *)(this + 0x78) = lVar3;
  if (lVar3 == 0) {
    *(Session **)(this + 0x68) = pSVar4;
  }
  else {
    *(Session **)(lVar2 + 0x10) = pSVar4;
    *(Proxies **)param_1 = pPVar1;
    *(undefined8 *)pPVar1 = 0;
    *(undefined8 *)(param_1 + 0x10) = 0;
  }
  return;
}

