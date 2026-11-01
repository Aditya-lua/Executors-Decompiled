
/* WARNING: Control flow encountered bad instruction data */

void FUN_003a9f70(void)

{
  long unaff_x28;
  undefined8 in_d18;
  undefined8 in_d25;
  
  *(undefined8 *)(unaff_x28 + -0x108) = in_d25;
  *(undefined8 *)(unaff_x28 + -0x100) = in_d18;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

