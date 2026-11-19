/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7b984
 */

undefined8 EVP_SIGNATURE_get0_name(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

