
undefined8 FUN_0063cf74(void)

{
  undefined8 uVar1;
  ulong uVar2;
  code *pcVar3;
  long *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  uint unaff_w23;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined1 uStack0000000000000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  
  uVar1 = func_0x00678e28(&uStack0000000000000028,unaff_x21 + 0x28);
  uVar2 = in_stack_00000030;
  if (in_stack_00000038 <= in_stack_00000030) {
    uVar2 = in_stack_00000038;
  }
  if (in_stack_00000040 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000040 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  uVar2 = in_stack_00000010;
  if (in_stack_00000018 <= in_stack_00000010) {
    uVar2 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  if ((1 < unaff_w23) && ((int)uVar1 != 0)) {
    (**(code **)(*unaff_x19 + 0xa0))();
    if (unaff_x20 == (long *)0x0) {
      pcVar3 = *(code **)(*unaff_x19 + 0x80);
    }
    else {
      (**(code **)(*unaff_x19 + 0x88))();
      pcVar3 = *(code **)(*unaff_x20 + 0x40);
    }
    (*pcVar3)();
    uVar1 = (**(code **)(*unaff_x19 + 0xf8))();
    uVar2 = in_stack_00000030;
    if (in_stack_00000038 <= in_stack_00000030) {
      uVar2 = in_stack_00000038;
    }
    if (in_stack_00000040 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined8 *)(in_stack_00000040 + -8 + uVar2 * 8) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
    }
    if (in_stack_00000018 <= in_stack_00000010) {
      in_stack_00000010 = in_stack_00000018;
    }
    if (in_stack_00000020 != 0) {
      if (in_stack_00000010 != 0) {
        do {
          *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
          in_stack_00000010 = in_stack_00000010 - 1;
        } while (in_stack_00000010 != 0);
      }
      func_0x00611644();
    }
  }
  return uVar1;
}

