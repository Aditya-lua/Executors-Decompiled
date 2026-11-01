
void FUN_006077dc(ulong param_1)

{
  long in_x9;
  ulong *puVar1;
  ulong uVar2;
  long in_x12;
  long lVar3;
  ulong uVar4;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x24;
  int unaff_w26;
  
  if (in_x9 != 0) {
    uVar2 = 0;
    lVar3 = in_x12 + (unaff_x24 & 0xffffffff);
    puVar1 = (ulong *)(unaff_x21 + unaff_x22 * 8);
    do {
      uVar4 = *puVar1;
      *puVar1 = uVar4 << (param_1 & 0x3f) | uVar2;
      uVar2 = uVar4 >> ((ulong)(0x40 - unaff_w26) & 0x3f);
      lVar3 = lVar3 + -1;
      puVar1 = puVar1 + 1;
    } while (lVar3 != 0);
  }
  return;
}

