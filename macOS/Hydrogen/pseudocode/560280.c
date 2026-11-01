
/* WARNING: Possible PIC construction at 0x005963e8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00596528: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005965d0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005964cc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005965d4) */
/* WARNING: Removing unreachable block (ram,0x005964d0) */
/* WARNING: Removing unreachable block (ram,0x005964dc) */
/* WARNING: Removing unreachable block (ram,0x005964e0) */

void FUN_00560280(long *param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined4 uVar4;
  ulong uVar5;
  long lVar6;
  undefined1 *puVar7;
  long *plVar8;
  undefined8 *puVar9;
  long lVar10;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  long *plVar11;
  long lVar12;
  long lVar13;
  long *plVar14;
  ulong uVar15;
  undefined1 *puVar16;
  undefined1 *unaff_x29;
  undefined *unaff_x30;
  long lVar17;
  long lVar18;
  long lVar19;
  undefined1 uStack0000000000000060;
  undefined1 auStack_130 [8];
  undefined8 uStack_128;
  long lStack_120;
  long lStack_118;
  long *plStack_110;
  long lStack_108;
  ulong uStack_100;
  long *plStack_f8;
  long lStack_f0;
  long lStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  long *plStack_48;
  long lStack_40;
  long lStack_30;
  long *plStack_28;
  long lStack_20;
  long lStack_10;
  
  puVar7 = auStack_130;
  puVar16 = auStack_130 + 0x180;
  lStack_118 = param_1[1];
  lStack_120 = *param_1;
  lStack_108 = param_1[3];
  plStack_110 = (long *)param_1[2];
  plStack_f8 = (long *)param_1[5];
  uStack_100 = param_1[4];
  lStack_e8 = param_1[7];
  lStack_f0 = param_1[6];
  uStack_128 = param_2;
  do {
    do {
      do {
        if (lStack_e8 == 0) goto code_r0x00596634;
        if (uStack_100 == 0) {
          plVar8 = plStack_f8;
          do {
            plStack_f8 = plVar8 + 1;
            lVar17 = *plVar8;
            lStack_108 = lStack_108 + -0x640;
            uStack_100 = CONCAT17(-(-1 < lVar17),
                                  CONCAT16(-(-1 < (char)((ulong)lVar17 >> 0x30)),
                                           CONCAT15(-(-1 < (char)((ulong)lVar17 >> 0x28)),
                                                    CONCAT14(-(-1 < (char)((ulong)lVar17 >> 0x20)),
                                                             CONCAT13(-(-1 < (char)((ulong)lVar17 >>
                                                                                   0x18)),
                                                                      CONCAT12(-(-1 < (char)((ulong)
                                                  lVar17 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar17 >> 8)),
                                                           -(-1 < (char)lVar17)))))))) &
                         0x8080808080808080;
            plVar8 = plStack_f8;
          } while (uStack_100 == 0);
        }
        uVar15 = (uStack_100 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uStack_100 & 0x5555555555555555) << 1;
        uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
        uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        uStack_100 = uStack_100 - 1 & uStack_100;
        lVar12 = lStack_108 +
                 (long)-(int)((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) * 200;
        lStack_e8 = lStack_e8 + -1;
        uVar4 = *(undefined4 *)(lVar12 + -200);
        lVar10 = *(long *)(lVar12 + -0xb8);
        lVar17 = *(long *)(lVar12 + -0xa0);
        lVar1 = *(long *)(lVar12 + -0x98);
        lVar18 = *(long *)(lVar12 + -0x80);
        lVar2 = *(long *)(lVar12 + -0x78);
        lVar19 = *(long *)(lVar12 + -0x60);
        lVar3 = *(long *)(lVar12 + -0x58);
        uStack_a8 = *(undefined8 *)(lVar12 + -0x18);
        uStack_b0 = *(undefined8 *)(lVar12 + -0x20);
        uStack_98 = *(undefined8 *)(lVar12 + -8);
        uStack_a0 = *(undefined8 *)(lVar12 + -0x10);
        uStack_c8 = *(undefined8 *)(lVar12 + -0x38);
        uStack_d0 = *(undefined8 *)(lVar12 + -0x40);
        uStack_b8 = *(undefined8 *)(lVar12 + -0x28);
        uStack_c0 = *(undefined8 *)(lVar12 + -0x30);
        uStack_d8 = *(undefined8 *)(lVar12 + -0x48);
        uStack_e0 = *(undefined8 *)(lVar12 + -0x50);
        uVar15 = uStack_100;
        lVar6 = lStack_e8;
        lVar13 = lStack_108;
        plVar8 = plStack_f8;
        if (*(long *)(lVar12 + -0xc0) == 0) goto joined_r0x005965d8;
        lVar13 = lVar10 * 9 + 0x11;
        if (lVar10 == 0 || lVar13 == 0) {
          lVar10 = lVar1 * 9 + 0x11;
          if (lVar1 != 0 && lVar10 != 0) goto code_r0x005964c0;
        }
        else {
          func_0x00187bd4(*(long *)(lVar12 + -0xc0) + lVar10 * -8 + -8,lVar13,8);
          lVar10 = lVar1 * 9 + 0x11;
          if (lVar1 != 0 && lVar10 != 0) {
code_r0x005964c0:
            plVar8 = (long *)(lVar17 + lVar1 * -8 + -8);
            lVar17 = 8;
            unaff_x30 = &UNK_005964d0;
            goto code_r0x00187bd4;
          }
        }
        lVar17 = lVar2 * 9 + 0x11;
        if (lVar2 == 0 || lVar17 == 0) {
          lVar10 = lVar3 * 9 + 0x11;
          if (lVar3 != 0 && lVar10 != 0) goto LAB_005963dc;
        }
        else {
          func_0x00187bd4(lVar18 + lVar2 * -8 + -8,lVar17,8);
          lVar10 = lVar3 * 9 + 0x11;
          if (lVar3 != 0 && lVar10 != 0) {
LAB_005963dc:
            unaff_x30 = &LAB_005963ec;
            puVar7 = auStack_130;
            plVar8 = (long *)(lVar19 + lVar3 * -8 + -8);
            lVar17 = 8;
            goto code_r0x00187bd4;
          }
        }
        uStack_88 = uStack_c8;
        uStack_90 = uStack_d0;
        uStack_78 = uStack_b8;
        uStack_80 = uStack_c0;
        uStack_68 = uStack_a8;
        uStack_70 = uStack_b0;
        uStack_58 = uStack_98;
        uStack_60 = uStack_a0;
        func_0x00562cf8(&plStack_48,uStack_128,uVar4,&uStack_90);
        lVar17 = lStack_40;
        param_2 = extraout_x1;
      } while (plStack_48 == (long *)0x0);
      if (lStack_40 != 0) {
        if (lStack_30 != 0) {
          plVar14 = plStack_48 + 1;
          lVar18 = *plStack_48;
          uVar15 = CONCAT17(-(-1 < lVar18),
                            CONCAT16(-(-1 < (char)((ulong)lVar18 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar18 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar18 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar18 >> 0x18)
                                                                 ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar18 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar18 >> 8)),
                                                           -(-1 < (char)lVar18)))))))) &
                   0x8080808080808080;
          plVar8 = plStack_48;
          lVar18 = lStack_30;
          do {
            while (uVar15 == 0) {
              lVar19 = *plVar14;
              plVar8 = plVar8 + -8;
              plVar14 = plVar14 + 1;
              uVar15 = CONCAT17(-(-1 < lVar19),
                                CONCAT16(-(-1 < (char)((ulong)lVar19 >> 0x30)),
                                         CONCAT15(-(-1 < (char)((ulong)lVar19 >> 0x28)),
                                                  CONCAT14(-(-1 < (char)((ulong)lVar19 >> 0x20)),
                                                           CONCAT13(-(-1 < (char)((ulong)lVar19 >>
                                                                                 0x18)),
                                                                    CONCAT12(-(-1 < (char)((ulong)
                                                  lVar19 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar19 >> 8)),
                                                           -(-1 < (char)lVar19)))))))) &
                       0x8080808080808080;
            }
            uVar5 = (uVar15 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar15 >> 7 & 0xff00ff00ff00ff) << 8;
            uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
            plVar11 = *(long **)((long)plVar8 +
                                (-8 - (LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) & 0x78U)));
            lVar19 = *plVar11;
            *plVar11 = lVar19 + -1;
            LORelease();
            if (lVar19 == 1) {
              func_0x005d2ac4();
            }
            uVar15 = uVar15 - 1 & uVar15;
            lVar18 = lVar18 + -1;
          } while (lVar18 != 0);
        }
        lVar10 = lVar17 * 9 + 0x11;
        param_2 = 0;
        if (lVar10 != 0) {
          unaff_x30 = &UNK_0059652c;
          puVar7 = auStack_130;
          plVar8 = plStack_48 + (-1 - lVar17);
          lVar17 = 8;
          goto code_r0x00187bd4;
        }
      }
      lVar17 = lStack_20;
    } while (lStack_20 == 0);
    if (lStack_10 != 0) {
      plVar14 = plStack_28 + 1;
      lVar18 = *plStack_28;
      uVar15 = CONCAT17(-(-1 < lVar18),
                        CONCAT16(-(-1 < (char)((ulong)lVar18 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar18 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar18 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar18 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar18 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar18 >> 8)),-(-1 < (char)lVar18)))))))) &
               0x8080808080808080;
      plVar8 = plStack_28;
      lVar18 = lStack_10;
      do {
        while (uVar15 == 0) {
          lVar19 = *plVar14;
          plVar8 = plVar8 + -8;
          plVar14 = plVar14 + 1;
          uVar15 = CONCAT17(-(-1 < lVar19),
                            CONCAT16(-(-1 < (char)((ulong)lVar19 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar19 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar19 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar19 >> 0x18)
                                                                 ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar19 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar19 >> 8)),
                                                           -(-1 < (char)lVar19)))))))) &
                   0x8080808080808080;
        }
        uVar5 = (uVar15 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar15 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        puVar9 = (undefined8 *)
                 ((long)plVar8 + (-8 - (LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) & 0x78U)));
        plVar11 = (long *)*puVar9;
        lVar19 = *plVar11;
        *plVar11 = lVar19 + -1;
        LORelease();
        if (lVar19 == 1) {
          func_0x005d2ac4(puVar9,param_2);
          param_2 = extraout_x1_00;
        }
        uVar15 = uVar15 - 1 & uVar15;
        lVar18 = lVar18 + -1;
      } while (lVar18 != 0);
    }
    lVar10 = lVar17 * 9 + 0x11;
    param_2 = 0;
  } while (lVar10 == 0);
  unaff_x30 = &UNK_005965d4;
  puVar7 = auStack_130;
  plVar8 = plStack_28 + (-1 - lVar17);
  lVar17 = 8;
