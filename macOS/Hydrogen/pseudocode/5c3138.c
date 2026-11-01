
void FUN_005c3138(undefined8 param_1)

{
  undefined8 uVar1;
  char *unaff_x21;
  char in_wzr;
  
  func_0x00187bd4();
  uVar1 = __Unwind_Resume(param_1);
  if (*unaff_x21 == '\x01') {
    *unaff_x21 = in_wzr;
    goto LAB_005c316c;
  }
  do {
    func_0x007b05dc();
LAB_005c316c:
    func_0x00187bd4();
    __Unwind_Resume(uVar1);
  } while( true );
}

