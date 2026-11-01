
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb2d8(void)

{
  long in_x13;
  undefined8 in_d20;
  
  *(undefined8 *)(in_x13 + 0x40) = in_d20;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

