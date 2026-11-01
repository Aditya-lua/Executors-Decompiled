
void FUN_005cc654(void)

{
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  
  do {
    if (in_stack_00000008 != 0) {
      func_0x00187bd4(in_stack_00000010,in_stack_00000008 << 3,8);
    }
    __Unwind_Resume();
    func_0x007b05dc();
  } while( true );
}

