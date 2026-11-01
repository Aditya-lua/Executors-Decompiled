
/* WARNING: Control flow encountered bad instruction data */

void FUN_003aa120(void)

{
  undefined1 in_z12 [32];
  undefined1 in_z30 [32];
  undefined4 in_p0;
  undefined4 in_p9;
  
  SVE_cmpne(in_p9,in_p0,in_z12,in_z30);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

