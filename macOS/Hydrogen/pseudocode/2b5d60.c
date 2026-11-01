
undefined8 FUN_002b5d60(long param_1)

{
  undefined8 uVar1;
  
  if (param_1 == 0) {
    func_0x0028f83c(0xe,0,0x43,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x22d);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x002b5d84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0x28))();
  return uVar1;
}

