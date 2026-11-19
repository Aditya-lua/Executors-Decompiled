/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b83f24
 */

ulong mbedtls_mpi_core_mla(ulong *param_1,ulong param_2,ulong *param_3,ulong param_4,ulong param_5)

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
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  ulong *puVar20;
  ulong *puVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  long lVar27;
  
  uVar1 = param_2;
  if (param_4 <= param_2) {
    uVar1 = param_4;
  }
  uVar24 = 0;
  if (uVar1 >> 3 != 0) {
    lVar27 = -(uVar1 >> 3);
    do {
      uVar23 = *param_3 * param_5;
      auVar2._8_8_ = 0;
      auVar2._0_8_ = *param_3;
      auVar11._8_8_ = 0;
      auVar11._0_8_ = param_5;
      uVar22 = *param_1 + uVar23;
      uVar25 = SUB168(auVar2 * auVar11,8) + (ulong)CARRY8(*param_1,uVar23) +
               (ulong)CARRY8(uVar22,uVar24);
      *param_1 = uVar22 + uVar24;
      uVar22 = param_1[1];
      uVar23 = param_3[1] * param_5;
      auVar3._8_8_ = 0;
      auVar3._0_8_ = param_3[1];
      auVar12._8_8_ = 0;
      auVar12._0_8_ = param_5;
      uVar24 = uVar22 + uVar23;
      uVar26 = SUB168(auVar3 * auVar12,8) + (ulong)CARRY8(uVar22,uVar23) +
               (ulong)CARRY8(uVar24,uVar25);
      param_1[1] = uVar24 + uVar25;
      uVar22 = param_1[2];
      uVar23 = param_3[2] * param_5;
      auVar4._8_8_ = 0;
      auVar4._0_8_ = param_3[2];
      auVar13._8_8_ = 0;
      auVar13._0_8_ = param_5;
      uVar24 = uVar22 + uVar23;
      uVar25 = SUB168(auVar4 * auVar13,8) + (ulong)CARRY8(uVar22,uVar23) +
               (ulong)CARRY8(uVar24,uVar26);
      param_1[2] = uVar24 + uVar26;
      uVar22 = param_1[3];
      uVar23 = param_3[3] * param_5;
      auVar5._8_8_ = 0;
      auVar5._0_8_ = param_3[3];
      auVar14._8_8_ = 0;
      auVar14._0_8_ = param_5;
      uVar24 = uVar22 + uVar23;
      uVar26 = SUB168(auVar5 * auVar14,8) + (ulong)CARRY8(uVar22,uVar23) +
               (ulong)CARRY8(uVar24,uVar25);
      param_1[3] = uVar24 + uVar25;
      uVar22 = param_1[4];
      uVar23 = param_3[4] * param_5;
      auVar6._8_8_ = 0;
      auVar6._0_8_ = param_3[4];
      auVar15._8_8_ = 0;
      auVar15._0_8_ = param_5;
      uVar24 = uVar22 + uVar23;
      uVar25 = SUB168(auVar6 * auVar15,8) + (ulong)CARRY8(uVar22,uVar23) +
               (ulong)CARRY8(uVar24,uVar26);
      param_1[4] = uVar24 + uVar26;
      uVar22 = param_1[5];
      uVar23 = param_3[5] * param_5;
      auVar7._8_8_ = 0;
      auVar7._0_8_ = param_3[5];
      auVar16._8_8_ = 0;
      auVar16._0_8_ = param_5;
      uVar24 = uVar22 + uVar23;
      uVar26 = SUB168(auVar7 * auVar16,8) + (ulong)CARRY8(uVar22,uVar23) +
               (ulong)CARRY8(uVar24,uVar25);
      param_1[5] = uVar24 + uVar25;
      puVar21 = param_3 + 7;
      uVar22 = param_1[6];
      uVar23 = param_3[6] * param_5;
      auVar8._8_8_ = 0;
      auVar8._0_8_ = param_3[6];
      auVar17._8_8_ = 0;
      auVar17._0_8_ = param_5;
      uVar24 = uVar22 + uVar23;
      uVar25 = SUB168(auVar8 * auVar17,8) + (ulong)CARRY8(uVar22,uVar23) +
               (ulong)CARRY8(uVar24,uVar26);
      puVar20 = param_1 + 7;
      param_1[6] = uVar24 + uVar26;
      param_3 = param_3 + 8;
      uVar24 = *puVar20;
      uVar23 = *puVar21 * param_5;
      auVar9._8_8_ = 0;
      auVar9._0_8_ = *puVar21;
      auVar18._8_8_ = 0;
      auVar18._0_8_ = param_5;
      uVar22 = uVar24 + uVar23;
      uVar24 = SUB168(auVar9 * auVar18,8) + (ulong)CARRY8(uVar24,uVar23) +
               (ulong)CARRY8(uVar22,uVar25);
      param_1 = param_1 + 8;
      *puVar20 = uVar22 + uVar25;
      lVar27 = lVar27 + 1;
    } while (lVar27 != 0);
  }
  if ((uVar1 & 7) != 0) {
    lVar27 = -(uVar1 & 7);
    puVar20 = param_1;
    do {
      uVar25 = *param_3 * param_5;
      auVar10._8_8_ = 0;
      auVar10._0_8_ = *param_3;
      auVar19._8_8_ = 0;
      auVar19._0_8_ = param_5;
      uVar22 = *puVar20 + uVar25;
      uVar23 = uVar22 + uVar24;
      uVar24 = SUB168(auVar10 * auVar19,8) + (ulong)CARRY8(*puVar20,uVar25) +
               (ulong)CARRY8(uVar22,uVar24);
      param_1 = puVar20 + 1;
      *puVar20 = uVar23;
      lVar27 = lVar27 + 1;
      puVar20 = param_1;
      param_3 = param_3 + 1;
    } while (lVar27 != 0);
  }
  if (param_2 != uVar1) {
    param_4 = ~param_4;
    if (param_4 < ~param_2) {
      param_4 = ~param_2;
    }
    lVar27 = ~param_2 - param_4;
    do {
      uVar22 = uVar24;
      uVar24 = *param_1;
      uVar1 = uVar24 + uVar22;
      lVar27 = lVar27 + 1;
      *param_1 = uVar1;
      param_1 = param_1 + 1;
      uVar24 = (ulong)CARRY8(uVar24,uVar22);
    } while (lVar27 != 0);
    uVar24 = (ulong)(uVar1 < uVar22);
  }
  return uVar24;
}

