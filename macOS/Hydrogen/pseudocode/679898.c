
byte FUN_00679898(void)

{
  byte in_CY;
  ulong uVar1;
  ulong uVar2;
  long unaff_x20;
  uint unaff_w23;
  uint unaff_w24;
  uint unaff_w25;
  long unaff_x29;
  undefined1 uStack0000000000000010;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  undefined1 uStack0000000000000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  long in_stack_00000048;
  undefined1 uStack0000000000000050;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  long in_stack_00000068;
  
  while (unaff_w25 != unaff_w24) {
    func_0x00677f58(&uStack0000000000000010,&uStack0000000000000050);
    func_0x0067997c(&uStack0000000000000030,&uStack0000000000000010);
    func_0x006771a4(&uStack0000000000000050,&uStack0000000000000030);
    uVar2 = in_stack_00000038;
    if (in_stack_00000040 <= in_stack_00000038) {
      uVar2 = in_stack_00000040;
    }
    if (in_stack_00000048 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined8 *)(in_stack_00000048 + -8 + uVar2 * 8) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
    }
    uVar2 = in_stack_00000018;
    if (in_stack_00000020 <= in_stack_00000018) {
      uVar2 = in_stack_00000020;
    }
    if (in_stack_00000028 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined8 *)(in_stack_00000028 + -8 + uVar2 * 8) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
    }
    func_0x00677494(&uStack0000000000000010,&uStack0000000000000050,unaff_x29 + -0x60);
    func_0x00679308(&uStack0000000000000030,&uStack0000000000000010);
    uVar1 = func_0x00679a64(&uStack0000000000000030);
    uVar2 = in_stack_00000038;
    if (in_stack_00000040 <= in_stack_00000038) {
      uVar2 = in_stack_00000040;
    }
    if (in_stack_00000048 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined8 *)(in_stack_00000048 + -8 + uVar2 * 8) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
    }
    uVar2 = in_stack_00000018;
    if (in_stack_00000020 <= in_stack_00000018) {
      uVar2 = in_stack_00000020;
    }
    if (in_stack_00000028 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined8 *)(in_stack_00000028 + -8 + uVar2 * 8) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
    }
    if ((uVar1 & 1) == 0) break;
    in_CY = unaff_w23 <= unaff_w25 + 1;
    unaff_w25 = unaff_w25 + 1;
  }
  uVar2 = in_stack_00000058;
  if (in_stack_00000060 <= in_stack_00000058) {
    uVar2 = in_stack_00000060;
  }
  if (in_stack_00000068 == 0) {
    uVar2 = 1;
  }
  else {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000068 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644(in_stack_00000068);
    unaff_x20 = *(long *)(unaff_x29 + -0x48);
    uVar2 = *(ulong *)(unaff_x29 + -0x58);
    if (*(ulong *)(unaff_x29 + -0x50) <= *(ulong *)(unaff_x29 + -0x58)) {
      uVar2 = *(ulong *)(unaff_x29 + -0x50);
    }
  }
  if (unaff_x20 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(unaff_x20 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644(unaff_x20);
  }
  return in_CY & 1;
}

