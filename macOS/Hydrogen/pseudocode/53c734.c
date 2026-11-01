
/* WARNING: Possible PIC construction at 0x007ab8ec: Changing call to branch */
/* WARNING: Possible PIC construction at 0x007aba68: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x007ab8f0) */
/* WARNING: Removing unreachable block (ram,0x004584ac) */

dword * FUN_0053c734(long *param_1,ulong param_2,ulong param_3)

{
  ulong *puVar1;
  long *plVar2;
  char cVar3;
  long *plVar4;
  undefined1 *puVar5;
  int iVar6;
  long lVar7;
  ulong uVar8;
  dword *extraout_x1;
  dword *pdVar9;
  ulong uVar10;
  ulong uVar11;
  long *extraout_x8;
  byte bVar12;
  ulong uVar13;
  ulong *puVar14;
  long *plVar15;
  ulong uVar16;
  ulong uVar17;
  ulong *puVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  undefined1 *puVar22;
  undefined1 *unaff_x29;
  undefined *unaff_x30;
  undefined *puVar23;
  long lVar24;
  long lVar25;
  undefined1 auVar26 [16];
  undefined1 auStack_d0 [128];
  
  puVar5 = auStack_d0 + 0x80;
  puVar22 = auStack_d0 + 0xc0;
  uVar19 = param_1[3];
  if (!CARRY8(uVar19,param_2)) {
    param_2 = uVar19 + param_2;
    uVar20 = param_1[1];
    uVar8 = uVar20 + 1;
    uVar13 = uVar8 >> 3;
    uVar21 = uVar20;
    if (7 < uVar20) {
      uVar21 = uVar13 * 7;
    }
    if (param_2 <= uVar21 >> 1) {
      puVar18 = (ulong *)*param_1;
      if ((uVar8 & 7) != 0) {
        uVar13 = uVar13 + 1;
      }
      if (uVar13 != 0) {
        puVar14 = puVar18;
        do {
          uVar21 = *puVar14;
          *puVar14 = CONCAT17(-((long)uVar21 < 0),
                              CONCAT16(-((char)(uVar21 >> 0x30) < '\0'),
                                       CONCAT15(-((char)(uVar21 >> 0x28) < '\0'),
                                                CONCAT14(-((char)(uVar21 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)(uVar21 >> 0x18) < '\0'),
                                                                  CONCAT12(-((char)(uVar21 >> 0x10)
                                                                            < '\0'),CONCAT11(-((char
                                                  )(uVar21 >> 8) < '\0'),-((char)uVar21 < '\0'))))))
                                      )) | 0x8080808080808080;
          uVar13 = uVar13 - 1;
          puVar14 = puVar14 + 1;
        } while (uVar13 != 0);
      }
      if (uVar8 < 8) {
        _memmove(puVar18 + 1,puVar18,uVar8);
        if (uVar8 == 0) {
          uVar8 = 0;
          goto code_r0x007ab86c;
        }
      }
      else {
        *(ulong *)((long)puVar18 + uVar8) = *puVar18;
      }
      uVar19 = 0;
      uVar13 = 1;
      do {
        if (*(char *)((long)puVar18 + uVar19) == -0x80) {
          puVar14 = puVar18 + ~uVar19 * 2;
          while( true ) {
            uVar16 = (ulong)(uint)puVar18[uVar19 * -2 + -2] * 0x517cc1b727220a95;
            uVar17 = param_1[1];
            uVar10 = uVar16 & uVar17;
            lVar7 = *(long *)((long)puVar18 + uVar10);
            uVar20 = CONCAT17(-(lVar7 < 0),
                              CONCAT16(-((char)((ulong)lVar7 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar7 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar7 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar7 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar7 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar7 >> 8) < '\0'),
                                                           -((char)lVar7 < '\0'))))))));
            uVar21 = uVar10;
            if (uVar20 == 0) {
              lVar7 = 8;
              do {
                uVar21 = uVar21 + lVar7 & uVar17;
                lVar24 = *(long *)((long)puVar18 + uVar21);
                uVar20 = CONCAT17(-(lVar24 < 0),
                                  CONCAT16(-((char)((ulong)lVar24 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar24 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar24 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar24 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar24 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar24 >> 8) < '\0'),
                                                           -((char)lVar24 < '\0'))))))));
                lVar7 = lVar7 + 8;
              } while (uVar20 == 0);
            }
            uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
            uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
            uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
            uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
            uVar21 = uVar21 + ((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) & uVar17;
            bVar12 = (byte)(uVar16 >> 0x38);
            if (*(char *)((long)puVar18 + uVar21) < '\0') {
              uVar20 = uVar21 - uVar10 ^ uVar19 - uVar10;
            }
            else {
              uVar21 = *puVar18;
              uVar21 = CONCAT17(-((long)uVar21 < 0),
                                CONCAT16(-((char)(uVar21 >> 0x30) < '\0'),
                                         CONCAT15(-((char)(uVar21 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)(uVar21 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)(uVar21 >> 0x18) < '\0')
                                                                    ,CONCAT12(-((char)(uVar21 >>
                                                                                      0x10) < '\0'),
                                                                              CONCAT11(-((char)(
                                                  uVar21 >> 8) < '\0'),-((char)uVar21 < '\0'))))))))
              ;
              uVar21 = (uVar21 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar21 & 0x5555555555555555) << 1;
              uVar21 = (uVar21 & 0xcccccccccccccccc) >> 2 | (uVar21 & 0x3333333333333333) << 2;
              uVar21 = (uVar21 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar21 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar21 = (uVar21 & 0xff00ff00ff00ff00) >> 8 | (uVar21 & 0xff00ff00ff00ff) << 8;
              uVar21 = (uVar21 & 0xffff0000ffff0000) >> 0x10 | (uVar21 & 0xffff0000ffff) << 0x10;
              uVar21 = (ulong)LZCOUNT(uVar21 >> 0x20 | uVar21 << 0x20) >> 3;
              uVar20 = uVar21 - uVar10 ^ uVar19 - uVar10;
            }
            if ((uVar20 & uVar17) < 8) {
              *(byte *)((long)puVar18 + uVar19) = bVar12 >> 1;
              puVar18 = (ulong *)*param_1;
              *(byte *)((long)puVar18 + (uVar17 & uVar19 - 8) + 8) = bVar12 >> 1;
              goto code_r0x007ab7f8;
            }
            puVar1 = puVar18 + ~uVar21 * 2;
            cVar3 = *(char *)((long)puVar18 + uVar21);
            *(byte *)((long)puVar18 + uVar21) = bVar12 >> 1;
            puVar18 = (ulong *)*param_1;
            *(byte *)((long)puVar18 + (uVar21 - 8 & uVar17) + 8) = bVar12 >> 1;
            if (cVar3 == -1) break;
            uVar21 = *puVar14;
            *puVar14 = *puVar1;
            *puVar1 = uVar21;
            uVar21 = puVar14[1];
            puVar14[1] = puVar1[1];
            puVar1[1] = uVar21;
            puVar18 = (ulong *)*param_1;
          }
          uVar21 = param_1[1];
          *(undefined1 *)((long)puVar18 + uVar19) = 0xff;
          *(undefined1 *)((long)puVar18 + (uVar21 & uVar19 - 8) + 8) = 0xff;
          uVar19 = *puVar14;
          puVar1[1] = puVar14[1];
          *puVar1 = uVar19;
        }
