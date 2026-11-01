
void FUN_00596844(void)

{
  long *extraout_x10;
  long *plVar1;
  long extraout_x11;
  ulong uVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  long *unaff_x22;
  long unaff_x23;
  long unaff_x25;
  undefined8 *unaff_x26;
  undefined8 unaff_x27;
  long lVar4;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  long *in_stack_00000020;
  long in_stack_00000028;
  long *in_stack_00000030;
  ulong in_stack_00000038;
  long *in_stack_00000040;
  long in_stack_00000048;
  ulong in_stack_00000050;
  
  do {
    uStack0000000000000010 = 0;
    while( true ) {
      unaff_x26[1] = in_stack_00000008;
      *unaff_x26 = in_stack_00000000;
      unaff_x26[2] = uStack0000000000000010;
      unaff_x23 = unaff_x23 + 1;
      unaff_x26 = unaff_x26 + 3;
      unaff_x19 = unaff_x19 + 4;
      unaff_x25 = unaff_x25 + -1;
      if (unaff_x25 == 0) {
        *unaff_x22 = unaff_x23;
        return;
      }
      func_0x005763e4(unaff_x20 + 0x20,unaff_x19);
      func_0x00491a68(&uStack0000000000000018);
      if (in_stack_00000020 == (long *)0x0) break;
      if (in_stack_00000028 == 0) {
        uStack0000000000000018 = 0;
        plVar1 = extraout_x10;
        lVar3 = extraout_x11;
      }
      else {
        uVar2 = in_stack_00000028 * 4 + 0xbU & 0xfffffffffffffff8;
        plVar1 = (long *)(in_stack_00000028 + uVar2 + 9);
        lVar3 = (long)in_stack_00000020 - uVar2;
        uStack0000000000000018 = 8;
      }
      lVar4 = *in_stack_00000020;
      in_stack_00000040 = in_stack_00000020 + 1;
      in_stack_00000048 = (long)in_stack_00000020 + in_stack_00000028 + 1;
      in_stack_00000050 = in_stack_00000038;
      in_stack_00000030 = in_stack_00000020;
      in_stack_00000020 = plVar1;
      in_stack_00000028 = lVar3;
      in_stack_00000038 =
           CONCAT17(-(-1 < lVar4),
                    CONCAT16(-(-1 < (char)((ulong)lVar4 >> 0x30)),
                             CONCAT15(-(-1 < (char)((ulong)lVar4 >> 0x28)),
                                      CONCAT14(-(-1 < (char)((ulong)lVar4 >> 0x20)),
                                               CONCAT13(-(-1 < (char)((ulong)lVar4 >> 0x18)),
                                                        CONCAT12(-(-1 < (char)((ulong)lVar4 >> 0x10)
                                                                  ),CONCAT11(-(-1 < (char)((ulong)
                                                  lVar4 >> 8)),-(-1 < (char)lVar4)))))))) &
           0x8080808080808080;
      func_0x0055a688(&uStack0000000000000018);
    }
    in_stack_00000000 = 0;
    in_stack_00000008 = unaff_x27;
  } while( true );
}

