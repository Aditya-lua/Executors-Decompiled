
/* WARNING: Control flow encountered bad instruction data */

void FUN_003b91a0(void)

{
  undefined1 in_q9 [16];
  
  NEON_ucvtf(in_q9,0x14,4);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

