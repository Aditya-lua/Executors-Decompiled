
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb4e8(void)

{
  undefined8 unaff_x23;
  undefined1 in_z0 [32];
  undefined1 in_z1 [32];
  undefined1 in_z8 [32];
  undefined4 in_p0;
  undefined4 uVar1;
  
  uVar1 = SVE_cmphs(in_p0,in_p0,in_z0,in_z1);
  SVE_ld1sb(in_z8,uVar1,unaff_x23,in_z0,0);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

