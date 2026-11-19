/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a61060
 */

undefined8 OSSL_ENCODER_gettable_params(undefined8 *param_1)

{
  undefined8 uVar1;
  
  if ((param_1 == (undefined8 *)0x0) || (param_1[10] == 0)) {
    return 0;
  }
  ossl_provider_ctx(*param_1);
                    /* WARNING: Could not recover jumptable at 0x00a61090. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*(code *)param_1[10])();
  return uVar1;
}

