/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d1670
 */

ulong FUN_008d1670(void *param_1,long *param_2,short *param_3,uint *param_4,int param_5,int param_6)

{
  ulong *puVar1;
  uint uVar2;
  long *plVar3;
  short sVar4;
  bool bVar5;
  short *psVar6;
  long *plVar8;
  long *plVar7;
  ulong uVar9;
  long *plVar10;
  int iVar11;
  char *pcVar12;
  ulong uVar13;
  uint uVar14;
  short *psVar15;
  int iVar16;
  uint uVar17;
  long *plVar18;
  ulong uVar19;
  ulong *puVar20;
  ulong uVar21;
  ulong *puVar22;
  long *plVar23;
  int iVar24;
  long lVar25;
  long *plVar26;
  long *plVar27;
  char *pcVar28;
  long *plVar29;
  long *plVar30;
  short *psVar31;
  long lVar32;
  ulong *puVar33;
  long lVar34;
  long lVar35;
  
  if ((param_1 != (void *)0x0) && (((ulong)param_1 & 7) == 0)) {
    memset(param_1,0,0x4020);
  }
  uVar17 = *param_4;
  uVar9 = (ulong)uVar17;
  if (uVar17 < 0x7e000001) {
    if ((int)((uint)(uVar9 * 0x8080808081 >> 0x27) + 0x10) <= param_5) goto LAB_008d16f0;
  }
  else if (-1 < param_5) {
LAB_008d16f0:
    uVar9 = LZ4_compress_fast_extState(param_1);
    return uVar9;
  }
  if ((int)uVar17 < 0x1000b) {
    if (uVar17 < 0x7e000001) {
      if (uVar17 == 0) {
        if (0 < param_5) {
          *(char *)param_3 = '\0';
          *param_4 = 0;
          return 1;
        }
      }
      else if (0 < param_5) {
        uVar2 = *(uint *)((long)param_1 + 0x4010);
        psVar6 = (short *)((long)param_3 + (long)param_5);
        *(uint *)((long)param_1 + 0x4018) = *(int *)((long)param_1 + 0x4018) + uVar17;
        *(uint *)((long)param_1 + 0x4010) = uVar2 + uVar17;
        *(undefined4 *)((long)param_1 + 0x4014) = 3;
        plVar30 = param_2;
        psVar15 = param_3;
        if (0xc < uVar17) {
          plVar26 = (long *)((long)param_2 + (uVar9 - 0xb));
          puVar33 = (ulong *)((long)param_2 + (uVar9 - 0xc));
          lVar32 = (long)param_2 - (ulong)uVar2;
          *(short *)((long)param_1 + (ulong)((uint)((int)*param_2 * -0x61c8864f) >> 0x13) * 2) =
               (short)uVar2;
LAB_008d1f44:
          iVar24 = 1;
          plVar10 = (long *)((long)plVar30 + 1);
          iVar11 = param_6 << 6;
          iVar16 = *(int *)((long)plVar30 + 1);
          do {
            plVar29 = plVar10;
            plVar10 = (long *)((long)plVar29 + (long)iVar24);
            if (plVar26 < plVar10) goto LAB_008d179c;
            lVar25 = *plVar10;
            uVar17 = (uint)(iVar16 * -0x61c8864f) >> 0x13;
            uVar19 = (ulong)*(ushort *)((long)param_1 + (ulong)uVar17 * 2);
            bVar5 = *(int *)(lVar32 + uVar19) != iVar16;
            iVar24 = iVar11 >> 6;
            sVar4 = (short)lVar32;
            iVar11 = iVar11 + 1;
            *(short *)((long)param_1 + (ulong)uVar17 * 2) = (short)plVar29 - sVar4;
            iVar16 = (int)lVar25;
          } while (bVar5);
          plVar10 = (long *)(lVar32 + uVar19);
          if ((param_2 < plVar10) && (*(char *)((long)plVar29 + -1) == *(char *)((long)plVar10 - 1))
             ) {
            plVar7 = (long *)((long)plVar29 + -1);
            plVar8 = (long *)((long)param_2 + uVar19 + ~(ulong)uVar2);
            plVar23 = (long *)((long)plVar29 + -1);
            do {
              plVar27 = plVar23;
              plVar10 = plVar8;
              plVar18 = plVar7;
              if ((plVar10 <= param_2) || (plVar18 <= plVar30)) break;
              plVar7 = (long *)((long)plVar18 + -1);
              plVar8 = (long *)((long)plVar10 + -1);
              plVar23 = (long *)((long)plVar27 + -1);
            } while (*(char *)((long)plVar18 + -1) == *(char *)((long)plVar10 + -1));
          }
          else {
            plVar27 = plVar29;
            plVar18 = plVar29;
          }
          plVar7 = (long *)((long)psVar15 + 1);
          uVar17 = (uint)((long)plVar27 - (long)plVar30);
          uVar19 = (long)plVar27 - (long)plVar30 & 0xffffffff;
          if ((short *)((long)plVar7 + uVar19 + (ulong)(uVar17 + 0xf0) / 0xff + 0xb) <= psVar6) {
            uVar14 = uVar17 - 0xf;
            if (uVar17 < 0xf) {
              *(char *)psVar15 = (char)(uVar17 << 4);
            }
            else {
              *(char *)psVar15 = -0x10;
              plVar8 = plVar7;
              if (0xfe < uVar14) {
                uVar14 = ((int)plVar27 - (int)plVar30) - 0x10e;
                uVar13 = (ulong)uVar14 / 0xff;
                memset(plVar7,0xff,uVar13 + 1);
                plVar8 = (long *)((long)psVar15 + uVar13 + 2);
                uVar14 = uVar14 + (int)uVar13;
              }
              plVar7 = (long *)((long)plVar8 + 1);
              *(char *)plVar8 = (char)uVar14;
            }
            uVar13 = uVar19;
            if (uVar19 < 9) {
              uVar13 = 8;
            }
            plVar27 = (long *)((long)plVar7 + uVar19);
            plVar8 = plVar30;
            if ((uVar19 < 0x19) || ((ulong)((long)plVar7 - (long)plVar30) < 0x20)) {
LAB_008d20f0:
              do {
                plVar23 = plVar7 + 1;
                *plVar7 = *plVar8;
                plVar8 = plVar8 + 1;
                plVar7 = plVar23;
              } while (plVar23 < plVar27);
            }
            else {
              plVar8 = plVar7 + 2;
              plVar23 = plVar30 + 2;
              uVar19 = (uVar13 - 1 >> 3) + 1;
              uVar21 = uVar19 & 0x3ffffffffffffffc;
              uVar13 = uVar21;
              do {
                plVar3 = plVar23 + -1;
                lVar25 = plVar23[-2];
                lVar35 = plVar23[1];
                lVar34 = *plVar23;
                uVar13 = uVar13 - 4;
                plVar23 = plVar23 + 4;
                plVar8[-1] = *plVar3;
                plVar8[-2] = lVar25;
                plVar8[1] = lVar35;
                *plVar8 = lVar34;
                plVar8 = plVar8 + 4;
              } while (uVar13 != 0);
              plVar8 = plVar30 + uVar21;
              plVar7 = plVar7 + uVar21;
              if (uVar19 != uVar21) goto LAB_008d20f0;
            }
            psVar31 = psVar15;
            if ((short *)((long)plVar27 + 0xb) <= psVar6) {
              do {
                puVar1 = (ulong *)((long)plVar18 + 4);
                puVar22 = (ulong *)((long)plVar10 + 4);
                psVar15 = (short *)((long)plVar27 + 2);
                *(short *)plVar27 = (short)plVar18 - (short)plVar10;
                puVar20 = puVar1;
                if (puVar1 < puVar33) {
                  if (*puVar22 == *puVar1) {
                    puVar22 = (ulong *)((long)plVar10 + 0xc);
                    puVar20 = (ulong *)((long)plVar18 + 0xc);
                    goto joined_r0x008d2334;
                  }
                  uVar19 = *puVar1 ^ *puVar22;
                  uVar19 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
                  uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
                  uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
                  uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10
                  ;
                  uVar17 = (uint)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3;
                }
                else {
joined_r0x008d2334:
                  if (puVar20 < puVar33) {
                    iVar11 = ((int)puVar20 - (int)plVar18) + -4;
                    do {
                      if (*puVar22 != *puVar20) {
                        uVar19 = *puVar20 ^ *puVar22;
                        uVar19 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                 (uVar19 & 0x5555555555555555) << 1;
                        uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 |
                                 (uVar19 & 0x3333333333333333) << 2;
                        uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                 (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
                        uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 |
                                 (uVar19 & 0xff00ff00ff00ff) << 8;
                        uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 |
                                 (uVar19 & 0xffff0000ffff) << 0x10;
                        uVar17 = (int)((ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3) +
                                 iVar11;
                        goto LAB_008d2214;
                      }
                      puVar20 = puVar20 + 1;
                      puVar22 = puVar22 + 1;
                      iVar11 = iVar11 + 8;
                    } while (puVar20 < puVar33);
                  }
                  if (puVar20 < (ulong *)((long)param_2 + (uVar9 - 8))) {
                    if ((int)*puVar22 == (int)*puVar20) {
                      puVar20 = (ulong *)((long)puVar20 + 4);
                      puVar22 = (ulong *)((long)puVar22 + 4);
                    }
                  }
                  if (puVar20 < (ulong *)((long)param_2 + (uVar9 - 6))) {
                    if ((short)*puVar22 == (short)*puVar20) {
                      puVar20 = (ulong *)((long)puVar20 + 2);
                      puVar22 = (ulong *)((long)puVar22 + 2);
                    }
                  }
                  if (puVar20 < (ulong *)((long)param_2 + (uVar9 - 5))) {
                    if ((char)*puVar22 == (char)*puVar20) {
                      puVar20 = (ulong *)((long)puVar20 + 1);
                    }
                  }
                  uVar17 = (int)puVar20 - (int)puVar1;
                }
LAB_008d2214:
                plVar30 = (long *)((long)plVar18 + (ulong)uVar17 + 4);
                uVar14 = uVar17;
                if (psVar6 < (short *)((long)plVar27 + (ulong)(uVar17 + 0xf0) / 0xff + 8)) {
                  uVar14 = ((int)psVar6 - (int)psVar15) * 0xff - 0x5ec;
                  plVar30 = (long *)((long)plVar30 - (ulong)(uVar17 - uVar14));
                  if (plVar30 <= plVar29) {
                    plVar10 = plVar30;
                    do {
                      plVar18 = (long *)((long)plVar10 + 1);
                      *(undefined2 *)
                       ((long)param_1 + (ulong)((uint)((int)*plVar10 * -0x61c8864f) >> 0x13) * 2) =
                           0;
                      plVar10 = plVar18;
                    } while (plVar18 <= plVar29);
                  }
                }
                uVar17 = uVar14 - 0xf;
                if (uVar14 < 0xf) {
                  *(char *)psVar31 = (char)*psVar31 + (char)uVar14;
                }
                else {
                  *(char *)psVar31 = (char)*psVar31 + '\x0f';
                  psVar15[0] = -1;
                  psVar15[1] = -1;
                  if (0x3fb < uVar17) {
                    uVar19 = (ulong)((uVar14 - 0x40b) / 0x3fc << 2);
                    memset((short *)((long)plVar27 + 6),0xff,uVar19 + 4);
                    uVar17 = (uVar14 - 0x40b) % 0x3fc;
                    psVar15 = (short *)((long)plVar27 + 6 + uVar19);
                  }
                  uVar14 = (uVar17 & 0xffff) / 0xff;
                  pcVar28 = (char *)((long)psVar15 + (ulong)uVar14);
                  psVar15 = (short *)(pcVar28 + 1);
                  *pcVar28 = (char)uVar17 + (char)uVar14;
                }
                if (plVar26 <= plVar30) break;
                lVar25 = *plVar30;
                uVar17 = (uint)((int)lVar25 * -0x61c8864f) >> 0x13;
                *(short *)((long)param_1 +
                          (ulong)((uint)(*(int *)((long)plVar30 + -2) * -0x61c8864f) >> 0x13) * 2) =
                     (short)(int *)((long)plVar30 + -2) - sVar4;
                plVar10 = (long *)(lVar32 + (ulong)*(ushort *)((long)param_1 + (ulong)uVar17 * 2));
                lVar34 = *plVar10;
                *(short *)((long)param_1 + (ulong)uVar17 * 2) = (short)plVar30 - sVar4;
                if ((int)lVar34 != (int)lVar25) goto LAB_008d1f44;
                *(char *)psVar15 = '\0';
                plVar27 = (long *)((long)psVar15 + 1);
                plVar18 = plVar30;
                psVar31 = psVar15;
                if (psVar6 < psVar15 + 6) break;
              } while( true );
            }
          }
        }
LAB_008d179c:
        pcVar28 = (char *)((long)param_2 + (uVar9 - (long)plVar30));
        if (psVar6 < (short *)((long)psVar15 + (long)(pcVar28 + (ulong)(pcVar28 + 0xf0) / 0xff + 1))
           ) {
          pcVar28 = (char *)((long)psVar6 +
                            (~(ulong)psVar15 - ((ulong)((long)psVar6 + ~(ulong)psVar15 + 0xf1) >> 8)
                            ));
        }
        pcVar12 = pcVar28 + -0xf;
        iVar11 = (int)pcVar28;
        if (pcVar28 < (char *)0xf) {
          *(char *)psVar15 = (char)(iVar11 << 4);
        }
        else {
          psVar6 = (short *)((long)psVar15 + 1);
          *(char *)psVar15 = -0x10;
          if ((char *)0xfe < pcVar12) {
            uVar9 = (ulong)(pcVar28 + -0x10e) / 0xff;
            memset(psVar6,0xff,uVar9 + 1);
            psVar6 = (short *)((long)psVar15 + uVar9 + 2);
            pcVar12 = (char *)((ulong)(pcVar28 + -0x10e) % 0xff);
          }
          *(char *)psVar6 = (char)pcVar12;
          psVar15 = psVar6;
        }
        memcpy((char *)((long)psVar15 + 1),plVar30,(size_t)pcVar28);
        iVar24 = (int)(char *)((long)psVar15 + 1) + iVar11;
        *param_4 = ((int)plVar30 + iVar11) - (int)param_2;
        goto LAB_008d243c;
      }
    }
  }
  else if ((uVar17 < 0x7e000001) && (0 < param_5)) {
    plVar30 = (long *)((long)param_2 + 2);
    lVar32 = *param_2;
    uVar2 = *(uint *)((long)param_1 + 0x4010);
    *(undefined4 *)((long)param_1 + 0x4014) = 2;
    *(uint *)((long)param_1 + 0x4018) = *(int *)((long)param_1 + 0x4018) + uVar17;
    psVar6 = (short *)((long)param_3 + (long)param_5);
    plVar10 = (long *)((long)param_2 + (uVar9 - 0xb));
    puVar33 = (ulong *)((long)param_2 + (uVar9 - 0xc));
    *(uint *)((long)param_1 + 0x4010) = uVar2 + uVar17;
    lVar25 = (long)param_2 - (ulong)uVar2;
    *(uint *)((long)param_1 + ((ulong)(lVar32 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = uVar2;
    plVar26 = param_2;
    psVar15 = param_3;
LAB_008d18ec:
    lVar32 = *(long *)((long)plVar26 + 1);
    plVar29 = (long *)((long)plVar26 + 1);
    iVar11 = param_6 << 6;
    while( true ) {
      plVar27 = plVar30;
      iVar24 = (int)lVar25;
      uVar14 = (int)plVar29 - iVar24;
      uVar13 = (ulong)(lVar32 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
      lVar32 = *plVar27;
      uVar17 = *(uint *)((long)param_1 + uVar13);
      uVar19 = (ulong)uVar17;
      *(uint *)((long)param_1 + uVar13) = uVar14;
      if ((uVar14 <= uVar17 + 0xffff) && (*(int *)(lVar25 + uVar19) == (int)*plVar29)) break;
      iVar24 = iVar11 >> 6;
      iVar11 = iVar11 + 1;
      plVar30 = (long *)((long)plVar27 + (long)iVar24);
      plVar29 = plVar27;
      if (plVar10 < plVar30) goto LAB_008d1de4;
    }
    plVar30 = (long *)(lVar25 + uVar19);
    if ((param_2 < plVar30) && (*(char *)((long)plVar29 + -1) == *(char *)((long)plVar30 - 1))) {
      plVar7 = (long *)((long)plVar29 + -1);
      plVar8 = (long *)((long)param_2 + uVar19 + ~(ulong)uVar2);
      plVar23 = (long *)((long)plVar29 + -1);
      do {
        plVar18 = plVar23;
        plVar30 = plVar8;
        plVar27 = plVar7;
        if ((plVar30 <= param_2) || (plVar27 <= plVar26)) break;
        plVar7 = (long *)((long)plVar27 + -1);
        plVar8 = (long *)((long)plVar30 + -1);
        plVar23 = (long *)((long)plVar18 + -1);
      } while (*(char *)((long)plVar27 + -1) == *(char *)((long)plVar30 + -1));
    }
    else {
      plVar27 = plVar29;
      plVar18 = plVar29;
    }
    plVar7 = (long *)((long)psVar15 + 1);
    uVar17 = (uint)((long)plVar18 - (long)plVar26);
    uVar19 = (long)plVar18 - (long)plVar26 & 0xffffffff;
    if ((short *)((long)plVar7 + uVar19 + (ulong)(uVar17 + 0xf0) / 0xff + 0xb) <= psVar6) {
      uVar14 = uVar17 - 0xf;
      if (uVar17 < 0xf) {
        *(char *)psVar15 = (char)(uVar17 << 4);
      }
      else {
        *(char *)psVar15 = -0x10;
        plVar8 = plVar7;
        if (0xfe < uVar14) {
          uVar14 = ((int)plVar18 - (int)plVar26) - 0x10e;
          uVar13 = (ulong)uVar14 / 0xff;
          memset(plVar7,0xff,uVar13 + 1);
          uVar14 = uVar14 + (int)uVar13;
          plVar8 = (long *)((long)psVar15 + uVar13 + 2);
        }
        plVar7 = (long *)((long)plVar8 + 1);
        *(char *)plVar8 = (char)uVar14;
      }
      uVar13 = uVar19;
      if (uVar19 < 9) {
        uVar13 = 8;
      }
      plVar18 = (long *)((long)plVar7 + uVar19);
      if ((uVar19 < 0x19) || ((ulong)((long)plVar7 - (long)plVar26) < 0x20)) {
        plVar8 = plVar26;
LAB_008d1aa0:
        do {
          plVar23 = plVar7 + 1;
          *plVar7 = *plVar8;
          plVar8 = plVar8 + 1;
          plVar7 = plVar23;
        } while (plVar23 < plVar18);
      }
      else {
        plVar8 = plVar7 + 2;
        plVar23 = plVar26 + 2;
        uVar19 = (uVar13 - 1 >> 3) + 1;
        uVar21 = uVar19 & 0x3ffffffffffffffc;
        uVar13 = uVar21;
        do {
          plVar3 = plVar23 + -1;
          lVar32 = plVar23[-2];
          lVar35 = plVar23[1];
          lVar34 = *plVar23;
          uVar13 = uVar13 - 4;
          plVar23 = plVar23 + 4;
          plVar8[-1] = *plVar3;
          plVar8[-2] = lVar32;
          plVar8[1] = lVar35;
          *plVar8 = lVar34;
          plVar8 = plVar8 + 4;
        } while (uVar13 != 0);
        plVar8 = plVar26 + uVar21;
        plVar7 = plVar7 + uVar21;
        if (uVar19 != uVar21) goto LAB_008d1aa0;
      }
      if ((short *)((long)plVar18 + 0xb) <= psVar6) {
        plVar26 = plVar27;
        psVar31 = psVar15;
        do {
          puVar1 = (ulong *)((long)plVar26 + 4);
          puVar22 = (ulong *)((long)plVar30 + 4);
          psVar15 = (short *)((long)plVar18 + 2);
          *(short *)plVar18 = (short)plVar26 - (short)plVar30;
          puVar20 = puVar1;
          if (puVar1 < puVar33) {
            if (*puVar22 == *puVar1) {
              puVar22 = (ulong *)((long)plVar30 + 0xc);
              puVar20 = (ulong *)((long)plVar26 + 0xc);
              goto joined_r0x008d1d10;
            }
            uVar19 = *puVar1 ^ *puVar22;
            uVar19 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
            uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
            uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
            uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
            uVar17 = (uint)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3;
          }
          else {
joined_r0x008d1d10:
            if (puVar20 < puVar33) {
              iVar11 = ((int)puVar20 - (int)plVar26) + -4;
              do {
                if (*puVar22 != *puVar20) {
                  uVar19 = *puVar20 ^ *puVar22;
                  uVar19 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
                  uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
                  uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
                  uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10
                  ;
                  uVar17 = (int)((ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3) + iVar11;
                  goto LAB_008d1bc8;
                }
                puVar20 = puVar20 + 1;
                puVar22 = puVar22 + 1;
                iVar11 = iVar11 + 8;
              } while (puVar20 < puVar33);
            }
            if (puVar20 < (ulong *)((long)param_2 + (uVar9 - 8))) {
              if ((int)*puVar22 == (int)*puVar20) {
                puVar20 = (ulong *)((long)puVar20 + 4);
                puVar22 = (ulong *)((long)puVar22 + 4);
              }
            }
            if (puVar20 < (ulong *)((long)param_2 + (uVar9 - 6))) {
              if ((short)*puVar22 == (short)*puVar20) {
                puVar20 = (ulong *)((long)puVar20 + 2);
                puVar22 = (ulong *)((long)puVar22 + 2);
              }
            }
            if (puVar20 < (ulong *)((long)param_2 + (uVar9 - 5))) {
              if ((char)*puVar22 == (char)*puVar20) {
                puVar20 = (ulong *)((long)puVar20 + 1);
              }
            }
            uVar17 = (int)puVar20 - (int)puVar1;
          }
LAB_008d1bc8:
          plVar26 = (long *)((long)plVar26 + (ulong)uVar17 + 4);
          uVar14 = uVar17;
          if (psVar6 < (short *)((long)plVar18 + (ulong)(uVar17 + 0xf0) / 0xff + 8)) {
            uVar14 = ((int)psVar6 - (int)psVar15) * 0xff - 0x5ec;
            plVar26 = (long *)((long)plVar26 - (ulong)(uVar17 - uVar14));
            plVar30 = plVar26;
            if (plVar26 <= plVar29) {
              do {
                plVar27 = (long *)((long)plVar30 + 1);
                *(undefined4 *)
                 ((long)param_1 + ((ulong)(*plVar30 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = 0;
                plVar30 = plVar27;
              } while (plVar27 <= plVar29);
            }
          }
          uVar17 = uVar14 - 0xf;
          if (uVar14 < 0xf) {
            *(char *)psVar31 = (char)*psVar31 + (char)uVar14;
          }
          else {
            *(char *)psVar31 = (char)*psVar31 + '\x0f';
            psVar15[0] = -1;
            psVar15[1] = -1;
            if (0x3fb < uVar17) {
              uVar19 = (ulong)((uVar14 - 0x40b) / 0x3fc << 2);
              memset((short *)((long)plVar18 + 6),0xff,uVar19 + 4);
              uVar17 = (uVar14 - 0x40b) % 0x3fc;
              psVar15 = (short *)((long)plVar18 + 6 + uVar19);
            }
            uVar14 = (uVar17 & 0xffff) / 0xff;
            pcVar28 = (char *)((long)psVar15 + (ulong)uVar14);
            psVar15 = (short *)(pcVar28 + 1);
            *pcVar28 = (char)uVar17 + (char)uVar14;
          }
          if (plVar10 <= plVar26) break;
          lVar32 = *plVar26;
          *(int *)((long)param_1 +
                  ((ulong)(*(long *)((long)plVar26 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
               (int)(long *)((long)plVar26 + -2) - iVar24;
          uVar19 = (ulong)(lVar32 * -0x30e4432345000000) >> 0x32 & 0x3ffc;
          uVar14 = (int)plVar26 - iVar24;
          uVar17 = *(uint *)((long)param_1 + uVar19);
          *(uint *)((long)param_1 + uVar19) = uVar14;
          if ((uVar17 + 0xffff < uVar14) ||
             (plVar30 = (long *)(lVar25 + (ulong)uVar17), (int)*plVar30 != (int)*plVar26))
          goto LAB_008d1d84;
          *(char *)psVar15 = '\0';
          plVar18 = (long *)((long)psVar15 + 1);
          psVar31 = psVar15;
          if (psVar6 < psVar15 + 6) break;
        } while( true );
      }
    }
    goto LAB_008d1de4;
  }
  return 0;
LAB_008d1d84:
  plVar30 = (long *)((long)plVar26 + 2);
  if (plVar10 < plVar30) goto LAB_008d1de4;
  goto LAB_008d18ec;
LAB_008d1de4:
  pcVar28 = (char *)((long)param_2 + (uVar9 - (long)plVar26));
  if (psVar6 < (short *)((long)psVar15 + (long)(pcVar28 + (ulong)(pcVar28 + 0xf0) / 0xff + 1))) {
    pcVar28 = (char *)((long)psVar6 +
                      (~(ulong)psVar15 - ((ulong)((long)psVar6 + ~(ulong)psVar15 + 0xf1) >> 8)));
  }
  pcVar12 = pcVar28 + -0xf;
  iVar11 = (int)pcVar28;
  if (pcVar28 < (char *)0xf) {
    *(char *)psVar15 = (char)(iVar11 << 4);
  }
  else {
    psVar6 = (short *)((long)psVar15 + 1);
    *(char *)psVar15 = -0x10;
    if ((char *)0xfe < pcVar12) {
      uVar9 = (ulong)(pcVar28 + -0x10e) / 0xff;
      memset(psVar6,0xff,uVar9 + 1);
      psVar6 = (short *)((long)psVar15 + uVar9 + 2);
      pcVar12 = (char *)((ulong)(pcVar28 + -0x10e) % 0xff);
    }
    *(char *)psVar6 = (char)pcVar12;
    psVar15 = psVar6;
  }
  memcpy((char *)((long)psVar15 + 1),plVar26,(size_t)pcVar28);
  iVar24 = (int)(char *)((long)psVar15 + 1) + iVar11;
  *param_4 = ((int)plVar26 + iVar11) - (int)param_2;
LAB_008d243c:
  return (ulong)(uint)(iVar24 - (int)param_3);
}

