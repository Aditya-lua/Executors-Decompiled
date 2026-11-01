
void FUN_005fc488(long *param_1)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  ulong unaff_x20;
  
  lVar2 = *param_1;
  *param_1 = lVar2 + 1;
  if ((1 < unaff_x20) && (lVar2 == -1)) {
    uVar1 = 2;
    uVar4 = 1;
    do {
      uVar3 = uVar1;
      lVar2 = param_1[uVar4];
      param_1[uVar4] = lVar2 + 1;
      uVar1 = (ulong)((int)uVar3 + 1);
      uVar4 = uVar3;
    } while ((lVar2 == -1 && uVar3 <= unaff_x20) && (lVar2 != -1 || unaff_x20 != uVar3));
  }
  return;
}

