
void FUN_005fc1cc(void)

{
  ulong uVar1;
  bool in_CY;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  ulong unaff_x19;
  long unaff_x23;
  
  if (in_CY) {
    uVar1 = 2;
    uVar3 = 1;
    do {
      uVar2 = uVar1;
      lVar4 = *(long *)(unaff_x23 + uVar3 * 8);
      *(long *)(unaff_x23 + uVar3 * 8) = lVar4 + 1;
      uVar1 = (ulong)((int)uVar2 + 1);
      uVar3 = uVar2;
    } while ((lVar4 == -1 && uVar2 <= unaff_x19) && (lVar4 != -1 || unaff_x19 != uVar2));
  }
  return;
}

