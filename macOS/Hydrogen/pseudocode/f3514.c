
void FUN_000f3514(void)

{
  undefined4 *puVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  long lVar7;
  int iVar8;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined4 unaff_w23;
  
  _memcpy();
  func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
  *(long *)(unaff_x19 + 0x80) = unaff_x22;
  *(undefined4 *)(unaff_x19 + 0x7c) = unaff_w23;
  *(undefined8 *)(unaff_x22 + (long)*(int *)(unaff_x19 + 0x78) * 8) = *unaff_x21;
  iVar4 = *(int *)(unaff_x19 + 0x78);
  iVar8 = iVar4 + 1;
  *(int *)(unaff_x19 + 0x78) = iVar8;
  uVar5 = *(undefined4 *)unaff_x20;
  uVar6 = *(undefined4 *)((long)unaff_x21 + 4);
  if (iVar8 == *(int *)(unaff_x19 + 0x7c)) {
    iVar2 = iVar8;
    if (iVar8 < 0) {
      iVar2 = iVar4 + 2;
    }
    uVar3 = 8;
    if (iVar8 != 0) {
      uVar3 = iVar8 + (iVar2 >> 1);
    }
    if ((int)uVar3 <= (int)(iVar4 + 2U)) {
      uVar3 = iVar4 + 2U;
    }
    lVar7 = func_0x000b810c(-(ulong)(uVar3 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar3 << 3);
    if (*(long *)(unaff_x19 + 0x80) != 0) {
      _memcpy(lVar7,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
      func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
    }
    *(long *)(unaff_x19 + 0x80) = lVar7;
    *(uint *)(unaff_x19 + 0x7c) = uVar3;
    iVar8 = *(int *)(unaff_x19 + 0x78);
  }
  else {
    lVar7 = *(long *)(unaff_x19 + 0x80);
  }
  puVar1 = (undefined4 *)(lVar7 + (long)iVar8 * 8);
  *puVar1 = uVar5;
  puVar1[1] = uVar6;
  iVar4 = *(int *)(unaff_x19 + 0x78);
  iVar8 = iVar4 + 1;
  *(int *)(unaff_x19 + 0x78) = iVar8;
  if (iVar8 == *(int *)(unaff_x19 + 0x7c)) {
    iVar2 = iVar8;
    if (iVar8 < 0) {
      iVar2 = iVar4 + 2;
    }
    uVar3 = 8;
    if (iVar8 != 0) {
      uVar3 = iVar8 + (iVar2 >> 1);
    }
    if ((int)uVar3 <= (int)(iVar4 + 2U)) {
      uVar3 = iVar4 + 2U;
    }
    lVar7 = func_0x000b810c(-(ulong)(uVar3 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar3 << 3);
    if (*(long *)(unaff_x19 + 0x80) != 0) {
      _memcpy(lVar7,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
      func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
    }
    *(long *)(unaff_x19 + 0x80) = lVar7;
    *(uint *)(unaff_x19 + 0x7c) = uVar3;
    iVar8 = *(int *)(unaff_x19 + 0x78);
  }
  else {
    lVar7 = *(long *)(unaff_x19 + 0x80);
  }
  *(undefined8 *)(lVar7 + (long)iVar8 * 8) = *unaff_x20;
  iVar4 = *(int *)(unaff_x19 + 0x78);
  iVar8 = iVar4 + 1;
  *(int *)(unaff_x19 + 0x78) = iVar8;
  uVar5 = *(undefined4 *)unaff_x21;
  uVar6 = *(undefined4 *)((long)unaff_x20 + 4);
  if (iVar8 == *(int *)(unaff_x19 + 0x7c)) {
    iVar2 = iVar8;
    if (iVar8 < 0) {
      iVar2 = iVar4 + 2;
    }
    uVar3 = 8;
    if (iVar8 != 0) {
      uVar3 = iVar8 + (iVar2 >> 1);
    }
    if ((int)uVar3 <= (int)(iVar4 + 2U)) {
      uVar3 = iVar4 + 2U;
    }
    lVar7 = func_0x000b810c(-(ulong)(uVar3 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar3 << 3);
    if (*(long *)(unaff_x19 + 0x80) != 0) {
      _memcpy(lVar7,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
      func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
    }
    *(long *)(unaff_x19 + 0x80) = lVar7;
    *(uint *)(unaff_x19 + 0x7c) = uVar3;
    iVar8 = *(int *)(unaff_x19 + 0x78);
  }
  else {
    lVar7 = *(long *)(unaff_x19 + 0x80);
  }
  puVar1 = (undefined4 *)(lVar7 + (long)iVar8 * 8);
  *puVar1 = uVar5;
  puVar1[1] = uVar6;
  *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  return;
}

