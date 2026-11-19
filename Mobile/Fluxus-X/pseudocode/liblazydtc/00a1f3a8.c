/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f3a8
 */

undefined4 ossl_dh_get0_nid(long param_1)

{
  return *(undefined4 *)(param_1 + 0x3c);
}

