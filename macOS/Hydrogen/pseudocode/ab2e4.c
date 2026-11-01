
/* WARNING: Type propagation algorithm not settling */

int FUN_000ab2e4(long param_1,ulong *param_2,short *param_3,uint param_4,int param_5,uint param_6)

{
  char *pcVar1;
  char *pcVar2;
  uint *puVar3;
  uint uVar4;
  ulong uVar5;
  int *piVar6;
  int iVar7;
  ulong *puVar8;
  ulong *puVar9;
  uint uVar10;
  ulong *puVar11;
  long lVar12;
  ulong *puVar13;
  long lVar14;
  ulong *puVar15;
  char cVar16;
  ulong uVar17;
  ulong *puVar18;
  long *plVar19;
  ulong *puVar20;
  uint uVar21;
  long lVar22;
  ulong *puVar23;
  ulong uVar24;
  ulong *puVar25;
  uint uVar26;
  ulong *puVar27;
  ulong *puVar28;
  int iVar29;
  int iVar30;
  ulong uVar31;
  undefined1 (*pauVar32) [16];
  ulong *puVar33;
  ulong *puVar34;
  uint uVar35;
  uint uVar36;
  ulong uVar37;
  int *piVar38;
  int iVar39;
  ulong *puVar40;
  short *psVar41;
  long lVar42;
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  
  puVar3 = (uint *)(&UNK_00004010 + param_1);
  uVar17 = (ulong)*(uint *)(&UNK_00004018 + param_1);
  if (*(uint *)(&UNK_00004018 + param_1) == 0) {
    puVar13 = (ulong *)0x0;
    uVar10 = *puVar3;
  }
  else {
    puVar13 = (ulong *)(*(long *)(param_1 + 0x4000) + uVar17);
    uVar10 = *puVar3;
  }
  if (0x80000000 < uVar10 + param_4) {
    lVar12 = 0;
    lVar22 = *(long *)(param_1 + 0x4000);
    iVar7 = uVar10 - 0x10000;
    do {
      pauVar32 = (undefined1 (*) [16])(param_1 + lVar12);
      auVar43._4_4_ = iVar7;
      auVar43._0_4_ = iVar7;
      auVar43._8_4_ = iVar7;
      auVar43._12_4_ = iVar7;
      auVar43 = NEON_uqsub(*pauVar32,auVar43,4);
      auVar44._4_4_ = iVar7;
      auVar44._0_4_ = iVar7;
      auVar44._8_4_ = iVar7;
      auVar44._12_4_ = iVar7;
      auVar44 = NEON_uqsub(pauVar32[1],auVar44,4);
      auVar45._4_4_ = iVar7;
      auVar45._0_4_ = iVar7;
      auVar45._8_4_ = iVar7;
      auVar45._12_4_ = iVar7;
      auVar45 = NEON_uqsub(pauVar32[2],auVar45,4);
      auVar46._4_4_ = iVar7;
      auVar46._0_4_ = iVar7;
      auVar46._8_4_ = iVar7;
      auVar46._12_4_ = iVar7;
      auVar46 = NEON_uqsub(pauVar32[3],auVar46,4);
      *(long *)(*pauVar32 + 8) = auVar43._8_8_;
      *(long *)*pauVar32 = auVar43._0_8_;
      *(long *)(pauVar32[1] + 8) = auVar44._8_8_;
      *(long *)pauVar32[1] = auVar44._0_8_;
      *(long *)(pauVar32[2] + 8) = auVar45._8_8_;
      *(long *)pauVar32[2] = auVar45._0_8_;
      *(long *)(pauVar32[3] + 8) = auVar46._8_8_;
      *(long *)pauVar32[3] = auVar46._0_8_;
      lVar12 = lVar12 + 0x40;
    } while (lVar12 != 0x4000);
    lVar22 = lVar22 + uVar17;
    *puVar3 = 0x10000;
    uVar17 = (ulong)*(uint *)(&UNK_00004018 + param_1);
    if (0x10000 < *(uint *)(&UNK_00004018 + param_1)) {
      *(undefined4 *)(&UNK_00004018 + param_1) = 0x10000;
      uVar17 = 0x10000;
    }
    *(ulong *)(param_1 + 0x4000) = lVar22 - uVar17;
    uVar10 = 0x10000;
  }
  if ((int)param_6 < 2) {
    param_6 = 1;
  }
  if (0x10000 < param_6) {
    param_6 = 0x10001;
  }
  if ((((uint)uVar17 < 4 && 0 < (int)param_4) && puVar13 != param_2) &&
     (*(long *)(&UNK_00004008 + param_1) == 0)) {
    uVar17 = 0;
    *(undefined4 *)(&UNK_00004018 + param_1) = 0;
    *(ulong **)(param_1 + 0x4000) = param_2;
    puVar13 = param_2;
  }
  puVar15 = (ulong *)((long)param_2 + (long)(int)param_4);
  puVar11 = *(ulong **)(param_1 + 0x4000);
  if ((puVar11 < puVar15) && (puVar15 < puVar13)) {
    uVar36 = (int)puVar13 - (int)puVar15;
    if (0xffff < uVar36) {
      uVar36 = 0x10000;
    }
    uVar35 = 0;
    if (3 < uVar36) {
      uVar35 = uVar36;
    }
    uVar17 = (ulong)uVar35;
    *(uint *)(&UNK_00004018 + param_1) = uVar35;
    puVar11 = (ulong *)((long)puVar13 - uVar17);
    *(ulong **)(param_1 + 0x4000) = puVar11;
  }
  uVar36 = (uint)uVar17;
  iVar7 = (int)param_3;
  if (puVar13 == param_2) {
    puVar13 = param_2;
    if (((uVar17 & 0xffff0000) == 0) && (uVar36 < uVar10)) {
      if (0x7e000000 < param_4) {
        return 0;
      }
      if (param_4 == 0) goto code_r0x0009d2dc;
      pcVar1 = (char *)((long)param_3 + (long)param_5);
      *(uint *)(&UNK_00004018 + param_1) = uVar36 + param_4;
      *puVar3 = uVar10 + param_4;
      *(undefined4 *)(&UNK_00004014 + param_1) = 2;
      if (0xc < param_4) {
        lVar12 = (long)param_2 - (ulong)uVar10;
        puVar11 = (ulong *)((long)param_2 + ((ulong)param_4 - 0xb));
        puVar15 = (ulong *)((long)param_2 + 2);
        *(uint *)(param_1 + (*param_2 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar10;
        puVar25 = (ulong *)((long)param_2 + ((ulong)param_4 - 0xc));
code_r0x0009dd48:
        uVar35 = param_6 << 6 | 1;
        uVar24 = *(ulong *)((long)puVar13 + 1U);
        puVar20 = (ulong *)((long)puVar13 + 1U);
        uVar26 = param_6;
        while( true ) {
          uVar37 = uVar24 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
          uVar21 = *(uint *)(param_1 + uVar37);
          uVar31 = (ulong)uVar21;
          iVar39 = (int)lVar12;
          uVar4 = (int)puVar20 - iVar39;
          uVar24 = *puVar15;
          *(uint *)(param_1 + uVar37) = uVar4;
          if ((uVar10 - uVar36 <= uVar21 && uVar4 <= uVar21 + 0xffff) &&
             (*(int *)(lVar12 + uVar31) == (int)*puVar20)) break;
          puVar34 = (ulong *)((long)puVar15 + (ulong)uVar26);
          uVar26 = uVar35 >> 6;
          uVar35 = uVar35 + 1;
          puVar20 = puVar15;
          puVar15 = puVar34;
          if (puVar11 < puVar34) goto code_r0x0009c5e0;
        }
        piVar38 = (int *)(lVar12 + uVar31);
        if (((int *)((long)param_2 - uVar17) < piVar38) &&
           (*(char *)((long)puVar20 - 1) == *(char *)((long)piVar38 - 1))) {
          piVar6 = (int *)((long)param_2 + uVar31 + ~(ulong)uVar10);
          puVar34 = (ulong *)((long)puVar20 - 1U);
          puVar23 = (ulong *)((long)puVar20 - 1U);
          do {
            puVar15 = puVar23;
            puVar20 = puVar34;
            piVar38 = piVar6;
            if ((piVar38 <= (int *)((long)param_2 - uVar17)) || (puVar20 <= puVar13)) break;
            piVar6 = (int *)((long)piVar38 + -1);
            puVar34 = (ulong *)((long)puVar20 + -1);
            puVar23 = (ulong *)((long)puVar15 - 1);
          } while (*(char *)((long)puVar20 + -1) == *(char *)((long)piVar38 + -1));
        }
        else {
          puVar15 = puVar20;
        }
        puVar34 = (ulong *)((long)param_3 + 1);
        uVar24 = (long)puVar15 - (long)puVar13 & 0xffffffff;
        if (pcVar1 < (char *)((long)puVar34 + uVar24 / 0xff + uVar24 + 8)) {
          return 0;
        }
        uVar26 = (uint)((long)puVar15 - (long)puVar13);
        uVar35 = uVar26 - 0xf;
        if (uVar26 < 0xf) {
          *(char *)param_3 = (char)(uVar26 << 4);
        }
        else {
          *(char *)param_3 = -0x10;
          puVar23 = puVar34;
          if (0xfe < uVar35) {
            uVar26 = ((int)puVar15 - (int)puVar13) - 0x10e;
            _memset(puVar34,0xff,(ulong)uVar26 / 0xff + 1);
            uVar35 = uVar26 + uVar26 / 0xff;
            puVar23 = (ulong *)((long)param_3 + (ulong)uVar26 / 0xff + 2);
          }
          puVar34 = (ulong *)((long)puVar23 + 1);
          *(char *)puVar23 = (char)uVar35;
        }
        puVar15 = (ulong *)((long)puVar34 + uVar24);
        puVar23 = puVar15;
        if (puVar15 <= puVar34 + 1) {
          puVar23 = puVar34 + 1;
        }
        if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar23 + ~(ulong)puVar34)) &&
           (0x3f < (ulong)((long)puVar34 - (long)puVar13))) {
          uVar24 = ((long)puVar23 + ~(ulong)puVar34 >> 3) + 1;
          uVar37 = uVar24 & 0x3ffffffffffffff8;
          pauVar32 = (undefined1 (*) [16])(puVar13 + 4);
          puVar23 = puVar34 + 4;
          uVar31 = uVar37;
          do {
            uVar5 = *(ulong *)pauVar32[-2];
            auVar43 = pauVar32[-1];
            auVar44 = *pauVar32;
            auVar45 = pauVar32[1];
            puVar23[-3] = *(ulong *)((long)pauVar32[-2] + 8);
            puVar23[-4] = uVar5;
            puVar23[-1] = auVar43._8_8_;
            puVar23[-2] = auVar43._0_8_;
            puVar23[1] = auVar44._8_8_;
            *puVar23 = auVar44._0_8_;
            puVar23[3] = auVar45._8_8_;
            puVar23[2] = auVar45._0_8_;
            uVar31 = uVar31 - 8;
            pauVar32 = pauVar32 + 4;
            puVar23 = puVar23 + 8;
          } while (uVar31 != 0);
          puVar13 = puVar13 + uVar37;
          puVar34 = puVar34 + uVar37;
          if (uVar24 == uVar37) goto code_r0x0009df0c;
        }
        do {
          puVar23 = puVar34 + 1;
          *puVar34 = *puVar13;
          puVar13 = puVar13 + 1;
          puVar34 = puVar23;
        } while (puVar23 < puVar15);
code_r0x0009df0c:
        do {
          psVar41 = (short *)((long)puVar15 + 2);
          *(short *)puVar15 = (short)puVar20 - (short)piVar38;
          puVar13 = (ulong *)((long)puVar20 + 4);
          puVar23 = (ulong *)(piVar38 + 1);
          puVar34 = puVar13;
          if (puVar13 < puVar25) {
            uVar24 = *puVar13 ^ *puVar23;
            if (uVar24 == 0) {
              puVar23 = (ulong *)(piVar38 + 3);
              puVar34 = (ulong *)((long)puVar20 + 0xc);
              goto joined_r0x0009e178;
            }
            uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
            uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
            uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
            uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
            uVar35 = (uint)((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3);
          }
          else {
joined_r0x0009e178:
            if (puVar34 < puVar25) {
              iVar29 = ((int)puVar34 - (int)puVar20) + -4;
              do {
                uVar24 = *puVar34 ^ *puVar23;
                if (uVar24 != 0) {
                  uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
                  uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
                  uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
                  uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10
                  ;
                  uVar35 = (int)((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3) + iVar29;
                  goto code_r0x0009dff8;
                }
                puVar34 = puVar34 + 1;
                puVar23 = puVar23 + 1;
                iVar29 = iVar29 + 8;
              } while (puVar34 < puVar25);
            }
            if (puVar34 < (ulong *)((long)param_2 + ((ulong)param_4 - 8))) {
              if ((int)*puVar23 == (int)*puVar34) {
                puVar34 = (ulong *)((long)puVar34 + 4);
                puVar23 = (ulong *)((long)puVar23 + 4);
              }
            }
            if (puVar34 < (ulong *)((long)param_2 + ((ulong)param_4 - 6))) {
              if ((short)*puVar23 == (short)*puVar34) {
                puVar34 = (ulong *)((long)puVar34 + 2);
                puVar23 = (ulong *)((long)puVar23 + 2);
              }
            }
            if (puVar34 < (ulong *)((long)param_2 + ((ulong)param_4 - 5))) {
              if ((char)*puVar23 == (char)*puVar34) {
                puVar34 = (ulong *)((long)puVar34 + 1);
              }
            }
            uVar35 = (int)puVar34 - (int)puVar13;
          }
code_r0x0009dff8:
          if (pcVar1 < (char *)((long)puVar15 + (ulong)(uVar35 + 0xf0) / 0xff + 8)) {
            return 0;
          }
          uVar26 = uVar35 - 0xf;
          if (uVar35 < 0xf) {
            *(char *)param_3 = (char)*param_3 + (char)uVar35;
            param_3 = psVar41;
          }
          else {
            *(char *)param_3 = (char)*param_3 + '\x0f';
            psVar41[0] = -1;
            psVar41[1] = -1;
            if (0x3fb < uVar26) {
              uVar24 = (ulong)((uVar35 - 0x40b) / 0x3fc << 2);
              _memset((short *)((long)puVar15 + 6),0xff,uVar24 + 4);
              uVar26 = (uVar35 - 0x40b) % 0x3fc;
              psVar41 = (short *)((long)puVar15 + 6 + uVar24);
            }
            uVar21 = (uVar26 & 0xffff) / 0xff;
            pcVar2 = (char *)((long)psVar41 + (ulong)uVar21);
            *pcVar2 = (char)uVar26 + (char)uVar21;
            param_3 = (short *)(pcVar2 + 1);
          }
          puVar13 = (ulong *)((long)puVar20 + (ulong)uVar35 + 4);
          if (puVar11 <= puVar13) break;
          plVar19 = (long *)((long)puVar20 + (ulong)uVar35 + 2);
          *(int *)(param_1 + ((ulong)(*plVar19 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
               (int)plVar19 - iVar39;
          uVar24 = *puVar13 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
          uVar26 = *(uint *)(param_1 + uVar24);
          uVar21 = (int)puVar13 - iVar39;
          *(uint *)(param_1 + uVar24) = uVar21;
          if ((uVar26 < uVar10 - uVar36 || uVar26 + 0xffff < uVar21) ||
             (piVar38 = (int *)(lVar12 + (ulong)uVar26), *piVar38 != (int)*puVar13))
          goto code_r0x0009dd38;
          puVar15 = (ulong *)((long)param_3 + 1);
          *(char *)param_3 = '\0';
          puVar20 = puVar13;
        } while( true );
      }
code_r0x0009c5e0:
      uVar17 = (long)param_2 + ((ulong)param_4 - (long)puVar13);
      if (pcVar1 < (char *)((long)param_3 + (uVar17 + 0xf0) / 0xff + uVar17 + 1)) {
        return 0;
      }
      if (uVar17 < 0xf) goto code_r0x0009e6e0;
      *(char *)param_3 = -0x10;
      psVar41 = param_3;
    }
    else {
      if (0x7e000000 < param_4) {
        return 0;
      }
      if (param_4 == 0) {
code_r0x0009d2dc:
        if (param_5 < 1) {
          return 0;
        }
        *(char *)param_3 = '\0';
        return 1;
      }
      pcVar1 = (char *)((long)param_3 + (long)param_5);
      *(uint *)(&UNK_00004018 + param_1) = uVar36 + param_4;
      *puVar3 = uVar10 + param_4;
      *(undefined4 *)(&UNK_00004014 + param_1) = 2;
      if (0xc < param_4) {
        lVar12 = (long)param_2 - (ulong)uVar10;
        puVar11 = (ulong *)((long)param_2 + ((ulong)param_4 - 0xb));
        puVar15 = (ulong *)((long)param_2 + 2);
        *(uint *)(param_1 + (*param_2 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar10;
        puVar25 = (ulong *)((long)param_2 + ((ulong)param_4 - 0xc));
code_r0x0009e26c:
        uVar36 = param_6 << 6 | 1;
        uVar24 = *(ulong *)((long)puVar13 + 1U);
        puVar20 = (ulong *)((long)puVar13 + 1U);
        uVar35 = param_6;
        while( true ) {
          uVar37 = uVar24 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
          uVar26 = *(uint *)(param_1 + uVar37);
          uVar31 = (ulong)uVar26;
          iVar39 = (int)lVar12;
          uVar21 = (int)puVar20 - iVar39;
          uVar24 = *puVar15;
          *(uint *)(param_1 + uVar37) = uVar21;
          if ((uVar21 <= uVar26 + 0xffff) && (*(int *)(lVar12 + uVar31) == (int)*puVar20)) break;
          puVar34 = (ulong *)((long)puVar15 + (ulong)uVar35);
          uVar35 = uVar36 >> 6;
          uVar36 = uVar36 + 1;
          puVar20 = puVar15;
          puVar15 = puVar34;
          if (puVar11 < puVar34) goto code_r0x0009c85c;
        }
        piVar38 = (int *)(lVar12 + uVar31);
        if (((int *)((long)param_2 - uVar17) < piVar38) &&
           (*(char *)((long)puVar20 - 1) == *(char *)((long)piVar38 - 1))) {
          piVar6 = (int *)((long)param_2 + uVar31 + ~(ulong)uVar10);
          puVar34 = (ulong *)((long)puVar20 - 1U);
          puVar23 = (ulong *)((long)puVar20 - 1U);
          do {
            puVar20 = puVar23;
            puVar15 = puVar34;
            piVar38 = piVar6;
            if ((piVar38 <= (int *)((long)param_2 - uVar17)) || (puVar15 <= puVar13)) break;
            piVar6 = (int *)((long)piVar38 + -1);
            puVar34 = (ulong *)((long)puVar15 + -1);
            puVar23 = (ulong *)((long)puVar20 - 1);
          } while (*(char *)((long)puVar15 + -1) == *(char *)((long)piVar38 + -1));
        }
        else {
          puVar15 = puVar20;
        }
        puVar34 = (ulong *)((long)param_3 + 1);
        uVar24 = (long)puVar20 - (long)puVar13 & 0xffffffff;
        if (pcVar1 < (char *)((long)puVar34 + uVar24 / 0xff + uVar24 + 8)) {
          return 0;
        }
        uVar35 = (uint)((long)puVar20 - (long)puVar13);
        uVar36 = uVar35 - 0xf;
        if (uVar35 < 0xf) {
          *(char *)param_3 = (char)(uVar35 << 4);
        }
        else {
          *(char *)param_3 = -0x10;
          puVar23 = puVar34;
          if (0xfe < uVar36) {
            uVar36 = ((int)puVar20 - (int)puVar13) - 0x10e;
            uVar31 = (ulong)uVar36 / 0xff;
            _memset(puVar34,0xff,uVar31 + 1);
            uVar36 = uVar36 + (int)uVar31;
            puVar23 = (ulong *)((long)param_3 + uVar31 + 2);
          }
          puVar34 = (ulong *)((long)puVar23 + 1);
          *(char *)puVar23 = (char)uVar36;
        }
        puVar20 = (ulong *)((long)puVar34 + uVar24);
        puVar23 = puVar20;
        if (puVar20 <= puVar34 + 1) {
          puVar23 = puVar34 + 1;
        }
        if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar23 + ~(ulong)puVar34)) &&
           (0x3f < (ulong)((long)puVar34 - (long)puVar13))) {
          uVar24 = ((long)puVar23 + ~(ulong)puVar34 >> 3) + 1;
          uVar37 = uVar24 & 0x3ffffffffffffff8;
          pauVar32 = (undefined1 (*) [16])(puVar13 + 4);
          puVar23 = puVar34 + 4;
          uVar31 = uVar37;
          do {
            uVar5 = *(ulong *)pauVar32[-2];
            auVar43 = pauVar32[-1];
            auVar44 = *pauVar32;
            auVar45 = pauVar32[1];
            puVar23[-3] = *(ulong *)((long)pauVar32[-2] + 8);
            puVar23[-4] = uVar5;
            puVar23[-1] = auVar43._8_8_;
            puVar23[-2] = auVar43._0_8_;
            puVar23[1] = auVar44._8_8_;
            *puVar23 = auVar44._0_8_;
            puVar23[3] = auVar45._8_8_;
            puVar23[2] = auVar45._0_8_;
            uVar31 = uVar31 - 8;
            pauVar32 = pauVar32 + 4;
            puVar23 = puVar23 + 8;
          } while (uVar31 != 0);
          puVar13 = puVar13 + uVar37;
          puVar34 = puVar34 + uVar37;
          if (uVar24 == uVar37) goto code_r0x0009e424;
        }
        do {
          puVar23 = puVar34 + 1;
          *puVar34 = *puVar13;
          puVar13 = puVar13 + 1;
          puVar34 = puVar23;
        } while (puVar23 < puVar20);
code_r0x0009e424:
        do {
          psVar41 = (short *)((long)puVar20 + 2);
          *(short *)puVar20 = (short)puVar15 - (short)piVar38;
          puVar13 = (ulong *)((long)puVar15 + 4);
          puVar23 = (ulong *)(piVar38 + 1);
          puVar34 = puVar13;
          if (puVar13 < puVar25) {
            uVar24 = *puVar13 ^ *puVar23;
            if (uVar24 == 0) {
              puVar23 = (ulong *)(piVar38 + 3);
              puVar34 = (ulong *)((long)puVar15 + 0xc);
              goto joined_r0x0009e680;
            }
            uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
            uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
            uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
            uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
            uVar36 = (uint)((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3);
          }
          else {
joined_r0x0009e680:
            if (puVar34 < puVar25) {
              iVar29 = ((int)puVar34 - (int)puVar15) + -4;
              do {
                uVar24 = *puVar34 ^ *puVar23;
                if (uVar24 != 0) {
                  uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
                  uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
                  uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
                  uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10
                  ;
                  uVar36 = (int)((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3) + iVar29;
                  goto code_r0x0009e510;
                }
                puVar34 = puVar34 + 1;
                puVar23 = puVar23 + 1;
                iVar29 = iVar29 + 8;
              } while (puVar34 < puVar25);
            }
            if (puVar34 < (ulong *)((long)param_2 + ((ulong)param_4 - 8))) {
              if ((int)*puVar23 == (int)*puVar34) {
                puVar34 = (ulong *)((long)puVar34 + 4);
                puVar23 = (ulong *)((long)puVar23 + 4);
              }
            }
            if (puVar34 < (ulong *)((long)param_2 + ((ulong)param_4 - 6))) {
              if ((short)*puVar23 == (short)*puVar34) {
                puVar34 = (ulong *)((long)puVar34 + 2);
                puVar23 = (ulong *)((long)puVar23 + 2);
              }
            }
            if (puVar34 < (ulong *)((long)param_2 + ((ulong)param_4 - 5))) {
              if ((char)*puVar23 == (char)*puVar34) {
                puVar34 = (ulong *)((long)puVar34 + 1);
              }
            }
            uVar36 = (int)puVar34 - (int)puVar13;
          }
code_r0x0009e510:
          if (pcVar1 < (char *)((long)puVar20 + (ulong)(uVar36 + 0xf0) / 0xff + 8)) {
            return 0;
          }
          uVar35 = uVar36 - 0xf;
          if (uVar36 < 0xf) {
            *(char *)param_3 = (char)*param_3 + (char)uVar36;
            param_3 = psVar41;
          }
          else {
            *(char *)param_3 = (char)*param_3 + '\x0f';
            psVar41[0] = -1;
            psVar41[1] = -1;
            if (0x3fb < uVar35) {
              uVar24 = (ulong)((uVar36 - 0x40b) / 0x3fc << 2);
              _memset((short *)((long)puVar20 + 6),0xff,uVar24 + 4);
              uVar35 = (uVar36 - 0x40b) % 0x3fc;
              psVar41 = (short *)((long)puVar20 + 6 + uVar24);
            }
            uVar26 = (uVar35 & 0xffff) / 0xff;
            pcVar2 = (char *)((long)psVar41 + (ulong)uVar26);
            *pcVar2 = (char)uVar35 + (char)uVar26;
            param_3 = (short *)(pcVar2 + 1);
          }
          puVar13 = (ulong *)((long)puVar15 + (ulong)uVar36 + 4);
          if (puVar11 <= puVar13) break;
          plVar19 = (long *)((long)puVar15 + (ulong)uVar36 + 2);
          *(int *)(param_1 + ((ulong)(*plVar19 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
               (int)plVar19 - iVar39;
          uVar26 = (int)puVar13 - iVar39;
          uVar24 = *puVar13 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
          uVar35 = *(uint *)(param_1 + uVar24);
          *(uint *)(param_1 + uVar24) = uVar26;
          if ((uVar35 + 0xffff < uVar26) ||
             (piVar38 = (int *)(lVar12 + (ulong)uVar35), *piVar38 != (int)*puVar13))
          goto code_r0x0009e25c;
          puVar20 = (ulong *)((long)param_3 + 1);
          *(char *)param_3 = '\0';
          puVar15 = puVar13;
        } while( true );
      }
code_r0x0009c85c:
      uVar17 = (long)param_2 + ((ulong)param_4 - (long)puVar13);
      if (pcVar1 < (char *)((long)param_3 + (uVar17 + 0xf0) / 0xff + uVar17 + 1)) {
        return 0;
      }
      if (uVar17 < 0xf) {
code_r0x0009e6e0:
        *(char *)param_3 = (char)((int)uVar17 << 4);
        goto code_r0x0009e6e8;
      }
      *(char *)param_3 = -0x10;
      psVar41 = param_3;
    }
    cVar16 = (char)(uVar17 - 0xf);
    param_3 = (short *)((long)psVar41 + 1);
    if (0xfe < uVar17 - 0xf) {
      uVar24 = (long)param_2 + ((ulong)param_4 - (long)puVar13) + -0x10e;
      uVar31 = uVar24 / 0xff;
      _memset(param_3,0xff,uVar31 + 1);
      cVar16 = (char)(uVar24 % 0xff);
      param_3 = (short *)((long)psVar41 + uVar31 + 2);
    }
    *(char *)param_3 = cVar16;
code_r0x0009e6e8:
    _memcpy((char *)((long)param_3 + 1),puVar13,uVar17);
    return ((int)(char *)((long)param_3 + 1) + (int)uVar17) - iVar7;
  }
  lVar12 = *(long *)(&UNK_00004008 + param_1);
  if (lVar12 == 0) {
    if ((uVar36 >> 0x10 == 0) && (uVar36 < uVar10)) {
      if (param_4 < 0x7e000001) {
        if (param_4 != 0) {
          uVar24 = (ulong)param_4;
          lVar12 = 0;
          if (puVar11 != (ulong *)0x0) {
            lVar12 = ((long)puVar11 + uVar17) - (ulong)uVar10;
          }
          pcVar1 = (char *)((long)param_3 + (long)param_5);
          *(uint *)(&UNK_00004018 + param_1) = uVar36 + param_4;
          *puVar3 = uVar10 + param_4;
          *(undefined4 *)(&UNK_00004014 + param_1) = 2;
          puVar13 = param_2;
          if (0xc < param_4) {
            lVar42 = (long)param_2 - (ulong)uVar10;
            puVar15 = (ulong *)((long)param_2 + (uVar24 - 0xb));
            puVar25 = (ulong *)((long)param_2 + (uVar24 - 5));
            lVar22 = 0;
            if (puVar11 != (ulong *)0x0) {
              lVar22 = (long)puVar11 + uVar17;
            }
            *(uint *)(param_1 + (*param_2 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar10;
            puVar20 = (ulong *)((long)param_2 + 2);
            puVar34 = (ulong *)((long)param_2 + 1);
            uVar35 = uVar10 + 1;
            puVar23 = (ulong *)((long)param_2 + (uVar24 - 0xc));
            puVar27 = (ulong *)((long)param_2 + (uVar24 - 8));
            puVar40 = (ulong *)((long)param_2 + (uVar24 - 6));
code_r0x0009e7f8:
            uVar26 = param_6 << 6 | 1;
            uVar17 = *(ulong *)((long)puVar13 + 1);
            uVar21 = param_6;
            do {
              puVar9 = puVar20;
              uVar31 = uVar17 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
              uVar4 = *(uint *)(param_1 + uVar31);
              uVar37 = (ulong)uVar4;
              uVar17 = *puVar9;
              *(uint *)(param_1 + uVar31) = uVar35;
              iVar39 = (int)lVar42;
              if (uVar10 - uVar36 <= uVar4 && uVar35 <= uVar4 + 0xffff) {
                lVar14 = lVar12;
                if (uVar10 <= uVar4) {
                  lVar14 = lVar42;
                }
                if (*(int *)(lVar14 + uVar37) == (int)*puVar34) goto code_r0x0009e864;
              }
              uVar35 = (int)puVar9 - iVar39;
              uVar31 = (ulong)uVar21;
              uVar21 = uVar26 >> 6;
              uVar26 = uVar26 + 1;
              puVar20 = (ulong *)((long)puVar9 + uVar31);
              puVar34 = puVar9;
              if (puVar15 < (ulong *)((long)puVar9 + uVar31)) break;
            } while( true );
          }
code_r0x0009c6c0:
          uVar17 = (long)param_2 + (uVar24 - (long)puVar13);
          if ((char *)((long)param_3 + (uVar17 + 0xf0) / 0xff + uVar17 + 1) <= pcVar1) {
            uVar31 = uVar17 - 0xf;
            if (uVar17 < 0xf) {
              *(char *)param_3 = (char)((int)uVar17 << 4);
            }
            else {
              psVar41 = (short *)((long)param_3 + 1);
              *(char *)param_3 = -0x10;
              if (0xfe < uVar31) {
                uVar31 = (long)param_2 + (uVar24 - (long)puVar13) + -0x10e;
                uVar24 = uVar31 / 0xff;
                _memset(psVar41,0xff,uVar24 + 1);
                uVar31 = uVar31 % 0xff;
                psVar41 = (short *)((long)param_3 + uVar24 + 2);
              }
              *(char *)psVar41 = (char)uVar31;
              param_3 = psVar41;
            }
            _memcpy((char *)((long)param_3 + 1),puVar13,uVar17);
            iVar39 = (int)(char *)((long)param_3 + 1) + (int)uVar17;
            goto code_r0x0009f898;
          }
          goto code_r0x0009efc8;
        }
        goto code_r0x0009d2c8;
      }
    }
    else if (param_4 < 0x7e000001) {
      if (param_4 != 0) {
        uVar24 = (ulong)param_4;
        lVar12 = 0;
        if (puVar11 != (ulong *)0x0) {
          lVar12 = ((long)puVar11 + uVar17) - (ulong)uVar10;
        }
        pcVar1 = (char *)((long)param_3 + (long)param_5);
        *(uint *)(&UNK_00004018 + param_1) = uVar36 + param_4;
        *puVar3 = uVar10 + param_4;
        *(undefined4 *)(&UNK_00004014 + param_1) = 2;
        puVar13 = param_2;
        if (0xc < param_4) {
          lVar42 = (long)param_2 - (ulong)uVar10;
          puVar25 = (ulong *)((long)param_2 + (uVar24 - 0xb));
          puVar15 = (ulong *)((long)param_2 + (uVar24 - 5));
          lVar22 = 0;
          if (puVar11 != (ulong *)0x0) {
            lVar22 = (long)puVar11 + uVar17;
          }
          *(uint *)(param_1 + (*param_2 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar10;
          puVar20 = (ulong *)((long)param_2 + 2);
          puVar34 = (ulong *)((long)param_2 + 1);
          uVar36 = uVar10 + 1;
          puVar23 = (ulong *)((long)param_2 + (uVar24 - 0xc));
          puVar40 = (ulong *)((long)param_2 + (uVar24 - 8));
          puVar27 = (ulong *)((long)param_2 + (uVar24 - 6));
code_r0x0009f084:
          uVar35 = param_6 << 6 | 1;
          uVar17 = *(ulong *)((long)puVar13 + 1);
          uVar26 = param_6;
          do {
            puVar9 = puVar20;
            uVar31 = uVar17 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
            uVar21 = *(uint *)(param_1 + uVar31);
            uVar37 = (ulong)uVar21;
            uVar17 = *puVar9;
            *(uint *)(param_1 + uVar31) = uVar36;
            iVar39 = (int)lVar42;
            if (uVar36 <= uVar21 + 0xffff) {
              lVar14 = lVar12;
              if (uVar10 <= uVar21) {
                lVar14 = lVar42;
              }
              if (*(int *)(lVar14 + uVar37) == (int)*puVar34) goto code_r0x0009f0f0;
            }
            uVar36 = (int)puVar9 - iVar39;
            uVar31 = (ulong)uVar26;
            uVar26 = uVar35 >> 6;
            uVar35 = uVar35 + 1;
            puVar20 = (ulong *)((long)puVar9 + uVar31);
            puVar34 = puVar9;
            if (puVar25 < (ulong *)((long)puVar9 + uVar31)) break;
          } while( true );
        }
code_r0x0009c948:
        uVar17 = (long)param_2 + (uVar24 - (long)puVar13);
        if ((char *)((long)param_3 + (uVar17 + 0xf0) / 0xff + uVar17 + 1) <= pcVar1) {
          uVar31 = uVar17 - 0xf;
          if (uVar17 < 0xf) {
            *(char *)param_3 = (char)((int)uVar17 << 4);
          }
          else {
            psVar41 = (short *)((long)param_3 + 1);
            *(char *)param_3 = -0x10;
            if (0xfe < uVar31) {
              uVar31 = (long)param_2 + (uVar24 - (long)puVar13) + -0x10e;
              uVar24 = uVar31 / 0xff;
              _memset(psVar41,0xff,uVar24 + 1);
              uVar31 = uVar31 % 0xff;
              psVar41 = (short *)((long)param_3 + uVar24 + 2);
            }
            *(char *)psVar41 = (char)uVar31;
            param_3 = psVar41;
          }
          _memcpy((char *)((long)param_3 + 1),puVar13,uVar17);
          iVar39 = (int)(char *)((long)param_3 + 1) + (int)uVar17;
code_r0x0009f898:
          iVar7 = iVar39 - iVar7;
          goto code_r0x0009f8a0;
        }
        goto code_r0x0009d2b8;
      }
code_r0x0009d2c8:
      if (0 < param_5) {
        *(char *)param_3 = '\0';
        iVar7 = 1;
        goto code_r0x0009f8a0;
      }
    }
code_r0x0009efc8:
    iVar7 = 0;
    goto code_r0x0009f8a0;
  }
  if (0x1000 < (int)param_4) {
    _memcpy(param_1,lVar12,&UNK_00004020);
    if (param_4 < 0x7e000001) {
      uVar10 = *puVar3;
      lVar42 = (long)param_2 - (ulong)uVar10;
      puVar13 = *(ulong **)(param_1 + 0x4000);
      uVar17 = (ulong)param_4;
      puVar15 = (ulong *)((long)param_2 + (uVar17 - 0xb));
      puVar11 = (ulong *)((long)param_2 + (uVar17 - 5));
      lVar12 = (long)puVar13 + (ulong)*(uint *)(&UNK_00004018 + param_1);
      lVar22 = 0;
      if (puVar13 != (ulong *)0x0) {
        lVar22 = lVar12 - (ulong)uVar10;
      }
      pcVar1 = (char *)((long)param_3 + (long)param_5);
      *(uint *)(&UNK_00004018 + param_1) = *(uint *)(&UNK_00004018 + param_1) + param_4;
      *(uint *)(param_1 + (*param_2 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar10;
      *puVar3 = uVar10 + param_4;
      *(undefined4 *)(&UNK_00004014 + param_1) = 2;
      puVar25 = (ulong *)((long)param_2 + 2);
      puVar20 = (ulong *)((long)param_2 + 1);
      uVar36 = uVar10 + 1;
      lVar14 = 0;
      if (puVar13 != (ulong *)0x0) {
        lVar14 = lVar12;
      }
      puVar40 = (ulong *)((long)param_2 + (uVar17 - 0xc));
      puVar27 = (ulong *)((long)param_2 + (uVar17 - 8));
      puVar23 = (ulong *)((long)param_2 + (uVar17 - 6));
      puVar34 = param_2;
code_r0x0009cae8:
      uVar35 = param_6 << 6 | 1;
      uVar24 = *(ulong *)((long)puVar34 + 1);
      uVar26 = param_6;
      do {
        puVar9 = puVar25;
        uVar31 = uVar24 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
        uVar21 = *(uint *)(param_1 + uVar31);
        uVar37 = (ulong)uVar21;
        uVar24 = *puVar9;
        *(uint *)(param_1 + uVar31) = uVar36;
        iVar39 = (int)lVar42;
        if (uVar36 <= uVar21 + 0xffff) {
          lVar12 = lVar22;
          if (uVar10 <= uVar21) {
            lVar12 = lVar42;
          }
          if (*(int *)(lVar12 + uVar37) == (int)*puVar20) goto code_r0x0009cb50;
        }
        uVar36 = (int)puVar9 - iVar39;
        uVar31 = (ulong)uVar26;
        uVar26 = uVar35 >> 6;
        uVar35 = uVar35 + 1;
        puVar25 = (ulong *)((long)puVar9 + uVar31);
        puVar20 = puVar9;
        if (puVar15 < (ulong *)((long)puVar9 + uVar31)) goto code_r0x0009d28c;
      } while( true );
    }
    iVar7 = 0;
    goto code_r0x0009f8a0;
  }
  if (0x7e000000 < param_4) goto code_r0x0009efc8;
  if (param_4 == 0) goto code_r0x0009d2c8;
  puVar13 = *(ulong **)(lVar12 + 0x4000);
  uVar36 = *(uint *)(&UNK_00004018 + lVar12);
  uVar17 = (ulong)param_4;
  uVar35 = *(uint *)(&UNK_00004010 + lVar12);
  lVar22 = 0;
  if (puVar13 != (ulong *)0x0) {
    lVar22 = ((long)puVar13 + (ulong)uVar36) - (ulong)uVar35;
  }
  pcVar1 = (char *)((long)param_3 + (long)param_5);
  *(undefined8 *)(&UNK_00004008 + param_1) = 0;
  *puVar3 = uVar10 + param_4;
  *(undefined4 *)(&UNK_00004014 + param_1) = 2;
  *(uint *)(&UNK_00004018 + param_1) = param_4;
  puVar15 = param_2;
  if (param_4 < 0xd) {
code_r0x0009c7d0:
    uVar24 = (long)param_2 + (uVar17 - (long)puVar15);
    if (pcVar1 < (char *)((long)param_3 + (uVar24 + 0xf0) / 0xff + uVar24 + 1)) {
code_r0x0009c800:
      iVar7 = 0;
    }
    else {
      uVar31 = uVar24 - 0xf;
      if (uVar24 < 0xf) {
        *(char *)param_3 = (char)((int)uVar24 << 4);
      }
      else {
        psVar41 = (short *)((long)param_3 + 1);
        *(char *)param_3 = -0x10;
        if (0xfe < uVar31) {
          uVar31 = (long)param_2 + (uVar17 - (long)puVar15) + -0x10e;
          uVar17 = uVar31 / 0xff;
          _memset(psVar41,0xff,uVar17 + 1);
          uVar31 = uVar31 % 0xff;
          psVar41 = (short *)((long)param_3 + uVar17 + 2);
        }
        *(char *)psVar41 = (char)uVar31;
        param_3 = psVar41;
      }
      _memcpy((char *)((long)param_3 + 1),puVar15,uVar24);
      iVar7 = ((int)(char *)((long)param_3 + 1) + (int)uVar24) - iVar7;
    }
    goto code_r0x0009f8a0;
  }
  lVar14 = (long)param_2 - (ulong)uVar10;
  iVar39 = uVar10 - uVar35;
  puVar11 = (ulong *)((long)param_2 + (uVar17 - 0xb));
  puVar25 = (ulong *)((long)param_2 + (uVar17 - 5));
  lVar42 = 0;
  if (puVar13 != (ulong *)0x0) {
    lVar42 = (long)puVar13 + (ulong)uVar36;
  }
  *(uint *)(param_1 + (*param_2 * -0x30e4432345000000 >> 0x32 & 0x3ffc)) = uVar10;
  puVar20 = (ulong *)((long)param_2 + 2);
  puVar34 = (ulong *)((long)param_2 + 1);
  uVar36 = uVar10 + 1;
  puVar40 = (ulong *)((long)param_2 + (uVar17 - 0xc));
  puVar27 = (ulong *)((long)param_2 + (uVar17 - 8));
  puVar23 = (ulong *)((long)param_2 + (uVar17 - 6));
code_r0x0009d418:
  uVar35 = param_6 << 6 | 1;
  uVar24 = *(ulong *)((long)puVar15 + 1);
  uVar26 = param_6;
  while( true ) {
    puVar9 = puVar20;
    uVar31 = uVar24 * -0x30e4432345000000 >> 0x34;
    uVar21 = *(uint *)(param_1 + uVar31 * 4);
    iVar29 = (int)lVar14;
    if (uVar21 < uVar10) {
      uVar21 = *(uint *)(lVar12 + uVar31 * 4);
      puVar20 = (ulong *)(lVar22 + (ulong)uVar21);
      uVar21 = uVar21 + iVar39;
      uVar24 = *puVar9;
      *(uint *)(param_1 + uVar31 * 4) = uVar36;
      puVar8 = puVar13;
    }
    else {
      puVar20 = (ulong *)(lVar14 + (ulong)uVar21);
      uVar24 = *puVar9;
      *(uint *)(param_1 + uVar31 * 4) = uVar36;
      puVar8 = param_2;
    }
    if ((uVar36 <= uVar21 + 0xffff) && ((int)*puVar20 == (int)*puVar34)) break;
    uVar36 = (int)puVar9 - iVar29;
    uVar31 = (ulong)uVar26;
    uVar26 = uVar35 >> 6;
    uVar35 = uVar35 + 1;
    puVar20 = (ulong *)((long)puVar9 + uVar31);
    puVar34 = puVar9;
    if (puVar11 < (ulong *)((long)puVar9 + uVar31)) goto code_r0x0009c7d0;
  }
  if ((puVar8 < puVar20) && (*(char *)((long)puVar34 - 1) == *(char *)((long)puVar20 + -1))) {
    puVar9 = (ulong *)((long)puVar34 - 1);
    puVar18 = (ulong *)((long)puVar20 + -1);
    do {
      puVar20 = puVar18;
      puVar34 = puVar9;
      if ((puVar20 <= puVar8) || (puVar34 <= puVar15)) break;
      puVar9 = (ulong *)((long)puVar34 + -1);
      puVar18 = (ulong *)((long)puVar20 + -1);
    } while (*(char *)((long)puVar34 + -1) == *(char *)((long)puVar20 + -1));
  }
  puVar9 = (ulong *)((long)param_3 + 1);
  uVar24 = (long)puVar34 - (long)puVar15 & 0xffffffff;
  if ((char *)((long)puVar9 + uVar24 / 0xff + uVar24 + 8) <= pcVar1) {
    uVar26 = (uint)((long)puVar34 - (long)puVar15);
    uVar35 = uVar26 - 0xf;
    if (uVar26 < 0xf) {
      *(char *)param_3 = (char)(uVar26 << 4);
    }
    else {
      *(char *)param_3 = -0x10;
      puVar18 = puVar9;
      if (0xfe < uVar35) {
        uVar35 = ((int)puVar34 - (int)puVar15) - 0x10e;
        uVar31 = (ulong)uVar35 / 0xff;
        _memset(puVar9,0xff,uVar31 + 1);
        uVar35 = uVar35 + (int)uVar31;
        puVar18 = (ulong *)((long)param_3 + uVar31 + 2);
      }
      puVar9 = (ulong *)((long)puVar18 + 1);
      *(char *)puVar18 = (char)uVar35;
    }
    puVar18 = (ulong *)((long)puVar9 + uVar24);
    puVar33 = puVar18;
    if (puVar18 <= puVar9 + 1) {
      puVar33 = puVar9 + 1;
    }
    if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar33 + ~(ulong)puVar9)) &&
       (0x3f < (ulong)((long)puVar9 - (long)puVar15))) {
      uVar24 = ((long)puVar33 + ~(ulong)puVar9 >> 3) + 1;
      uVar37 = uVar24 & 0x3ffffffffffffff8;
      pauVar32 = (undefined1 (*) [16])(puVar15 + 4);
      puVar33 = puVar9 + 4;
      uVar31 = uVar37;
      do {
        uVar5 = *(ulong *)pauVar32[-2];
        auVar43 = pauVar32[-1];
        auVar44 = *pauVar32;
        auVar45 = pauVar32[1];
        puVar33[-3] = *(ulong *)((long)pauVar32[-2] + 8);
        puVar33[-4] = uVar5;
        puVar33[-1] = auVar43._8_8_;
        puVar33[-2] = auVar43._0_8_;
        puVar33[1] = auVar44._8_8_;
        *puVar33 = auVar44._0_8_;
        puVar33[3] = auVar45._8_8_;
        puVar33[2] = auVar45._0_8_;
        uVar31 = uVar31 - 8;
        pauVar32 = pauVar32 + 4;
        puVar33 = puVar33 + 8;
      } while (uVar31 != 0);
      puVar15 = puVar15 + uVar37;
      puVar9 = puVar9 + uVar37;
      if (uVar24 == uVar37) goto code_r0x0009d640;
    }
    do {
      puVar33 = puVar9 + 1;
      *puVar9 = *puVar15;
      puVar15 = puVar15 + 1;
      puVar9 = puVar33;
    } while (puVar33 < puVar18);
code_r0x0009d640:
    psVar41 = (short *)((long)puVar18 + 2);
    *(short *)puVar18 = (short)uVar36 - (short)uVar21;
    puVar15 = puVar34;
    if (puVar8 == puVar13) goto code_r0x0009d79c;
    do {
      puVar34 = (ulong *)((long)puVar15 + 4);
      puVar8 = (ulong *)((long)puVar20 + 4);
      puVar9 = puVar34;
      if (puVar34 < puVar40) {
        uVar24 = *puVar34 ^ *puVar8;
        if (uVar24 == 0) {
          puVar8 = (ulong *)((long)puVar20 + 0xc);
          puVar9 = (ulong *)((long)puVar15 + 0xc);
          goto joined_r0x0009d750;
        }
        uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
        uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
        uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
        uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
        uVar24 = (ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3;
      }
      else {
joined_r0x0009d750:
        if (puVar9 < puVar40) {
          iVar30 = ((int)puVar9 - (int)puVar15) + -4;
          do {
            uVar24 = *puVar9 ^ *puVar8;
            if (uVar24 != 0) {
              uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
              uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
              uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
              uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
              uVar24 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3) +
                                    iVar30);
              goto code_r0x0009d73c;
            }
            puVar9 = puVar9 + 1;
            puVar8 = puVar8 + 1;
            iVar30 = iVar30 + 8;
          } while (puVar9 < puVar40);
        }
        if (puVar9 < puVar27) {
          if ((int)*puVar8 == (int)*puVar9) {
            puVar9 = (ulong *)((long)puVar9 + 4);
            puVar8 = (ulong *)((long)puVar8 + 4);
          }
        }
        if (puVar9 < puVar23) {
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
        uVar24 = (ulong)(uint)((int)puVar9 - (int)puVar34);
      }
code_r0x0009d73c:
      puVar15 = (ulong *)((long)puVar15 + uVar24 + 4);
      while( true ) {
        uVar36 = (uint)uVar24;
        if (pcVar1 < (char *)((long)puVar18 + (ulong)(uVar36 + 0xf0) / 0xff + 8))
        goto code_r0x0009c800;
        uVar35 = uVar36 - 0xf;
        if (uVar36 < 0xf) {
          *(char *)param_3 = (char)*param_3 + (char)uVar24;
          param_3 = psVar41;
        }
        else {
          *(char *)param_3 = (char)*param_3 + '\x0f';
          psVar41[0] = -1;
          psVar41[1] = -1;
          if (0x3fb < uVar35) {
            uVar24 = (ulong)((uVar36 - 0x40b) / 0x3fc << 2);
            _memset((short *)((long)puVar18 + 6),0xff,uVar24 + 4);
            uVar35 = (uVar36 - 0x40b) % 0x3fc;
            psVar41 = (short *)((long)puVar18 + 6 + uVar24);
          }
          uVar36 = (uVar35 & 0xffff) / 0xff;
          pcVar2 = (char *)((long)psVar41 + (ulong)uVar36);
          *pcVar2 = (char)uVar35 + (char)uVar36;
          param_3 = (short *)(pcVar2 + 1);
        }
        if (puVar11 <= puVar15) goto code_r0x0009c7d0;
        *(int *)(param_1 +
                ((ulong)(*(long *)((long)puVar15 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
             (int)(long *)((long)puVar15 + -2) - iVar29;
        uVar24 = *puVar15 * -0x30e4432345000000 >> 0x34;
        uVar36 = *(uint *)(param_1 + uVar24 * 4);
        if (uVar36 < uVar10) {
          uVar36 = *(uint *)(lVar12 + uVar24 * 4);
          puVar20 = (ulong *)(lVar22 + (ulong)uVar36);
          uVar36 = uVar36 + iVar39;
          puVar9 = puVar13;
        }
        else {
          puVar20 = (ulong *)(lVar14 + (ulong)uVar36);
          puVar9 = param_2;
        }
        uVar35 = (int)puVar15 - iVar29;
        *(uint *)(param_1 + uVar24 * 4) = uVar35;
        if ((uVar36 + 0xffff < uVar35) || ((int)*puVar20 != (int)*puVar15)) {
          puVar34 = (ulong *)((long)puVar15 + 1);
          uVar36 = (int)puVar34 - iVar29;
          puVar20 = (ulong *)((long)puVar15 + 2);
          if (puVar11 < puVar20) goto code_r0x0009c7d0;
          goto code_r0x0009d418;
        }
        puVar18 = (ulong *)((long)param_3 + 1);
        *(char *)param_3 = '\0';
        psVar41 = (short *)((long)param_3 + 3);
        *(short *)puVar18 = (short)uVar35 - (short)uVar36;
        puVar34 = puVar15;
        if (puVar9 != puVar13) break;
code_r0x0009d79c:
        puVar15 = (ulong *)((long)puVar34 + (lVar42 - (long)puVar20));
        puVar9 = puVar25;
        if (puVar15 <= puVar25) {
          puVar9 = puVar15;
        }
        puVar15 = (ulong *)((long)puVar34 + 4);
        puVar8 = (ulong *)((long)puVar20 + 4);
        puVar33 = (ulong *)((long)puVar9 - 7);
        if (puVar15 < puVar33) {
          uVar24 = *puVar15 ^ *puVar8;
          if (uVar24 == 0) {
            puVar28 = (ulong *)((long)puVar34 + 0xc);
            puVar8 = (ulong *)((long)puVar20 + 0xc);
            if (puVar28 < puVar33) goto code_r0x0009d7f8;
            goto code_r0x0009db68;
          }
          uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
          uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
          uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
          uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
          uVar24 = (ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3;
        }
        else {
          puVar28 = puVar15;
          if (puVar15 < puVar33) {
code_r0x0009d7f8:
            iVar30 = ((int)puVar28 - (int)puVar34) + -4;
            do {
              uVar24 = *puVar28 ^ *puVar8;
              if (uVar24 != 0) {
                uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
                uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
                uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
                uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
                uVar24 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3) +
                                      iVar30);
                goto code_r0x0009d8a8;
              }
              puVar28 = puVar28 + 1;
              puVar8 = puVar8 + 1;
              iVar30 = iVar30 + 8;
            } while (puVar28 < puVar33);
            if ((ulong *)((long)puVar9 - 3U) <= puVar28) goto code_r0x0009db78;
code_r0x0009d834:
            if ((int)*puVar8 == (int)*puVar28) {
              puVar28 = (ulong *)((long)puVar28 + 4);
              puVar8 = (ulong *)((long)puVar8 + 4);
            }
            if (puVar28 < (ulong *)((long)puVar9 - 1U)) {
code_r0x0009db8c:
              if ((short)*puVar8 == (short)*puVar28) {
                puVar28 = (ulong *)((long)puVar28 + 2);
                puVar8 = (ulong *)((long)puVar8 + 2);
              }
            }
          }
          else {
code_r0x0009db68:
            if (puVar28 < (ulong *)((long)puVar9 - 3U)) goto code_r0x0009d834;
code_r0x0009db78:
            if (puVar28 < (ulong *)((long)puVar9 - 1U)) goto code_r0x0009db8c;
          }
          if (puVar28 < puVar9) {
            if ((char)*puVar8 == (char)*puVar28) {
              puVar28 = (ulong *)((long)puVar28 + 1);
            }
          }
          uVar24 = (ulong)(uint)((int)puVar28 - (int)puVar15);
        }
code_r0x0009d8a8:
        puVar15 = (ulong *)((long)puVar34 + uVar24 + 4);
        if (puVar15 == puVar9) {
          puVar15 = puVar9;
          puVar8 = param_2;
          if (puVar9 < puVar40) {
            uVar31 = *puVar9 ^ *param_2;
            if (uVar31 == 0) {
              puVar15 = puVar9 + 1;
              puVar8 = param_2 + 1;
              goto code_r0x0009d900;
            }
            uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
            uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
            uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
            uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
            uVar36 = (uint)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3);
          }
          else {
code_r0x0009d900:
            if (puVar15 < puVar40) {
              puVar34 = (ulong *)((long)puVar34 + (lVar42 - (long)puVar20));
              if (puVar25 <= puVar34) {
                puVar34 = puVar25;
              }
              iVar30 = (int)puVar15 - (int)puVar34;
              do {
                uVar31 = *puVar15 ^ *puVar8;
                if (uVar31 != 0) {
                  uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
                  uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
                  uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
                  uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10
                  ;
                  uVar36 = (int)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3) + iVar30;
                  goto code_r0x0009d9b8;
                }
                puVar15 = puVar15 + 1;
                puVar8 = puVar8 + 1;
                iVar30 = iVar30 + 8;
              } while (puVar15 < puVar40);
            }
            if (puVar15 < puVar27) {
              if ((int)*puVar8 == (int)*puVar15) {
                puVar15 = (ulong *)((long)puVar15 + 4);
                puVar8 = (ulong *)((long)puVar8 + 4);
              }
            }
            if (puVar15 < puVar23) {
              if ((short)*puVar8 == (short)*puVar15) {
                puVar15 = (ulong *)((long)puVar15 + 2);
                puVar8 = (ulong *)((long)puVar8 + 2);
              }
            }
            if (puVar15 < puVar25) {
              if ((char)*puVar8 == (char)*puVar15) {
                puVar15 = (ulong *)((long)puVar15 + 1);
              }
            }
            uVar36 = (int)puVar15 - (int)puVar9;
          }
code_r0x0009d9b8:
          uVar24 = (ulong)(uVar36 + (int)uVar24);
          puVar15 = (ulong *)((long)puVar9 + (ulong)uVar36);
        }
      }
    } while( true );
  }
code_r0x0009d2b8:
  iVar7 = 0;
code_r0x0009f8a0:
  *(ulong **)(param_1 + 0x4000) = param_2;
  *(uint *)(&UNK_00004018 + param_1) = param_4;
  return iVar7;
code_r0x0009dd38:
  puVar15 = (ulong *)((long)puVar20 + (ulong)uVar35 + 6);
  if (puVar11 < puVar15) goto code_r0x0009c5e0;
  goto code_r0x0009dd48;
code_r0x0009e25c:
  puVar15 = (ulong *)((long)puVar15 + (ulong)uVar36 + 6);
  if (puVar11 < puVar15) goto code_r0x0009c85c;
  goto code_r0x0009e26c;
code_r0x0009e864:
  puVar20 = puVar11;
  if (uVar10 <= uVar4) {
    puVar20 = param_2;
  }
  puVar9 = (ulong *)(lVar14 + uVar37);
  if ((puVar20 < puVar9) && (*(char *)((long)puVar34 - 1) == *(char *)((long)puVar9 - 1))) {
    puVar8 = (ulong *)((long)puVar34 - 1);
    puVar18 = (ulong *)(lVar14 + uVar37 + -1);
    do {
      puVar9 = puVar18;
      puVar34 = puVar8;
      if ((puVar9 <= puVar20) || (puVar34 <= puVar13)) break;
      puVar8 = (ulong *)((long)puVar34 + -1);
      puVar18 = (ulong *)((long)puVar9 + -1);
    } while (*(char *)((long)puVar34 + -1) == *(char *)((long)puVar9 + -1));
  }
  puVar8 = (ulong *)((long)param_3 + 1);
  uVar17 = (long)puVar34 - (long)puVar13 & 0xffffffff;
  if (pcVar1 < (char *)((long)puVar8 + uVar17 / 0xff + uVar17 + 8)) goto code_r0x0009d2b8;
  uVar21 = (uint)((long)puVar34 - (long)puVar13);
  uVar26 = uVar21 - 0xf;
  if (uVar21 < 0xf) {
    *(char *)param_3 = (char)(uVar21 << 4);
  }
  else {
    *(char *)param_3 = -0x10;
    puVar18 = puVar8;
    if (0xfe < uVar26) {
      uVar26 = ((int)puVar34 - (int)puVar13) - 0x10e;
      uVar31 = (ulong)uVar26 / 0xff;
      _memset(puVar8,0xff,uVar31 + 1);
      uVar26 = uVar26 + (int)uVar31;
      puVar18 = (ulong *)((long)param_3 + uVar31 + 2);
    }
    puVar8 = (ulong *)((long)puVar18 + 1);
    *(char *)puVar18 = (char)uVar26;
  }
  puVar18 = (ulong *)((long)puVar8 + uVar17);
  puVar33 = puVar18;
  if (puVar18 <= puVar8 + 1) {
    puVar33 = puVar8 + 1;
  }
  if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar33 + ~(ulong)puVar8)) &&
     (0x3f < (ulong)((long)puVar8 - (long)puVar13))) {
    uVar17 = ((long)puVar33 + ~(ulong)puVar8 >> 3) + 1;
    uVar37 = uVar17 & 0x3ffffffffffffff8;
    pauVar32 = (undefined1 (*) [16])(puVar13 + 4);
    puVar33 = puVar8 + 4;
    uVar31 = uVar37;
    do {
      uVar5 = *(ulong *)pauVar32[-2];
      auVar43 = pauVar32[-1];
      auVar44 = *pauVar32;
      auVar45 = pauVar32[1];
      puVar33[-3] = *(ulong *)((long)pauVar32[-2] + 8);
      puVar33[-4] = uVar5;
      puVar33[-1] = auVar43._8_8_;
      puVar33[-2] = auVar43._0_8_;
      puVar33[1] = auVar44._8_8_;
      *puVar33 = auVar44._0_8_;
      puVar33[3] = auVar45._8_8_;
      puVar33[2] = auVar45._0_8_;
      uVar31 = uVar31 - 8;
      pauVar32 = pauVar32 + 4;
      puVar33 = puVar33 + 8;
    } while (uVar31 != 0);
    puVar13 = puVar13 + uVar37;
    puVar8 = puVar8 + uVar37;
    if (uVar17 == uVar37) goto code_r0x0009e9ec;
  }
  do {
    puVar33 = puVar8 + 1;
    *puVar8 = *puVar13;
    puVar13 = puVar13 + 1;
    puVar8 = puVar33;
  } while (puVar33 < puVar18);
code_r0x0009e9ec:
  psVar41 = (short *)((long)puVar18 + 2);
  *(short *)puVar18 = (short)uVar35 - (short)uVar4;
  puVar13 = puVar34;
  if (puVar20 == puVar11) goto code_r0x0009eb4c;
  do {
    puVar20 = (ulong *)((long)puVar13 + 4);
    puVar8 = (ulong *)((long)puVar9 + 4);
    puVar34 = puVar20;
    if (puVar20 < puVar23) {
      uVar17 = *puVar20 ^ *puVar8;
      if (uVar17 == 0) {
        puVar8 = (ulong *)((long)puVar9 + 0xc);
        puVar34 = (ulong *)((long)puVar13 + 0xc);
        goto joined_r0x0009eb00;
      }
      uVar17 = (uVar17 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar17 & 0x5555555555555555) << 1;
      uVar17 = (uVar17 & 0xcccccccccccccccc) >> 2 | (uVar17 & 0x3333333333333333) << 2;
      uVar17 = (uVar17 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar17 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar17 = (uVar17 & 0xff00ff00ff00ff00) >> 8 | (uVar17 & 0xff00ff00ff00ff) << 8;
      uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
      uVar17 = (ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3;
    }
    else {
joined_r0x0009eb00:
      if (puVar34 < puVar23) {
        iVar29 = ((int)puVar34 - (int)puVar13) + -4;
        do {
          uVar17 = *puVar34 ^ *puVar8;
          if (uVar17 != 0) {
            uVar17 = (uVar17 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar17 & 0x5555555555555555) << 1;
            uVar17 = (uVar17 & 0xcccccccccccccccc) >> 2 | (uVar17 & 0x3333333333333333) << 2;
            uVar17 = (uVar17 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar17 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar17 = (uVar17 & 0xff00ff00ff00ff00) >> 8 | (uVar17 & 0xff00ff00ff00ff) << 8;
            uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
            uVar17 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3) +
                                  iVar29);
            goto code_r0x0009eaec;
          }
          puVar34 = puVar34 + 1;
          puVar8 = puVar8 + 1;
          iVar29 = iVar29 + 8;
        } while (puVar34 < puVar23);
      }
      if (puVar34 < puVar27) {
        if ((int)*puVar8 == (int)*puVar34) {
          puVar34 = (ulong *)((long)puVar34 + 4);
          puVar8 = (ulong *)((long)puVar8 + 4);
        }
      }
      if (puVar34 < puVar40) {
        if ((short)*puVar8 == (short)*puVar34) {
          puVar34 = (ulong *)((long)puVar34 + 2);
          puVar8 = (ulong *)((long)puVar8 + 2);
        }
      }
      if (puVar34 < puVar25) {
        if ((char)*puVar8 == (char)*puVar34) {
          puVar34 = (ulong *)((long)puVar34 + 1);
        }
      }
      uVar17 = (ulong)(uint)((int)puVar34 - (int)puVar20);
    }
code_r0x0009eaec:
    puVar13 = (ulong *)((long)puVar13 + uVar17 + 4);
    while( true ) {
      uVar35 = (uint)uVar17;
      if (pcVar1 < (char *)((long)puVar18 + (ulong)(uVar35 + 0xf0) / 0xff + 8))
      goto code_r0x0009efc8;
      uVar26 = uVar35 - 0xf;
      if (uVar35 < 0xf) {
        *(char *)param_3 = (char)*param_3 + (char)uVar17;
        param_3 = psVar41;
      }
      else {
        *(char *)param_3 = (char)*param_3 + '\x0f';
        psVar41[0] = -1;
        psVar41[1] = -1;
        if (0x3fb < uVar26) {
          uVar17 = (ulong)((uVar35 - 0x40b) / 0x3fc << 2);
          _memset((short *)((long)puVar18 + 6),0xff,uVar17 + 4);
          uVar26 = (uVar35 - 0x40b) % 0x3fc;
          psVar41 = (short *)((long)puVar18 + 6 + uVar17);
        }
        uVar35 = (uVar26 & 0xffff) / 0xff;
        pcVar2 = (char *)((long)psVar41 + (ulong)uVar35);
        *pcVar2 = (char)uVar26 + (char)uVar35;
        param_3 = (short *)(pcVar2 + 1);
      }
      if (puVar15 <= puVar13) goto code_r0x0009c6c0;
      *(int *)(param_1 +
              ((ulong)(*(long *)((long)puVar13 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
           (int)(long *)((long)puVar13 + -2) - iVar39;
      uVar26 = (int)puVar13 - iVar39;
      uVar17 = *puVar13 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
      uVar35 = *(uint *)(param_1 + uVar17);
      puVar20 = puVar11;
      lVar14 = lVar12;
      if (uVar10 <= uVar35) {
        puVar20 = param_2;
        lVar14 = lVar42;
      }
      *(uint *)(param_1 + uVar17) = uVar26;
      if ((uVar35 < uVar10 - uVar36 || uVar35 + 0xffff < uVar26) ||
         (puVar9 = (ulong *)(lVar14 + (ulong)uVar35), (int)*puVar9 != (int)*puVar13)) {
        puVar34 = (ulong *)((long)puVar13 + 1);
        uVar35 = (int)puVar34 - iVar39;
        puVar20 = (ulong *)((long)puVar13 + 2);
        if (puVar15 < puVar20) goto code_r0x0009c6c0;
        goto code_r0x0009e7f8;
      }
      puVar18 = (ulong *)((long)param_3 + 1);
      *(char *)param_3 = '\0';
      psVar41 = (short *)((long)param_3 + 3);
      *(short *)puVar18 = (short)uVar26 - (short)uVar35;
      puVar34 = puVar13;
      if (puVar20 != puVar11) break;
code_r0x0009eb4c:
      puVar13 = (ulong *)((long)puVar34 + (lVar22 - (long)puVar9));
      puVar20 = puVar25;
      if (puVar13 <= puVar25) {
        puVar20 = puVar13;
      }
      puVar13 = (ulong *)((long)puVar34 + 4);
      puVar8 = (ulong *)((long)puVar9 + 4);
      puVar33 = (ulong *)((long)puVar20 - 7);
      if (puVar13 < puVar33) {
        uVar17 = *puVar13 ^ *puVar8;
        if (uVar17 == 0) {
          puVar28 = (ulong *)((long)puVar34 + 0xc);
          puVar8 = (ulong *)((long)puVar9 + 0xc);
          if (puVar28 < puVar33) goto code_r0x0009eba8;
          goto code_r0x0009eef8;
        }
        uVar17 = (uVar17 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar17 & 0x5555555555555555) << 1;
        uVar17 = (uVar17 & 0xcccccccccccccccc) >> 2 | (uVar17 & 0x3333333333333333) << 2;
        uVar17 = (uVar17 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar17 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar17 = (uVar17 & 0xff00ff00ff00ff00) >> 8 | (uVar17 & 0xff00ff00ff00ff) << 8;
        uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
        uVar17 = (ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3;
      }
      else {
        puVar28 = puVar13;
        if (puVar13 < puVar33) {
code_r0x0009eba8:
          iVar29 = ((int)puVar28 - (int)puVar34) + -4;
          do {
            uVar17 = *puVar28 ^ *puVar8;
            if (uVar17 != 0) {
              uVar17 = (uVar17 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar17 & 0x5555555555555555) << 1;
              uVar17 = (uVar17 & 0xcccccccccccccccc) >> 2 | (uVar17 & 0x3333333333333333) << 2;
              uVar17 = (uVar17 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar17 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar17 = (uVar17 & 0xff00ff00ff00ff00) >> 8 | (uVar17 & 0xff00ff00ff00ff) << 8;
              uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
              uVar17 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3) +
                                    iVar29);
              goto code_r0x0009ec48;
            }
            puVar28 = puVar28 + 1;
            puVar8 = puVar8 + 1;
            iVar29 = iVar29 + 8;
          } while (puVar28 < puVar33);
          if ((ulong *)((long)puVar20 - 3U) <= puVar28) goto code_r0x0009ef08;
code_r0x0009ebe4:
          if ((int)*puVar8 == (int)*puVar28) {
            puVar28 = (ulong *)((long)puVar28 + 4);
            puVar8 = (ulong *)((long)puVar8 + 4);
          }
          if (puVar28 < (ulong *)((long)puVar20 - 1U)) {
code_r0x0009ef14:
            if ((short)*puVar8 == (short)*puVar28) {
              puVar28 = (ulong *)((long)puVar28 + 2);
              puVar8 = (ulong *)((long)puVar8 + 2);
            }
          }
        }
        else {
code_r0x0009eef8:
          if (puVar28 < (ulong *)((long)puVar20 - 3U)) goto code_r0x0009ebe4;
code_r0x0009ef08:
          if (puVar28 < (ulong *)((long)puVar20 - 1U)) goto code_r0x0009ef14;
        }
        if (puVar28 < puVar20) {
          if ((char)*puVar8 == (char)*puVar28) {
            puVar28 = (ulong *)((long)puVar28 + 1);
          }
        }
        uVar17 = (ulong)(uint)((int)puVar28 - (int)puVar13);
      }
code_r0x0009ec48:
      puVar13 = (ulong *)((long)puVar34 + uVar17 + 4);
      if (puVar13 == puVar20) {
        puVar13 = puVar20;
        puVar8 = param_2;
        if (puVar20 < puVar23) {
          uVar31 = *puVar20 ^ *param_2;
          if (uVar31 == 0) {
            puVar13 = puVar20 + 1;
            puVar8 = param_2 + 1;
            goto code_r0x0009eca0;
          }
          uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
          uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
          uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
          uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
          uVar35 = (uint)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3);
        }
        else {
code_r0x0009eca0:
          if (puVar13 < puVar23) {
            puVar34 = (ulong *)((long)puVar34 + (lVar22 - (long)puVar9));
            if (puVar25 <= puVar34) {
              puVar34 = puVar25;
            }
            iVar29 = (int)puVar13 - (int)puVar34;
            do {
              uVar31 = *puVar13 ^ *puVar8;
              if (uVar31 != 0) {
                uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
                uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
                uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
                uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
                uVar35 = (int)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3) + iVar29;
                goto code_r0x0009ed58;
              }
              puVar13 = puVar13 + 1;
              puVar8 = puVar8 + 1;
              iVar29 = iVar29 + 8;
            } while (puVar13 < puVar23);
          }
          if (puVar13 < puVar27) {
            if ((int)*puVar8 == (int)*puVar13) {
              puVar13 = (ulong *)((long)puVar13 + 4);
              puVar8 = (ulong *)((long)puVar8 + 4);
            }
          }
          if (puVar13 < puVar40) {
            if ((short)*puVar8 == (short)*puVar13) {
              puVar13 = (ulong *)((long)puVar13 + 2);
              puVar8 = (ulong *)((long)puVar8 + 2);
            }
          }
          if (puVar13 < puVar25) {
            if ((char)*puVar8 == (char)*puVar13) {
              puVar13 = (ulong *)((long)puVar13 + 1);
            }
          }
          uVar35 = (int)puVar13 - (int)puVar20;
        }
code_r0x0009ed58:
        uVar17 = (ulong)(uVar35 + (int)uVar17);
        puVar13 = (ulong *)((long)puVar20 + (ulong)uVar35);
      }
    }
  } while( true );
code_r0x0009f0f0:
  puVar20 = puVar11;
  if (uVar10 <= uVar21) {
    puVar20 = param_2;
  }
  puVar9 = (ulong *)(lVar14 + uVar37);
  if ((puVar20 < puVar9) && (*(char *)((long)puVar34 - 1) == *(char *)((long)puVar9 - 1))) {
    puVar8 = (ulong *)((long)puVar34 - 1);
    puVar18 = (ulong *)(lVar14 + uVar37 + -1);
    do {
      puVar9 = puVar18;
      puVar34 = puVar8;
      if ((puVar9 <= puVar20) || (puVar34 <= puVar13)) break;
      puVar8 = (ulong *)((long)puVar34 + -1);
      puVar18 = (ulong *)((long)puVar9 + -1);
    } while (*(char *)((long)puVar34 + -1) == *(char *)((long)puVar9 + -1));
  }
  puVar8 = (ulong *)((long)param_3 + 1);
  uVar17 = (long)puVar34 - (long)puVar13 & 0xffffffff;
  if (pcVar1 < (char *)((long)puVar8 + uVar17 / 0xff + uVar17 + 8)) goto code_r0x0009d2b8;
  uVar26 = (uint)((long)puVar34 - (long)puVar13);
  uVar35 = uVar26 - 0xf;
  if (uVar26 < 0xf) {
    *(char *)param_3 = (char)(uVar26 << 4);
  }
  else {
    *(char *)param_3 = -0x10;
    puVar18 = puVar8;
    if (0xfe < uVar35) {
      uVar35 = ((int)puVar34 - (int)puVar13) - 0x10e;
      uVar31 = (ulong)uVar35 / 0xff;
      _memset(puVar8,0xff,uVar31 + 1);
      uVar35 = uVar35 + (int)uVar31;
      puVar18 = (ulong *)((long)param_3 + uVar31 + 2);
    }
    puVar8 = (ulong *)((long)puVar18 + 1);
    *(char *)puVar18 = (char)uVar35;
  }
  puVar18 = (ulong *)((long)puVar8 + uVar17);
  puVar33 = puVar18;
  if (puVar18 <= puVar8 + 1) {
    puVar33 = puVar8 + 1;
  }
  if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar33 + ~(ulong)puVar8)) &&
     (0x3f < (ulong)((long)puVar8 - (long)puVar13))) {
    uVar17 = ((long)puVar33 + ~(ulong)puVar8 >> 3) + 1;
    uVar37 = uVar17 & 0x3ffffffffffffff8;
    pauVar32 = (undefined1 (*) [16])(puVar13 + 4);
    puVar33 = puVar8 + 4;
    uVar31 = uVar37;
    do {
      uVar5 = *(ulong *)pauVar32[-2];
      auVar43 = pauVar32[-1];
      auVar44 = *pauVar32;
      auVar45 = pauVar32[1];
      puVar33[-3] = *(ulong *)((long)pauVar32[-2] + 8);
      puVar33[-4] = uVar5;
      puVar33[-1] = auVar43._8_8_;
      puVar33[-2] = auVar43._0_8_;
      puVar33[1] = auVar44._8_8_;
      *puVar33 = auVar44._0_8_;
      puVar33[3] = auVar45._8_8_;
      puVar33[2] = auVar45._0_8_;
      uVar31 = uVar31 - 8;
      pauVar32 = pauVar32 + 4;
      puVar33 = puVar33 + 8;
    } while (uVar31 != 0);
    puVar13 = puVar13 + uVar37;
    puVar8 = puVar8 + uVar37;
    if (uVar17 == uVar37) goto code_r0x0009f258;
  }
  do {
    puVar33 = puVar8 + 1;
    *puVar8 = *puVar13;
    puVar13 = puVar13 + 1;
    puVar8 = puVar33;
  } while (puVar33 < puVar18);
code_r0x0009f258:
  psVar41 = (short *)((long)puVar18 + 2);
  *(short *)puVar18 = (short)uVar36 - (short)uVar21;
  puVar13 = puVar34;
  if (puVar20 == puVar11) goto code_r0x0009f3b8;
code_r0x0009f274:
  puVar20 = (ulong *)((long)puVar13 + 4);
  puVar8 = (ulong *)((long)puVar9 + 4);
  puVar34 = puVar20;
  if (puVar20 < puVar23) {
    uVar17 = *puVar20 ^ *puVar8;
    if (uVar17 != 0) {
      uVar17 = (uVar17 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar17 & 0x5555555555555555) << 1;
      uVar17 = (uVar17 & 0xcccccccccccccccc) >> 2 | (uVar17 & 0x3333333333333333) << 2;
      uVar17 = (uVar17 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar17 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar17 = (uVar17 & 0xff00ff00ff00ff00) >> 8 | (uVar17 & 0xff00ff00ff00ff) << 8;
      uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
      uVar17 = (ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3;
      goto code_r0x0009f34c;
    }
    puVar8 = (ulong *)((long)puVar9 + 0xc);
    puVar34 = (ulong *)((long)puVar13 + 0xc);
  }
  if (puVar34 < puVar23) {
    iVar29 = ((int)puVar34 - (int)puVar13) + -4;
    do {
      uVar17 = *puVar34 ^ *puVar8;
      if (uVar17 != 0) {
        uVar17 = (uVar17 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar17 & 0x5555555555555555) << 1;
        uVar17 = (uVar17 & 0xcccccccccccccccc) >> 2 | (uVar17 & 0x3333333333333333) << 2;
        uVar17 = (uVar17 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar17 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar17 = (uVar17 & 0xff00ff00ff00ff00) >> 8 | (uVar17 & 0xff00ff00ff00ff) << 8;
        uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
        uVar17 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3) + iVar29)
        ;
        goto code_r0x0009f34c;
      }
      puVar34 = puVar34 + 1;
      puVar8 = puVar8 + 1;
      iVar29 = iVar29 + 8;
    } while (puVar34 < puVar23);
  }
  if (puVar34 < puVar40) {
    if ((int)*puVar8 == (int)*puVar34) {
      puVar34 = (ulong *)((long)puVar34 + 4);
      puVar8 = (ulong *)((long)puVar8 + 4);
    }
  }
  if (puVar34 < puVar27) {
    if ((short)*puVar8 == (short)*puVar34) {
      puVar34 = (ulong *)((long)puVar34 + 2);
      puVar8 = (ulong *)((long)puVar8 + 2);
    }
  }
  if (puVar34 < puVar15) {
    if ((char)*puVar8 == (char)*puVar34) {
      puVar34 = (ulong *)((long)puVar34 + 1);
    }
  }
  uVar17 = (ulong)(uint)((int)puVar34 - (int)puVar20);
code_r0x0009f34c:
  pcVar2 = (char *)((long)puVar18 + (ulong)((int)uVar17 + 0xf0) / 0xff + 8);
  puVar13 = (ulong *)((long)puVar13 + uVar17 + 4);
joined_r0x0009f368:
  if (pcVar2 <= pcVar1) {
    do {
      uVar35 = (uint)uVar17;
      uVar36 = uVar35 - 0xf;
      if (uVar35 < 0xf) {
        *(char *)param_3 = (char)*param_3 + (char)uVar17;
        param_3 = psVar41;
      }
      else {
        *(char *)param_3 = (char)*param_3 + '\x0f';
        psVar41[0] = -1;
        psVar41[1] = -1;
        if (0x3fb < uVar36) {
          uVar17 = (ulong)((uVar35 - 0x40b) / 0x3fc << 2);
          _memset((short *)((long)puVar18 + 6),0xff,uVar17 + 4);
          uVar36 = (uVar35 - 0x40b) % 0x3fc;
          psVar41 = (short *)((long)puVar18 + 6 + uVar17);
        }
        uVar35 = (uVar36 & 0xffff) / 0xff;
        pcVar2 = (char *)((long)psVar41 + (ulong)uVar35);
        *pcVar2 = (char)uVar36 + (char)uVar35;
        param_3 = (short *)(pcVar2 + 1);
      }
      if (puVar25 <= puVar13) goto code_r0x0009c948;
      *(int *)(param_1 +
              ((ulong)(*(long *)((long)puVar13 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
           (int)(long *)((long)puVar13 + -2) - iVar39;
      uVar35 = (int)puVar13 - iVar39;
      uVar17 = *puVar13 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
      uVar36 = *(uint *)(param_1 + uVar17);
      puVar20 = puVar11;
      lVar14 = lVar12;
      if (uVar10 <= uVar36) {
        puVar20 = param_2;
        lVar14 = lVar42;
      }
      *(uint *)(param_1 + uVar17) = uVar35;
      if ((uVar36 + 0xffff < uVar35) ||
         (puVar9 = (ulong *)(lVar14 + (ulong)uVar36), (int)*puVar9 != (int)*puVar13)) {
        puVar34 = (ulong *)((long)puVar13 + 1);
        uVar36 = (int)puVar34 - iVar39;
        puVar20 = (ulong *)((long)puVar13 + 2);
        if (puVar25 < puVar20) goto code_r0x0009c948;
        goto code_r0x0009f084;
      }
      puVar18 = (ulong *)((long)param_3 + 1);
      *(char *)param_3 = '\0';
      psVar41 = (short *)((long)param_3 + 3);
      *(short *)puVar18 = (short)uVar35 - (short)uVar36;
      if (puVar20 != puVar11) goto code_r0x0009f274;
code_r0x0009f3b8:
      puVar20 = (ulong *)((long)puVar13 + (lVar22 - (long)puVar9));
      puVar34 = puVar15;
      if (puVar20 <= puVar15) {
        puVar34 = puVar20;
      }
      puVar20 = (ulong *)((long)puVar13 + 4);
      puVar8 = (ulong *)((long)puVar9 + 4);
      puVar33 = (ulong *)((long)puVar34 - 7);
      if (puVar20 < puVar33) {
        uVar17 = *puVar20 ^ *puVar8;
        if (uVar17 == 0) {
          puVar28 = (ulong *)((long)puVar13 + 0xc);
          puVar8 = (ulong *)((long)puVar9 + 0xc);
          if (puVar28 < puVar33) goto code_r0x0009f414;
          goto code_r0x0009f78c;
        }
        uVar17 = (uVar17 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar17 & 0x5555555555555555) << 1;
        uVar17 = (uVar17 & 0xcccccccccccccccc) >> 2 | (uVar17 & 0x3333333333333333) << 2;
        uVar17 = (uVar17 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar17 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar17 = (uVar17 & 0xff00ff00ff00ff00) >> 8 | (uVar17 & 0xff00ff00ff00ff) << 8;
        uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
        uVar17 = (ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3;
      }
      else {
        puVar28 = puVar20;
        if (puVar20 < puVar33) {
code_r0x0009f414:
          iVar29 = ((int)puVar28 - (int)puVar13) + -4;
          do {
            uVar17 = *puVar28 ^ *puVar8;
            if (uVar17 != 0) {
              uVar17 = (uVar17 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar17 & 0x5555555555555555) << 1;
              uVar17 = (uVar17 & 0xcccccccccccccccc) >> 2 | (uVar17 & 0x3333333333333333) << 2;
              uVar17 = (uVar17 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar17 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar17 = (uVar17 & 0xff00ff00ff00ff00) >> 8 | (uVar17 & 0xff00ff00ff00ff) << 8;
              uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
              uVar17 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3) +
                                    iVar29);
              goto code_r0x0009f4b4;
            }
            puVar28 = puVar28 + 1;
            puVar8 = puVar8 + 1;
            iVar29 = iVar29 + 8;
          } while (puVar28 < puVar33);
          if ((ulong *)((long)puVar34 - 3U) <= puVar28) goto code_r0x0009f79c;
code_r0x0009f450:
          if ((int)*puVar8 == (int)*puVar28) {
            puVar28 = (ulong *)((long)puVar28 + 4);
            puVar8 = (ulong *)((long)puVar8 + 4);
          }
          if (puVar28 < (ulong *)((long)puVar34 - 1U)) {
code_r0x0009f7a8:
            if ((short)*puVar8 == (short)*puVar28) {
              puVar28 = (ulong *)((long)puVar28 + 2);
              puVar8 = (ulong *)((long)puVar8 + 2);
            }
          }
        }
        else {
code_r0x0009f78c:
          if (puVar28 < (ulong *)((long)puVar34 - 3U)) goto code_r0x0009f450;
code_r0x0009f79c:
          if (puVar28 < (ulong *)((long)puVar34 - 1U)) goto code_r0x0009f7a8;
        }
        if (puVar28 < puVar34) {
          if ((char)*puVar8 == (char)*puVar28) {
            puVar28 = (ulong *)((long)puVar28 + 1);
          }
        }
        uVar17 = (ulong)(uint)((int)puVar28 - (int)puVar20);
      }
code_r0x0009f4b4:
      puVar20 = (ulong *)((long)puVar13 + uVar17 + 4);
      if (puVar20 != puVar34) goto code_r0x0009f4c4;
      puVar20 = puVar34;
      puVar8 = param_2;
      if (puVar34 < puVar23) {
        uVar31 = *puVar34 ^ *param_2;
        if (uVar31 == 0) {
          puVar20 = puVar34 + 1;
          puVar8 = param_2 + 1;
          goto code_r0x0009f51c;
        }
        uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
        uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
        uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
        uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
        uVar36 = (uint)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3);
      }
      else {
code_r0x0009f51c:
        if (puVar20 < puVar23) {
          puVar13 = (ulong *)((long)puVar13 + (lVar22 - (long)puVar9));
          if (puVar15 <= puVar13) {
            puVar13 = puVar15;
          }
          iVar29 = (int)puVar20 - (int)puVar13;
          do {
            uVar31 = *puVar20 ^ *puVar8;
            if (uVar31 != 0) {
              uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
              uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
              uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
              uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
              uVar36 = (int)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3) + iVar29;
              goto code_r0x0009f5d0;
            }
            puVar20 = puVar20 + 1;
            puVar8 = puVar8 + 1;
            iVar29 = iVar29 + 8;
          } while (puVar20 < puVar23);
        }
        if (puVar20 < puVar40) {
          if ((int)*puVar8 == (int)*puVar20) {
            puVar20 = (ulong *)((long)puVar20 + 4);
            puVar8 = (ulong *)((long)puVar8 + 4);
          }
        }
        if (puVar20 < puVar27) {
          if ((short)*puVar8 == (short)*puVar20) {
            puVar20 = (ulong *)((long)puVar20 + 2);
            puVar8 = (ulong *)((long)puVar8 + 2);
          }
        }
        if (puVar20 < puVar15) {
          if ((char)*puVar8 == (char)*puVar20) {
            puVar20 = (ulong *)((long)puVar20 + 1);
          }
        }
        uVar36 = (int)puVar20 - (int)puVar34;
      }
code_r0x0009f5d0:
      uVar35 = uVar36 + (int)uVar17;
      uVar17 = (ulong)uVar35;
      puVar13 = (ulong *)((long)puVar34 + (ulong)uVar36);
      if (pcVar1 < (char *)((long)puVar18 + (ulong)(uVar35 + 0xf0) / 0xff + 8)) break;
    } while( true );
  }
  goto code_r0x0009d2b8;
code_r0x0009f4c4:
  pcVar2 = (char *)((long)puVar18 + (ulong)((int)uVar17 + 0xf0) / 0xff + 8);
  puVar13 = puVar20;
  goto joined_r0x0009f368;
code_r0x0009cb50:
  puVar25 = puVar13;
  if (uVar10 <= uVar21) {
    puVar25 = param_2;
  }
  puVar9 = (ulong *)(lVar12 + uVar37);
  if ((puVar25 < puVar9) && (*(char *)((long)puVar20 - 1) == *(char *)((long)puVar9 - 1))) {
    puVar8 = (ulong *)((long)puVar20 - 1);
    puVar18 = (ulong *)(lVar12 + uVar37 + -1);
    do {
      puVar9 = puVar18;
      puVar20 = puVar8;
      if ((puVar9 <= puVar25) || (puVar20 <= puVar34)) break;
      puVar8 = (ulong *)((long)puVar20 + -1);
      puVar18 = (ulong *)((long)puVar9 + -1);
    } while (*(char *)((long)puVar20 + -1) == *(char *)((long)puVar9 + -1));
  }
  puVar8 = (ulong *)((long)param_3 + 1);
  uVar24 = (long)puVar20 - (long)puVar34 & 0xffffffff;
  if (pcVar1 < (char *)((long)puVar8 + uVar24 / 0xff + uVar24 + 8)) goto code_r0x0009d2b8;
  uVar26 = (uint)((long)puVar20 - (long)puVar34);
  uVar35 = uVar26 - 0xf;
  if (uVar26 < 0xf) {
    *(char *)param_3 = (char)(uVar26 << 4);
  }
  else {
    *(char *)param_3 = -0x10;
    puVar18 = puVar8;
    if (0xfe < uVar35) {
      uVar35 = ((int)puVar20 - (int)puVar34) - 0x10e;
      uVar31 = (ulong)uVar35 / 0xff;
      _memset(puVar8,0xff,uVar31 + 1);
      uVar35 = uVar35 + (int)uVar31;
      puVar18 = (ulong *)((long)param_3 + uVar31 + 2);
    }
    puVar8 = (ulong *)((long)puVar18 + 1);
    *(char *)puVar18 = (char)uVar35;
  }
  puVar18 = (ulong *)((long)puVar8 + uVar24);
  puVar33 = puVar18;
  if (puVar18 <= puVar8 + 1) {
    puVar33 = puVar8 + 1;
  }
  if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar33 + ~(ulong)puVar8)) &&
     (0x3f < (ulong)((long)puVar8 - (long)puVar34))) {
    uVar24 = ((long)puVar33 + ~(ulong)puVar8 >> 3) + 1;
    uVar37 = uVar24 & 0x3ffffffffffffff8;
    pauVar32 = (undefined1 (*) [16])(puVar34 + 4);
    puVar33 = puVar8 + 4;
    uVar31 = uVar37;
    do {
      uVar5 = *(ulong *)pauVar32[-2];
      auVar43 = pauVar32[-1];
      auVar44 = *pauVar32;
      auVar45 = pauVar32[1];
      puVar33[-3] = *(ulong *)((long)pauVar32[-2] + 8);
      puVar33[-4] = uVar5;
      puVar33[-1] = auVar43._8_8_;
      puVar33[-2] = auVar43._0_8_;
      puVar33[1] = auVar44._8_8_;
      *puVar33 = auVar44._0_8_;
      puVar33[3] = auVar45._8_8_;
      puVar33[2] = auVar45._0_8_;
      uVar31 = uVar31 - 8;
      pauVar32 = pauVar32 + 4;
      puVar33 = puVar33 + 8;
    } while (uVar31 != 0);
    puVar34 = puVar34 + uVar37;
    puVar8 = puVar8 + uVar37;
    if (uVar24 == uVar37) goto code_r0x0009ccc8;
  }
  do {
    puVar33 = puVar8 + 1;
    *puVar8 = *puVar34;
    puVar34 = puVar34 + 1;
    puVar8 = puVar33;
  } while (puVar33 < puVar18);
code_r0x0009ccc8:
  psVar41 = (short *)((long)puVar18 + 2);
  *(short *)puVar18 = (short)uVar36 - (short)uVar21;
  puVar34 = puVar20;
  if (puVar25 == puVar13) goto code_r0x0009ce28;
code_r0x0009cce4:
  puVar25 = (ulong *)((long)puVar34 + 4);
  puVar8 = (ulong *)((long)puVar9 + 4);
  puVar20 = puVar25;
  if (puVar25 < puVar40) {
    uVar24 = *puVar25 ^ *puVar8;
    if (uVar24 != 0) {
      uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
      uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
      uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
      uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
      uVar24 = (ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3;
      goto code_r0x0009cdbc;
    }
    puVar8 = (ulong *)((long)puVar9 + 0xc);
    puVar20 = (ulong *)((long)puVar34 + 0xc);
  }
  if (puVar20 < puVar40) {
    iVar29 = ((int)puVar20 - (int)puVar34) + -4;
    do {
      uVar24 = *puVar20 ^ *puVar8;
      if (uVar24 != 0) {
        uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
        uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
        uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
        uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
        uVar24 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3) + iVar29)
        ;
        goto code_r0x0009cdbc;
      }
      puVar20 = puVar20 + 1;
      puVar8 = puVar8 + 1;
      iVar29 = iVar29 + 8;
    } while (puVar20 < puVar40);
  }
  if (puVar20 < puVar27) {
    if ((int)*puVar8 == (int)*puVar20) {
      puVar20 = (ulong *)((long)puVar20 + 4);
      puVar8 = (ulong *)((long)puVar8 + 4);
    }
  }
  if (puVar20 < puVar23) {
    if ((short)*puVar8 == (short)*puVar20) {
      puVar20 = (ulong *)((long)puVar20 + 2);
      puVar8 = (ulong *)((long)puVar8 + 2);
    }
  }
  if (puVar20 < puVar11) {
    if ((char)*puVar8 == (char)*puVar20) {
      puVar20 = (ulong *)((long)puVar20 + 1);
    }
  }
  uVar24 = (ulong)(uint)((int)puVar20 - (int)puVar25);
code_r0x0009cdbc:
  pcVar2 = (char *)((long)puVar18 + (ulong)((int)uVar24 + 0xf0) / 0xff + 8);
  puVar34 = (ulong *)((long)puVar34 + uVar24 + 4);
joined_r0x0009cdd8:
  if (pcVar2 <= pcVar1) {
    do {
      uVar35 = (uint)uVar24;
      uVar36 = uVar35 - 0xf;
      if (uVar35 < 0xf) {
        *(char *)param_3 = (char)*param_3 + (char)uVar24;
        param_3 = psVar41;
      }
      else {
        *(char *)param_3 = (char)*param_3 + '\x0f';
        psVar41[0] = -1;
        psVar41[1] = -1;
        if (0x3fb < uVar36) {
          uVar24 = (ulong)((uVar35 - 0x40b) / 0x3fc << 2);
          _memset((short *)((long)puVar18 + 6),0xff,uVar24 + 4);
          uVar36 = (uVar35 - 0x40b) % 0x3fc;
          psVar41 = (short *)((long)puVar18 + 6 + uVar24);
        }
        uVar35 = (uVar36 & 0xffff) / 0xff;
        pcVar2 = (char *)((long)psVar41 + (ulong)uVar35);
        param_3 = (short *)(pcVar2 + 1);
        *pcVar2 = (char)uVar36 + (char)uVar35;
      }
      if (puVar15 <= puVar34) goto code_r0x0009d28c;
      *(int *)(param_1 +
              ((ulong)(*(long *)((long)puVar34 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
           (int)(long *)((long)puVar34 + -2) - iVar39;
      uVar35 = (int)puVar34 - iVar39;
      uVar24 = *puVar34 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
      uVar36 = *(uint *)(param_1 + uVar24);
      puVar25 = puVar13;
      lVar12 = lVar22;
      if (uVar10 <= uVar36) {
        puVar25 = param_2;
        lVar12 = lVar42;
      }
      *(uint *)(param_1 + uVar24) = uVar35;
      if ((uVar36 + 0xffff < uVar35) ||
         (puVar9 = (ulong *)(lVar12 + (ulong)uVar36), (int)*puVar9 != (int)*puVar34)) {
        puVar20 = (ulong *)((long)puVar34 + 1);
        uVar36 = (int)puVar20 - iVar39;
        puVar25 = (ulong *)((long)puVar34 + 2);
        if (puVar15 < puVar25) goto code_r0x0009d28c;
        goto code_r0x0009cae8;
      }
      puVar18 = (ulong *)((long)param_3 + 1);
      *(char *)param_3 = '\0';
      psVar41 = (short *)((long)param_3 + 3);
      *(short *)puVar18 = (short)uVar35 - (short)uVar36;
      if (puVar25 != puVar13) goto code_r0x0009cce4;
code_r0x0009ce28:
      puVar25 = (ulong *)((long)puVar34 + (lVar14 - (long)puVar9));
      puVar20 = puVar11;
      if (puVar25 <= puVar11) {
        puVar20 = puVar25;
      }
      puVar25 = (ulong *)((long)puVar34 + 4);
      puVar8 = (ulong *)((long)puVar9 + 4);
      puVar33 = (ulong *)((long)puVar20 - 7);
      if (puVar25 < puVar33) {
        uVar24 = *puVar25 ^ *puVar8;
        if (uVar24 == 0) {
          puVar28 = (ulong *)((long)puVar34 + 0xc);
          puVar8 = (ulong *)((long)puVar9 + 0xc);
          if (puVar28 < puVar33) goto code_r0x0009ce80;
          goto code_r0x0009d204;
        }
        uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
        uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
        uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
        uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
        uVar24 = (ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3;
      }
      else {
        puVar28 = puVar25;
        if (puVar25 < puVar33) {
code_r0x0009ce80:
          iVar29 = ((int)puVar28 - (int)puVar34) + -4;
          do {
            uVar24 = *puVar28 ^ *puVar8;
            if (uVar24 != 0) {
              uVar24 = (uVar24 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar24 & 0x5555555555555555) << 1;
              uVar24 = (uVar24 & 0xcccccccccccccccc) >> 2 | (uVar24 & 0x3333333333333333) << 2;
              uVar24 = (uVar24 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar24 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar24 = (uVar24 & 0xff00ff00ff00ff00) >> 8 | (uVar24 & 0xff00ff00ff00ff) << 8;
              uVar24 = (uVar24 & 0xffff0000ffff0000) >> 0x10 | (uVar24 & 0xffff0000ffff) << 0x10;
              uVar24 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar24 >> 0x20 | uVar24 << 0x20) >> 3) +
                                    iVar29);
              goto code_r0x0009cf20;
            }
            puVar28 = puVar28 + 1;
            puVar8 = puVar8 + 1;
            iVar29 = iVar29 + 8;
          } while (puVar28 < puVar33);
          if ((ulong *)((long)puVar20 - 3U) <= puVar28) goto code_r0x0009d214;
code_r0x0009cebc:
          if ((int)*puVar8 == (int)*puVar28) {
            puVar28 = (ulong *)((long)puVar28 + 4);
            puVar8 = (ulong *)((long)puVar8 + 4);
          }
          if (puVar28 < (ulong *)((long)puVar20 - 1U)) {
code_r0x0009d220:
            if ((short)*puVar8 == (short)*puVar28) {
              puVar28 = (ulong *)((long)puVar28 + 2);
              puVar8 = (ulong *)((long)puVar8 + 2);
            }
          }
        }
        else {
code_r0x0009d204:
          if (puVar28 < (ulong *)((long)puVar20 - 3U)) goto code_r0x0009cebc;
code_r0x0009d214:
          if (puVar28 < (ulong *)((long)puVar20 - 1U)) goto code_r0x0009d220;
        }
        if (puVar28 < puVar20) {
          if ((char)*puVar8 == (char)*puVar28) {
            puVar28 = (ulong *)((long)puVar28 + 1);
          }
        }
        uVar24 = (ulong)(uint)((int)puVar28 - (int)puVar25);
      }
code_r0x0009cf20:
      puVar25 = (ulong *)((long)puVar34 + uVar24 + 4);
      if (puVar25 != puVar20) goto code_r0x0009cf30;
      puVar25 = puVar20;
      puVar8 = param_2;
      if (puVar20 < puVar40) {
        uVar31 = *puVar20 ^ *param_2;
        if (uVar31 == 0) {
          puVar25 = puVar20 + 1;
          puVar8 = param_2 + 1;
          goto code_r0x0009cf88;
        }
        uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
        uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
        uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
        uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
        uVar36 = (uint)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3);
      }
      else {
code_r0x0009cf88:
        if (puVar25 < puVar40) {
          puVar34 = (ulong *)((long)puVar34 + (lVar14 - (long)puVar9));
          if (puVar11 <= puVar34) {
            puVar34 = puVar11;
          }
          iVar29 = (int)puVar25 - (int)puVar34;
          do {
            uVar31 = *puVar25 ^ *puVar8;
            if (uVar31 != 0) {
              uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
              uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
              uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
              uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
              uVar36 = (int)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3) + iVar29;
              goto code_r0x0009d038;
            }
            puVar25 = puVar25 + 1;
            puVar8 = puVar8 + 1;
            iVar29 = iVar29 + 8;
          } while (puVar25 < puVar40);
        }
        if (puVar25 < puVar27) {
          if ((int)*puVar8 == (int)*puVar25) {
            puVar25 = (ulong *)((long)puVar25 + 4);
            puVar8 = (ulong *)((long)puVar8 + 4);
          }
        }
        if (puVar25 < puVar23) {
          if ((short)*puVar8 == (short)*puVar25) {
            puVar25 = (ulong *)((long)puVar25 + 2);
            puVar8 = (ulong *)((long)puVar8 + 2);
          }
        }
        if (puVar25 < puVar11) {
          if ((char)*puVar8 == (char)*puVar25) {
            puVar25 = (ulong *)((long)puVar25 + 1);
          }
        }
        uVar36 = (int)puVar25 - (int)puVar20;
      }
code_r0x0009d038:
      uVar35 = uVar36 + (int)uVar24;
      uVar24 = (ulong)uVar35;
      puVar34 = (ulong *)((long)puVar20 + (ulong)uVar36);
      if (pcVar1 < (char *)((long)puVar18 + (ulong)(uVar35 + 0xf0) / 0xff + 8)) break;
    } while( true );
  }
  goto code_r0x0009d2b8;
code_r0x0009cf30:
  pcVar2 = (char *)((long)puVar18 + (ulong)((int)uVar24 + 0xf0) / 0xff + 8);
  puVar34 = puVar25;
  goto joined_r0x0009cdd8;
code_r0x0009d28c:
  uVar24 = (long)param_2 + (uVar17 - (long)puVar34);
  if ((char *)((long)param_3 + (uVar24 + 0xf0) / 0xff + uVar24 + 1) <= pcVar1) {
    uVar31 = uVar24 - 0xf;
    if (uVar24 < 0xf) {
      *(char *)param_3 = (char)((int)uVar24 << 4);
    }
    else {
      psVar41 = (short *)((long)param_3 + 1);
      *(char *)param_3 = -0x10;
      if (0xfe < uVar31) {
        uVar31 = (long)param_2 + (uVar17 - (long)puVar34) + -0x10e;
        uVar17 = uVar31 / 0xff;
        _memset(psVar41,0xff,uVar17 + 1);
        uVar31 = uVar31 % 0xff;
        psVar41 = (short *)((long)param_3 + uVar17 + 2);
      }
      *(char *)psVar41 = (char)uVar31;
      param_3 = psVar41;
    }
    _memcpy((char *)((long)param_3 + 1),puVar34,uVar24);
    iVar7 = ((int)(char *)((long)param_3 + 1) + (int)uVar24) - iVar7;
    goto code_r0x0009f8a0;
  }
  goto code_r0x0009d2b8;
}

