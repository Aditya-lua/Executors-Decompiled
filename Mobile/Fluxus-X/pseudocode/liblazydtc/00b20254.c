/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b20254
 */

undefined8
ossl_prov_get_nonce(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                   undefined8 param_5,undefined8 param_6)

{
  code *UNRECOVERED_JUMPTABLE;
  undefined8 uVar1;
  
  UNRECOVERED_JUMPTABLE = DAT_00d23818;
  if (DAT_00d23818 == (code *)0x0) {
    return 0;
  }
  uVar1 = ossl_prov_ctx_get0_handle();
                    /* WARNING: Could not recover jumptable at 0x00b202b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*UNRECOVERED_JUMPTABLE)(uVar1,param_2,param_3,param_4,param_5,param_6);
  return uVar1;
}

