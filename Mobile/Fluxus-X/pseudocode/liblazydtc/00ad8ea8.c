/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad8ea8
 */

bool ossl_rsa_pss_params_30_set_maskgenalg(long param_1,undefined4 param_2)

{
  if (param_1 != 0) {
    *(undefined4 *)(param_1 + 4) = param_2;
  }
  return param_1 != 0;
}

