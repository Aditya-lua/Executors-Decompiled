
/* WARNING: Possible PIC construction at 0x007a8d10: Changing call to branch */
/* WARNING: Possible PIC construction at 0x007a8ea4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x007a8d14) */

dword * __ZN9hashbrown3raw21RawTable_LT_T_C_A_GT_14reserve_rehash17ha9d52322fb14a031E
                  (long *param_1,ulong param_2,ulong param_3,int param_4)

{
  long *plVar1;
  char cVar2;
  long *plVar3;
  undefined1 *puVar4;
  long lVar5;
  ulong uVar6;
  dword *extraout_x1;
  dword *pdVar7;
  ulong uVar8;
  long *plVar9;
  ulong uVar10;
  long *plVar11;
  ulong uVar12;
  ulong uVar13;
  long *extraout_x8;
  long *plVar14;
  byte bVar15;
  ulong uVar16;
  ulong *puVar17;
  ulong uVar18;
  ulong *puVar19;
  ulong *puVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  undefined1 *puVar24;
  undefined1 *unaff_x29;
  undefined *unaff_x30;
  undefined *puVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  undefined1 auVar30 [16];
  undefined1 auStack_d0 [128];
  
  puVar4 = auStack_d0 + 0x80;
  puVar24 = auStack_d0 + 0xc0;
  uVar21 = param_1[3];
  if (!CARRY8(uVar21,param_2)) {
    param_2 = uVar21 + param_2;
    uVar22 = param_1[1];
    uVar8 = uVar22 + 1;
    uVar16 = uVar8 >> 3;
    uVar23 = uVar22;
    if (7 < uVar22) {
      uVar23 = uVar16 * 7;
    }
    if (param_2 <= uVar23 >> 1) {
      puVar20 = (ulong *)*param_1;
      if ((uVar8 & 7) != 0) {
        uVar16 = uVar16 + 1;
      }
      if (uVar16 != 0) {
        puVar17 = puVar20;
        do {
          uVar23 = *puVar17;
          *puVar17 = CONCAT17(-((long)uVar23 < 0),
                              CONCAT16(-((char)(uVar23 >> 0x30) < '\0'),
                                       CONCAT15(-((char)(uVar23 >> 0x28) < '\0'),
                                                CONCAT14(-((char)(uVar23 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)(uVar23 >> 0x18) < '\0'),
                                                                  CONCAT12(-((char)(uVar23 >> 0x10)
                                                                            < '\0'),CONCAT11(-((char
                                                  )(uVar23 >> 8) < '\0'),-((char)uVar23 < '\0'))))))
                                      )) | 0x8080808080808080;
          uVar16 = uVar16 - 1;
          puVar17 = puVar17 + 1;
        } while (uVar16 != 0);
      }
      if (uVar8 < 8) {
        _memmove(puVar20 + 1,puVar20,uVar8);
        if (uVar8 == 0) {
          uVar8 = 0;
          goto code_r0x007a8c88;
        }
      }
      else {
        *(ulong *)((long)puVar20 + uVar8) = *puVar20;
      }
      uVar21 = 0;
      uVar16 = 1;
      do {
        if (*(char *)((long)puVar20 + uVar21) == -0x80) {
          puVar17 = puVar20 + ~uVar21 * 5;
          while( true ) {
            uVar18 = (puVar20[uVar21 * -5 + -5] + 8) * 0x517cc1b727220a95;
            uVar6 = param_1[1];
            uVar10 = uVar18 & uVar6;
            lVar5 = *(long *)((long)puVar20 + uVar10);
            uVar22 = CONCAT17(-(lVar5 < 0),
                              CONCAT16(-((char)((ulong)lVar5 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar5 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar5 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar5 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar5 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar5 >> 8) < '\0'),
                                                           -((char)lVar5 < '\0'))))))));
            uVar23 = uVar10;
            if (uVar22 == 0) {
              lVar5 = 8;
              do {
                uVar23 = uVar23 + lVar5 & uVar6;
                lVar26 = *(long *)((long)puVar20 + uVar23);
                uVar22 = CONCAT17(-(lVar26 < 0),
                                  CONCAT16(-((char)((ulong)lVar26 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar26 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar26 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar26 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar26 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar26 >> 8) < '\0'),
                                                           -((char)lVar26 < '\0'))))))));
                lVar5 = lVar5 + 8;
              } while (uVar22 == 0);
            }
            uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
            uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
            uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
            uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
            uVar23 = uVar23 + ((ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3) & uVar6;
            bVar15 = (byte)(uVar18 >> 0x38);
            if (*(char *)((long)puVar20 + uVar23) < '\0') {
              uVar22 = uVar23 - uVar10 ^ uVar21 - uVar10;
            }
            else {
              uVar23 = *puVar20;
              uVar23 = CONCAT17(-((long)uVar23 < 0),
                                CONCAT16(-((char)(uVar23 >> 0x30) < '\0'),
                                         CONCAT15(-((char)(uVar23 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)(uVar23 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)(uVar23 >> 0x18) < '\0')
                                                                    ,CONCAT12(-((char)(uVar23 >>
                                                                                      0x10) < '\0'),
                                                                              CONCAT11(-((char)(
                                                  uVar23 >> 8) < '\0'),-((char)uVar23 < '\0'))))))))
              ;
              uVar23 = (uVar23 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar23 & 0x5555555555555555) << 1;
              uVar23 = (uVar23 & 0xcccccccccccccccc) >> 2 | (uVar23 & 0x3333333333333333) << 2;
              uVar23 = (uVar23 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar23 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar23 = (uVar23 & 0xff00ff00ff00ff00) >> 8 | (uVar23 & 0xff00ff00ff00ff) << 8;
              uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
              uVar23 = (ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3;
              uVar22 = uVar23 - uVar10 ^ uVar21 - uVar10;
            }
            if ((uVar22 & uVar6) < 8) {
              *(byte *)((long)puVar20 + uVar21) = bVar15 >> 1;
              puVar20 = (ulong *)*param_1;
              *(byte *)((long)puVar20 + (uVar6 & uVar21 - 8) + 8) = bVar15 >> 1;
              goto code_r0x007a8c0c;
            }
            puVar19 = puVar20 + ~uVar23 * 5;
            cVar2 = *(char *)((long)puVar20 + uVar23);
            *(byte *)((long)puVar20 + uVar23) = bVar15 >> 1;
            puVar20 = (ulong *)*param_1;
            *(byte *)((long)puVar20 + (uVar23 - 8 & uVar6) + 8) = bVar15 >> 1;
            if (cVar2 == -1) break;
            uVar23 = *puVar17;
            *puVar17 = *puVar19;
            *puVar19 = uVar23;
            uVar23 = puVar17[1];
            puVar17[1] = puVar19[1];
            puVar19[1] = uVar23;
            uVar23 = puVar17[2];
            puVar17[2] = puVar19[2];
            puVar19[2] = uVar23;
            uVar23 = puVar17[3];
            puVar17[3] = puVar19[3];
            puVar19[3] = uVar23;
            uVar23 = puVar17[4];
            puVar17[4] = puVar19[4];
            puVar19[4] = uVar23;
            puVar20 = (ulong *)*param_1;
          }
          uVar23 = param_1[1];
          *(undefined1 *)((long)puVar20 + uVar21) = 0xff;
          *(undefined1 *)((long)puVar20 + (uVar23 & uVar21 - 8) + 8) = 0xff;
          uVar23 = puVar17[1];
          uVar21 = *puVar17;
          uVar6 = puVar17[3];
          uVar22 = puVar17[2];
          puVar19[4] = puVar17[4];
          puVar19[1] = uVar23;
          *puVar19 = uVar21;
          puVar19[3] = uVar6;
          puVar19[2] = uVar22;
        }
