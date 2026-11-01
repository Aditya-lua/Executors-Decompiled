
void FUN_000eff48(void)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  int iVar6;
  long unaff_x19;
  long unaff_x20;
  uint unaff_w22;
  
  uVar2 = 8;
  if (7 < (int)unaff_w22) {
    uVar2 = unaff_w22;
  }
  uVar4 = func_0x000b810c(-(ulong)(uVar2 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar2 << 1);
  if (*(long *)(unaff_x20 + 0x18) != 0) {
    _memcpy(uVar4,*(long *)(unaff_x20 + 0x18),(long)*(int *)(unaff_x20 + 0x10) << 1);
    func_0x000b83d4(*(undefined8 *)(unaff_x20 + 0x18));
  }
  *(undefined8 *)(unaff_x20 + 0x18) = uVar4;
  *(uint *)(unaff_x20 + 0x10) = unaff_w22;
  *(uint *)(unaff_x20 + 0x14) = uVar2;
  if (*(long *)(unaff_x19 + 0x18) != 0) {
    _memcpy(uVar4,*(long *)(unaff_x19 + 0x18),(long)(int)unaff_w22 << 1);
  }
  if (*(long *)(unaff_x20 + 0x28) != 0) {
    *(undefined8 *)(unaff_x20 + 0x20) = 0;
    func_0x000b83d4();
    *(undefined8 *)(unaff_x20 + 0x28) = 0;
  }
  iVar3 = *(int *)(unaff_x19 + 0x20);
  iVar6 = *(int *)(unaff_x20 + 0x24);
  if (iVar6 < iVar3) {
    if (iVar6 == 0) {
      iVar6 = 8;
    }
    else {
      iVar1 = iVar6;
      if (iVar6 < 0) {
        iVar1 = iVar6 + 1;
      }
      iVar6 = iVar6 + (iVar1 >> 1);
    }
    if (iVar6 <= iVar3) {
      iVar6 = iVar3;
    }
    uVar4 = func_0x000b810c((long)iVar6 * 0x14);
    if (*(long *)(unaff_x20 + 0x28) != 0) {
      _memcpy(uVar4,*(long *)(unaff_x20 + 0x28),(long)*(int *)(unaff_x20 + 0x20) * 0x14);
      func_0x000b83d4(*(undefined8 *)(unaff_x20 + 0x28));
    }
    *(undefined8 *)(unaff_x20 + 0x28) = uVar4;
    *(int *)(unaff_x20 + 0x20) = iVar3;
    *(int *)(unaff_x20 + 0x24) = iVar6;
    lVar5 = *(long *)(unaff_x19 + 0x28);
  }
  else {
    uVar4 = 0;
    *(int *)(unaff_x20 + 0x20) = iVar3;
    lVar5 = *(long *)(unaff_x19 + 0x28);
  }
  if (lVar5 != 0) {
    _memcpy(uVar4,lVar5,(long)iVar3 * 0x14);
  }
  *(undefined4 *)(unaff_x20 + 0x30) = *(undefined4 *)(unaff_x19 + 0x30);
  return;
}

