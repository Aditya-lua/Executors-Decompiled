/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a563e0
 */

undefined8 EVP_ASYM_CIPHER_get0_provider(long param_1)

{
  return *(undefined8 *)(param_1 + 0x18);
}