code_r0x007a8c0c:
        if (uVar8 <= uVar16) goto code_r0x007a8c68;
        uVar21 = uVar16;
        uVar16 = uVar16 + 1;
      } while( true );
    }
    if (param_2 < uVar23 + 1) {
      param_2 = uVar23 + 1;
    }
    if (param_2 < 8) {
      uVar8 = 4;
      if (3 < param_2) {
        uVar8 = 8;
      }
code_r0x007a8cd8:
      auVar30._8_8_ = 0;
      auVar30._0_8_ = uVar8;
      if (SUB168(auVar30 * ZEXT816(0x28),8) == 0) {
        uVar23 = uVar8 * 0x28;
        uVar16 = uVar8 + 8;
        if ((!CARRY8(uVar23,uVar16)) && (uVar6 = uVar23 + uVar16, uVar6 < 0x7ffffffffffffff9)) {
          lVar5 = func_0x00187bd0(uVar6,8);
          if (lVar5 != 0) {
            plVar1 = (long *)(lVar5 + uVar23);
            _memset(plVar1,0xff,uVar16);
            uVar23 = uVar8 - 1;
            uVar16 = uVar23;
            if (8 < uVar8) {
              uVar16 = (uVar8 >> 3) * 7;
            }
            if (uVar21 == 0) {
              plVar14 = (long *)*param_1;
            }
            else {
              lVar5 = 0;
              plVar14 = (long *)*param_1;
              lVar26 = *plVar14;
              uVar8 = CONCAT17(-(-1 < lVar26),
                               CONCAT16(-(-1 < (char)((ulong)lVar26 >> 0x30)),
                                        CONCAT15(-(-1 < (char)((ulong)lVar26 >> 0x28)),
                                                 CONCAT14(-(-1 < (char)((ulong)lVar26 >> 0x20)),
                                                          CONCAT13(-(-1 < (char)((ulong)lVar26 >>
                                                                                0x18)),
                                                                   CONCAT12(-(-1 < (char)((ulong)
                                                  lVar26 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar26 >> 8)),
                                                           -(-1 < (char)lVar26)))))))) &
                      0x8080808080808080;
              plVar3 = plVar14;
              uVar6 = uVar21;
              do {
                while (uVar8 == 0) {
                  lVar26 = plVar3[1];
                  lVar5 = lVar5 + 8;
                  plVar3 = plVar3 + 1;
                  uVar8 = CONCAT17(-(-1 < lVar26),
                                   CONCAT16(-(-1 < (char)((ulong)lVar26 >> 0x30)),
                                            CONCAT15(-(-1 < (char)((ulong)lVar26 >> 0x28)),
                                                     CONCAT14(-(-1 < (char)((ulong)lVar26 >> 0x20)),
                                                              CONCAT13(-(-1 < (char)((ulong)lVar26
                                                                                    >> 0x18)),
                                                                       CONCAT12(-(-1 < (char)((ulong
                                                  )lVar26 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar26 >> 8)),
                                                           -(-1 < (char)lVar26)))))))) &
                          0x8080808080808080;
                }
                uVar18 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                         (uVar8 >> 7 & 0xff00ff00ff00ff) << 8;
                uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
                uVar18 = lVar5 + ((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3);
                uVar10 = (plVar14[uVar18 * -5 + -5] + 8) * 0x517cc1b727220a95;
                uVar12 = uVar10 & uVar23;
                lVar26 = *(long *)((long)plVar1 + uVar12);
                uVar13 = CONCAT17(-(lVar26 < 0),
                                  CONCAT16(-((char)((ulong)lVar26 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar26 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar26 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar26 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar26 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar26 >> 8) < '\0'),
                                                           -((char)lVar26 < '\0'))))))));
                if (uVar13 == 0) {
                  lVar26 = 8;
                  do {
                    uVar12 = uVar12 + lVar26 & uVar23;
                    lVar27 = *(long *)((long)plVar1 + uVar12);
                    uVar13 = CONCAT17(-(lVar27 < 0),
                                      CONCAT16(-((char)((ulong)lVar27 >> 0x30) < '\0'),
                                               CONCAT15(-((char)((ulong)lVar27 >> 0x28) < '\0'),
                                                        CONCAT14(-((char)((ulong)lVar27 >> 0x20) <
                                                                  '\0'),CONCAT13(-((char)((ulong)
                                                  lVar27 >> 0x18) < '\0'),
                                                  CONCAT12(-((char)((ulong)lVar27 >> 0x10) < '\0'),
                                                           CONCAT11(-((char)((ulong)lVar27 >> 8) <
                                                                     '\0'),-((char)lVar27 < '\0'))))
                                                  ))));
                    lVar26 = lVar26 + 8;
                  } while (uVar13 == 0);
                }
                uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
                uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
                uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
                uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
                uVar12 = uVar12 + ((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3) & uVar23;
                if (-1 < *(char *)((long)plVar1 + uVar12)) {
                  lVar26 = *plVar1;
                  uVar12 = CONCAT17(-(lVar26 < 0),
                                    CONCAT16(-((char)((ulong)lVar26 >> 0x30) < '\0'),
                                             CONCAT15(-((char)((ulong)lVar26 >> 0x28) < '\0'),
                                                      CONCAT14(-((char)((ulong)lVar26 >> 0x20) <
                                                                '\0'),CONCAT13(-((char)((ulong)
                                                  lVar26 >> 0x18) < '\0'),
                                                  CONCAT12(-((char)((ulong)lVar26 >> 0x10) < '\0'),
                                                           CONCAT11(-((char)((ulong)lVar26 >> 8) <
                                                                     '\0'),-((char)lVar26 < '\0'))))
                                                  ))));
                  uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
                  uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
                  uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
                  uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10
                  ;
                  uVar12 = (ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3;
                }
                bVar15 = (byte)(uVar10 >> 0x38);
                *(byte *)((long)plVar1 + uVar12) = bVar15 >> 1;
                *(byte *)((long)plVar1 + (uVar12 - 8 & uVar23) + 8) = bVar15 >> 1;
                uVar8 = uVar8 - 1 & uVar8;
                plVar9 = plVar14 + ~uVar18 * 5;
                lVar27 = plVar9[1];
                lVar26 = *plVar9;
                lVar29 = plVar9[3];
                lVar28 = plVar9[2];
                plVar11 = plVar1 + ~uVar12 * 5;
                plVar11[4] = plVar9[4];
                plVar11[1] = lVar27;
                *plVar11 = lVar26;
                plVar11[3] = lVar29;
                plVar11[2] = lVar28;
                uVar6 = uVar6 - 1;
              } while (uVar6 != 0);
            }
            *param_1 = (long)plVar1;
            param_1[1] = uVar23;
            param_1[2] = uVar16 - uVar21;
            if (uVar22 != 0) {
              lVar26 = uVar22 * 0x28 + 0x28;
              lVar5 = uVar22 + lVar26 + 9;
              if (lVar5 != 0) {
                func_0x00187bd4((long)plVar14 - lVar26,lVar5,8);
              }
            }
            return (dword *)0x8000000000000001;
          }
          pdVar7 = &MACH_HEADER.cpusubtype;
          puVar25 = &UNK_007a8ea8;
          param_3 = uVar6;
          goto code_r0x004584ec;
        }
      }
    }
    else if (param_2 >> 0x3d == 0) {
      uVar8 = (0xffffffffffffffffU >> (LZCOUNT((param_2 * 8) / 7 - 1) & 0x3fU)) + 1;
      goto code_r0x007a8cd8;
    }
    unaff_x30 = &UNK_007a8d14;
    register0x00000008 = (BADSPACEBASE *)(auStack_d0 + 0x80);
    unaff_x29 = puVar24;
  }
  if (param_4 == 0) {
    return (dword *)0x0;
  }
  puVar4 = (undefined1 *)((long)register0x00000008 + -0x40);
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = unaff_x30;
  puVar24 = (undefined1 *)((long)register0x00000008 + -0x10);
  *(undefined **)((long)register0x00000008 + -0x40) = &UNK_009df590;
  *(undefined8 *)((long)register0x00000008 + -0x38) = 1;
  *(undefined8 *)((long)register0x00000008 + -0x28) = 0;
  *(undefined8 *)((long)register0x00000008 + -0x20) = 0;
  *(undefined8 *)((long)register0x00000008 + -0x30) = 8;
  puVar25 = &__ZN9hashbrown3raw11Fallibility9alloc_err17h67adbbd0f8ea50c7E;
  param_4 = func_0x007a2420((undefined1 *)((long)register0x00000008 + -0x40),&UNK_009df5a0);
  pdVar7 = extraout_x1;
