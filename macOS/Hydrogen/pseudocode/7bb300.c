
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb300(undefined8 param_1)

{
  undefined8 in_x4;
  undefined1 in_z0 [32];
  undefined4 in_p1;
  
  SVE_stnt1b(in_z0,in_p1,param_1,in_x4);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

