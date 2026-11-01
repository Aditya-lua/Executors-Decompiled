
void FUN_004aa9e4(long *param_1)

{
  long in_x9;
  long extraout_x10;
  long in_x10;
  long extraout_x11;
  ulong uVar1;
  long in_x11;
  undefined8 in_x12;
  undefined8 in_x13;
  long *unaff_x22;
  long unaff_x23;
  long unaff_x25;
  undefined8 *unaff_x26;
  undefined8 unaff_x27;
  long lVar2;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  undefined8 in_stack_00000030;
  undefined1 uStack0000000000000048;
  long lStack0000000000000050;
  long lStack0000000000000058;
  long *plStack0000000000000060;
  ulong uStack0000000000000068;
  long *plStack0000000000000070;
  long lStack0000000000000078;
  undefined8 uStack0000000000000080;
  
  plStack0000000000000060 = param_1;
  uStack0000000000000080 = in_x13;
  do {
    lVar2 = *plStack0000000000000060;
    uStack0000000000000068 =
         CONCAT17(-(-1 < lVar2),
                  CONCAT16(-(-1 < (char)((ulong)lVar2 >> 0x30)),
                           CONCAT15(-(-1 < (char)((ulong)lVar2 >> 0x28)),
                                    CONCAT14(-(-1 < (char)((ulong)lVar2 >> 0x20)),
                                             CONCAT13(-(-1 < (char)((ulong)lVar2 >> 0x18)),
                                                      CONCAT12(-(-1 < (char)((ulong)lVar2 >> 0x10)),
                                                               CONCAT11(-(-1 < (char)((ulong)lVar2
                                                                                     >> 8)),
                                                                        -(-1 < (char)lVar2)))))))) &
         0x8080808080808080;
    plStack0000000000000070 = plStack0000000000000060 + 1;
    lStack0000000000000078 = (long)plStack0000000000000060 + in_x9 + 1;
    _uStack0000000000000048 = in_x12;
    lStack0000000000000050 = in_x10;
    lStack0000000000000058 = in_x11;
    func_0x00490120(&uStack0000000000000048);
    while( true ) {
      unaff_x26[1] = in_stack_00000008;
      *unaff_x26 = in_stack_00000000;
      unaff_x26[2] = in_stack_00000010;
      unaff_x23 = unaff_x23 + 1;
      unaff_x26 = unaff_x26 + 3;
      unaff_x25 = unaff_x25 + -1;
      if (unaff_x25 == 0) {
        *unaff_x22 = unaff_x23;
        return;
      }
      func_0x0049f5a0(&uStack0000000000000018);
      if (uStack0000000000000018 != (long *)0x0) break;
      in_stack_00000000 = 0;
      in_stack_00000010 = 0;
      in_stack_00000008 = unaff_x27;
    }
    if (in_stack_00000020 == 0) {
      in_x12 = 0;
      in_x10 = extraout_x10;
      in_x11 = extraout_x11;
    }
    else {
      uVar1 = in_stack_00000020 * 4 + 0xbU & 0xfffffffffffffff8;
      in_x10 = in_stack_00000020 + uVar1 + 9;
      in_x11 = (long)uStack0000000000000018 - uVar1;
      in_x12 = 8;
    }
    plStack0000000000000060 = uStack0000000000000018;
    in_x9 = in_stack_00000020;
    uStack0000000000000080 = in_stack_00000030;
  } while( true );
}

