
undefined8 FUN_006ff438(void)

{
  byte *pbVar1;
  uint uVar2;
  uint uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined1 in_w8;
  int iVar6;
  long in_x9;
  int iVar7;
  byte *pbVar8;
  ulong uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  undefined8 uVar13;
  long unaff_x29;
  ulong uStack_38;
  
  *(undefined1 *)(unaff_x29 + -0x60 + in_x9) = in_w8;
  func_0x006e38d8();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return 1;
  }
  ___stack_chk_fail();
  uVar4 = func_0x006e63b0();
  lVar5 = func_0x006e67c8(uVar4,1,&uStack_38);
  uVar2 = func_0x006e6c08(uVar4,2,1);
  uVar3 = 0;
  if ((ulong)-(long)(int)uVar2 <= uStack_38) {
    uVar3 = uVar2 + (int)uStack_38 + 1;
  }
  if ((uVar2 & 0x80000000) != 0) {
    uVar2 = uVar3;
  }
  uVar3 = func_0x006e6c08(uVar4,3,0xffffffff);
  iVar6 = (int)uStack_38;
  uVar11 = 0;
  if ((ulong)-(long)(int)uVar3 <= uStack_38) {
    uVar11 = uVar3 + iVar6 + 1;
  }
  if ((uVar3 & 0x80000000) != 0) {
    uVar3 = uVar11;
  }
  iVar7 = uVar2 - 1;
  if (((int)uVar2 < 1) || (iVar6 < iVar7)) {
    func_0x006e63b0(uVar4,2,"initial position out of string");
  }
  else if ((int)uVar3 <= iVar6) {
    if ((int)uVar3 < (int)uVar2) {
      iVar6 = 0;
    }
    else {
      iVar6 = 0;
      do {
        pbVar8 = (byte *)(lVar5 + iVar7);
        if ((char)*pbVar8 < '\0') {
          uVar2 = 0;
          uVar9 = 0;
          uVar11 = 0;
          uVar10 = (uint)*pbVar8;
          while ((uVar10 >> 6 & 1) != 0) {
            pbVar1 = (byte *)(lVar5 + 1 + (long)iVar7 + uVar9);
            uVar9 = uVar9 + 1;
            uVar12 = (uint)*pbVar1;
            uVar11 = uVar12 & 0x3f | uVar11 << 6;
            uVar10 = uVar10 << 1;
            uVar2 = uVar2 + 5;
            if ((uVar12 & 0xc0) != 0x80) goto LAB_006ff634;
          }
          if (((3 < (uint)uVar9) ||
              (uVar11 = (uVar10 & 0x7f) << (ulong)(uVar2 & 0x1f) | uVar11, 0x10 < uVar11 >> 0x10))
             || (uVar11 >> 0xb == 0x1b ||
                 uVar11 <= *(uint *)(&UNK_008c8470 + (uVar9 & 0xffffffff) * 4))) {
LAB_006ff634:
            func_0x006e383c(uVar4,iVar6);
            iVar6 = iVar7 + 1;
            uVar13 = 2;
            goto LAB_006ff644;
          }
          pbVar8 = pbVar8 + (uVar9 & 0xffffffff);
        }
        iVar7 = ((int)pbVar8 - (int)lVar5) + 1;
        iVar6 = iVar6 + 1;
      } while (iVar7 < (int)uVar3);
    }
    uVar13 = 1;
LAB_006ff644:
    func_0x006e3870(uVar4,iVar6);
    return uVar13;
  }
  uVar4 = func_0x006e63b0(uVar4,3,"final position out of string");
  func_0x006e67c8(uVar4,1,0);
  func_0x006e3af8(uVar4,&DAT_006ff6ec,0,0,0);
  func_0x006e2154(uVar4,1);
  func_0x006e3870(uVar4,0);
  return 3;
}

