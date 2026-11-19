/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d278c
 */

int LZ4_compress_fast_continue
              (void *param_1,ulong *param_2,short *param_3,uint param_4,int param_5,uint param_6)

{
  char *pcVar1;
  char *pcVar2;
  uint uVar3;
  ulong uVar4;
  undefined1 (*pauVar5) [16];
  int *piVar6;
  uint uVar7;
  ulong *puVar8;
  ulong *puVar9;
  uint uVar10;
  void *__src;
  ulong *puVar11;
  ulong *puVar12;
  char cVar13;
  uint uVar14;
  ulong uVar15;
  ulong *puVar16;
  long *plVar17;
  int iVar18;
  int iVar19;
  int iVar20;
  long lVar21;
  undefined1 (*pauVar22) [16];
  ulong *puVar23;
  long lVar24;
  ulong *puVar25;
  ulong *puVar26;
  ulong *puVar27;
  ulong uVar28;
  ulong *puVar29;
  uint uVar30;
  ulong uVar31;
  ulong *puVar32;
  uint uVar33;
  ulong *puVar34;
  short *psVar35;
  long lVar36;
  int iVar37;
  long lVar38;
  int *piVar39;
  ulong uVar40;
  ulong *puVar41;
  ulong *puVar42;
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  
  uVar15 = (ulong)*(uint *)((long)param_1 + 0x4018);
  if (*(uint *)((long)param_1 + 0x4018) == 0) {
    puVar11 = (ulong *)0x0;
  }
  else {
    puVar11 = (ulong *)(*(long *)((long)param_1 + 0x4000) + uVar15);
  }
  uVar10 = *(uint *)((long)param_1 + 0x4010);
  if (0x80000000 < uVar10 + param_4) {
    iVar18 = uVar10 - 0x10000;
    pauVar22 = (undefined1 (*) [16])((long)param_1 + 0x10);
    lVar24 = 0x1000;
    lVar21 = *(long *)((long)param_1 + 0x4000);
    do {
      lVar24 = lVar24 + -8;
      auVar43._4_4_ = iVar18;
      auVar43._0_4_ = iVar18;
      auVar43._8_4_ = iVar18;
      auVar43._12_4_ = iVar18;
      auVar43 = NEON_uqsub(pauVar22[-1],auVar43,4);
      auVar44._4_4_ = iVar18;
      auVar44._0_4_ = iVar18;
      auVar44._8_4_ = iVar18;
      auVar44._12_4_ = iVar18;
      auVar44 = NEON_uqsub(*pauVar22,auVar44,4);
      *(long *)(pauVar22[-1] + 8) = auVar43._8_8_;
      *(long *)pauVar22[-1] = auVar43._0_8_;
      *(long *)(*pauVar22 + 8) = auVar44._8_8_;
      *(long *)*pauVar22 = auVar44._0_8_;
      pauVar22 = pauVar22 + 2;
    } while (lVar24 != 0);
    lVar21 = lVar21 + uVar15;
    uVar15 = (ulong)*(uint *)((long)param_1 + 0x4018);
    *(undefined4 *)((long)param_1 + 0x4010) = 0x10000;
    if (0x10000 < *(uint *)((long)param_1 + 0x4018)) {
      uVar15 = 0x10000;
      *(undefined4 *)((long)param_1 + 0x4018) = 0x10000;
    }
    uVar10 = 0x10000;
    *(ulong *)((long)param_1 + 0x4000) = lVar21 - uVar15;
  }
  if ((int)param_6 < 2) {
    param_6 = 1;
  }
  if (0x10000 < (int)param_6) {
    param_6 = 0x10001;
  }
  if (((((uint)uVar15 < 4) && (0 < (int)param_4)) && (puVar11 != param_2)) &&
     (*(long *)((long)param_1 + 0x4008) == 0)) {
    uVar15 = 0;
    *(undefined4 *)((long)param_1 + 0x4018) = 0;
    *(ulong **)((long)param_1 + 0x4000) = param_2;
    puVar11 = param_2;
  }
  puVar32 = (ulong *)((long)param_2 + (long)(int)param_4);
  puVar23 = *(ulong **)((long)param_1 + 0x4000);
  if ((puVar23 < puVar32) && (puVar32 < puVar11)) {
    uVar33 = (int)puVar11 - (int)puVar32;
    uVar7 = uVar33;
    if (0xffff < uVar33) {
      uVar7 = 0x10000;
    }
    uVar30 = 0;
    if (3 < uVar33) {
      uVar30 = uVar7;
    }
    uVar15 = (ulong)uVar30;
    puVar23 = (ulong *)((long)puVar11 - uVar15);
    *(uint *)((long)param_1 + 0x4018) = uVar30;
    *(ulong **)((long)param_1 + 0x4000) = puVar23;
  }
  uVar7 = (uint)uVar15;
  iVar18 = (int)param_3;
  if (puVar11 == param_2) {
    puVar11 = param_2;
    if (((uVar15 & 0xffff0000) == 0) && (uVar7 < uVar10)) {
      if (0x7e000000 < param_4) {
        return 0;
      }
      if (param_4 == 0) goto LAB_008d35b8;
      pcVar1 = (char *)((long)param_3 + (long)param_5);
      *(uint *)((long)param_1 + 0x4018) = uVar7 + param_4;
      *(uint *)((long)param_1 + 0x4010) = uVar10 + param_4;
      *(undefined4 *)((long)param_1 + 0x4014) = 2;
      if (0xc < param_4) {
        puVar23 = (ulong *)((long)param_2 + 1);
        lVar21 = (long)param_2 - (ulong)uVar10;
        puVar12 = (ulong *)((long)param_2 + ((ulong)param_4 - 0xb));
        puVar32 = (ulong *)((long)param_2 + 2);
        puVar25 = (ulong *)((long)param_2 + ((ulong)param_4 - 0xc));
        *(uint *)((long)param_1 + (*param_2 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar10;
LAB_008d43ec:
        uVar33 = param_6 << 6 | 1;
        uVar31 = *puVar23;
        uVar30 = param_6;
        while( true ) {
          puVar26 = puVar32;
          iVar37 = (int)lVar21;
          uVar3 = (int)puVar23 - iVar37;
          uVar40 = uVar31 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
          uVar31 = *puVar26;
          uVar14 = *(uint *)((long)param_1 + uVar40);
          uVar28 = (ulong)uVar14;
          *(uint *)((long)param_1 + uVar40) = uVar3;
          if ((uVar10 - uVar7 <= uVar14 && uVar3 <= uVar14 + 0xffff) &&
             (*(int *)(lVar21 + uVar28) == (int)*puVar23)) break;
          uVar28 = (ulong)uVar30;
          uVar30 = uVar33 >> 6;
          uVar33 = uVar33 + 1;
          puVar32 = (ulong *)((long)puVar26 + uVar28);
          puVar23 = puVar26;
          if (puVar12 < (ulong *)((long)puVar26 + uVar28)) goto LAB_008d2978;
        }
        piVar39 = (int *)(lVar21 + uVar28);
        if (((int *)((long)param_2 - uVar15) < piVar39) &&
           (*(char *)((long)puVar23 - 1) == *(char *)((long)piVar39 - 1))) {
          puVar32 = (ulong *)((long)puVar23 - 1U);
          piVar6 = (int *)((long)param_2 + uVar28 + ~(ulong)uVar10);
          puVar34 = (ulong *)((long)puVar23 - 1U);
          do {
            puVar23 = puVar34;
            piVar39 = piVar6;
            puVar26 = puVar32;
            if ((piVar39 <= (int *)((long)param_2 - uVar15)) || (puVar26 <= puVar11)) break;
            puVar32 = (ulong *)((long)puVar26 + -1);
            piVar6 = (int *)((long)piVar39 + -1);
            puVar34 = (ulong *)((long)puVar23 - 1);
          } while (*(char *)((long)puVar26 + -1) == *(char *)((long)piVar39 + -1));
        }
        else {
          puVar26 = puVar23;
        }
        puVar32 = (ulong *)((long)param_3 + 1);
        uVar31 = (long)puVar23 - (long)puVar11 & 0xffffffff;
        if (pcVar1 < (char *)((long)puVar32 + uVar31 / 0xff + uVar31 + 8)) {
          return 0;
        }
        uVar30 = (uint)((long)puVar23 - (long)puVar11);
        uVar33 = uVar30 - 0xf;
        if (uVar30 < 0xf) {
          *(char *)param_3 = (char)(uVar30 << 4);
        }
        else {
          *(char *)param_3 = -0x10;
          puVar34 = puVar32;
          if (0xfe < uVar33) {
            uVar33 = ((int)puVar23 - (int)puVar11) - 0x10e;
            uVar28 = (ulong)uVar33 / 0xff;
            memset(puVar32,0xff,uVar28 + 1);
            uVar33 = uVar33 + (int)uVar28;
            puVar34 = (ulong *)((long)param_3 + uVar28 + 2);
          }
          puVar32 = (ulong *)((long)puVar34 + 1);
          *(char *)puVar34 = (char)uVar33;
        }
        uVar28 = uVar31;
        if (uVar31 < 9) {
          uVar28 = 8;
        }
        puVar23 = (ulong *)((long)puVar32 + uVar31);
        if ((0x18 < uVar31) && (0x1f < (ulong)((long)puVar32 - (long)puVar11))) {
          puVar34 = puVar32 + 2;
          pauVar22 = (undefined1 (*) [16])(puVar11 + 2);
          uVar31 = (uVar28 - 1 >> 3) + 1;
          uVar40 = uVar31 & 0x3ffffffffffffffc;
          uVar28 = uVar40;
          do {
            pauVar5 = pauVar22 + -1;
            uVar4 = *(ulong *)pauVar22[-1];
            auVar43 = *pauVar22;
            uVar28 = uVar28 - 4;
            pauVar22 = pauVar22 + 2;
            puVar34[-1] = *(ulong *)((long)*pauVar5 + 8);
            puVar34[-2] = uVar4;
            puVar34[1] = auVar43._8_8_;
            *puVar34 = auVar43._0_8_;
            puVar34 = puVar34 + 4;
          } while (uVar28 != 0);
          puVar11 = puVar11 + uVar40;
          puVar32 = puVar32 + uVar40;
          if (uVar31 == uVar40) goto LAB_008d45ac;
        }
        do {
          puVar34 = puVar32 + 1;
          *puVar32 = *puVar11;
          puVar11 = puVar11 + 1;
          puVar32 = puVar34;
        } while (puVar34 < puVar23);
LAB_008d45ac:
        do {
          puVar11 = (ulong *)((long)puVar26 + 4);
          puVar34 = (ulong *)(piVar39 + 1);
          psVar35 = (short *)((long)puVar23 + 2);
          *(short *)puVar23 = (short)puVar26 - (short)piVar39;
          puVar32 = puVar11;
          if (puVar11 < puVar25) {
            if (*puVar34 == *puVar11) {
              puVar34 = (ulong *)(piVar39 + 3);
              puVar32 = (ulong *)((long)puVar26 + 0xc);
              goto joined_r0x008d4800;
            }
            uVar31 = *puVar11 ^ *puVar34;
            uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
            uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
            uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
            uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
            uVar33 = (uint)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3;
          }
          else {
joined_r0x008d4800:
            if (puVar32 < puVar25) {
              iVar19 = ((int)puVar32 - (int)puVar26) + -4;
              do {
                if (*puVar34 != *puVar32) {
                  uVar31 = *puVar32 ^ *puVar34;
                  uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
                  uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
                  uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
                  uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10
                  ;
                  uVar33 = (int)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3) + iVar19;
                  goto LAB_008d46bc;
                }
                puVar32 = puVar32 + 1;
                puVar34 = puVar34 + 1;
                iVar19 = iVar19 + 8;
              } while (puVar32 < puVar25);
            }
            if (puVar32 < (ulong *)((long)param_2 + ((ulong)param_4 - 8))) {
              if ((int)*puVar34 == (int)*puVar32) {
                puVar32 = (ulong *)((long)puVar32 + 4);
                puVar34 = (ulong *)((long)puVar34 + 4);
              }
            }
            if (puVar32 < (ulong *)((long)param_2 + ((ulong)param_4 - 6))) {
              if ((short)*puVar34 == (short)*puVar32) {
                puVar32 = (ulong *)((long)puVar32 + 2);
                puVar34 = (ulong *)((long)puVar34 + 2);
              }
            }
            if (puVar32 < (ulong *)((long)param_2 + ((ulong)param_4 - 5))) {
              if ((char)*puVar34 == (char)*puVar32) {
                puVar32 = (ulong *)((long)puVar32 + 1);
              }
            }
            uVar33 = (int)puVar32 - (int)puVar11;
          }
LAB_008d46bc:
          if (pcVar1 < (char *)((long)puVar23 + (ulong)(uVar33 + 0xf0) / 0xff + 8)) {
            return 0;
          }
          uVar30 = uVar33 - 0xf;
          if (uVar33 < 0xf) {
            *(char *)param_3 = (char)*param_3 + (char)uVar33;
            param_3 = psVar35;
          }
          else {
            *(char *)param_3 = (char)*param_3 + '\x0f';
            psVar35[0] = -1;
            psVar35[1] = -1;
            if (0x3fb < uVar30) {
              uVar31 = (ulong)((uVar33 - 0x40b) / 0x3fc << 2);
              memset((short *)((long)puVar23 + 6),0xff,uVar31 + 4);
              uVar30 = (uVar33 - 0x40b) % 0x3fc;
              psVar35 = (short *)((long)puVar23 + 6 + uVar31);
            }
            uVar14 = (uVar30 & 0xffff) / 0xff;
            pcVar2 = (char *)((long)psVar35 + (ulong)uVar14);
            *pcVar2 = (char)uVar30 + (char)uVar14;
            param_3 = (short *)(pcVar2 + 1);
          }
          puVar11 = (ulong *)((long)puVar26 + (ulong)uVar33 + 4);
          if (puVar12 <= puVar11) break;
          plVar17 = (long *)((long)puVar26 + (ulong)uVar33 + 2);
          lVar24 = *(long *)((long)puVar26 + (ulong)uVar33 + 4);
          *(int *)((long)param_1 + ((ulong)(*plVar17 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
               (int)plVar17 - iVar37;
          uVar31 = (ulong)(lVar24 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
          uVar14 = (int)puVar11 - iVar37;
          uVar30 = *(uint *)((long)param_1 + uVar31);
          *(uint *)((long)param_1 + uVar31) = uVar14;
          if ((uVar30 < uVar10 - uVar7 || uVar30 + 0xffff < uVar14) ||
             (piVar39 = (int *)(lVar21 + (ulong)uVar30), *piVar39 != (int)*puVar11))
          goto LAB_008d43d8;
          puVar23 = (ulong *)((long)param_3 + 1);
          *(char *)param_3 = '\0';
          puVar26 = puVar11;
        } while( true );
      }
LAB_008d2978:
      uVar15 = (long)param_2 + ((ulong)param_4 - (long)puVar11);
      if (pcVar1 < (char *)((long)param_3 + (uVar15 + 0xf0) / 0xff + uVar15 + 1)) {
        return 0;
      }
      if (0xe < uVar15) {
        *(char *)param_3 = -0x10;
        psVar35 = param_3;
        goto joined_r0x008d2b88;
      }
    }
    else {
      if (0x7e000000 < param_4) {
        return 0;
      }
      if (param_4 == 0) {
LAB_008d35b8:
        if (param_5 < 1) {
          return 0;
        }
        *(char *)param_3 = '\0';
        return 1;
      }
      pcVar1 = (char *)((long)param_3 + (long)param_5);
      *(uint *)((long)param_1 + 0x4018) = uVar7 + param_4;
      *(uint *)((long)param_1 + 0x4010) = uVar10 + param_4;
      *(undefined4 *)((long)param_1 + 0x4014) = 2;
      if (0xc < param_4) {
        puVar23 = (ulong *)((long)param_2 + 1);
        puVar12 = (ulong *)((long)param_2 + ((ulong)param_4 - 0xb));
        puVar25 = (ulong *)((long)param_2 + ((ulong)param_4 - 0xc));
        lVar21 = (long)param_2 - (ulong)uVar10;
        puVar32 = (ulong *)((long)param_2 + 2);
        *(uint *)((long)param_1 + (*param_2 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar10;
LAB_008d3f0c:
        uVar7 = param_6 << 6 | 1;
        uVar31 = *puVar23;
        uVar33 = param_6;
        while( true ) {
          puVar26 = puVar32;
          iVar37 = (int)lVar21;
          uVar14 = (int)puVar23 - iVar37;
          uVar40 = uVar31 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
          uVar31 = *puVar26;
          uVar30 = *(uint *)((long)param_1 + uVar40);
          uVar28 = (ulong)uVar30;
          *(uint *)((long)param_1 + uVar40) = uVar14;
          if ((uVar14 <= uVar30 + 0xffff) && (*(int *)(lVar21 + uVar28) == (int)*puVar23)) break;
          uVar28 = (ulong)uVar33;
          uVar33 = uVar7 >> 6;
          uVar7 = uVar7 + 1;
          puVar32 = (ulong *)((long)puVar26 + uVar28);
          puVar23 = puVar26;
          if (puVar12 < (ulong *)((long)puVar26 + uVar28)) goto LAB_008d2b44;
        }
        piVar39 = (int *)(lVar21 + uVar28);
        if (((int *)((long)param_2 - uVar15) < piVar39) &&
           (*(char *)((long)puVar23 - 1) == *(char *)((long)piVar39 - 1))) {
          puVar32 = (ulong *)((long)puVar23 - 1U);
          piVar6 = (int *)((long)param_2 + uVar28 + ~(ulong)uVar10);
          puVar34 = (ulong *)((long)puVar23 - 1U);
          do {
            puVar23 = puVar34;
            piVar39 = piVar6;
            puVar26 = puVar32;
            if ((piVar39 <= (int *)((long)param_2 - uVar15)) || (puVar26 <= puVar11)) break;
            puVar32 = (ulong *)((long)puVar26 + -1);
            piVar6 = (int *)((long)piVar39 + -1);
            puVar34 = (ulong *)((long)puVar23 - 1);
          } while (*(char *)((long)puVar26 + -1) == *(char *)((long)piVar39 + -1));
        }
        else {
          puVar26 = puVar23;
        }
        puVar32 = (ulong *)((long)param_3 + 1);
        uVar31 = (long)puVar23 - (long)puVar11 & 0xffffffff;
        if (pcVar1 < (char *)((long)puVar32 + uVar31 / 0xff + uVar31 + 8)) {
          return 0;
        }
        uVar33 = (uint)((long)puVar23 - (long)puVar11);
        uVar7 = uVar33 - 0xf;
        if (uVar33 < 0xf) {
          *(char *)param_3 = (char)(uVar33 << 4);
        }
        else {
          *(char *)param_3 = -0x10;
          puVar34 = puVar32;
          if (0xfe < uVar7) {
            uVar7 = ((int)puVar23 - (int)puVar11) - 0x10e;
            uVar28 = (ulong)uVar7 / 0xff;
            memset(puVar32,0xff,uVar28 + 1);
            puVar34 = (ulong *)((long)param_3 + uVar28 + 2);
            uVar7 = uVar7 + (int)uVar28;
          }
          puVar32 = (ulong *)((long)puVar34 + 1);
          *(char *)puVar34 = (char)uVar7;
        }
        uVar28 = uVar31;
        if (uVar31 < 9) {
          uVar28 = 8;
        }
        puVar23 = (ulong *)((long)puVar32 + uVar31);
        if ((0x18 < uVar31) && (0x1f < (ulong)((long)puVar32 - (long)puVar11))) {
          puVar34 = puVar32 + 2;
          pauVar22 = (undefined1 (*) [16])(puVar11 + 2);
          uVar31 = (uVar28 - 1 >> 3) + 1;
          uVar40 = uVar31 & 0x3ffffffffffffffc;
          uVar28 = uVar40;
          do {
            pauVar5 = pauVar22 + -1;
            uVar4 = *(ulong *)pauVar22[-1];
            auVar43 = *pauVar22;
            uVar28 = uVar28 - 4;
            pauVar22 = pauVar22 + 2;
            puVar34[-1] = *(ulong *)((long)*pauVar5 + 8);
            puVar34[-2] = uVar4;
            puVar34[1] = auVar43._8_8_;
            *puVar34 = auVar43._0_8_;
            puVar34 = puVar34 + 4;
          } while (uVar28 != 0);
          puVar11 = puVar11 + uVar40;
          puVar32 = puVar32 + uVar40;
          if (uVar31 == uVar40) goto LAB_008d40b4;
        }
        do {
          puVar34 = puVar32 + 1;
          *puVar32 = *puVar11;
          puVar11 = puVar11 + 1;
          puVar32 = puVar34;
        } while (puVar34 < puVar23);
LAB_008d40b4:
        do {
          puVar11 = (ulong *)((long)puVar26 + 4);
          puVar34 = (ulong *)(piVar39 + 1);
          psVar35 = (short *)((long)puVar23 + 2);
          *(short *)puVar23 = (short)puVar26 - (short)piVar39;
          puVar32 = puVar11;
          if (puVar11 < puVar25) {
            if (*puVar34 == *puVar11) {
              puVar34 = (ulong *)(piVar39 + 3);
              puVar32 = (ulong *)((long)puVar26 + 0xc);
              goto joined_r0x008d42ec;
            }
            uVar31 = *puVar11 ^ *puVar34;
            uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
            uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
            uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
            uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
            uVar7 = (uint)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3;
          }
          else {
joined_r0x008d42ec:
            if (puVar32 < puVar25) {
              iVar19 = ((int)puVar32 - (int)puVar26) + -4;
              do {
                if (*puVar34 != *puVar32) {
                  uVar31 = *puVar32 ^ *puVar34;
                  uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
                  uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
                  uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
                  uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10
                  ;
                  uVar7 = (int)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3) + iVar19;
                  goto LAB_008d41c4;
                }
                puVar32 = puVar32 + 1;
                puVar34 = puVar34 + 1;
                iVar19 = iVar19 + 8;
              } while (puVar32 < puVar25);
            }
            if (puVar32 < (ulong *)((long)param_2 + ((ulong)param_4 - 8))) {
              if ((int)*puVar34 == (int)*puVar32) {
                puVar32 = (ulong *)((long)puVar32 + 4);
                puVar34 = (ulong *)((long)puVar34 + 4);
              }
            }
            if (puVar32 < (ulong *)((long)param_2 + ((ulong)param_4 - 6))) {
              if ((short)*puVar34 == (short)*puVar32) {
                puVar32 = (ulong *)((long)puVar32 + 2);
                puVar34 = (ulong *)((long)puVar34 + 2);
              }
            }
            if (puVar32 < (ulong *)((long)param_2 + ((ulong)param_4 - 5))) {
              if ((char)*puVar34 == (char)*puVar32) {
                puVar32 = (ulong *)((long)puVar32 + 1);
              }
            }
            uVar7 = (int)puVar32 - (int)puVar11;
          }
LAB_008d41c4:
          if (pcVar1 < (char *)((long)puVar23 + (ulong)(uVar7 + 0xf0) / 0xff + 8)) {
            return 0;
          }
          uVar33 = uVar7 - 0xf;
          if (uVar7 < 0xf) {
            *(char *)param_3 = (char)*param_3 + (char)uVar7;
            param_3 = psVar35;
          }
          else {
            *(char *)param_3 = (char)*param_3 + '\x0f';
            psVar35[0] = -1;
            psVar35[1] = -1;
            if (0x3fb < uVar33) {
              uVar31 = (ulong)((uVar7 - 0x40b) / 0x3fc << 2);
              memset((short *)((long)puVar23 + 6),0xff,uVar31 + 4);
              uVar33 = (uVar7 - 0x40b) % 0x3fc;
              psVar35 = (short *)((long)puVar23 + 6 + uVar31);
            }
            uVar30 = (uVar33 & 0xffff) / 0xff;
            pcVar2 = (char *)((long)psVar35 + (ulong)uVar30);
            *pcVar2 = (char)uVar33 + (char)uVar30;
            param_3 = (short *)(pcVar2 + 1);
          }
          puVar11 = (ulong *)((long)puVar26 + (ulong)uVar7 + 4);
          if (puVar12 <= puVar11) break;
          plVar17 = (long *)((long)puVar26 + (ulong)uVar7 + 2);
          lVar24 = *(long *)((long)puVar26 + (ulong)uVar7 + 4);
          *(int *)((long)param_1 + ((ulong)(*plVar17 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
               (int)plVar17 - iVar37;
          uVar31 = (ulong)(lVar24 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
          uVar30 = (int)puVar11 - iVar37;
          uVar33 = *(uint *)((long)param_1 + uVar31);
          *(uint *)((long)param_1 + uVar31) = uVar30;
          if ((uVar33 + 0xffff < uVar30) ||
             (piVar39 = (int *)(lVar21 + (ulong)uVar33), *piVar39 != (int)*puVar11))
          goto LAB_008d3ef8;
          puVar23 = (ulong *)((long)param_3 + 1);
          *(char *)param_3 = '\0';
          puVar26 = puVar11;
        } while( true );
      }
LAB_008d2b44:
      uVar15 = (long)param_2 + ((ulong)param_4 - (long)puVar11);
      if (pcVar1 < (char *)((long)param_3 + (uVar15 + 0xf0) / 0xff + uVar15 + 1)) {
        return 0;
      }
      if (0xe < uVar15) {
        *(char *)param_3 = -0x10;
        psVar35 = param_3;
joined_r0x008d2b88:
        cVar13 = (char)(uVar15 - 0xf);
        param_3 = (short *)((long)psVar35 + 1);
        if (0xfe < uVar15 - 0xf) {
          uVar31 = (long)param_2 + ((ulong)param_4 - (long)puVar11) + -0x10e;
          uVar28 = uVar31 / 0xff;
          memset(param_3,0xff,uVar28 + 1);
          param_3 = (short *)((long)psVar35 + uVar28 + 2);
          cVar13 = (char)(uVar31 % 0xff);
        }
        *(char *)param_3 = cVar13;
        goto LAB_008d4868;
      }
    }
    *(char *)param_3 = (char)((int)uVar15 << 4);
LAB_008d4868:
    memcpy((char *)((long)param_3 + 1),puVar11,uVar15);
    return ((int)(char *)((long)param_3 + 1) + (int)uVar15) - iVar18;
  }
  __src = *(void **)((long)param_1 + 0x4008);
  if (__src == (void *)0x0) {
    if ((uVar7 >> 0x10 == 0) && (uVar7 < uVar10)) {
      if (param_4 < 0x7e000001) {
        if (param_4 != 0) {
          uVar31 = (ulong)param_4;
          pcVar1 = (char *)((long)param_3 + (long)param_5);
          lVar21 = 0;
          if (puVar23 != (ulong *)0x0) {
            lVar21 = ((long)puVar23 + uVar15) - (ulong)uVar10;
          }
          *(uint *)((long)param_1 + 0x4018) = uVar7 + param_4;
          *(uint *)((long)param_1 + 0x4010) = uVar10 + param_4;
          *(undefined4 *)((long)param_1 + 0x4014) = 2;
          puVar11 = param_2;
          if (0xc < param_4) {
            lVar38 = (long)param_2 - (ulong)uVar10;
            puVar25 = (ulong *)((long)param_2 + (uVar31 - 5));
            puVar42 = (ulong *)((long)param_2 + (uVar31 - 0xb));
            puVar32 = (ulong *)((long)param_2 + 2);
            puVar12 = (ulong *)((long)param_2 + 1);
            uVar33 = uVar10 + 1;
            puVar41 = (ulong *)((long)param_2 + (uVar31 - 0xc));
            puVar34 = (ulong *)((long)param_2 + (uVar31 - 8));
            puVar26 = (ulong *)((long)param_2 + (uVar31 - 6));
            lVar24 = 0;
            if (puVar23 != (ulong *)0x0) {
              lVar24 = (long)puVar23 + uVar15;
            }
            *(uint *)((long)param_1 + (*param_2 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar10;
LAB_008d5140:
            uVar30 = param_6 << 6 | 1;
            uVar15 = *(ulong *)((long)puVar11 + 1);
            uVar14 = param_6;
            do {
              puVar9 = puVar32;
              uVar28 = uVar15 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
              uVar15 = *puVar9;
              uVar3 = *(uint *)((long)param_1 + uVar28);
              uVar40 = (ulong)uVar3;
              *(uint *)((long)param_1 + uVar28) = uVar33;
              iVar37 = (int)lVar38;
              if (uVar10 - uVar7 <= uVar3 && uVar33 <= uVar3 + 0xffff) {
                lVar36 = lVar21;
                if (uVar10 <= uVar3) {
                  lVar36 = lVar38;
                }
                if (*(int *)(lVar36 + uVar40) == (int)*puVar12) goto code_r0x008d51b0;
              }
              uVar28 = (ulong)uVar14;
              uVar14 = uVar30 >> 6;
              uVar30 = uVar30 + 1;
              uVar33 = (int)puVar9 - iVar37;
              puVar32 = (ulong *)((long)puVar9 + uVar28);
              puVar12 = puVar9;
              if (puVar42 < (ulong *)((long)puVar9 + uVar28)) break;
            } while( true );
          }
LAB_008d2a3c:
          uVar15 = (long)param_2 + (uVar31 - (long)puVar11);
          if ((char *)((long)param_3 + (uVar15 + 0xf0) / 0xff + uVar15 + 1) <= pcVar1) {
            uVar28 = uVar15 - 0xf;
            if (uVar15 < 0xf) {
              *(char *)param_3 = (char)((int)uVar15 << 4);
            }
            else {
              psVar35 = (short *)((long)param_3 + 1);
              *(char *)param_3 = -0x10;
              if (0xfe < uVar28) {
                uVar28 = (long)param_2 + (uVar31 - (long)puVar11) + -0x10e;
                uVar31 = uVar28 / 0xff;
                memset(psVar35,0xff,uVar31 + 1);
                psVar35 = (short *)((long)param_3 + uVar31 + 2);
                uVar28 = uVar28 % 0xff;
              }
              *(char *)psVar35 = (char)uVar28;
              param_3 = psVar35;
            }
            memcpy((char *)((long)param_3 + 1),puVar11,uVar15);
            iVar37 = (int)(char *)((long)param_3 + 1) + (int)uVar15;
            goto LAB_008d5970;
          }
          goto LAB_008d35b0;
        }
        goto LAB_008d363c;
      }
    }
    else if (param_4 < 0x7e000001) {
      if (param_4 != 0) {
        uVar31 = (ulong)param_4;
        pcVar1 = (char *)((long)param_3 + (long)param_5);
        lVar21 = 0;
        if (puVar23 != (ulong *)0x0) {
          lVar21 = ((long)puVar23 + uVar15) - (ulong)uVar10;
        }
        *(uint *)((long)param_1 + 0x4018) = uVar7 + param_4;
        *(uint *)((long)param_1 + 0x4010) = uVar10 + param_4;
        *(undefined4 *)((long)param_1 + 0x4014) = 2;
        puVar11 = param_2;
        if (0xc < param_4) {
          lVar38 = (long)param_2 - (ulong)uVar10;
          puVar26 = (ulong *)((long)param_2 + (uVar31 - 5));
          puVar25 = (ulong *)((long)param_2 + (uVar31 - 0xb));
          puVar32 = (ulong *)((long)param_2 + 1);
          puVar12 = (ulong *)((long)param_2 + 2);
          uVar7 = uVar10 + 1;
          lVar24 = 0;
          if (puVar23 != (ulong *)0x0) {
            lVar24 = (long)puVar23 + uVar15;
          }
          puVar42 = (ulong *)((long)param_2 + (uVar31 - 0xc));
          puVar41 = (ulong *)((long)param_2 + (uVar31 - 8));
          puVar34 = (ulong *)((long)param_2 + (uVar31 - 6));
          *(uint *)((long)param_1 + (*param_2 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar10;
LAB_008d4968:
          uVar33 = param_6 << 6 | 1;
          uVar15 = *(ulong *)((long)puVar11 + 1);
          uVar30 = param_6;
          do {
            puVar9 = puVar12;
            uVar28 = uVar15 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
            uVar15 = *puVar9;
            uVar14 = *(uint *)((long)param_1 + uVar28);
            uVar40 = (ulong)uVar14;
            *(uint *)((long)param_1 + uVar28) = uVar7;
            iVar37 = (int)lVar38;
            if (uVar7 <= uVar14 + 0xffff) {
              lVar36 = lVar21;
              if (uVar10 <= uVar14) {
                lVar36 = lVar38;
              }
              if (*(int *)(lVar36 + uVar40) == (int)*puVar32) goto code_r0x008d49d4;
            }
            uVar28 = (ulong)uVar30;
            uVar30 = uVar33 >> 6;
            uVar33 = uVar33 + 1;
            uVar7 = (int)puVar9 - iVar37;
            puVar12 = (ulong *)((long)puVar9 + uVar28);
            puVar32 = puVar9;
            if (puVar25 < (ulong *)((long)puVar9 + uVar28)) break;
          } while( true );
        }
LAB_008d2c3c:
        uVar15 = (long)param_2 + (uVar31 - (long)puVar11);
        if (pcVar1 < (char *)((long)param_3 + (uVar15 + 0xf0) / 0xff + uVar15 + 1)) {
LAB_008d2c68:
          iVar37 = 0;
        }
        else {
          uVar28 = uVar15 - 0xf;
          if (uVar15 < 0xf) {
            *(char *)param_3 = (char)((int)uVar15 << 4);
          }
          else {
            psVar35 = (short *)((long)param_3 + 1);
            *(char *)param_3 = -0x10;
            if (0xfe < uVar28) {
              uVar28 = (long)param_2 + (uVar31 - (long)puVar11) + -0x10e;
              uVar31 = uVar28 / 0xff;
              memset(psVar35,0xff,uVar31 + 1);
              psVar35 = (short *)((long)param_3 + uVar31 + 2);
              uVar28 = uVar28 % 0xff;
            }
            *(char *)psVar35 = (char)uVar28;
            param_3 = psVar35;
          }
          memcpy((char *)((long)param_3 + 1),puVar11,uVar15);
          iVar37 = ((int)(char *)((long)param_3 + 1) + (int)uVar15) - iVar18;
        }
        goto LAB_008d597c;
      }
LAB_008d363c:
      if (0 < param_5) goto LAB_008d3658;
    }
    iVar37 = 0;
  }
  else {
    if (0x1000 < (int)param_4) {
      memcpy(param_1,__src,0x4020);
      if (param_4 < 0x7e000001) {
        puVar23 = *(ulong **)((long)param_1 + 0x4000);
        uVar31 = (ulong)param_4;
        uVar15 = *param_2;
        lVar21 = (long)puVar23 + (ulong)*(uint *)((long)param_1 + 0x4018);
        uVar7 = *(uint *)((long)param_1 + 0x4010);
        *(undefined4 *)((long)param_1 + 0x4014) = 2;
        *(uint *)((long)param_1 + 0x4018) = *(uint *)((long)param_1 + 0x4018) + param_4;
        pcVar1 = (char *)((long)param_3 + (long)param_5);
        puVar11 = (ulong *)((long)param_2 + 2);
        puVar32 = (ulong *)((long)param_2 + 1);
        lVar38 = (long)param_2 - (ulong)uVar7;
        puVar25 = (ulong *)((long)param_2 + (uVar31 - 8));
        puVar12 = (ulong *)((long)param_2 + (uVar31 - 0xb));
        puVar26 = (ulong *)((long)param_2 + (uVar31 - 6));
        puVar34 = (ulong *)((long)param_2 + (uVar31 - 5));
        uVar10 = uVar7 + 1;
        puVar41 = (ulong *)((long)param_2 + (uVar31 - 0xc));
        lVar24 = 0;
        if (puVar23 != (ulong *)0x0) {
          lVar24 = lVar21;
        }
        lVar36 = 0;
        if (puVar23 != (ulong *)0x0) {
          lVar36 = lVar21 - (ulong)uVar7;
        }
        *(uint *)((long)param_1 + 0x4010) = uVar7 + param_4;
        *(uint *)((long)param_1 + (uVar15 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar7;
        puVar42 = param_2;
LAB_008d2d6c:
        uVar33 = param_6 << 6 | 1;
        uVar15 = *(ulong *)((long)puVar42 + 1);
        uVar30 = param_6;
        do {
          puVar9 = puVar11;
          uVar28 = uVar15 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
          uVar15 = *puVar9;
          uVar14 = *(uint *)((long)param_1 + uVar28);
          uVar40 = (ulong)uVar14;
          *(uint *)((long)param_1 + uVar28) = uVar10;
          iVar37 = (int)lVar38;
          if (uVar10 <= uVar14 + 0xffff) {
            lVar21 = lVar36;
            if (uVar7 <= uVar14) {
              lVar21 = lVar38;
            }
            if (*(int *)(lVar21 + uVar40) == (int)*puVar32) goto code_r0x008d2dd8;
          }
          uVar28 = (ulong)uVar30;
          uVar30 = uVar33 >> 6;
          uVar33 = uVar33 + 1;
          uVar10 = (int)puVar9 - iVar37;
          puVar11 = (ulong *)((long)puVar9 + uVar28);
          puVar32 = puVar9;
          if (puVar12 < (ulong *)((long)puVar9 + uVar28)) goto LAB_008d3584;
        } while( true );
      }
      iVar37 = 0;
      goto LAB_008d597c;
    }
    if (0x7e000000 < param_4) {
LAB_008d2ae8:
      iVar37 = 0;
      goto LAB_008d597c;
    }
    if (param_4 != 0) {
      puVar11 = *(ulong **)((long)__src + 0x4000);
      uVar15 = (ulong)param_4;
      uVar7 = *(uint *)((long)__src + 0x4010);
      pcVar1 = (char *)((long)param_3 + (long)param_5);
      lVar21 = (long)puVar11 + (ulong)*(uint *)((long)__src + 0x4018);
      lVar24 = 0;
      if (puVar11 != (ulong *)0x0) {
        lVar24 = lVar21 - (ulong)uVar7;
      }
      *(undefined8 *)((long)param_1 + 0x4008) = 0;
      *(uint *)((long)param_1 + 0x4010) = uVar10 + param_4;
      *(undefined4 *)((long)param_1 + 0x4014) = 2;
      *(uint *)((long)param_1 + 0x4018) = param_4;
      puVar32 = param_2;
      if (0xc < param_4) {
        lVar36 = (long)param_2 - (ulong)uVar10;
        iVar37 = uVar10 - uVar7;
        puVar26 = (ulong *)((long)param_2 + (uVar15 - 5));
        puVar42 = (ulong *)((long)param_2 + (uVar15 - 0xb));
        puVar23 = (ulong *)((long)param_2 + 2);
        puVar12 = (ulong *)((long)param_2 + 1);
        uVar7 = uVar10 + 1;
        puVar25 = (ulong *)((long)param_2 + (uVar15 - 0xc));
        puVar41 = (ulong *)((long)param_2 + (uVar15 - 8));
        puVar34 = (ulong *)((long)param_2 + (uVar15 - 6));
        lVar38 = 0;
        if (puVar11 != (ulong *)0x0) {
          lVar38 = lVar21;
        }
        *(uint *)((long)param_1 + (*param_2 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar10;
LAB_008d3724:
        uVar33 = param_6 << 6 | 1;
        uVar31 = *(ulong *)((long)puVar32 + 1);
        uVar30 = param_6;
        while( true ) {
          puVar9 = puVar23;
          uVar28 = uVar31 * -0x30e4432345000000 >> 0x34;
          uVar14 = *(uint *)((long)param_1 + uVar28 * 4);
          if (uVar14 < uVar10) {
            uVar14 = *(uint *)((long)__src + uVar28 * 4);
            puVar23 = (ulong *)(lVar24 + (ulong)uVar14);
            uVar14 = uVar14 + iVar37;
            puVar8 = puVar11;
          }
          else {
            puVar23 = (ulong *)(lVar36 + (ulong)uVar14);
            puVar8 = param_2;
          }
          uVar31 = *puVar9;
          *(uint *)((long)param_1 + uVar28 * 4) = uVar7;
          iVar19 = (int)lVar36;
          if ((uVar7 <= uVar14 + 0xffff) && ((int)*puVar23 == (int)*puVar12)) break;
          uVar28 = (ulong)uVar30;
          uVar30 = uVar33 >> 6;
          uVar33 = uVar33 + 1;
          uVar7 = (int)puVar9 - iVar19;
          puVar23 = (ulong *)((long)puVar9 + uVar28);
          puVar12 = puVar9;
          if (puVar42 < (ulong *)((long)puVar9 + uVar28)) goto LAB_008d34ec;
        }
        if ((puVar8 < puVar23) && (*(char *)((long)puVar12 - 1) == *(char *)((long)puVar23 + -1))) {
          puVar9 = (ulong *)((long)puVar12 - 1);
          puVar16 = (ulong *)((long)puVar23 + -1);
          do {
            puVar23 = puVar16;
            puVar12 = puVar9;
            if ((puVar23 <= puVar8) || (puVar12 <= puVar32)) break;
            puVar9 = (ulong *)((long)puVar12 + -1);
            puVar16 = (ulong *)((long)puVar23 + -1);
          } while (*(char *)((long)puVar12 + -1) == *(char *)((long)puVar23 + -1));
        }
        puVar9 = (ulong *)((long)param_3 + 1);
        uVar31 = (long)puVar12 - (long)puVar32 & 0xffffffff;
        if ((char *)((long)puVar9 + uVar31 / 0xff + uVar31 + 8) <= pcVar1) {
          uVar30 = (uint)((long)puVar12 - (long)puVar32);
          uVar33 = uVar30 - 0xf;
          if (uVar30 < 0xf) {
            *(char *)param_3 = (char)(uVar30 << 4);
          }
          else {
            *(char *)param_3 = -0x10;
            puVar16 = puVar9;
            if (0xfe < uVar33) {
              uVar33 = ((int)puVar12 - (int)puVar32) - 0x10e;
              uVar28 = (ulong)uVar33 / 0xff;
              memset(puVar9,0xff,uVar28 + 1);
              puVar16 = (ulong *)((long)param_3 + uVar28 + 2);
              uVar33 = uVar33 + (int)uVar28;
            }
            puVar9 = (ulong *)((long)puVar16 + 1);
            *(char *)puVar16 = (char)uVar33;
          }
          uVar28 = uVar31;
          if (uVar31 < 9) {
            uVar28 = 8;
          }
          puVar16 = (ulong *)((long)puVar9 + uVar31);
          if ((0x18 < uVar31) && (0x1f < (ulong)((long)puVar9 - (long)puVar32))) {
            puVar27 = puVar9 + 2;
            pauVar22 = (undefined1 (*) [16])(puVar32 + 2);
            uVar31 = (uVar28 - 1 >> 3) + 1;
            uVar40 = uVar31 & 0x3ffffffffffffffc;
            uVar28 = uVar40;
            do {
              pauVar5 = pauVar22 + -1;
              uVar4 = *(ulong *)pauVar22[-1];
              auVar43 = *pauVar22;
              uVar28 = uVar28 - 4;
              pauVar22 = pauVar22 + 2;
              puVar27[-1] = *(ulong *)((long)*pauVar5 + 8);
              puVar27[-2] = uVar4;
              puVar27[1] = auVar43._8_8_;
              *puVar27 = auVar43._0_8_;
              puVar27 = puVar27 + 4;
            } while (uVar28 != 0);
            puVar32 = puVar32 + uVar40;
            puVar9 = puVar9 + uVar40;
            if (uVar31 == uVar40) goto LAB_008d3914;
          }
          do {
            puVar27 = puVar9 + 1;
            *puVar9 = *puVar32;
            puVar32 = puVar32 + 1;
            puVar9 = puVar27;
          } while (puVar27 < puVar16);
LAB_008d3914:
          iVar20 = uVar7 - uVar14;
          do {
            psVar35 = (short *)((long)puVar16 + 2);
            *(short *)puVar16 = (short)iVar20;
            if (puVar8 == puVar11) {
              puVar32 = (ulong *)((long)puVar23 + 4);
              puVar9 = (ulong *)((long)puVar12 + (lVar38 - (long)puVar23));
              puVar8 = puVar26;
              if (puVar9 <= puVar26) {
                puVar8 = puVar9;
              }
              puVar9 = (ulong *)((long)puVar12 + 4);
              puVar29 = (ulong *)((long)puVar8 - 7);
              puVar27 = puVar9;
              if (puVar9 < puVar29) {
                if (*puVar32 == *puVar9) {
                  puVar32 = (ulong *)((long)puVar23 + 0xc);
                  puVar27 = (ulong *)((long)puVar12 + 0xc);
                  goto joined_r0x008d3dac;
                }
                uVar31 = *puVar9 ^ *puVar32;
                uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
                uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
                uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
                uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
                uVar7 = (uint)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3;
              }
              else {
joined_r0x008d3dac:
                if (puVar27 < puVar29) {
                  iVar20 = ((int)puVar27 - (int)puVar12) + -4;
                  do {
                    if (*puVar32 != *puVar27) {
                      uVar31 = *puVar27 ^ *puVar32;
                      uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar31 & 0x5555555555555555) << 1;
                      uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 |
                               (uVar31 & 0x3333333333333333) << 2;
                      uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar31 & 0xffff0000ffff) << 0x10;
                      uVar7 = (int)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3) + iVar20;
                      goto LAB_008d3aec;
                    }
                    puVar27 = puVar27 + 1;
                    puVar32 = puVar32 + 1;
                    iVar20 = iVar20 + 8;
                  } while (puVar27 < puVar29);
                }
                if ((puVar27 < (ulong *)((long)puVar8 - 3U)) && ((int)*puVar32 == (int)*puVar27)) {
                  puVar27 = (ulong *)((long)puVar27 + 4);
                  puVar32 = (ulong *)((long)puVar32 + 4);
                }
                if ((puVar27 < (ulong *)((long)puVar8 - 1U)) && ((short)*puVar32 == (short)*puVar27)
                   ) {
                  puVar27 = (ulong *)((long)puVar27 + 2);
                  puVar32 = (ulong *)((long)puVar32 + 2);
                }
                if (puVar27 < puVar8) {
                  if ((char)*puVar32 == (char)*puVar27) {
                    puVar27 = (ulong *)((long)puVar27 + 1);
                  }
                }
                uVar7 = (int)puVar27 - (int)puVar9;
              }
LAB_008d3aec:
              puVar32 = (ulong *)((long)puVar12 + (ulong)uVar7 + 4);
              if (puVar32 == puVar8) {
                puVar9 = puVar8;
                puVar27 = param_2;
                if (puVar8 < puVar25) {
                  if (*param_2 == *puVar8) {
                    puVar9 = puVar8 + 1;
                    puVar27 = param_2 + 1;
                    goto LAB_008d3b2c;
                  }
                  uVar31 = *puVar8 ^ *param_2;
                  uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
                  uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
                  uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
                  uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10
                  ;
                  uVar33 = (uint)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3;
                }
                else {
LAB_008d3b2c:
                  if (puVar9 < puVar25) {
                    puVar12 = (ulong *)((long)puVar12 + (lVar38 - (long)puVar23));
                    if (puVar26 <= puVar12) {
                      puVar12 = puVar26;
                    }
                    iVar20 = (int)puVar9 - (int)puVar12;
                    do {
                      if (*puVar27 != *puVar9) {
                        uVar31 = *puVar9 ^ *puVar27;
                        uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                 (uVar31 & 0x5555555555555555) << 1;
                        uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 |
                                 (uVar31 & 0x3333333333333333) << 2;
                        uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                 (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                        uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 |
                                 (uVar31 & 0xff00ff00ff00ff) << 8;
                        uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 |
                                 (uVar31 & 0xffff0000ffff) << 0x10;
                        uVar33 = (int)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3) +
                                 iVar20;
                        goto LAB_008d3c0c;
                      }
                      puVar9 = puVar9 + 1;
                      puVar27 = puVar27 + 1;
                      iVar20 = iVar20 + 8;
                    } while (puVar9 < puVar25);
                  }
                  if ((puVar9 < puVar41) && ((int)*puVar27 == (int)*puVar9)) {
                    puVar9 = (ulong *)((long)puVar9 + 4);
                    puVar27 = (ulong *)((long)puVar27 + 4);
                  }
                  if ((puVar9 < puVar34) && ((short)*puVar27 == (short)*puVar9)) {
                    puVar9 = (ulong *)((long)puVar9 + 2);
                    puVar27 = (ulong *)((long)puVar27 + 2);
                  }
                  if (puVar9 < puVar26) {
                    if ((char)*puVar27 == (char)*puVar9) {
                      puVar9 = (ulong *)((long)puVar9 + 1);
                    }
                  }
                  uVar33 = (int)puVar9 - (int)puVar8;
                }
LAB_008d3c0c:
                puVar32 = (ulong *)((long)puVar32 + (ulong)uVar33);
                uVar7 = uVar33 + uVar7;
              }
            }
            else {
              puVar32 = (ulong *)((long)puVar12 + 4);
              puVar8 = (ulong *)((long)puVar23 + 4);
              puVar9 = puVar32;
              if (puVar32 < puVar25) {
                if (*puVar8 == *puVar32) {
                  puVar8 = (ulong *)((long)puVar23 + 0xc);
                  puVar9 = (ulong *)((long)puVar12 + 0xc);
                  goto joined_r0x008d3d9c;
                }
                uVar31 = *puVar32 ^ *puVar8;
                uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
                uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
                uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
                uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
                uVar7 = (uint)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3;
              }
              else {
joined_r0x008d3d9c:
                if (puVar9 < puVar25) {
                  iVar20 = ((int)puVar9 - (int)puVar12) + -4;
                  do {
                    if (*puVar8 != *puVar9) {
                      uVar31 = *puVar9 ^ *puVar8;
                      uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar31 & 0x5555555555555555) << 1;
                      uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 |
                               (uVar31 & 0x3333333333333333) << 2;
                      uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar31 & 0xffff0000ffff) << 0x10;
                      uVar7 = (int)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3) + iVar20;
                      goto LAB_008d3ab4;
                    }
                    puVar9 = puVar9 + 1;
                    puVar8 = puVar8 + 1;
                    iVar20 = iVar20 + 8;
                  } while (puVar9 < puVar25);
                }
                if (puVar9 < puVar41) {
                  if ((int)*puVar8 == (int)*puVar9) {
                    puVar9 = (ulong *)((long)puVar9 + 4);
                    puVar8 = (ulong *)((long)puVar8 + 4);
                  }
                }
                if (puVar9 < puVar34) {
                  if ((short)*puVar8 == (short)*puVar9) {
                    puVar9 = (ulong *)((long)puVar9 + 2);
                    puVar8 = (ulong *)((long)puVar8 + 2);
                  }
                }
                if (puVar9 < puVar26) {
                  if ((char)*puVar8 == (char)*puVar9) {
                    puVar9 = (ulong *)((long)puVar9 + 1);
                  }
                }
                uVar7 = (int)puVar9 - (int)puVar32;
              }
LAB_008d3ab4:
              puVar32 = (ulong *)((long)puVar12 + (ulong)uVar7 + 4);
            }
            if (pcVar1 < (char *)((long)puVar16 + (ulong)(uVar7 + 0xf0) / 0xff + 8)) break;
            uVar33 = uVar7 - 0xf;
            if (uVar7 < 0xf) {
              *(char *)param_3 = (char)*param_3 + (char)uVar7;
              param_3 = psVar35;
            }
            else {
              *(char *)param_3 = (char)*param_3 + '\x0f';
              psVar35[0] = -1;
              psVar35[1] = -1;
              if (0x3fb < uVar33) {
                uVar31 = (ulong)((uVar7 - 0x40b) / 0x3fc << 2);
                memset((char *)((long)puVar16 + 6),0xff,uVar31 + 4);
                uVar33 = (uVar7 - 0x40b) % 0x3fc;
                psVar35 = (short *)((char *)((long)puVar16 + 6) + uVar31);
              }
              uVar7 = (uVar33 & 0xffff) / 0xff;
              pcVar2 = (char *)((long)psVar35 + (ulong)uVar7);
              *pcVar2 = (char)uVar33 + (char)uVar7;
              param_3 = (short *)(pcVar2 + 1);
            }
            if (puVar42 <= puVar32) goto LAB_008d34ec;
            uVar31 = *puVar32 * -0x30e4432345000000 >> 0x34;
            *(int *)((long)param_1 +
                    ((ulong)(*(long *)((long)puVar32 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc))
                 = (int)(long *)((long)puVar32 + -2) - iVar19;
            uVar7 = *(uint *)((long)param_1 + uVar31 * 4);
            if (uVar7 < uVar10) {
              uVar7 = *(uint *)((long)__src + uVar31 * 4);
              puVar23 = (ulong *)(lVar24 + (ulong)uVar7);
              uVar7 = uVar7 + iVar37;
              puVar8 = puVar11;
            }
            else {
              puVar23 = (ulong *)(lVar36 + (ulong)uVar7);
              puVar8 = param_2;
            }
            uVar33 = (int)puVar32 - iVar19;
            *(uint *)((long)param_1 + uVar31 * 4) = uVar33;
            if ((uVar7 + 0xffff < uVar33) || ((int)*puVar23 != (int)*puVar32)) goto LAB_008d3704;
            iVar20 = uVar33 - uVar7;
            puVar16 = (ulong *)((long)param_3 + 1);
            *(char *)param_3 = '\0';
            puVar12 = puVar32;
          } while( true );
        }
        goto LAB_008d35b0;
      }
LAB_008d34ec:
      uVar31 = (long)param_2 + (uVar15 - (long)puVar32);
      if ((char *)((long)param_3 + (uVar31 + 0xf0) / 0xff + uVar31 + 1) <= pcVar1) {
        uVar28 = uVar31 - 0xf;
        if (uVar31 < 0xf) {
          *(char *)param_3 = (char)((int)uVar31 << 4);
        }
        else {
          psVar35 = (short *)((long)param_3 + 1);
          *(char *)param_3 = -0x10;
          if (0xfe < uVar28) {
            uVar28 = (long)param_2 + (uVar15 - (long)puVar32) + -0x10e;
            uVar15 = uVar28 / 0xff;
            memset(psVar35,0xff,uVar15 + 1);
            psVar35 = (short *)((long)param_3 + uVar15 + 2);
            uVar28 = uVar28 % 0xff;
          }
          *(char *)psVar35 = (char)uVar28;
          param_3 = psVar35;
        }
        memcpy((char *)((long)param_3 + 1),puVar32,uVar31);
        iVar37 = ((int)(char *)((long)param_3 + 1) + (int)uVar31) - iVar18;
        goto LAB_008d597c;
      }
      goto LAB_008d35b0;
    }
    if (param_5 < 1) goto LAB_008d2ae8;
LAB_008d3658:
    *(char *)param_3 = '\0';
    iVar37 = 1;
  }
LAB_008d597c:
  *(ulong **)((long)param_1 + 0x4000) = param_2;
  *(uint *)((long)param_1 + 0x4018) = param_4;
  return iVar37;
LAB_008d43d8:
  puVar32 = (ulong *)((long)puVar26 + (ulong)uVar33 + 6);
  puVar23 = (ulong *)((long)puVar26 + (ulong)uVar33 + 5);
  if (puVar12 < puVar32) goto LAB_008d2978;
  goto LAB_008d43ec;
LAB_008d3ef8:
  puVar32 = (ulong *)((long)puVar26 + (ulong)uVar7 + 6);
  puVar23 = (ulong *)((long)puVar26 + (ulong)uVar7 + 5);
  if (puVar12 < puVar32) goto LAB_008d2b44;
  goto LAB_008d3f0c;
code_r0x008d51b0:
  puVar32 = (ulong *)(lVar36 + uVar40);
  puVar9 = puVar23;
  if (uVar10 <= uVar3) {
    puVar9 = param_2;
  }
  if ((puVar9 < puVar32) && (*(char *)((long)puVar12 - 1) == *(char *)((long)puVar32 - 1))) {
    puVar8 = (ulong *)((long)puVar12 - 1);
    puVar16 = (ulong *)(lVar36 + uVar40 + -1);
    do {
      puVar32 = puVar16;
      puVar12 = puVar8;
      if ((puVar32 <= puVar9) || (puVar12 <= puVar11)) break;
      puVar8 = (ulong *)((long)puVar12 + -1);
      puVar16 = (ulong *)((long)puVar32 + -1);
    } while (*(char *)((long)puVar12 + -1) == *(char *)((long)puVar32 + -1));
  }
  uVar15 = (long)puVar12 - (long)puVar11 & 0xffffffff;
  puVar8 = (ulong *)((long)param_3 + 1);
  if (pcVar1 < (char *)((long)puVar8 + uVar15 / 0xff + uVar15 + 8)) goto LAB_008d35b0;
  uVar14 = (uint)((long)puVar12 - (long)puVar11);
  uVar30 = uVar14 - 0xf;
  if (uVar14 < 0xf) {
    *(char *)param_3 = (char)(uVar14 << 4);
  }
  else {
    *(char *)param_3 = -0x10;
    puVar16 = puVar8;
    if (0xfe < uVar30) {
      uVar30 = ((int)puVar12 - (int)puVar11) - 0x10e;
      uVar28 = (ulong)uVar30 / 0xff;
      memset(puVar8,0xff,uVar28 + 1);
      uVar30 = uVar30 + (int)uVar28;
      puVar16 = (ulong *)((long)param_3 + uVar28 + 2);
    }
    puVar8 = (ulong *)((long)puVar16 + 1);
    *(char *)puVar16 = (char)uVar30;
  }
  uVar28 = uVar15;
  if (uVar15 < 9) {
    uVar28 = 8;
  }
  puVar16 = (ulong *)((long)puVar8 + uVar15);
  if ((0x18 < uVar15) && (0x1f < (ulong)((long)puVar8 - (long)puVar11))) {
    puVar27 = puVar8 + 2;
    uVar15 = (uVar28 - 1 >> 3) + 1;
    uVar40 = uVar15 & 0x3ffffffffffffffc;
    pauVar22 = (undefined1 (*) [16])(puVar11 + 2);
    uVar28 = uVar40;
    do {
      pauVar5 = pauVar22 + -1;
      uVar4 = *(ulong *)pauVar22[-1];
      auVar43 = *pauVar22;
      uVar28 = uVar28 - 4;
      pauVar22 = pauVar22 + 2;
      puVar27[-1] = *(ulong *)((long)*pauVar5 + 8);
      puVar27[-2] = uVar4;
      puVar27[1] = auVar43._8_8_;
      *puVar27 = auVar43._0_8_;
      puVar27 = puVar27 + 4;
    } while (uVar28 != 0);
    puVar11 = puVar11 + uVar40;
    puVar8 = puVar8 + uVar40;
    if (uVar15 == uVar40) goto LAB_008d5340;
  }
  do {
    puVar27 = puVar8 + 1;
    *puVar8 = *puVar11;
    puVar11 = puVar11 + 1;
    puVar8 = puVar27;
  } while (puVar27 < puVar16);
LAB_008d5340:
  iVar19 = uVar33 - uVar3;
  do {
    psVar35 = (short *)((long)puVar16 + 2);
    *(short *)puVar16 = (short)iVar19;
    if (puVar9 == puVar23) {
      puVar11 = (ulong *)((long)puVar32 + 4);
      puVar9 = (ulong *)((long)puVar12 + (lVar24 - (long)puVar32));
      puVar8 = puVar25;
      if (puVar9 <= puVar25) {
        puVar8 = puVar9;
      }
      puVar9 = (ulong *)((long)puVar12 + 4);
      puVar29 = (ulong *)((long)puVar8 - 7);
      puVar27 = puVar9;
      if (puVar9 < puVar29) {
        if (*puVar11 == *puVar9) {
          puVar11 = (ulong *)((long)puVar32 + 0xc);
          puVar27 = (ulong *)((long)puVar12 + 0xc);
          goto joined_r0x008d5828;
        }
        uVar15 = *puVar9 ^ *puVar11;
        uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
        uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
        uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        uVar33 = (uint)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3;
      }
      else {
joined_r0x008d5828:
        if (puVar27 < puVar29) {
          iVar19 = ((int)puVar27 - (int)puVar12) + -4;
          do {
            if (*puVar11 != *puVar27) {
              uVar15 = *puVar27 ^ *puVar11;
              uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
              uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
              uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
              uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
              uVar33 = (int)((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) + iVar19;
              goto LAB_008d5578;
            }
            puVar27 = puVar27 + 1;
            puVar11 = puVar11 + 1;
            iVar19 = iVar19 + 8;
          } while (puVar27 < puVar29);
        }
        if ((puVar27 < (ulong *)((long)puVar8 - 3U)) && ((int)*puVar11 == (int)*puVar27)) {
          puVar27 = (ulong *)((long)puVar27 + 4);
          puVar11 = (ulong *)((long)puVar11 + 4);
        }
        if ((puVar27 < (ulong *)((long)puVar8 - 1U)) && ((short)*puVar11 == (short)*puVar27)) {
          puVar27 = (ulong *)((long)puVar27 + 2);
          puVar11 = (ulong *)((long)puVar11 + 2);
        }
        if (puVar27 < puVar8) {
          if ((char)*puVar11 == (char)*puVar27) {
            puVar27 = (ulong *)((long)puVar27 + 1);
          }
        }
        uVar33 = (int)puVar27 - (int)puVar9;
      }
LAB_008d5578:
      puVar11 = (ulong *)((long)puVar12 + (ulong)uVar33 + 4);
      if (puVar11 == puVar8) {
        puVar9 = puVar8;
        puVar27 = param_2;
        if (puVar8 < puVar41) {
          if (*param_2 == *puVar8) {
            puVar9 = puVar8 + 1;
            puVar27 = param_2 + 1;
            goto LAB_008d55b8;
          }
          uVar15 = *puVar8 ^ *param_2;
          uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
          uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
          uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
          uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
          uVar30 = (uint)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3;
        }
        else {
LAB_008d55b8:
          if (puVar9 < puVar41) {
            puVar12 = (ulong *)((long)puVar12 + (lVar24 - (long)puVar32));
            if (puVar25 <= puVar12) {
              puVar12 = puVar25;
            }
            iVar19 = (int)puVar9 - (int)puVar12;
            do {
              if (*puVar27 != *puVar9) {
                uVar15 = *puVar9 ^ *puVar27;
                uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
                uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
                uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
                uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
                uVar30 = (int)((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) + iVar19;
                goto LAB_008d56a0;
              }
              puVar9 = puVar9 + 1;
              puVar27 = puVar27 + 1;
              iVar19 = iVar19 + 8;
            } while (puVar9 < puVar41);
          }
          if (puVar9 < puVar34) {
            if ((int)*puVar27 == (int)*puVar9) {
              puVar9 = (ulong *)((long)puVar9 + 4);
              puVar27 = (ulong *)((long)puVar27 + 4);
            }
          }
          if (puVar9 < puVar26) {
            if ((short)*puVar27 == (short)*puVar9) {
              puVar9 = (ulong *)((long)puVar9 + 2);
              puVar27 = (ulong *)((long)puVar27 + 2);
            }
          }
          if (puVar9 < puVar25) {
            if ((char)*puVar27 == (char)*puVar9) {
              puVar9 = (ulong *)((long)puVar9 + 1);
            }
          }
          uVar30 = (int)puVar9 - (int)puVar8;
        }
LAB_008d56a0:
        puVar11 = (ulong *)((long)puVar11 + (ulong)uVar30);
        uVar33 = uVar30 + uVar33;
      }
    }
    else {
      puVar11 = (ulong *)((long)puVar12 + 4);
      puVar8 = (ulong *)((long)puVar32 + 4);
      puVar9 = puVar11;
      if (puVar11 < puVar41) {
        if (*puVar8 == *puVar11) {
          puVar8 = (ulong *)((long)puVar32 + 0xc);
          puVar9 = (ulong *)((long)puVar12 + 0xc);
          goto joined_r0x008d5818;
        }
        uVar15 = *puVar11 ^ *puVar8;
        uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
        uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
        uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        uVar33 = (uint)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3;
      }
      else {
joined_r0x008d5818:
        if (puVar9 < puVar41) {
          iVar19 = ((int)puVar9 - (int)puVar12) + -4;
          do {
            if (*puVar8 != *puVar9) {
              uVar15 = *puVar9 ^ *puVar8;
              uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
              uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
              uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
              uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
              uVar33 = (int)((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) + iVar19;
              goto LAB_008d5544;
            }
            puVar9 = puVar9 + 1;
            puVar8 = puVar8 + 1;
            iVar19 = iVar19 + 8;
          } while (puVar9 < puVar41);
        }
        if (puVar9 < puVar34) {
          if ((int)*puVar8 == (int)*puVar9) {
            puVar9 = (ulong *)((long)puVar9 + 4);
            puVar8 = (ulong *)((long)puVar8 + 4);
          }
        }
        if (puVar9 < puVar26) {
          if ((short)*puVar8 == (short)*puVar9) {
            puVar9 = (ulong *)((long)puVar9 + 2);
            puVar8 = (ulong *)((long)puVar8 + 2);
          }
        }
        if (puVar9 < puVar25) {
          if ((char)*puVar8 == (char)*puVar9) {
            puVar9 = (ulong *)((long)puVar9 + 1);
          }
        }
        uVar33 = (int)puVar9 - (int)puVar11;
      }
LAB_008d5544:
      puVar11 = (ulong *)((long)puVar12 + (ulong)uVar33 + 4);
    }
    if (pcVar1 < (char *)((long)puVar16 + (ulong)(uVar33 + 0xf0) / 0xff + 8)) goto LAB_008d2ae8;
    uVar30 = uVar33 - 0xf;
    if (uVar33 < 0xf) {
      *(char *)param_3 = (char)*param_3 + (char)uVar33;
      param_3 = psVar35;
    }
    else {
      *(char *)param_3 = (char)*param_3 + '\x0f';
      psVar35[0] = -1;
      psVar35[1] = -1;
      if (0x3fb < uVar30) {
        uVar15 = (ulong)((uVar33 - 0x40b) / 0x3fc << 2);
        memset((char *)((long)puVar16 + 6),0xff,uVar15 + 4);
        uVar30 = (uVar33 - 0x40b) % 0x3fc;
        psVar35 = (short *)((char *)((long)puVar16 + 6) + uVar15);
      }
      uVar33 = (uVar30 & 0xffff) / 0xff;
      pcVar2 = (char *)((long)psVar35 + (ulong)uVar33);
      *pcVar2 = (char)uVar30 + (char)uVar33;
      param_3 = (short *)(pcVar2 + 1);
    }
    if (puVar42 <= puVar11) goto LAB_008d2a3c;
    uVar15 = *puVar11 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
    uVar30 = (int)puVar11 - iVar37;
    *(int *)((long)param_1 +
            ((ulong)(*(long *)((long)puVar11 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)puVar11 + -2) - iVar37;
    uVar33 = *(uint *)((long)param_1 + uVar15);
    *(uint *)((long)param_1 + uVar15) = uVar30;
    puVar9 = puVar23;
    lVar36 = lVar21;
    if (uVar10 <= uVar33) {
      puVar9 = param_2;
      lVar36 = lVar38;
    }
    if ((uVar33 < uVar10 - uVar7 || uVar33 + 0xffff < uVar30) ||
       (puVar32 = (ulong *)(lVar36 + (ulong)uVar33), (int)*puVar32 != (int)*puVar11)) break;
    iVar19 = uVar30 - uVar33;
    puVar16 = (ulong *)((long)param_3 + 1);
    *(char *)param_3 = '\0';
    puVar12 = puVar11;
  } while( true );
  puVar32 = (ulong *)((long)puVar11 + 2);
  puVar12 = (ulong *)((long)puVar11 + 1);
  uVar33 = (int)puVar12 - iVar37;
  if (puVar42 < puVar32) goto LAB_008d2a3c;
  goto LAB_008d5140;
code_r0x008d49d4:
  puVar12 = (ulong *)(lVar36 + uVar40);
  puVar9 = puVar23;
  if (uVar10 <= uVar14) {
    puVar9 = param_2;
  }
  if ((puVar9 < puVar12) && (*(char *)((long)puVar32 - 1) == *(char *)((long)puVar12 - 1))) {
    puVar8 = (ulong *)((long)puVar32 - 1);
    puVar16 = (ulong *)(lVar36 + uVar40 + -1);
    do {
      puVar12 = puVar16;
      puVar32 = puVar8;
      if ((puVar12 <= puVar9) || (puVar32 <= puVar11)) break;
      puVar8 = (ulong *)((long)puVar32 + -1);
      puVar16 = (ulong *)((long)puVar12 + -1);
    } while (*(char *)((long)puVar32 + -1) == *(char *)((long)puVar12 + -1));
  }
  puVar8 = (ulong *)((long)param_3 + 1);
  uVar15 = (long)puVar32 - (long)puVar11 & 0xffffffff;
  if (pcVar1 < (char *)((long)puVar8 + uVar15 / 0xff + uVar15 + 8)) goto LAB_008d35b0;
  uVar30 = (uint)((long)puVar32 - (long)puVar11);
  uVar33 = uVar30 - 0xf;
  if (uVar30 < 0xf) {
    *(char *)param_3 = (char)(uVar30 << 4);
  }
  else {
    *(char *)param_3 = -0x10;
    puVar16 = puVar8;
    if (0xfe < uVar33) {
      uVar33 = ((int)puVar32 - (int)puVar11) - 0x10e;
      uVar28 = (ulong)uVar33 / 0xff;
      memset(puVar8,0xff,uVar28 + 1);
      uVar33 = uVar33 + (int)uVar28;
      puVar16 = (ulong *)((long)param_3 + uVar28 + 2);
    }
    puVar8 = (ulong *)((long)puVar16 + 1);
    *(char *)puVar16 = (char)uVar33;
  }
  uVar28 = uVar15;
  if (uVar15 < 9) {
    uVar28 = 8;
  }
  puVar16 = (ulong *)((long)puVar8 + uVar15);
  if ((0x18 < uVar15) && (0x1f < (ulong)((long)puVar8 - (long)puVar11))) {
    puVar27 = puVar8 + 2;
    pauVar22 = (undefined1 (*) [16])(puVar11 + 2);
    uVar15 = (uVar28 - 1 >> 3) + 1;
    uVar40 = uVar15 & 0x3ffffffffffffffc;
    uVar28 = uVar40;
    do {
      pauVar5 = pauVar22 + -1;
      uVar4 = *(ulong *)pauVar22[-1];
      auVar43 = *pauVar22;
      uVar28 = uVar28 - 4;
      pauVar22 = pauVar22 + 2;
      puVar27[-1] = *(ulong *)((long)*pauVar5 + 8);
      puVar27[-2] = uVar4;
      puVar27[1] = auVar43._8_8_;
      *puVar27 = auVar43._0_8_;
      puVar27 = puVar27 + 4;
    } while (uVar28 != 0);
    puVar11 = puVar11 + uVar40;
    puVar8 = puVar8 + uVar40;
    if (uVar15 == uVar40) goto LAB_008d4b50;
  }
  do {
    puVar27 = puVar8 + 1;
    *puVar8 = *puVar11;
    puVar11 = puVar11 + 1;
    puVar8 = puVar27;
  } while (puVar27 < puVar16);
LAB_008d4b50:
  iVar19 = uVar7 - uVar14;
  do {
    psVar35 = (short *)((long)puVar16 + 2);
    *(short *)puVar16 = (short)iVar19;
    if (puVar9 == puVar23) {
      puVar11 = (ulong *)((long)puVar12 + 4);
      puVar9 = (ulong *)((long)puVar32 + (lVar24 - (long)puVar12));
      puVar8 = puVar26;
      if (puVar9 <= puVar26) {
        puVar8 = puVar9;
      }
      puVar9 = (ulong *)((long)puVar32 + 4);
      puVar29 = (ulong *)((long)puVar8 - 7);
      puVar27 = puVar9;
      if (puVar9 < puVar29) {
        if (*puVar11 == *puVar9) {
          puVar11 = (ulong *)((long)puVar12 + 0xc);
          puVar27 = (ulong *)((long)puVar32 + 0xc);
          goto joined_r0x008d4fd0;
        }
        uVar15 = *puVar9 ^ *puVar11;
        uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
        uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
        uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        uVar7 = (uint)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3;
      }
      else {
joined_r0x008d4fd0:
        if (puVar27 < puVar29) {
          iVar19 = ((int)puVar27 - (int)puVar32) + -4;
          do {
            if (*puVar11 != *puVar27) {
              uVar15 = *puVar27 ^ *puVar11;
              uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
              uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
              uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
              uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
              uVar7 = (int)((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) + iVar19;
              goto LAB_008d4d24;
            }
            puVar27 = puVar27 + 1;
            puVar11 = puVar11 + 1;
            iVar19 = iVar19 + 8;
          } while (puVar27 < puVar29);
        }
        if ((puVar27 < (ulong *)((long)puVar8 - 3U)) && ((int)*puVar11 == (int)*puVar27)) {
          puVar27 = (ulong *)((long)puVar27 + 4);
          puVar11 = (ulong *)((long)puVar11 + 4);
        }
        if ((puVar27 < (ulong *)((long)puVar8 - 1U)) && ((short)*puVar11 == (short)*puVar27)) {
          puVar27 = (ulong *)((long)puVar27 + 2);
          puVar11 = (ulong *)((long)puVar11 + 2);
        }
        if (puVar27 < puVar8) {
          if ((char)*puVar11 == (char)*puVar27) {
            puVar27 = (ulong *)((long)puVar27 + 1);
          }
        }
        uVar7 = (int)puVar27 - (int)puVar9;
      }
LAB_008d4d24:
      puVar11 = (ulong *)((long)puVar32 + (ulong)uVar7 + 4);
      if (puVar11 == puVar8) {
        puVar9 = puVar8;
        puVar27 = param_2;
        if (puVar8 < puVar42) {
          if (*param_2 == *puVar8) {
            puVar9 = puVar8 + 1;
            puVar27 = param_2 + 1;
            goto LAB_008d4d64;
          }
          uVar15 = *puVar8 ^ *param_2;
          uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
          uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
          uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
          uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
          uVar33 = (uint)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3;
        }
        else {
LAB_008d4d64:
          if (puVar9 < puVar42) {
            puVar32 = (ulong *)((long)puVar32 + (lVar24 - (long)puVar12));
            if (puVar26 <= puVar32) {
              puVar32 = puVar26;
            }
            iVar19 = (int)puVar9 - (int)puVar32;
            do {
              if (*puVar27 != *puVar9) {
                uVar15 = *puVar9 ^ *puVar27;
                uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
                uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
                uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
                uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
                uVar33 = (int)((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) + iVar19;
                goto LAB_008d4e4c;
              }
              puVar9 = puVar9 + 1;
              puVar27 = puVar27 + 1;
              iVar19 = iVar19 + 8;
            } while (puVar9 < puVar42);
          }
          if (puVar9 < puVar41) {
            if ((int)*puVar27 == (int)*puVar9) {
              puVar9 = (ulong *)((long)puVar9 + 4);
              puVar27 = (ulong *)((long)puVar27 + 4);
            }
          }
          if (puVar9 < puVar34) {
            if ((short)*puVar27 == (short)*puVar9) {
              puVar9 = (ulong *)((long)puVar9 + 2);
              puVar27 = (ulong *)((long)puVar27 + 2);
            }
          }
          if (puVar9 < puVar26) {
            if ((char)*puVar27 == (char)*puVar9) {
              puVar9 = (ulong *)((long)puVar9 + 1);
            }
          }
          uVar33 = (int)puVar9 - (int)puVar8;
        }
LAB_008d4e4c:
        puVar11 = (ulong *)((long)puVar11 + (ulong)uVar33);
        uVar7 = uVar33 + uVar7;
      }
    }
    else {
      puVar11 = (ulong *)((long)puVar32 + 4);
      puVar8 = (ulong *)((long)puVar12 + 4);
      puVar9 = puVar11;
      if (puVar11 < puVar42) {
        if (*puVar8 == *puVar11) {
          puVar8 = (ulong *)((long)puVar12 + 0xc);
          puVar9 = (ulong *)((long)puVar32 + 0xc);
          goto joined_r0x008d4fc0;
        }
        uVar15 = *puVar11 ^ *puVar8;
        uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
        uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
        uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        uVar7 = (uint)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3;
      }
      else {
joined_r0x008d4fc0:
        if (puVar9 < puVar42) {
          iVar19 = ((int)puVar9 - (int)puVar32) + -4;
          do {
            if (*puVar8 != *puVar9) {
              uVar15 = *puVar9 ^ *puVar8;
              uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
              uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
              uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
              uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
              uVar7 = (int)((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) + iVar19;
              goto LAB_008d4cec;
            }
            puVar9 = puVar9 + 1;
            puVar8 = puVar8 + 1;
            iVar19 = iVar19 + 8;
          } while (puVar9 < puVar42);
        }
        if (puVar9 < puVar41) {
          if ((int)*puVar8 == (int)*puVar9) {
            puVar9 = (ulong *)((long)puVar9 + 4);
            puVar8 = (ulong *)((long)puVar8 + 4);
          }
        }
        if (puVar9 < puVar34) {
          if ((short)*puVar8 == (short)*puVar9) {
            puVar9 = (ulong *)((long)puVar9 + 2);
            puVar8 = (ulong *)((long)puVar8 + 2);
          }
        }
        if (puVar9 < puVar26) {
          if ((char)*puVar8 == (char)*puVar9) {
            puVar9 = (ulong *)((long)puVar9 + 1);
          }
        }
        uVar7 = (int)puVar9 - (int)puVar11;
      }
LAB_008d4cec:
      puVar11 = (ulong *)((long)puVar32 + (ulong)uVar7 + 4);
    }
    if (pcVar1 < (char *)((long)puVar16 + (ulong)(uVar7 + 0xf0) / 0xff + 8)) goto LAB_008d2c68;
    uVar33 = uVar7 - 0xf;
    if (uVar7 < 0xf) {
      *(char *)param_3 = (char)*param_3 + (char)uVar7;
      param_3 = psVar35;
    }
    else {
      *(char *)param_3 = (char)*param_3 + '\x0f';
      psVar35[0] = -1;
      psVar35[1] = -1;
      if (0x3fb < uVar33) {
        uVar15 = (ulong)((uVar7 - 0x40b) / 0x3fc << 2);
        memset((char *)((long)puVar16 + 6),0xff,uVar15 + 4);
        uVar33 = (uVar7 - 0x40b) % 0x3fc;
        psVar35 = (short *)((char *)((long)puVar16 + 6) + uVar15);
      }
      uVar7 = (uVar33 & 0xffff) / 0xff;
      pcVar2 = (char *)((long)psVar35 + (ulong)uVar7);
      *pcVar2 = (char)uVar33 + (char)uVar7;
      param_3 = (short *)(pcVar2 + 1);
    }
    if (puVar25 <= puVar11) goto LAB_008d2c3c;
    uVar15 = *puVar11 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
    uVar33 = (int)puVar11 - iVar37;
    *(int *)((long)param_1 +
            ((ulong)(*(long *)((long)puVar11 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)puVar11 + -2) - iVar37;
    uVar7 = *(uint *)((long)param_1 + uVar15);
    *(uint *)((long)param_1 + uVar15) = uVar33;
    puVar9 = puVar23;
    lVar36 = lVar21;
    if (uVar10 <= uVar7) {
      puVar9 = param_2;
      lVar36 = lVar38;
    }
    if ((uVar7 + 0xffff < uVar33) ||
       (puVar12 = (ulong *)(lVar36 + (ulong)uVar7), (int)*puVar12 != (int)*puVar11)) break;
    iVar19 = uVar33 - uVar7;
    puVar16 = (ulong *)((long)param_3 + 1);
    *(char *)param_3 = '\0';
    puVar32 = puVar11;
  } while( true );
  puVar12 = (ulong *)((long)puVar11 + 2);
  puVar32 = (ulong *)((long)puVar11 + 1);
  uVar7 = (int)puVar32 - iVar37;
  if (puVar25 < puVar12) goto LAB_008d2c3c;
  goto LAB_008d4968;
code_r0x008d2dd8:
  puVar11 = (ulong *)(lVar21 + uVar40);
  puVar9 = puVar23;
  if (uVar7 <= uVar14) {
    puVar9 = param_2;
  }
  if ((puVar9 < puVar11) && (*(char *)((long)puVar32 - 1) == *(char *)((long)puVar11 - 1))) {
    puVar8 = (ulong *)((long)puVar32 - 1);
    puVar16 = (ulong *)(lVar21 + uVar40 + -1);
    do {
      puVar11 = puVar16;
      puVar32 = puVar8;
      if ((puVar11 <= puVar9) || (puVar32 <= puVar42)) break;
      puVar8 = (ulong *)((long)puVar32 + -1);
      puVar16 = (ulong *)((long)puVar11 + -1);
    } while (*(char *)((long)puVar32 + -1) == *(char *)((long)puVar11 + -1));
  }
  uVar15 = (long)puVar32 - (long)puVar42 & 0xffffffff;
  puVar8 = (ulong *)((long)param_3 + 1);
  if (pcVar1 < (char *)((long)puVar8 + uVar15 / 0xff + uVar15 + 8)) goto LAB_008d35b0;
  uVar30 = (uint)((long)puVar32 - (long)puVar42);
  uVar33 = uVar30 - 0xf;
  if (uVar30 < 0xf) {
    *(char *)param_3 = (char)(uVar30 << 4);
  }
  else {
    *(char *)param_3 = -0x10;
    puVar16 = puVar8;
    if (0xfe < uVar33) {
      uVar33 = ((int)puVar32 - (int)puVar42) - 0x10e;
      uVar28 = (ulong)uVar33 / 0xff;
      memset(puVar8,0xff,uVar28 + 1);
      uVar33 = uVar33 + (int)uVar28;
      puVar16 = (ulong *)((long)param_3 + uVar28 + 2);
    }
    puVar8 = (ulong *)((long)puVar16 + 1);
    *(char *)puVar16 = (char)uVar33;
  }
  uVar28 = uVar15;
  if (uVar15 < 9) {
    uVar28 = 8;
  }
  puVar16 = (ulong *)((long)puVar8 + uVar15);
  if ((0x18 < uVar15) && (0x1f < (ulong)((long)puVar8 - (long)puVar42))) {
    puVar27 = puVar8 + 2;
    uVar15 = (uVar28 - 1 >> 3) + 1;
    uVar40 = uVar15 & 0x3ffffffffffffffc;
    pauVar22 = (undefined1 (*) [16])(puVar42 + 2);
    uVar28 = uVar40;
    do {
      pauVar5 = pauVar22 + -1;
      uVar4 = *(ulong *)pauVar22[-1];
      auVar43 = *pauVar22;
      uVar28 = uVar28 - 4;
      pauVar22 = pauVar22 + 2;
      puVar27[-1] = *(ulong *)((long)*pauVar5 + 8);
      puVar27[-2] = uVar4;
      puVar27[1] = auVar43._8_8_;
      *puVar27 = auVar43._0_8_;
      puVar27 = puVar27 + 4;
    } while (uVar28 != 0);
    puVar42 = puVar42 + uVar40;
    puVar8 = puVar8 + uVar40;
    if (uVar15 == uVar40) goto LAB_008d2f60;
  }
  do {
    puVar27 = puVar8 + 1;
    *puVar8 = *puVar42;
    puVar42 = puVar42 + 1;
    puVar8 = puVar27;
  } while (puVar27 < puVar16);
LAB_008d2f60:
  iVar19 = uVar10 - uVar14;
  do {
    psVar35 = (short *)((long)puVar16 + 2);
    *(short *)puVar16 = (short)iVar19;
    if (puVar9 == puVar23) {
      puVar42 = (ulong *)((long)puVar11 + 4);
      puVar9 = (ulong *)((long)puVar32 + (lVar24 - (long)puVar11));
      puVar8 = puVar34;
      if (puVar9 <= puVar34) {
        puVar8 = puVar9;
      }
      puVar9 = (ulong *)((long)puVar32 + 4);
      puVar29 = (ulong *)((long)puVar8 - 7);
      puVar27 = puVar9;
      if (puVar9 < puVar29) {
        if (*puVar42 == *puVar9) {
          puVar42 = (ulong *)((long)puVar11 + 0xc);
          puVar27 = (ulong *)((long)puVar32 + 0xc);
          goto joined_r0x008d3444;
        }
        uVar15 = *puVar9 ^ *puVar42;
        uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
        uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
        uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        uVar10 = (uint)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3;
      }
      else {
joined_r0x008d3444:
        if (puVar27 < puVar29) {
          iVar19 = ((int)puVar27 - (int)puVar32) + -4;
          do {
            if (*puVar42 != *puVar27) {
              uVar15 = *puVar27 ^ *puVar42;
              uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
              uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
              uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
              uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
              uVar10 = (int)((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) + iVar19;
              goto LAB_008d318c;
            }
            puVar27 = puVar27 + 1;
            puVar42 = puVar42 + 1;
            iVar19 = iVar19 + 8;
          } while (puVar27 < puVar29);
        }
        if ((puVar27 < (ulong *)((long)puVar8 - 3U)) && ((int)*puVar42 == (int)*puVar27)) {
          puVar27 = (ulong *)((long)puVar27 + 4);
          puVar42 = (ulong *)((long)puVar42 + 4);
        }
        if ((puVar27 < (ulong *)((long)puVar8 - 1U)) && ((short)*puVar42 == (short)*puVar27)) {
          puVar27 = (ulong *)((long)puVar27 + 2);
          puVar42 = (ulong *)((long)puVar42 + 2);
        }
        if (puVar27 < puVar8) {
          if ((char)*puVar42 == (char)*puVar27) {
            puVar27 = (ulong *)((long)puVar27 + 1);
          }
        }
        uVar10 = (int)puVar27 - (int)puVar9;
      }
LAB_008d318c:
      puVar42 = (ulong *)((long)puVar32 + (ulong)uVar10 + 4);
      if (puVar42 == puVar8) {
        puVar9 = puVar8;
        puVar27 = param_2;
        if (puVar8 < puVar41) {
          if (*param_2 == *puVar8) {
            puVar9 = puVar8 + 1;
            puVar27 = param_2 + 1;
            goto LAB_008d31cc;
          }
          uVar15 = *puVar8 ^ *param_2;
          uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
          uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
          uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
          uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
          uVar33 = (uint)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3;
        }
        else {
LAB_008d31cc:
          if (puVar9 < puVar41) {
            puVar32 = (ulong *)((long)puVar32 + (lVar24 - (long)puVar11));
            if (puVar34 <= puVar32) {
              puVar32 = puVar34;
            }
            iVar19 = (int)puVar9 - (int)puVar32;
            do {
              if (*puVar27 != *puVar9) {
                uVar15 = *puVar9 ^ *puVar27;
                uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
                uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
                uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
                uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
                uVar33 = (int)((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) + iVar19;
                goto LAB_008d32b0;
              }
              puVar9 = puVar9 + 1;
              puVar27 = puVar27 + 1;
              iVar19 = iVar19 + 8;
            } while (puVar9 < puVar41);
          }
          if (puVar9 < puVar25) {
            if ((int)*puVar27 == (int)*puVar9) {
              puVar9 = (ulong *)((long)puVar9 + 4);
              puVar27 = (ulong *)((long)puVar27 + 4);
            }
          }
          if (puVar9 < puVar26) {
            if ((short)*puVar27 == (short)*puVar9) {
              puVar9 = (ulong *)((long)puVar9 + 2);
              puVar27 = (ulong *)((long)puVar27 + 2);
            }
          }
          if (puVar9 < puVar34) {
            if ((char)*puVar27 == (char)*puVar9) {
              puVar9 = (ulong *)((long)puVar9 + 1);
            }
          }
          uVar33 = (int)puVar9 - (int)puVar8;
        }
LAB_008d32b0:
        puVar42 = (ulong *)((long)puVar42 + (ulong)uVar33);
        uVar10 = uVar33 + uVar10;
      }
    }
    else {
      puVar42 = (ulong *)((long)puVar32 + 4);
      puVar8 = (ulong *)((long)puVar11 + 4);
      puVar9 = puVar42;
      if (puVar42 < puVar41) {
        if (*puVar8 == *puVar42) {
          puVar8 = (ulong *)((long)puVar11 + 0xc);
          puVar9 = (ulong *)((long)puVar32 + 0xc);
          goto joined_r0x008d3434;
        }
        uVar15 = *puVar42 ^ *puVar8;
        uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
        uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
        uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        uVar10 = (uint)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3;
      }
      else {
joined_r0x008d3434:
        if (puVar9 < puVar41) {
          iVar19 = ((int)puVar9 - (int)puVar32) + -4;
          do {
            if (*puVar8 != *puVar9) {
              uVar15 = *puVar9 ^ *puVar8;
              uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
              uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
              uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
              uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
              uVar10 = (int)((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) + iVar19;
              goto LAB_008d3158;
            }
            puVar9 = puVar9 + 1;
            puVar8 = puVar8 + 1;
            iVar19 = iVar19 + 8;
          } while (puVar9 < puVar41);
        }
        if (puVar9 < puVar25) {
          if ((int)*puVar8 == (int)*puVar9) {
            puVar9 = (ulong *)((long)puVar9 + 4);
            puVar8 = (ulong *)((long)puVar8 + 4);
          }
        }
        if (puVar9 < puVar26) {
          if ((short)*puVar8 == (short)*puVar9) {
            puVar9 = (ulong *)((long)puVar9 + 2);
            puVar8 = (ulong *)((long)puVar8 + 2);
          }
        }
        if (puVar9 < puVar34) {
          if ((char)*puVar8 == (char)*puVar9) {
            puVar9 = (ulong *)((long)puVar9 + 1);
          }
        }
        uVar10 = (int)puVar9 - (int)puVar42;
      }
LAB_008d3158:
      puVar42 = (ulong *)((long)puVar32 + (ulong)uVar10 + 4);
    }
    if (pcVar1 < (char *)((long)puVar16 + (ulong)(uVar10 + 0xf0) / 0xff + 8)) {
      iVar37 = 0;
      goto LAB_008d597c;
    }
    uVar33 = uVar10 - 0xf;
    if (uVar10 < 0xf) {
      *(char *)param_3 = (char)*param_3 + (char)uVar10;
      param_3 = psVar35;
    }
    else {
      *(char *)param_3 = (char)*param_3 + '\x0f';
      psVar35[0] = -1;
      psVar35[1] = -1;
      if (0x3fb < uVar33) {
        uVar15 = (ulong)((uVar10 - 0x40b) / 0x3fc << 2);
        memset((char *)((long)puVar16 + 6),0xff,uVar15 + 4);
        uVar33 = (uVar10 - 0x40b) % 0x3fc;
        psVar35 = (short *)((char *)((long)puVar16 + 6) + uVar15);
      }
      uVar10 = (uVar33 & 0xffff) / 0xff;
      pcVar2 = (char *)((long)psVar35 + (ulong)uVar10);
      param_3 = (short *)(pcVar2 + 1);
      *pcVar2 = (char)uVar33 + (char)uVar10;
    }
    if (puVar12 <= puVar42) goto LAB_008d3584;
    uVar15 = *puVar42 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
    uVar33 = (int)puVar42 - iVar37;
    *(int *)((long)param_1 +
            ((ulong)(*(long *)((long)puVar42 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
         (int)(long *)((long)puVar42 + -2) - iVar37;
    uVar10 = *(uint *)((long)param_1 + uVar15);
    *(uint *)((long)param_1 + uVar15) = uVar33;
    puVar9 = puVar23;
    lVar21 = lVar36;
    if (uVar7 <= uVar10) {
      puVar9 = param_2;
      lVar21 = lVar38;
    }
    if ((uVar10 + 0xffff < uVar33) ||
       (puVar11 = (ulong *)(lVar21 + (ulong)uVar10), (int)*puVar11 != (int)*puVar42)) break;
    iVar19 = uVar33 - uVar10;
    puVar16 = (ulong *)((long)param_3 + 1);
    *(char *)param_3 = '\0';
    puVar32 = puVar42;
  } while( true );
  puVar11 = (ulong *)((long)puVar42 + 2);
  puVar32 = (ulong *)((long)puVar42 + 1);
  uVar10 = (int)puVar32 - iVar37;
  if (puVar12 < puVar11) goto LAB_008d3584;
  goto LAB_008d2d6c;
LAB_008d3584:
  uVar15 = (long)param_2 + (uVar31 - (long)puVar42);
  if ((char *)((long)param_3 + (uVar15 + 0xf0) / 0xff + uVar15 + 1) <= pcVar1) {
    uVar28 = uVar15 - 0xf;
    if (uVar15 < 0xf) {
      *(char *)param_3 = (char)((int)uVar15 << 4);
    }
    else {
      psVar35 = (short *)((long)param_3 + 1);
      *(char *)param_3 = -0x10;
      if (0xfe < uVar28) {
        uVar28 = (long)param_2 + (uVar31 - (long)puVar42) + -0x10e;
        uVar31 = uVar28 / 0xff;
        memset(psVar35,0xff,uVar31 + 1);
        psVar35 = (short *)((long)param_3 + uVar31 + 2);
        uVar28 = uVar28 % 0xff;
      }
      *(char *)psVar35 = (char)uVar28;
      param_3 = psVar35;
    }
    memcpy((char *)((long)param_3 + 1),puVar42,uVar15);
    iVar37 = (int)(char *)((long)param_3 + 1) + (int)uVar15;
LAB_008d5970:
    iVar37 = iVar37 - iVar18;
    goto LAB_008d597c;
  }
LAB_008d35b0:
  iVar37 = 0;
  goto LAB_008d597c;
LAB_008d3704:
  puVar23 = (ulong *)((long)puVar32 + 2);
  puVar12 = (ulong *)((long)puVar32 + 1);
  uVar7 = (int)puVar12 - iVar19;
  if (puVar42 < puVar23) goto LAB_008d34ec;
  goto LAB_008d3724;
}

