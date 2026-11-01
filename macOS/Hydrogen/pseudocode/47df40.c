
void FUN_0047df40(void)

{
  ulong uVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  long extraout_x8;
  long *plVar5;
  long unaff_x19;
  long unaff_x20;
  long lVar6;
  long unaff_x21;
  long unaff_x22;
  long *plVar7;
  ulong uVar8;
  long in_stack_00000020;
  undefined1 uStack0000000000000038;
  long in_stack_000000b0;
  long in_stack_000000b8;
  long in_stack_000000c0;
  long *in_stack_00000100;
  long in_stack_00000108;
  long in_stack_00000118;
  long *in_stack_00000120;
  long in_stack_00000128;
  long in_stack_00000138;
  long *in_stack_00000140;
  long in_stack_00000148;
  long in_stack_00000158;
  
  do {
    unaff_x19 = unaff_x19 + 8;
    unaff_x21 = unaff_x21 + 1;
    if (unaff_x21 == 1) {
      do {
        if (in_stack_000000b0 == 0) {
          __Unwind_Resume();
          lVar4 = 0;
          lVar6 = 1 - extraout_x8;
          do {
            lVar3 = **(long **)(unaff_x20 + lVar4);
            **(long **)(unaff_x20 + lVar4) = lVar3 + -1;
            LORelease();
            if (lVar3 == 1) {
              func_0x005d2ac4(unaff_x20 + lVar4);
            }
            lVar4 = lVar4 + 8;
            lVar6 = lVar6 + 1;
          } while (lVar6 != 1);
          if (in_stack_00000020 != 0) {
            func_0x00187bd4(unaff_x20,in_stack_00000020 << 3,8);
          }
          func_0x00479ddc(&uStack0000000000000038);
          if (in_stack_00000108 != 0) {
            unaff_x19 = in_stack_00000108;
            unaff_x20 = in_stack_00000118;
            if (in_stack_00000118 != 0) goto code_r0x0047df5c;
            goto code_r0x0047dd88;
          }
        }
        else {
          func_0x00187bd4(unaff_x20,in_stack_000000b0 << 3,8);
          __Unwind_Resume();
code_r0x0047df5c:
          plVar7 = in_stack_00000100 + 1;
          lVar4 = *in_stack_00000100;
          uVar8 = CONCAT17(-(-1 < lVar4),
                           CONCAT16(-(-1 < (char)((ulong)lVar4 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar4 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar4 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar4 >> 0x18)),
                                                               CONCAT12(-(-1 < (char)((ulong)lVar4
                                                                                     >> 0x10)),
                                                                        CONCAT11(-(-1 < (char)((
                                                  ulong)lVar4 >> 8)),-(-1 < (char)lVar4)))))))) &
                  0x8080808080808080;
          plVar2 = in_stack_00000100;
          do {
            while (uVar8 == 0) {
              lVar4 = *plVar7;
              plVar2 = plVar2 + -0x10;
              plVar7 = plVar7 + 1;
              uVar8 = CONCAT17(-(-1 < lVar4),
                               CONCAT16(-(-1 < (char)((ulong)lVar4 >> 0x30)),
                                        CONCAT15(-(-1 < (char)((ulong)lVar4 >> 0x28)),
                                                 CONCAT14(-(-1 < (char)((ulong)lVar4 >> 0x20)),
                                                          CONCAT13(-(-1 < (char)((ulong)lVar4 >>
                                                                                0x18)),
                                                                   CONCAT12(-(-1 < (char)((ulong)
                                                  lVar4 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar4 >> 8)),
                                                           -(-1 < (char)lVar4)))))))) &
                      0x8080808080808080;
            }
            uVar1 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar8 >> 7 & 0xff00ff00ff00ff) << 8;
            uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
            plVar5 = *(long **)((long)plVar2 +
                               (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U) * -2 + -0x10);
            lVar4 = *plVar5;
            *plVar5 = lVar4 + -1;
            LORelease();
            if (lVar4 == 1) {
              func_0x005d2b20();
            }
            uVar8 = uVar8 - 1 & uVar8;
            unaff_x20 = unaff_x20 + -1;
          } while (unaff_x20 != 0);
