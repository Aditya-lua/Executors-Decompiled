/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad2050
 */

undefined8 ossl_rsa_set0_pss_params(long param_1,undefined8 param_2)

{
  RSA_PSS_PARAMS_free(*(RSA_PSS_PARAMS **)(param_1 + 0x80));
  *(undefined8 *)(param_1 + 0x80) = param_2;
  return 1;
}

