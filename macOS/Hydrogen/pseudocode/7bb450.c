
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb450(void)

{
  undefined1 in_z0 [32];
  undefined1 in_z4 [32];
  undefined1 in_z10 [32];
  
  SVE_add(in_z10,in_z0,in_z4);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

