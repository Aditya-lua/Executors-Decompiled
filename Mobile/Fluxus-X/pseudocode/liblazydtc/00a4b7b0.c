/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4b7b0
 */

void gf_mulw_unsigned(ulong *param_1,ulong *param_2,ulong param_3)

{
  ulong uVar1;
  undefined1 auVar2 [16];
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
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  
  param_3 = param_3 & 0xffffffff;
  uVar28 = *param_2 * param_3;
  auVar2._8_8_ = 0;
  auVar2._0_8_ = *param_2;
  auVar10._8_8_ = 0;
  auVar10._0_8_ = param_3;
  uVar18 = SUB168(auVar2 * auVar10,8);
  uVar29 = param_2[4] * param_3;
  auVar3._8_8_ = 0;
  auVar3._0_8_ = param_2[4];
  auVar11._8_8_ = 0;
  auVar11._0_8_ = param_3;
  uVar20 = SUB168(auVar3 * auVar11,8);
  auVar4._8_8_ = 0;
  auVar4._0_8_ = param_2[1];
  auVar12._8_8_ = 0;
  auVar12._0_8_ = param_3;
  uVar19 = param_2[1] * param_3;
  auVar5._8_8_ = 0;
  auVar5._0_8_ = param_2[5];
  auVar13._8_8_ = 0;
  auVar13._0_8_ = param_3;
  uVar21 = param_2[5] * param_3;
  auVar6._8_8_ = 0;
  auVar6._0_8_ = param_2[2];
  auVar14._8_8_ = 0;
  auVar14._0_8_ = param_3;
  uVar22 = param_2[2] * param_3;
  auVar7._8_8_ = 0;
  auVar7._0_8_ = param_2[6];
  auVar15._8_8_ = 0;
  auVar15._0_8_ = param_3;
  uVar24 = param_2[6] * param_3;
  auVar8._8_8_ = 0;
  auVar8._0_8_ = param_2[3];
  auVar16._8_8_ = 0;
  auVar16._0_8_ = param_3;
  uVar23 = param_2[3] * param_3;
  auVar9._8_8_ = 0;
  auVar9._0_8_ = param_2[7];
  auVar17._8_8_ = 0;
  auVar17._0_8_ = param_3;
  param_3 = param_2[7] * param_3;
  uVar27 = uVar28 >> 0x38 | uVar18 << 8;
  uVar1 = uVar19 + uVar27;
  uVar27 = SUB168(auVar4 * auVar12,8) + (uVar18 >> 0x38) + (ulong)CARRY8(uVar19,uVar27);
  uVar19 = uVar29 >> 0x38 | uVar20 << 8;
  uVar18 = uVar21 + uVar19;
  uVar20 = SUB168(auVar5 * auVar13,8) + (uVar20 >> 0x38) + (ulong)CARRY8(uVar21,uVar19);
  uVar21 = uVar1 >> 0x38 | uVar27 * 0x100;
  uVar19 = uVar22 + uVar21;
  uVar29 = uVar29 & 0xffffffffffffff;
  uVar21 = SUB168(auVar6 * auVar14,8) + (uVar27 >> 0x38) + (ulong)CARRY8(uVar22,uVar21);
  uVar22 = uVar18 >> 0x38 | uVar20 * 0x100;
  uVar27 = uVar24 + uVar22;
  uVar25 = uVar19 >> 0x38 | uVar21 * 0x100;
  uVar22 = SUB168(auVar7 * auVar15,8) + (uVar20 >> 0x38) + (ulong)CARRY8(uVar24,uVar22);
  uVar20 = uVar23 + uVar25;
  uVar24 = uVar27 >> 0x38 | uVar22 * 0x100;
  uVar23 = SUB168(auVar8 * auVar16,8) + (uVar21 >> 0x38) + (ulong)CARRY8(uVar23,uVar25);
  uVar21 = param_3 + uVar24;
  uVar24 = SUB168(auVar9 * auVar17,8) + (uVar22 >> 0x38) + (ulong)CARRY8(param_3,uVar24);
  uVar26 = uVar20 >> 0x38 | uVar23 * 0x100;
  uVar25 = uVar21 >> 0x38 | uVar24 * 0x100;
  param_1[3] = uVar20 & 0xffffffffffffff;
  param_1[2] = uVar19 & 0xffffffffffffff;
  uVar24 = uVar24 >> 0x38;
  uVar19 = uVar26 + uVar25;
  uVar20 = uVar19 + uVar29;
  uVar28 = uVar28 & 0xffffffffffffff;
  uVar22 = uVar25 + uVar28;
  param_1[7] = uVar21 & 0xffffffffffffff;
  param_1[6] = uVar27 & 0xffffffffffffff;
  param_1[4] = uVar20 & 0xffffffffffffff;
  param_1[5] = (uVar18 & 0xffffffffffffff) +
               (uVar20 >> 0x38 |
               ((uVar23 >> 0x38) + uVar24 + (ulong)CARRY8(uVar26,uVar25) +
               (ulong)CARRY8(uVar19,uVar29)) * 0x100);
  *param_1 = uVar22 & 0xffffffffffffff;
  param_1[1] = (uVar1 & 0xffffffffffffff) +
               (uVar22 >> 0x38 | (uVar24 + CARRY8(uVar25,uVar28)) * 0x100);
  return;
}

