
/* WARNING: Possible PIC construction at 0x007a3380: Changing call to branch */
/* WARNING: Possible PIC construction at 0x007a3508: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x007a3384) */
/* WARNING: Type propagation algorithm not settling */

dword * FUN_007a3018(undefined8 param_1,undefined8 param_2,ulong param_3,int param_4)

{
  undefined8 *******pppppppuVar1;
  ulong *puVar2;
  long *plVar3;
  long *plVar4;
  long *plVar5;
  char cVar6;
  long *plVar7;
  undefined1 *puVar8;
  undefined1 *puVar9;
  long *plVar10;
  long lVar11;
  ulong uVar12;
  dword *extraout_x1;
  dword *pdVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  long *extraout_x8;
  byte bVar17;
  ulong uVar18;
  ulong *puVar19;
  long *plVar20;
  ulong uVar21;
  ulong uVar22;
  ulong *puVar23;
  ulong uVar24;
  ulong uVar25;
  undefined8 *******pppppppuVar26;
  undefined8 uVar27;
  undefined *puVar28;
  long lVar29;
  long lVar30;
  ulong uVar31;
  long lVar32;
  undefined1 auVar33 [16];
  undefined1 auStack_140 [128];
  undefined8 *******pppppppuStack_80;
  undefined8 uStack_78;
  undefined1 auStack_70 [16];
  undefined *puStack_60;
  undefined8 uStack_58;
  undefined1 **ppuStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined1 *puStack_30;
  undefined *puStack_28;
  undefined1 *puStack_20;
  undefined8 ******ppppppuStack_18;
  
  auStack_70 = func_0x007a2420();
  puStack_30 = auStack_70;
  pppppppuVar1 = (undefined8 *******)(auStack_70 + 0x60);
  puStack_28 = &
               __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
  ;
  puStack_20 = auStack_70 + 8;
  ppppppuStack_18 =
       (undefined8 ******)
       &
       __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
  ;
  puStack_60 = &UNK_009e0dd8;
  uStack_58 = 3;
  ppuStack_50 = &puStack_30;
  uStack_48 = 2;
  uStack_40 = 0;
  auVar33 = func_0x007a2420(&puStack_60,param_3);
  plVar10 = auVar33._0_8_;
  puVar9 = auStack_140 + 0x80;
  puVar8 = auStack_140 + 0x80;
  uStack_78 = 0x7a3070;
  pppppppuVar26 = &pppppppuStack_80;
  uVar24 = plVar10[3];
  pppppppuStack_80 = pppppppuVar1;
  if (CARRY8(uVar24,auVar33._8_8_)) {
    uVar27 = 0x7a3070;
    puVar8 = auStack_70;
    pppppppuVar26 = pppppppuVar1;
  }
  else {
    uVar31 = uVar24 + auVar33._8_8_;
    uVar25 = plVar10[1];
    uVar12 = uVar25 + 1;
    uVar18 = uVar12 >> 3;
    uVar22 = uVar25;
    if (7 < uVar25) {
      uVar22 = uVar18 * 7;
    }
    if (uVar31 <= uVar22 >> 1) {
      puVar23 = (ulong *)*plVar10;
      if ((uVar12 & 7) != 0) {
        uVar18 = uVar18 + 1;
      }
      if (uVar18 != 0) {
        puVar19 = puVar23;
        do {
          uVar31 = *puVar19;
          *puVar19 = CONCAT17(-((long)uVar31 < 0),
                              CONCAT16(-((char)(uVar31 >> 0x30) < '\0'),
                                       CONCAT15(-((char)(uVar31 >> 0x28) < '\0'),
                                                CONCAT14(-((char)(uVar31 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)(uVar31 >> 0x18) < '\0'),
                                                                  CONCAT12(-((char)(uVar31 >> 0x10)
                                                                            < '\0'),CONCAT11(-((char
                                                  )(uVar31 >> 8) < '\0'),-((char)uVar31 < '\0'))))))
                                      )) | 0x8080808080808080;
          uVar18 = uVar18 - 1;
          puVar19 = puVar19 + 1;
        } while (uVar18 != 0);
      }
      if (uVar12 < 8) {
        _memmove(puVar23 + 1,puVar23,uVar12);
        if (uVar12 == 0) {
          uVar12 = 0;
          goto code_r0x007a3300;
        }
      }
      else {
        *(ulong *)((long)puVar23 + uVar12) = *puVar23;
      }
      uVar24 = 0;
      uVar31 = 1;
      do {
        if (*(char *)((long)puVar23 + uVar24) == -0x80) {
          puVar19 = puVar23 + ~uVar24 * 4;
          while( true ) {
            uVar21 = (puVar23[uVar24 * -4 + -4] + 8) * 0x517cc1b727220a95;
            uVar25 = plVar10[1];
            uVar14 = uVar21 & uVar25;
            lVar11 = *(long *)((long)puVar23 + uVar14);
            uVar22 = CONCAT17(-(lVar11 < 0),
                              CONCAT16(-((char)((ulong)lVar11 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar11 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar11 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar11 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar11 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar11 >> 8) < '\0'),
                                                           -((char)lVar11 < '\0'))))))));
            uVar18 = uVar14;
            if (uVar22 == 0) {
              lVar11 = 8;
              do {
                uVar18 = uVar18 + lVar11 & uVar25;
                lVar29 = *(long *)((long)puVar23 + uVar18);
                uVar22 = CONCAT17(-(lVar29 < 0),
                                  CONCAT16(-((char)((ulong)lVar29 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar29 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar29 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar29 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar29 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar29 >> 8) < '\0'),
                                                           -((char)lVar29 < '\0'))))))));
                lVar11 = lVar11 + 8;
              } while (uVar22 == 0);
            }
            uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
            uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
            uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
            uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
            uVar18 = uVar18 + ((ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3) & uVar25;
            bVar17 = (byte)(uVar21 >> 0x38);
            if (*(char *)((long)puVar23 + uVar18) < '\0') {
              uVar22 = uVar18 - uVar14 ^ uVar24 - uVar14;
            }
            else {
              uVar18 = *puVar23;
              uVar18 = CONCAT17(-((long)uVar18 < 0),
                                CONCAT16(-((char)(uVar18 >> 0x30) < '\0'),
                                         CONCAT15(-((char)(uVar18 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)(uVar18 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)(uVar18 >> 0x18) < '\0')
                                                                    ,CONCAT12(-((char)(uVar18 >>
                                                                                      0x10) < '\0'),
                                                                              CONCAT11(-((char)(
                                                  uVar18 >> 8) < '\0'),-((char)uVar18 < '\0'))))))))
              ;
              uVar18 = (uVar18 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar18 & 0x5555555555555555) << 1;
              uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
              uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
              uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
              uVar18 = (ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3;
              uVar22 = uVar18 - uVar14 ^ uVar24 - uVar14;
            }
            if ((uVar22 & uVar25) < 8) {
              *(byte *)((long)puVar23 + uVar24) = bVar17 >> 1;
              puVar23 = (ulong *)*plVar10;
              *(byte *)((long)puVar23 + (uVar25 & uVar24 - 8) + 8) = bVar17 >> 1;
              goto LAB_007a328c;
            }
            puVar2 = puVar23 + ~uVar18 * 4;
            cVar6 = *(char *)((long)puVar23 + uVar18);
            *(byte *)((long)puVar23 + uVar18) = bVar17 >> 1;
            puVar23 = (ulong *)*plVar10;
            *(byte *)((long)puVar23 + (uVar18 - 8 & uVar25) + 8) = bVar17 >> 1;
            if (cVar6 == -1) break;
            uVar18 = *puVar19;
            *puVar19 = *puVar2;
            *puVar2 = uVar18;
            uVar18 = puVar19[1];
            puVar19[1] = puVar2[1];
            puVar2[1] = uVar18;
            uVar18 = puVar19[2];
            puVar19[2] = puVar2[2];
            puVar2[2] = uVar18;
            uVar18 = puVar19[3];
            puVar19[3] = puVar2[3];
            puVar2[3] = uVar18;
            puVar23 = (ulong *)*plVar10;
          }
          uVar18 = plVar10[1];
          *(undefined1 *)((long)puVar23 + uVar24) = 0xff;
          *(undefined1 *)((long)puVar23 + (uVar18 & uVar24 - 8) + 8) = 0xff;
          uVar24 = *puVar19;
          uVar22 = puVar19[3];
          uVar18 = puVar19[2];
          puVar2[1] = puVar19[1];
          *puVar2 = uVar24;
          puVar2[3] = uVar22;
          puVar2[2] = uVar18;
        }
