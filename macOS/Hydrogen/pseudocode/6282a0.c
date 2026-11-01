
void FUN_006282a0(void)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  int iVar4;
  ulong uVar5;
  ulong unaff_x21;
  ulong unaff_x23;
  long unaff_x25;
  ulong uVar6;
  long unaff_x29;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  long in_stack_00000048;
  ulong in_stack_00000060;
  ulong in_stack_00000068;
  long in_stack_00000070;
  ulong in_stack_00000080;
  ulong in_stack_00000088;
  long in_stack_00000090;
  ulong in_stack_000000a0;
  ulong in_stack_000000a8;
  long in_stack_000000b0;
  
  uVar5 = unaff_x21;
  do {
    if ((int)unaff_x23 != 0) {
      uVar6 = 0;
      do {
        func_0x00680f00();
        lVar2 = in_stack_000000b0;
        uVar3 = in_stack_000000a8;
        func_0x00681044();
        unaff_x25 = in_stack_00000070;
        uVar5 = in_stack_00000068;
        uVar1 = in_stack_00000068 - uVar6;
        if (uVar3 <= in_stack_00000068 - uVar6) {
          uVar1 = uVar3;
        }
        if (in_stack_00000070 != 0 && lVar2 != 0) {
          _memcpy(in_stack_00000070 + uVar6,lVar2,uVar1);
        }
        uVar6 = uVar1 + uVar6;
      } while (uVar6 < unaff_x21);
    }
    func_0x005fef78(&uStack0000000000000028,unaff_x25,uVar5,0,1);
    uVar5 = in_stack_00000068;
    lVar2 = in_stack_00000068 * 8 - unaff_x23;
    if (unaff_x23 <= in_stack_00000068 * 8 && lVar2 != 0) {
      func_0x006078e0(&uStack0000000000000028,lVar2);
    }
    func_0x005ffccc();
    uStack0000000000000028 = (undefined *)in_stack_00000008;
    uVar6 = in_stack_00000038;
    if (in_stack_00000040 <= in_stack_00000038) {
      uVar6 = in_stack_00000040;
    }
    if (in_stack_00000048 != 0) {
      if (uVar6 != 0) {
        do {
          *(undefined8 *)(in_stack_00000048 + -8 + uVar6 * 8) = 0;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      func_0x00611644();
    }
    func_0x005fe1e8(&uStack0000000000000028,0);
    iVar4 = func_0x00609ec8();
    if (iVar4 < 1) {
      uStack0000000000000028 = &UNK_009f5d60;
      uVar6 = in_stack_00000038;
      if (in_stack_00000040 <= in_stack_00000038) {
        uVar6 = in_stack_00000040;
      }
      if (in_stack_00000048 != 0) {
        if (uVar6 != 0) {
          do {
            *(undefined8 *)(in_stack_00000048 + -8 + uVar6 * 8) = 0;
            uVar6 = uVar6 - 1;
          } while (uVar6 != 0);
        }
        func_0x00611644();
      }
    }
    else {
      iVar4 = func_0x00609ec8();
      uStack0000000000000028 = &UNK_009f5d60;
      uVar6 = in_stack_00000038;
      if (in_stack_00000040 <= in_stack_00000038) {
        uVar6 = in_stack_00000040;
      }
      if (in_stack_00000048 != 0) {
        if (uVar6 != 0) {
          do {
            *(undefined8 *)(in_stack_00000048 + -8 + uVar6 * 8) = 0;
            uVar6 = uVar6 - 1;
          } while (uVar6 != 0);
        }
        func_0x00611644();
      }
      if (iVar4 < 0) {
        uVar6 = in_stack_00000060;
        if (uVar5 <= in_stack_00000060) {
          uVar6 = uVar5;
        }
        if (unaff_x25 != 0) {
          if (uVar6 != 0) {
            do {
              *(undefined1 *)(unaff_x25 + -1 + uVar6) = 0;
              uVar6 = uVar6 - 1;
            } while (uVar6 != 0);
          }
          func_0x00611644(unaff_x25);
        }
        uVar5 = in_stack_00000080;
        if (in_stack_00000088 <= in_stack_00000080) {
          uVar5 = in_stack_00000088;
        }
        if (in_stack_00000090 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined1 *)(in_stack_00000090 + -1 + uVar5) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644();
        }
        uVar5 = in_stack_000000a0;
        if (in_stack_000000a8 <= in_stack_000000a0) {
          uVar5 = in_stack_000000a8;
        }
        if (in_stack_000000b0 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined1 *)(in_stack_000000b0 + -1 + uVar5) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644();
        }
        lVar2 = *(long *)(unaff_x29 + -0x80);
        uVar5 = *(ulong *)(unaff_x29 + -0x90);
        if (*(ulong *)(unaff_x29 + -0x88) <= *(ulong *)(unaff_x29 + -0x90)) {
          uVar5 = *(ulong *)(unaff_x29 + -0x88);
        }
        if (lVar2 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined1 *)(lVar2 + -1 + uVar5) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644();
        }
        lVar2 = *(long *)(unaff_x29 + -0x60);
        uVar5 = *(ulong *)(unaff_x29 + -0x70);
        if (*(ulong *)(unaff_x29 + -0x68) <= *(ulong *)(unaff_x29 + -0x70)) {
          uVar5 = *(ulong *)(unaff_x29 + -0x68);
        }
        if (lVar2 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined1 *)(lVar2 + -1 + uVar5) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644();
        }
        return;
      }
    }
    func_0x00680f00();
    func_0x00680f00();
    func_0x00681044();
    func_0x005ee13c();
    func_0x00680f00();
    func_0x00681044();
  } while( true );
}

