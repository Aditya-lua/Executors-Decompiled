
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb17c(undefined8 param_1,undefined8 param_2)

{
  undefined1 in_z0 [32];
  undefined1 in_z3 [32];
  undefined1 in_z4 [32];
  undefined1 in_z8 [32];
  undefined1 in_z12 [32];
  undefined1 in_z16 [32];
  undefined4 in_p0;
  undefined4 in_p1;
  undefined4 in_p2;
  
  SVE_ld1b(in_z3,in_p2,param_2,in_z4,0);
  SVE_cmphs(in_p1,in_p0,in_z8,in_z12);
  SVE_add(in_z0,in_z0,in_z16);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

