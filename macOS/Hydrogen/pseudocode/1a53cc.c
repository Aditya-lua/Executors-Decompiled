
void FUN_001a53cc(void)

{
  bool in_ZR;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long lVar1;
  long unaff_x26;
  long unaff_x29;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined1 uStack0000000000000038;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  long lStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  
  if (in_ZR) {
    unaff_x26 = 0;
  }
  else {
    lVar1 = 0;
    do {
      _uStack0000000000000040 = &UNK_0082ab90;
      *(undefined1 **)(unaff_x29 + -0x60) = &uStack0000000000000038;
      *(undefined **)(unaff_x29 + -0x58) = &DAT_001ee4a0;
      uStack0000000000000048 = 1;
      uStack0000000000000058 = 1;
      uStack0000000000000060 = 0;
      _uStack0000000000000038 = unaff_x20;
      lStack0000000000000050 = unaff_x29 + -0x60;
      func_0x00459f08(&uStack0000000000000020,&uStack0000000000000040);
      unaff_x21[1] = in_stack_00000028;
      *unaff_x21 = uStack0000000000000020;
      unaff_x21[2] = in_stack_00000030;
      lVar1 = lVar1 + 1;
      unaff_x20 = unaff_x20 + 2;
      unaff_x21 = unaff_x21 + 3;
    } while (unaff_x26 != lVar1);
  }
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = in_stack_00000008;
  unaff_x19[2] = unaff_x26;
  return;
}

