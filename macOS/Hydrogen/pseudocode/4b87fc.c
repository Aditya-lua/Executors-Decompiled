
void FUN_004b87fc(void)

{
  undefined1 uVar1;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x23;
  long unaff_x24;
  undefined8 unaff_x25;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  while( true ) {
    if (unaff_x23 == unaff_x24) {
      unaff_x19[4] = in_stack_00000010;
      unaff_x19[3] = uStack0000000000000008;
      unaff_x19[5] = in_stack_00000018;
      unaff_x19[1] = unaff_x20 + unaff_x24;
      unaff_x19[2] = unaff_x25;
      *unaff_x19 = 0;
      return;
    }
    if (unaff_x21 == unaff_x24) break;
    uVar1 = *(undefined1 *)(unaff_x20 + unaff_x24);
    if (unaff_x24 == uStack0000000000000008) {
      func_0x00458a18(&uStack0000000000000008);
    }
    *(undefined1 *)(in_stack_00000010 + unaff_x24) = uVar1;
    unaff_x24 = unaff_x24 + 1;
    in_stack_00000018 = unaff_x24;
  }
  unaff_x19[2] = unaff_x20 + unaff_x24;
  unaff_x19[3] = 0;
  *(undefined1 *)(unaff_x19 + 4) = 0x17;
  unaff_x19[1] = 1;
  *unaff_x19 = 1;
  if (uStack0000000000000008 == 0) {
    return;
  }
  func_0x00187bd4(in_stack_00000010,uStack0000000000000008,1);
  return;
}