code_r0x007ab7f8:
        if (uVar8 <= uVar13) goto code_r0x007ab84c;
        uVar19 = uVar13;
        uVar13 = uVar13 + 1;
      } while( true );
    }
    if (param_2 < uVar21 + 1) {
      param_2 = uVar21 + 1;
    }
    if (param_2 < 8) {
      uVar8 = 4;
      if (3 < param_2) {
        uVar8 = 8;
      }
code_r0x007ab8c8:
      uVar21 = uVar8 * 0x10;
      uVar13 = uVar8 + 8;
      if ((!CARRY8(uVar21,uVar13)) && (uVar17 = uVar21 + uVar13, uVar17 < 0x7ffffffffffffff9)) {
        lVar7 = func_0x00187bd0(uVar17,8);
        if (lVar7 != 0) {
          plVar2 = (long *)(lVar7 + uVar21);
          _memset(plVar2,0xff,uVar13);
          uVar21 = uVar8 - 1;
          uVar13 = uVar21;
          if (8 < uVar8) {
            uVar13 = (uVar8 >> 3) * 7;
          }
          if (uVar19 == 0) {
            plVar15 = (long *)*param_1;
          }
          else {
            lVar7 = 0;
            plVar15 = (long *)*param_1;
            lVar24 = *plVar15;
            uVar8 = CONCAT17(-(-1 < lVar24),
                             CONCAT16(-(-1 < (char)((ulong)lVar24 >> 0x30)),
                                      CONCAT15(-(-1 < (char)((ulong)lVar24 >> 0x28)),
                                               CONCAT14(-(-1 < (char)((ulong)lVar24 >> 0x20)),
                                                        CONCAT13(-(-1 < (char)((ulong)lVar24 >> 0x18
                                                                              )),
                                                                 CONCAT12(-(-1 < (char)((ulong)
                                                  lVar24 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar24 >> 8)),
                                                           -(-1 < (char)lVar24)))))))) &
                    0x8080808080808080;
            plVar4 = plVar15;
            uVar17 = uVar19;
            do {
              while (uVar8 == 0) {
                lVar24 = plVar4[1];
                lVar7 = lVar7 + 8;
                plVar4 = plVar4 + 1;
                uVar8 = CONCAT17(-(-1 < lVar24),
                                 CONCAT16(-(-1 < (char)((ulong)lVar24 >> 0x30)),
                                          CONCAT15(-(-1 < (char)((ulong)lVar24 >> 0x28)),
                                                   CONCAT14(-(-1 < (char)((ulong)lVar24 >> 0x20)),
                                                            CONCAT13(-(-1 < (char)((ulong)lVar24 >>
                                                                                  0x18)),
                                                                     CONCAT12(-(-1 < (char)((ulong)
                                                  lVar24 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar24 >> 8)),
                                                           -(-1 < (char)lVar24)))))))) &
                        0x8080808080808080;
              }
              uVar16 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar8 >> 7 & 0xff00ff00ff00ff) << 8
              ;
              uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
              uVar16 = lVar7 + ((ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3);
              uVar10 = (ulong)*(uint *)(plVar15 + uVar16 * -2 + -2) * 0x517cc1b727220a95 & uVar21;
              lVar24 = *(long *)((long)plVar2 + uVar10);
              uVar11 = CONCAT17(-(lVar24 < 0),
                                CONCAT16(-((char)((ulong)lVar24 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar24 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar24 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar24 >> 0x18)
                                                                     < '\0'),CONCAT12(-((char)((
                                                  ulong)lVar24 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar24 >> 8) < '\0'),
                                                           -((char)lVar24 < '\0'))))))));
              if (uVar11 == 0) {
                lVar24 = 8;
                do {
                  uVar10 = uVar10 + lVar24 & uVar21;
                  lVar25 = *(long *)((long)plVar2 + uVar10);
                  uVar11 = CONCAT17(-(lVar25 < 0),
                                    CONCAT16(-((char)((ulong)lVar25 >> 0x30) < '\0'),
                                             CONCAT15(-((char)((ulong)lVar25 >> 0x28) < '\0'),
                                                      CONCAT14(-((char)((ulong)lVar25 >> 0x20) <
                                                                '\0'),CONCAT13(-((char)((ulong)
                                                  lVar25 >> 0x18) < '\0'),
                                                  CONCAT12(-((char)((ulong)lVar25 >> 0x10) < '\0'),
                                                           CONCAT11(-((char)((ulong)lVar25 >> 8) <
                                                                     '\0'),-((char)lVar25 < '\0'))))
                                                  ))));
                  lVar24 = lVar24 + 8;
                } while (uVar11 == 0);
              }
              uVar11 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
              uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
              uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
              uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
              uVar10 = uVar10 + ((ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3) & uVar21;
              if (-1 < *(char *)((long)plVar2 + uVar10)) {
                lVar24 = *plVar2;
                uVar10 = CONCAT17(-(lVar24 < 0),
                                  CONCAT16(-((char)((ulong)lVar24 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar24 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar24 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar24 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar24 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar24 >> 8) < '\0'),
                                                           -((char)lVar24 < '\0'))))))));
                uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
                uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
                uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
                uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
                uVar10 = (ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3;
              }
              uVar8 = uVar8 - 1 & uVar8;
              bVar12 = (byte)((ulong)*(uint *)(plVar15 + uVar16 * -2 + -2) * 0x517cc1b727220a95 >>
                             0x38);
              *(byte *)((long)plVar2 + uVar10) = bVar12 >> 1;
              *(byte *)((long)plVar2 + (uVar10 - 8 & uVar21) + 8) = bVar12 >> 1;
              lVar24 = plVar15[~uVar16 * 2];
              (plVar2 + ~uVar10 * 2)[1] = (plVar15 + ~uVar16 * 2)[1];
              plVar2[~uVar10 * 2] = lVar24;
              uVar17 = uVar17 - 1;
            } while (uVar17 != 0);
          }
          *param_1 = (long)plVar2;
          param_1[1] = uVar21;
          param_1[2] = uVar13 - uVar19;
          if (uVar20 != 0) {
            lVar24 = uVar20 * 0x10 + 0x10;
            lVar7 = uVar20 + lVar24 + 9;
            if (lVar7 != 0) {
              func_0x00187bd4((long)plVar15 - lVar24,lVar7,8);
            }
          }
          return (dword *)0x8000000000000001;
        }
        iVar6 = 1;
        pdVar9 = &MACH_HEADER.cpusubtype;
        puVar23 = &UNK_007aba6c;
        param_3 = uVar17;
        goto code_r0x004584ec;
      }
    }
    else if ((param_2 >> 0x3d == 0) &&
            (uVar8 = 0xffffffffffffffff >> (LZCOUNT((param_2 * 8) / 7 - 1) & 0x3fU),
            uVar8 < 0xfffffffffffffff)) {
      uVar8 = uVar8 + 1;
      goto code_r0x007ab8c8;
    }
    unaff_x30 = &UNK_007ab8f0;
    register0x00000008 = (BADSPACEBASE *)(auStack_d0 + 0x80);
    unaff_x29 = puVar22;
  }
  puVar5 = (undefined1 *)((long)register0x00000008 + -0x40);
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = unaff_x30;
  puVar22 = (undefined1 *)((long)register0x00000008 + -0x10);
  *(undefined **)((long)register0x00000008 + -0x40) = &UNK_009df590;
  *(undefined8 *)((long)register0x00000008 + -0x38) = 1;
  *(undefined8 *)((long)register0x00000008 + -0x28) = 0;
  *(undefined8 *)((long)register0x00000008 + -0x20) = 0;
  *(undefined8 *)((long)register0x00000008 + -0x30) = 8;
  puVar23 = &__ZN9hashbrown3raw11Fallibility9alloc_err17h67adbbd0f8ea50c7E;
  iVar6 = func_0x007a2420((undefined1 *)((long)register0x00000008 + -0x40),&UNK_009df5a0);
  pdVar9 = extraout_x1;
