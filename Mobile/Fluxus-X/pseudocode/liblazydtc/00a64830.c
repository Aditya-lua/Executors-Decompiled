/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a64830
 */

undefined8 EVP_KDF_settable_ctx_params(long param_1)

{
  undefined8 uVar1;
  
  if (*(long *)(param_1 + 0x68) == 0) {
    return 0;
  }
  EVP_KDF_get0_provider();
  uVar1 = ossl_provider_ctx();
                    /* WARNING: Could not recover jumptable at 0x00a64864. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0x68))(0,uVar1);
  return uVar1;
}

