
void FUN_001a70bc(void)

{
  long *unaff_x19;
  long unaff_x21;
  char *pcVar1;
  char *unaff_x22;
  long unaff_x23;
  char unaff_w24;
  
  do {
    func_0x00458a18();
    pcVar1 = unaff_x22;
    do {
      *(char *)(unaff_x19[1] + unaff_x21) = unaff_w24;
      unaff_x21 = unaff_x21 + 1;
      unaff_x19[2] = unaff_x21;
      unaff_x22 = pcVar1 + 2;
      unaff_x23 = unaff_x23 + -2;
      if (unaff_x23 == 0) {
        func_0x0024031c();
        return;
      }
      unaff_w24 = pcVar1[1];
      if (unaff_w24 == '\x03') {
        unaff_w24 = *unaff_x22;
      }
      pcVar1 = unaff_x22;
    } while (unaff_x21 != *unaff_x19);
  } while( true );
}

