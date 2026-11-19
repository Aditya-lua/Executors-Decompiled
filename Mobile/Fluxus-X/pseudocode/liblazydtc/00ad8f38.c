/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad8f38
 */

undefined4 ossl_rsa_pss_params_30_trailerfield(long param_1)

{
  if (param_1 == 0) {
    return 1;
  }
  return *(undefined4 *)(param_1 + 0x10);
}

