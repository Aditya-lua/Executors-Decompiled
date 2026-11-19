/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeadbc
 */

undefined8 OSSL_STORE_SEARCH_get0_bytes(long param_1,undefined8 *param_2)

{
  *param_2 = *(undefined8 *)(param_1 + 0x28);
  return *(undefined8 *)(param_1 + 0x20);
}

