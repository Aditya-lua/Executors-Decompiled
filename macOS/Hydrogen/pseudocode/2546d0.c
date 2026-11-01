
void FUN_002546d0(void)

{
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  long lStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  long lStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined *puStack0000000000000058;
  
  do {
    _uStack0000000000000020 = &UNK_0082ab90;
    puStack0000000000000058 = &DAT_001ee4a0;
    uStack0000000000000028 = 1;
    uStack0000000000000038 = 1;
    uStack0000000000000040 = 0;
    lStack0000000000000018 = unaff_x19;
    lStack0000000000000030 = (long)register0x00000008 + 0x50;
    func_0x00459f08(&uStack0000000000000020);
    unaff_x23[1] = in_stack_00000008;
    *unaff_x23 = in_stack_00000000;
    unaff_x23[2] = in_stack_00000010;
    unaff_x21 = unaff_x21 + 1;
    unaff_x23 = unaff_x23 + 3;
    unaff_x19 = unaff_x19 + 2;
    unaff_x22 = unaff_x22 + -1;
  } while (unaff_x22 != 0);
  *unaff_x20 = unaff_x21;
  return;
}

