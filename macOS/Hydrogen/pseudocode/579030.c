
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00579030(void)

{
  undefined8 *puVar1;
  long lVar2;
  undefined4 *puVar3;
  long lVar4;
  ulong uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  uint uVar8;
  uint uVar9;
  long lVar10;
  code *pcVar11;
  long lVar12;
  undefined8 *puVar13;
  undefined8 uVar14;
  undefined8 *extraout_x8;
  ulong uVar15;
  ulong uVar16;
  long *plVar17;
  ulong uVar18;
  long *plVar19;
  byte bVar20;
  ulong uVar21;
  ulong uVar22;
  undefined8 unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long *plVar23;
  long *plVar24;
  long *plVar25;
  undefined8 *puVar26;
  undefined8 *puVar27;
  int iVar28;
  long lVar29;
  long lVar30;
  byte bVar31;
  undefined1 auVar32 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack_d0;
  long lStack_c8;
  ulong uStack_c0;
  long lStack_b8;
  long lStack_b0;
  long lStack_a8;
  long lStack_a0;
  ulong uStack_98;
  undefined8 uStack_90;
  long lStack_88;
  long *plStack_80;
  undefined8 *puStack_78;
  long lStack_70;
  
  func_0x007a23bc(&UNK_009f00a0);
  func_0x007a247c(&UNK_008ac7ed,0x28,&UNK_009f00b8);
  *(undefined8 *)(unaff_x20 + 0x10) = unaff_x19;
  puVar13 = (undefined8 *)__Unwind_Resume();
  func_0x005759c4();
  __Unwind_Resume(puVar13);
  func_0x007a2668();
  *unaff_x21 = unaff_x20;
  puVar13[1] = in_stack_00000008;
  *puVar13 = in_stack_00000000;
  puVar13[3] = in_stack_00000018;
  puVar13[2] = in_stack_00000010;
  puVar13[5] = in_stack_00000028;
  puVar13[4] = in_stack_00000020;
  puVar13[6] = in_stack_00000030;
  auVar32 = __Unwind_Resume();
  lVar30 = auVar32._0_8_;
  uStack_d0 = 0;
  lStack_c8 = 8;
  uStack_c0 = 0;
  lStack_b8 = 0;
  lStack_b0 = 4;
  lStack_a8 = 0;
  uStack_98 = _UNK_009efac8;
  lStack_a0 = _UNK_009efac0;
  lStack_88 = _UNK_009efad8;
  uStack_90 = _UNK_009efad0;
  uVar15 = auVar32._8_8_ & 0xffffffff;
  if ((uVar15 < *(ulong *)(lVar30 + 0x28)) &&
     (plVar23 = (long *)(*(long *)(lVar30 + 0x20) + uVar15 * 0x20), *plVar23 != -0x8000000000000000)
     ) {
    uVar15 = (ulong)*(uint *)((long)plVar23 + 0x1c) << 0x20 | 0xffffffff;
  }
  else {
    uVar15 = 0xffffffffffffffff;
  }
  lVar29 = 0;
  lVar4 = *(long *)(lVar30 + 0x38);
  uVar5 = *(ulong *)(lVar30 + 0x40);
  do {
    do {
      do {
        uVar18 = uVar15 & 0xffffffff;
        if (uVar18 < uVar5) {
          uVar16 = uVar15 & 0xffffffff;
          uVar15 = uVar15 & 0xffffffff00000000 | (ulong)*(uint *)(lVar4 + uVar18 * 0x30 + 0x20);
        }
        else {
          uVar15 = uVar15 >> 0x20;
          do {
            uVar16 = uVar15;
            if (uVar5 <= uVar16) {
              extraout_x8[5] = lStack_a8;
              extraout_x8[4] = lStack_b0;
              extraout_x8[7] = uStack_98;
              extraout_x8[6] = lStack_a0;
              extraout_x8[9] = lStack_88;
              extraout_x8[8] = uStack_90;
              extraout_x8[1] = lStack_c8;
              *extraout_x8 = uStack_d0;
              extraout_x8[3] = lStack_b8;
              extraout_x8[2] = uStack_c0;
              return;
            }
            lVar30 = lVar4 + uVar16 * 0x30;
            uVar15 = (ulong)*(uint *)(lVar30 + 0x24);
          } while (*(int *)(lVar30 + 0x28) == -1);
          uVar15 = uVar18 | uVar15 << 0x20;
        }
        if ((uVar5 <= uVar16) ||
           (plVar23 = (long *)(lVar4 + uVar16 * 0x30), *plVar23 == -0x8000000000000000)) {
          func_0x007a23bc(&UNK_009f08a0);
FUN_005796b8:
                    /* WARNING: Does not return */
          pcVar11 = (code *)SoftwareBreakpoint(1,0x5796bc);
          (*pcVar11)();
        }
      } while (*(int *)((long)plVar23 + 0x2c) != auVar32._8_4_);
      if ((lVar29 == 0) && (plVar23[2] != 0)) {
        puVar13 = (undefined8 *)plVar23[1];
        lVar30 = plVar23[2] * 0x48;
        do {
          lVar12 = *(long *)*puVar13;
          *(long *)*puVar13 = lVar12 + 1;
          if (lVar12 < 0) {
            func_0x007a05dc();
            goto FUN_005796b8;
          }
          plVar25 = (long *)*puVar13;
          lVar12 = *plVar25;
          *plVar25 = lVar12 + 1;
          plStack_80 = plVar25;
          if (lVar12 < 0) {
            func_0x007a05dc();
            goto FUN_005796b8;
          }
          uVar14 = func_0x0057f2e8(&uStack_d0,plVar25);
          func_0x0056332c(&lStack_a0,plVar25,uVar14);
          puVar13 = puVar13 + 9;
          lVar30 = lVar30 + -0x48;
        } while (lVar30 != 0);
      }
      lVar29 = lVar29 + 1;
      lVar30 = plVar23[2];
    } while (lVar30 == 0);
    plVar24 = (long *)plVar23[1];
    plVar23 = plVar24 + 9;
    plVar25 = plVar24;
    do {
      plVar17 = plVar23;
      lVar12 = plVar25[1];
      if (lVar12 < 6) {
        if (lVar12 < 3) {
          if (lVar12 == 0) {
            func_0x005ca4d0(&plStack_80,plVar25 + 2);
          }
          else {
            if (lVar12 == 1) goto code_r0x00579234;
            lVar12 = 0x10;
code_r0x00579384:
            func_0x005ce8b4(&plStack_80,(long)plVar25 + lVar12);
          }
        }
        else if (lVar12 == 3) {
code_r0x0057939c:
          func_0x005ceb14(&plStack_80,plVar25 + 2);
        }
        else {
          if (lVar12 == 4) goto code_r0x00579234;
          func_0x005ca700(&plStack_80,plVar25 + 2);
        }
code_r0x005793a4:
        puVar13 = puStack_78;
        plVar23 = plStack_80;
        if ((lStack_70 != 0) && (lStack_88 != 0)) {
          puVar1 = puStack_78 + lStack_70;
          puVar26 = puStack_78 + 1;
          plVar19 = (long *)*puStack_78;
code_r0x005793d4:
          lVar10 = lStack_a8;
          lVar12 = 0;
          uVar16 = (*plVar19 + 8) * 0x517cc1b727220a95;
          bVar20 = (byte)(uVar16 >> 0x39);
          uVar16 = uVar16 & uStack_98;
          uVar14 = *(undefined8 *)(lStack_a0 + uVar16);
          uVar18 = CONCAT17(-((byte)((ulong)uVar14 >> 0x38) == bVar20),
                            CONCAT16(-((byte)((ulong)uVar14 >> 0x30) == bVar20),
                                     CONCAT15(-((byte)((ulong)uVar14 >> 0x28) == bVar20),
                                              CONCAT14(-((byte)((ulong)uVar14 >> 0x20) == bVar20),
                                                       CONCAT13(-((byte)((ulong)uVar14 >> 0x18) ==
                                                                 bVar20),CONCAT12(-((byte)((ulong)
                                                  uVar14 >> 0x10) == bVar20),
                                                  CONCAT11(-((byte)((ulong)uVar14 >> 8) == bVar20),
                                                           -((byte)uVar14 == bVar20)))))))) &
                   0x8080808080808080;
          while( true ) {
            for (; puVar27 = puVar26, uVar18 != 0; uVar18 = uVar18 - 1 & uVar18) {
              uVar21 = (uVar18 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                       (uVar18 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar21 = (uVar21 & 0xffff0000ffff0000) >> 0x10 | (uVar21 & 0xffff0000ffff) << 0x10;
              uVar21 = uVar16 + ((ulong)LZCOUNT(uVar21 >> 0x20 | uVar21 << 0x20) >> 3) & uStack_98;
              if (*plVar19 == *(long *)(lStack_a0 + -0x10 + uVar21 * -0x10)) {
                lVar12 = 0;
                uVar8 = *(uint *)(lStack_a0 + uVar21 * -0x10 + -8);
                uVar21 = (ulong)uVar8;
                uVar16 = (*plVar25 + 8) * 0x517cc1b727220a95;
                bVar20 = (byte)(uVar16 >> 0x39);
                uVar16 = uVar16 & uStack_98;
                uVar14 = *(undefined8 *)(lStack_a0 + uVar16);
                uVar18 = CONCAT17(-((byte)((ulong)uVar14 >> 0x38) == bVar20),
                                  CONCAT16(-((byte)((ulong)uVar14 >> 0x30) == bVar20),
                                           CONCAT15(-((byte)((ulong)uVar14 >> 0x28) == bVar20),
                                                    CONCAT14(-((byte)((ulong)uVar14 >> 0x20) ==
                                                              bVar20),CONCAT13(-((byte)((ulong)
                                                  uVar14 >> 0x18) == bVar20),
                                                  CONCAT12(-((byte)((ulong)uVar14 >> 0x10) == bVar20
                                                            ),CONCAT11(-((byte)((ulong)uVar14 >> 8)
                                                                        == bVar20),
                                                                       -((byte)uVar14 == bVar20)))))
                                                  ))) & 0x8080808080808080;
                goto joined_r0x005794cc;
              }
            }
            bVar31 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar14 >> 0x38) == -1),
                                         CONCAT16(-((char)((ulong)uVar14 >> 0x30) == -1),
                                                  CONCAT15(-((char)((ulong)uVar14 >> 0x28) == -1),
                                                           CONCAT14(-((char)((ulong)uVar14 >> 0x20)
                                                                     == -1),CONCAT13(-((char)((ulong
                                                  )uVar14 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar14 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar14 >> 8) ==
                                                                     -1),-((char)uVar14 == -1)))))))
                                        ),1);
            if ((bVar31 & 1) != 0) break;
            lVar12 = lVar12 + 8;
            uVar16 = uVar16 + lVar12 & uStack_98;
            uVar14 = *(undefined8 *)(lStack_a0 + uVar16);
            uVar18 = CONCAT17(-((byte)((ulong)uVar14 >> 0x38) == bVar20),
                              CONCAT16(-((byte)((ulong)uVar14 >> 0x30) == bVar20),
                                       CONCAT15(-((byte)((ulong)uVar14 >> 0x28) == bVar20),
                                                CONCAT14(-((byte)((ulong)uVar14 >> 0x20) == bVar20),
                                                         CONCAT13(-((byte)((ulong)uVar14 >> 0x18) ==
                                                                   bVar20),CONCAT12(-((byte)((ulong)
                                                  uVar14 >> 0x10) == bVar20),
                                                  CONCAT11(-((byte)((ulong)uVar14 >> 8) == bVar20),
                                                           -((byte)uVar14 == bVar20)))))))) &
                     0x8080808080808080;
          }
          goto code_r0x005795d0;
        }
