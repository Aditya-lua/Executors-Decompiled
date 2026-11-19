/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad8efc
 */

undefined4 ossl_rsa_pss_params_30_maskgenalg(long param_1)

{
  if (param_1 == 0) {
    return 0x38f;
  }
  return *(undefined4 *)(param_1 + 4);
}

