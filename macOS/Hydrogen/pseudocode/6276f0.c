
void FUN_006276f0(void)

{
  long lVar1;
  undefined1 in_ZR;
  int iVar2;
  ulong uVar3;
  ulong unaff_x20;
  ulong unaff_x21;
  ulong unaff_x23;
  long unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  ulong unaff_x27;
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
  
  do {
    if (!(bool)in_ZR && unaff_x24 != 0) {
      _memcpy(unaff_x25 + unaff_x26,unaff_x24,unaff_x20);
    }
    unaff_x26 = unaff_x20 + unaff_x26;
    if (unaff_x21 <= unaff_x26) {
      do {
        func_0x005fef78(&uStack0000000000000028,unaff_x25,unaff_x27,0,1);
        unaff_x27 = in_stack_00000068;
        lVar1 = in_stack_00000068 * 8 - unaff_x23;
        if (unaff_x23 <= in_stack_00000068 * 8 && lVar1 != 0) {
          func_0x006078e0(&uStack0000000000000028,lVar1);
        }
        func_0x005ffccc();
        uStack0000000000000028 = (undefined *)in_stack_00000008;
        uVar3 = in_stack_00000038;
        if (in_stack_00000040 <= in_stack_00000038) {
          uVar3 = in_stack_00000040;
        }
        if (in_stack_00000048 != 0) {
          if (uVar3 != 0) {
            do {
              *(undefined8 *)(in_stack_00000048 + -8 + uVar3 * 8) = 0;
              uVar3 = uVar3 - 1;
            } while (uVar3 != 0);
          }
          func_0x00611644();
        }
        func_0x005fe1e8(&uStack0000000000000028,0);
        iVar2 = func_0x00609ec8();
        if (iVar2 < 1) {
          uStack0000000000000028 = &UNK_009f5d60;
          uVar3 = in_stack_00000038;
          if (in_stack_00000040 <= in_stack_00000038) {
            uVar3 = in_stack_00000040;
          }
          if (in_stack_00000048 != 0) {
            if (uVar3 != 0) {
              do {
                *(undefined8 *)(in_stack_00000048 + -8 + uVar3 * 8) = 0;
                uVar3 = uVar3 - 1;
              } while (uVar3 != 0);
            }
            func_0x00611644();
          }
        }
        else {
          iVar2 = func_0x00609ec8();
          uStack0000000000000028 = &UNK_009f5d60;
          uVar3 = in_stack_00000038;
          if (in_stack_00000040 <= in_stack_00000038) {
            uVar3 = in_stack_00000040;
          }
          if (in_stack_00000048 != 0) {
            if (uVar3 != 0) {
              do {
                *(undefined8 *)(in_stack_00000048 + -8 + uVar3 * 8) = 0;
                uVar3 = uVar3 - 1;
              } while (uVar3 != 0);
            }
            func_0x00611644();
          }
          if (iVar2 < 0) {
            uVar3 = in_stack_00000060;
            if (unaff_x27 <= in_stack_00000060) {
              uVar3 = unaff_x27;
            }
            if (unaff_x25 != 0) {
              if (uVar3 != 0) {
                do {
                  *(undefined1 *)(unaff_x25 + -1 + uVar3) = 0;
                  uVar3 = uVar3 - 1;
                } while (uVar3 != 0);
              }
              func_0x00611644(unaff_x25);
            }
            uVar3 = in_stack_00000080;
            if (in_stack_00000088 <= in_stack_00000080) {
              uVar3 = in_stack_00000088;
            }
            if (in_stack_00000090 != 0) {
              if (uVar3 != 0) {
                do {
                  *(undefined1 *)(in_stack_00000090 + -1 + uVar3) = 0;
                  uVar3 = uVar3 - 1;
                } while (uVar3 != 0);
              }
              func_0x00611644();
            }
            uVar3 = in_stack_000000a0;
            if (in_stack_000000a8 <= in_stack_000000a0) {
              uVar3 = in_stack_000000a8;
            }
            if (in_stack_000000b0 != 0) {
              if (uVar3 != 0) {
                do {
                  *(undefined1 *)(in_stack_000000b0 + -1 + uVar3) = 0;
                  uVar3 = uVar3 - 1;
                } while (uVar3 != 0);
              }
              func_0x00611644();
            }
            lVar1 = *(long *)(unaff_x29 + -0x80);
            uVar3 = *(ulong *)(unaff_x29 + -0x90);
            if (*(ulong *)(unaff_x29 + -0x88) <= *(ulong *)(unaff_x29 + -0x90)) {
              uVar3 = *(ulong *)(unaff_x29 + -0x88);
            }
            if (lVar1 != 0) {
              if (uVar3 != 0) {
                do {
                  *(undefined1 *)(lVar1 + -1 + uVar3) = 0;
                  uVar3 = uVar3 - 1;
                } while (uVar3 != 0);
              }
              func_0x00611644();
            }
            lVar1 = *(long *)(unaff_x29 + -0x60);
            uVar3 = *(ulong *)(unaff_x29 + -0x70);
            if (*(ulong *)(unaff_x29 + -0x68) <= *(ulong *)(unaff_x29 + -0x70)) {
              uVar3 = *(ulong *)(unaff_x29 + -0x68);
            }
            if (lVar1 != 0) {
              if (uVar3 != 0) {
                do {
                  *(undefined1 *)(lVar1 + -1 + uVar3) = 0;
                  uVar3 = uVar3 - 1;
                } while (uVar3 != 0);
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
      } while ((int)unaff_x23 == 0);
      unaff_x26 = 0;
    }
    func_0x00680f00();
    unaff_x24 = in_stack_000000b0;
    uVar3 = in_stack_000000a8;
    func_0x00681044();
    unaff_x20 = in_stack_00000068 - unaff_x26;
    if (uVar3 <= in_stack_00000068 - unaff_x26) {
      unaff_x20 = uVar3;
    }
    in_ZR = in_stack_00000070 == 0;
    unaff_x25 = in_stack_00000070;
    unaff_x27 = in_stack_00000068;
  } while( true );
}

