
void FUN_000f3a24(void)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  long lVar4;
  int in_w8;
  int iVar5;
  long unaff_x19;
  undefined8 *unaff_x21;
  undefined8 uVar6;
  undefined4 unaff_s8;
  undefined8 unaff_d9;
  
  *(undefined8 *)(*(long *)(unaff_x19 + 0x80) + (long)in_w8 * 8) = unaff_d9;
  iVar3 = *(int *)(unaff_x19 + 0x78);
  iVar5 = iVar3 + 1;
  *(int *)(unaff_x19 + 0x78) = iVar5;
  uVar6 = *unaff_x21;
  if (iVar5 == *(int *)(unaff_x19 + 0x7c)) {
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
    if (*(long *)(unaff_x19 + 0x80) != 0) {
      _memcpy(lVar4,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
      func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
    }
    *(long *)(unaff_x19 + 0x80) = lVar4;
    *(uint *)(unaff_x19 + 0x7c) = uVar2;
    iVar5 = *(int *)(unaff_x19 + 0x78);
  }
  else {
    lVar4 = *(long *)(unaff_x19 + 0x80);
  }
  *(ulong *)(lVar4 + (long)iVar5 * 8) =
       CONCAT44((float)((ulong)uVar6 >> 0x20) + 0.5,(float)uVar6 + 0.5);
  *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  func_0x000f0ff4(unaff_s8);
  *(undefined4 *)(unaff_x19 + 0x78) = 0;
  return;
}

