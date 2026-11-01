
void FUN_0030db9c(ulong param_1,undefined8 param_2,undefined8 param_3,ulong *param_4,ulong *param_5)

{
  ulong uVar1;
  ulong uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  ulong uVar35;
  ulong *extraout_x1;
  ulong uVar36;
  ulong uVar37;
  ulong uVar38;
  ulong uVar39;
  undefined8 in_x9;
  ulong uVar40;
  undefined8 in_x10;
  ulong uVar41;
  ulong uVar42;
  ulong uVar43;
  ulong uVar44;
  ulong uVar45;
  ulong uVar46;
  ulong uVar47;
  ulong uVar48;
  long in_x17;
  ulong uVar49;
  ulong uVar50;
  long lVar51;
  long unaff_x29;
  long in_stack_000000d0;
  ulong in_stack_000000d8;
  ulong in_stack_000000e0;
  ulong in_stack_000000e8;
  
  *(undefined8 *)(in_x17 + 0x58) = in_x9;
  *(undefined8 *)(in_x17 + 0x60) = in_x10;
  uVar40 = ((in_stack_000000e0 & in_stack_000000e8 & (in_stack_000000d8 | 0xffffffffff)) + 1 |
           (long)(in_stack_000000d0 + (in_stack_000000d8 & 0xffffffffff) + -1) >> 0x3f) &
           0xffffffffffffff;
  uVar41 = -(ulong)(uVar40 != 0);
  if (uVar40 != 0) {
    param_1 = 0xffffffffffffffff;
  }
  uVar40 = (in_stack_000000d0 - (in_stack_000000e8 >> 0x38)) + ((long)(uVar40 - 1) >> 0x3f);
  uVar1 = (param_1 & in_stack_000000d8 + ((in_stack_000000e8 >> 0x38) << 0x28)) +
          ((long)uVar40 >> 0x3f);
  uVar44 = (in_stack_000000e0 & uVar41) + ((long)uVar1 >> 0x38);
  *(ulong *)(in_x17 + 0x90) = uVar40 + ((uVar40 >> 0x3f) << 0x38) | uVar1 << 0x38;
  *(ulong *)(in_x17 + 0x98) = uVar1 >> 8 & 0xffffffffffff | uVar44 << 0x30;
  uVar40 = (in_stack_000000e8 & uVar41 & 0xffffffffffffff) + ((long)uVar44 >> 0x38);
  *(ulong *)(in_x17 + 0xa0) = uVar44 >> 0x10 & 0xffffffffff | uVar40 << 0x28;
  *(ulong *)(in_x17 + 0xa8) = uVar40 >> 0x18;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  ___stack_chk_fail();
  uVar45 = *param_4 & 0xffffffffffffff;
  uVar46 = *param_4 >> 0x38 | (param_4[1] & 0xffffffffffff) << 8;
  uVar47 = param_4[1] >> 0x30 | (param_4[2] & 0xffffffffff) << 0x10;
  uVar49 = param_4[2] >> 0x28 | (param_4[3] & 0xffffffff) << 0x18;
  uVar35 = *param_5 & 0xffffffffffffff;
  uVar36 = *param_5 >> 0x38 | (param_5[1] & 0xffffffffffff) << 8;
  uVar37 = param_5[1] >> 0x30 | (param_5[2] & 0xffffffffff) << 0x10;
  uVar38 = param_5[2] >> 0x28 | (param_5[3] & 0xffffffff) << 0x18;
  auVar3._8_8_ = 0;
  auVar3._0_8_ = uVar35;
  auVar19._8_8_ = 0;
  auVar19._0_8_ = uVar45;
  auVar4._8_8_ = 0;
  auVar4._0_8_ = uVar36;
  auVar20._8_8_ = 0;
  auVar20._0_8_ = uVar45;
  auVar5._8_8_ = 0;
  auVar5._0_8_ = uVar35;
  auVar21._8_8_ = 0;
  auVar21._0_8_ = uVar46;
  auVar6._8_8_ = 0;
  auVar6._0_8_ = uVar37;
  auVar22._8_8_ = 0;
  auVar22._0_8_ = uVar45;
  auVar7._8_8_ = 0;
  auVar7._0_8_ = uVar36;
  auVar23._8_8_ = 0;
  auVar23._0_8_ = uVar46;
  auVar8._8_8_ = 0;
  auVar8._0_8_ = uVar35;
  auVar24._8_8_ = 0;
  auVar24._0_8_ = uVar47;
  auVar9._8_8_ = 0;
  auVar9._0_8_ = uVar38;
  auVar25._8_8_ = 0;
  auVar25._0_8_ = uVar45;
  auVar10._8_8_ = 0;
  auVar10._0_8_ = uVar37;
  auVar26._8_8_ = 0;
  auVar26._0_8_ = uVar46;
  auVar11._8_8_ = 0;
  auVar11._0_8_ = uVar36;
  auVar27._8_8_ = 0;
  auVar27._0_8_ = uVar47;
  auVar12._8_8_ = 0;
  auVar12._0_8_ = uVar49;
  auVar28._8_8_ = 0;
  auVar28._0_8_ = uVar35;
  auVar13._8_8_ = 0;
  auVar13._0_8_ = uVar38;
  auVar29._8_8_ = 0;
  auVar29._0_8_ = uVar46;
  auVar14._8_8_ = 0;
  auVar14._0_8_ = uVar37;
  auVar30._8_8_ = 0;
  auVar30._0_8_ = uVar47;
  uVar40 = uVar38 * uVar47 + uVar37 * uVar49;
  auVar15._8_8_ = 0;
  auVar15._0_8_ = uVar38;
  auVar31._8_8_ = 0;
  auVar31._0_8_ = uVar47;
  auVar16._8_8_ = 0;
  auVar16._0_8_ = uVar37;
  auVar32._8_8_ = 0;
  auVar32._0_8_ = uVar49;
  uVar48 = SUB168(auVar15 * auVar31,8) + SUB168(auVar16 * auVar32,8) +
           (ulong)CARRY8(uVar38 * uVar47,uVar37 * uVar49);
  auVar17._8_8_ = 0;
  auVar17._0_8_ = uVar36;
  auVar33._8_8_ = 0;
  auVar33._0_8_ = uVar49;
  uVar39 = uVar38 * uVar49;
  auVar18._8_8_ = 0;
  auVar18._0_8_ = uVar38;
  auVar34._8_8_ = 0;
  auVar34._0_8_ = uVar49;
  uVar50 = SUB168(auVar18 * auVar34,8);
  uVar41 = uVar37 * uVar47 + uVar36 * uVar49;
  uVar1 = uVar41 + uVar38 * uVar46;
  uVar42 = uVar39 >> 0x10 | uVar50 << 0x30;
  uVar44 = uVar1 + uVar42;
  uVar43 = SUB168(auVar14 * auVar30,8) + SUB168(auVar17 * auVar33,8) +
           (ulong)CARRY8(uVar37 * uVar47,uVar36 * uVar49) + SUB168(auVar13 * auVar29,8) +
           (ulong)CARRY8(uVar41,uVar38 * uVar46) + (uVar50 >> 0x10) + (ulong)CARRY8(uVar1,uVar42);
  uVar41 = uVar35 * uVar47 + uVar36 * uVar46;
  uVar1 = uVar41 + uVar37 * uVar45;
  uVar42 = uVar1 - uVar39;
  lVar51 = (SUB168(auVar8 * auVar24,8) + SUB168(auVar7 * auVar23,8) +
            (ulong)CARRY8(uVar35 * uVar47,uVar36 * uVar46) + SUB168(auVar6 * auVar22,8) +
           (ulong)CARRY8(uVar41,uVar37 * uVar45)) - (uVar50 + (uVar1 < uVar39));
  uVar1 = (uVar40 & 0xffff) << 0x28;
  uVar41 = uVar42 + uVar1;
  uVar50 = uVar44 >> 0x10 | uVar43 << 0x30;
  if (CARRY8(uVar42,uVar1)) {
    lVar51 = lVar51 + 1;
  }
  uVar1 = uVar41 + uVar50;
  uVar41 = lVar51 + (uVar43 >> 0x10) + (ulong)CARRY8(uVar41,uVar50) + 0x7fffffffffffff80;
  uVar42 = uVar36 * uVar47 + uVar49 * uVar35;
  uVar50 = uVar42 + uVar37 * uVar46;
  uVar2 = uVar50 + uVar38 * uVar45;
  lVar51 = SUB168(auVar11 * auVar27,8) + SUB168(auVar12 * auVar28,8) +
           (ulong)CARRY8(uVar36 * uVar47,uVar49 * uVar35) + SUB168(auVar10 * auVar26,8) +
           (ulong)CARRY8(uVar42,uVar37 * uVar46) + SUB168(auVar9 * auVar25,8) +
           (ulong)CARRY8(uVar50,uVar38 * uVar45);
  uVar50 = (uVar39 & 0xffff) << 0x28;
  uVar42 = uVar2 + uVar50;
  uVar37 = uVar40 >> 0x10 | uVar48 << 0x30;
  if (CARRY8(uVar2,uVar50)) {
    lVar51 = lVar51 + 1;
  }
  uVar50 = uVar42 + uVar37;
  uVar39 = uVar1 >> 0x38 | uVar41 * 0x100;
  uVar38 = uVar50 + uVar39;
  uVar39 = lVar51 + (uVar48 >> 0x10) + (ulong)CARRY8(uVar42,uVar37) + (uVar41 >> 0x38) +
           (ulong)CARRY8(uVar50,uVar39);
  uVar37 = uVar38 >> 0x38 | uVar39 * 0x100;
  uVar42 = uVar44 + uVar37;
  uVar50 = uVar35 * uVar45 - uVar42;
  uVar41 = uVar50 + 0x8000;
  uVar37 = (SUB168(auVar3 * auVar19,8) -
           (uVar43 + (uVar39 >> 0x38) + (ulong)CARRY8(uVar44,uVar37) +
           (ulong)(uVar35 * uVar45 < uVar42))) + -0x8000000000000000 +
           (ulong)(0xffffffffffff7fff < uVar50);
  uVar42 = uVar35 * uVar46 + uVar36 * uVar45;
  uVar50 = uVar42 - uVar40;
  lVar51 = (SUB168(auVar5 * auVar21,8) + SUB168(auVar4 * auVar20,8) +
           (ulong)CARRY8(uVar35 * uVar46,uVar36 * uVar45)) - (uVar48 + (uVar42 < uVar40));
  uVar44 = (uVar44 & 0xffff) << 0x28;
  uVar40 = (uVar1 & 0xffffffffffffff) + (uVar39 >> 8);
  uVar35 = (uVar38 >> 0x10 | uVar39 << 0x30) & 0xffff0000000000;
  uVar1 = uVar50 + uVar44;
  uVar42 = uVar41 >> 0x38 | uVar37 * 0x100;
  if (CARRY8(uVar50,uVar44)) {
    lVar51 = lVar51 + 1;
  }
  uVar44 = uVar1 + uVar35;
  if (CARRY8(uVar1,uVar35)) {
    lVar51 = lVar51 + 1;
  }
  uVar1 = uVar44 + uVar42;
  uVar35 = uVar1 + 0xff80000000000000;
  uVar44 = lVar51 + (uVar37 >> 0x38) + (ulong)CARRY8(uVar44,uVar42) + 0x7fffffffffffff7f +
           (ulong)(0x7fffffffffffff < uVar1);
  uVar42 = uVar35 >> 0x38 | uVar44 * 0x100;
  uVar1 = uVar40 + uVar42;
  uVar41 = uVar41 & 0xffffffffffffff;
  uVar44 = uVar44 >> 0x38;
  if (CARRY8(uVar40,uVar42)) {
    uVar44 = uVar44 + 1;
  }
  uVar40 = (uVar1 >> 0x38 | uVar44 << 8) + (uVar38 & 0xffffffffffffff);
  uVar44 = (((uVar35 & 0xffffffffffffff | 0xffffffffff) & uVar1 & uVar40) + 1 |
           (long)(uVar41 + (uVar35 & 0xffffffffff) + -1) >> 0x3f) & 0xffffffffffffff;
  uVar42 = 0;
  if (uVar44 != 0) {
    uVar42 = 0xffffffffffffff;
  }
  uVar36 = 0xffffffffff;
  if (uVar44 != 0) {
    uVar36 = 0x1ffffffffffffff;
  }
  uVar41 = (uVar41 - (uVar40 >> 0x38)) + ((long)(uVar44 - 1) >> 0x3f);
  uVar44 = (uVar36 & (uVar35 & 0xffffffffffffff) + ((uVar40 >> 0x38) << 0x28)) +
           ((long)uVar41 >> 0x3f);
  uVar1 = (uVar42 & uVar1) + ((long)uVar44 >> 0x38);
  *extraout_x1 = uVar41 + ((uVar41 >> 0x3f) << 0x38) | uVar44 << 0x38;
  extraout_x1[1] = uVar44 >> 8 & 0xffffffffffff | uVar1 << 0x30;
  uVar40 = (uVar42 & uVar40) + ((long)uVar1 >> 0x38);
  extraout_x1[2] = uVar1 >> 0x10 & 0xffffffffff | uVar40 << 0x28;
  extraout_x1[3] = uVar40 >> 0x18;
  return;
}

