/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad8f10
 */

undefined4 ossl_rsa_pss_params_30_maskgenhashalg(long param_1)

{
  if (param_1 == 0) {
    return 0x40;
  }
  return *(undefined4 *)(param_1 + 8);
}

