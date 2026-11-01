
void FUN_005520f4(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  ulong uVar2;
  long *unaff_x19;
  ulong unaff_x20;
  uint unaff_w22;
  ulong unaff_x23;
  long lVar3;
  long *plVar4;
  long *plVar5;
  undefined8 unaff_x28;
  long lVar6;
  ulong in_stack_00000038;
  ulong in_stack_00000090;
  undefined8 uStack00000000000000a0;
  long *in_stack_000000a8;
  undefined8 uStack00000000000000b8;
  
  func_0x00187bd4(param_1,param_2,4);
  if (((in_stack_00000038 < 3) && (uStack00000000000000a0 != 2)) &&
     (func_0x005ec378(&uStack00000000000000a0,&uStack00000000000000b8),
     unaff_x20 = uStack00000000000000a0, uStack00000000000000a0 != 2)) goto LAB_00552440;
  do {
    lVar1 = unaff_x19[4];
    if (lVar1 == 0) {
      lVar1 = *unaff_x19;
      if (lVar1 != 0) goto LAB_00552178;
LAB_00552140:
      lVar1 = unaff_x19[0x14];
    }
    else {
      lVar3 = lVar1 * 8 + 8;
      func_0x00187bd4(unaff_x19[3] - lVar3,lVar1 + lVar3 + 9,8);
      lVar1 = *unaff_x19;
      if (lVar1 == 0) goto LAB_00552140;
LAB_00552178:
      func_0x00187bd4(unaff_x19[1],lVar1 << 4,8);
      lVar1 = unaff_x19[0x14];
    }
    if (lVar1 != 0) {
      lVar3 = unaff_x19[0x16];
      if (lVar3 != 0) {
        plVar4 = (long *)unaff_x19[0x13];
        plVar5 = plVar4 + 1;
        lVar6 = *plVar4;
        unaff_x20 = CONCAT17(-(-1 < lVar6),
                             CONCAT16(-(-1 < (char)((ulong)lVar6 >> 0x30)),
                                      CONCAT15(-(-1 < (char)((ulong)lVar6 >> 0x28)),
                                               CONCAT14(-(-1 < (char)((ulong)lVar6 >> 0x20)),
                                                        CONCAT13(-(-1 < (char)((ulong)lVar6 >> 0x18)
                                                                  ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar6 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar6 >> 8)),
                                                           -(-1 < (char)lVar6)))))))) &
                    0x8080808080808080;
        do {
          while (unaff_x20 == 0) {
            lVar6 = *plVar5;
            plVar4 = plVar4 + -0x28;
            plVar5 = plVar5 + 1;
            unaff_x20 = CONCAT17(-(-1 < lVar6),
                                 CONCAT16(-(-1 < (char)((ulong)lVar6 >> 0x30)),
                                          CONCAT15(-(-1 < (char)((ulong)lVar6 >> 0x28)),
                                                   CONCAT14(-(-1 < (char)((ulong)lVar6 >> 0x20)),
                                                            CONCAT13(-(-1 < (char)((ulong)lVar6 >>
                                                                                  0x18)),
                                                                     CONCAT12(-(-1 < (char)((ulong)
                                                  lVar6 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar6 >> 8)),
                                                           -(-1 < (char)lVar6)))))))) &
                        0x8080808080808080;
          }
          uVar2 = (unaff_x20 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                  (unaff_x20 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
          func_0x0053a3f4(plVar4 + (long)-(int)((ulong)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) >> 3)
                                   * 5 + -4);
          unaff_x20 = unaff_x20 - 1 & unaff_x20;
          lVar3 = lVar3 + -1;
        } while (lVar3 != 0);
      }
      lVar3 = lVar1 * 0x29 + 0x31;
      if (lVar3 != 0) {
        func_0x00187bd4(unaff_x19[0x13] + lVar1 * -0x28 + -0x28,lVar3,8);
      }
    }
    lVar1 = unaff_x19[0x18];
    if (lVar1 != 0) {
      uVar2 = lVar1 * 4 + 0xbU & 0xfffffffffffffff8;
      lVar1 = lVar1 + uVar2 + 9;
      if (lVar1 != 0) {
        func_0x00187bd4(unaff_x19[0x17] - uVar2,lVar1,8);
      }
    }
    lVar1 = unaff_x19[0x1c];
    if (lVar1 != 0) {
      uVar2 = lVar1 * 4 + 0xbU & 0xfffffffffffffff8;
      lVar1 = lVar1 + uVar2 + 9;
      if (lVar1 != 0) {
        func_0x00187bd4(unaff_x19[0x1b] - uVar2,lVar1,8);
      }
    }
    lVar1 = unaff_x19[0x20];
    if (lVar1 != 0) {
      lVar3 = unaff_x19[0x22];
      if (lVar3 != 0) {
        plVar4 = (long *)unaff_x19[0x1f];
        plVar5 = plVar4 + 1;
        lVar6 = *plVar4;
        unaff_x20 = CONCAT17(-(-1 < lVar6),
                             CONCAT16(-(-1 < (char)((ulong)lVar6 >> 0x30)),
                                      CONCAT15(-(-1 < (char)((ulong)lVar6 >> 0x28)),
                                               CONCAT14(-(-1 < (char)((ulong)lVar6 >> 0x20)),
                                                        CONCAT13(-(-1 < (char)((ulong)lVar6 >> 0x18)
                                                                  ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar6 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar6 >> 8)),
                                                           -(-1 < (char)lVar6)))))))) &
                    0x8080808080808080;
        do {
          while (unaff_x20 == 0) {
            lVar6 = *plVar5;
            plVar4 = plVar4 + -0x28;
            plVar5 = plVar5 + 1;
            unaff_x20 = CONCAT17(-(-1 < lVar6),
                                 CONCAT16(-(-1 < (char)((ulong)lVar6 >> 0x30)),
                                          CONCAT15(-(-1 < (char)((ulong)lVar6 >> 0x28)),
                                                   CONCAT14(-(-1 < (char)((ulong)lVar6 >> 0x20)),
                                                            CONCAT13(-(-1 < (char)((ulong)lVar6 >>
                                                                                  0x18)),
                                                                     CONCAT12(-(-1 < (char)((ulong)
                                                  lVar6 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar6 >> 8)),
                                                           -(-1 < (char)lVar6)))))))) &
                        0x8080808080808080;
          }
          uVar2 = (unaff_x20 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                  (unaff_x20 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
          func_0x005391bc(plVar4 + (long)-(int)((ulong)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) >> 3)
                                   * 5 + -5);
          unaff_x20 = unaff_x20 - 1 & unaff_x20;
          lVar3 = lVar3 + -1;
        } while (lVar3 != 0);
      }
      lVar3 = lVar1 * 0x29 + 0x31;
      if (lVar3 != 0) {
        func_0x00187bd4(unaff_x19[0x1f] + lVar1 * -0x28 + -0x28,lVar3,8);
      }
    }
    if (((unaff_x23 & 1) != 0) && (unaff_x23 = unaff_x19[0x24], unaff_x23 != 0)) {
      lVar1 = unaff_x19[0x26];
      if (lVar1 != 0) {
        plVar4 = (long *)unaff_x19[0x23];
        plVar5 = plVar4 + 1;
        lVar3 = *plVar4;
        unaff_x20 = CONCAT17(-(-1 < lVar3),
                             CONCAT16(-(-1 < (char)((ulong)lVar3 >> 0x30)),
                                      CONCAT15(-(-1 < (char)((ulong)lVar3 >> 0x28)),
                                               CONCAT14(-(-1 < (char)((ulong)lVar3 >> 0x20)),
                                                        CONCAT13(-(-1 < (char)((ulong)lVar3 >> 0x18)
                                                                  ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar3 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar3 >> 8)),
                                                           -(-1 < (char)lVar3)))))))) &
                    0x8080808080808080;
        do {
          while (unaff_x20 == 0) {
            lVar3 = *plVar5;
            plVar4 = plVar4 + -0x28;
            plVar5 = plVar5 + 1;
            unaff_x20 = CONCAT17(-(-1 < lVar3),
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
          uVar2 = (unaff_x20 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                  (unaff_x20 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
          func_0x0053908c(plVar4 + (long)-(int)((ulong)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) >> 3)
                                   * 5 + -5);
          unaff_x20 = unaff_x20 - 1 & unaff_x20;
          lVar1 = lVar1 + -1;
        } while (lVar1 != 0);
      }
      lVar1 = unaff_x23 * 0x29 + 0x31;
      if (lVar1 != 0) {
        func_0x00187bd4(unaff_x19[0x23] + unaff_x23 * -0x28 + -0x28,lVar1,8);
      }
    }
    func_0x0053a3f4(unaff_x19 + 0x27);
    func_0x0053a3f4(unaff_x19 + 0x2b);
    if ((unaff_w22 & 1) != 0) {
      lVar1 = unaff_x19[0xd];
      if (lVar1 != 0) {
        lVar3 = lVar1 * 8 + 8;
        func_0x00187bd4(unaff_x19[0xc] - lVar3,lVar1 + lVar3 + 9,8);
      }
      func_0x00557b34(unaff_x19 + 9);
      if (unaff_x19[9] != 0) {
        func_0x00187bd4(unaff_x19[10],unaff_x19[9] * 0x30,8);
      }
    }
    if ((in_stack_00000090 & 1) != 0) {
      func_0x0053b118(unaff_x19 + 0x2f);
    }
    __Unwind_Resume(unaff_x28);
LAB_00552440:
    func_0x005ec3ac(&uStack00000000000000a0,uStack00000000000000b8);
    if (unaff_x20 != 0) {
      lVar1 = *in_stack_000000a8;
      *in_stack_000000a8 = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        DataMemoryBarrier(2,1);
        func_0x005e80f0((ulong)&uStack00000000000000a0 | 8);
      }
    }
  } while( true );
}

