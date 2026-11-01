
void FUN_002abb30(void)

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
  undefined8 uVar13;
  ulong uVar14;
  ulong *in_x3;
  ulong in_x4;
  long lVar15;
  ulong uVar16;
  long *plVar17;
  ulong *puVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  long unaff_x19;
  undefined8 *unaff_x20;
  ulong *unaff_x21;
  undefined8 *unaff_x22;
  long lVar23;
  undefined1 auVar24 [16];
  
  *(undefined4 *)((long)unaff_x22 + 0xc) = 0x10;
  *(undefined4 *)(unaff_x22 + 1) = 0x10;
  uVar14 = *unaff_x21;
  func_0x002a8a84();
  if (unaff_x22 == unaff_x20) {
LAB_002abdf8:
    uVar13 = 1;
  }
  else {
    uVar13 = func_0x0029afb8();
    if ((int)uVar13 != 0) {
      if (*(int *)(unaff_x22 + 1) == 0) {
        *(undefined4 *)(unaff_x20 + 1) = 0;
      }
      else {
        uVar14 = (long)*(int *)(unaff_x22 + 1) << 3;
        _memcpy(*unaff_x20,*unaff_x22);
        *(undefined4 *)(unaff_x20 + 1) = *(undefined4 *)(unaff_x22 + 1);
      }
      *(undefined4 *)(unaff_x20 + 2) = *(undefined4 *)(unaff_x22 + 2);
      goto LAB_002abdf8;
    }
  }
  if (*(char *)(unaff_x19 + 0x28) != '\0') {
    return;
  }
  if (*(long *)(unaff_x19 + 0x10) != 0) {
    lVar15 = *(long *)(unaff_x19 + 0x10) + -1;
    *(long *)(unaff_x19 + 0x10) = lVar15;
    *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar15 * 8);
    return;
  }
  func_0x0079db4c(uVar13);
  func_0x0079e120();
  auVar24 = func_0x0079e0f8();
  auVar24._0_8_ = auVar24._0_8_;
  puVar1 = auVar24._8_8_;
  uVar11 = in_x4;
  if (uVar14 < in_x4) {
    puVar1 = in_x3;
    uVar11 = uVar14;
    in_x3 = auVar24._8_8_;
    uVar14 = in_x4;
  }
  if (uVar11 == 0) {
    if ((uVar14 & 0x1fffffffffffffff) == 0) {
      return;
    }
                    /* WARNING: Could not recover jumptable at 0x007b31b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__bzero_00a24c68)(auVar24._0_8_);
    return;
  }
  if (uVar14 == 0) {
    uVar22 = 0;
  }
  else {
    uVar16 = *in_x3;
    plVar17 = auVar24._0_8_;
    puVar18 = puVar1;
    uVar19 = uVar14;
    if (uVar14 < 4) {
      uVar21 = 0;
    }
    else {
      uVar22 = 0;
      do {
        auVar24._8_8_ = 0;
        auVar24._0_8_ = *puVar18;
        auVar6._8_8_ = 0;
        auVar6._0_8_ = uVar16;
        uVar21 = SUB168(auVar24 * auVar6,8);
        uVar20 = *puVar18 * uVar16;
        if (CARRY8(uVar20,uVar22)) {
          uVar21 = uVar21 + 1;
        }
        *plVar17 = uVar20 + uVar22;
        auVar2._8_8_ = 0;
        auVar2._0_8_ = puVar18[1];
        auVar7._8_8_ = 0;
        auVar7._0_8_ = uVar16;
        uVar22 = SUB168(auVar2 * auVar7,8);
        uVar20 = puVar18[1] * uVar16;
        if (CARRY8(uVar20,uVar21)) {
          uVar22 = uVar22 + 1;
        }
        plVar17[1] = uVar20 + uVar21;
        auVar3._8_8_ = 0;
        auVar3._0_8_ = puVar18[2];
        auVar8._8_8_ = 0;
        auVar8._0_8_ = uVar16;
        uVar21 = SUB168(auVar3 * auVar8,8);
        uVar20 = puVar18[2] * uVar16;
        if (CARRY8(uVar20,uVar22)) {
          uVar21 = uVar21 + 1;
        }
        plVar17[2] = uVar20 + uVar22;
        auVar4._8_8_ = 0;
        auVar4._0_8_ = puVar18[3];
        auVar9._8_8_ = 0;
        auVar9._0_8_ = uVar16;
        uVar22 = SUB168(auVar4 * auVar9,8);
        uVar20 = puVar18[3] * uVar16;
        if (CARRY8(uVar20,uVar21)) {
          uVar22 = uVar22 + 1;
        }
        plVar17[3] = uVar20 + uVar21;
        puVar18 = puVar18 + 4;
        plVar17 = plVar17 + 4;
        uVar19 = uVar19 - 4;
      } while (3 < uVar19);
      uVar21 = uVar22;
      if (uVar19 == 0) goto LAB_002abf80;
    }
    do {
      auVar5._8_8_ = 0;
      auVar5._0_8_ = uVar16;
      auVar10._8_8_ = 0;
      auVar10._0_8_ = *puVar18;
      uVar22 = SUB168(auVar5 * auVar10,8);
      uVar20 = uVar16 * *puVar18;
      if (CARRY8(uVar20,uVar21)) {
        uVar22 = uVar22 + 1;
      }
      *plVar17 = uVar20 + uVar21;
      uVar19 = uVar19 - 1;
      plVar17 = plVar17 + 1;
      puVar18 = puVar18 + 1;
      uVar21 = uVar22;
    } while (uVar19 != 0);
  }
LAB_002abf80:
  auVar24._0_8_[uVar14] = uVar22;
  if (uVar11 != 1) {
    lVar15 = 4 - uVar11;
    lVar12 = uVar14 * 8 + 0x20;
    lVar23 = 0;
    do {
      uVar13 = func_0x002a890c((long)auVar24._0_8_ + lVar23 + 8,puVar1,uVar14,
                               *(undefined8 *)((long)in_x3 + lVar23 + 8));
      *(undefined8 *)((long)auVar24._0_8_ + lVar23 + lVar12 + -0x18) = uVar13;
      if (lVar15 == 2) {
        return;
      }
      uVar13 = func_0x002a890c((long)auVar24._0_8_ + lVar23 + 0x10,puVar1,uVar14,
                               *(undefined8 *)((long)in_x3 + lVar23 + 0x10));
      *(undefined8 *)((long)auVar24._0_8_ + lVar23 + lVar12 + -0x10) = uVar13;
      if (lVar15 == 1) {
        return;
      }
      uVar13 = func_0x002a890c((long)auVar24._0_8_ + lVar23 + 0x18,puVar1,uVar14,
                               *(undefined8 *)((long)in_x3 + lVar23 + 0x18));
      *(undefined8 *)((long)auVar24._0_8_ + lVar23 + lVar12 + -8) = uVar13;
      if (lVar15 == 0) {
        return;
      }
      uVar13 = func_0x002a890c(lVar23 + 0x20 + (long)auVar24._0_8_,puVar1,uVar14,
                               *(undefined8 *)((long)in_x3 + lVar23 + 0x20));
      *(undefined8 *)((long)auVar24._0_8_ + lVar23 + lVar12) = uVar13;
      lVar15 = lVar15 + 4;
      lVar23 = lVar23 + 0x20;
    } while (lVar15 != 3);
  }
  return;
}

