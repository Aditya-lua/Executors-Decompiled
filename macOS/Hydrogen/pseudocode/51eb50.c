
void FUN_0051eb50(void)

{
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  undefined8 *unaff_x23;
  long unaff_x26;
  long *in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  long lStack0000000000000028;
  undefined1 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  long lStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  
  do {
    uStack0000000000000038 = 2;
    uStack0000000000000048 = 1;
    uStack0000000000000050 = 0;
    lStack0000000000000028 = unaff_x19;
    _uStack0000000000000030 = unaff_x26 + 0x3b0;
    lStack0000000000000040 = (long)register0x00000008 + 0x60;
    func_0x00459f08(&uStack0000000000000010,&uStack0000000000000030);
    unaff_x23[1] = in_stack_00000018;
    *unaff_x23 = uStack0000000000000010;
    unaff_x23[2] = in_stack_00000020;
    unaff_x21 = unaff_x21 + 1;
    unaff_x23 = unaff_x23 + 3;
    unaff_x19 = unaff_x19 + 0x10;
    unaff_x22 = unaff_x22 + -1;
  } while (unaff_x22 != 0);
  *in_stack_00000008 = unaff_x21;
  return;
}