code_r0x004584ec:
  if (param_4 == 0) {
    return pdVar7;
  }
  *(undefined1 **)(puVar4 + -0x10) = puVar24;
  *(undefined **)(puVar4 + -8) = puVar25;
  auVar30 = func_0x007a1f18(pdVar7,param_3);
  pdVar7 = auVar30._0_8_;
  *(undefined1 **)(puVar4 + -0x20) = puVar4 + -0x10;
  *(undefined **)(puVar4 + -0x18) = &__ZN9hashbrown3raw16RawIterHashInner3new17h83449af9a3c7e72fE;
  uVar21 = *(ulong *)(pdVar7 + 2);
  uVar8 = uVar21 & auVar30._8_8_;
  lVar5 = *(long *)(*(long *)pdVar7 + uVar8);
  bVar15 = auVar30[0xf] >> 1;
  *extraout_x8 = *(long *)pdVar7;
  extraout_x8[1] = uVar21;
  *(byte *)(extraout_x8 + 6) = auVar30[0xf] >> 1;
  extraout_x8[2] = uVar8;
  extraout_x8[3] = 0;
  extraout_x8[4] = lVar5;
  extraout_x8[5] =
       CONCAT17(-((byte)((ulong)lVar5 >> 0x38) == bVar15),
                CONCAT16(-((byte)((ulong)lVar5 >> 0x30) == bVar15),
                         CONCAT15(-((byte)((ulong)lVar5 >> 0x28) == bVar15),
                                  CONCAT14(-((byte)((ulong)lVar5 >> 0x20) == bVar15),
                                           CONCAT13(-((byte)((ulong)lVar5 >> 0x18) == bVar15),
                                                    CONCAT12(-((byte)((ulong)lVar5 >> 0x10) ==
                                                              bVar15),CONCAT11(-((byte)((ulong)lVar5
                                                                                       >> 8) ==
                                                                                bVar15),-((byte)
                                                  lVar5 == bVar15)))))))) & 0x8080808080808080;
  return pdVar7;
code_r0x007a8c68:
  uVar8 = param_1[1];
  if (7 < uVar8) {
    uVar8 = (uVar8 + 1 >> 3) * 7;
  }
  uVar21 = param_1[3];
code_r0x007a8c88:
  param_1[2] = uVar8 - uVar21;
  return (dword *)0x8000000000000001;
}

