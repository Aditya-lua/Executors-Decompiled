
/* WARNING: Possible PIC construction at 0x007a9d10: Changing call to branch */
/* WARNING: Possible PIC construction at 0x007a9e94: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x007a9d14) */

dword * __ZN9hashbrown3raw21RawTable_LT_T_C_A_GT_14reserve_rehash17hc93ebd4f6f7348d0E
                  (long *param_1,ulong param_2,ulong param_3,int param_4)

{
  ulong *puVar1;
  long *plVar2;
  long *plVar3;
  long *plVar4;
  char cVar5;
  long *plVar6;
  undefined1 *puVar7;
  long lVar8;
  ulong uVar9;
  dword *extraout_x1;
  dword *pdVar10;
  ulong uVar11;
  ulong uVar12;
  long *extraout_x8;
  byte bVar13;
  ulong uVar14;
  ulong *puVar15;
  long *plVar16;
  ulong uVar17;
  ulong uVar18;
  ulong *puVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  undefined1 *puVar23;
  undefined1 *unaff_x29;
  undefined *unaff_x30;
  undefined *puVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  undefined1 auVar28 [16];
  undefined1 auStack_d0 [128];
  
  puVar7 = auStack_d0 + 0x80;
  puVar23 = auStack_d0 + 0xc0;
  uVar20 = param_1[3];
  if (!CARRY8(uVar20,param_2)) {
    param_2 = uVar20 + param_2;
    uVar21 = param_1[1];
    uVar9 = uVar21 + 1;
    uVar14 = uVar9 >> 3;
    uVar22 = uVar21;
    if (7 < uVar21) {
      uVar22 = uVar14 * 7;
    }
    if (param_2 <= uVar22 >> 1) {
      puVar19 = (ulong *)*param_1;
      if ((uVar9 & 7) != 0) {
        uVar14 = uVar14 + 1;
      }
      if (uVar14 != 0) {
        puVar15 = puVar19;
        do {
          uVar22 = *puVar15;
          *puVar15 = CONCAT17(-((long)uVar22 < 0),
                              CONCAT16(-((char)(uVar22 >> 0x30) < '\0'),
                                       CONCAT15(-((char)(uVar22 >> 0x28) < '\0'),
                                                CONCAT14(-((char)(uVar22 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)(uVar22 >> 0x18) < '\0'),
                                                                  CONCAT12(-((char)(uVar22 >> 0x10)
                                                                            < '\0'),CONCAT11(-((char
                                                  )(uVar22 >> 8) < '\0'),-((char)uVar22 < '\0'))))))
                                      )) | 0x8080808080808080;
          uVar14 = uVar14 - 1;
          puVar15 = puVar15 + 1;
        } while (uVar14 != 0);
      }
      if (uVar9 < 8) {
        _memmove(puVar19 + 1,puVar19,uVar9);
        if (uVar9 == 0) {
          uVar9 = 0;
          goto code_r0x007a9c90;
        }
      }
      else {
        *(ulong *)((long)puVar19 + uVar9) = *puVar19;
      }
      uVar20 = 0;
      uVar14 = 1;
      do {
        if (*(char *)((long)puVar19 + uVar20) == -0x80) {
          puVar15 = puVar19 + ~uVar20 * 4;
          while( true ) {
            uVar17 = (ulong)(uint)puVar19[uVar20 * -4 + -4] * 0x517cc1b727220a95;
            uVar18 = param_1[1];
            uVar11 = uVar17 & uVar18;
            lVar8 = *(long *)((long)puVar19 + uVar11);
            uVar21 = CONCAT17(-(lVar8 < 0),
                              CONCAT16(-((char)((ulong)lVar8 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar8 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar8 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar8 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar8 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar8 >> 8) < '\0'),
                                                           -((char)lVar8 < '\0'))))))));
            uVar22 = uVar11;
            if (uVar21 == 0) {
              lVar8 = 8;
              do {
                uVar22 = uVar22 + lVar8 & uVar18;
                lVar25 = *(long *)((long)puVar19 + uVar22);
                uVar21 = CONCAT17(-(lVar25 < 0),
                                  CONCAT16(-((char)((ulong)lVar25 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar25 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar25 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar25 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar25 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar25 >> 8) < '\0'),
                                                           -((char)lVar25 < '\0'))))))));
                lVar8 = lVar8 + 8;
              } while (uVar21 == 0);
            }
            uVar21 = (uVar21 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar21 & 0x5555555555555555) << 1;
            uVar21 = (uVar21 & 0xcccccccccccccccc) >> 2 | (uVar21 & 0x3333333333333333) << 2;
            uVar21 = (uVar21 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar21 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar21 = (uVar21 & 0xff00ff00ff00ff00) >> 8 | (uVar21 & 0xff00ff00ff00ff) << 8;
            uVar21 = (uVar21 & 0xffff0000ffff0000) >> 0x10 | (uVar21 & 0xffff0000ffff) << 0x10;
            uVar22 = uVar22 + ((ulong)LZCOUNT(uVar21 >> 0x20 | uVar21 << 0x20) >> 3) & uVar18;
            bVar13 = (byte)(uVar17 >> 0x38);
            if (*(char *)((long)puVar19 + uVar22) < '\0') {
              uVar21 = uVar22 - uVar11 ^ uVar20 - uVar11;
            }
            else {
              uVar22 = *puVar19;
              uVar22 = CONCAT17(-((long)uVar22 < 0),
                                CONCAT16(-((char)(uVar22 >> 0x30) < '\0'),
                                         CONCAT15(-((char)(uVar22 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)(uVar22 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)(uVar22 >> 0x18) < '\0')
                                                                    ,CONCAT12(-((char)(uVar22 >>
                                                                                      0x10) < '\0'),
                                                                              CONCAT11(-((char)(
                                                  uVar22 >> 8) < '\0'),-((char)uVar22 < '\0'))))))))
              ;
              uVar22 = (uVar22 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar22 & 0x5555555555555555) << 1;
              uVar22 = (uVar22 & 0xcccccccccccccccc) >> 2 | (uVar22 & 0x3333333333333333) << 2;
              uVar22 = (uVar22 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar22 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar22 = (uVar22 & 0xff00ff00ff00ff00) >> 8 | (uVar22 & 0xff00ff00ff00ff) << 8;
              uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
              uVar22 = (ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3;
              uVar21 = uVar22 - uVar11 ^ uVar20 - uVar11;
            }
            if ((uVar21 & uVar18) < 8) {
              *(byte *)((long)puVar19 + uVar20) = bVar13 >> 1;
              puVar19 = (ulong *)*param_1;
              *(byte *)((long)puVar19 + (uVar18 & uVar20 - 8) + 8) = bVar13 >> 1;
              goto code_r0x007a9c1c;
            }
            puVar1 = puVar19 + ~uVar22 * 4;
            cVar5 = *(char *)((long)puVar19 + uVar22);
            *(byte *)((long)puVar19 + uVar22) = bVar13 >> 1;
            puVar19 = (ulong *)*param_1;
            *(byte *)((long)puVar19 + (uVar22 - 8 & uVar18) + 8) = bVar13 >> 1;
            if (cVar5 == -1) break;
            uVar22 = *puVar15;
            *puVar15 = *puVar1;
            *puVar1 = uVar22;
            uVar22 = puVar15[1];
            puVar15[1] = puVar1[1];
            puVar1[1] = uVar22;
            uVar22 = puVar15[2];
            puVar15[2] = puVar1[2];
            puVar1[2] = uVar22;
            uVar22 = puVar15[3];
            puVar15[3] = puVar1[3];
            puVar1[3] = uVar22;
            puVar19 = (ulong *)*param_1;
          }
          uVar22 = param_1[1];
          *(undefined1 *)((long)puVar19 + uVar20) = 0xff;
          *(undefined1 *)((long)puVar19 + (uVar22 & uVar20 - 8) + 8) = 0xff;
          uVar20 = *puVar15;
          uVar21 = puVar15[3];
          uVar22 = puVar15[2];
          puVar1[1] = puVar15[1];
          *puVar1 = uVar20;
          puVar1[3] = uVar21;
          puVar1[2] = uVar22;
        }
