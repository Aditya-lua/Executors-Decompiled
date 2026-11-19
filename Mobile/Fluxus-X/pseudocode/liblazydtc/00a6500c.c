/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6500c
 */

undefined8 EVP_KEM_get0_provider(long param_1)

{
  return *(undefined8 *)(param_1 + 0x18);
}

