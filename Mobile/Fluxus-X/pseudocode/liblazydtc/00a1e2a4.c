/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1e2a4
 */

void DH_new_by_nid(undefined4 param_1)

{
  ossl_dh_new_by_nid_ex(0,param_1);
  return;
}