code_r0x00187bd4:
  *(undefined1 **)(puVar7 + -0x10) = puVar16;
  *(undefined **)(puVar7 + -8) = unaff_x30;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar8,lVar10,lVar17);
  return;
joined_r0x005965d8:
  for (; lVar6 != 0; lVar6 = lVar6 + -1) {
    while (uVar15 == 0) {
      lVar17 = *plVar8;
      lVar13 = lVar13 + -0x640;
      plVar8 = plVar8 + 1;
      uVar15 = CONCAT17(-(-1 < lVar17),
                        CONCAT16(-(-1 < (char)((ulong)lVar17 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar17 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar17 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar17 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar17 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar17 >> 8)),-(-1 < (char)lVar17)))))))) &
               0x8080808080808080;
    }
    uVar5 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
    uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
    uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
    uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
    func_0x00538fa0(lVar13 + (long)-(int)((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3) * 200
                    + -200,param_2);
    uVar15 = uVar15 - 1 & uVar15;
    param_2 = extraout_x1_01;
  }
code_r0x00596634:
  if ((lStack_120 == 0) || (lStack_118 == 0)) {
    return;
  }
  puVar7 = &uStack0000000000000060;
  plVar8 = plStack_110;
  lVar10 = lStack_118;
  lVar17 = lStack_120;
  puVar16 = unaff_x29;
  goto code_r0x00187bd4;
}

