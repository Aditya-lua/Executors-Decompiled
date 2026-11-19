/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4f0a8
 */

undefined8 OSSL_DECODER_settable_ctx_params(undefined8 *param_1)

{
  undefined8 uVar1;
  
  if ((param_1 == (undefined8 *)0x0) || (param_1[0xc] == 0)) {
    return 0;
  }
  ossl_provider_ctx(*param_1);
                    /* WARNING: Could not recover jumptable at 0x00a4f0d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*(code *)param_1[0xc])();
  return uVar1;
}

