/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8498c
 */

undefined8
mbedtls_mpi_core_random
          (ulong *param_1,ulong param_2,long param_3,ulong param_4,code *param_5,undefined8 param_6)

{
  ulong uVar1;
  bool bVar2;
  bool bVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  ulong *puVar7;
  ulong uVar8;
  long lVar9;
  ulong uVar10;
  ulong *puVar11;
  undefined1 (*pauVar12) [16];
  ulong uVar13;
  int iVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  long lVar18;
  size_t __n;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  
  lVar5 = (long)(int)param_4 * 0x40 + 0x40;
  lVar9 = (long)(int)param_4;
  do {
    if (lVar9 < 1) {
      lVar5 = 0;
      goto LAB_00b84a00;
    }
    lVar18 = *(long *)(param_3 + lVar9 * 8 + -8);
    lVar5 = lVar5 + -0x40;
    lVar9 = lVar9 + -1;
  } while (lVar18 == 0);
  lVar5 = lVar5 - LZCOUNT(lVar18);
LAB_00b84a00:
  uVar1 = lVar5 + 7;
  uVar24 = param_4 & 0xfffffffffffffffc;
  uVar6 = (uVar1 & 0xfffffffffffffff8) - lVar5;
  uVar20 = uVar1 >> 6;
  iVar14 = 0x1e;
  if (uVar1 < 0x28) {
    iVar14 = 0xfa;
  }
  uVar15 = uVar6 >> 6;
  if ((uVar1 & 0x38) != 0) {
    uVar20 = uVar20 + 1;
  }
  uVar25 = param_4 - uVar15;
  bVar2 = (uVar6 & 0x3f) == 0;
  uVar6 = uVar6 & 0x3f;
  uVar26 = 0x40 - uVar6;
  __n = uVar20 * 8 - (uVar1 >> 3);
  uVar10 = uVar25 & 0xfffffffffffffffc;
  do {
    if (param_4 < uVar20) {
      return 0xfffffffc;
    }
    memset(param_1,0,__n);
    memset(param_1 + uVar20,0,(param_4 - uVar20) * 8);
    uVar4 = (*param_5)(param_6,(long)param_1 + __n,uVar1 >> 3);
    if ((int)uVar4 != 0) {
      return uVar4;
    }
    if (uVar20 != 0) {
      puVar7 = param_1 + uVar20 + -2;
      puVar11 = param_1;
      do {
        uVar13 = (puVar7[1] & 0xff00ff00ff00ff00) >> 8 | (puVar7[1] & 0xff00ff00ff00ff) << 8;
        uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
        uVar16 = (*puVar11 & 0xff00ff00ff00ff00) >> 8 | (*puVar11 & 0xff00ff00ff00ff) << 8;
        uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
        *puVar11 = uVar13 >> 0x20 | uVar13 << 0x20;
        puVar7[1] = uVar16 >> 0x20 | uVar16 << 0x20;
        bVar3 = puVar11 + 1 <= puVar7;
        puVar7 = puVar7 + -1;
        puVar11 = puVar11 + 1;
      } while (bVar3);
    }
    if (uVar15 <= param_4 && (uVar15 != param_4 || bVar2)) {
      if (uVar15 != 0) {
        if (uVar25 == 0) {
          uVar13 = 0;
          if (param_4 == 0) goto LAB_00b84c54;
        }
        else {
          uVar13 = 0;
          if (uVar25 < 4 || param_1 < param_1 + param_4 && param_1 + uVar15 < param_1 + uVar25) {
LAB_00b84c0c:
            lVar5 = uVar25 - uVar13;
            puVar7 = param_1 + uVar15 + uVar13;
            puVar11 = param_1 + uVar13;
            do {
              lVar5 = lVar5 + -1;
              *puVar11 = *puVar7;
              puVar7 = puVar7 + 1;
              puVar11 = puVar11 + 1;
            } while (lVar5 != 0);
          }
          else {
            uVar13 = uVar10;
            puVar7 = param_1;
            do {
              puVar11 = puVar7 + uVar15;
              uVar16 = *puVar11;
              auVar27 = *(undefined1 (*) [16])(puVar11 + 2);
              uVar13 = uVar13 - 4;
              puVar7[1] = puVar11[1];
              *puVar7 = uVar16;
              puVar7[3] = auVar27._8_8_;
              puVar7[2] = auVar27._0_8_;
              puVar7 = puVar7 + 4;
            } while (uVar13 != 0);
            uVar13 = uVar10;
            if (uVar25 != uVar10) goto LAB_00b84c0c;
          }
          uVar13 = uVar25;
          if (param_4 <= uVar25) goto LAB_00b84c54;
        }
        memset(param_1 + uVar13,0,(param_4 - uVar13) * 8);
      }
LAB_00b84c54:
      if (param_4 != 0 && !bVar2) {
        uVar16 = 0;
        uVar13 = param_4;
        if (3 < param_4) {
          auVar27 = ZEXT816(0);
          uVar13 = uVar24;
          pauVar12 = (undefined1 (*) [16])(param_1 + param_4 + -2);
          do {
            uVar13 = uVar13 - 4;
            auVar28 = NEON_ext(*pauVar12,*pauVar12,8,1);
            auVar30 = NEON_ext(pauVar12[-1],pauVar12[-1],8,1);
            auVar29._8_8_ = uVar26;
            auVar29._0_8_ = uVar26;
            auVar32 = NEON_ushl(auVar28,auVar29,8);
            auVar31._8_8_ = -uVar6;
            auVar31._0_8_ = -uVar6;
            auVar29 = NEON_ushl(auVar28,auVar31,8);
            auVar33 = NEON_ext(auVar27,auVar32,8,1);
            auVar27._8_8_ = uVar26;
            auVar27._0_8_ = uVar26;
            auVar27 = NEON_ushl(auVar30,auVar27,8);
            auVar28._8_8_ = -uVar6;
            auVar28._0_8_ = -uVar6;
            auVar28 = NEON_ushl(auVar30,auVar28,8);
            auVar31 = NEON_ext(auVar32,auVar27,8,1);
            auVar30[0] = auVar29[0] | auVar33[0];
            auVar30[1] = auVar29[1] | auVar33[1];
            auVar30[2] = auVar29[2] | auVar33[2];
            auVar30[3] = auVar29[3] | auVar33[3];
            auVar30[4] = auVar29[4] | auVar33[4];
            auVar30[5] = auVar29[5] | auVar33[5];
            auVar30[6] = auVar29[6] | auVar33[6];
            auVar30[7] = auVar29[7] | auVar33[7];
            auVar30[8] = auVar29[8] | auVar33[8];
            auVar30[9] = auVar29[9] | auVar33[9];
            auVar30[10] = auVar29[10] | auVar33[10];
            auVar30[0xb] = auVar29[0xb] | auVar33[0xb];
            auVar30[0xc] = auVar29[0xc] | auVar33[0xc];
            auVar30[0xd] = auVar29[0xd] | auVar33[0xd];
            auVar30[0xe] = auVar29[0xe] | auVar33[0xe];
            auVar30[0xf] = auVar29[0xf] | auVar33[0xf];
            auVar32[0] = auVar28[0] | auVar31[0];
            auVar32[1] = auVar28[1] | auVar31[1];
            auVar32[2] = auVar28[2] | auVar31[2];
            auVar32[3] = auVar28[3] | auVar31[3];
            auVar32[4] = auVar28[4] | auVar31[4];
            auVar32[5] = auVar28[5] | auVar31[5];
            auVar32[6] = auVar28[6] | auVar31[6];
            auVar32[7] = auVar28[7] | auVar31[7];
            auVar32[8] = auVar28[8] | auVar31[8];
            auVar32[9] = auVar28[9] | auVar31[9];
            auVar32[10] = auVar28[10] | auVar31[10];
            auVar32[0xb] = auVar28[0xb] | auVar31[0xb];
            auVar32[0xc] = auVar28[0xc] | auVar31[0xc];
            auVar32[0xd] = auVar28[0xd] | auVar31[0xd];
            auVar32[0xe] = auVar28[0xe] | auVar31[0xe];
            auVar32[0xf] = auVar28[0xf] | auVar31[0xf];
            auVar29 = NEON_ext(auVar30,auVar30,8,1);
            *(long *)(*pauVar12 + 8) = auVar29._8_8_;
            *(long *)*pauVar12 = auVar29._0_8_;
            auVar29 = NEON_ext(auVar32,auVar32,8,1);
            *(long *)(pauVar12[-1] + 8) = auVar29._8_8_;
            *(long *)pauVar12[-1] = auVar29._0_8_;
            pauVar12 = pauVar12 + -2;
          } while (uVar13 != 0);
          if (uVar24 == param_4) goto joined_r0x00b84d04;
          uVar16 = auVar27._8_8_;
          uVar13 = param_4 - uVar24;
        }
        do {
          uVar13 = uVar13 - 1;
          uVar8 = param_1[uVar13] >> uVar6 | uVar16;
          uVar16 = param_1[uVar13] << (uVar26 & 0x3f);
          param_1[uVar13] = uVar8;
        } while (uVar13 != 0);
      }
    }
    else {
      memset(param_1,0,param_4 * 8);
    }
joined_r0x00b84d04:
    if (iVar14 == 1) {
      return 0xfffffff2;
    }
    iVar14 = iVar14 + -1;
    uVar13 = 0;
    uVar16 = param_2 ^ *param_1;
    if (1 < param_4) {
      lVar5 = param_4 - 1;
      puVar7 = param_1;
      do {
        puVar7 = puVar7 + 1;
        lVar5 = lVar5 + -1;
        uVar13 = (long)(-*puVar7 | *puVar7) >> 0x3f | uVar13;
      } while (lVar5 != 0);
    }
    uVar8 = 0;
    uVar17 = 0;
    if (param_4 != 0) {
      lVar5 = param_4 - 1;
      do {
        uVar21 = *(ulong *)(param_3 + lVar5 * 8);
        uVar22 = param_1[lVar5];
        bVar3 = lVar5 != 0;
        uVar23 = uVar22 ^ uVar21;
        uVar19 = *(ulong *)(param_3 + lVar5 * 8);
        uVar17 = (long)(uVar21 - uVar22 & (uVar23 ^ 0xffffffffffffffff) | uVar23 & uVar22) >> 0x3f |
                 uVar17;
        uVar21 = uVar19 ^ param_1[lVar5];
        uVar19 = (long)(param_1[lVar5] - uVar19 & (uVar21 ^ 0xffffffffffffffff) | uVar21 & uVar19)
                 >> 0x3f;
        uVar8 = uVar19 & (uVar17 ^ 0xffffffffffffffff) | uVar8;
        uVar17 = uVar19 | uVar17;
        lVar5 = lVar5 + -1;
      } while (bVar3);
    }
    if ((uVar8 & (uVar13 | ~((long)(*param_1 - param_2 & (uVar16 ^ 0xffffffffffffffff) |
                                   uVar16 & param_2) >> 0x3f))) != 0) {
      return 0;
    }
  } while( true );
}

