/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac972c
 */

undefined8 EVP_RAND_get0_name(long param_1)

{
  return *(undefined8 *)(param_1 + 0x10);
}

