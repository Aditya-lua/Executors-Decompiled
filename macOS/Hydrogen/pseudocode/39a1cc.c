
/* WARNING: Control flow encountered bad instruction data */

void FUN_0039a1cc(void)

{
  undefined1 in_z14 [32];
  undefined1 in_z15 [32];
  undefined4 in_p4;
  
  SVE_fadd(in_z14,in_p4,in_z14,in_z15);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

