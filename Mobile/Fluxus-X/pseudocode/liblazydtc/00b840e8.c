/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b840e8
 */

void mbedtls_mpi_core_mul(void *param_1,ulong *param_2,ulong param_3,long param_4,long param_5)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
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
  long lVar23;
  ulong uVar24;
  ulong uVar25;
  long lVar26;
  ulong uVar27;
  ulong uVar28;
  ulong *puVar29;
  ulong *puVar30;
  ulong uVar31;
  ulong uVar32;
  ulong uVar33;
  ulong uVar34;
  ulong *puVar35;
  ulong *puVar36;
  
  memset(param_1,0,(param_5 + param_3) * 8);
  if (param_5 != 0) {
    uVar28 = -param_3 - 2;
    uVar3 = param_3 + 1;
    if (param_3 != 0xffffffffffffffff) {
      uVar3 = param_3;
    }
    uVar27 = uVar3 & 7;
    uVar4 = uVar28;
    if (uVar28 < ~param_3) {
      uVar4 = ~param_3;
    }
    lVar26 = 0;
    do {
      uVar34 = *(ulong *)(param_4 + lVar26 * 8);
      puVar30 = (ulong *)((long)param_1 + lVar26 * 8);
      uVar31 = 0;
      uVar1 = -uVar27;
      puVar35 = param_2;
      uVar2 = uVar27;
      if (uVar3 >> 3 != 0) {
        lVar23 = -(uVar3 >> 3);
        do {
          uVar25 = *puVar35 * uVar34;
          auVar5._8_8_ = 0;
          auVar5._0_8_ = *puVar35;
          auVar14._8_8_ = 0;
          auVar14._0_8_ = uVar34;
          uVar24 = *puVar30 + uVar25;
          uVar32 = SUB168(auVar5 * auVar14,8) + (ulong)CARRY8(*puVar30,uVar25) +
                   (ulong)CARRY8(uVar24,uVar31);
          *puVar30 = uVar24 + uVar31;
          uVar24 = puVar30[1];
          uVar25 = puVar35[1] * uVar34;
          auVar6._8_8_ = 0;
          auVar6._0_8_ = puVar35[1];
          auVar15._8_8_ = 0;
          auVar15._0_8_ = uVar34;
          uVar31 = uVar24 + uVar25;
          uVar33 = SUB168(auVar6 * auVar15,8) + (ulong)CARRY8(uVar24,uVar25) +
                   (ulong)CARRY8(uVar31,uVar32);
          puVar30[1] = uVar31 + uVar32;
          uVar24 = puVar30[2];
          uVar25 = puVar35[2] * uVar34;
          auVar7._8_8_ = 0;
          auVar7._0_8_ = puVar35[2];
          auVar16._8_8_ = 0;
          auVar16._0_8_ = uVar34;
          uVar31 = uVar24 + uVar25;
          uVar32 = SUB168(auVar7 * auVar16,8) + (ulong)CARRY8(uVar24,uVar25) +
                   (ulong)CARRY8(uVar31,uVar33);
          puVar30[2] = uVar31 + uVar33;
          uVar24 = puVar30[3];
          uVar25 = puVar35[3] * uVar34;
          auVar8._8_8_ = 0;
          auVar8._0_8_ = puVar35[3];
          auVar17._8_8_ = 0;
          auVar17._0_8_ = uVar34;
          uVar31 = uVar24 + uVar25;
          uVar33 = SUB168(auVar8 * auVar17,8) + (ulong)CARRY8(uVar24,uVar25) +
                   (ulong)CARRY8(uVar31,uVar32);
          puVar30[3] = uVar31 + uVar32;
          uVar24 = puVar30[4];
          uVar25 = puVar35[4] * uVar34;
          auVar9._8_8_ = 0;
          auVar9._0_8_ = puVar35[4];
          auVar18._8_8_ = 0;
          auVar18._0_8_ = uVar34;
          uVar31 = uVar24 + uVar25;
          uVar32 = SUB168(auVar9 * auVar18,8) + (ulong)CARRY8(uVar24,uVar25) +
                   (ulong)CARRY8(uVar31,uVar33);
          puVar30[4] = uVar31 + uVar33;
          uVar24 = puVar30[5];
          uVar25 = puVar35[5] * uVar34;
          auVar10._8_8_ = 0;
          auVar10._0_8_ = puVar35[5];
          auVar19._8_8_ = 0;
          auVar19._0_8_ = uVar34;
          uVar31 = uVar24 + uVar25;
          uVar33 = SUB168(auVar10 * auVar19,8) + (ulong)CARRY8(uVar24,uVar25) +
                   (ulong)CARRY8(uVar31,uVar32);
          puVar30[5] = uVar31 + uVar32;
          puVar36 = puVar35 + 7;
          uVar24 = puVar30[6];
          uVar25 = puVar35[6] * uVar34;
          auVar11._8_8_ = 0;
          auVar11._0_8_ = puVar35[6];
          auVar20._8_8_ = 0;
          auVar20._0_8_ = uVar34;
          uVar31 = uVar24 + uVar25;
          uVar32 = SUB168(auVar11 * auVar20,8) + (ulong)CARRY8(uVar24,uVar25) +
                   (ulong)CARRY8(uVar31,uVar33);
          puVar29 = puVar30 + 7;
          puVar30[6] = uVar31 + uVar33;
          puVar35 = puVar35 + 8;
          uVar31 = *puVar29;
          uVar25 = *puVar36 * uVar34;
          auVar12._8_8_ = 0;
          auVar12._0_8_ = *puVar36;
          auVar21._8_8_ = 0;
          auVar21._0_8_ = uVar34;
          uVar24 = uVar31 + uVar25;
          uVar31 = SUB168(auVar12 * auVar21,8) + (ulong)CARRY8(uVar31,uVar25) +
                   (ulong)CARRY8(uVar24,uVar32);
          puVar30 = puVar30 + 8;
          *puVar29 = uVar24 + uVar32;
          lVar23 = lVar23 + 1;
        } while (lVar23 != 0);
      }
      while (uVar2 != 0) {
        uVar25 = *puVar35 * uVar34;
        auVar13._8_8_ = 0;
        auVar13._0_8_ = *puVar35;
        auVar22._8_8_ = 0;
        auVar22._0_8_ = uVar34;
        uVar2 = *puVar30 + uVar25;
        uVar24 = uVar2 + uVar31;
        uVar31 = SUB168(auVar13 * auVar22,8) + (ulong)CARRY8(*puVar30,uVar25) +
                 (ulong)CARRY8(uVar2,uVar31);
        *puVar30 = uVar24;
        uVar1 = uVar1 + 1;
        puVar30 = puVar30 + 1;
        puVar35 = puVar35 + 1;
        uVar2 = uVar1;
      }
      lVar23 = uVar28 - uVar4;
      if (param_3 + 1 != uVar3) {
        do {
          uVar1 = *puVar30 + uVar31;
          uVar31 = (ulong)CARRY8(*puVar30,uVar31);
          lVar23 = lVar23 + 1;
          *puVar30 = uVar1;
          puVar30 = puVar30 + 1;
        } while (lVar23 != 0);
      }
      lVar26 = lVar26 + 1;
    } while (lVar26 != param_5);
  }
  return;
}

