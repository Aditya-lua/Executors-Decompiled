/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a58d18
 */

undefined8 EVP_MD_gettable_ctx_params(long param_1)

{
  undefined8 uVar1;
  
  if ((param_1 == 0) || (*(long *)(param_1 + 0xe8) == 0)) {
    return 0;
  }
  EVP_MD_get0_provider(param_1);
  uVar1 = ossl_provider_ctx();
                    /* WARNING: Could not recover jumptable at 0x00a58d54. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0xe8))(0,uVar1);
  return uVar1;
}

