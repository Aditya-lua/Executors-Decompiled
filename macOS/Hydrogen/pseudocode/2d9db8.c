
undefined8 FUN_002d9db8(long param_1)

{
  undefined8 uVar1;
  
  if (*(code **)(param_1 + 0x60) == (code *)0x0) {
    func_0x0028f83c(6,0,0x7d,"/aws-lc/crypto/fipsmodule/evp/evp.c",0x20e);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x002d9dc4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0x60))();
  return uVar1;
}

