
undefined8 FUN_00637d88(ulong param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  ulong in_x9;
  undefined8 uVar3;
  int unaff_w20;
  long unaff_x24;
  long unaff_x29;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  if (in_x9 <= param_1) {
    param_1 = in_x9;
  }
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 - 1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000048 <= in_stack_00000040) {
    in_stack_00000040 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (in_stack_00000040 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + in_stack_00000040 * 8) = 0;
        in_stack_00000040 = in_stack_00000040 - 1;
      } while (in_stack_00000040 != 0);
    }
    func_0x00611644();
  }
  if (unaff_w20 == 0) {
    uVar3 = func_0x00637f84(unaff_x29 + -0x70);
  }
  else {
    uVar3 = 0;
  }
  *(long *)(unaff_x29 + -0xa0) = unaff_x24 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x80);
  uVar2 = *(ulong *)(unaff_x29 + -0x90);
  if (*(ulong *)(unaff_x29 + -0x88) <= *(ulong *)(unaff_x29 + -0x90)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x88);
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0x70) = unaff_x24 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x50);
  uVar2 = *(ulong *)(unaff_x29 + -0x60);
  if (*(ulong *)(unaff_x29 + -0x58) <= *(ulong *)(unaff_x29 + -0x60)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x58);
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  return uVar3;
}

