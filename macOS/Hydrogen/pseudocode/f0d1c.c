
void FUN_000f0d1c(void)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  int in_w8;
  long unaff_x19;
  int unaff_w20;
  long unaff_x21;
  int unaff_w22;
  
  *(long *)(unaff_x19 + 0x48) = unaff_x21 + (long)unaff_w22 * (long)in_w8;
  iVar4 = *(int *)(unaff_x19 + 0x10);
  iVar5 = *(int *)(unaff_x19 + 0x14);
  uVar1 = iVar4 + unaff_w20;
  if (iVar5 < (int)uVar1) {
    iVar2 = iVar5;
    if (iVar5 < 0) {
      iVar2 = iVar5 + 1;
    }
    uVar3 = 8;
    if (iVar5 != 0) {
      uVar3 = iVar5 + (iVar2 >> 1);
    }
    if ((int)uVar3 <= (int)uVar1) {
      uVar3 = uVar1;
    }
    lVar6 = func_0x000b810c(-(ulong)(uVar3 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar3 << 1);
    if (*(long *)(unaff_x19 + 0x18) != 0) {
      _memcpy(lVar6,*(long *)(unaff_x19 + 0x18),(long)*(int *)(unaff_x19 + 0x10) << 1);
      func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x18));
    }
    *(long *)(unaff_x19 + 0x18) = lVar6;
    *(uint *)(unaff_x19 + 0x14) = uVar3;
  }
  else {
    lVar6 = *(long *)(unaff_x19 + 0x18);
  }
  *(uint *)(unaff_x19 + 0x10) = uVar1;
  *(long *)(unaff_x19 + 0x50) = lVar6 + (long)iVar4 * 2;
  return;
}

