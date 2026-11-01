
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb63c(undefined8 param_1)

{
  undefined1 in_z8 [32];
  undefined4 in_p6;
  
  SVE_prfw(0,in_p6,param_1,in_z8,0);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

