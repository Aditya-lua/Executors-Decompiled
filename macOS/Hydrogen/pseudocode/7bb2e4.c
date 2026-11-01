
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb2e4(undefined1 param_1 [16])

{
  long unaff_x21;
  undefined1 in_q4 [16];
  
  *(long *)(unaff_x21 + 0x88) = in_q4._8_8_;
  *(long *)(unaff_x21 + 0x80) = in_q4._0_8_;
  *(long *)(unaff_x21 + 0x98) = param_1._8_8_;
  *(long *)(unaff_x21 + 0x90) = param_1._0_8_;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

