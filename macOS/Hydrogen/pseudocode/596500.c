
/* WARNING: Possible PIC construction at 0x005963e8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00596528: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005965d0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005964cc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005965d4) */
/* WARNING: Removing unreachable block (ram,0x005964d0) */
/* WARNING: Removing unreachable block (ram,0x005964dc) */
/* WARNING: Removing unreachable block (ram,0x005964e0) */

void FUN_00596500(undefined8 param_1,long param_2)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  undefined1 in_ZR;
  undefined8 *puVar5;
  undefined8 extraout_x1;
  undefined8 uVar6;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  long *plVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  ulong unaff_x20;
  long unaff_x22;
  long unaff_x24;
  long *plVar11;
  long lVar12;
  long unaff_x26;
  long *plVar13;
  long unaff_x27;
  ulong uVar14;
  long unaff_x29;
  undefined *puVar15;
  long lVar16;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000030;
  long *in_stack_00000038;
  long in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  long in_stack_00000180;
  undefined *in_stack_00000188;
  undefined1 uStack0000000000000190;
  
code_r0x00596500:
  if ((bool)in_ZR || param_2 == 0) {
    do {
      in_stack_000000a8 = *(undefined8 *)(unaff_x22 + 0x18);
      uStack00000000000000a0 = *(undefined8 *)(unaff_x22 + 0x10);
      in_stack_000000b8 = *(undefined8 *)(unaff_x22 + 0x28);
      in_stack_000000b0 = *(undefined8 *)(unaff_x22 + 0x20);
      in_stack_000000c8 = *(undefined8 *)(unaff_x22 + 0x38);
      in_stack_000000c0 = *(undefined8 *)(unaff_x22 + 0x30);
      in_stack_000000d8 = *(undefined8 *)(unaff_x22 + 0x48);
      in_stack_000000d0 = *(undefined8 *)(unaff_x22 + 0x40);
      func_0x00562cf8(unaff_x29 + -0x98,in_stack_00000008,unaff_x20,&uStack00000000000000a0);
      plVar11 = *(long **)(unaff_x29 + -0x98);
      uVar6 = extraout_x1;
      if (plVar11 != (long *)0x0) {
        lVar10 = *(long *)(unaff_x29 + -0x90);
        if (lVar10 != 0) {
          lVar12 = *(long *)(unaff_x29 + -0x80);
          if (lVar12 != 0) {
            plVar13 = plVar11 + 1;
            lVar16 = *plVar11;
            uVar14 = CONCAT17(-(-1 < lVar16),
                              CONCAT16(-(-1 < (char)((ulong)lVar16 >> 0x30)),
                                       CONCAT15(-(-1 < (char)((ulong)lVar16 >> 0x28)),
                                                CONCAT14(-(-1 < (char)((ulong)lVar16 >> 0x20)),
                                                         CONCAT13(-(-1 < (char)((ulong)lVar16 >>
                                                                               0x18)),
                                                                  CONCAT12(-(-1 < (char)((ulong)
                                                  lVar16 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar16 >> 8)),
                                                           -(-1 < (char)lVar16)))))))) &
                     0x8080808080808080;
            do {
              while (uVar14 == 0) {
                lVar16 = *plVar13;
                plVar11 = plVar11 + -8;
                plVar13 = plVar13 + 1;
                uVar14 = CONCAT17(-(-1 < lVar16),
                                  CONCAT16(-(-1 < (char)((ulong)lVar16 >> 0x30)),
                                           CONCAT15(-(-1 < (char)((ulong)lVar16 >> 0x28)),
                                                    CONCAT14(-(-1 < (char)((ulong)lVar16 >> 0x20)),
                                                             CONCAT13(-(-1 < (char)((ulong)lVar16 >>
                                                                                   0x18)),
                                                                      CONCAT12(-(-1 < (char)((ulong)
                                                  lVar16 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar16 >> 8)),
                                                           -(-1 < (char)lVar16)))))))) &
                         0x8080808080808080;
              }
              uVar3 = (uVar14 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                      (uVar14 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
              plVar7 = *(long **)((long)plVar11 +
                                 (-8 - (LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) & 0x78U)));
              lVar16 = *plVar7;
              *plVar7 = lVar16 + unaff_x24;
              LORelease();
              if (lVar16 == 1) {
                func_0x005d2ac4();
              }
              uVar14 = uVar14 - 1 & uVar14;
              lVar12 = lVar12 + -1;
            } while (lVar12 != 0);
          }
          param_2 = lVar10 * 9 + 0x11;
          uVar6 = 0;
          if (param_2 != 0) {
            lVar10 = *(long *)(unaff_x29 + -0x98) + lVar10 * -8 + -8;
            lVar12 = 8;
            puVar15 = &UNK_0059652c;
            goto code_r0x00187bd4;
          }
        }
        lVar10 = *(long *)(unaff_x29 + -0x70);
        if (lVar10 != 0) {
          lVar12 = *(long *)(unaff_x29 + -0x60);
          if (lVar12 != 0) {
            plVar11 = *(long **)(unaff_x29 + -0x78);
            plVar13 = plVar11 + 1;
            lVar16 = *plVar11;
            uVar14 = CONCAT17(-(-1 < lVar16),
                              CONCAT16(-(-1 < (char)((ulong)lVar16 >> 0x30)),
                                       CONCAT15(-(-1 < (char)((ulong)lVar16 >> 0x28)),
                                                CONCAT14(-(-1 < (char)((ulong)lVar16 >> 0x20)),
                                                         CONCAT13(-(-1 < (char)((ulong)lVar16 >>
                                                                               0x18)),
                                                                  CONCAT12(-(-1 < (char)((ulong)
                                                  lVar16 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar16 >> 8)),
                                                           -(-1 < (char)lVar16)))))))) &
                     0x8080808080808080;
            do {
              while (uVar14 == 0) {
                lVar16 = *plVar13;
                plVar11 = plVar11 + -8;
                plVar13 = plVar13 + 1;
                uVar14 = CONCAT17(-(-1 < lVar16),
                                  CONCAT16(-(-1 < (char)((ulong)lVar16 >> 0x30)),
                                           CONCAT15(-(-1 < (char)((ulong)lVar16 >> 0x28)),
                                                    CONCAT14(-(-1 < (char)((ulong)lVar16 >> 0x20)),
                                                             CONCAT13(-(-1 < (char)((ulong)lVar16 >>
                                                                                   0x18)),
                                                                      CONCAT12(-(-1 < (char)((ulong)
                                                  lVar16 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar16 >> 8)),
                                                           -(-1 < (char)lVar16)))))))) &
                         0x8080808080808080;
              }
              uVar3 = (uVar14 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                      (uVar14 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
              puVar5 = (undefined8 *)
                       ((long)plVar11 + (-8 - (LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) & 0x78U)));
              plVar7 = (long *)*puVar5;
              lVar16 = *plVar7;
              *plVar7 = lVar16 + unaff_x24;
              LORelease();
              if (lVar16 == 1) {
                func_0x005d2ac4(puVar5,uVar6);
                uVar6 = extraout_x1_00;
              }
              uVar14 = uVar14 - 1 & uVar14;
              lVar12 = lVar12 + -1;
            } while (lVar12 != 0);
          }
          param_2 = lVar10 * 9 + 0x11;
          uVar6 = 0;
          if (param_2 != 0) {
            lVar10 = *(long *)(unaff_x29 + -0x78) + lVar10 * -8 + -8;
            lVar12 = 8;
            puVar15 = &UNK_005965d4;
            goto code_r0x00187bd4;
          }
        }
      }
      if (in_stack_00000048 == 0) goto code_r0x00596634;
      if (in_stack_00000030 == 0) {
        plVar11 = in_stack_00000038;
        do {
          in_stack_00000038 = plVar11 + 1;
          lVar10 = *plVar11;
          in_stack_00000028 = in_stack_00000028 + -0x640;
          in_stack_00000030 =
               CONCAT17(-(-1 < lVar10),
                        CONCAT16(-(-1 < (char)((ulong)lVar10 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar10 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar10 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar10 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar10 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar10 >> 8)),-(-1 < (char)lVar10)))))))) &
               0x8080808080808080;
          plVar11 = in_stack_00000038;
        } while (in_stack_00000030 == 0);
      }
      uVar14 = (in_stack_00000030 & 0xaaaaaaaaaaaaaaaa) >> 1 |
               (in_stack_00000030 & 0x5555555555555555) << 1;
      uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
      uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
      uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
      in_stack_00000030 = in_stack_00000030 - 1 & in_stack_00000030;
      lVar8 = in_stack_00000028 +
              (long)-(int)((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3) * 200;
      in_stack_00000048 = in_stack_00000048 + -1;
      unaff_x20 = (ulong)*(uint *)(lVar8 + -200);
      lVar16 = *(long *)(lVar8 + -0xb8);
      lVar10 = *(long *)(lVar8 + -0xa0);
      lVar1 = *(long *)(lVar8 + -0x98);
      lVar12 = *(long *)(lVar8 + -0x80);
      lVar2 = *(long *)(lVar8 + -0x78);
      unaff_x26 = *(long *)(lVar8 + -0x60);
      unaff_x27 = *(long *)(lVar8 + -0x58);
      in_stack_00000088 = *(undefined8 *)(lVar8 + -0x18);
      in_stack_00000080 = *(undefined8 *)(lVar8 + -0x20);
      in_stack_00000098 = *(undefined8 *)(lVar8 + -8);
      in_stack_00000090 = *(undefined8 *)(lVar8 + -0x10);
      in_stack_00000068 = *(undefined8 *)(lVar8 + -0x38);
      in_stack_00000060 = *(undefined8 *)(lVar8 + -0x40);
      in_stack_00000078 = *(undefined8 *)(lVar8 + -0x28);
      in_stack_00000070 = *(undefined8 *)(lVar8 + -0x30);
      in_stack_00000058 = *(undefined8 *)(lVar8 + -0x48);
      in_stack_00000050 = *(undefined8 *)(lVar8 + -0x50);
      uVar14 = in_stack_00000030;
      lVar4 = in_stack_00000048;
      lVar9 = in_stack_00000028;
      plVar11 = in_stack_00000038;
      if (*(long *)(lVar8 + -0xc0) == 0) goto joined_r0x005965d8;
      lVar9 = lVar16 * 9 + 0x11;
      if (lVar16 == 0 || lVar9 == 0) {
        param_2 = lVar1 * 9 + 0x11;
        if (lVar1 != 0 && param_2 != 0) goto code_r0x005964c0;
      }
      else {
        func_0x00187bd4(*(long *)(lVar8 + -0xc0) + lVar16 * -8 + -8,lVar9,8);
        param_2 = lVar1 * 9 + 0x11;
        if (lVar1 != 0 && param_2 != 0) {
code_r0x005964c0:
          lVar10 = lVar10 + lVar1 * -8 + -8;
          lVar12 = 8;
          puVar15 = &UNK_005964d0;
          goto code_r0x00187bd4;
        }
      }
      lVar10 = lVar2 * 9 + 0x11;
      if (lVar2 != 0 && lVar10 != 0) goto code_r0x005964e4;
      param_2 = unaff_x27 * 9 + 0x11;
      if (unaff_x27 != 0 && param_2 != 0) break;
    } while( true );
  }
  lVar10 = unaff_x26 + unaff_x27 * -8 + -8;
  lVar12 = 8;
  puVar15 = &LAB_005963ec;
  goto code_r0x00187bd4;