code_r0x005795ec:
        if (plVar23 != (long *)0x0) {
          func_0x00187bd4(puVar13,(long)plVar23 << 3,8);
        }
      }
      else {
        if (8 < lVar12) {
          if (lVar12 == 9) {
            func_0x005c211c(&plStack_80,plVar25 + 2);
          }
          else {
            if (lVar12 != 10) {
              uVar18 = plVar25[2] ^ 0x8000000000000000;
              if (1 < uVar18) {
                uVar18 = 2;
              }
              if (uVar18 == 2) goto code_r0x0057939c;
              if (uVar18 == 1) {
                lVar12 = 0x18;
                goto code_r0x00579384;
              }
              goto code_r0x00579234;
            }
            func_0x005ced0c(&plStack_80,plVar25 + 2);
          }
          goto code_r0x005793a4;
        }
        if (lVar12 != 6) {
          if (lVar12 == 7) {
            func_0x005cf1cc(&plStack_80,plVar25 + 2);
          }
          else {
            func_0x005cb904(&plStack_80,plVar25 + 2);
          }
          goto code_r0x005793a4;
        }
      }
code_r0x00579234:
      lVar12 = 0;
      if (plVar17 != plVar24 + lVar30 * 9) {
        lVar12 = 0x48;
      }
      plVar23 = (long *)((long)plVar17 + lVar12);
      plVar25 = plVar17;
    } while (plVar17 != plVar24 + lVar30 * 9);
  } while( true );
