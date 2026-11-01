
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005a4ddc(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  undefined8 uVar10;
  ulong uVar11;
  ulong *extraout_x8;
  ulong *extraout_x8_00;
  ulong uVar12;
  long *plVar13;
  long *plVar14;
  ulong uVar15;
  long *unaff_x20;
  long *plVar16;
  ulong uVar17;
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  ulong uStack_e0;
  long lStack_d8;
  long lStack_d0;
  long lStack_c8;
  long lStack_c0;
  ulong *puStack_b8;
  undefined8 uStack_b0;
  ulong uStack_a8;
  
  func_0x0059cc30();
  if (in_stack_00000008 != 0) {
    param_3 = 1;
    func_0x00187bd4(in_stack_00000010);
  }
  uVar10 = __Unwind_Resume();
  func_0x0059cc30();
  auVar18 = __Unwind_Resume(uVar10);
  auVar18._8_8_ = auVar18._8_8_;
  plVar16 = auVar18._0_8_;
  uVar17 = (long)auVar18._8_8_ - (long)plVar16;
  if (uVar17 < 0x7ffffffffffffff9) {
    if ((long)auVar18._8_8_ - (long)plVar16 == 0) {
      uVar17 = 0;
      uVar12 = 0;
      uVar11 = 8;
LAB_005a4f1c:
      *extraout_x8 = uVar17;
      extraout_x8[1] = uVar11;
      extraout_x8[2] = uVar12;
      return;
    }
    uVar10 = 8;
    uVar11 = func_0x00187bd0(uVar17,8);
    lVar9 = _UNK_008ae5b8;
    lVar8 = _UNK_008ae5b0;
    lVar7 = _UNK_008ae5a8;
    lVar6 = _UNK_008ae5a0;
    lVar5 = _UNK_008ae598;
    lVar4 = _UNK_008ae590;
    lVar3 = _UNK_008848d8;
    lVar2 = _UNK_008848d0;
    unaff_x20 = auVar18._8_8_;
    if (uVar11 != 0) {
      uVar17 = uVar17 >> 3;
      uVar12 = ((long)auVar18._8_8_ - (long)plVar16) - 8;
      if (uVar12 < 0x38) {
        uVar12 = 0;
        plVar13 = plVar16;
      }
      else {
        uVar1 = (uVar12 >> 3) + 1;
        uVar12 = uVar1 & 0x3ffffffffffffff8;
        plVar13 = plVar16 + uVar12;
        plVar14 = (long *)(uVar11 + 0x20);
        uVar15 = uVar12;
        do {
          plVar14[-3] = (long)plVar16 + lVar3;
          plVar14[-4] = (long)plVar16 + lVar2;
          plVar14[-1] = (long)plVar16 + lVar5;
          plVar14[-2] = (long)plVar16 + lVar4;
          plVar14[1] = (long)plVar16 + lVar7;
          *plVar14 = (long)plVar16 + lVar6;
          plVar14[3] = (long)plVar16 + lVar9;
          plVar14[2] = (long)plVar16 + lVar8;
          plVar16 = plVar16 + 8;
          uVar15 = uVar15 - 8;
          plVar14 = plVar14 + 8;
        } while (uVar15 != 0);
        if (uVar1 == uVar12) goto LAB_005a4f1c;
      }
      do {
        *(long **)(uVar11 + uVar12 * 8) = plVar13;
        plVar13 = plVar13 + 1;
        uVar12 = uVar12 + 1;
      } while (plVar13 != auVar18._8_8_);
      goto LAB_005a4f1c;
    }
  }
  else {
    uVar10 = 0;
  }
  auVar19 = func_0x007a1f00(uVar10,uVar17,param_3);
  plVar16 = auVar19._0_8_;
  uVar10 = 0;
  lVar2 = *plVar16;
  lVar3 = plVar16[1];
  uVar17 = lVar3 - lVar2;
  uVar12 = uVar17 >> 2;
  uVar17 = (uVar12 + (uVar17 >> 1)) * 8;
  auVar18._8_8_ = 0;
  auVar18._0_8_ = uVar12;
  if ((SUB168(auVar18 * ZEXT816(0x18),8) == 0) && (uVar17 < 0x7ffffffffffffff9)) {
    if (uVar17 != 0) {
      uVar10 = 8;
      uVar11 = func_0x00187bd0(uVar17,8);
      unaff_x20 = plVar16;
      if (uVar11 != 0) goto LAB_005a4fec;
      goto LAB_005a4fd4;
    }
  }
  else {
LAB_005a4fd4:
    plVar16 = unaff_x20;
    func_0x007a1f00(uVar10,uVar17,auVar19._8_8_);
  }
  uVar12 = 0;
  uVar11 = 8;
LAB_005a4fec:
  puStack_b8 = &uStack_e0;
  uStack_e0 = 0;
  lStack_c0 = plVar16[3];
  lStack_c8 = plVar16[2];
  uStack_b0 = 0;
  lStack_d8 = lVar2;
  lStack_d0 = lVar3;
  uStack_a8 = uVar11;
  func_0x005d163c(&lStack_d8,&puStack_b8);
  extraout_x8_00[1] = uVar11;
  *extraout_x8_00 = uVar12;
  extraout_x8_00[2] = uStack_e0;
  return;
}

