
undefined8 FUN_0059bca8(long param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long unaff_x19;
  undefined8 uStack0000000000000008;
  undefined8 *in_stack_00000010;
  long in_stack_00000018;
  
  while( true ) {
    *(long *)(unaff_x19 + 0xa0) = param_1;
    func_0x005a54e8(&uStack0000000000000008);
    if (uStack0000000000000008 == -0x8000000000000000) break;
    *(undefined8 **)(unaff_x19 + 0x60) = in_stack_00000010;
    *(undefined8 **)(unaff_x19 + 0x68) = in_stack_00000010;
    *(long *)(unaff_x19 + 0x70) = uStack0000000000000008;
    *(undefined8 **)(unaff_x19 + 0x78) = in_stack_00000010 + in_stack_00000018;
    if (in_stack_00000010 != in_stack_00000010 + in_stack_00000018) {
      uVar1 = *in_stack_00000010;
      *(undefined8 **)(unaff_x19 + 0x68) = in_stack_00000010 + 1;
      return uVar1;
    }
    if (*(long *)(unaff_x19 + 0x70) != 0) {
      func_0x00187bd4(in_stack_00000010,*(long *)(unaff_x19 + 0x70) << 3,8);
    }
    *(undefined8 *)(unaff_x19 + 0x60) = 0;
    param_1 = *(long *)(unaff_x19 + 0xa0);
    if ((param_1 == 0) || (param_1 == *(long *)(unaff_x19 + 0xa8))) break;
    param_1 = param_1 + 0x40;
  }
  uVar1 = 0;
  if (*(long *)(unaff_x19 + 0x80) != 0) {
    puVar2 = *(undefined8 **)(unaff_x19 + 0x88);
    if (puVar2 == *(undefined8 **)(unaff_x19 + 0x98)) {
      if (*(long *)(unaff_x19 + 0x90) != 0) {
        func_0x00187bd4(*(long *)(unaff_x19 + 0x80),*(long *)(unaff_x19 + 0x90) << 3,8);
      }
      uVar1 = 0;
      *(undefined8 *)(unaff_x19 + 0x80) = 0;
    }
    else {
      uVar1 = *puVar2;
      *(undefined8 **)(unaff_x19 + 0x88) = puVar2 + 1;
    }
  }
  return uVar1;
}

