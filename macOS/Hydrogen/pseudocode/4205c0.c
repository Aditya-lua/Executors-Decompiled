
void FUN_004205c0(ulong param_1)

{
  ulong uVar1;
  undefined1 auVar2 [16];
  code *pcVar3;
  int iVar4;
  uint *puVar5;
  undefined4 uVar6;
  ulong uVar7;
  uint uVar8;
  long in_x10;
  uint unaff_w19;
  uint *unaff_x20;
  ulong unaff_x21;
  uint unaff_w22;
  undefined8 uVar9;
  undefined8 *puVar10;
  ulong unaff_x23;
  undefined *unaff_x25;
  ulong unaff_x26;
  undefined4 unaff_w27;
  ulong unaff_x28;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined1 auVar12 [12];
  undefined8 in_stack_00000010;
  undefined *in_stack_00000018;
  undefined *in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined4 uStack0000000000000048;
  ulong in_stack_00000050;
  uint in_stack_00000058;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  undefined4 in_stack_00000078;
  
  do {
    if (param_1 < 2) {
      param_1 = 1;
    }
    if (unaff_x26 <= param_1) {
      param_1 = unaff_x26;
    }
    uVar6 = (undefined4)unaff_x26;
    if (in_x10 == 0) {
      uVar6 = (undefined4)param_1;
    }
    iVar4 = _poll(&uStack0000000000000068,1,uVar6);
    if (iVar4 == -1) {
      puVar5 = (uint *)___error();
      if (*puVar5 != 4) {
        unaff_x25 = (undefined *)((ulong)*puVar5 << 0x20 | 2);
        goto LAB_004203d0;
      }
    }
    else if (iVar4 != 0) {
      if ((uStack0000000000000068._6_2_ & 0x18) == 0) {
        unaff_x25 = (undefined *)0x0;
      }
      else {
        auVar11 = func_0x0043427c();
        auVar11._8_8_ = auVar11._8_8_;
        unaff_x25 = auVar11._8_8_;
        if (((auVar11._0_8_ & 1) == 0) &&
           (unaff_x25 = &UNK_009dbcc0, auVar11._8_8_ != (undefined *)0x0)) {
          unaff_x25 = auVar11._8_8_;
        }
      }
      goto LAB_004203d0;
    }
    auVar12 = func_0x00430548(8);
    *(undefined8 *)(unaff_x29 + -0x60) = in_stack_00000030;
    *(undefined4 *)(unaff_x29 + -0x58) = unaff_w27;
    _uStack0000000000000070 = auVar12;
    func_0x0043065c(&uStack0000000000000048,&uStack0000000000000070,unaff_x29 + -0x60);
    uVar8 = 0;
    if (uStack0000000000000048 == 0) {
      uVar8 = in_stack_00000058;
    }
    uVar1 = 0;
    if (uStack0000000000000048 == 0) {
      uVar1 = in_stack_00000050;
    }
    if (unaff_x23 == uVar1) {
      if (unaff_w22 <= uVar8) goto LAB_004203d0;
    }
    else if (unaff_x23 <= uVar1) {
LAB_004203d0:
      if ((unaff_x21 & 3) == 1) {
        uVar9 = *(undefined8 *)(unaff_x21 - 1);
        puVar10 = *(undefined8 **)(unaff_x21 + 7);
        if ((code *)*puVar10 != (code *)0x0) {
          (*(code *)*puVar10)(uVar9);
        }
        if (puVar10[1] != 0) {
          func_0x00187bd4(uVar9,puVar10[1],puVar10[2]);
        }
        func_0x00187bd4((undefined8 *)(unaff_x21 - 1),0x18,8);
      }
      if (unaff_x25 == (undefined *)0x0) {
        unaff_x20[1] = unaff_w19;
      }
      else {
        _close();
        *(undefined **)(unaff_x20 + 2) = unaff_x25;
      }
      *unaff_x20 = (uint)(unaff_x25 != (undefined *)0x0);
      return;
    }
    uVar7 = unaff_x23 - uVar1;
    if (unaff_x23 < uVar1) goto code_r0x00420650;
    if (unaff_w22 < uVar8) {
      if (uVar7 == 0) goto code_r0x00420650;
      uVar7 = uVar7 - 1;
      uVar8 = in_stack_00000028._4_4_ - uVar8;
    }
    else {
      uVar8 = unaff_w22 - uVar8;
    }
    if (999999999 < uVar8) {
      if (uVar7 == 0xffffffffffffffff) {
        in_stack_00000010 = 0x19;
        in_stack_00000018 = &UNK_008850f5;
        in_stack_00000020 = &UNK_009d9300;
code_r0x00420650:
        func_0x007a23d8(in_stack_00000018,in_stack_00000010,in_stack_00000020);
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x420660);
        (*pcVar3)();
      }
      uVar7 = uVar7 + 1;
      uVar8 = uVar8 + 0xc4653600;
    }
    auVar11._8_8_ = 0;
    auVar11._0_8_ = uVar7;
    auVar2._8_8_ = 0;
    auVar2._0_8_ = unaff_x28;
    in_x10 = SUB168(auVar11 * auVar2,8);
    param_1 = uVar7 * unaff_x28 + (ulong)uVar8 / 1000000;
    if (CARRY8(uVar7 * unaff_x28,(ulong)uVar8 / 1000000)) {
      param_1 = 0xffffffffffffffff;
    }
  } while( true );
}

