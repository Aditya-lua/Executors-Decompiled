
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb3c4(void)

{
  undefined1 in_z0 [32];
  undefined1 in_z8 [32];
  undefined4 in_p3;
  
  SVE_fcmla(in_z0,in_p3,in_z0,in_z8,2);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

