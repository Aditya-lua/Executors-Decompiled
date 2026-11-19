/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b83ab0
 */

void mbedtls_mpi_core_shift_r(undefined8 *param_1,ulong param_2,ulong param_3)

{
  ulong uVar1;
  undefined8 *puVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined1 (*pauVar7) [16];
  long lVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  
  uVar1 = param_3 >> 6;
  if ((param_2 < uVar1) || ((param_3 = param_3 & 0x3f, uVar1 == param_2 && (param_3 != 0)))) {
    memset(param_1,0,param_2 << 3);
    return;
  }
  if (uVar1 == 0) goto LAB_00b83b9c;
  uVar4 = param_2 - uVar1;
  if (uVar4 != 0) {
    uVar3 = 0;
    if ((3 < uVar4) &&
       ((param_1 + param_2 <= param_1 || (uVar3 = 0, param_1 + uVar4 <= param_1 + uVar1)))) {
      uVar3 = uVar4 & 0xfffffffffffffffc;
      uVar5 = uVar3;
      puVar2 = param_1;
      do {
        puVar6 = puVar2 + uVar1;
        uVar9 = *puVar6;
        uVar11 = puVar6[3];
        uVar10 = puVar6[2];
        uVar5 = uVar5 - 4;
        puVar2[1] = puVar6[1];
        *puVar2 = uVar9;
        puVar2[3] = uVar11;
        puVar2[2] = uVar10;
        puVar2 = puVar2 + 4;
      } while (uVar5 != 0);
      if (uVar4 == uVar3) goto LAB_00b83b80;
    }
    lVar8 = uVar4 - uVar3;
    puVar2 = param_1 + uVar3 + uVar1;
    puVar6 = param_1 + uVar3;
    do {
      lVar8 = lVar8 + -1;
      *puVar6 = *puVar2;
      puVar2 = puVar2 + 1;
      puVar6 = puVar6 + 1;
    } while (lVar8 != 0);
  }
LAB_00b83b80:
  if (uVar4 < param_2) {
    memset(param_1 + uVar4,0,(param_2 - uVar4) * 8);
  }
LAB_00b83b9c:
  if ((param_2 != 0) && (param_3 != 0)) {
    uVar1 = 0x40 - param_3;
    if (param_2 < 4) {
      uVar4 = 0;
      uVar3 = param_2;
    }
    else {
      uVar5 = param_2 & 0xfffffffffffffffc;
      auVar12 = ZEXT816(0);
      uVar3 = param_2 - uVar5;
      pauVar7 = (undefined1 (*) [16])(param_1 + (param_2 - 2));
      uVar4 = uVar5;
      do {
        uVar4 = uVar4 - 4;
        auVar13 = NEON_ext(*pauVar7,*pauVar7,8,1);
        auVar15 = NEON_ext(pauVar7[-1],pauVar7[-1],8,1);
        auVar14._8_8_ = uVar1;
        auVar14._0_8_ = uVar1;
        auVar17 = NEON_ushl(auVar13,auVar14,8);
        auVar16._8_8_ = -param_3;
        auVar16._0_8_ = -param_3;
        auVar14 = NEON_ushl(auVar13,auVar16,8);
        auVar18 = NEON_ext(auVar12,auVar17,8,1);
        auVar12._8_8_ = uVar1;
        auVar12._0_8_ = uVar1;
        auVar12 = NEON_ushl(auVar15,auVar12,8);
        auVar13._8_8_ = -param_3;
        auVar13._0_8_ = -param_3;
        auVar13 = NEON_ushl(auVar15,auVar13,8);
        auVar16 = NEON_ext(auVar17,auVar12,8,1);
        auVar15[0] = auVar14[0] | auVar18[0];
        auVar15[1] = auVar14[1] | auVar18[1];
        auVar15[2] = auVar14[2] | auVar18[2];
        auVar15[3] = auVar14[3] | auVar18[3];
        auVar15[4] = auVar14[4] | auVar18[4];
        auVar15[5] = auVar14[5] | auVar18[5];
        auVar15[6] = auVar14[6] | auVar18[6];
        auVar15[7] = auVar14[7] | auVar18[7];
        auVar15[8] = auVar14[8] | auVar18[8];
        auVar15[9] = auVar14[9] | auVar18[9];
        auVar15[10] = auVar14[10] | auVar18[10];
        auVar15[0xb] = auVar14[0xb] | auVar18[0xb];
        auVar15[0xc] = auVar14[0xc] | auVar18[0xc];
        auVar15[0xd] = auVar14[0xd] | auVar18[0xd];
        auVar15[0xe] = auVar14[0xe] | auVar18[0xe];
        auVar15[0xf] = auVar14[0xf] | auVar18[0xf];
        auVar17[0] = auVar13[0] | auVar16[0];
        auVar17[1] = auVar13[1] | auVar16[1];
        auVar17[2] = auVar13[2] | auVar16[2];
        auVar17[3] = auVar13[3] | auVar16[3];
        auVar17[4] = auVar13[4] | auVar16[4];
        auVar17[5] = auVar13[5] | auVar16[5];
        auVar17[6] = auVar13[6] | auVar16[6];
        auVar17[7] = auVar13[7] | auVar16[7];
        auVar17[8] = auVar13[8] | auVar16[8];
        auVar17[9] = auVar13[9] | auVar16[9];
        auVar17[10] = auVar13[10] | auVar16[10];
        auVar17[0xb] = auVar13[0xb] | auVar16[0xb];
        auVar17[0xc] = auVar13[0xc] | auVar16[0xc];
        auVar17[0xd] = auVar13[0xd] | auVar16[0xd];
        auVar17[0xe] = auVar13[0xe] | auVar16[0xe];
        auVar17[0xf] = auVar13[0xf] | auVar16[0xf];
        auVar14 = NEON_ext(auVar15,auVar15,8,1);
        *(long *)(*pauVar7 + 8) = auVar14._8_8_;
        *(long *)*pauVar7 = auVar14._0_8_;
        auVar14 = NEON_ext(auVar17,auVar17,8,1);
        *(long *)(pauVar7[-1] + 8) = auVar14._8_8_;
        *(long *)pauVar7[-1] = auVar14._0_8_;
        pauVar7 = pauVar7 + -2;
      } while (uVar4 != 0);
      if (uVar5 == param_2) {
        return;
      }
      uVar4 = auVar12._8_8_;
    }
    do {
      uVar3 = uVar3 - 1;
      uVar5 = (ulong)param_1[uVar3] >> param_3 | uVar4;
      uVar4 = param_1[uVar3] << (uVar1 & 0x3f);
      param_1[uVar3] = uVar5;
    } while (uVar3 != 0);
  }
  return;
}

