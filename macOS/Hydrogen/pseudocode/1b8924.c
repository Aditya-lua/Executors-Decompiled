
void FUN_001b8924(void)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  long *unaff_x19;
  long unaff_x21;
  undefined1 uStack0000000000000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  
  func_0x001aa8bc(&uStack0000000000000008);
  lVar3 = in_stack_00000030;
  lVar2 = uStack0000000000000028;
  if ((in_stack_00000020 & 1) == 0) {
    in_stack_00000020 = unaff_x21 + -2;
    if (in_stack_00000018 < in_stack_00000010) {
      *(undefined1 *)(unaff_x19 + 1) = 0xf;
      unaff_x19[2] = (long)&UNK_0081e0b0;
      unaff_x19[3] = 0x10;
      *unaff_x19 = -0x7ffffffffffffffc;
      uVar1 = unaff_x21 + 0x7ffffffffffffffd;
      if (2 < uVar1) {
        uVar1 = 3;
      }
      if ((long)uVar1 < 2) {
        if (uVar1 != 0) {
          func_0x0016c818(&uStack0000000000000028);
          if (lVar2 == 0) {
            return;
          }
          func_0x00187bd4(lVar3,lVar2 * 0x18,8);
          return;
        }
      }
      else if (uVar1 != 2) {
        if (in_stack_00000020 == 0) {
          return;
        }
        func_0x00187bd4(uStack0000000000000028,in_stack_00000020,1);
        return;
      }
      if (uStack0000000000000028 != 0) {
        func_0x00187bd4(in_stack_00000030,uStack0000000000000028 << 2,2);
      }
    }
    else {
      unaff_x19[1] = uStack0000000000000028;
      *unaff_x19 = in_stack_00000020;
      unaff_x19[3] = in_stack_00000038;
      unaff_x19[2] = in_stack_00000030;
    }
  }
  else {
    unaff_x19[2] = in_stack_00000030;
    unaff_x19[3] = in_stack_00000038;
    *unaff_x19 = unaff_x21;
    unaff_x19[1] = uStack0000000000000028;
  }
  return;
}