LAB_007a328c:
        if (uVar12 <= uVar31) goto LAB_007a32e0;
        uVar24 = uVar31;
        uVar31 = uVar31 + 1;
      } while( true );
    }
    if (uVar31 < uVar22 + 1) {
      uVar31 = uVar22 + 1;
    }
    if (uVar31 < 8) {
      uVar12 = 4;
      if (3 < uVar31) {
        uVar12 = 8;
      }
LAB_007a335c:
      uVar18 = uVar12 * 0x20;
      uVar31 = uVar12 + 8;
      if ((!CARRY8(uVar18,uVar31)) && (uVar22 = uVar18 + uVar31, uVar22 < 0x7ffffffffffffff9)) {
        lVar11 = func_0x00187bd0(uVar22,8);
        if (lVar11 != 0) {
          plVar3 = (long *)(lVar11 + uVar18);
          _memset(plVar3,0xff,uVar31);
          uVar18 = uVar12 - 1;
          uVar31 = uVar18;
          if (8 < uVar12) {
            uVar31 = (uVar12 >> 3) * 7;
          }
          if (uVar24 == 0) {
            plVar20 = (long *)*plVar10;
          }
          else {
            lVar11 = 0;
            plVar20 = (long *)*plVar10;
            lVar29 = *plVar20;
            uVar12 = CONCAT17(-(-1 < lVar29),
                              CONCAT16(-(-1 < (char)((ulong)lVar29 >> 0x30)),
                                       CONCAT15(-(-1 < (char)((ulong)lVar29 >> 0x28)),
                                                CONCAT14(-(-1 < (char)((ulong)lVar29 >> 0x20)),
                                                         CONCAT13(-(-1 < (char)((ulong)lVar29 >>
                                                                               0x18)),
                                                                  CONCAT12(-(-1 < (char)((ulong)
                                                  lVar29 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar29 >> 8)),
                                                           -(-1 < (char)lVar29)))))))) &
                     0x8080808080808080;
            plVar7 = plVar20;
            uVar22 = uVar24;
            do {
              while (uVar12 == 0) {
                lVar29 = plVar7[1];
                lVar11 = lVar11 + 8;
                plVar7 = plVar7 + 1;
                uVar12 = CONCAT17(-(-1 < lVar29),
                                  CONCAT16(-(-1 < (char)((ulong)lVar29 >> 0x30)),
                                           CONCAT15(-(-1 < (char)((ulong)lVar29 >> 0x28)),
                                                    CONCAT14(-(-1 < (char)((ulong)lVar29 >> 0x20)),
                                                             CONCAT13(-(-1 < (char)((ulong)lVar29 >>
                                                                                   0x18)),
                                                                      CONCAT12(-(-1 < (char)((ulong)
                                                  lVar29 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar29 >> 8)),
                                                           -(-1 < (char)lVar29)))))))) &
                         0x8080808080808080;
              }
              uVar21 = (uVar12 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                       (uVar12 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar21 = (uVar21 & 0xffff0000ffff0000) >> 0x10 | (uVar21 & 0xffff0000ffff) << 0x10;
              uVar21 = lVar11 + ((ulong)LZCOUNT(uVar21 >> 0x20 | uVar21 << 0x20) >> 3);
              uVar14 = (plVar20[uVar21 * -4 + -4] + 8) * 0x517cc1b727220a95;
              uVar15 = uVar14 & uVar18;
              lVar29 = *(long *)((long)plVar3 + uVar15);
              uVar16 = CONCAT17(-(lVar29 < 0),
                                CONCAT16(-((char)((ulong)lVar29 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar29 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar29 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar29 >> 0x18)
                                                                     < '\0'),CONCAT12(-((char)((
                                                  ulong)lVar29 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar29 >> 8) < '\0'),
                                                           -((char)lVar29 < '\0'))))))));
              if (uVar16 == 0) {
                lVar29 = 8;
                do {
                  uVar15 = uVar15 + lVar29 & uVar18;
                  lVar30 = *(long *)((long)plVar3 + uVar15);
                  uVar16 = CONCAT17(-(lVar30 < 0),
                                    CONCAT16(-((char)((ulong)lVar30 >> 0x30) < '\0'),
                                             CONCAT15(-((char)((ulong)lVar30 >> 0x28) < '\0'),
                                                      CONCAT14(-((char)((ulong)lVar30 >> 0x20) <
                                                                '\0'),CONCAT13(-((char)((ulong)
                                                  lVar30 >> 0x18) < '\0'),
                                                  CONCAT12(-((char)((ulong)lVar30 >> 0x10) < '\0'),
                                                           CONCAT11(-((char)((ulong)lVar30 >> 8) <
                                                                     '\0'),-((char)lVar30 < '\0'))))
                                                  ))));
                  lVar29 = lVar29 + 8;
                } while (uVar16 == 0);
              }
              uVar16 = (uVar16 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar16 & 0x5555555555555555) << 1;
              uVar16 = (uVar16 & 0xcccccccccccccccc) >> 2 | (uVar16 & 0x3333333333333333) << 2;
              uVar16 = (uVar16 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar16 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar16 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
              uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
              uVar15 = uVar15 + ((ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3) & uVar18;
              if (-1 < *(char *)((long)plVar3 + uVar15)) {
                lVar29 = *plVar3;
                uVar15 = CONCAT17(-(lVar29 < 0),
                                  CONCAT16(-((char)((ulong)lVar29 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar29 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar29 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar29 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar29 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar29 >> 8) < '\0'),
                                                           -((char)lVar29 < '\0'))))))));
                uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
                uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
                uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
                uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
                uVar15 = (ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3;
              }
              uVar12 = uVar12 - 1 & uVar12;
              bVar17 = (byte)(uVar14 >> 0x38);
              *(byte *)((long)plVar3 + uVar15) = bVar17 >> 1;
              *(byte *)((long)plVar3 + (uVar15 - 8 & uVar18) + 8) = bVar17 >> 1;
              plVar4 = plVar20 + ~uVar21 * 4;
              lVar29 = *plVar4;
              lVar32 = plVar4[3];
              lVar30 = plVar4[2];
              plVar5 = plVar3 + ~uVar15 * 4;
              plVar5[1] = plVar4[1];
              *plVar5 = lVar29;
              plVar5[3] = lVar32;
              plVar5[2] = lVar30;
              uVar22 = uVar22 - 1;
            } while (uVar22 != 0);
          }
          *plVar10 = (long)plVar3;
          plVar10[1] = uVar18;
          plVar10[2] = uVar31 - uVar24;
          if (uVar25 != 0) {
            lVar29 = uVar25 * 0x20 + 0x20;
            lVar11 = uVar25 + lVar29 + 9;
            if (lVar11 != 0) {
              func_0x00187bd4((long)plVar20 - lVar29,lVar11,8);
            }
          }
          return (dword *)0x8000000000000001;
        }
        pdVar13 = &MACH_HEADER.cpusubtype;
        puVar28 = &LAB_007a350c;
        param_3 = uVar22;
        goto code_r0x004584ec;
      }
    }
    else if ((uVar31 >> 0x3d == 0) &&
            (uVar12 = 0xffffffffffffffff >> (LZCOUNT((uVar31 * 8) / 7 - 1) & 0x3fU),
            uVar12 < 0x7ffffffffffffff)) {
      uVar12 = uVar12 + 1;
      goto LAB_007a335c;
    }
    uVar27 = 0x7a3384;
  }
  if (param_4 == 0) {
    return (dword *)0x0;
  }
  puVar9 = puVar8 + -0x40;
  *(undefined8 ********)(puVar8 + -0x10) = pppppppuVar26;
  *(undefined8 *)(puVar8 + -8) = uVar27;
  pppppppuVar26 = (undefined8 *******)(puVar8 + -0x10);
  *(undefined **)(puVar8 + -0x40) = &UNK_009df590;
  *(undefined8 *)(puVar8 + -0x38) = 1;
  *(undefined8 *)(puVar8 + -0x28) = 0;
  *(undefined8 *)(puVar8 + -0x20) = 0;
  *(undefined8 *)(puVar8 + -0x30) = 8;
  puVar28 = &__ZN9hashbrown3raw11Fallibility9alloc_err17h67adbbd0f8ea50c7E;
  param_4 = func_0x007a2420(puVar8 + -0x40,&UNK_009df5a0);
  pdVar13 = extraout_x1;
