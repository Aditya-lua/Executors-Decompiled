
void FUN_004ad718(void)

{
  char *unaff_x19;
  char in_wzr;
  
  if (*unaff_x19 == '\x01') {
    *unaff_x19 = in_wzr;
    goto code_r0x004ad768;
  }
  do {
    func_0x007b05dc();
code_r0x004ad768:
    __Unwind_Resume();
  } while( true );
}

