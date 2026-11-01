
undefined8 FUN_006472b8(void)

{
  int in_w8;
  long unaff_x29;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  
  while (-1 < in_w8) {
    while( true ) {
      __Unwind_Resume();
      __ZdlPv(*(undefined8 *)(unaff_x29 + -0x30));
      if (in_stack_00000050 < 0) {
        __ZdlPv(in_stack_00000040);
      }
      if (-1 < in_stack_00000030) break;
      __ZdlPv(in_stack_00000020);
      if (in_stack_00000018 < 0) goto LAB_00647324;
    }
    in_w8 = (int)in_stack_00000018._7_1_;
  }
LAB_00647324:
  __ZdlPv(in_stack_00000008);
  __Unwind_Resume();
  return 0x14;
}

