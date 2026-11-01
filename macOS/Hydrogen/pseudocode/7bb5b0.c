
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb5b0(undefined4 param_1)

{
  long unaff_x20;
  
  *(undefined4 *)(unaff_x20 + 0x40) = param_1;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

