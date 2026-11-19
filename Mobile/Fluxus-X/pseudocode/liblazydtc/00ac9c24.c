/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac9c24
 */

undefined8 EVP_RAND_CTX_settable_params(long *param_1)

{
  undefined8 uVar1;
  
  if (((undefined8 *)*param_1)[0x13] == 0) {
    return 0;
  }
  uVar1 = ossl_provider_ctx(*(undefined8 *)*param_1);
                    /* WARNING: Could not recover jumptable at 0x00ac9c60. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_1 + 0x98))(param_1[1],uVar1);
  return uVar1;
}

