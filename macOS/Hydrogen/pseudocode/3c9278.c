
/* WARNING: Control flow encountered bad instruction data */

void FUN_003c9278(void)

{
  undefined1 in_z30 [32];
  undefined4 in_p13;
  
  SVE_cpy(in_z30,in_p13,0x4c00,8);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

