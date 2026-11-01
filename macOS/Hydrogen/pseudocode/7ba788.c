
/* WARNING: Control flow encountered bad instruction data */

void FUN_007ba788(undefined8 param_1)

{
  undefined1 in_z16 [32];
  undefined4 in_p0;
  undefined1 uStack0000000000000000;
  
  SVE_ld1rqb(in_z16,in_p0,&uStack0000000000000000,param_1);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

