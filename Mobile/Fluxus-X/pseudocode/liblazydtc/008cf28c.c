/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cf28c
 */

int LZ4_compress_fast_extState_fastReset
              (void *param_1,long *param_2,short *param_3,uint param_4,int param_5,uint param_6)

{
  ulong *puVar1;
  char *pcVar2;
  ushort uVar3;
  uint uVar4;
  uint uVar5;
  long *plVar6;
  short sVar7;
  bool bVar8;
  short *psVar9;
  long *plVar11;
  long *plVar10;
  int iVar12;
  uint uVar13;
  long *plVar14;
  ulong uVar15;
  int *piVar16;
  ulong *puVar17;
  ulong *puVar18;
  ulong uVar19;
  int iVar20;
  long *plVar21;
  uint uVar22;
  long *plVar23;
  int iVar24;
  long lVar25;
  ulong uVar26;
  ulong *puVar27;
  long *plVar28;
  long *plVar29;
  char *pcVar30;
  ulong uVar31;
  size_t __n;
  long lVar32;
  uint uVar33;
  long *plVar34;
  long lVar35;
  long lVar36;
  
  if ((int)param_6 < 2) {
    param_6 = 1;
  }
  if (0x10000 < (int)param_6) {
    param_6 = 0x10001;
  }
  if (param_4 < 0x7e000001) {
    iVar24 = (uint)((ulong)param_4 * 0x8080808081 >> 0x27) + 0x10;
  }
  else {
    iVar24 = 0;
  }
  iVar20 = *(int *)((long)param_1 + 0x4014);
  iVar12 = (int)param_3;
  sVar7 = (short)param_2;
  plVar14 = param_2;
  if (param_5 < iVar24) {
    if (0x1000a < (int)param_4) {
      if (iVar20 == 0) {
        uVar33 = *(uint *)((long)param_1 + 0x4010);
        if (uVar33 != 0) {
          uVar33 = uVar33 + 0x10000;
          *(uint *)((long)param_1 + 0x4010) = uVar33;
        }
      }
      else {
        memset(param_1,0,0x4000);
        uVar33 = 0;
        *(undefined8 *)((long)param_1 + 0x4010) = 0;
      }
      *(undefined4 *)((long)param_1 + 0x4018) = 0;
      *(undefined8 *)((long)param_1 + 0x4008) = 0;
      *(undefined8 *)((long)param_1 + 0x4000) = 0;
      if (param_4 < 0x7e000001) {
        plVar34 = (long *)((long)param_2 + 1);
        lVar32 = *param_2;
        uVar15 = (ulong)param_4;
        *(undefined4 *)((long)param_1 + 0x4014) = 2;
        *(uint *)((long)param_1 + 0x4018) = param_4;
        pcVar30 = (char *)((long)param_3 + (long)param_5);
        *(uint *)((long)param_1 + 0x4010) = uVar33 + param_4;
        lVar25 = (long)param_2 - (ulong)uVar33;
        plVar14 = (long *)((long)param_2 + 2);
        plVar23 = (long *)((long)param_2 + (uVar15 - 0xb));
        puVar27 = (ulong *)((long)param_2 + (uVar15 - 0xc));
        *(uint *)((long)param_1 + ((ulong)(lVar32 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = uVar33
        ;
        plVar28 = param_2;
LAB_008cf498:
        uVar22 = param_6 << 6 | 1;
        lVar32 = *plVar34;
        uVar13 = param_6;
        while( true ) {
          plVar29 = plVar14;
          iVar24 = (int)lVar25;
          uVar5 = (int)plVar34 - iVar24;
          uVar26 = (ulong)(lVar32 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
          lVar32 = *plVar29;
          uVar4 = *(uint *)((long)param_1 + uVar26);
          uVar31 = (ulong)uVar4;
          *(uint *)((long)param_1 + uVar26) = uVar5;
          if ((uVar5 <= uVar4 + 0xffff) && (*(int *)(lVar25 + uVar31) == (int)*plVar34)) break;
          uVar31 = (ulong)uVar13;
          uVar13 = uVar22 >> 6;
          uVar22 = uVar22 + 1;
          plVar14 = (long *)((long)plVar29 + uVar31);
          plVar34 = plVar29;
          if (plVar23 < (long *)((long)plVar29 + uVar31)) goto LAB_008cf8e4;
        }
        plVar14 = (long *)(lVar25 + uVar31);
        if ((param_2 < plVar14) && (*(char *)((long)plVar34 - 1) == *(char *)((long)plVar14 - 1))) {
          plVar10 = (long *)((long)plVar34 - 1U);
          plVar11 = (long *)((long)param_2 + uVar31 + ~(ulong)uVar33);
          plVar21 = (long *)((long)plVar34 - 1U);
          do {
            plVar34 = plVar21;
            plVar14 = plVar11;
            plVar29 = plVar10;
            if ((plVar14 <= param_2) || (plVar29 <= plVar28)) break;
            plVar10 = (long *)((long)plVar29 + -1);
            plVar11 = (long *)((long)plVar14 + -1);
            plVar21 = (long *)((long)plVar34 - 1);
          } while (*(char *)((long)plVar29 + -1) == *(char *)((long)plVar14 + -1));
        }
        else {
          plVar29 = plVar34;
        }
        plVar10 = (long *)((long)param_3 + 1);
        uVar31 = (long)plVar34 - (long)plVar28 & 0xffffffff;
        if ((char *)((long)plVar10 + uVar31 / 0xff + uVar31 + 8) <= pcVar30) {
          uVar13 = (uint)((long)plVar34 - (long)plVar28);
          uVar22 = uVar13 - 0xf;
          if (uVar13 < 0xf) {
            *(char *)param_3 = (char)(uVar13 << 4);
          }
          else {
            *(char *)param_3 = -0x10;
            plVar11 = plVar10;
            if (0xfe < uVar22) {
              uVar13 = ((int)plVar34 - (int)plVar28) - 0x10e;
              memset(plVar10,0xff,(ulong)uVar13 / 0xff + 1);
              uVar22 = uVar13 + uVar13 / 0xff;
              plVar11 = (long *)((long)param_3 + (ulong)uVar13 / 0xff + 2);
            }
            plVar10 = (long *)((long)plVar11 + 1);
            *(char *)plVar11 = (char)uVar22;
          }
          uVar26 = uVar31;
          if (uVar31 < 9) {
            uVar26 = 8;
          }
          plVar34 = (long *)((long)plVar10 + uVar31);
          if ((0x18 < uVar31) && (0x1f < (ulong)((long)plVar10 - (long)plVar28))) {
            plVar11 = plVar10 + 2;
            plVar21 = plVar28 + 2;
            uVar31 = (uVar26 - 1 >> 3) + 1;
            uVar19 = uVar31 & 0x3ffffffffffffffc;
            uVar26 = uVar19;
            do {
              plVar6 = plVar21 + -1;
              lVar32 = plVar21[-2];
              lVar36 = plVar21[1];
              lVar35 = *plVar21;
              uVar26 = uVar26 - 4;
              plVar21 = plVar21 + 4;
              plVar11[-1] = *plVar6;
              plVar11[-2] = lVar32;
              plVar11[1] = lVar36;
              *plVar11 = lVar35;
              plVar11 = plVar11 + 4;
            } while (uVar26 != 0);
            plVar28 = plVar28 + uVar19;
            plVar10 = plVar10 + uVar19;
            if (uVar31 == uVar19) goto LAB_008cf648;
          }
          do {
            plVar11 = plVar10 + 1;
            *plVar10 = *plVar28;
            plVar28 = plVar28 + 1;
            plVar10 = plVar11;
          } while (plVar11 < plVar34);
LAB_008cf648:
          do {
            puVar1 = (ulong *)((long)plVar29 + 4);
            puVar18 = (ulong *)((long)plVar14 + 4);
            psVar9 = (short *)((long)plVar34 + 2);
            *(short *)plVar34 = (short)plVar29 - (short)plVar14;
            puVar17 = puVar1;
            if (puVar1 < puVar27) {
              if (*puVar18 == *puVar1) {
                puVar18 = (ulong *)((long)plVar14 + 0xc);
                puVar17 = (ulong *)((long)plVar29 + 0xc);
                goto joined_r0x008cf890;
              }
              uVar31 = *puVar1 ^ *puVar18;
              uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
              uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
              uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
              uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
              uVar22 = (uint)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3;
            }
            else {
joined_r0x008cf890:
              if (puVar17 < puVar27) {
                iVar20 = ((int)puVar17 - (int)plVar29) + -4;
                do {
                  if (*puVar18 != *puVar17) {
                    uVar31 = *puVar17 ^ *puVar18;
                    uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1
                    ;
                    uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2
                    ;
                    uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
                    uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar31 & 0xffff0000ffff) << 0x10;
                    uVar22 = (int)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3) + iVar20;
                    goto LAB_008cf758;
                  }
                  puVar17 = puVar17 + 1;
                  puVar18 = puVar18 + 1;
                  iVar20 = iVar20 + 8;
                } while (puVar17 < puVar27);
              }
              if (puVar17 < (ulong *)((long)param_2 + (uVar15 - 8))) {
                if ((int)*puVar18 == (int)*puVar17) {
                  puVar17 = (ulong *)((long)puVar17 + 4);
                  puVar18 = (ulong *)((long)puVar18 + 4);
                }
              }
              if (puVar17 < (ulong *)((long)param_2 + (uVar15 - 6))) {
                if ((short)*puVar18 == (short)*puVar17) {
                  puVar17 = (ulong *)((long)puVar17 + 2);
                  puVar18 = (ulong *)((long)puVar18 + 2);
                }
              }
              if (puVar17 < (ulong *)((long)param_2 + (uVar15 - 5))) {
                if ((char)*puVar18 == (char)*puVar17) {
                  puVar17 = (ulong *)((long)puVar17 + 1);
                }
              }
              uVar22 = (int)puVar17 - (int)puVar1;
            }
LAB_008cf758:
            if (pcVar30 < (char *)((long)plVar34 + (ulong)(uVar22 + 0xf0) / 0xff + 8)) break;
            uVar13 = uVar22 - 0xf;
            if (uVar22 < 0xf) {
              *(char *)param_3 = (char)*param_3 + (char)uVar22;
              param_3 = psVar9;
            }
            else {
              *(char *)param_3 = (char)*param_3 + '\x0f';
              psVar9[0] = -1;
              psVar9[1] = -1;
              if (0x3fb < uVar13) {
                uVar31 = (ulong)((uVar22 - 0x40b) / 0x3fc << 2);
                memset((short *)((long)plVar34 + 6),0xff,uVar31 + 4);
                psVar9 = (short *)((long)plVar34 + 6 + uVar31);
                uVar13 = (uVar22 - 0x40b) % 0x3fc;
              }
              uVar4 = (uVar13 & 0xffff) / 0xff;
              pcVar2 = (char *)((long)psVar9 + (ulong)uVar4);
              *pcVar2 = (char)uVar13 + (char)uVar4;
              param_3 = (short *)(pcVar2 + 1);
            }
            plVar28 = (long *)((long)plVar29 + (ulong)uVar22 + 4);
            if (plVar23 <= plVar28) goto LAB_008cf8e4;
            plVar14 = (long *)((long)plVar29 + (ulong)uVar22 + 2);
            lVar32 = *(long *)((long)plVar29 + (ulong)uVar22 + 4);
            *(int *)((long)param_1 + ((ulong)(*plVar14 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
                 (int)plVar14 - iVar24;
            uVar31 = (ulong)(lVar32 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
            uVar4 = (int)plVar28 - iVar24;
            uVar13 = *(uint *)((long)param_1 + uVar31);
            *(uint *)((long)param_1 + uVar31) = uVar4;
            if ((uVar13 + 0xffff < uVar4) ||
               (plVar14 = (long *)(lVar25 + (ulong)uVar13), (int)*plVar14 != (int)*plVar28))
            goto LAB_008cf480;
            plVar34 = (long *)((long)param_3 + 1);
            *(char *)param_3 = '\0';
            plVar29 = plVar28;
          } while( true );
        }
      }
      goto LAB_008d0528;
    }
    if (iVar20 == 3) {
      if (((int)param_4 < 0x1000) &&
         (uVar33 = *(uint *)((long)param_1 + 0x4010), uVar33 + param_4 < 0xffff)) goto LAB_008cf9a8;
LAB_008cfa94:
      memset(param_1,0,0x4000);
      *(undefined8 *)((long)param_1 + 0x4000) = 0;
      *(undefined8 *)((long)param_1 + 0x4010) = 0;
      *(undefined8 *)((long)param_1 + 0x4008) = 0;
      *(undefined4 *)((long)param_1 + 0x4018) = 0;
LAB_008cfac4:
      if (param_4 < 0x7e000001) {
        if (param_4 == 0) {
LAB_008d04f4:
          if (0 < param_5) goto LAB_008d04fc;
        }
        else {
          uVar15 = (ulong)param_4;
          *(uint *)((long)param_1 + 0x4010) = param_4;
          pcVar30 = (char *)((long)param_3 + (long)param_5);
          *(undefined4 *)((long)param_1 + 0x4014) = 3;
          *(uint *)((long)param_1 + 0x4018) = param_4;
          if (param_4 < 0xd) {
LAB_008d0b28:
            __n = (long)param_2 + (uVar15 - (long)plVar14);
            if ((char *)((long)param_3 + (__n + 0xf0) / 0xff + __n + 1) <= pcVar30) {
              uVar31 = __n - 0xf;
              if (__n < 0xf) {
                *(char *)param_3 = (char)((int)__n << 4);
              }
              else {
                psVar9 = (short *)((long)param_3 + 1);
                *(char *)param_3 = -0x10;
                if (0xfe < uVar31) {
                  uVar31 = (long)param_2 + (uVar15 - (long)plVar14) + -0x10e;
                  uVar15 = uVar31 / 0xff;
                  memset(psVar9,0xff,uVar15 + 1);
                  psVar9 = (short *)((long)param_3 + uVar15 + 2);
                  uVar31 = uVar31 % 0xff;
                }
                *(char *)psVar9 = (char)uVar31;
                param_3 = psVar9;
              }
              pcVar30 = (char *)((long)param_3 + 1);
              goto LAB_008d14fc;
            }
          }
          else {
            plVar34 = (long *)((long)param_2 + (uVar15 - 0xb));
            puVar27 = (ulong *)((long)param_2 + (uVar15 - 0xc));
            *(undefined2 *)
             ((long)param_1 + (ulong)((uint)((int)*param_2 * -0x61c8864f) >> 0x13) * 2) = 0;
LAB_008cfb6c:
            uVar31 = 1;
            plVar28 = (long *)((long)plVar14 + 1U);
            uVar33 = param_6 << 6;
            iVar24 = *(int *)((long)plVar14 + 1U);
            do {
              plVar23 = plVar28;
              plVar28 = (long *)((long)plVar23 + uVar31);
              if (plVar34 < plVar28) goto LAB_008d0b28;
              lVar32 = *plVar28;
              uVar22 = (uint)(iVar24 * -0x61c8864f) >> 0x13;
              uVar3 = *(ushort *)((long)param_1 + (ulong)uVar22 * 2);
              uVar26 = (ulong)uVar3;
              bVar8 = *(int *)((long)param_2 + uVar26) != iVar24;
              uVar31 = (ulong)(uVar33 >> 6);
              uVar33 = uVar33 + 1;
              *(short *)((long)param_1 + (ulong)uVar22 * 2) = (short)plVar23 - sVar7;
              iVar24 = (int)lVar32;
            } while (bVar8);
            plVar28 = (long *)((long)param_2 + uVar26);
            if ((uVar3 == 0) || (*(char *)((long)plVar23 - 1) != *(char *)((long)plVar28 + -1))) {
              plVar29 = plVar23;
            }
            else {
              plVar10 = (long *)((long)plVar23 - 1U);
              plVar11 = (long *)((long)param_2 + (uVar26 - 1));
              plVar21 = (long *)((long)plVar23 - 1U);
              do {
                plVar23 = plVar21;
                plVar28 = plVar11;
                plVar29 = plVar10;
                if ((plVar28 <= param_2) || (plVar29 <= plVar14)) break;
                plVar10 = (long *)((long)plVar29 + -1);
                plVar11 = (long *)((long)plVar28 + -1);
                plVar21 = (long *)((long)plVar23 - 1);
              } while (*(char *)((long)plVar29 + -1) == *(char *)((long)plVar28 + -1));
            }
            plVar10 = (long *)((long)param_3 + 1);
            uVar31 = (long)plVar23 - (long)plVar14 & 0xffffffff;
            if ((char *)((long)plVar10 + uVar31 / 0xff + uVar31 + 8) <= pcVar30) {
              uVar22 = (uint)((long)plVar23 - (long)plVar14);
              uVar33 = uVar22 - 0xf;
              if (uVar22 < 0xf) {
                *(char *)param_3 = (char)(uVar22 << 4);
              }
              else {
                *(char *)param_3 = -0x10;
                plVar11 = plVar10;
                if (0xfe < uVar33) {
                  uVar33 = ((int)plVar23 - (int)plVar14) - 0x10e;
                  uVar26 = (ulong)uVar33 / 0xff;
                  memset(plVar10,0xff,uVar26 + 1);
                  plVar11 = (long *)((long)param_3 + uVar26 + 2);
                  uVar33 = uVar33 + (int)uVar26;
                }
                plVar10 = (long *)((long)plVar11 + 1);
                *(char *)plVar11 = (char)uVar33;
              }
              uVar26 = uVar31;
              if (uVar31 < 9) {
                uVar26 = 8;
              }
              plVar23 = (long *)((long)plVar10 + uVar31);
              psVar9 = param_3;
              if ((0x18 < uVar31) && (0x1f < (ulong)((long)plVar10 - (long)plVar14))) {
                plVar11 = plVar10 + 2;
                plVar21 = plVar14 + 2;
                uVar31 = (uVar26 - 1 >> 3) + 1;
                uVar19 = uVar31 & 0x3ffffffffffffffc;
                plVar14 = plVar14 + uVar19;
                plVar10 = plVar10 + uVar19;
                uVar26 = uVar19;
                do {
                  plVar6 = plVar21 + -1;
                  lVar32 = plVar21[-2];
                  lVar35 = plVar21[1];
                  lVar25 = *plVar21;
                  uVar26 = uVar26 - 4;
                  plVar21 = plVar21 + 4;
                  plVar11[-1] = *plVar6;
                  plVar11[-2] = lVar32;
                  plVar11[1] = lVar35;
                  *plVar11 = lVar25;
                  plVar11 = plVar11 + 4;
                } while (uVar26 != 0);
                if (uVar31 == uVar19) goto LAB_008cfcfc;
              }
              do {
                plVar11 = plVar10 + 1;
                *plVar10 = *plVar14;
                plVar14 = plVar14 + 1;
                plVar10 = plVar11;
              } while (plVar11 < plVar23);
LAB_008cfcfc:
              do {
                puVar1 = (ulong *)((long)plVar29 + 4);
                puVar18 = (ulong *)((long)plVar28 + 4);
                param_3 = (short *)((long)plVar23 + 2);
                *(short *)plVar23 = (short)plVar29 - (short)plVar28;
                puVar17 = puVar1;
                if (puVar1 < puVar27) {
                  if (*puVar18 == *puVar1) {
                    puVar18 = (ulong *)((long)plVar28 + 0xc);
                    puVar17 = (ulong *)((long)plVar29 + 0xc);
                    goto joined_r0x008cff18;
                  }
                  uVar31 = *puVar1 ^ *puVar18;
                  uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
                  uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
                  uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
                  uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10
                  ;
                  uVar33 = (uint)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3;
                }
                else {
joined_r0x008cff18:
                  if (puVar17 < puVar27) {
                    iVar24 = ((int)puVar17 - (int)plVar29) + -4;
                    do {
                      if (*puVar18 != *puVar17) {
                        uVar31 = *puVar17 ^ *puVar18;
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
                                 iVar24;
                        goto LAB_008cfe04;
                      }
                      puVar17 = puVar17 + 1;
                      puVar18 = puVar18 + 1;
                      iVar24 = iVar24 + 8;
                    } while (puVar17 < puVar27);
                  }
                  if (puVar17 < (ulong *)((long)param_2 + (uVar15 - 8))) {
                    if ((int)*puVar18 == (int)*puVar17) {
                      puVar17 = (ulong *)((long)puVar17 + 4);
                      puVar18 = (ulong *)((long)puVar18 + 4);
                    }
                  }
                  if (puVar17 < (ulong *)((long)param_2 + (uVar15 - 6))) {
                    if ((short)*puVar18 == (short)*puVar17) {
                      puVar17 = (ulong *)((long)puVar17 + 2);
                      puVar18 = (ulong *)((long)puVar18 + 2);
                    }
                  }
                  if (puVar17 < (ulong *)((long)param_2 + (uVar15 - 5))) {
                    if ((char)*puVar18 == (char)*puVar17) {
                      puVar17 = (ulong *)((long)puVar17 + 1);
                    }
                  }
                  uVar33 = (int)puVar17 - (int)puVar1;
                }
LAB_008cfe04:
                if (pcVar30 < (char *)((long)plVar23 + (ulong)(uVar33 + 0xf0) / 0xff + 8)) break;
                uVar22 = uVar33 - 0xf;
                if (uVar33 < 0xf) {
                  *(char *)psVar9 = (char)*psVar9 + (char)uVar33;
                }
                else {
                  *(char *)psVar9 = (char)*psVar9 + '\x0f';
                  param_3[0] = -1;
                  param_3[1] = -1;
                  if (0x3fb < uVar22) {
                    uVar31 = (ulong)((uVar33 - 0x40b) / 0x3fc << 2);
                    memset((short *)((long)plVar23 + 6),0xff,uVar31 + 4);
                    uVar22 = (uVar33 - 0x40b) % 0x3fc;
                    param_3 = (short *)((long)plVar23 + 6 + uVar31);
                  }
                  uVar13 = (uVar22 & 0xffff) / 0xff;
                  pcVar2 = (char *)((long)param_3 + (ulong)uVar13);
                  param_3 = (short *)(pcVar2 + 1);
                  *pcVar2 = (char)uVar22 + (char)uVar13;
                }
                plVar14 = (long *)((long)plVar29 + (ulong)uVar33 + 4);
                if (plVar34 <= plVar14) goto LAB_008d0b28;
                piVar16 = (int *)((long)plVar29 + (ulong)uVar33 + 2);
                iVar24 = *(int *)((long)plVar29 + (ulong)uVar33 + 4);
                uVar33 = (uint)(iVar24 * -0x61c8864f) >> 0x13;
                *(short *)((long)param_1 + (ulong)((uint)(*piVar16 * -0x61c8864f) >> 0x13) * 2) =
                     (short)piVar16 - sVar7;
                plVar28 = (long *)((long)param_2 +
                                  (ulong)*(ushort *)((long)param_1 + (ulong)uVar33 * 2));
                lVar32 = *plVar28;
                *(short *)((long)param_1 + (ulong)uVar33 * 2) = (short)plVar14 - sVar7;
                if ((int)lVar32 != iVar24) goto LAB_008cfb6c;
                plVar23 = (long *)((long)param_3 + 1);
                *(char *)param_3 = '\0';
                psVar9 = param_3;
                plVar29 = plVar14;
              } while( true );
            }
          }
        }
      }
    }
    else {
      if (iVar20 != 0) goto LAB_008cfa94;
      uVar33 = *(uint *)((long)param_1 + 0x4010);
LAB_008cf9a8:
      *(undefined4 *)((long)param_1 + 0x4018) = 0;
      *(undefined8 *)((long)param_1 + 0x4008) = 0;
      *(undefined8 *)((long)param_1 + 0x4000) = 0;
      if (uVar33 == 0) goto LAB_008cfac4;
      if (param_4 < 0x7e000001) {
        if (param_4 != 0) {
          uVar15 = (ulong)param_4;
          pcVar30 = (char *)((long)param_3 + (long)param_5);
          *(undefined4 *)((long)param_1 + 0x4014) = 3;
          *(uint *)((long)param_1 + 0x4018) = param_4;
          *(uint *)((long)param_1 + 0x4010) = uVar33 + param_4;
          if (0xc < param_4) {
            plVar28 = (long *)((long)param_2 + 1);
            plVar23 = (long *)((long)param_2 + (uVar15 - 0xb));
            puVar27 = (ulong *)((long)param_2 + (uVar15 - 0xc));
            lVar32 = (long)param_2 - (ulong)uVar33;
            plVar34 = (long *)((long)param_2 + 2);
            *(short *)((long)param_1 + (ulong)((uint)((int)*param_2 * -0x61c8864f) >> 0x13) * 2) =
                 (short)uVar33;
LAB_008d0c58:
            uVar22 = param_6 << 6 | 1;
            iVar24 = (int)*plVar28;
            uVar13 = param_6;
            while( true ) {
              plVar29 = plVar34;
              uVar4 = (uint)(iVar24 * -0x61c8864f) >> 0x13;
              iVar24 = (int)*plVar29;
              sVar7 = (short)lVar32;
              uVar3 = *(ushort *)((long)param_1 + (ulong)uVar4 * 2);
              uVar31 = (ulong)uVar3;
              *(short *)((long)param_1 + (ulong)uVar4 * 2) = (short)plVar28 - sVar7;
              if ((uVar33 <= uVar3) && (*(int *)(lVar32 + uVar31) == (int)*plVar28)) break;
              uVar31 = (ulong)uVar13;
              uVar13 = uVar22 >> 6;
              uVar22 = uVar22 + 1;
              plVar34 = (long *)((long)plVar29 + uVar31);
              plVar28 = plVar29;
              if (plVar23 < (long *)((long)plVar29 + uVar31)) goto LAB_008cfa00;
            }
            plVar34 = (long *)(lVar32 + uVar31);
            if ((param_2 < plVar34) &&
               (*(char *)((long)plVar28 - 1) == *(char *)((long)plVar34 - 1))) {
              plVar10 = (long *)((long)plVar28 - 1U);
              plVar11 = (long *)((long)param_2 + uVar31 + ~(ulong)uVar33);
              plVar21 = (long *)((long)plVar28 - 1U);
              do {
                plVar28 = plVar21;
                plVar34 = plVar11;
                plVar29 = plVar10;
                if ((plVar34 <= param_2) || (plVar29 <= plVar14)) break;
                plVar10 = (long *)((long)plVar29 + -1);
                plVar11 = (long *)((long)plVar34 + -1);
                plVar21 = (long *)((long)plVar28 - 1);
              } while (*(char *)((long)plVar29 + -1) == *(char *)((long)plVar34 + -1));
            }
            else {
              plVar29 = plVar28;
            }
            plVar10 = (long *)((long)param_3 + 1);
            uVar31 = (long)plVar28 - (long)plVar14 & 0xffffffff;
            if ((char *)((long)plVar10 + uVar31 / 0xff + uVar31 + 8) <= pcVar30) {
              uVar13 = (uint)((long)plVar28 - (long)plVar14);
              uVar22 = uVar13 - 0xf;
              if (uVar13 < 0xf) {
                *(char *)param_3 = (char)(uVar13 << 4);
              }
              else {
                *(char *)param_3 = -0x10;
                plVar11 = plVar10;
                if (0xfe < uVar22) {
                  uVar22 = ((int)plVar28 - (int)plVar14) - 0x10e;
                  uVar26 = (ulong)uVar22 / 0xff;
                  memset(plVar10,0xff,uVar26 + 1);
                  plVar11 = (long *)((long)param_3 + uVar26 + 2);
                  uVar22 = uVar22 + (int)uVar26;
                }
                plVar10 = (long *)((long)plVar11 + 1);
                *(char *)plVar11 = (char)uVar22;
              }
              uVar26 = uVar31;
              if (uVar31 < 9) {
                uVar26 = 8;
              }
              plVar28 = (long *)((long)plVar10 + uVar31);
              if ((0x18 < uVar31) && (0x1f < (ulong)((long)plVar10 - (long)plVar14))) {
                plVar11 = plVar10 + 2;
                plVar21 = plVar14 + 2;
                uVar31 = (uVar26 - 1 >> 3) + 1;
                uVar19 = uVar31 & 0x3ffffffffffffffc;
                uVar26 = uVar19;
                do {
                  plVar6 = plVar21 + -1;
                  lVar25 = plVar21[-2];
                  lVar36 = plVar21[1];
                  lVar35 = *plVar21;
                  uVar26 = uVar26 - 4;
                  plVar21 = plVar21 + 4;
                  plVar11[-1] = *plVar6;
                  plVar11[-2] = lVar25;
                  plVar11[1] = lVar36;
                  *plVar11 = lVar35;
                  plVar11 = plVar11 + 4;
                } while (uVar26 != 0);
                plVar14 = plVar14 + uVar19;
                plVar10 = plVar10 + uVar19;
                if (uVar31 == uVar19) goto LAB_008d0e00;
              }
              do {
                plVar11 = plVar10 + 1;
                *plVar10 = *plVar14;
                plVar14 = plVar14 + 1;
                plVar10 = plVar11;
              } while (plVar11 < plVar28);
LAB_008d0e00:
              do {
                puVar1 = (ulong *)((long)plVar29 + 4);
                puVar18 = (ulong *)((long)plVar34 + 4);
                psVar9 = (short *)((long)plVar28 + 2);
                *(short *)plVar28 = (short)plVar29 - (short)plVar34;
                puVar17 = puVar1;
                if (puVar1 < puVar27) {
                  if (*puVar18 == *puVar1) {
                    puVar18 = (ulong *)((long)plVar34 + 0xc);
                    puVar17 = (ulong *)((long)plVar29 + 0xc);
                    goto joined_r0x008d1030;
                  }
                  uVar31 = *puVar1 ^ *puVar18;
                  uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
                  uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
                  uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
                  uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10
                  ;
                  uVar22 = (uint)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3;
                }
                else {
joined_r0x008d1030:
                  if (puVar17 < puVar27) {
                    iVar24 = ((int)puVar17 - (int)plVar29) + -4;
                    do {
                      if (*puVar18 != *puVar17) {
                        uVar31 = *puVar17 ^ *puVar18;
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
                        uVar22 = (int)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3) +
                                 iVar24;
                        goto LAB_008d0f08;
                      }
                      puVar17 = puVar17 + 1;
                      puVar18 = puVar18 + 1;
                      iVar24 = iVar24 + 8;
                    } while (puVar17 < puVar27);
                  }
                  if ((puVar17 < (ulong *)((long)param_2 + (uVar15 - 8))) &&
                     ((int)*puVar18 == (int)*puVar17)) {
                    puVar17 = (ulong *)((long)puVar17 + 4);
                    puVar18 = (ulong *)((long)puVar18 + 4);
                  }
                  if ((puVar17 < (ulong *)((long)param_2 + (uVar15 - 6))) &&
                     ((short)*puVar18 == (short)*puVar17)) {
                    puVar17 = (ulong *)((long)puVar17 + 2);
                    puVar18 = (ulong *)((long)puVar18 + 2);
                  }
                  if (puVar17 < (ulong *)((long)param_2 + (uVar15 - 5))) {
                    if ((char)*puVar18 == (char)*puVar17) {
                      puVar17 = (ulong *)((long)puVar17 + 1);
                    }
                  }
                  uVar22 = (int)puVar17 - (int)puVar1;
                }
LAB_008d0f08:
                if (pcVar30 < (char *)((long)plVar28 + (ulong)(uVar22 + 0xf0) / 0xff + 8)) break;
                uVar13 = uVar22 - 0xf;
                if (uVar22 < 0xf) {
                  *(char *)param_3 = (char)*param_3 + (char)uVar22;
                  param_3 = psVar9;
                }
                else {
                  *(char *)param_3 = (char)*param_3 + '\x0f';
                  psVar9[0] = -1;
                  psVar9[1] = -1;
                  if (0x3fb < uVar13) {
                    uVar31 = (ulong)((uVar22 - 0x40b) / 0x3fc << 2);
                    memset((short *)((long)plVar28 + 6),0xff,uVar31 + 4);
                    uVar13 = (uVar22 - 0x40b) % 0x3fc;
                    psVar9 = (short *)((long)plVar28 + 6 + uVar31);
                  }
                  uVar4 = (uVar13 & 0xffff) / 0xff;
                  pcVar2 = (char *)((long)psVar9 + (ulong)uVar4);
                  *pcVar2 = (char)uVar13 + (char)uVar4;
                  param_3 = (short *)(pcVar2 + 1);
                }
                plVar14 = (long *)((long)plVar29 + (ulong)uVar22 + 4);
                if (plVar23 <= plVar14) goto LAB_008cfa00;
                piVar16 = (int *)((long)plVar29 + (ulong)uVar22 + 2);
                iVar24 = *(int *)((long)plVar29 + (ulong)uVar22 + 4);
                uVar13 = (uint)(iVar24 * -0x61c8864f) >> 0x13;
                *(short *)((long)param_1 + (ulong)((uint)(*piVar16 * -0x61c8864f) >> 0x13) * 2) =
                     (short)piVar16 - sVar7;
                uVar3 = *(ushort *)((long)param_1 + (ulong)uVar13 * 2);
                *(short *)((long)param_1 + (ulong)uVar13 * 2) = (short)plVar14 - sVar7;
                if ((uVar3 < uVar33) ||
                   (plVar34 = (long *)(lVar32 + (ulong)uVar3), (int)*plVar34 != iVar24))
                goto LAB_008d0c44;
                plVar28 = (long *)((long)param_3 + 1);
                *(char *)param_3 = '\0';
                plVar29 = plVar14;
              } while( true );
            }
            goto LAB_008d0528;
          }
LAB_008cfa00:
          uVar31 = (long)param_2 + (uVar15 - (long)plVar14);
          if ((char *)((long)param_3 + (uVar31 + 0xf0) / 0xff + uVar31 + 1) <= pcVar30) {
            uVar26 = uVar31 - 0xf;
            if (uVar31 < 0xf) {
              *(char *)param_3 = (char)((int)uVar31 << 4);
            }
            else {
              psVar9 = (short *)((long)param_3 + 1);
              *(char *)param_3 = -0x10;
              if (0xfe < uVar26) {
                uVar26 = (long)param_2 + (uVar15 - (long)plVar14) + -0x10e;
                uVar15 = uVar26 / 0xff;
                memset(psVar9,0xff,uVar15 + 1);
                psVar9 = (short *)((long)param_3 + uVar15 + 2);
                uVar26 = uVar26 % 0xff;
              }
              *(char *)psVar9 = (char)uVar26;
              param_3 = psVar9;
            }
            memcpy((char *)((long)param_3 + 1),plVar14,uVar31);
            return ((int)(char *)((long)param_3 + 1) + (int)uVar31) - iVar12;
          }
          goto LAB_008d0528;
        }
        goto LAB_008d04f4;
      }
    }
LAB_008d0528:
    iVar24 = 0;
  }
  else {
    if (0x1000a < (int)param_4) {
      if (iVar20 == 0) {
        if (*(int *)((long)param_1 + 0x4010) == 0) {
          uVar33 = 0;
        }
        else {
          uVar33 = *(int *)((long)param_1 + 0x4010) + 0x10000;
          *(uint *)((long)param_1 + 0x4010) = uVar33;
        }
      }
      else {
        memset(param_1,0,0x4000);
        uVar33 = 0;
        *(undefined8 *)((long)param_1 + 0x4010) = 0;
      }
      *(undefined4 *)((long)param_1 + 0x4018) = 0;
      *(undefined8 *)((long)param_1 + 0x4008) = 0;
      *(undefined8 *)((long)param_1 + 0x4000) = 0;
      if (param_4 < 0x7e000001) {
        uVar15 = (ulong)param_4;
        plVar34 = (long *)((long)param_2 + 2);
        lVar32 = *param_2;
        *(uint *)((long)param_1 + 0x4010) = uVar33 + param_4;
        lVar25 = (long)param_2 - (ulong)uVar33;
        *(undefined4 *)((long)param_1 + 0x4014) = 2;
        *(uint *)((long)param_1 + 0x4018) = param_4;
        plVar28 = (long *)((long)param_2 + (uVar15 - 0xb));
        puVar27 = (ulong *)((long)param_2 + (uVar15 - 0xc));
        *(uint *)((long)param_1 + ((ulong)(lVar32 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = uVar33
        ;
LAB_008d05e0:
        uVar22 = param_6 << 6 | 1;
        lVar32 = *(long *)((long)plVar14 + 1U);
        plVar23 = (long *)((long)plVar14 + 1U);
        uVar13 = param_6;
        while( true ) {
          plVar29 = plVar34;
          iVar24 = (int)lVar25;
          uVar5 = (int)plVar23 - iVar24;
          uVar26 = (ulong)(lVar32 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
          lVar32 = *plVar29;
          uVar4 = *(uint *)((long)param_1 + uVar26);
          uVar31 = (ulong)uVar4;
          *(uint *)((long)param_1 + uVar26) = uVar5;
          if ((uVar5 <= uVar4 + 0xffff) && (*(int *)(lVar25 + uVar31) == (int)*plVar23)) break;
          uVar31 = (ulong)uVar13;
          uVar13 = uVar22 >> 6;
          uVar22 = uVar22 + 1;
          plVar34 = (long *)((long)plVar29 + uVar31);
          plVar23 = plVar29;
          if (plVar28 < (long *)((long)plVar29 + uVar31)) goto LAB_008d09e4;
        }
        plVar34 = (long *)(lVar25 + uVar31);
        if ((param_2 < plVar34) && (*(char *)((long)plVar23 - 1) == *(char *)((long)plVar34 - 1))) {
          plVar10 = (long *)((long)plVar23 - 1U);
          plVar11 = (long *)((long)param_2 + uVar31 + ~(ulong)uVar33);
          plVar21 = (long *)((long)plVar23 - 1U);
          do {
            plVar23 = plVar21;
            plVar34 = plVar11;
            plVar29 = plVar10;
            if ((plVar34 <= param_2) || (plVar29 <= plVar14)) break;
            plVar10 = (long *)((long)plVar29 + -1);
            plVar11 = (long *)((long)plVar34 + -1);
            plVar21 = (long *)((long)plVar23 - 1);
          } while (*(char *)((long)plVar29 + -1) == *(char *)((long)plVar34 + -1));
        }
        else {
          plVar29 = plVar23;
        }
        plVar10 = (long *)((long)param_3 + 1);
        uVar13 = (uint)((long)plVar23 - (long)plVar14);
        uVar22 = uVar13 - 0xf;
        if (uVar13 < 0xf) {
          *(char *)param_3 = (char)(uVar13 << 4);
        }
        else {
          *(char *)param_3 = -0x10;
          plVar11 = plVar10;
          if (0xfe < uVar22) {
            uVar13 = ((int)plVar23 - (int)plVar14) - 0x10e;
            memset(plVar10,0xff,(ulong)uVar13 / 0xff + 1);
            uVar22 = uVar13 + uVar13 / 0xff;
            plVar11 = (long *)((long)param_3 + (ulong)uVar13 / 0xff + 2);
          }
          plVar10 = (long *)((long)plVar11 + 1);
          *(char *)plVar11 = (char)uVar22;
        }
        uVar26 = (long)plVar23 - (long)plVar14 & 0xffffffff;
        uVar31 = uVar26;
        if (uVar26 < 9) {
          uVar31 = 8;
        }
        plVar23 = (long *)((long)plVar10 + uVar26);
        if ((0x18 < uVar26) && (0x1f < (ulong)((long)plVar10 - (long)plVar14))) {
          plVar11 = plVar10 + 2;
          plVar21 = plVar14 + 2;
          uVar31 = (uVar31 - 1 >> 3) + 1;
          uVar19 = uVar31 & 0x3ffffffffffffffc;
          uVar26 = uVar19;
          do {
            plVar6 = plVar21 + -1;
            lVar32 = plVar21[-2];
            lVar36 = plVar21[1];
            lVar35 = *plVar21;
            uVar26 = uVar26 - 4;
            plVar21 = plVar21 + 4;
            plVar11[-1] = *plVar6;
            plVar11[-2] = lVar32;
            plVar11[1] = lVar36;
            *plVar11 = lVar35;
            plVar11 = plVar11 + 4;
          } while (uVar26 != 0);
          plVar14 = plVar14 + uVar19;
          plVar10 = plVar10 + uVar19;
          if (uVar31 == uVar19) goto LAB_008d076c;
        }
        do {
          plVar11 = plVar10 + 1;
          *plVar10 = *plVar14;
          plVar14 = plVar14 + 1;
          plVar10 = plVar11;
        } while (plVar11 < plVar23);
LAB_008d076c:
        plVar14 = plVar29;
        do {
          puVar1 = (ulong *)((long)plVar14 + 4);
          puVar17 = (ulong *)((long)plVar34 + 4);
          psVar9 = (short *)((long)plVar23 + 2);
          *(short *)plVar23 = (short)plVar14 - (short)plVar34;
          puVar18 = puVar1;
          if (puVar1 < puVar27) {
            if (*puVar17 == *puVar1) {
              puVar18 = (ulong *)((long)plVar14 + 0xc);
              puVar17 = (ulong *)((long)plVar34 + 0xc);
              goto joined_r0x008d0990;
            }
            uVar31 = *puVar1 ^ *puVar17;
            uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
            uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
            uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
            uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
            uVar31 = (ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3;
            uVar13 = (uint)uVar31;
            plVar14 = (long *)((long)plVar14 + uVar31 + 4);
LAB_008d090c:
            *(char *)param_3 = (char)*param_3 + (char)uVar13;
            param_3 = psVar9;
          }
          else {
joined_r0x008d0990:
            for (; puVar18 < puVar27; puVar18 = puVar18 + 1) {
              if (*puVar17 != *puVar18) {
                uVar31 = *puVar18 ^ *puVar17;
                uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
                uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
                uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
                uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
                puVar18 = (ulong *)((long)puVar18 +
                                   ((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3));
                goto LAB_008d0874;
              }
              puVar17 = puVar17 + 1;
            }
            if (puVar18 < (ulong *)((long)param_2 + (uVar15 - 8))) {
              if ((int)*puVar17 == (int)*puVar18) {
                puVar18 = (ulong *)((long)puVar18 + 4);
                puVar17 = (ulong *)((long)puVar17 + 4);
              }
            }
            if (puVar18 < (ulong *)((long)param_2 + (uVar15 - 6))) {
              if ((short)*puVar17 == (short)*puVar18) {
                puVar18 = (ulong *)((long)puVar18 + 2);
                puVar17 = (ulong *)((long)puVar17 + 2);
              }
            }
            if (puVar18 < (ulong *)((long)param_2 + (uVar15 - 5))) {
              if ((char)*puVar17 == (char)*puVar18) {
                puVar18 = (ulong *)((long)puVar18 + 1);
              }
            }
LAB_008d0874:
            uVar13 = (uint)((long)puVar18 - (long)puVar1);
            uVar22 = uVar13 - 0xf;
            plVar14 = (long *)((long)plVar14 + ((long)puVar18 - (long)puVar1 & 0xffffffffU) + 4);
            if (uVar13 < 0xf) goto LAB_008d090c;
            *(char *)param_3 = (char)*param_3 + '\x0f';
            psVar9[0] = -1;
            psVar9[1] = -1;
            if (0x3fb < uVar22) {
              uVar31 = (ulong)((uVar13 - 0x40b) / 0x3fc << 2);
              memset((short *)((long)plVar23 + 6),0xff,uVar31 + 4);
              uVar22 = (uVar13 - 0x40b) % 0x3fc;
              psVar9 = (short *)((long)plVar23 + 6 + uVar31);
            }
            uVar13 = (uVar22 & 0xffff) / 0xff;
            pcVar30 = (char *)((long)psVar9 + (ulong)uVar13);
            *pcVar30 = (char)uVar22 + (char)uVar13;
            param_3 = (short *)(pcVar30 + 1);
          }
          if (plVar28 <= plVar14) goto LAB_008d09e4;
          lVar32 = *plVar14;
          *(int *)((long)param_1 +
                  ((ulong)(*(long *)((long)plVar14 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
               (int)(long *)((long)plVar14 + -2) - iVar24;
          uVar31 = (ulong)(lVar32 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
          uVar13 = (int)plVar14 - iVar24;
          uVar22 = *(uint *)((long)param_1 + uVar31);
          *(uint *)((long)param_1 + uVar31) = uVar13;
          if ((uVar22 + 0xffff < uVar13) ||
             (plVar34 = (long *)(lVar25 + (ulong)uVar22), (int)*plVar34 != (int)*plVar14))
          goto LAB_008d05cc;
          plVar23 = (long *)((long)param_3 + 1);
          *(char *)param_3 = '\0';
        } while( true );
      }
      goto LAB_008d0528;
    }
    if (iVar20 == 3) {
      if (((int)param_4 < 0x1000) &&
         (uVar33 = *(uint *)((long)param_1 + 0x4010), uVar33 + param_4 < 0xffff)) goto LAB_008cff98;
LAB_008d0058:
      memset(param_1,0,0x4000);
      *(undefined8 *)((long)param_1 + 0x4000) = 0;
      *(undefined8 *)((long)param_1 + 0x4010) = 0;
      *(undefined8 *)((long)param_1 + 0x4008) = 0;
      *(undefined4 *)((long)param_1 + 0x4018) = 0;
LAB_008d0080:
      if (0x7e000000 < param_4) goto LAB_008d0528;
      if (param_4 != 0) {
        uVar15 = (ulong)param_4;
        *(uint *)((long)param_1 + 0x4018) = param_4;
        *(uint *)((long)param_1 + 0x4010) = param_4;
        *(undefined4 *)((long)param_1 + 0x4014) = 3;
        if (0xc < param_4) {
          plVar34 = (long *)((long)param_2 + (uVar15 - 0xb));
          puVar27 = (ulong *)((long)param_2 + (uVar15 - 0xc));
          *(undefined2 *)((long)param_1 + (ulong)((uint)((int)*param_2 * -0x61c8864f) >> 0x13) * 2)
               = 0;
LAB_008d0114:
          uVar31 = 1;
          plVar28 = (long *)((long)plVar14 + 1U);
          uVar33 = param_6 << 6;
          iVar24 = *(int *)((long)plVar14 + 1U);
          do {
            plVar23 = plVar28;
            plVar28 = (long *)((long)plVar23 + uVar31);
            if (plVar34 < plVar28) goto LAB_008d0aa0;
            lVar32 = *plVar28;
            uVar22 = (uint)(iVar24 * -0x61c8864f) >> 0x13;
            uVar3 = *(ushort *)((long)param_1 + (ulong)uVar22 * 2);
            uVar26 = (ulong)uVar3;
            bVar8 = *(int *)((long)param_2 + uVar26) != iVar24;
            uVar31 = (ulong)(uVar33 >> 6);
            uVar33 = uVar33 + 1;
            *(short *)((long)param_1 + (ulong)uVar22 * 2) = (short)plVar23 - sVar7;
            iVar24 = (int)lVar32;
          } while (bVar8);
          plVar28 = (long *)((long)param_2 + uVar26);
          if ((uVar3 == 0) || (*(char *)((long)plVar23 - 1) != *(char *)((long)plVar28 + -1))) {
            plVar29 = plVar23;
          }
          else {
            plVar10 = (long *)((long)plVar23 - 1U);
            plVar11 = (long *)((long)param_2 + (uVar26 - 1));
            plVar21 = (long *)((long)plVar23 - 1U);
            do {
              plVar23 = plVar21;
              plVar28 = plVar11;
              plVar29 = plVar10;
              if ((plVar28 <= param_2) || (plVar29 <= plVar14)) break;
              plVar10 = (long *)((long)plVar29 + -1);
              plVar11 = (long *)((long)plVar28 + -1);
              plVar21 = (long *)((long)plVar23 - 1);
            } while (*(char *)((long)plVar29 + -1) == *(char *)((long)plVar28 + -1));
          }
          plVar10 = (long *)((long)param_3 + 1);
          uVar22 = (uint)((long)plVar23 - (long)plVar14);
          uVar33 = uVar22 - 0xf;
          if (uVar22 < 0xf) {
            *(char *)param_3 = (char)(uVar22 << 4);
          }
          else {
            *(char *)param_3 = -0x10;
            plVar11 = plVar10;
            if (0xfe < uVar33) {
              uVar22 = ((int)plVar23 - (int)plVar14) - 0x10e;
              memset(plVar10,0xff,(ulong)uVar22 / 0xff + 1);
              uVar33 = uVar22 + uVar22 / 0xff;
              plVar11 = (long *)((long)param_3 + (ulong)uVar22 / 0xff + 2);
            }
            plVar10 = (long *)((long)plVar11 + 1);
            *(char *)plVar11 = (char)uVar33;
          }
          uVar26 = (long)plVar23 - (long)plVar14 & 0xffffffff;
          uVar31 = uVar26;
          if (uVar26 < 9) {
            uVar31 = 8;
          }
          plVar23 = (long *)((long)plVar10 + uVar26);
          psVar9 = param_3;
          if ((0x18 < uVar26) && (0x1f < (ulong)((long)plVar10 - (long)plVar14))) {
            plVar11 = plVar10 + 2;
            plVar21 = plVar14 + 2;
            uVar31 = (uVar31 - 1 >> 3) + 1;
            uVar19 = uVar31 & 0x3ffffffffffffffc;
            plVar14 = plVar14 + uVar19;
            plVar10 = plVar10 + uVar19;
            uVar26 = uVar19;
            do {
              plVar6 = plVar21 + -1;
              lVar32 = plVar21[-2];
              lVar35 = plVar21[1];
              lVar25 = *plVar21;
              uVar26 = uVar26 - 4;
              plVar21 = plVar21 + 4;
              plVar11[-1] = *plVar6;
              plVar11[-2] = lVar32;
              plVar11[1] = lVar35;
              *plVar11 = lVar25;
              plVar11 = plVar11 + 4;
            } while (uVar26 != 0);
            if (uVar31 == uVar19) goto LAB_008d02a0;
          }
          do {
            plVar11 = plVar10 + 1;
            *plVar10 = *plVar14;
            plVar14 = plVar14 + 1;
            plVar10 = plVar11;
          } while (plVar11 < plVar23);
LAB_008d02a0:
          do {
            puVar1 = (ulong *)((long)plVar29 + 4);
            puVar17 = (ulong *)((long)plVar28 + 4);
            param_3 = (short *)((long)plVar23 + 2);
            *(short *)plVar23 = (short)plVar29 - (short)plVar28;
            puVar18 = puVar1;
            if (puVar1 < puVar27) {
              if (*puVar17 == *puVar1) {
                puVar18 = (ulong *)((long)plVar29 + 0xc);
                puVar17 = (ulong *)((long)plVar28 + 0xc);
                goto joined_r0x008d0490;
              }
              uVar31 = *puVar1 ^ *puVar17;
              uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
              uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
              uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
              uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
              uVar31 = (ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3;
              uVar22 = (uint)uVar31;
              plVar14 = (long *)((long)plVar29 + uVar31 + 4);
LAB_008d0424:
              *(char *)psVar9 = (char)*psVar9 + (char)uVar22;
            }
            else {
joined_r0x008d0490:
              for (; puVar18 < puVar27; puVar18 = puVar18 + 1) {
                if (*puVar17 != *puVar18) {
                  uVar31 = *puVar18 ^ *puVar17;
                  uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
                  uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
                  uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
                  uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10
                  ;
                  puVar18 = (ulong *)((long)puVar18 +
                                     ((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3));
                  goto LAB_008d03a0;
                }
                puVar17 = puVar17 + 1;
              }
              if (puVar18 < (ulong *)((long)param_2 + (uVar15 - 8))) {
                if ((int)*puVar17 == (int)*puVar18) {
                  puVar18 = (ulong *)((long)puVar18 + 4);
                  puVar17 = (ulong *)((long)puVar17 + 4);
                }
              }
              if (puVar18 < (ulong *)((long)param_2 + (uVar15 - 6))) {
                if ((short)*puVar17 == (short)*puVar18) {
                  puVar18 = (ulong *)((long)puVar18 + 2);
                  puVar17 = (ulong *)((long)puVar17 + 2);
                }
              }
              if (puVar18 < (ulong *)((long)param_2 + (uVar15 - 5))) {
                if ((char)*puVar17 == (char)*puVar18) {
                  puVar18 = (ulong *)((long)puVar18 + 1);
                }
              }
LAB_008d03a0:
              uVar22 = (uint)((long)puVar18 - (long)puVar1);
              uVar33 = uVar22 - 0xf;
              plVar14 = (long *)((long)plVar29 + ((long)puVar18 - (long)puVar1 & 0xffffffffU) + 4);
              if (uVar22 < 0xf) goto LAB_008d0424;
              *(char *)psVar9 = (char)*psVar9 + '\x0f';
              param_3[0] = -1;
              param_3[1] = -1;
              if (0x3fb < uVar33) {
                uVar31 = (ulong)((uVar22 - 0x40b) / 0x3fc << 2);
                memset((short *)((long)plVar23 + 6),0xff,uVar31 + 4);
                uVar33 = (uVar22 - 0x40b) % 0x3fc;
                param_3 = (short *)((long)plVar23 + 6 + uVar31);
              }
              uVar22 = (uVar33 & 0xffff) / 0xff;
              pcVar30 = (char *)((long)param_3 + (ulong)uVar22);
              param_3 = (short *)(pcVar30 + 1);
              *pcVar30 = (char)uVar33 + (char)uVar22;
            }
            if (plVar34 <= plVar14) break;
            lVar32 = *plVar14;
            uVar33 = (uint)((int)lVar32 * -0x61c8864f) >> 0x13;
            *(short *)((long)param_1 +
                      (ulong)((uint)(*(int *)((long)plVar14 + -2) * -0x61c8864f) >> 0x13) * 2) =
                 (short)(int *)((long)plVar14 + -2) - sVar7;
            plVar28 = (long *)((long)param_2 + (ulong)*(ushort *)((long)param_1 + (ulong)uVar33 * 2)
                              );
            lVar25 = *plVar28;
            *(short *)((long)param_1 + (ulong)uVar33 * 2) = (short)plVar14 - sVar7;
            if ((int)lVar25 != (int)lVar32) goto LAB_008d0114;
            plVar23 = (long *)((long)param_3 + 1);
            *(char *)param_3 = '\0';
            plVar29 = plVar14;
            psVar9 = param_3;
          } while( true );
        }
LAB_008d0aa0:
        __n = (long)param_2 + (uVar15 - (long)plVar14);
        uVar31 = __n - 0xf;
        if (__n < 0xf) {
          *(char *)param_3 = (char)((int)__n << 4);
        }
        else {
          psVar9 = (short *)((long)param_3 + 1);
          *(char *)param_3 = -0x10;
          if (0xfe < uVar31) {
            uVar31 = (long)param_2 + (uVar15 - (long)plVar14) + -0x10e;
            uVar15 = uVar31 / 0xff;
            memset(psVar9,0xff,uVar15 + 1);
            psVar9 = (short *)((long)param_3 + uVar15 + 2);
            uVar31 = uVar31 % 0xff;
          }
          *(char *)psVar9 = (char)uVar31;
          param_3 = psVar9;
        }
        pcVar30 = (char *)((long)param_3 + 1);
LAB_008d14fc:
        memcpy(pcVar30,plVar14,__n);
        return ((int)pcVar30 + (int)__n) - iVar12;
      }
    }
    else {
      if (iVar20 != 0) goto LAB_008d0058;
      uVar33 = *(uint *)((long)param_1 + 0x4010);
LAB_008cff98:
      *(undefined4 *)((long)param_1 + 0x4018) = 0;
      *(undefined8 *)((long)param_1 + 0x4008) = 0;
      *(undefined8 *)((long)param_1 + 0x4000) = 0;
      if (uVar33 == 0) goto LAB_008d0080;
      if (0x7e000000 < param_4) goto LAB_008d0528;
      if (param_4 != 0) {
        uVar15 = (ulong)param_4;
        *(undefined4 *)((long)param_1 + 0x4014) = 3;
        *(uint *)((long)param_1 + 0x4018) = param_4;
        *(uint *)((long)param_1 + 0x4010) = uVar33 + param_4;
        if (0xc < param_4) {
          plVar34 = (long *)((long)param_2 + 2);
          plVar28 = (long *)((long)param_2 + (uVar15 - 0xb));
          puVar27 = (ulong *)((long)param_2 + (uVar15 - 0xc));
          lVar32 = (long)param_2 - (ulong)uVar33;
          *(short *)((long)param_1 + (ulong)((uint)((int)*param_2 * -0x61c8864f) >> 0x13) * 2) =
               (short)uVar33;
LAB_008d1100:
          uVar22 = param_6 << 6 | 1;
          iVar24 = *(int *)((long)plVar14 + 1U);
          plVar23 = (long *)((long)plVar14 + 1U);
          uVar13 = param_6;
          while( true ) {
            plVar29 = plVar34;
            uVar4 = (uint)(iVar24 * -0x61c8864f) >> 0x13;
            iVar24 = (int)*plVar29;
            sVar7 = (short)lVar32;
            uVar3 = *(ushort *)((long)param_1 + (ulong)uVar4 * 2);
            uVar31 = (ulong)uVar3;
            *(short *)((long)param_1 + (ulong)uVar4 * 2) = (short)plVar23 - sVar7;
            if ((uVar33 <= uVar3) && (*(int *)(lVar32 + uVar31) == (int)*plVar23)) break;
            uVar31 = (ulong)uVar13;
            uVar13 = uVar22 >> 6;
            uVar22 = uVar22 + 1;
            plVar34 = (long *)((long)plVar29 + uVar31);
            plVar23 = plVar29;
            if (plVar28 < (long *)((long)plVar29 + uVar31)) goto LAB_008cffec;
          }
          plVar34 = (long *)(lVar32 + uVar31);
          if ((param_2 < plVar34) && (*(char *)((long)plVar23 - 1) == *(char *)((long)plVar34 - 1)))
          {
            plVar10 = (long *)((long)plVar23 - 1U);
            plVar11 = (long *)((long)param_2 + uVar31 + ~(ulong)uVar33);
            plVar21 = (long *)((long)plVar23 - 1U);
            do {
              plVar23 = plVar21;
              plVar34 = plVar11;
              plVar29 = plVar10;
              if ((plVar34 <= param_2) || (plVar29 <= plVar14)) break;
              plVar10 = (long *)((long)plVar29 + -1);
              plVar11 = (long *)((long)plVar34 + -1);
              plVar21 = (long *)((long)plVar23 - 1);
            } while (*(char *)((long)plVar29 + -1) == *(char *)((long)plVar34 + -1));
          }
          else {
            plVar29 = plVar23;
          }
          plVar10 = (long *)((long)param_3 + 1);
          uVar13 = (uint)((long)plVar23 - (long)plVar14);
          uVar22 = uVar13 - 0xf;
          if (uVar13 < 0xf) {
            *(char *)param_3 = (char)(uVar13 << 4);
          }
          else {
            *(char *)param_3 = -0x10;
            plVar11 = plVar10;
            if (0xfe < uVar22) {
              uVar22 = ((int)plVar23 - (int)plVar14) - 0x10e;
              uVar31 = (ulong)uVar22 / 0xff;
              memset(plVar10,0xff,uVar31 + 1);
              plVar11 = (long *)((long)param_3 + uVar31 + 2);
              uVar22 = uVar22 + (int)uVar31;
            }
            plVar10 = (long *)((long)plVar11 + 1);
            *(char *)plVar11 = (char)uVar22;
          }
          uVar26 = (long)plVar23 - (long)plVar14 & 0xffffffff;
          uVar31 = uVar26;
          if (uVar26 < 9) {
            uVar31 = 8;
          }
          plVar23 = (long *)((long)plVar10 + uVar26);
          if ((0x18 < uVar26) && (0x1f < (ulong)((long)plVar10 - (long)plVar14))) {
            plVar11 = plVar10 + 2;
            plVar21 = plVar14 + 2;
            uVar31 = (uVar31 - 1 >> 3) + 1;
            uVar19 = uVar31 & 0x3ffffffffffffffc;
            uVar26 = uVar19;
            do {
              plVar6 = plVar21 + -1;
              lVar25 = plVar21[-2];
              lVar36 = plVar21[1];
              lVar35 = *plVar21;
              uVar26 = uVar26 - 4;
              plVar21 = plVar21 + 4;
              plVar11[-1] = *plVar6;
              plVar11[-2] = lVar25;
              plVar11[1] = lVar36;
              *plVar11 = lVar35;
              plVar11 = plVar11 + 4;
            } while (uVar26 != 0);
            plVar14 = plVar14 + uVar19;
            plVar10 = plVar10 + uVar19;
            if (uVar31 == uVar19) goto LAB_008d1288;
          }
          do {
            plVar11 = plVar10 + 1;
            *plVar10 = *plVar14;
            plVar14 = plVar14 + 1;
            plVar10 = plVar11;
          } while (plVar11 < plVar23);
LAB_008d1288:
          plVar14 = plVar29;
          do {
            puVar1 = (ulong *)((long)plVar14 + 4);
            puVar17 = (ulong *)((long)plVar34 + 4);
            psVar9 = (short *)((long)plVar23 + 2);
            *(short *)plVar23 = (short)plVar14 - (short)plVar34;
            puVar18 = puVar1;
            if (puVar1 < puVar27) {
              if (*puVar17 == *puVar1) {
                puVar18 = (ulong *)((long)plVar14 + 0xc);
                puVar17 = (ulong *)((long)plVar34 + 0xc);
                goto joined_r0x008d1498;
              }
              uVar31 = *puVar1 ^ *puVar17;
              uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
              uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
              uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
              uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10;
              uVar31 = (ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3;
              uVar13 = (uint)uVar31;
              plVar14 = (long *)((long)plVar14 + uVar31 + 4);
LAB_008d1424:
              *(char *)param_3 = (char)*param_3 + (char)uVar13;
              param_3 = psVar9;
            }
            else {
joined_r0x008d1498:
              for (; puVar18 < puVar27; puVar18 = puVar18 + 1) {
                if (*puVar17 != *puVar18) {
                  uVar31 = *puVar18 ^ *puVar17;
                  uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar31 & 0x5555555555555555) << 1;
                  uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 | (uVar31 & 0x3333333333333333) << 2;
                  uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 | (uVar31 & 0xff00ff00ff00ff) << 8;
                  uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 | (uVar31 & 0xffff0000ffff) << 0x10
                  ;
                  puVar18 = (ulong *)((long)puVar18 +
                                     ((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3));
                  goto LAB_008d1390;
                }
                puVar17 = puVar17 + 1;
              }
              if (puVar18 < (ulong *)((long)param_2 + (uVar15 - 8))) {
                if ((int)*puVar17 == (int)*puVar18) {
                  puVar18 = (ulong *)((long)puVar18 + 4);
                  puVar17 = (ulong *)((long)puVar17 + 4);
                }
              }
              if (puVar18 < (ulong *)((long)param_2 + (uVar15 - 6))) {
                if ((short)*puVar17 == (short)*puVar18) {
                  puVar18 = (ulong *)((long)puVar18 + 2);
                  puVar17 = (ulong *)((long)puVar17 + 2);
                }
              }
              if (puVar18 < (ulong *)((long)param_2 + (uVar15 - 5))) {
                if ((char)*puVar17 == (char)*puVar18) {
                  puVar18 = (ulong *)((long)puVar18 + 1);
                }
              }
LAB_008d1390:
              uVar13 = (uint)((long)puVar18 - (long)puVar1);
              uVar22 = uVar13 - 0xf;
              plVar14 = (long *)((long)plVar14 + ((long)puVar18 - (long)puVar1 & 0xffffffffU) + 4);
              if (uVar13 < 0xf) goto LAB_008d1424;
              *(char *)param_3 = (char)*param_3 + '\x0f';
              psVar9[0] = -1;
              psVar9[1] = -1;
              if (0x3fb < uVar22) {
                uVar31 = (ulong)((uVar13 - 0x40b) / 0x3fc << 2);
                memset((short *)((long)plVar23 + 6),0xff,uVar31 + 4);
                psVar9 = (short *)((long)plVar23 + 6 + uVar31);
                uVar22 = (uVar13 - 0x40b) % 0x3fc;
              }
              uVar13 = (uVar22 & 0xffff) / 0xff;
              pcVar30 = (char *)((long)psVar9 + (ulong)uVar13);
              *pcVar30 = (char)uVar22 + (char)uVar13;
              param_3 = (short *)(pcVar30 + 1);
            }
            if (plVar28 <= plVar14) break;
            lVar25 = *plVar14;
            uVar22 = (uint)((int)lVar25 * -0x61c8864f) >> 0x13;
            *(short *)((long)param_1 +
                      (ulong)((uint)(*(int *)((long)plVar14 + -2) * -0x61c8864f) >> 0x13) * 2) =
                 (short)(int *)((long)plVar14 + -2) - sVar7;
            uVar3 = *(ushort *)((long)param_1 + (ulong)uVar22 * 2);
            *(short *)((long)param_1 + (ulong)uVar22 * 2) = (short)plVar14 - sVar7;
            if ((uVar3 < uVar33) ||
               (plVar34 = (long *)(lVar32 + (ulong)uVar3), (int)*plVar34 != (int)lVar25))
            goto LAB_008d10f0;
            plVar23 = (long *)((long)param_3 + 1);
            *(char *)param_3 = '\0';
          } while( true );
        }
LAB_008cffec:
        __n = (long)param_2 + (uVar15 - (long)plVar14);
        uVar31 = __n - 0xf;
        if (__n < 0xf) {
          *(char *)param_3 = (char)((int)__n << 4);
        }
        else {
          psVar9 = (short *)((long)param_3 + 1);
          *(char *)param_3 = -0x10;
          if (0xfe < uVar31) {
            uVar31 = (long)param_2 + (uVar15 - (long)plVar14) + -0x10e;
            uVar15 = uVar31 / 0xff;
            memset(psVar9,0xff,uVar15 + 1);
            psVar9 = (short *)((long)param_3 + uVar15 + 2);
            uVar31 = uVar31 % 0xff;
          }
          *(char *)psVar9 = (char)uVar31;
          param_3 = psVar9;
        }
        pcVar30 = (char *)((long)param_3 + 1);
        goto LAB_008d14fc;
      }
    }
LAB_008d04fc:
    iVar24 = 1;
    *(char *)param_3 = '\0';
  }
  return iVar24;
LAB_008cf480:
  plVar14 = (long *)((long)plVar29 + (ulong)uVar22 + 6);
  plVar34 = (long *)((long)plVar29 + (ulong)uVar22 + 5);
  if (plVar23 < plVar14) goto LAB_008cf8e4;
  goto LAB_008cf498;
LAB_008cf8e4:
  uVar31 = (long)param_2 + (uVar15 - (long)plVar28);
  if ((char *)((long)param_3 + (uVar31 + 0xf0) / 0xff + uVar31 + 1) <= pcVar30) {
    uVar26 = uVar31 - 0xf;
    if (uVar31 < 0xf) {
      *(char *)param_3 = (char)((int)uVar31 << 4);
    }
    else {
      psVar9 = (short *)((long)param_3 + 1);
      *(char *)param_3 = -0x10;
      if (0xfe < uVar26) {
        uVar26 = (long)param_2 + (uVar15 - (long)plVar28) + -0x10e;
        uVar15 = uVar26 / 0xff;
        memset(psVar9,0xff,uVar15 + 1);
        psVar9 = (short *)((long)param_3 + uVar15 + 2);
        uVar26 = uVar26 % 0xff;
      }
      *(char *)psVar9 = (char)uVar26;
      param_3 = psVar9;
    }
    memcpy((char *)((long)param_3 + 1),plVar28,uVar31);
    return ((int)(char *)((long)param_3 + 1) + (int)uVar31) - iVar12;
  }
  goto LAB_008d0528;
LAB_008d0c44:
  plVar34 = (long *)((long)plVar29 + (ulong)uVar22 + 6);
  plVar28 = (long *)((long)plVar29 + (ulong)uVar22 + 5);
  if (plVar23 < plVar34) goto LAB_008cfa00;
  goto LAB_008d0c58;
LAB_008d05cc:
  plVar34 = (long *)((long)plVar14 + 2);
  if (plVar28 < plVar34) goto LAB_008d09e4;
  goto LAB_008d05e0;
LAB_008d09e4:
  __n = (long)param_2 + (uVar15 - (long)plVar14);
  uVar31 = __n - 0xf;
  if (__n < 0xf) {
    *(char *)param_3 = (char)((int)__n << 4);
  }
  else {
    psVar9 = (short *)((long)param_3 + 1);
    *(char *)param_3 = -0x10;
    if (0xfe < uVar31) {
      uVar31 = (long)param_2 + (uVar15 - (long)plVar14) + -0x10e;
      uVar15 = uVar31 / 0xff;
      memset(psVar9,0xff,uVar15 + 1);
      psVar9 = (short *)((long)param_3 + uVar15 + 2);
      uVar31 = uVar31 % 0xff;
    }
    *(char *)psVar9 = (char)uVar31;
    param_3 = psVar9;
  }
  pcVar30 = (char *)((long)param_3 + 1);
  goto LAB_008d14fc;
LAB_008d10f0:
  plVar34 = (long *)((long)plVar14 + 2);
  if (plVar28 < plVar34) goto LAB_008cffec;
  goto LAB_008d1100;
}

