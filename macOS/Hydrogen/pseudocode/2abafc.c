
void FUN_002abafc(undefined8 param_1,undefined8 param_2,ulong param_3,ulong *param_4,ulong param_5)

{
  ulong *puVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  ulong uVar11;
  long lVar12;
  long lVar13;
  undefined8 uVar14;
  ulong uVar15;
  long *plVar16;
  ulong *puVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  long unaff_x19;
  long *unaff_x20;
  ulong *unaff_x21;
  long *unaff_x22;
  undefined8 *unaff_x23;
  long lVar22;
  undefined1 auVar23 [16];
  
  lVar13 = func_0x0036e358(param_1,8);
  uVar14 = 0;
  if (lVar13 != 0) {
    if ((int)unaff_x22[1] != 0) {
      _memcpy(lVar13,*unaff_x22,(long)(int)unaff_x22[1] << 3);
    }
    func_0x0036e3d8(*unaff_x22);
    *unaff_x22 = lVar13;
    *(undefined4 *)((long)unaff_x22 + 0xc) = 0x10;
    *(undefined4 *)(unaff_x22 + 1) = 0x10;
    param_3 = *unaff_x21;
    func_0x002a8a84(lVar13,*unaff_x23);
    if (unaff_x22 != unaff_x20) {
      uVar14 = func_0x0029afb8();
      if ((int)uVar14 == 0) goto LAB_002abdfc;
      if ((int)unaff_x22[1] == 0) {
        *(undefined4 *)(unaff_x20 + 1) = 0;
      }
      else {
        param_3 = (long)(int)unaff_x22[1] << 3;
        _memcpy(*unaff_x20,*unaff_x22);
        *(int *)(unaff_x20 + 1) = (int)unaff_x22[1];
      }
      *(int *)(unaff_x20 + 2) = (int)unaff_x22[2];
    }
    uVar14 = 1;
  }
LAB_002abdfc:
  if (*(char *)(unaff_x19 + 0x28) != '\0') {
    return;
  }
  if (*(long *)(unaff_x19 + 0x10) != 0) {
    lVar13 = *(long *)(unaff_x19 + 0x10) + -1;
    *(long *)(unaff_x19 + 0x10) = lVar13;
    *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar13 * 8);
    return;
  }
  func_0x0079db4c(uVar14);
  func_0x0079e120();
  auVar23 = func_0x0079e0f8();
  auVar23._0_8_ = auVar23._0_8_;
  puVar1 = auVar23._8_8_;
  uVar11 = param_5;
  if (param_3 < param_5) {
    puVar1 = param_4;
    uVar11 = param_3;
    param_4 = auVar23._8_8_;
    param_3 = param_5;
  }
  if (uVar11 == 0) {
    if ((param_3 & 0x1fffffffffffffff) == 0) {
      return;
    }
                    /* WARNING: Could not recover jumptable at 0x007b31b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__bzero_00a24c68)(auVar23._0_8_);
    return;
  }
  if (param_3 == 0) {
    uVar21 = 0;
  }
  else {
    uVar15 = *param_4;
    plVar16 = auVar23._0_8_;
    puVar17 = puVar1;
    uVar18 = param_3;
    if (param_3 < 4) {
      uVar20 = 0;
    }
    else {
      uVar21 = 0;
      do {
        auVar23._8_8_ = 0;
        auVar23._0_8_ = *puVar17;
        auVar6._8_8_ = 0;
        auVar6._0_8_ = uVar15;
        uVar20 = SUB168(auVar23 * auVar6,8);
        uVar19 = *puVar17 * uVar15;
        if (CARRY8(uVar19,uVar21)) {
          uVar20 = uVar20 + 1;
        }
        *plVar16 = uVar19 + uVar21;
        auVar2._8_8_ = 0;
        auVar2._0_8_ = puVar17[1];
        auVar7._8_8_ = 0;
        auVar7._0_8_ = uVar15;
        uVar21 = SUB168(auVar2 * auVar7,8);
        uVar19 = puVar17[1] * uVar15;
        if (CARRY8(uVar19,uVar20)) {
          uVar21 = uVar21 + 1;
        }
        plVar16[1] = uVar19 + uVar20;
        auVar3._8_8_ = 0;
        auVar3._0_8_ = puVar17[2];
        auVar8._8_8_ = 0;
        auVar8._0_8_ = uVar15;
        uVar20 = SUB168(auVar3 * auVar8,8);
        uVar19 = puVar17[2] * uVar15;
        if (CARRY8(uVar19,uVar21)) {
          uVar20 = uVar20 + 1;
        }
        plVar16[2] = uVar19 + uVar21;
        auVar4._8_8_ = 0;
        auVar4._0_8_ = puVar17[3];
        auVar9._8_8_ = 0;
        auVar9._0_8_ = uVar15;
        uVar21 = SUB168(auVar4 * auVar9,8);
        uVar19 = puVar17[3] * uVar15;
        if (CARRY8(uVar19,uVar20)) {
          uVar21 = uVar21 + 1;
        }
        plVar16[3] = uVar19 + uVar20;
        puVar17 = puVar17 + 4;
        plVar16 = plVar16 + 4;
        uVar18 = uVar18 - 4;
      } while (3 < uVar18);
      uVar20 = uVar21;
      if (uVar18 == 0) goto code_r0x002abf80;
    }
    do {
      auVar5._8_8_ = 0;
      auVar5._0_8_ = uVar15;
      auVar10._8_8_ = 0;
      auVar10._0_8_ = *puVar17;
      uVar21 = SUB168(auVar5 * auVar10,8);
      uVar19 = uVar15 * *puVar17;
      if (CARRY8(uVar19,uVar20)) {
        uVar21 = uVar21 + 1;
      }
      *plVar16 = uVar19 + uVar20;
      uVar18 = uVar18 - 1;
      plVar16 = plVar16 + 1;
      puVar17 = puVar17 + 1;
      uVar20 = uVar21;
    } while (uVar18 != 0);
  }
code_r0x002abf80:
  auVar23._0_8_[param_3] = uVar21;
  if (uVar11 != 1) {
    lVar13 = 4 - uVar11;
    lVar12 = param_3 * 8 + 0x20;
    lVar22 = 0;
    do {
      uVar14 = func_0x002a890c((long)auVar23._0_8_ + lVar22 + 8,puVar1,param_3,
                               *(undefined8 *)((long)param_4 + lVar22 + 8));
      *(undefined8 *)((long)auVar23._0_8_ + lVar22 + lVar12 + -0x18) = uVar14;
      if (lVar13 == 2) {
        return;
      }
      uVar14 = func_0x002a890c((long)auVar23._0_8_ + lVar22 + 0x10,puVar1,param_3,
                               *(undefined8 *)((long)param_4 + lVar22 + 0x10));
      *(undefined8 *)((long)auVar23._0_8_ + lVar22 + lVar12 + -0x10) = uVar14;
      if (lVar13 == 1) {
        return;
      }
      uVar14 = func_0x002a890c((long)auVar23._0_8_ + lVar22 + 0x18,puVar1,param_3,
                               *(undefined8 *)((long)param_4 + lVar22 + 0x18));
      *(undefined8 *)((long)auVar23._0_8_ + lVar22 + lVar12 + -8) = uVar14;
      if (lVar13 == 0) {
        return;
      }
      uVar14 = func_0x002a890c(lVar22 + 0x20 + (long)auVar23._0_8_,puVar1,param_3,
                               *(undefined8 *)((long)param_4 + lVar22 + 0x20));
      *(undefined8 *)((long)auVar23._0_8_ + lVar22 + lVar12) = uVar14;
      lVar13 = lVar13 + 4;
      lVar22 = lVar22 + 0x20;
    } while (lVar13 != 3);
  }
  return;
}

