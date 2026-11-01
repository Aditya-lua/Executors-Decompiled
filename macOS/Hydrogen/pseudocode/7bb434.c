
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb434(void)

{
  undefined8 unaff_x30;
  undefined1 in_z8 [32];
  undefined4 in_p0;
  
  SVE_ld1sb(in_z8,in_p0,unaff_x30,in_z8,0);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

