/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1ee90
 */

undefined8 ossl_dh_get_method(long param_1)

{
  return *(undefined8 *)(param_1 + 0xb8);
}