joined_r0x005794cc:
  if (uVar18 == 0) {
    bVar31 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar14 >> 0x38) == -1),
                                 CONCAT16(-((char)((ulong)uVar14 >> 0x30) == -1),
                                          CONCAT15(-((char)((ulong)uVar14 >> 0x28) == -1),
                                                   CONCAT14(-((char)((ulong)uVar14 >> 0x20) == -1),
                                                            CONCAT13(-((char)((ulong)uVar14 >> 0x18)
                                                                      == -1),CONCAT12(-((char)((
                                                  ulong)uVar14 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar14 >> 8) == -1),
                                                           -((char)uVar14 == -1)))))))),1);
    if ((bVar31 & 1) != 0) {
      func_0x007a23d8(&UNK_008ac815,0x16,&UNK_009f00e8);
      goto FUN_005796b8;
    }
    lVar12 = lVar12 + 8;
    uVar16 = uVar16 + lVar12 & uStack_98;
    uVar14 = *(undefined8 *)(lStack_a0 + uVar16);
    uVar18 = CONCAT17(-((byte)((ulong)uVar14 >> 0x38) == bVar20),
                      CONCAT16(-((byte)((ulong)uVar14 >> 0x30) == bVar20),
                               CONCAT15(-((byte)((ulong)uVar14 >> 0x28) == bVar20),
                                        CONCAT14(-((byte)((ulong)uVar14 >> 0x20) == bVar20),
                                                 CONCAT13(-((byte)((ulong)uVar14 >> 0x18) == bVar20)
                                                          ,CONCAT12(-((byte)((ulong)uVar14 >> 0x10)
                                                                     == bVar20),
                                                                    CONCAT11(-((byte)((ulong)uVar14
                                                                                     >> 8) == bVar20
                                                                              ),-((byte)uVar14 ==
                                                                                 bVar20)))))))) &
             0x8080808080808080;
    goto joined_r0x005794cc;
  }
  uVar22 = (uVar18 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar18 >> 7 & 0xff00ff00ff00ff) << 8;
  uVar22 = (uVar22 & 0xffff0000ffff0000) >> 0x10 | (uVar22 & 0xffff0000ffff) << 0x10;
  uVar22 = uVar16 + ((ulong)LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) >> 3) & uStack_98;
  if (*plVar25 != *(long *)(lStack_a0 + -0x10 + uVar22 * -0x10)) {
    uVar18 = uVar18 - 1 & uVar18;
    goto joined_r0x005794cc;
  }
  uVar9 = *(uint *)(lStack_a0 + uVar22 * -0x10 + -8);
  uVar18 = (ulong)uVar9;
  if (uVar9 != uVar8) {
    iVar28 = (int)lStack_a8;
    if (iVar28 == -1) {
      func_0x007a247c(&UNK_008acc5f,0x58,&UNK_009f0570);
      goto FUN_005796b8;
    }
    uVar16 = uVar21;
    if (uVar21 <= uVar18) {
      uVar16 = uVar18;
    }
    if (uStack_c0 <= uVar16) {
      func_0x007a11c0(&UNK_008accb7,0x2b,&UNK_009f05a0);
      goto FUN_005796b8;
    }
    lVar12 = lStack_c8 + uVar18 * 0x10;
    uVar6 = *(undefined4 *)(lVar12 + 8);
    lVar2 = lStack_c8 + uVar21 * 0x10;
    uVar7 = *(undefined4 *)(lVar2 + 0xc);
    *(int *)(lVar12 + 8) = iVar28;
    *(int *)(lVar2 + 0xc) = iVar28;
    if (lStack_a8 == lStack_b8) {
      func_0x005bd21c(&lStack_b8,&UNK_009f0588);
    }
    puVar3 = (undefined4 *)(lStack_b0 + lVar10 * 0x10);
    *puVar3 = uVar6;
    puVar3[1] = uVar7;
    *(ulong *)(puVar3 + 2) = CONCAT44(uVar8,uVar9);
    lStack_a8 = lVar10 + 1;
  }
code_r0x005795d0:
  do {
    if (puVar27 == puVar1) goto code_r0x005795ec;
    puVar26 = puVar27 + 1;
    plVar19 = (long *)*puVar27;
    puVar27 = puVar26;
  } while (lStack_88 == 0);
  goto code_r0x005793d4;
}

