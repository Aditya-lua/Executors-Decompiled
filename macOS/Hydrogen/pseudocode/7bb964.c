
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb964(void)

{
  undefined1 extraout_q1 [16];
  undefined1 extraout_var [16];
  undefined1 auVar1 [32];
  undefined1 in_z8 [32];
  undefined1 in_z28 [32];
  
  func_0x008cf98c();
  auVar1._16_16_ = extraout_var;
  auVar1._0_16_ = extraout_q1;
  SVE_add(auVar1,in_z8,in_z28);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

