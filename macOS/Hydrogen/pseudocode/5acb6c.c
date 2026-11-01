
void FUN_005acb6c(undefined8 param_1)

{
  char *unaff_x19;
  char in_wzr;
  
  if (*unaff_x19 == '\x01') {
    *unaff_x19 = in_wzr;
    goto LAB_005acb80;
  }
  do {
    func_0x007b05dc();
LAB_005acb80:
    __Unwind_Resume(param_1);
  } while( true );
}

