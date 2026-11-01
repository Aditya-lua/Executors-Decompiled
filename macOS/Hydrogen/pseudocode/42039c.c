
void FUN_0042039c(void)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  uint *puVar4;
  undefined4 uVar5;
  ulong uVar6;
  uint uVar7;
  uint unaff_w19;
  uint *unaff_x20;
  undefined *unaff_x21;
  uint unaff_w22;
  undefined8 uVar8;
  ulong unaff_x23;
  undefined8 *puVar9;
  undefined *puVar10;
  ulong unaff_x26;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined1 auVar12 [12];
  undefined1 auVar13 [12];
  undefined8 uStack0000000000000010;
  undefined *puStack0000000000000018;
  undefined *puStack0000000000000020;
  undefined4 uStack0000000000000048;
  ulong in_stack_00000050;
  uint in_stack_00000058;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  undefined4 in_stack_00000078;
  
  if ((unaff_x26 & 1) == 0) {
    puVar10 = (undefined *)0x0;
  }
  else if (((ulong)unaff_x21 & 0xffffffff00000003) == 0x2400000002) {
    uStack0000000000000068._4_4_ = 4;
    uStack0000000000000068._0_4_ = unaff_w19;
    if ((unaff_x23 == 0) && (unaff_w22 == 0)) {
      puVar10 = &UNK_009dbc90;
    }
    else {
      auVar12 = func_0x00430548(8);
      puVar10 = &UNK_009dbcd8;
      puStack0000000000000018 = &UNK_008875da;
      puStack0000000000000020 = &UNK_009dbca8;
      uStack0000000000000010 = 0x23;
LAB_004204e4:
      do {
        auVar13 = func_0x00430548(8);
        *(undefined1 (*) [12])(unaff_x29 + -0x60) = auVar12;
        _uStack0000000000000070 = auVar13;
        func_0x0043065c(&uStack0000000000000048,&uStack0000000000000070,unaff_x29 + -0x60);
        uVar7 = 0;
        if (uStack0000000000000048 == 0) {
          uVar7 = in_stack_00000058;
        }
        uVar1 = 0;
        if (uStack0000000000000048 == 0) {
          uVar1 = in_stack_00000050;
        }
        if (unaff_x23 == uVar1) {
          if (unaff_w22 <= uVar7) goto LAB_004203d0;
        }
        else if (unaff_x23 <= uVar1) goto LAB_004203d0;
        uVar6 = unaff_x23 - uVar1;
        if (unaff_x23 < uVar1) {
code_r0x00420650:
          func_0x007a23d8(puStack0000000000000018,uStack0000000000000010,puStack0000000000000020);
                    /* WARNING: Does not return */
          pcVar2 = (code *)SoftwareBreakpoint(1,0x420660);
          (*pcVar2)();
        }
        if (unaff_w22 < uVar7) {
          if (uVar6 == 0) goto code_r0x00420650;
          uVar6 = uVar6 - 1;
          uVar7 = (unaff_w22 + 1000000000) - uVar7;
        }
        else {
          uVar7 = unaff_w22 - uVar7;
        }
        if (999999999 < uVar7) {
          if (uVar6 == 0xffffffffffffffff) {
            uStack0000000000000010 = 0x19;
            puStack0000000000000018 = &UNK_008850f5;
            puStack0000000000000020 = &UNK_009d9300;
            goto code_r0x00420650;
          }
          uVar6 = uVar6 + 1;
          uVar7 = uVar7 + 0xc4653600;
        }
        auVar11._8_8_ = 0;
        auVar11._0_8_ = uVar6;
        uVar1 = uVar6 * 1000 + (ulong)uVar7 / 1000000;
        if (CARRY8(uVar6 * 1000,(ulong)uVar7 / 1000000)) {
          uVar1 = 0xffffffffffffffff;
        }
        if (uVar1 < 2) {
          uVar1 = 1;
        }
        if (0x7ffffffe < uVar1) {
          uVar1 = 0x7fffffff;
        }
        uVar5 = 0x7fffffff;
        if (SUB168(auVar11 * ZEXT816(1000),8) == 0) {
          uVar5 = (undefined4)uVar1;
        }
        iVar3 = _poll(&uStack0000000000000068,1,uVar5);
        if (iVar3 == -1) {
          puVar4 = (uint *)___error();
          if (*puVar4 != 4) {
            puVar10 = (undefined *)((ulong)*puVar4 << 0x20 | 2);
            goto LAB_004203d0;
          }
          goto LAB_004204e4;
        }
      } while (iVar3 == 0);
      if ((uStack0000000000000068._4_4_ & 0x180000) == 0) {
        puVar10 = (undefined *)0x0;
      }
      else {
        auVar11 = func_0x0043427c();
        auVar11._8_8_ = auVar11._8_8_;
        puVar10 = auVar11._8_8_;
        if (((auVar11._0_8_ & 1) == 0) &&
           (puVar10 = &UNK_009dbcc0, auVar11._8_8_ != (undefined *)0x0)) {
          puVar10 = auVar11._8_8_;
        }
      }
    }
LAB_004203d0:
    if (((ulong)unaff_x21 & 3) == 1) {
      uVar8 = *(undefined8 *)(unaff_x21 + -1);
      puVar9 = *(undefined8 **)(unaff_x21 + 7);
      if ((code *)*puVar9 != (code *)0x0) {
        (*(code *)*puVar9)(uVar8);
      }
      if (puVar9[1] != 0) {
        func_0x00187bd4(uVar8,puVar9[1],puVar9[2]);
      }
      func_0x00187bd4(unaff_x21 + -1,0x18,8);
    }
  }
  else {
    puVar10 = unaff_x21;
  }
  if (puVar10 == (undefined *)0x0) {
    unaff_x20[1] = unaff_w19;
  }
  else {
    _close();
    *(undefined **)(unaff_x20 + 2) = puVar10;
  }
  *unaff_x20 = (uint)(puVar10 != (undefined *)0x0);
  return;
}