code_r0x007a9c1c:
        if (uVar9 <= uVar14) goto code_r0x007a9c70;
        uVar20 = uVar14;
        uVar14 = uVar14 + 1;
      } while( true );
    }
    if (param_2 < uVar22 + 1) {
      param_2 = uVar22 + 1;
    }
    if (param_2 < 8) {
      uVar9 = 4;
      if (3 < param_2) {
        uVar9 = 8;
      }
code_r0x007a9cec:
      uVar22 = uVar9 * 0x20;
      uVar14 = uVar9 + 8;
      if ((!CARRY8(uVar22,uVar14)) && (uVar18 = uVar22 + uVar14, uVar18 < 0x7ffffffffffffff9)) {
        lVar8 = func_0x00187bd0(uVar18,8);
        if (lVar8 != 0) {
          plVar2 = (long *)(lVar8 + uVar22);
          _memset(plVar2,0xff,uVar14);
          uVar22 = uVar9 - 1;
          uVar14 = uVar22;
          if (8 < uVar9) {
            uVar14 = (uVar9 >> 3) * 7;
          }
          if (uVar20 == 0) {
            plVar16 = (long *)*param_1;
          }
          else {
            lVar8 = 0;
            plVar16 = (long *)*param_1;
            lVar25 = *plVar16;
            uVar9 = CONCAT17(-(-1 < lVar25),
                             CONCAT16(-(-1 < (char)((ulong)lVar25 >> 0x30)),
                                      CONCAT15(-(-1 < (char)((ulong)lVar25 >> 0x28)),
                                               CONCAT14(-(-1 < (char)((ulong)lVar25 >> 0x20)),
                                                        CONCAT13(-(-1 < (char)((ulong)lVar25 >> 0x18
                                                                              )),
                                                                 CONCAT12(-(-1 < (char)((ulong)
                                                  lVar25 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar25 >> 8)),
                                                           -(-1 < (char)lVar25)))))))) &
                    0x8080808080808080;
            plVar6 = plVar16;
            uVar18 = uVar20;
            do {
              while (uVar9 == 0) {
                lVar25 = plVar6[1];
                lVar8 = lVar8 + 8;
                plVar6 = plVar6 + 1;
                uVar9 = CONCAT17(-(-1 < lVar25),
                                 CONCAT16(-(-1 < (char)((ulong)lVar25 >> 0x30)),
                                          CONCAT15(-(-1 < (char)((ulong)lVar25 >> 0x28)),
                                                   CONCAT14(-(-1 < (char)((ulong)lVar25 >> 0x20)),
                                                            CONCAT13(-(-1 < (char)((ulong)lVar25 >>
                                                                                  0x18)),
                                                                     CONCAT12(-(-1 < (char)((ulong)
                                                  lVar25 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar25 >> 8)),
                                                           -(-1 < (char)lVar25)))))))) &
                        0x8080808080808080;
              }
              uVar17 = (uVar9 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar9 >> 7 & 0xff00ff00ff00ff) << 8
              ;
              uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
              uVar17 = lVar8 + ((ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3);
              uVar11 = (ulong)*(uint *)(plVar16 + uVar17 * -4 + -4) * 0x517cc1b727220a95 & uVar22;
              lVar25 = *(long *)((long)plVar2 + uVar11);
              uVar12 = CONCAT17(-(lVar25 < 0),
                                CONCAT16(-((char)((ulong)lVar25 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar25 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar25 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar25 >> 0x18)
                                                                     < '\0'),CONCAT12(-((char)((
                                                  ulong)lVar25 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar25 >> 8) < '\0'),
                                                           -((char)lVar25 < '\0'))))))));
              if (uVar12 == 0) {
                lVar25 = 8;
                do {
                  uVar11 = uVar11 + lVar25 & uVar22;
                  lVar26 = *(long *)((long)plVar2 + uVar11);
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
                  lVar25 = lVar25 + 8;
                } while (uVar12 == 0);
              }
              uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
              uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
              uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
              uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
              uVar11 = uVar11 + ((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3) & uVar22;
              if (-1 < *(char *)((long)plVar2 + uVar11)) {
                lVar25 = *plVar2;
                uVar11 = CONCAT17(-(lVar25 < 0),
                                  CONCAT16(-((char)((ulong)lVar25 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar25 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar25 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar25 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar25 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar25 >> 8) < '\0'),
                                                           -((char)lVar25 < '\0'))))))));
                uVar11 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
                uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
                uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
                uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
                uVar11 = (ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3;
              }
              uVar9 = uVar9 - 1 & uVar9;
              bVar13 = (byte)((ulong)*(uint *)(plVar16 + uVar17 * -4 + -4) * 0x517cc1b727220a95 >>
                             0x38);
              *(byte *)((long)plVar2 + uVar11) = bVar13 >> 1;
              *(byte *)((long)plVar2 + (uVar11 - 8 & uVar22) + 8) = bVar13 >> 1;
              plVar3 = plVar16 + ~uVar17 * 4;
              lVar25 = *plVar3;
              lVar27 = plVar3[3];
              lVar26 = plVar3[2];
              plVar4 = plVar2 + ~uVar11 * 4;
              plVar4[1] = plVar3[1];
              *plVar4 = lVar25;
              plVar4[3] = lVar27;
              plVar4[2] = lVar26;
              uVar18 = uVar18 - 1;
            } while (uVar18 != 0);
          }
          *param_1 = (long)plVar2;
          param_1[1] = uVar22;
          param_1[2] = uVar14 - uVar20;
          if (uVar21 != 0) {
            lVar25 = uVar21 * 0x20 + 0x20;
            lVar8 = uVar21 + lVar25 + 9;
            if (lVar8 != 0) {
              func_0x00187bd4((long)plVar16 - lVar25,lVar8,8);
            }
          }
          return (dword *)0x8000000000000001;
        }
        pdVar10 = &MACH_HEADER.cpusubtype;
        puVar24 = &UNK_007a9e98;
        param_3 = uVar18;
        goto code_r0x004584ec;
      }
    }
    else if ((param_2 >> 0x3d == 0) &&
            (uVar9 = 0xffffffffffffffff >> (LZCOUNT((param_2 * 8) / 7 - 1) & 0x3fU),
            uVar9 < 0x7ffffffffffffff)) {
      uVar9 = uVar9 + 1;
      goto code_r0x007a9cec;
    }
    unaff_x30 = &UNK_007a9d14;
    register0x00000008 = (BADSPACEBASE *)(auStack_d0 + 0x80);
    unaff_x29 = puVar23;
  }
  if (param_4 == 0) {
    return (dword *)0x0;
  }
  puVar7 = (undefined1 *)((long)register0x00000008 + -0x40);
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = unaff_x30;
  puVar23 = (undefined1 *)((long)register0x00000008 + -0x10);
  *(undefined **)((long)register0x00000008 + -0x40) = &UNK_009df590;
  *(undefined8 *)((long)register0x00000008 + -0x38) = 1;
  *(undefined8 *)((long)register0x00000008 + -0x28) = 0;
  *(undefined8 *)((long)register0x00000008 + -0x20) = 0;
  *(undefined8 *)((long)register0x00000008 + -0x30) = 8;
  puVar24 = &__ZN9hashbrown3raw11Fallibility9alloc_err17h67adbbd0f8ea50c7E;
  param_4 = func_0x007a2420((undefined1 *)((long)register0x00000008 + -0x40),&UNK_009df5a0);
  pdVar10 = extraout_x1;
