
void FUN_002b56dc(undefined1 param_1 [16],undefined8 param_2,undefined8 param_3,ulong param_4,
                 long param_5)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  ushort uVar4;
  ushort uVar5;
  ushort uVar6;
  ushort uVar7;
  ushort uVar8;
  ushort uVar9;
  ushort uVar10;
  ushort uVar11;
  ushort uVar12;
  ushort uVar13;
  ushort uVar14;
  ushort uVar15;
  ushort uVar16;
  ushort uVar17;
  char cVar18;
  long *plVar19;
  undefined8 uVar20;
  long unaff_x24;
  long unaff_x29;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000060;
  undefined8 uStack0000000000000070;
  undefined8 uStack0000000000000080;
  undefined4 uStack00000000000000a0;
  undefined1 uStack00000000000000a8;
  undefined1 uStack00000000000000b8;
  undefined1 uStack00000000000000c8;
  char cStack_38;
  undefined1 uStack_37;
  undefined1 uStack_36;
  undefined1 uStack_35;
  undefined1 uStack_34;
  undefined1 uStack_33;
  undefined1 uStack_32;
  byte bStack_31;
  undefined1 uStack_30;
  undefined1 uStack_2f;
  undefined1 uStack_2e;
  undefined1 uStack_2d;
  undefined1 uStack_2c;
  undefined1 uStack_2b;
  undefined1 uStack_2a;
  byte bStack_29;
  long lStack_28;
  undefined1 *puStack_20;
  
  _uStack0000000000000010 = param_1._0_8_;
  *(long *)(unaff_x24 + 0x88) = param_1._8_8_;
  *(undefined8 *)(unaff_x24 + 0x80) = _uStack0000000000000010;
  uStack00000000000000a0 = 1;
  uStack0000000000000020 = _uStack0000000000000010;
  uStack0000000000000030 = _uStack0000000000000010;
  uStack0000000000000040 = _uStack0000000000000010;
  uStack0000000000000050 = _uStack0000000000000010;
  uStack0000000000000060 = _uStack0000000000000010;
  uStack0000000000000070 = _uStack0000000000000010;
  uStack0000000000000080 = _uStack0000000000000010;
  func_0x0036e464(&uStack00000000000000a8,0x10);
  func_0x0036e464(&uStack00000000000000b8,0x10);
  func_0x0036e464(&uStack00000000000000c8,0x10);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return;
  }
  plVar19 = (long *)___stack_chk_fail();
  lStack_28 = *(long *)PTR____stack_chk_guard_009b01e8;
  puStack_20 = &uStack0000000000000010;
  if (((param_5 == 0) || (iVar2 = *(int *)(param_5 + 4), iVar2 != 0x10 && iVar2 != 8)) ||
     (*(uint *)(param_5 + 8) != param_4)) {
    uVar20 = 0;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
      return;
    }
  }
  else {
    uVar20 = func_0x002b2bd8(plVar19,param_5);
    if ((int)uVar20 == 0) goto LAB_002b5a5c;
    if (plVar19 == (long *)0x0) goto LAB_002b5a20;
    if (*plVar19 == 0) {
      uVar20 = 0x22d;
      goto LAB_002b5a54;
    }
    uVar20 = (**(code **)(*plVar19 + 0x28))(plVar19,&cStack_38,&UNK_008310f0,iVar2);
    if ((int)uVar20 == 0) goto LAB_002b5a5c;
    uVar20 = func_0x002b2bd8(plVar19,0);
    if ((int)uVar20 == 0) goto LAB_002b5a5c;
    cVar18 = (char)((ulong)(long)(int5)((uint5)CONCAT11(cStack_38,uStack_37) << 0x18) >> 0x1f);
    *(char *)(plVar19 + 0x13) = cVar18;
    uVar4 = CONCAT11(uStack_37,uStack_36) >> 7;
    uVar5 = CONCAT11(uStack_36,uStack_35) >> 7;
    *(char *)((long)plVar19 + 0x99) = (char)uVar4;
    *(char *)((long)plVar19 + 0x9a) = (char)uVar5;
    uVar6 = CONCAT11(uStack_35,uStack_34) >> 7;
    *(char *)((long)plVar19 + 0x9b) = (char)uVar6;
    uVar7 = CONCAT11(uStack_34,uStack_33) >> 7;
    *(char *)((long)plVar19 + 0x9c) = (char)uVar7;
    uVar8 = CONCAT11(uStack_33,uStack_32) >> 7;
    *(char *)((long)plVar19 + 0x9d) = (char)uVar8;
    uVar9 = CONCAT11(uStack_32,bStack_31) >> 7;
    *(char *)((long)plVar19 + 0x9e) = (char)uVar9;
    uVar3 = (uint)cVar18;
    if (iVar2 == 0x10) {
      uVar10 = CONCAT11(bStack_31,uStack_30) >> 7;
      *(char *)((long)plVar19 + 0x9f) = (char)uVar10;
      uVar11 = CONCAT11(uStack_30,uStack_2f) >> 7;
      *(char *)(plVar19 + 0x14) = (char)uVar11;
      uVar12 = CONCAT11(uStack_2f,uStack_2e) >> 7;
      uVar13 = CONCAT11(uStack_2e,uStack_2d) >> 7;
      *(char *)((long)plVar19 + 0xa1) = (char)uVar12;
      *(char *)((long)plVar19 + 0xa2) = (char)uVar13;
      uVar14 = CONCAT11(uStack_2d,uStack_2c) >> 7;
      *(char *)((long)plVar19 + 0xa3) = (char)uVar14;
      uVar15 = CONCAT11(uStack_2c,uStack_2b) >> 7;
      *(char *)((long)plVar19 + 0xa4) = (char)uVar15;
      uVar16 = CONCAT11(uStack_2b,uStack_2a) >> 7;
      *(char *)((long)plVar19 + 0xa5) = (char)uVar16;
      uVar17 = CONCAT11(uStack_2a,bStack_29) >> 7;
      *(char *)((long)plVar19 + 0xa6) = (char)uVar17;
      uVar1 = (int)cStack_38 >> 7 & 0xffffff87U ^ (uint)bStack_29 << 1;
      *(char *)((long)plVar19 + 0xa7) = (char)uVar1;
      *(char *)(plVar19 + 0x15) = (char)(CONCAT44(uVar3,(uint)uVar4 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xa9) = (char)(CONCAT24(uVar4,(uint)uVar5 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xaa) = (char)(CONCAT24(uVar5,(uint)uVar6 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xab) = (char)(CONCAT24(uVar6,(uint)uVar7 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xac) = (char)(CONCAT24(uVar7,(uint)uVar8 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xad) = (char)(CONCAT24(uVar8,(uint)uVar9 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xae) = (char)(CONCAT24(uVar9,(uint)uVar10 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xaf) = (char)(CONCAT24(uVar10,(uint)uVar11 << 0x18) >> 0x1f);
      *(char *)(plVar19 + 0x16) = (char)(CONCAT24(uVar11,(uint)uVar12 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xb1) = (char)(CONCAT24(uVar12,(uint)uVar13 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xb2) = (char)(CONCAT24(uVar13,(uint)uVar14 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xb3) = (char)(CONCAT24(uVar14,(uint)uVar15 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xb4) = (char)(CONCAT24(uVar15,(uint)uVar16 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xb5) = (char)(CONCAT24(uVar16,(uint)uVar17 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xb6) = (char)(CONCAT24(uVar17,uVar1 << 0x18) >> 0x1f);
      *(byte *)((long)plVar19 + 0xb7) = (byte)(uVar3 >> 7) & 0x87 ^ (byte)(uVar1 << 1);
    }
    else {
      uVar1 = (uint)(int)cStack_38 >> 7 & 0x1b ^ (uint)bStack_31 << 1;
      *(char *)((long)plVar19 + 0x9f) = (char)uVar1;
      *(char *)(plVar19 + 0x15) = (char)(CONCAT44(uVar3,(uint)uVar4 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xa9) = (char)(CONCAT24(uVar4,(uint)uVar5 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xaa) = (char)(CONCAT24(uVar5,(uint)uVar6 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xab) = (char)(CONCAT24(uVar6,(uint)uVar7 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xac) = (char)(CONCAT24(uVar7,(uint)uVar8 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xad) = (char)(CONCAT24(uVar8,(uint)uVar9 << 0x18) >> 0x1f);
      *(char *)((long)plVar19 + 0xae) = (char)(CONCAT24(uVar9,(uint)bStack_31 << 0x19) >> 0x1f);
      *(byte *)((long)plVar19 + 0xaf) = (byte)(uVar3 >> 7) & 0x1b ^ (byte)(uVar1 << 1);
    }
    *(undefined4 *)(plVar19 + 0x19) = 0;
    uVar20 = 1;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
      return;
    }
  }
  do {
    ___stack_chk_fail(uVar20);
LAB_002b5a20:
    uVar20 = 0x22c;
LAB_002b5a54:
    func_0x0028f83c(0xe,0,0x43,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",uVar20);
    uVar20 = 0;
LAB_002b5a5c:
  } while (*(long *)PTR____stack_chk_guard_009b01e8 != lStack_28);
  return;
}

