
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb390(void)

{
  undefined8 in_x4;
  undefined1 in_z0 [32];
  undefined1 in_z4 [32];
  undefined4 in_p1;
  
  SVE_ld1sb(in_z4,in_p1,in_x4,in_z0,0);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

