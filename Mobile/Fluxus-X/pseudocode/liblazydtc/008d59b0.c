/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d59b0
 */

int LZ4_compress_forceExtDict(long param_1,ulong *param_2,char *param_3,uint param_4)

{
  long lVar1;
  undefined1 (*pauVar2) [16];
  int iVar3;
  ulong *puVar4;
  ulong *puVar5;
  ulong *puVar6;
  uint uVar7;
  uint uVar8;
  ulong *puVar9;
  uint uVar10;
  long lVar11;
  ulong uVar12;
  ulong *puVar13;
  ulong *puVar14;
  ulong *puVar15;
  ulong uVar16;
  uint uVar17;
  int iVar18;
  uint uVar19;
  uint uVar20;
  undefined1 (*pauVar21) [16];
  ulong *puVar22;
  long lVar23;
  ulong uVar24;
  ulong *puVar25;
  ulong *puVar26;
  ulong *puVar27;
  ulong uVar28;
  ulong uVar29;
  ulong *puVar30;
  ulong *puVar31;
  ulong *puVar32;
  ulong uVar33;
  char *pcVar34;
  int iVar35;
  long lVar36;
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  
  uVar8 = *(uint *)(param_1 + 0x4010);
  if (uVar8 + param_4 < 0x80000001) {
    uVar12 = (ulong)*(uint *)(param_1 + 0x4018);
  }
  else {
    iVar3 = uVar8 - 0x10000;
    uVar10 = *(uint *)(param_1 + 0x4018);
    lVar23 = 0x1000;
    lVar11 = *(long *)(param_1 + 0x4000);
    pauVar21 = (undefined1 (*) [16])(param_1 + 0x10);
    do {
      lVar23 = lVar23 + -8;
      auVar37._4_4_ = iVar3;
      auVar37._0_4_ = iVar3;
      auVar37._8_4_ = iVar3;
      auVar37._12_4_ = iVar3;
      auVar37 = NEON_uqsub(pauVar21[-1],auVar37,4);
      auVar38._4_4_ = iVar3;
      auVar38._0_4_ = iVar3;
      auVar38._8_4_ = iVar3;
      auVar38._12_4_ = iVar3;
      auVar38 = NEON_uqsub(*pauVar21,auVar38,4);
      *(long *)(pauVar21[-1] + 8) = auVar37._8_8_;
      *(long *)pauVar21[-1] = auVar37._0_8_;
      *(long *)(*pauVar21 + 8) = auVar38._8_8_;
      *(long *)*pauVar21 = auVar38._0_8_;
      pauVar21 = pauVar21 + 2;
    } while (lVar23 != 0);
    uVar7 = *(uint *)(param_1 + 0x4018);
    uVar8 = 0x10000;
    *(undefined4 *)(param_1 + 0x4010) = 0x10000;
    if (0xffff < uVar7) {
      uVar7 = 0x10000;
    }
    uVar12 = (ulong)uVar7;
    *(ulong *)(param_1 + 0x4000) = (lVar11 + (ulong)uVar10) - uVar12;
  }
  uVar10 = (uint)uVar12;
  iVar3 = (int)param_3;
  if (((uVar12 & 0xffff0000) == 0) && (uVar10 < uVar8)) {
    if (0x7e000000 < param_4) goto LAB_008d5b50;
    if (param_4 != 0) {
      uVar28 = (ulong)param_4;
      puVar9 = *(ulong **)(param_1 + 0x4000);
      *(uint *)(param_1 + 0x4018) = uVar10 + param_4;
      lVar23 = 0;
      if (puVar9 != (ulong *)0x0) {
        lVar23 = ((long)puVar9 + uVar12) - (ulong)uVar8;
      }
      *(uint *)(param_1 + 0x4010) = uVar8 + param_4;
      *(undefined4 *)(param_1 + 0x4014) = 2;
      puVar6 = param_2;
      if (0xc < param_4) {
        lVar36 = (long)param_2 - (ulong)uVar8;
        puVar31 = (ulong *)((long)param_2 + 1);
        puVar32 = (ulong *)((long)param_2 + (uVar28 - 0xb));
        puVar13 = (ulong *)((long)param_2 + (uVar28 - 5));
        puVar5 = (ulong *)((long)param_2 + (uVar28 - 0xc));
        puVar26 = (ulong *)((long)param_2 + (uVar28 - 8));
        puVar22 = (ulong *)((long)param_2 + (uVar28 - 6));
        lVar11 = 0;
        if (puVar9 != (ulong *)0x0) {
          lVar11 = (long)puVar9 + uVar12;
        }
        uVar7 = uVar8 + 1;
        puVar14 = (ulong *)((long)param_2 + 2);
        *(uint *)(param_1 + (*param_2 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar8;
LAB_008d5c4c:
        uVar24 = *(ulong *)((long)puVar6 + 1);
        uVar16 = 1;
        uVar12 = 0x41;
        do {
          puVar25 = puVar14;
          uVar29 = uVar24 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
          uVar24 = *puVar25;
          uVar19 = *(uint *)(param_1 + uVar29);
          uVar33 = (ulong)uVar19;
          *(uint *)(param_1 + uVar29) = uVar7;
          iVar35 = (int)lVar36;
          if (uVar8 - uVar10 <= uVar19 && uVar7 <= uVar19 + 0xffff) {
            lVar1 = lVar23;
            if (uVar8 <= uVar19) {
              lVar1 = lVar36;
            }
            if (*(int *)(lVar1 + uVar33) == (int)*puVar31) goto code_r0x008d5cc0;
          }
          puVar14 = (ulong *)((long)puVar25 + uVar16);
          uVar16 = uVar12 >> 6;
          uVar12 = uVar12 + 1;
          uVar7 = (int)puVar25 - iVar35;
          puVar31 = puVar25;
          if (puVar32 < puVar14) break;
        } while( true );
      }
LAB_008d6aa4:
      uVar16 = (long)param_2 + (uVar28 - (long)puVar6);
      uVar12 = uVar16 - 0xf;
      if (uVar16 < 0xf) {
        *param_3 = (char)((int)uVar16 << 4);
      }
      else {
        pcVar34 = param_3 + 1;
        *param_3 = -0x10;
        if (0xfe < uVar12) {
          uVar12 = (long)param_2 + (uVar28 - (long)puVar6) + -0x10e;
          uVar28 = uVar12 / 0xff;
          memset(pcVar34,0xff,uVar28 + 1);
          pcVar34 = param_3 + uVar28 + 2;
          uVar12 = uVar12 % 0xff;
        }
        *pcVar34 = (char)uVar12;
        param_3 = pcVar34;
      }
      memcpy(param_3 + 1,puVar6,uVar16);
      iVar3 = ((int)(param_3 + 1) + (int)uVar16) - iVar3;
      goto LAB_008d6b54;
    }
  }
  else {
    if (0x7e000000 < param_4) {
LAB_008d5b50:
      iVar3 = 0;
      goto LAB_008d6b54;
    }
    if (param_4 != 0) {
      uVar28 = (ulong)param_4;
      puVar9 = *(ulong **)(param_1 + 0x4000);
      *(uint *)(param_1 + 0x4018) = uVar10 + param_4;
      *(uint *)(param_1 + 0x4010) = uVar8 + param_4;
      *(undefined4 *)(param_1 + 0x4014) = 2;
      lVar23 = 0;
      if (puVar9 != (ulong *)0x0) {
        lVar23 = ((long)puVar9 + uVar12) - (ulong)uVar8;
      }
      puVar6 = param_2;
      if (0xc < param_4) {
        lVar36 = (long)param_2 - (ulong)uVar8;
        puVar26 = (ulong *)((long)param_2 + (uVar28 - 0xb));
        puVar31 = (ulong *)((long)param_2 + (uVar28 - 5));
        puVar22 = (ulong *)((long)param_2 + (uVar28 - 0xc));
        puVar13 = (ulong *)((long)param_2 + (uVar28 - 8));
        puVar5 = (ulong *)((long)param_2 + (uVar28 - 6));
        lVar11 = 0;
        if (puVar9 != (ulong *)0x0) {
          lVar11 = (long)puVar9 + uVar12;
        }
        puVar32 = (ulong *)((long)param_2 + 1);
        uVar10 = uVar8 + 1;
        puVar14 = (ulong *)((long)param_2 + 2);
        *(uint *)(param_1 + (*param_2 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar8;
LAB_008d63b0:
        uVar24 = *(ulong *)((long)puVar6 + 1);
        uVar16 = 1;
        uVar12 = 0x41;
        do {
          puVar25 = puVar14;
          uVar29 = uVar24 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
          uVar24 = *puVar25;
          uVar7 = *(uint *)(param_1 + uVar29);
          uVar33 = (ulong)uVar7;
          *(uint *)(param_1 + uVar29) = uVar10;
          iVar35 = (int)lVar36;
          if (uVar10 <= uVar7 + 0xffff) {
            lVar1 = lVar23;
            if (uVar8 <= uVar7) {
              lVar1 = lVar36;
            }
            if (*(int *)(lVar1 + uVar33) == (int)*puVar32) goto code_r0x008d6420;
          }
          puVar14 = (ulong *)((long)puVar25 + uVar16);
          uVar16 = uVar12 >> 6;
          uVar12 = uVar12 + 1;
          uVar10 = (int)puVar25 - iVar35;
          puVar32 = puVar25;
          if (puVar26 < puVar14) break;
        } while( true );
      }
LAB_008d5bb4:
      uVar16 = (long)param_2 + (uVar28 - (long)puVar6);
      uVar12 = uVar16 - 0xf;
      if (uVar16 < 0xf) {
        *param_3 = (char)((int)uVar16 << 4);
      }
      else {
        pcVar34 = param_3 + 1;
        *param_3 = -0x10;
        if (0xfe < uVar12) {
          uVar12 = (long)param_2 + (uVar28 - (long)puVar6) + -0x10e;
          uVar28 = uVar12 / 0xff;
          memset(pcVar34,0xff,uVar28 + 1);
          pcVar34 = param_3 + uVar28 + 2;
          uVar12 = uVar12 % 0xff;
        }
        *pcVar34 = (char)uVar12;
        param_3 = pcVar34;
      }
      memcpy(param_3 + 1,puVar6,uVar16);
      iVar3 = ((int)(param_3 + 1) + (int)uVar16) - iVar3;
      goto LAB_008d6b54;
    }
  }
  *param_3 = '\0';
  iVar3 = 1;
LAB_008d6b54:
  *(ulong **)(param_1 + 0x4000) = param_2;
  *(uint *)(param_1 + 0x4018) = param_4;
  return iVar3;
code_r0x008d5cc0:
  puVar14 = (ulong *)(lVar1 + uVar33);
  puVar25 = puVar9;
  if (uVar8 <= uVar19) {
    puVar25 = param_2;
  }
  if ((puVar25 < puVar14) && (*(char *)((long)puVar31 - 1) == *(char *)((long)puVar14 - 1))) {
    puVar4 = (ulong *)((long)puVar31 - 1);
    puVar15 = (ulong *)(lVar1 + uVar33 + -1);
    do {
      puVar14 = puVar15;
      puVar31 = puVar4;
      if ((puVar14 <= puVar25) || (puVar31 <= puVar6)) break;
      puVar4 = (ulong *)((long)puVar31 + -1);
      puVar15 = (ulong *)((long)puVar14 + -1);
    } while (*(char *)((long)puVar31 + -1) == *(char *)((long)puVar14 + -1));
  }
  puVar4 = (ulong *)(param_3 + 1);
  uVar17 = (uint)((long)puVar31 - (long)puVar6);
  uVar20 = uVar17 - 0xf;
  if (uVar17 < 0xf) {
    *param_3 = (char)(uVar17 << 4);
  }
  else {
    *param_3 = -0x10;
    puVar15 = puVar4;
    if (0xfe < uVar20) {
      uVar20 = ((int)puVar31 - (int)puVar6) - 0x10e;
      uVar12 = (ulong)uVar20 / 0xff;
      memset(puVar4,0xff,uVar12 + 1);
      puVar15 = (ulong *)(param_3 + uVar12 + 2);
      uVar20 = uVar20 + (int)uVar12;
    }
    puVar4 = (ulong *)((long)puVar15 + 1);
    *(char *)puVar15 = (char)uVar20;
  }
  uVar16 = (long)puVar31 - (long)puVar6 & 0xffffffff;
  uVar12 = uVar16;
  if (uVar16 < 9) {
    uVar12 = 8;
  }
  puVar15 = (ulong *)((long)puVar4 + uVar16);
  if ((0x18 < uVar16) && (0x1f < (ulong)((long)puVar4 - (long)puVar6))) {
    puVar27 = puVar4 + 2;
    pauVar21 = (undefined1 (*) [16])(puVar6 + 2);
    uVar12 = (uVar12 - 1 >> 3) + 1;
    uVar24 = uVar12 & 0x3ffffffffffffffc;
    uVar16 = uVar24;
    do {
      pauVar2 = pauVar21 + -1;
      uVar29 = *(ulong *)pauVar21[-1];
      auVar37 = *pauVar21;
      uVar16 = uVar16 - 4;
      pauVar21 = pauVar21 + 2;
      puVar27[-1] = *(ulong *)((long)*pauVar2 + 8);
      puVar27[-2] = uVar29;
      puVar27[1] = auVar37._8_8_;
      *puVar27 = auVar37._0_8_;
      puVar27 = puVar27 + 4;
    } while (uVar16 != 0);
    puVar6 = puVar6 + uVar24;
    puVar4 = puVar4 + uVar24;
    if (uVar12 == uVar24) goto LAB_008d5e0c;
  }
  do {
    puVar27 = puVar4 + 1;
    *puVar4 = *puVar6;
    puVar6 = puVar6 + 1;
    puVar4 = puVar27;
  } while (puVar27 < puVar15);
LAB_008d5e0c:
  iVar18 = uVar7 - uVar19;
  do {
    pcVar34 = (char *)((long)puVar15 + 2);
    *(short *)puVar15 = (short)iVar18;
    if (puVar25 == puVar9) {
      puVar6 = (ulong *)((long)puVar14 + 4);
      puVar25 = (ulong *)((long)puVar31 + (lVar11 - (long)puVar14));
      puVar4 = puVar13;
      if (puVar25 <= puVar13) {
        puVar4 = puVar25;
      }
      puVar25 = (ulong *)((long)puVar31 + 4);
      puVar30 = (ulong *)((long)puVar4 - 7);
      puVar27 = puVar25;
      if (puVar25 < puVar30) {
        if (*puVar6 == *puVar25) {
          puVar6 = (ulong *)((long)puVar14 + 0xc);
          puVar27 = (ulong *)((long)puVar31 + 0xc);
          goto joined_r0x008d62d8;
        }
        uVar12 = *puVar25 ^ *puVar6;
        uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
        uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
        uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
        uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
        uVar7 = (uint)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3;
      }
      else {
joined_r0x008d62d8:
        if (puVar27 < puVar30) {
          iVar18 = ((int)puVar27 - (int)puVar31) + -4;
          do {
            if (*puVar6 != *puVar27) {
              uVar12 = *puVar27 ^ *puVar6;
              uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
              uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
              uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
              uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
              uVar7 = (int)((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3) + iVar18;
              goto LAB_008d6038;
            }
            puVar27 = puVar27 + 1;
            puVar6 = puVar6 + 1;
            iVar18 = iVar18 + 8;
          } while (puVar27 < puVar30);
        }
        if ((puVar27 < (ulong *)((long)puVar4 - 3U)) && ((int)*puVar6 == (int)*puVar27)) {
          puVar27 = (ulong *)((long)puVar27 + 4);
          puVar6 = (ulong *)((long)puVar6 + 4);
        }
        if ((puVar27 < (ulong *)((long)puVar4 - 1U)) && ((short)*puVar6 == (short)*puVar27)) {
          puVar27 = (ulong *)((long)puVar27 + 2);
          puVar6 = (ulong *)((long)puVar6 + 2);
        }
        if (puVar27 < puVar4) {
          if ((char)*puVar6 == (char)*puVar27) {
            puVar27 = (ulong *)((long)puVar27 + 1);
          }
        }
        uVar7 = (int)puVar27 - (int)puVar25;
      }
LAB_008d6038:
      puVar6 = (ulong *)((long)puVar31 + (ulong)uVar7 + 4);
      if (puVar6 == puVar4) {
        puVar25 = puVar4;
        puVar27 = param_2;
        if (puVar4 < puVar5) {
          if (*param_2 == *puVar4) {
            puVar25 = puVar4 + 1;
            puVar27 = param_2 + 1;
            goto LAB_008d6078;
          }
          uVar12 = *puVar4 ^ *param_2;
          uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
          uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
          uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
          uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
          uVar19 = (uint)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3;
        }
        else {
LAB_008d6078:
          if (puVar25 < puVar5) {
            puVar31 = (ulong *)((long)puVar31 + (lVar11 - (long)puVar14));
            if (puVar13 <= puVar31) {
              puVar31 = puVar13;
            }
            iVar18 = (int)puVar25 - (int)puVar31;
            do {
              if (*puVar27 != *puVar25) {
                uVar12 = *puVar25 ^ *puVar27;
                uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
                uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
                uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
                uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
                uVar19 = (int)((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3) + iVar18;
                goto LAB_008d615c;
              }
              puVar25 = puVar25 + 1;
              puVar27 = puVar27 + 1;
              iVar18 = iVar18 + 8;
            } while (puVar25 < puVar5);
          }
          if (puVar25 < puVar26) {
            if ((int)*puVar27 == (int)*puVar25) {
              puVar25 = (ulong *)((long)puVar25 + 4);
              puVar27 = (ulong *)((long)puVar27 + 4);
            }
          }
          if (puVar25 < puVar22) {
            if ((short)*puVar27 == (short)*puVar25) {
              puVar25 = (ulong *)((long)puVar25 + 2);
              puVar27 = (ulong *)((long)puVar27 + 2);
            }
          }
          if (puVar25 < puVar13) {
            if ((char)*puVar27 == (char)*puVar25) {
              puVar25 = (ulong *)((long)puVar25 + 1);
            }
          }
          uVar19 = (int)puVar25 - (int)puVar4;
        }
LAB_008d615c:
        puVar6 = (ulong *)((long)puVar6 + (ulong)uVar19);
        uVar7 = uVar19 + uVar7;
      }
    }
    else {
      puVar6 = (ulong *)((long)puVar31 + 4);
      puVar4 = (ulong *)((long)puVar14 + 4);
      puVar25 = puVar6;
      if (puVar6 < puVar5) {
        if (*puVar4 == *puVar6) {
          puVar4 = (ulong *)((long)puVar14 + 0xc);
          puVar25 = (ulong *)((long)puVar31 + 0xc);
          goto joined_r0x008d62c8;
        }
        uVar12 = *puVar6 ^ *puVar4;
        uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
        uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
        uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
        uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
        uVar7 = (uint)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3;
      }
      else {
joined_r0x008d62c8:
        if (puVar25 < puVar5) {
          iVar18 = ((int)puVar25 - (int)puVar31) + -4;
          do {
            if (*puVar4 != *puVar25) {
              uVar12 = *puVar25 ^ *puVar4;
              uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
              uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
              uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
              uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
              uVar7 = (int)((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3) + iVar18;
              goto LAB_008d6004;
            }
            puVar25 = puVar25 + 1;
            puVar4 = puVar4 + 1;
            iVar18 = iVar18 + 8;
          } while (puVar25 < puVar5);
        }
        if (puVar25 < puVar26) {
          if ((int)*puVar4 == (int)*puVar25) {
            puVar25 = (ulong *)((long)puVar25 + 4);
            puVar4 = (ulong *)((long)puVar4 + 4);
          }
        }
        if (puVar25 < puVar22) {
          if ((short)*puVar4 == (short)*puVar25) {
            puVar25 = (ulong *)((long)puVar25 + 2);
            puVar4 = (ulong *)((long)puVar4 + 2);
          }
        }
        if (puVar25 < puVar13) {
          if ((char)*puVar4 == (char)*puVar25) {
            puVar25 = (ulong *)((long)puVar25 + 1);
          }
        }
        uVar7 = (int)puVar25 - (int)puVar6;
      }
LAB_008d6004:
      puVar6 = (ulong *)((long)puVar31 + (ulong)uVar7 + 4);
    }
    uVar19 = uVar7 - 0xf;
    if (uVar7 < 0xf) {
      *param_3 = *param_3 + (char)uVar7;
      param_3 = pcVar34;
    }
    else {
      *param_3 = *param_3 + '\x0f';
      pcVar34[0] = -1;
      pcVar34[1] = -1;
      pcVar34[2] = -1;
      pcVar34[3] = -1;
      if (0x3fb < uVar19) {
        uVar12 = (ulong)((uVar7 - 0x40b) / 0x3fc << 2);
        memset((char *)((long)puVar15 + 6),0xff,uVar12 + 4);
        uVar19 = (uVar7 - 0x40b) % 0x3fc;
        pcVar34 = (char *)((long)puVar15 + 6) + uVar12;
      }
      uVar7 = (uVar19 & 0xffff) / 0xff;
      param_3 = pcVar34 + uVar7 + 1;
      pcVar34[uVar7] = (char)uVar19 + (char)uVar7;
    }
    if (puVar32 <= puVar6) goto LAB_008d6aa4;
    uVar12 = *puVar6 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
    uVar19 = (int)puVar6 - iVar35;
    *(int *)(param_1 +
            ((ulong)(*(long *)((long)puVar6 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)puVar6 + -2) - iVar35;
    uVar7 = *(uint *)(param_1 + uVar12);
    *(uint *)(param_1 + uVar12) = uVar19;
    puVar25 = puVar9;
    lVar1 = lVar23;
    if (uVar8 <= uVar7) {
      puVar25 = param_2;
      lVar1 = lVar36;
    }
    if ((uVar7 < uVar8 - uVar10 || uVar7 + 0xffff < uVar19) ||
       (puVar14 = (ulong *)(lVar1 + (ulong)uVar7), (int)*puVar14 != (int)*puVar6)) break;
    iVar18 = uVar19 - uVar7;
    puVar15 = (ulong *)(param_3 + 1);
    *param_3 = '\0';
    puVar31 = puVar6;
  } while( true );
  puVar14 = (ulong *)((long)puVar6 + 2);
  puVar31 = (ulong *)((long)puVar6 + 1);
  uVar7 = (int)puVar31 - iVar35;
  if (puVar32 < puVar14) goto LAB_008d6aa4;
  goto LAB_008d5c4c;
code_r0x008d6420:
  puVar14 = (ulong *)(lVar1 + uVar33);
  puVar25 = puVar9;
  if (uVar8 <= uVar7) {
    puVar25 = param_2;
  }
  if ((puVar25 < puVar14) && (*(char *)((long)puVar32 - 1) == *(char *)((long)puVar14 - 1))) {
    puVar4 = (ulong *)((long)puVar32 - 1);
    puVar15 = (ulong *)(lVar1 + uVar33 + -1);
    do {
      puVar14 = puVar15;
      puVar32 = puVar4;
      if ((puVar14 <= puVar25) || (puVar32 <= puVar6)) break;
      puVar4 = (ulong *)((long)puVar32 + -1);
      puVar15 = (ulong *)((long)puVar14 + -1);
    } while (*(char *)((long)puVar32 + -1) == *(char *)((long)puVar14 + -1));
  }
  puVar4 = (ulong *)(param_3 + 1);
  uVar20 = (uint)((long)puVar32 - (long)puVar6);
  uVar19 = uVar20 - 0xf;
  if (uVar20 < 0xf) {
    *param_3 = (char)(uVar20 << 4);
  }
  else {
    *param_3 = -0x10;
    puVar15 = puVar4;
    if (0xfe < uVar19) {
      uVar19 = ((int)puVar32 - (int)puVar6) - 0x10e;
      uVar12 = (ulong)uVar19 / 0xff;
      memset(puVar4,0xff,uVar12 + 1);
      puVar15 = (ulong *)(param_3 + uVar12 + 2);
      uVar19 = uVar19 + (int)uVar12;
    }
    puVar4 = (ulong *)((long)puVar15 + 1);
    *(char *)puVar15 = (char)uVar19;
  }
  uVar16 = (long)puVar32 - (long)puVar6 & 0xffffffff;
  uVar12 = uVar16;
  if (uVar16 < 9) {
    uVar12 = 8;
  }
  puVar15 = (ulong *)((long)puVar4 + uVar16);
  if ((0x18 < uVar16) && (0x1f < (ulong)((long)puVar4 - (long)puVar6))) {
    puVar27 = puVar4 + 2;
    pauVar21 = (undefined1 (*) [16])(puVar6 + 2);
    uVar12 = (uVar12 - 1 >> 3) + 1;
    uVar24 = uVar12 & 0x3ffffffffffffffc;
    uVar16 = uVar24;
    do {
      pauVar2 = pauVar21 + -1;
      uVar29 = *(ulong *)pauVar21[-1];
      auVar37 = *pauVar21;
      uVar16 = uVar16 - 4;
      pauVar21 = pauVar21 + 2;
      puVar27[-1] = *(ulong *)((long)*pauVar2 + 8);
      puVar27[-2] = uVar29;
      puVar27[1] = auVar37._8_8_;
      *puVar27 = auVar37._0_8_;
      puVar27 = puVar27 + 4;
    } while (uVar16 != 0);
    puVar6 = puVar6 + uVar24;
    puVar4 = puVar4 + uVar24;
    if (uVar12 == uVar24) goto LAB_008d6564;
  }
  do {
    puVar27 = puVar4 + 1;
    *puVar4 = *puVar6;
    puVar6 = puVar6 + 1;
    puVar4 = puVar27;
  } while (puVar27 < puVar15);
LAB_008d6564:
  iVar18 = uVar10 - uVar7;
  do {
    pcVar34 = (char *)((long)puVar15 + 2);
    *(short *)puVar15 = (short)iVar18;
    if (puVar25 == puVar9) {
      puVar6 = (ulong *)((long)puVar14 + 4);
      puVar25 = (ulong *)((long)puVar32 + (lVar11 - (long)puVar14));
      puVar4 = puVar31;
      if (puVar25 <= puVar31) {
        puVar4 = puVar25;
      }
      puVar25 = (ulong *)((long)puVar32 + 4);
      puVar30 = (ulong *)((long)puVar4 - 7);
      puVar27 = puVar25;
      if (puVar25 < puVar30) {
        if (*puVar6 == *puVar25) {
          puVar6 = (ulong *)((long)puVar14 + 0xc);
          puVar27 = (ulong *)((long)puVar32 + 0xc);
          goto joined_r0x008d6a20;
        }
        uVar12 = *puVar25 ^ *puVar6;
        uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
        uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
        uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
        uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
        uVar10 = (uint)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3;
      }
      else {
joined_r0x008d6a20:
        if (puVar27 < puVar30) {
          iVar18 = ((int)puVar27 - (int)puVar32) + -4;
          do {
            if (*puVar6 != *puVar27) {
              uVar12 = *puVar27 ^ *puVar6;
              uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
              uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
              uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
              uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
              uVar10 = (int)((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3) + iVar18;
              goto LAB_008d6790;
            }
            puVar27 = puVar27 + 1;
            puVar6 = puVar6 + 1;
            iVar18 = iVar18 + 8;
          } while (puVar27 < puVar30);
        }
        if ((puVar27 < (ulong *)((long)puVar4 - 3U)) && ((int)*puVar6 == (int)*puVar27)) {
          puVar27 = (ulong *)((long)puVar27 + 4);
          puVar6 = (ulong *)((long)puVar6 + 4);
        }
        if ((puVar27 < (ulong *)((long)puVar4 - 1U)) && ((short)*puVar6 == (short)*puVar27)) {
          puVar27 = (ulong *)((long)puVar27 + 2);
          puVar6 = (ulong *)((long)puVar6 + 2);
        }
        if (puVar27 < puVar4) {
          if ((char)*puVar6 == (char)*puVar27) {
            puVar27 = (ulong *)((long)puVar27 + 1);
          }
        }
        uVar10 = (int)puVar27 - (int)puVar25;
      }
LAB_008d6790:
      puVar6 = (ulong *)((long)puVar32 + (ulong)uVar10 + 4);
      if (puVar6 == puVar4) {
        puVar25 = puVar4;
        puVar27 = param_2;
        if (puVar4 < puVar22) {
          if (*param_2 == *puVar4) {
            puVar25 = puVar4 + 1;
            puVar27 = param_2 + 1;
            goto LAB_008d67d0;
          }
          uVar12 = *puVar4 ^ *param_2;
          uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
          uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
          uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
          uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
          uVar7 = (uint)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3;
        }
        else {
LAB_008d67d0:
          if (puVar25 < puVar22) {
            puVar32 = (ulong *)((long)puVar32 + (lVar11 - (long)puVar14));
            if (puVar31 <= puVar32) {
              puVar32 = puVar31;
            }
            iVar18 = (int)puVar25 - (int)puVar32;
            do {
              if (*puVar27 != *puVar25) {
                uVar12 = *puVar25 ^ *puVar27;
                uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
                uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
                uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
                uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
                uVar7 = (int)((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3) + iVar18;
                goto LAB_008d68b4;
              }
              puVar25 = puVar25 + 1;
              puVar27 = puVar27 + 1;
              iVar18 = iVar18 + 8;
            } while (puVar25 < puVar22);
          }
          if (puVar25 < puVar13) {
            if ((int)*puVar27 == (int)*puVar25) {
              puVar25 = (ulong *)((long)puVar25 + 4);
              puVar27 = (ulong *)((long)puVar27 + 4);
            }
          }
          if (puVar25 < puVar5) {
            if ((short)*puVar27 == (short)*puVar25) {
              puVar25 = (ulong *)((long)puVar25 + 2);
              puVar27 = (ulong *)((long)puVar27 + 2);
            }
          }
          if (puVar25 < puVar31) {
            if ((char)*puVar27 == (char)*puVar25) {
              puVar25 = (ulong *)((long)puVar25 + 1);
            }
          }
          uVar7 = (int)puVar25 - (int)puVar4;
        }
LAB_008d68b4:
        puVar6 = (ulong *)((long)puVar6 + (ulong)uVar7);
        uVar10 = uVar7 + uVar10;
      }
    }
    else {
      puVar6 = (ulong *)((long)puVar32 + 4);
      puVar4 = (ulong *)((long)puVar14 + 4);
      puVar25 = puVar6;
      if (puVar6 < puVar22) {
        if (*puVar4 == *puVar6) {
          puVar4 = (ulong *)((long)puVar14 + 0xc);
          puVar25 = (ulong *)((long)puVar32 + 0xc);
          goto joined_r0x008d6a10;
        }
        uVar12 = *puVar6 ^ *puVar4;
        uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
        uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
        uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
        uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
        uVar10 = (uint)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3;
      }
      else {
joined_r0x008d6a10:
        if (puVar25 < puVar22) {
          iVar18 = ((int)puVar25 - (int)puVar32) + -4;
          do {
            if (*puVar4 != *puVar25) {
              uVar12 = *puVar25 ^ *puVar4;
              uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
              uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
              uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
              uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
              uVar10 = (int)((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3) + iVar18;
              goto LAB_008d675c;
            }
            puVar25 = puVar25 + 1;
            puVar4 = puVar4 + 1;
            iVar18 = iVar18 + 8;
          } while (puVar25 < puVar22);
        }
        if (puVar25 < puVar13) {
          if ((int)*puVar4 == (int)*puVar25) {
            puVar25 = (ulong *)((long)puVar25 + 4);
            puVar4 = (ulong *)((long)puVar4 + 4);
          }
        }
        if (puVar25 < puVar5) {
          if ((short)*puVar4 == (short)*puVar25) {
            puVar25 = (ulong *)((long)puVar25 + 2);
            puVar4 = (ulong *)((long)puVar4 + 2);
          }
        }
        if (puVar25 < puVar31) {
          if ((char)*puVar4 == (char)*puVar25) {
            puVar25 = (ulong *)((long)puVar25 + 1);
          }
        }
        uVar10 = (int)puVar25 - (int)puVar6;
      }
LAB_008d675c:
      puVar6 = (ulong *)((long)puVar32 + (ulong)uVar10 + 4);
    }
    uVar7 = uVar10 - 0xf;
    if (uVar10 < 0xf) {
      *param_3 = *param_3 + (char)uVar10;
      param_3 = pcVar34;
    }
    else {
      *param_3 = *param_3 + '\x0f';
      pcVar34[0] = -1;
      pcVar34[1] = -1;
      pcVar34[2] = -1;
      pcVar34[3] = -1;
      if (0x3fb < uVar7) {
        uVar12 = (ulong)((uVar10 - 0x40b) / 0x3fc << 2);
        memset((char *)((long)puVar15 + 6),0xff,uVar12 + 4);
        uVar7 = (uVar10 - 0x40b) % 0x3fc;
        pcVar34 = (char *)((long)puVar15 + 6) + uVar12;
      }
      uVar10 = (uVar7 & 0xffff) / 0xff;
      param_3 = pcVar34 + uVar10 + 1;
      pcVar34[uVar10] = (char)uVar7 + (char)uVar10;
    }
    if (puVar26 <= puVar6) goto LAB_008d5bb4;
    uVar12 = *puVar6 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
    uVar7 = (int)puVar6 - iVar35;
    *(int *)(param_1 +
            ((ulong)(*(long *)((long)puVar6 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)puVar6 + -2) - iVar35;
    uVar10 = *(uint *)(param_1 + uVar12);
    *(uint *)(param_1 + uVar12) = uVar7;
    puVar25 = puVar9;
    lVar1 = lVar23;
    if (uVar8 <= uVar10) {
      puVar25 = param_2;
      lVar1 = lVar36;
    }
    if ((uVar10 + 0xffff < uVar7) ||
       (puVar14 = (ulong *)(lVar1 + (ulong)uVar10), (int)*puVar14 != (int)*puVar6)) break;
    iVar18 = uVar7 - uVar10;
    puVar15 = (ulong *)(param_3 + 1);
    *param_3 = '\0';
    puVar32 = puVar6;
  } while( true );
  puVar14 = (ulong *)((long)puVar6 + 2);
  puVar32 = (ulong *)((long)puVar6 + 1);
  uVar10 = (int)puVar32 - iVar35;
  if (puVar26 < puVar14) goto LAB_008d5bb4;
  goto LAB_008d63b0;
}

