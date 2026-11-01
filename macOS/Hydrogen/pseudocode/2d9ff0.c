
undefined8 _aws_lc_0_24_0_EVP_PKEY_CTX_get_signature_md(long *param_1,undefined8 param_2)

{
  undefined8 uVar1;
  code *UNRECOVERED_JUMPTABLE;
  
  if (((param_1 == (long *)0x0) || (*param_1 == 0)) ||
     (UNRECOVERED_JUMPTABLE = *(code **)(*param_1 + 0x80), UNRECOVERED_JUMPTABLE == (code *)0x0)) {
    func_0x0028f83c(6,0,0x65,"/aws-lc/crypto/fipsmodule/evp/evp_ctx.c",0xd7);
    return 0;
  }
  if (*(uint *)(param_1 + 4) == 0) {
    func_0x0028f83c(6,0,0x7b,"/aws-lc/crypto/fipsmodule/evp/evp_ctx.c",0xe0);
    return 0;
  }
  if ((*(uint *)(param_1 + 4) & 0x38) == 0) {
    func_0x0028f83c(6,0,0x72,"/aws-lc/crypto/fipsmodule/evp/evp_ctx.c",0xe5);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x002da02c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*UNRECOVERED_JUMPTABLE)(param_1,2,0,param_2);
  return uVar1;
}

