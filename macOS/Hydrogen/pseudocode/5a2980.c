
void FUN_005a2980(long param_1)

{
  ulong uVar1;
  ulong uVar2;
  char cVar3;
  char cVar4;
  long lVar5;
  long *plVar6;
  long *unaff_x19;
  long unaff_x21;
  long unaff_x23;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  uint in_stack_00000030;
  long in_stack_00000038;
  ulong in_stack_00000040;
  long in_stack_00000048;
  uint in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  
  do {
    if (param_1 == 0) {
      if ((in_stack_00000070 != 0) && (in_stack_00000080 != 0)) {
        func_0x00187bd4(in_stack_00000070,in_stack_00000080 << 3,8);
      }
      if ((in_stack_00000090 != 0) && (in_stack_000000a0 != 0)) {
        func_0x00187bd4(in_stack_00000090,in_stack_000000a0 << 3,8);
      }
      unaff_x19[1] = in_stack_00000010;
      *unaff_x19 = uStack0000000000000008;
      unaff_x19[2] = in_stack_00000018;
      return;
    }
    if (unaff_x21 == uStack0000000000000008) {
      uVar1 = 0;
      if (in_stack_00000070 != 0) {
        uVar1 = (ulong)(in_stack_00000088 - in_stack_00000078) >> 3;
      }
      uVar2 = 0;
      if (in_stack_00000090 != 0) {
        uVar2 = (ulong)(in_stack_000000a8 - in_stack_00000098) >> 3;
      }
      if (uStack0000000000000020 == 2) {
LAB_005a2a2c:
        cVar3 = '\0';
        if (in_stack_00000040 == 2) {
LAB_005a2a78:
          cVar4 = '\0';
        }
        else {
LAB_005a2a3c:
          if ((in_stack_00000040 & 1) == 0) {
            if ((in_stack_00000050 & 1) == 0) goto LAB_005a2a78;
            cVar4 = in_stack_00000058 != 0;
          }
          else {
            cVar4 = in_stack_00000048 != 0;
            if (((in_stack_00000050 & 1) != 0) && (in_stack_00000058 != 0)) {
              cVar4 = cVar4 + '\x01';
            }
          }
        }
        plVar6 = (long *)(unaff_x29 + -0x58);
        lVar5 = 0;
        if ((cVar4 == '\0' && cVar3 == '\0') &&
           (in_stack_00000060 == 0 || in_stack_00000068 == in_stack_00000060)) goto LAB_005a2aa0;
      }
      else {
        if (uStack0000000000000020 != 3) {
          if ((uStack0000000000000020 & 1) == 0) {
            if ((in_stack_00000030 & 1) == 0) goto LAB_005a2a2c;
            cVar3 = in_stack_00000038 != 0;
          }
          else {
            cVar3 = in_stack_00000028 != 0;
            if (((in_stack_00000030 & 1) != 0) && (in_stack_00000038 != 0)) {
              cVar3 = cVar3 + '\x01';
            }
          }
          if (in_stack_00000040 != 2) goto LAB_005a2a3c;
          goto LAB_005a2a78;
        }
LAB_005a2aa0:
        plVar6 = (long *)(unaff_x29 + -0x60);
        lVar5 = uVar2 + uVar1;
      }
      *plVar6 = lVar5;
      func_0x007af5a0(&uStack0000000000000008,unaff_x21,uVar2 + uVar1 + 1,8,8);
      unaff_x23 = in_stack_00000010;
    }
    *(long *)(unaff_x23 + unaff_x21 * 8) = param_1;
    unaff_x21 = unaff_x21 + 1;
    in_stack_00000018 = unaff_x21;
    param_1 = func_0x0059c700(&uStack0000000000000020);
  } while( true );
}

