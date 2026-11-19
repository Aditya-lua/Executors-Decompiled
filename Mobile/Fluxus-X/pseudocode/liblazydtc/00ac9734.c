/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac9734
 */

undefined8 EVP_RAND_get0_description(long param_1)

{
  return *(undefined8 *)(param_1 + 0x18);
}

