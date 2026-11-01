
void FUN_0047de80(long param_1)

{
  ulong uVar1;
  long *plVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  undefined8 extraout_x1_02;
  undefined8 extraout_x1_03;
  undefined8 uVar5;
  undefined8 extraout_x1_04;
  long extraout_x8;
  long *plVar6;
  long unaff_x19;
  long lVar7;
  long lVar8;
  long *plVar9;
  ulong uVar10;
  long lVar11;
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
    uVar5 = 0;
    if (param_1 + 0x29 != 0) {
      func_0x00187bd4(in_stack_00000140 + unaff_x19 * -4 + -4,param_1 + 0x29,8);
      uVar5 = extraout_x1_02;
    }
    do {
      lVar11 = in_stack_000000b8;
      if (in_stack_000000c0 != 0) {
        unaff_x19 = 0;
        lVar7 = 1 - in_stack_000000c0;
        do {
          lVar8 = **(long **)(lVar11 + unaff_x19);
          **(long **)(lVar11 + unaff_x19) = lVar8 + -1;
          LORelease();
          if (lVar8 == 1) {
            func_0x005d2ac4(lVar11 + unaff_x19,uVar5);
            uVar5 = extraout_x1_03;
          }
          unaff_x19 = unaff_x19 + 8;
          lVar7 = lVar7 + 1;
        } while (lVar7 != 1);
      }
      if (in_stack_000000b0 == 0) {
        __Unwind_Resume();
        lVar7 = 0;
        lVar8 = 1 - extraout_x8;
        do {
          lVar3 = **(long **)(lVar11 + lVar7);
          **(long **)(lVar11 + lVar7) = lVar3 + -1;
          LORelease();
          if (lVar3 == 1) {
            func_0x005d2ac4(lVar11 + lVar7);
          }
          lVar7 = lVar7 + 8;
          lVar8 = lVar8 + 1;
        } while (lVar8 != 1);
        if (in_stack_00000020 != 0) {
          func_0x00187bd4(lVar11,in_stack_00000020 << 3,8);
        }
        func_0x00479ddc(&uStack0000000000000038);
        uVar5 = extraout_x1;
        if (in_stack_00000108 != 0) {
          unaff_x19 = in_stack_00000108;
          lVar11 = in_stack_00000118;
          if (in_stack_00000118 != 0) goto code_r0x0047df5c;
          goto code_r0x0047dd88;
        }
      }
      else {
        func_0x00187bd4(lVar11,in_stack_000000b0 << 3,8);
        __Unwind_Resume();
code_r0x0047df5c:
        plVar9 = in_stack_00000100 + 1;
        lVar7 = *in_stack_00000100;
        uVar10 = CONCAT17(-(-1 < lVar7),
                          CONCAT16(-(-1 < (char)((ulong)lVar7 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar7 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar7 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar7 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar7 >>
                                                                                    0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar7 >> 8)),-(-1 < (char)lVar7)))))))) &
                 0x8080808080808080;
        plVar2 = in_stack_00000100;
        do {
          while (uVar10 == 0) {
            lVar7 = *plVar9;
            plVar2 = plVar2 + -0x10;
            plVar9 = plVar9 + 1;
            uVar10 = CONCAT17(-(-1 < lVar7),
                              CONCAT16(-(-1 < (char)((ulong)lVar7 >> 0x30)),
                                       CONCAT15(-(-1 < (char)((ulong)lVar7 >> 0x28)),
                                                CONCAT14(-(-1 < (char)((ulong)lVar7 >> 0x20)),
                                                         CONCAT13(-(-1 < (char)((ulong)lVar7 >> 0x18
                                                                               )),
                                                                  CONCAT12(-(-1 < (char)((ulong)
                                                  lVar7 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar7 >> 8)),
                                                           -(-1 < (char)lVar7)))))))) &
                     0x8080808080808080;
          }
          uVar1 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
          plVar6 = *(long **)((long)plVar2 +
                             (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U) * -2 + -0x10);
          lVar7 = *plVar6;
          *plVar6 = lVar7 + -1;
          LORelease();
          if (lVar7 == 1) {
            func_0x005d2b20();
          }
          uVar10 = uVar10 - 1 & uVar10;
          lVar11 = lVar11 + -1;
        } while (lVar11 != 0);
