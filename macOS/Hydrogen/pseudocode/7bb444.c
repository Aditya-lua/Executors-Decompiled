
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb444(void)

{
  undefined1 in_z0 [32];
  undefined1 in_z11 [32];
  undefined4 in_p0;
  
  SVE_sabd(in_z11,in_p0,in_z11,in_z0);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

