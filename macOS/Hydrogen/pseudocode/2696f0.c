
void FUN_002696f0(undefined8 *param_1,ulong param_2,undefined8 *param_3,ulong param_4)

{
  long lVar1;
  undefined8 *puVar2;
  ulong uVar3;
  ulong uVar4;
  uint uVar5;
  code *pcVar6;
  bool bVar7;
  int iVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 uVar11;
  undefined8 *puVar12;
  ulong uVar13;
  long lVar14;
  ulong uVar15;
  undefined8 *puVar16;
  long lVar17;
  undefined8 *puVar18;
  undefined8 *puVar19;
  undefined8 *puVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  long lStack0000000000000040;
  undefined8 *puStack0000000000000048;
  
  if (param_2 < 2) {
    return;
  }
  puStack0000000000000048 = param_1;
  if (param_2 + 0x10 <= param_4) {
    uVar13 = param_2 >> 1;
    puVar16 = param_1 + uVar13 * 10;
    puVar18 = param_3 + uVar13 * 10;
    if (param_2 < 8) {
      uVar21 = param_1[4];
      uVar22 = param_1[7];
      uVar11 = param_1[6];
      param_3[5] = param_1[5];
      param_3[4] = uVar21;
      param_3[7] = uVar22;
      param_3[6] = uVar11;
      uVar21 = param_1[8];
      param_3[9] = param_1[9];
      param_3[8] = uVar21;
      uVar22 = *param_1;
      uVar11 = param_1[3];
      uVar21 = param_1[2];
      param_3[1] = param_1[1];
      *param_3 = uVar22;
      param_3[3] = uVar11;
      param_3[2] = uVar21;
      uVar21 = puVar16[6];
      uVar22 = puVar16[9];
      uVar11 = puVar16[8];
      puVar18[7] = puVar16[7];
      puVar18[6] = uVar21;
      puVar18[9] = uVar22;
      puVar18[8] = uVar11;
      uVar21 = puVar16[2];
      uVar22 = puVar16[5];
      uVar11 = puVar16[4];
      puVar18[3] = puVar16[3];
      puVar18[2] = uVar21;
      puVar18[5] = uVar22;
      puVar18[4] = uVar11;
      uVar21 = *puVar16;
      uVar9 = 1;
      puVar18[1] = puVar16[1];
      *puVar18 = uVar21;
    }
    else {
      func_0x002693f4(param_1,param_3);
      func_0x002693f4(puVar16,puVar18);
      uVar9 = 4;
    }
    if (uVar9 < uVar13) {
      lVar14 = uVar9 * 0x50;
      uVar4 = uVar9 + 1;
      uVar15 = uVar9;
      do {
        uVar10 = uVar4;
        puVar19 = puStack0000000000000048 + uVar15 * 10;
        puVar20 = param_3 + uVar15 * 10;
        uVar21 = *puVar19;
        uVar22 = puVar19[3];
        uVar11 = puVar19[2];
        puVar20[1] = puVar19[1];
        *puVar20 = uVar21;
        puVar20[3] = uVar22;
        puVar20[2] = uVar11;
        uVar21 = puVar19[4];
        uVar22 = puVar19[7];
        uVar11 = puVar19[6];
        puVar20[5] = puVar19[5];
        puVar20[4] = uVar21;
        puVar20[7] = uVar22;
        puVar20[6] = uVar11;
        uVar21 = puVar19[8];
        puVar20[9] = puVar19[9];
        puVar20[8] = uVar21;
        uVar21 = puVar20[1];
        uVar15 = puVar20[2];
        uVar3 = puVar20[-8];
        uVar4 = uVar15;
        if (uVar3 <= uVar15) {
          uVar4 = uVar3;
        }
        iVar8 = _memcmp(uVar21,puVar20[-9],uVar4);
        lVar17 = uVar15 - uVar3;
        if (iVar8 != 0) {
          lVar17 = (long)iVar8;
        }
        if (lVar17 < 0) {
          uVar11 = *puVar20;
          lVar17 = lVar14;
          do {
            puVar20 = (undefined8 *)((long)param_3 + lVar17);
            puVar20[5] = puVar20[-5];
            puVar20[4] = puVar20[-6];
            puVar20[7] = puVar20[-3];
            puVar20[6] = puVar20[-4];
            puVar20[9] = puVar20[-1];
            puVar20[8] = puVar20[-2];
            puVar20[1] = puVar20[-9];
            *puVar20 = puVar20[-10];
            puVar20[3] = puVar20[-7];
            puVar20[2] = puVar20[-8];
            lVar17 = lVar17 + -0x50;
            if (lVar17 == 0) {
              puVar12 = param_3;
              goto LAB_002697d4;
            }
            uVar3 = puVar20[-0x12];
            uVar4 = uVar15;
            if (uVar3 <= uVar15) {
              uVar4 = uVar3;
            }
            iVar8 = _memcmp(uVar21,puVar20[-0x13],uVar4);
            lVar1 = uVar15 - uVar3;
            if (iVar8 != 0) {
              lVar1 = (long)iVar8;
            }
          } while (lVar1 < 0);
          puVar12 = (undefined8 *)((long)param_3 + lVar17);
LAB_002697d4:
          *puVar12 = uVar11;
          puVar20[-9] = uVar21;
          puVar20[-8] = uVar15;
          uVar21 = puVar19[3];
          puVar20[-6] = puVar19[4];
          puVar20[-7] = uVar21;
          uVar21 = puVar19[5];
          puVar20[-4] = puVar19[6];
          puVar20[-5] = uVar21;
          uVar21 = puVar19[7];
          puVar20[-2] = puVar19[8];
          puVar20[-3] = uVar21;
          puVar20[-1] = puVar19[9];
        }
        lVar14 = lVar14 + 0x50;
        if (uVar13 <= uVar10) break;
        uVar4 = uVar10 + 1;
        uVar15 = uVar10;
      } while( true );
    }
    if (uVar9 < param_2 - uVar13) {
      lStack0000000000000040 = 0x50;
      uVar4 = uVar9 + 1;
      puVar19 = puVar18;
      uVar15 = uVar9;
      do {
        uVar10 = uVar4;
        puVar20 = puVar16 + uVar15 * 10;
        puVar12 = puVar18 + uVar15 * 10;
        uVar21 = *puVar20;
        uVar22 = puVar20[3];
        uVar11 = puVar20[2];
        puVar12[1] = puVar20[1];
        *puVar12 = uVar21;
        puVar12[3] = uVar22;
        puVar12[2] = uVar11;
        uVar21 = puVar20[4];
        uVar22 = puVar20[7];
        uVar11 = puVar20[6];
        puVar12[5] = puVar20[5];
        puVar12[4] = uVar21;
        puVar12[7] = uVar22;
        puVar12[6] = uVar11;
        uVar21 = puVar20[8];
        puVar12[9] = puVar20[9];
        puVar12[8] = uVar21;
        uVar21 = puVar12[1];
        uVar15 = puVar12[2];
        uVar3 = puVar12[-8];
        uVar4 = uVar15;
        if (uVar3 <= uVar15) {
          uVar4 = uVar3;
        }
        iVar8 = _memcmp(uVar21,puVar12[-9],uVar4);
        lVar14 = uVar15 - uVar3;
        if (iVar8 != 0) {
          lVar14 = (long)iVar8;
        }
        if (lVar14 < 0) {
          uVar11 = *puVar12;
          puVar12 = puVar19;
          lVar14 = lStack0000000000000040;
          do {
            puVar2 = puVar12 + uVar9 * 10;
            puVar2[5] = puVar2[-5];
            puVar2[4] = puVar2[-6];
            puVar2[7] = puVar2[-3];
            puVar2[6] = puVar2[-4];
            puVar2[9] = puVar2[-1];
            puVar2[8] = puVar2[-2];
            puVar2[1] = puVar2[-9];
            *puVar2 = puVar2[-10];
            puVar2[3] = puVar2[-7];
            puVar2[2] = puVar2[-8];
            if (uVar9 * 0x50 == lVar14) {
              puVar12 = puVar18;
              goto code_r0x002698fc;
            }
            uVar3 = puVar2[-0x12];
            uVar4 = uVar15;
            if (uVar3 <= uVar15) {
              uVar4 = uVar3;
            }
            iVar8 = _memcmp(uVar21,puVar2[-0x13],uVar4);
            lVar17 = uVar15 - uVar3;
            if (iVar8 != 0) {
              lVar17 = (long)iVar8;
            }
            lVar14 = lVar14 + 0x50;
            puVar12 = puVar12 + -10;
          } while (lVar17 < 0);
          puVar12 = puVar12 + uVar9 * 10;
code_r0x002698fc:
          *puVar12 = uVar11;
          puVar2[-9] = uVar21;
          puVar2[-8] = uVar15;
          uVar21 = puVar20[3];
          puVar2[-6] = puVar20[4];
          puVar2[-7] = uVar21;
          uVar21 = puVar20[5];
          puVar2[-4] = puVar20[6];
          puVar2[-5] = uVar21;
          uVar21 = puVar20[7];
          puVar2[-2] = puVar20[8];
          puVar2[-3] = uVar21;
          puVar2[-1] = puVar20[9];
        }
        lStack0000000000000040 = lStack0000000000000040 + -0x50;
        puVar19 = puVar19 + 10;
        if (param_2 - uVar13 <= uVar10) break;
        uVar4 = uVar10 + 1;
        uVar15 = uVar10;
      } while( true );
    }
    lVar14 = param_2 * 0x50;
    puVar16 = param_3 + param_2 * 10 + -10;
    puVar20 = puVar18 + -10;
    puVar19 = puStack0000000000000048;
    do {
      puVar12 = puVar19;
      lVar14 = lVar14 + -0x50;
      puVar19 = (undefined8 *)((long)puStack0000000000000048 + lVar14);
      uVar4 = puVar18[2];
      uVar15 = param_3[2];
      uVar9 = uVar4;
      if (uVar15 <= uVar4) {
        uVar9 = uVar15;
      }
      iVar8 = _memcmp(puVar18[1],param_3[1],uVar9);
      lVar17 = uVar4 - uVar15;
      if (iVar8 != 0) {
        lVar17 = (long)iVar8;
      }
      puVar2 = param_3;
      if (lVar17 < 0) {
        puVar2 = puVar18;
      }
      uVar21 = puVar2[4];
      uVar22 = puVar2[7];
      uVar11 = puVar2[6];
      puVar12[5] = puVar2[5];
      puVar12[4] = uVar21;
      puVar12[7] = uVar22;
      puVar12[6] = uVar11;
      uVar21 = puVar2[8];
      puVar12[9] = puVar2[9];
      puVar12[8] = uVar21;
      uVar22 = *puVar2;
      uVar11 = puVar2[3];
      uVar21 = puVar2[2];
      puVar12[1] = puVar2[1];
      *puVar12 = uVar22;
      puVar12[3] = uVar11;
      puVar12[2] = uVar21;
      puVar18 = puVar18 + (lVar17 >> 0x3f) * -10;
      param_3 = param_3 + (ulong)((uint)((ulong)lVar17 >> 0x3f) ^ 1) * 10;
      uVar4 = puVar16[2];
      uVar15 = puVar20[2];
      uVar9 = uVar4;
      if (uVar15 <= uVar4) {
        uVar9 = uVar15;
      }
      iVar8 = _memcmp(puVar16[1],puVar20[1],uVar9);
      lVar17 = uVar4 - uVar15;
      if (iVar8 != 0) {
        lVar17 = (long)iVar8;
      }
      puVar2 = puVar16;
      if (lVar17 < 0) {
        puVar2 = puVar20;
      }
      uVar21 = puVar2[4];
      uVar22 = puVar2[7];
      uVar11 = puVar2[6];
      puVar19[5] = puVar2[5];
      puVar19[4] = uVar21;
      puVar19[7] = uVar22;
      puVar19[6] = uVar11;
      uVar21 = puVar2[8];
      puVar19[9] = puVar2[9];
      puVar19[8] = uVar21;
      uVar22 = *puVar2;
      uVar11 = puVar2[3];
      uVar21 = puVar2[2];
      puVar19[1] = puVar2[1];
      *puVar19 = uVar22;
      puVar19[3] = uVar11;
      puVar19[2] = uVar21;
      uVar5 = (uint)(lVar17 >> 0x3f);
      puVar16 = puVar16 + (long)(int)~uVar5 * 10;
      puVar20 = puVar20 + (long)(int)uVar5 * 10;
      uVar13 = uVar13 - 1;
      puVar19 = puVar12 + 10;
    } while (uVar13 != 0);
    if ((param_2 & 1) != 0) {
      bVar7 = puVar20 + 10 <= param_3;
      puVar19 = param_3;
      if (bVar7) {
        puVar19 = puVar18;
      }
      uVar21 = puVar19[4];
      uVar22 = puVar19[7];
      uVar11 = puVar19[6];
      puVar12[0xf] = puVar19[5];
      puVar12[0xe] = uVar21;
      puVar12[0x11] = uVar22;
      puVar12[0x10] = uVar11;
      uVar21 = puVar19[8];
      puVar12[0x13] = puVar19[9];
      puVar12[0x12] = uVar21;
      uVar22 = *puVar19;
      uVar11 = puVar19[3];
      uVar21 = puVar19[2];
      puVar12[0xb] = puVar19[1];
      puVar12[10] = uVar22;
      puVar12[0xd] = uVar11;
      puVar12[0xc] = uVar21;
      param_3 = param_3 + (ulong)!bVar7 * 10;
      puVar18 = puVar18 + (ulong)bVar7 * 10;
    }
    if (param_3 == puVar20 + 10 && puVar18 == puVar16 + 10) {
      return;
    }
    func_0x007a286c();
  }
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x269b54);
  (*pcVar6)();
}