code_r0x004584ec:
  if (iVar6 == 0) {
    return pdVar9;
  }
  *(undefined1 **)(puVar5 + -0x10) = puVar22;
  *(undefined **)(puVar5 + -8) = puVar23;
  auVar26 = func_0x007a1f18(pdVar9,param_3);
  pdVar9 = auVar26._0_8_;
  *(undefined1 **)(puVar5 + -0x20) = puVar5 + -0x10;
  *(undefined **)(puVar5 + -0x18) = &__ZN9hashbrown3raw16RawIterHashInner3new17h83449af9a3c7e72fE;
  uVar19 = *(ulong *)(pdVar9 + 2);
  uVar8 = uVar19 & auVar26._8_8_;
  lVar7 = *(long *)(*(long *)pdVar9 + uVar8);
  bVar12 = auVar26[0xf] >> 1;
  *extraout_x8 = *(long *)pdVar9;
  extraout_x8[1] = uVar19;
  *(byte *)(extraout_x8 + 6) = auVar26[0xf] >> 1;
  extraout_x8[2] = uVar8;
  extraout_x8[3] = 0;
  extraout_x8[4] = lVar7;
  extraout_x8[5] =
       CONCAT17(-((byte)((ulong)lVar7 >> 0x38) == bVar12),
                CONCAT16(-((byte)((ulong)lVar7 >> 0x30) == bVar12),
                         CONCAT15(-((byte)((ulong)lVar7 >> 0x28) == bVar12),
                                  CONCAT14(-((byte)((ulong)lVar7 >> 0x20) == bVar12),
                                           CONCAT13(-((byte)((ulong)lVar7 >> 0x18) == bVar12),
                                                    CONCAT12(-((byte)((ulong)lVar7 >> 0x10) ==
                                                              bVar12),CONCAT11(-((byte)((ulong)lVar7
                                                                                       >> 8) ==
                                                                                bVar12),-((byte)
                                                  lVar7 == bVar12)))))))) & 0x8080808080808080;
  return pdVar9;
code_r0x007ab84c:
  uVar8 = param_1[1];
  if (7 < uVar8) {
    uVar8 = (uVar8 + 1 >> 3) * 7;
  }
  uVar19 = param_1[3];
code_r0x007ab86c:
  param_1[2] = uVar8 - uVar19;
  return (dword *)0x8000000000000001;
}

