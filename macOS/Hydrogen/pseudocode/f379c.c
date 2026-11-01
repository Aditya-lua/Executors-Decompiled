
void FUN_000f379c(void)

{
  int iVar1;
  uint uVar2;
  long lVar3;
  int iVar4;
  long unaff_x19;
  undefined8 *unaff_x20;
  float *unaff_x21;
  undefined8 uVar5;
  float unaff_s8;
  undefined4 unaff_s9;
  float in_stack_00000000;
  undefined8 uStack0000000000000018;
  
  func_0x000f1da4(unaff_s9);
  uVar5 = *unaff_x20;
  if (0.5 <= in_stack_00000000) {
    func_0x000f1da4();
  }
  else {
    iVar4 = *(int *)(unaff_x19 + 0x78);
    if (iVar4 == *(int *)(unaff_x19 + 0x7c)) {
      iVar1 = iVar4;
      if (iVar4 < 0) {
        iVar1 = iVar4 + 1;
      }
      uVar2 = 8;
      if (iVar4 != 0) {
        uVar2 = iVar4 + (iVar1 >> 1);
      }
      if ((int)uVar2 <= (int)(iVar4 + 1U)) {
        uVar2 = iVar4 + 1U;
      }
      lVar3 = func_0x000b810c(-(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3);
      if (*(long *)(unaff_x19 + 0x80) != 0) {
        _memcpy(lVar3,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
      }
      *(long *)(unaff_x19 + 0x80) = lVar3;
      *(uint *)(unaff_x19 + 0x7c) = uVar2;
      iVar4 = *(int *)(unaff_x19 + 0x78);
    }
    else {
      lVar3 = *(long *)(unaff_x19 + 0x80);
    }
    *(ulong *)(lVar3 + (long)iVar4 * 8) =
         CONCAT44((float)((ulong)uVar5 >> 0x20) - in_stack_00000000,(float)uVar5 - in_stack_00000000
                 );
    *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  }
  uStack0000000000000018 =
       CONCAT44(*(float *)((long)unaff_x20 + 4) - unaff_s8,unaff_s8 + *unaff_x21);
  if (0.5 <= unaff_s8) {
    func_0x000f1da4(unaff_s8);
  }
  else {
    iVar4 = *(int *)(unaff_x19 + 0x78);
    if (iVar4 == *(int *)(unaff_x19 + 0x7c)) {
      iVar1 = iVar4;
      if (iVar4 < 0) {
        iVar1 = iVar4 + 1;
      }
      uVar2 = 8;
      if (iVar4 != 0) {
        uVar2 = iVar4 + (iVar1 >> 1);
      }
      if ((int)uVar2 <= (int)(iVar4 + 1U)) {
        uVar2 = iVar4 + 1U;
      }
      lVar3 = func_0x000b810c(-(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3);
      if (*(long *)(unaff_x19 + 0x80) != 0) {
        _memcpy(lVar3,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
        func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
      }
      *(long *)(unaff_x19 + 0x80) = lVar3;
      *(uint *)(unaff_x19 + 0x7c) = uVar2;
      iVar4 = *(int *)(unaff_x19 + 0x78);
    }
    else {
      lVar3 = *(long *)(unaff_x19 + 0x80);
    }
    *(undefined8 *)(lVar3 + (long)iVar4 * 8) = uStack0000000000000018;
    *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  }
  return;
}

