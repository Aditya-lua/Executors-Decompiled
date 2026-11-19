/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a69214
 */

undefined8 EVP_MAC_CTX_settable_params(long *param_1)

{
  undefined8 uVar1;
  
  if (((undefined8 *)*param_1)[0xe] == 0) {
    return 0;
  }
  uVar1 = ossl_provider_ctx(*(undefined8 *)*param_1);
                    /* WARNING: Could not recover jumptable at 0x00a69250. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_1 + 0x70))(param_1[1],uVar1);
  return uVar1;
}

