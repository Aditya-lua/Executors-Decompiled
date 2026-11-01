
undefined8 FUN_006472c4(void)

{
  long unaff_x29;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  
  while( true ) {
    __ZdlPv(*(undefined8 *)(unaff_x29 + -0x30));
    if (in_stack_00000050 < 0) {
      __ZdlPv(in_stack_00000040);
    }
    if (in_stack_00000030 < 0) {
      __ZdlPv(in_stack_00000020);
    }
    if (in_stack_00000018 < 0) break;
    __Unwind_Resume();
  }
  __ZdlPv(in_stack_00000008);
  __Unwind_Resume();
  return 0x14;
}

