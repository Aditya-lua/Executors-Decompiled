
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb3cc(void)

{
  long in_x15;
  undefined4 in_s20;
  
  *(undefined4 *)(in_x15 + 0x10) = in_s20;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