code_r0x004584ec:
  if (param_4 == 0) {
    return pdVar13;
  }
  *(undefined8 ********)(puVar9 + -0x10) = pppppppuVar26;
  *(undefined **)(puVar9 + -8) = puVar28;
  auVar33 = func_0x007a1f18(pdVar13,param_3);
  pdVar13 = auVar33._0_8_;
  *(undefined1 **)(puVar9 + -0x20) = puVar9 + -0x10;
  *(undefined **)(puVar9 + -0x18) = &__ZN9hashbrown3raw16RawIterHashInner3new17h83449af9a3c7e72fE;
  uVar24 = *(ulong *)(pdVar13 + 2);
  uVar12 = uVar24 & auVar33._8_8_;
  lVar11 = *(long *)(*(long *)pdVar13 + uVar12);
  bVar17 = auVar33[0xf] >> 1;
  *extraout_x8 = *(long *)pdVar13;
  extraout_x8[1] = uVar24;
  *(byte *)(extraout_x8 + 6) = auVar33[0xf] >> 1;
  extraout_x8[2] = uVar12;
  extraout_x8[3] = 0;
  extraout_x8[4] = lVar11;
  extraout_x8[5] =
       CONCAT17(-((byte)((ulong)lVar11 >> 0x38) == bVar17),
                CONCAT16(-((byte)((ulong)lVar11 >> 0x30) == bVar17),
                         CONCAT15(-((byte)((ulong)lVar11 >> 0x28) == bVar17),
                                  CONCAT14(-((byte)((ulong)lVar11 >> 0x20) == bVar17),
                                           CONCAT13(-((byte)((ulong)lVar11 >> 0x18) == bVar17),
                                                    CONCAT12(-((byte)((ulong)lVar11 >> 0x10) ==
                                                              bVar17),CONCAT11(-((byte)((ulong)
                                                  lVar11 >> 8) == bVar17),-((byte)lVar11 == bVar17))
                                                  )))))) & 0x8080808080808080;
  return pdVar13;
LAB_007a32e0:
  uVar12 = plVar10[1];
  if (7 < uVar12) {
    uVar12 = (uVar12 + 1 >> 3) * 7;
  }
  uVar24 = plVar10[3];
code_r0x007a3300:
  plVar10[2] = uVar12 - uVar24;
  return (dword *)0x8000000000000001;
}

