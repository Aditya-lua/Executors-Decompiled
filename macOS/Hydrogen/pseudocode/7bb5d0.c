
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb5d0(void)

{
  undefined1 in_z1 [32];
  undefined1 in_z8 [32];
  undefined1 in_z24 [32];
  
  SVE_add(in_z1,in_z8,in_z24);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

