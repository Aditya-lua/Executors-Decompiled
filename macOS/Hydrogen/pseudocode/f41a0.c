
void FUN_000f41a0(void)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  long lVar4;
  int iVar5;
  long unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  ulong unaff_x25;
  
  lVar4 = func_0x000b810c(-(unaff_x25 >> 0x1f & 1) & 0xfffffff800000000 |
                          (unaff_x25 & 0xffffffff) << 3);
  if (*(long *)(unaff_x20 + 0x80) != 0) {
    _memcpy(lVar4,*(long *)(unaff_x20 + 0x80),(long)*(int *)(unaff_x20 + 0x78) << 3);
    func_0x000b83d4(*(undefined8 *)(unaff_x20 + 0x80));
  }
  *(long *)(unaff_x20 + 0x80) = lVar4;
  *(int *)(unaff_x20 + 0x7c) = (int)unaff_x25;
  *(undefined8 *)(lVar4 + (long)*(int *)(unaff_x20 + 0x78) * 8) = *unaff_x23;
  iVar3 = *(int *)(unaff_x20 + 0x78);
  iVar5 = iVar3 + 1;
  *(int *)(unaff_x20 + 0x78) = iVar5;
  if (iVar5 == *(int *)(unaff_x20 + 0x7c)) {
    iVar1 = iVar5;
    if (iVar5 < 0) {
      iVar1 = iVar3 + 2;
    }
    uVar2 = 8;
    if (iVar5 != 0) {
      uVar2 = iVar5 + (iVar1 >> 1);
    }
    if ((int)uVar2 <= (int)(iVar3 + 2U)) {
      uVar2 = iVar3 + 2U;
    }
    lVar4 = func_0x000b810c(-(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3);
    if (*(long *)(unaff_x20 + 0x80) != 0) {
      _memcpy(lVar4,*(long *)(unaff_x20 + 0x80),(long)*(int *)(unaff_x20 + 0x78) << 3);
      func_0x000b83d4(*(undefined8 *)(unaff_x20 + 0x80));
    }
    *(long *)(unaff_x20 + 0x80) = lVar4;
    *(uint *)(unaff_x20 + 0x7c) = uVar2;
    iVar5 = *(int *)(unaff_x20 + 0x78);
  }
  else {
    lVar4 = *(long *)(unaff_x20 + 0x80);
  }
  *(undefined8 *)(lVar4 + (long)iVar5 * 8) = *unaff_x22;
  iVar3 = *(int *)(unaff_x20 + 0x78);
  iVar5 = iVar3 + 1;
  *(int *)(unaff_x20 + 0x78) = iVar5;
  if (iVar5 == *(int *)(unaff_x20 + 0x7c)) {
    iVar1 = iVar5;
    if (iVar5 < 0) {
      iVar1 = iVar3 + 2;
    }
    uVar2 = 8;
    if (iVar5 != 0) {
      uVar2 = iVar5 + (iVar1 >> 1);
    }
    if ((int)uVar2 <= (int)(iVar3 + 2U)) {
      uVar2 = iVar3 + 2U;
    }
    lVar4 = func_0x000b810c(-(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3);
    if (*(long *)(unaff_x20 + 0x80) != 0) {
      _memcpy(lVar4,*(long *)(unaff_x20 + 0x80),(long)*(int *)(unaff_x20 + 0x78) << 3);
      func_0x000b83d4(*(undefined8 *)(unaff_x20 + 0x80));
    }
    *(long *)(unaff_x20 + 0x80) = lVar4;
    *(uint *)(unaff_x20 + 0x7c) = uVar2;
    iVar5 = *(int *)(unaff_x20 + 0x78);
  }
  else {
    lVar4 = *(long *)(unaff_x20 + 0x80);
  }
  *(undefined8 *)(lVar4 + (long)iVar5 * 8) = *unaff_x21;
  *(int *)(unaff_x20 + 0x78) = *(int *)(unaff_x20 + 0x78) + 1;
  func_0x000f1888();
  *(undefined4 *)(unaff_x20 + 0x78) = 0;
  return;
}

