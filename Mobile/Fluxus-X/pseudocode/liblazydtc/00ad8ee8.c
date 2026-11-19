/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad8ee8
 */

undefined4 ossl_rsa_pss_params_30_hashalg(undefined4 *param_1)

{
  if (param_1 == (undefined4 *)0x0) {
    return 0x40;
  }
  return *param_1;
}

