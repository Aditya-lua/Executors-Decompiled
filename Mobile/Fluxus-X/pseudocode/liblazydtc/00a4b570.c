/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4b570
 */

void gf_mul(ulong *param_1,long *param_2,long *param_3)

{
  uint uVar1;
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
  bool bVar15;
  long lVar16;
  ulong uVar17;
  ulong *puVar18;
  ulong *puVar19;
  long lVar20;
  ulong uVar21;
  ulong uVar22;
  long lVar23;
  ulong uVar24;
  ulong uVar25;
  ulong *puVar26;
  uint uVar27;
  ulong *puVar28;
  ulong uVar29;
  ulong uVar30;
  ulong local_a0 [4];
  ulong local_80 [4];
  ulong local_60 [4];
  
  local_80[0] = param_3[4] + *param_3;
  local_80[1] = param_3[5] + param_3[1];
  local_a0[1] = local_80[1] + param_3[5];
  local_a0[0] = local_80[0] + param_3[4];
  local_60[1] = param_2[5] + param_2[1];
  local_60[0] = param_2[4] + *param_2;
  local_80[2] = param_3[6] + param_3[2];
  local_80[3] = param_3[7] + param_3[3];
  lVar23 = 0;
  uVar25 = 0;
  uVar22 = 0;
  uVar24 = 0;
  uVar21 = 0;
  puVar26 = (ulong *)(param_2 + 5);
  uVar27 = 1;
  puVar28 = (ulong *)((ulong)local_60 | 8);
  local_a0[3] = local_80[3] + param_3[7];
  local_a0[2] = local_80[2] + param_3[6];
  local_60[3] = param_2[7] + param_2[3];
  local_60[2] = param_2[6] + param_2[2];
  do {
    uVar17 = 0;
    lVar16 = 0;
    puVar18 = local_60;
    puVar19 = (ulong *)(param_2 + 4);
    lVar20 = lVar23;
    do {
      uVar29 = lVar20 * 8 & 0x7fffffff8;
      uVar30 = *(ulong *)((long)param_3 + uVar29);
      uVar29 = *(ulong *)((long)local_80 + uVar29);
      auVar3._8_8_ = 0;
      auVar3._0_8_ = uVar30;
      auVar9._8_8_ = 0;
      auVar9._0_8_ = puVar19[-4];
      uVar30 = uVar30 * puVar19[-4];
      bVar15 = CARRY8(uVar30,uVar17);
      uVar17 = uVar30 + uVar17;
      auVar4._8_8_ = 0;
      auVar4._0_8_ = uVar29;
      auVar10._8_8_ = 0;
      auVar10._0_8_ = *puVar18;
      uVar29 = uVar29 * *puVar18;
      lVar16 = SUB168(auVar3 * auVar9,8) + lVar16 + (ulong)bVar15;
      bVar15 = CARRY8(uVar29,uVar24);
      uVar24 = uVar29 + uVar24;
      auVar5._8_8_ = 0;
      auVar5._0_8_ = param_3[lVar20 + 4];
      auVar11._8_8_ = 0;
      auVar11._0_8_ = *puVar19;
      uVar30 = param_3[lVar20 + 4] * *puVar19;
      uVar21 = SUB168(auVar4 * auVar10,8) + uVar21 + (ulong)bVar15;
      bVar15 = CARRY8(uVar30,uVar25);
      uVar25 = uVar30 + uVar25;
      uVar22 = SUB168(auVar5 * auVar11,8) + uVar22 + (ulong)bVar15;
      bVar15 = lVar20 != 0;
      puVar18 = puVar18 + 1;
      puVar19 = puVar19 + 1;
      lVar20 = lVar20 + -1;
    } while (bVar15);
    if (uVar27 < 4) {
      lVar20 = 0;
      puVar18 = puVar26;
      puVar19 = puVar28;
      do {
        uVar1 = (int)lVar20 + 3;
        auVar6._8_8_ = 0;
        auVar6._0_8_ = param_3[(int)lVar20 + 7];
        auVar12._8_8_ = 0;
        auVar12._0_8_ = puVar18[-4];
        uVar30 = param_3[(int)lVar20 + 7] * puVar18[-4];
        bVar15 = CARRY8(uVar30,uVar17);
        uVar17 = uVar30 + uVar17;
        auVar7._8_8_ = 0;
        auVar7._0_8_ = local_a0[uVar1];
        auVar13._8_8_ = 0;
        auVar13._0_8_ = *puVar19;
        uVar30 = local_a0[uVar1] * *puVar19;
        lVar16 = SUB168(auVar6 * auVar12,8) + lVar16 + (ulong)bVar15;
        bVar15 = CARRY8(uVar30,uVar24);
        uVar24 = uVar30 + uVar24;
        auVar8._8_8_ = 0;
        auVar8._0_8_ = local_80[uVar1];
        auVar14._8_8_ = 0;
        auVar14._0_8_ = *puVar18;
        uVar30 = local_80[uVar1] * *puVar18;
        uVar21 = SUB168(auVar7 * auVar13,8) + uVar21 + (ulong)bVar15;
        bVar15 = CARRY8(uVar30,uVar25);
        uVar25 = uVar30 + uVar25;
        uVar22 = SUB168(auVar8 * auVar14,8) + uVar22 + (ulong)bVar15;
        lVar20 = lVar20 + -1;
        puVar18 = puVar18 + 1;
        puVar19 = puVar19 + 1;
      } while (lVar23 + -3 != lVar20);
    }
    lVar20 = lVar23 + 4;
    uVar30 = uVar24 - uVar17;
    uVar21 = uVar21 - (lVar16 + (ulong)(uVar24 < uVar17));
    uVar22 = uVar22 + lVar16 + (ulong)CARRY8(uVar25,uVar17);
    param_1[lVar23] = uVar25 + uVar17 & 0xffffffffffffff;
    lVar23 = lVar23 + 1;
    uVar27 = uVar27 + 1;
    uVar24 = uVar30 >> 0x38 | uVar21 * 0x100;
    uVar21 = uVar21 >> 0x38;
    uVar25 = uVar25 + uVar17 >> 0x38 | uVar22 * 0x100;
    uVar22 = uVar22 >> 0x38;
    puVar28 = puVar28 + 1;
    puVar26 = puVar26 + 1;
    param_1[lVar20] = uVar30 & 0xffffffffffffff;
  } while (lVar23 != 4);
  uVar29 = param_1[4];
  uVar17 = uVar25 + uVar24 + uVar29;
  uVar2 = *param_1;
  uVar30 = uVar24 + uVar2;
  param_1[4] = uVar17 & 0xffffffffffffff;
  param_1[5] = param_1[5] +
               (uVar17 >> 0x38 |
               (uVar22 + uVar21 + (ulong)CARRY8(uVar25,uVar24) +
               (ulong)CARRY8(uVar25 + uVar24,uVar29)) * 0x100);
  *param_1 = uVar30 & 0xffffffffffffff;
  param_1[1] = param_1[1] + (uVar30 >> 0x38 | (uVar21 + CARRY8(uVar24,uVar2)) * 0x100);
  return;
}