code_r0x004584ec:
  if (param_4 == 0) {
    return pdVar10;
  }
  *(undefined1 **)(puVar7 + -0x10) = puVar23;
  *(undefined **)(puVar7 + -8) = puVar24;
  auVar28 = func_0x007a1f18(pdVar10,param_3);
  pdVar10 = auVar28._0_8_;
  *(undefined1 **)(puVar7 + -0x20) = puVar7 + -0x10;
  *(undefined **)(puVar7 + -0x18) = &__ZN9hashbrown3raw16RawIterHashInner3new17h83449af9a3c7e72fE;
  uVar20 = *(ulong *)(pdVar10 + 2);
  uVar9 = uVar20 & auVar28._8_8_;
  lVar8 = *(long *)(*(long *)pdVar10 + uVar9);
  bVar13 = auVar28[0xf] >> 1;
  *extraout_x8 = *(long *)pdVar10;
  extraout_x8[1] = uVar20;
  *(byte *)(extraout_x8 + 6) = auVar28[0xf] >> 1;
  extraout_x8[2] = uVar9;
  extraout_x8[3] = 0;
  extraout_x8[4] = lVar8;
  extraout_x8[5] =
       CONCAT17(-((byte)((ulong)lVar8 >> 0x38) == bVar13),
                CONCAT16(-((byte)((ulong)lVar8 >> 0x30) == bVar13),
                         CONCAT15(-((byte)((ulong)lVar8 >> 0x28) == bVar13),
                                  CONCAT14(-((byte)((ulong)lVar8 >> 0x20) == bVar13),
                                           CONCAT13(-((byte)((ulong)lVar8 >> 0x18) == bVar13),
                                                    CONCAT12(-((byte)((ulong)lVar8 >> 0x10) ==
                                                              bVar13),CONCAT11(-((byte)((ulong)lVar8
                                                                                       >> 8) ==
                                                                                bVar13),-((byte)
                                                  lVar8 == bVar13)))))))) & 0x8080808080808080;
  return pdVar10;
code_r0x007a9c70:
  uVar9 = param_1[1];
  if (7 < uVar9) {
    uVar9 = (uVar9 + 1 >> 3) * 7;
  }
  uVar20 = param_1[3];
code_r0x007a9c90:
  param_1[2] = uVar9 - uVar20;
  return (dword *)0x8000000000000001;
}

