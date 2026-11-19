/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b83c74
 */

void mbedtls_mpi_core_shift_l(undefined8 *param_1,ulong param_2,ulong param_3)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong *puVar6;
  ulong uVar7;
  ulong uVar8;
  undefined1 (*pauVar9) [16];
  long lVar10;
  undefined8 *puVar11;
  ulong uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  
  uVar12 = param_3 >> 6;
  param_3 = param_3 & 0x3f;
  if (uVar12 == 0) goto LAB_00b83cf4;
  uVar4 = param_2;
  if (uVar12 < param_2) {
    uVar3 = param_2 - uVar12;
    uVar5 = param_2;
    uVar4 = uVar12;
    if (3 < uVar3) {
      uVar7 = (param_2 - 1) - uVar12;
      auVar16._8_8_ = 0;
      auVar16._0_8_ = uVar7;
      if ((((param_1 + (param_2 - 1) + -uVar7 <= param_1 + (param_2 - 1)) &&
           (SUB168(auVar16 * ZEXT816(8),8) == 0)) && (param_1 <= param_1 + uVar7)) &&
         ((param_1 + uVar3 <= param_1 + uVar12 || (param_1 + param_2 <= param_1)))) {
        uVar8 = uVar3 & 0xfffffffffffffffc;
        uVar5 = param_2 - uVar8;
        uVar7 = uVar8;
        puVar2 = param_1 + param_2;
        do {
          puVar11 = puVar2 + -4;
          puVar1 = puVar11 + -uVar12;
          uVar13 = *puVar1;
          uVar15 = puVar1[3];
          uVar14 = puVar1[2];
          uVar7 = uVar7 - 4;
          puVar2[-3] = puVar1[1];
          *puVar11 = uVar13;
          puVar2[-1] = uVar15;
          puVar2[-2] = uVar14;
          puVar2 = puVar11;
        } while (uVar7 != 0);
        if (uVar3 == uVar8) goto LAB_00b83ce0;
      }
    }
    do {
      uVar3 = uVar5 - 1;
      param_1[uVar3] = param_1[~uVar12 + uVar5];
      uVar5 = uVar3;
    } while (uVar12 < uVar3);
  }
LAB_00b83ce0:
  if (uVar4 != 0) {
    memset(param_1,0,uVar4 << 3);
  }
LAB_00b83cf4:
  if ((param_3 != 0) && (uVar12 < param_2)) {
    uVar3 = param_2 - uVar12;
    uVar7 = 0;
    uVar5 = 0x40 - param_3;
    uVar4 = uVar12;
    if (3 < uVar3) {
      uVar7 = uVar3 & 0xfffffffffffffffc;
      auVar16 = ZEXT816(0);
      uVar4 = uVar12 + uVar7;
      pauVar9 = (undefined1 (*) [16])(param_1 + uVar12 + 2);
      uVar12 = uVar7;
      do {
        uVar12 = uVar12 - 4;
        auVar19._8_8_ = -uVar5;
        auVar19._0_8_ = -uVar5;
        auVar19 = NEON_ushl(pauVar9[-1],auVar19,8);
        auVar21 = NEON_ext(auVar16,auVar19,8,1);
        auVar20._8_8_ = -uVar5;
        auVar20._0_8_ = -uVar5;
        auVar16 = NEON_ushl(*pauVar9,auVar20,8);
        auVar17._8_8_ = param_3;
        auVar17._0_8_ = param_3;
        auVar17 = NEON_ushl(pauVar9[-1],auVar17,8);
        auVar18._8_8_ = param_3;
        auVar18._0_8_ = param_3;
        auVar20 = NEON_ushl(*pauVar9,auVar18,8);
        auVar18 = NEON_ext(auVar19,auVar16,8,1);
        pauVar9[-1][8] = auVar17[8] | auVar21[8];
        pauVar9[-1][9] = auVar17[9] | auVar21[9];
        pauVar9[-1][10] = auVar17[10] | auVar21[10];
        pauVar9[-1][0xb] = auVar17[0xb] | auVar21[0xb];
        pauVar9[-1][0xc] = auVar17[0xc] | auVar21[0xc];
        pauVar9[-1][0xd] = auVar17[0xd] | auVar21[0xd];
        pauVar9[-1][0xe] = auVar17[0xe] | auVar21[0xe];
        pauVar9[-1][0xf] = auVar17[0xf] | auVar21[0xf];
        pauVar9[-1][0] = auVar17[0] | auVar21[0];
        pauVar9[-1][1] = auVar17[1] | auVar21[1];
        pauVar9[-1][2] = auVar17[2] | auVar21[2];
        pauVar9[-1][3] = auVar17[3] | auVar21[3];
        pauVar9[-1][4] = auVar17[4] | auVar21[4];
        pauVar9[-1][5] = auVar17[5] | auVar21[5];
        pauVar9[-1][6] = auVar17[6] | auVar21[6];
        pauVar9[-1][7] = auVar17[7] | auVar21[7];
        (*pauVar9)[8] = auVar20[8] | auVar18[8];
        (*pauVar9)[9] = auVar20[9] | auVar18[9];
        (*pauVar9)[10] = auVar20[10] | auVar18[10];
        (*pauVar9)[0xb] = auVar20[0xb] | auVar18[0xb];
        (*pauVar9)[0xc] = auVar20[0xc] | auVar18[0xc];
        (*pauVar9)[0xd] = auVar20[0xd] | auVar18[0xd];
        (*pauVar9)[0xe] = auVar20[0xe] | auVar18[0xe];
        (*pauVar9)[0xf] = auVar20[0xf] | auVar18[0xf];
        (*pauVar9)[0] = auVar20[0] | auVar18[0];
        (*pauVar9)[1] = auVar20[1] | auVar18[1];
        (*pauVar9)[2] = auVar20[2] | auVar18[2];
        (*pauVar9)[3] = auVar20[3] | auVar18[3];
        (*pauVar9)[4] = auVar20[4] | auVar18[4];
        (*pauVar9)[5] = auVar20[5] | auVar18[5];
        (*pauVar9)[6] = auVar20[6] | auVar18[6];
        (*pauVar9)[7] = auVar20[7] | auVar18[7];
        pauVar9 = pauVar9 + 2;
      } while (uVar12 != 0);
      if (uVar3 == uVar7) {
        return;
      }
      uVar7 = auVar16._8_8_;
    }
    lVar10 = param_2 - uVar4;
    puVar6 = param_1 + uVar4;
    do {
      lVar10 = lVar10 + -1;
      uVar12 = *puVar6 << param_3 | uVar7;
      uVar7 = *puVar6 >> (uVar5 & 0x3f);
      *puVar6 = uVar12;
      puVar6 = puVar6 + 1;
    } while (lVar10 != 0);
  }
  return;
}

