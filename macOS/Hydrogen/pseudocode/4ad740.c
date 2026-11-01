
void FUN_004ad740(void)

{
  char *unaff_x19;
  char in_wzr;
  undefined1 uStack0000000000000030;
  
  func_0x005d2ac4(&uStack0000000000000030);
  func_0x00491304();
  if (*unaff_x19 == '\x01') {
    *unaff_x19 = in_wzr;
    goto LAB_004ad768;
  }
  do {
    func_0x007b05dc();
LAB_004ad768:
    __Unwind_Resume();
  } while( true );
}

