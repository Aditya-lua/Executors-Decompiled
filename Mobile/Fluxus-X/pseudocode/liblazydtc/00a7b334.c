/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7b334
 */

undefined8 EVP_SIGNATURE_get0_provider(long param_1)

{
  return *(undefined8 *)(param_1 + 0x18);
}

