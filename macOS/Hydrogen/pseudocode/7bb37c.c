
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb37c(void)

{
  long in_x12;
  undefined8 in_d4;
  
  *(undefined8 *)(in_x12 + 0xc0) = in_d4;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

