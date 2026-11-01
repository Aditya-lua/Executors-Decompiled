
void FUN_00093c9c(undefined1 param_1 [16],long param_2,undefined8 param_3)

{
  long in_x9;
  
  *(long *)(in_x9 + 0x20) = param_1._8_8_;
  *(long *)(in_x9 + 0x18) = param_1._0_8_;
                    /* WARNING: Could not recover jumptable at 0x007b2fa4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_atexit_00a24b08)(param_2 + 0xbfc,param_3,0);
  return;
}

