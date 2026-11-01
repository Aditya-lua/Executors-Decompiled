
void FUN_005d5f18(long param_1)

{
  ulong uVar1;
  long *plVar2;
  long lVar3;
  uint unaff_w19;
  uint unaff_w21;
  long unaff_x22;
  long unaff_x23;
  long *plVar4;
  long *plVar5;
  long unaff_x27;
  ulong uVar6;
  long lVar7;
  long in_stack_00000048;
  
  do {
    func_0x0059f3f0(param_1);
    if (*(long *)(unaff_x27 + 0x30) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x27 + 0x38),*(long *)(unaff_x27 + 0x30) * 0x30,8);
    }
    do {
      if ((unaff_w19 & 1) != 0) {
        func_0x005ad740(unaff_x27 + 0x98);
      }
      __Unwind_Resume();
      plVar4 = *(long **)(in_stack_00000048 + 0x78);
      plVar5 = plVar4 + 1;
      lVar7 = *plVar4;
      uVar6 = CONCAT17(-(-1 < lVar7),
                       CONCAT16(-(-1 < (char)((ulong)lVar7 >> 0x30)),
                                CONCAT15(-(-1 < (char)((ulong)lVar7 >> 0x28)),
                                         CONCAT14(-(-1 < (char)((ulong)lVar7 >> 0x20)),
                                                  CONCAT13(-(-1 < (char)((ulong)lVar7 >> 0x18)),
                                                           CONCAT12(-(-1 < (char)((ulong)lVar7 >>
                                                                                 0x10)),
                                                                    CONCAT11(-(-1 < (char)((ulong)
                                                  lVar7 >> 8)),-(-1 < (char)lVar7)))))))) &
              0x8080808080808080;
      do {
        while (uVar6 == 0) {
          lVar7 = *plVar5;
          plVar4 = plVar4 + -0x10;
          plVar5 = plVar5 + 1;
          uVar6 = CONCAT17(-(-1 < lVar7),
                           CONCAT16(-(-1 < (char)((ulong)lVar7 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar7 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar7 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar7 >> 0x18)),
                                                               CONCAT12(-(-1 < (char)((ulong)lVar7
                                                                                     >> 0x10)),
                                                                        CONCAT11(-(-1 < (char)((
                                                  ulong)lVar7 >> 8)),-(-1 < (char)lVar7)))))))) &
                  0x8080808080808080;
        }
        uVar1 = (uVar6 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar6 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
        plVar2 = *(long **)((long)plVar4 +
                           (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U) * -2 + -0x10);
        lVar7 = *plVar2;
        *plVar2 = lVar7 + -1;
        LORelease();
        if (lVar7 == 1) {
          func_0x005d2c74();
        }
        uVar6 = uVar6 - 1 & uVar6;
        unaff_x23 = unaff_x23 + -1;
      } while (unaff_x23 != 0);
      lVar7 = unaff_x22 * 0x11 + 0x19;
      if (lVar7 != 0) {
        func_0x00187bd4(*(long *)(in_stack_00000048 + 0x78) + unaff_x22 * -0x10 + -0x10,lVar7,8);
      }
      func_0x005d3ef4(in_stack_00000048);
      unaff_x27 = in_stack_00000048;
    } while ((unaff_w21 & 1) == 0);
    lVar7 = *(long *)(in_stack_00000048 + 0x50);
    if (lVar7 != 0) {
      lVar3 = lVar7 * 8 + 8;
      func_0x00187bd4(*(long *)(in_stack_00000048 + 0x48) - lVar3,lVar7 + lVar3 + 9,8);
    }
    param_1 = in_stack_00000048 + 0x30;
  } while( true );
}

