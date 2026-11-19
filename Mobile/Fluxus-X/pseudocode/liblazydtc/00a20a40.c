/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20a40
 */

void DSA_get0_pqg(long param_1)

{
  ossl_ffc_params_get0_pqg(param_1 + 8);
  return;
}

