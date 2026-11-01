
long FUN_00529d48(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x21;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  
  do {
    func_0x00520ec0(&uStack0000000000000008);
    lVar1 = uStack0000000000000008;
    if (uStack0000000000000008 == unaff_x21) {
      return unaff_x19;
    }
    if (in_stack_00000020 != unaff_x21 && in_stack_00000020 != 0) {
      func_0x00187bd4(in_stack_00000028,in_stack_00000020,1);
    }
    if (lVar1 != 0) {
      func_0x00187bd4(in_stack_00000010,lVar1 << 4,8);
    }
    unaff_x19 = unaff_x19 + -1;
  } while (unaff_x19 != 0);
  return 0;
}