code_r0x005964e4:
  func_0x00187bd4(lVar12 + lVar2 * -8 + -8,lVar10,8);
  in_ZR = unaff_x27 == 0;
  param_2 = unaff_x27 * 9 + 0x11;
  goto code_r0x00596500;
joined_r0x005965d8:
  for (; lVar4 != 0; lVar4 = lVar4 + -1) {
    while (uVar14 == 0) {
      lVar10 = *plVar11;
      lVar9 = lVar9 + -0x640;
      plVar11 = plVar11 + 1;
      uVar14 = CONCAT17(-(-1 < lVar10),
                        CONCAT16(-(-1 < (char)((ulong)lVar10 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar10 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar10 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar10 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar10 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar10 >> 8)),-(-1 < (char)lVar10)))))))) &
               0x8080808080808080;
    }
    uVar3 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
    uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
    uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
    uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
    func_0x00538fa0(lVar9 + (long)-(int)((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3) * 200 +
                    -200,uVar6);
    uVar14 = uVar14 - 1 & uVar14;
    uVar6 = extraout_x1_01;
  }
code_r0x00596634:
  if ((in_stack_00000010 == 0) || (in_stack_00000018 == 0)) {
    return;
  }
  register0x00000008 = (BADSPACEBASE *)&uStack0000000000000190;
  lVar10 = in_stack_00000020;
  param_2 = in_stack_00000018;
  lVar12 = in_stack_00000010;
  unaff_x29 = in_stack_00000180;
  puVar15 = in_stack_00000188;
code_r0x00187bd4:
  *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar15;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar10,param_2,lVar12);
  return;
}

