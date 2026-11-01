
undefined8 FUN_0059c190(long param_1)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 *puVar3;
  long in_x9;
  long unaff_x19;
  undefined8 uStack0000000000000008;
  undefined8 *in_stack_00000010;
  long in_stack_00000018;
  
  while (in_x9 != param_1) {
    *(undefined8 **)(unaff_x19 + 0x60) = in_stack_00000010;
    *(undefined8 **)(unaff_x19 + 0x68) = in_stack_00000010;
    *(long *)(unaff_x19 + 0x70) = in_x9;
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
    lVar2 = *(long *)(unaff_x19 + 0xa0);
    if ((lVar2 == 0) || (lVar2 == *(long *)(unaff_x19 + 0xa8))) break;
    *(long *)(unaff_x19 + 0xa0) = lVar2 + 0x40;
    func_0x005a57fc(&uStack0000000000000008);
    in_x9 = uStack0000000000000008;
    param_1 = -0x8000000000000000;
  }
  uVar1 = 0;
  if (*(long *)(unaff_x19 + 0x80) != 0) {
    puVar3 = *(undefined8 **)(unaff_x19 + 0x88);
    if (puVar3 == *(undefined8 **)(unaff_x19 + 0x98)) {
      if (*(long *)(unaff_x19 + 0x90) != 0) {
        func_0x00187bd4(*(long *)(unaff_x19 + 0x80),*(long *)(unaff_x19 + 0x90) << 3,8);
      }
      uVar1 = 0;
      *(undefined8 *)(unaff_x19 + 0x80) = 0;
    }
    else {
      uVar1 = *puVar3;
      *(undefined8 **)(unaff_x19 + 0x88) = puVar3 + 1;
    }
  }
  return uVar1;
}

