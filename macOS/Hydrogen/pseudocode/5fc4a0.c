
void FUN_005fc4a0(long param_1)

{
  ulong uVar1;
  bool in_ZR;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  ulong unaff_x20;
  
  if (in_ZR) {
    uVar1 = 2;
    uVar3 = 1;
    do {
      uVar2 = uVar1;
      lVar4 = *(long *)(param_1 + uVar3 * 8);
      *(long *)(param_1 + uVar3 * 8) = lVar4 + 1;
      uVar1 = (ulong)((int)uVar2 + 1);
      uVar3 = uVar2;
    } while ((lVar4 == -1 && uVar2 <= unaff_x20) && (lVar4 != -1 || unaff_x20 != uVar2));
  }
  return;
}

