
bool FUN_00678794(void)

{
  bool bVar1;
  bool bVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  
  ___cxa_free_exception();
  lVar3 = __Unwind_Resume();
  uVar4 = *(ulong *)(lVar3 + 0x10);
  if (uVar4 == 0) {
    return true;
  }
  uVar5 = 0;
  uVar6 = 1;
  do {
    lVar7 = *(long *)(*(long *)(lVar3 + 0x18) + uVar5 * 8);
    bVar1 = uVar6 <= uVar4;
    bVar2 = uVar4 != uVar6;
    uVar5 = uVar6;
    uVar6 = (ulong)((int)uVar6 + 1);
  } while ((lVar7 == 0 && bVar1) && (lVar7 != 0 || bVar2));
  return lVar7 == 0;
}

