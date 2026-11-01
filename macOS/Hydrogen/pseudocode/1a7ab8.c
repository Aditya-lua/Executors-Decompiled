
void FUN_001a7ab8(void)

{
  long *unaff_x19;
  long unaff_x21;
  undefined1 *puVar1;
  undefined1 *unaff_x22;
  long unaff_x23;
  undefined1 unaff_w24;
  
code_r0x001a7ab8:
  do {
    func_0x00458a18();
    puVar1 = unaff_x22;
    do {
      while( true ) {
        *(undefined1 *)(unaff_x19[1] + unaff_x21) = unaff_w24;
        unaff_x21 = unaff_x21 + 1;
        unaff_x19[2] = unaff_x21;
        unaff_x22 = puVar1 + 2;
        unaff_x23 = unaff_x23 + -2;
        if (unaff_x23 == 0) {
          func_0x0024031c();
          return;
        }
        unaff_w24 = 0;
        if (puVar1[1] != '\0') break;
code_r0x001a7a94:
        puVar1 = unaff_x22;
        if (unaff_x21 == *unaff_x19) goto code_r0x001a7ab8;
      }
      if (puVar1[1] == '\x01') {
        unaff_w24 = 2;
        goto code_r0x001a7a94;
      }
      unaff_w24 = *unaff_x22;
      puVar1 = unaff_x22;
    } while (unaff_x21 != *unaff_x19);
  } while( true );
}

