
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb260(undefined1 param_1 [16])

{
  long in_x12;
  undefined1 in_q4 [16];
  
  *(long *)(in_x12 + 0x28) = in_q4._8_8_;
  *(long *)(in_x12 + 0x20) = in_q4._0_8_;
  *(long *)(in_x12 + 0x38) = param_1._8_8_;
  *(long *)(in_x12 + 0x30) = param_1._0_8_;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

