/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad8e98
 */

bool ossl_rsa_pss_params_30_set_hashalg(undefined4 *param_1,undefined4 param_2)

{
  if (param_1 != (undefined4 *)0x0) {
    *param_1 = param_2;
  }
  return param_1 != (undefined4 *)0x0;
}

