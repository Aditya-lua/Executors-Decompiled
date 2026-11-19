/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeadcc
 */

undefined8 OSSL_STORE_SEARCH_get0_string(long param_1)

{
  return *(undefined8 *)(param_1 + 0x20);
}