code_r0x0047dd88:
        lVar11 = unaff_x19 * 0x11 + 0x19;
        uVar5 = 0;
        if (lVar11 != 0) {
          func_0x00187bd4(in_stack_00000100 + unaff_x19 * -2 + -2,lVar11,8);
          uVar5 = extraout_x1_00;
        }
      }
      lVar11 = in_stack_00000128;
      if (in_stack_00000128 != 0) {
        if (in_stack_00000138 != 0) {
          plVar9 = in_stack_00000120 + 1;
          lVar7 = *in_stack_00000120;
          uVar10 = CONCAT17(-(-1 < lVar7),
                            CONCAT16(-(-1 < (char)((ulong)lVar7 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar7 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar7 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar7 >> 0x18))
                                                                ,CONCAT12(-(-1 < (char)((ulong)lVar7
                                                                                       >> 0x10)),
                                                                          CONCAT11(-(-1 < (char)((
                                                  ulong)lVar7 >> 8)),-(-1 < (char)lVar7)))))))) &
                   0x8080808080808080;
          plVar2 = in_stack_00000120;
          lVar7 = in_stack_00000138;
          do {
            while (uVar10 == 0) {
              lVar8 = *plVar9;
              plVar2 = plVar2 + -0x10;
              plVar9 = plVar9 + 1;
              uVar10 = CONCAT17(-(-1 < lVar8),
                                CONCAT16(-(-1 < (char)((ulong)lVar8 >> 0x30)),
                                         CONCAT15(-(-1 < (char)((ulong)lVar8 >> 0x28)),
                                                  CONCAT14(-(-1 < (char)((ulong)lVar8 >> 0x20)),
                                                           CONCAT13(-(-1 < (char)((ulong)lVar8 >>
                                                                                 0x18)),
                                                                    CONCAT12(-(-1 < (char)((ulong)
                                                  lVar8 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar8 >> 8)),
                                                           -(-1 < (char)lVar8)))))))) &
                       0x8080808080808080;
            }
            uVar1 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
            uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
            puVar4 = (undefined8 *)
                     ((long)plVar2 + (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U) * -2 + -8);
            plVar6 = (long *)*puVar4;
            lVar8 = *plVar6;
            *plVar6 = lVar8 + -1;
            LORelease();
            if (lVar8 == 1) {
              func_0x005d2ac4(puVar4,uVar5);
              uVar5 = extraout_x1_04;
            }
            uVar10 = uVar10 - 1 & uVar10;
            lVar7 = lVar7 + -1;
          } while (lVar7 != 0);
        }
        lVar7 = lVar11 * 0x11 + 0x19;
        uVar5 = 0;
        if (lVar7 != 0) {
          func_0x00187bd4(in_stack_00000120 + lVar11 * -2 + -2,lVar7,8);
          uVar5 = extraout_x1_01;
        }
      }
      unaff_x19 = in_stack_00000148;
    } while (in_stack_00000148 == 0);
    if (in_stack_00000158 != 0) {
      plVar9 = in_stack_00000140 + 1;
      lVar11 = *in_stack_00000140;
      uVar10 = CONCAT17(-(-1 < lVar11),
                        CONCAT16(-(-1 < (char)((ulong)lVar11 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar11 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar11 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar11 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar11 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar11 >> 8)),-(-1 < (char)lVar11)))))))) &
               0x8080808080808080;
      plVar2 = in_stack_00000140;
      lVar11 = in_stack_00000158;
      do {
        while( true ) {
          while (uVar10 == 0) {
            lVar7 = *plVar9;
            plVar2 = plVar2 + -0x20;
            plVar9 = plVar9 + 1;
            uVar10 = CONCAT17(-(-1 < lVar7),
                              CONCAT16(-(-1 < (char)((ulong)lVar7 >> 0x30)),
                                       CONCAT15(-(-1 < (char)((ulong)lVar7 >> 0x28)),
                                                CONCAT14(-(-1 < (char)((ulong)lVar7 >> 0x20)),
                                                         CONCAT13(-(-1 < (char)((ulong)lVar7 >> 0x18
                                                                               )),
                                                                  CONCAT12(-(-1 < (char)((ulong)
                                                  lVar7 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar7 >> 8)),
                                                           -(-1 < (char)lVar7)))))))) &
                     0x8080808080808080;
          }
          uVar1 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
          uVar1 = LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78;
          lVar7 = *(long *)((long)plVar2 + uVar1 * -4 + -0x18);
          if (-0x7ffffffffffffffc < lVar7 && lVar7 != 0) break;
          uVar10 = uVar10 - 1 & uVar10;
          lVar11 = lVar11 + -1;
          if (lVar11 == 0) goto code_r0x0047de7c;
        }
        func_0x00187bd4(*(undefined8 *)((long)plVar2 + uVar1 * -4 + -0x10),lVar7,1);
        uVar10 = uVar10 - 1 & uVar10;
        lVar11 = lVar11 + -1;
      } while (lVar11 != 0);
    }
code_r0x0047de7c:
    param_1 = unaff_x19 * 0x21;
  } while( true );
}

