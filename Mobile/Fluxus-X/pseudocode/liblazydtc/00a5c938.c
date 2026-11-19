/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5c938
 */

undefined8 EVP_CIPHER_CTX_gettable_params(long *param_1)

{
  undefined8 uVar1;
  
  if (param_1 != (long *)0x0) {
    if (*(long *)(*param_1 + 0xf0) != 0) {
      EVP_CIPHER_get0_provider();
      uVar1 = ossl_provider_ctx();
                    /* WARNING: Could not recover jumptable at 0x00a5c97c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (**(code **)(*param_1 + 0xf0))(param_1[0x15],uVar1);
      return uVar1;
    }
  }
  return 0;
}