code_r0x0047dd88:
          lVar4 = unaff_x19 * 0x11 + 0x19;
          if (lVar4 != 0) {
            func_0x00187bd4(in_stack_00000100 + unaff_x19 * -2 + -2,lVar4,8);
          }
        }
        lVar4 = in_stack_00000128;
        if (in_stack_00000128 != 0) {
          if (in_stack_00000138 != 0) {
            plVar7 = in_stack_00000120 + 1;
            lVar6 = *in_stack_00000120;
            uVar8 = CONCAT17(-(-1 < lVar6),
                             CONCAT16(-(-1 < (char)((ulong)lVar6 >> 0x30)),
                                      CONCAT15(-(-1 < (char)((ulong)lVar6 >> 0x28)),
                                               CONCAT14(-(-1 < (char)((ulong)lVar6 >> 0x20)),
                                                        CONCAT13(-(-1 < (char)((ulong)lVar6 >> 0x18)
                                                                  ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar6 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar6 >> 8)),
                                                           -(-1 < (char)lVar6)))))))) &
                    0x8080808080808080;
            plVar2 = in_stack_00000120;
            lVar6 = in_stack_00000138;
            do {
              while (uVar8 == 0) {
                lVar3 = *plVar7;
                plVar2 = plVar2 + -0x10;
                plVar7 = plVar7 + 1;
                uVar8 = CONCAT17(-(-1 < lVar3),
                                 CONCAT16(-(-1 < (char)((ulong)lVar3 >> 0x30)),
                                          CONCAT15(-(-1 < (char)((ulong)lVar3 >> 0x28)),
                                                   CONCAT14(-(-1 < (char)((ulong)lVar3 >> 0x20)),
                                                            CONCAT13(-(-1 < (char)((ulong)lVar3 >>
                                                                                  0x18)),
                                                                     CONCAT12(-(-1 < (char)((ulong)
                                                  lVar3 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar3 >> 8)),
                                                           -(-1 < (char)lVar3)))))))) &
                        0x8080808080808080;
              }
              uVar1 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar8 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
              plVar5 = *(long **)((long)plVar2 +
                                 (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U) * -2 + -8);
              lVar3 = *plVar5;
              *plVar5 = lVar3 + -1;
              LORelease();
              if (lVar3 == 1) {
                func_0x005d2ac4();
              }
              uVar8 = uVar8 - 1 & uVar8;
              lVar6 = lVar6 + -1;
            } while (lVar6 != 0);
          }
          lVar6 = lVar4 * 0x11 + 0x19;
          if (lVar6 != 0) {
            func_0x00187bd4(in_stack_00000120 + lVar4 * -2 + -2,lVar6,8);
          }
        }
        unaff_x19 = in_stack_00000148;
        if (in_stack_00000148 != 0) {
          if (in_stack_00000158 != 0) {
            plVar7 = in_stack_00000140 + 1;
            lVar4 = *in_stack_00000140;
            uVar8 = CONCAT17(-(-1 < lVar4),
                             CONCAT16(-(-1 < (char)((ulong)lVar4 >> 0x30)),
                                      CONCAT15(-(-1 < (char)((ulong)lVar4 >> 0x28)),
                                               CONCAT14(-(-1 < (char)((ulong)lVar4 >> 0x20)),
                                                        CONCAT13(-(-1 < (char)((ulong)lVar4 >> 0x18)
                                                                  ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar4 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar4 >> 8)),
                                                           -(-1 < (char)lVar4)))))))) &
                    0x8080808080808080;
            plVar2 = in_stack_00000140;
            lVar4 = in_stack_00000158;
            do {
              while( true ) {
                while (uVar8 == 0) {
                  lVar6 = *plVar7;
                  plVar2 = plVar2 + -0x20;
                  plVar7 = plVar7 + 1;
                  uVar8 = CONCAT17(-(-1 < lVar6),
                                   CONCAT16(-(-1 < (char)((ulong)lVar6 >> 0x30)),
                                            CONCAT15(-(-1 < (char)((ulong)lVar6 >> 0x28)),
                                                     CONCAT14(-(-1 < (char)((ulong)lVar6 >> 0x20)),
                                                              CONCAT13(-(-1 < (char)((ulong)lVar6 >>
                                                                                    0x18)),
                                                                       CONCAT12(-(-1 < (char)((ulong
                                                  )lVar6 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar6 >> 8)),
                                                           -(-1 < (char)lVar6)))))))) &
                          0x8080808080808080;
                }
                uVar1 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                        (uVar8 >> 7 & 0xff00ff00ff00ff) << 8;
                uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
                uVar1 = LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78;
                lVar6 = *(long *)((long)plVar2 + uVar1 * -4 + -0x18);
                if (-0x7ffffffffffffffc < lVar6 && lVar6 != 0) break;
                uVar8 = uVar8 - 1 & uVar8;
                lVar4 = lVar4 + -1;
                if (lVar4 == 0) goto code_r0x0047de7c;
              }
              func_0x00187bd4(*(undefined8 *)((long)plVar2 + uVar1 * -4 + -0x10),lVar6,1);
              uVar8 = uVar8 - 1 & uVar8;
              lVar4 = lVar4 + -1;
            } while (lVar4 != 0);
          }
code_r0x0047de7c:
          lVar4 = unaff_x19 * 0x21 + 0x29;
          if (lVar4 != 0) {
            func_0x00187bd4(in_stack_00000140 + unaff_x19 * -4 + -4,lVar4,8);
          }
        }
        unaff_x20 = in_stack_000000b8;
      } while (in_stack_000000c0 == 0);
      unaff_x19 = 0;
      unaff_x21 = 1 - in_stack_000000c0;
      unaff_x22 = -1;
    }
    lVar4 = **(long **)(unaff_x20 + unaff_x19);
    **(long **)(unaff_x20 + unaff_x19) = lVar4 + unaff_x22;
    LORelease();
    if (lVar4 == 1) {
      func_0x005d2ac4(unaff_x20 + unaff_x19);
    }
  } while( true );
}

