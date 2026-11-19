/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b84364
 */

void mbedtls_mpi_core_montmul
               (long *param_1,long param_2,ulong *param_3,ulong param_4,ulong *param_5,ulong param_6
               ,long param_7,ulong *param_8)

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
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  ulong uVar38;
  ulong *puVar39;
  ulong uVar40;
  ulong uVar41;
  ulong uVar42;
  ulong uVar43;
  ulong uVar44;
  ulong uVar45;
  ulong uVar46;
  ulong uVar47;
  ulong uVar48;
  long *plVar49;
  ulong uVar50;
  ulong uVar51;
  long lVar52;
  ulong uVar53;
  ulong uVar54;
  ulong *puVar55;
  ulong *puVar56;
  ulong *puVar57;
  ulong *puVar58;
  ulong uVar59;
  
  memset(param_8,0,param_6 << 4 | 8);
  if (param_6 == 0) {
    uVar46 = *param_8;
    uVar47 = 0;
  }
  else {
    uVar47 = param_6 + 2;
    uVar46 = uVar47;
    if (param_6 < 0xfffffffffffffffe) {
      uVar46 = param_6;
    }
    uVar38 = -param_6 - 3;
    uVar50 = uVar47;
    if (param_4 <= uVar47) {
      uVar50 = param_4;
    }
    uVar1 = uVar38;
    if (uVar38 < ~param_4) {
      uVar1 = ~param_4;
    }
    uVar48 = uVar46 & 7;
    uVar51 = uVar38;
    if (uVar38 < ~param_6) {
      uVar51 = ~param_6;
    }
    uVar45 = 0;
    puVar39 = param_8;
    do {
      uVar54 = *(ulong *)(param_2 + uVar45 * 8);
      uVar59 = *puVar39;
      uVar53 = *param_3;
      uVar40 = 0;
      puVar56 = puVar39;
      puVar58 = param_3;
      if (uVar50 >> 3 != 0) {
        lVar52 = -(uVar50 >> 3);
        do {
          uVar42 = *puVar58 * uVar54;
          auVar2._8_8_ = 0;
          auVar2._0_8_ = *puVar58;
          auVar20._8_8_ = 0;
          auVar20._0_8_ = uVar54;
          uVar41 = *puVar56 + uVar42;
          uVar42 = SUB168(auVar2 * auVar20,8) + (ulong)CARRY8(*puVar56,uVar42) +
                   (ulong)CARRY8(uVar41,uVar40);
          *puVar56 = uVar41 + uVar40;
          uVar41 = puVar56[1];
          uVar43 = puVar58[1] * uVar54;
          auVar3._8_8_ = 0;
          auVar3._0_8_ = puVar58[1];
          auVar21._8_8_ = 0;
          auVar21._0_8_ = uVar54;
          uVar40 = uVar41 + uVar43;
          uVar41 = SUB168(auVar3 * auVar21,8) + (ulong)CARRY8(uVar41,uVar43) +
                   (ulong)CARRY8(uVar40,uVar42);
          puVar56[1] = uVar40 + uVar42;
          uVar42 = puVar56[2];
          uVar43 = puVar58[2] * uVar54;
          auVar4._8_8_ = 0;
          auVar4._0_8_ = puVar58[2];
          auVar22._8_8_ = 0;
          auVar22._0_8_ = uVar54;
          uVar40 = uVar42 + uVar43;
          uVar42 = SUB168(auVar4 * auVar22,8) + (ulong)CARRY8(uVar42,uVar43) +
                   (ulong)CARRY8(uVar40,uVar41);
          puVar56[2] = uVar40 + uVar41;
          uVar41 = puVar56[3];
          uVar43 = puVar58[3] * uVar54;
          auVar5._8_8_ = 0;
          auVar5._0_8_ = puVar58[3];
          auVar23._8_8_ = 0;
          auVar23._0_8_ = uVar54;
          uVar40 = uVar41 + uVar43;
          uVar41 = SUB168(auVar5 * auVar23,8) + (ulong)CARRY8(uVar41,uVar43) +
                   (ulong)CARRY8(uVar40,uVar42);
          puVar56[3] = uVar40 + uVar42;
          uVar42 = puVar56[4];
          uVar43 = puVar58[4] * uVar54;
          auVar6._8_8_ = 0;
          auVar6._0_8_ = puVar58[4];
          auVar24._8_8_ = 0;
          auVar24._0_8_ = uVar54;
          uVar40 = uVar42 + uVar43;
          uVar42 = SUB168(auVar6 * auVar24,8) + (ulong)CARRY8(uVar42,uVar43) +
                   (ulong)CARRY8(uVar40,uVar41);
          puVar56[4] = uVar40 + uVar41;
          uVar41 = puVar56[5];
          uVar43 = puVar58[5] * uVar54;
          auVar7._8_8_ = 0;
          auVar7._0_8_ = puVar58[5];
          auVar25._8_8_ = 0;
          auVar25._0_8_ = uVar54;
          uVar40 = uVar41 + uVar43;
          uVar41 = SUB168(auVar7 * auVar25,8) + (ulong)CARRY8(uVar41,uVar43) +
                   (ulong)CARRY8(uVar40,uVar42);
          puVar56[5] = uVar40 + uVar42;
          puVar57 = puVar58 + 7;
          uVar42 = puVar56[6];
          uVar43 = puVar58[6] * uVar54;
          auVar8._8_8_ = 0;
          auVar8._0_8_ = puVar58[6];
          auVar26._8_8_ = 0;
          auVar26._0_8_ = uVar54;
          uVar40 = uVar42 + uVar43;
          uVar42 = SUB168(auVar8 * auVar26,8) + (ulong)CARRY8(uVar42,uVar43) +
                   (ulong)CARRY8(uVar40,uVar41);
          puVar55 = puVar56 + 7;
          puVar56[6] = uVar40 + uVar41;
          puVar58 = puVar58 + 8;
          uVar40 = *puVar55;
          uVar43 = *puVar57 * uVar54;
          auVar9._8_8_ = 0;
          auVar9._0_8_ = *puVar57;
          auVar27._8_8_ = 0;
          auVar27._0_8_ = uVar54;
          uVar41 = uVar40 + uVar43;
          uVar40 = SUB168(auVar9 * auVar27,8) + (ulong)CARRY8(uVar40,uVar43) +
                   (ulong)CARRY8(uVar41,uVar42);
          puVar56 = puVar56 + 8;
          *puVar55 = uVar41 + uVar42;
          lVar52 = lVar52 + 1;
        } while (lVar52 != 0);
      }
      uVar41 = -(uVar50 & 7);
      uVar42 = uVar50 & 7;
      while (uVar42 != 0) {
        uVar44 = *puVar58 * uVar54;
        auVar10._8_8_ = 0;
        auVar10._0_8_ = *puVar58;
        auVar28._8_8_ = 0;
        auVar28._0_8_ = uVar54;
        uVar42 = *puVar56 + uVar44;
        uVar43 = uVar42 + uVar40;
        uVar40 = SUB168(auVar10 * auVar28,8) + (ulong)CARRY8(*puVar56,uVar44) +
                 (ulong)CARRY8(uVar42,uVar40);
        *puVar56 = uVar43;
        uVar41 = uVar41 + 1;
        puVar56 = puVar56 + 1;
        puVar58 = puVar58 + 1;
        uVar42 = uVar41;
      }
      uVar53 = (uVar59 + uVar53 * uVar54) * param_7;
      lVar52 = uVar38 - uVar1;
      if (uVar47 != uVar50) {
        do {
          uVar54 = *puVar56 + uVar40;
          uVar40 = (ulong)CARRY8(*puVar56,uVar40);
          lVar52 = lVar52 + 1;
          *puVar56 = uVar54;
          puVar56 = puVar56 + 1;
        } while (lVar52 != 0);
      }
      uVar54 = 0;
      uVar40 = -uVar48;
      puVar56 = puVar39;
      puVar58 = param_5;
      uVar59 = uVar48;
      if (uVar46 >> 3 != 0) {
        lVar52 = -(uVar46 >> 3);
        do {
          uVar42 = *puVar58 * uVar53;
          auVar11._8_8_ = 0;
          auVar11._0_8_ = *puVar58;
          auVar29._8_8_ = 0;
          auVar29._0_8_ = uVar53;
          uVar41 = *puVar56 + uVar42;
          uVar42 = SUB168(auVar11 * auVar29,8) + (ulong)CARRY8(*puVar56,uVar42) +
                   (ulong)CARRY8(uVar41,uVar54);
          *puVar56 = uVar41 + uVar54;
          uVar41 = puVar56[1];
          uVar43 = puVar58[1] * uVar53;
          auVar12._8_8_ = 0;
          auVar12._0_8_ = puVar58[1];
          auVar30._8_8_ = 0;
          auVar30._0_8_ = uVar53;
          uVar54 = uVar41 + uVar43;
          uVar41 = SUB168(auVar12 * auVar30,8) + (ulong)CARRY8(uVar41,uVar43) +
                   (ulong)CARRY8(uVar54,uVar42);
          puVar56[1] = uVar54 + uVar42;
          uVar42 = puVar56[2];
          uVar43 = puVar58[2] * uVar53;
          auVar13._8_8_ = 0;
          auVar13._0_8_ = puVar58[2];
          auVar31._8_8_ = 0;
          auVar31._0_8_ = uVar53;
          uVar54 = uVar42 + uVar43;
          uVar42 = SUB168(auVar13 * auVar31,8) + (ulong)CARRY8(uVar42,uVar43) +
                   (ulong)CARRY8(uVar54,uVar41);
          puVar56[2] = uVar54 + uVar41;
          uVar41 = puVar56[3];
          uVar43 = puVar58[3] * uVar53;
          auVar14._8_8_ = 0;
          auVar14._0_8_ = puVar58[3];
          auVar32._8_8_ = 0;
          auVar32._0_8_ = uVar53;
          uVar54 = uVar41 + uVar43;
          uVar41 = SUB168(auVar14 * auVar32,8) + (ulong)CARRY8(uVar41,uVar43) +
                   (ulong)CARRY8(uVar54,uVar42);
          puVar56[3] = uVar54 + uVar42;
          uVar42 = puVar56[4];
          uVar43 = puVar58[4] * uVar53;
          auVar15._8_8_ = 0;
          auVar15._0_8_ = puVar58[4];
          auVar33._8_8_ = 0;
          auVar33._0_8_ = uVar53;
          uVar54 = uVar42 + uVar43;
          uVar42 = SUB168(auVar15 * auVar33,8) + (ulong)CARRY8(uVar42,uVar43) +
                   (ulong)CARRY8(uVar54,uVar41);
          puVar56[4] = uVar54 + uVar41;
          uVar41 = puVar56[5];
          uVar43 = puVar58[5] * uVar53;
          auVar16._8_8_ = 0;
          auVar16._0_8_ = puVar58[5];
          auVar34._8_8_ = 0;
          auVar34._0_8_ = uVar53;
          uVar54 = uVar41 + uVar43;
          uVar41 = SUB168(auVar16 * auVar34,8) + (ulong)CARRY8(uVar41,uVar43) +
                   (ulong)CARRY8(uVar54,uVar42);
          puVar56[5] = uVar54 + uVar42;
          puVar57 = puVar58 + 7;
          uVar42 = puVar56[6];
          uVar43 = puVar58[6] * uVar53;
          auVar17._8_8_ = 0;
          auVar17._0_8_ = puVar58[6];
          auVar35._8_8_ = 0;
          auVar35._0_8_ = uVar53;
          uVar54 = uVar42 + uVar43;
          uVar42 = SUB168(auVar17 * auVar35,8) + (ulong)CARRY8(uVar42,uVar43) +
                   (ulong)CARRY8(uVar54,uVar41);
          puVar55 = puVar56 + 7;
          puVar56[6] = uVar54 + uVar41;
          puVar58 = puVar58 + 8;
          uVar54 = *puVar55;
          uVar43 = *puVar57 * uVar53;
          auVar18._8_8_ = 0;
          auVar18._0_8_ = *puVar57;
          auVar36._8_8_ = 0;
          auVar36._0_8_ = uVar53;
          uVar41 = uVar54 + uVar43;
          uVar54 = SUB168(auVar18 * auVar36,8) + (ulong)CARRY8(uVar54,uVar43) +
                   (ulong)CARRY8(uVar41,uVar42);
          puVar56 = puVar56 + 8;
          *puVar55 = uVar41 + uVar42;
          lVar52 = lVar52 + 1;
        } while (lVar52 != 0);
      }
      while (uVar59 != 0) {
        uVar42 = *puVar58 * uVar53;
        auVar19._8_8_ = 0;
        auVar19._0_8_ = *puVar58;
        auVar37._8_8_ = 0;
        auVar37._0_8_ = uVar53;
        uVar59 = *puVar56 + uVar42;
        uVar41 = uVar59 + uVar54;
        uVar54 = SUB168(auVar19 * auVar37,8) + (ulong)CARRY8(*puVar56,uVar42) +
                 (ulong)CARRY8(uVar59,uVar54);
        *puVar56 = uVar41;
        uVar40 = uVar40 + 1;
        puVar56 = puVar56 + 1;
        puVar58 = puVar58 + 1;
        uVar59 = uVar40;
      }
      lVar52 = uVar38 - uVar51;
      if (uVar47 != uVar46) {
        do {
          uVar40 = *puVar56 + uVar54;
          uVar54 = (ulong)CARRY8(*puVar56,uVar54);
          lVar52 = lVar52 + 1;
          *puVar56 = uVar40;
          puVar56 = puVar56 + 1;
        } while (lVar52 != 0);
      }
      uVar45 = uVar45 + 1;
      puVar39 = puVar39 + 1;
    } while (uVar45 != param_6);
    uVar47 = 0;
    param_8 = param_8 + param_6;
    uVar46 = param_8[param_6];
    if (param_6 != 0) {
      puVar39 = param_8;
      plVar49 = param_1;
      uVar50 = param_6;
      do {
        uVar51 = *puVar39;
        uVar1 = uVar51 - uVar47;
        uVar38 = 2;
        if (uVar51 >= uVar47) {
          uVar38 = 1;
        }
        uVar47 = (ulong)(uVar51 < uVar47);
        if (uVar1 < *param_5) {
          uVar47 = uVar38;
        }
        uVar50 = uVar50 - 1;
        *plVar49 = uVar1 - *param_5;
        puVar39 = puVar39 + 1;
        plVar49 = plVar49 + 1;
        param_5 = param_5 + 1;
      } while (uVar50 != 0);
    }
  }
  mbedtls_ct_memcpy_if
            ((long)(-(uVar47 ^ uVar46) | uVar47 ^ uVar46) >> 0x3f,param_1,param_8,0,param_6 << 3);
  return;
}

