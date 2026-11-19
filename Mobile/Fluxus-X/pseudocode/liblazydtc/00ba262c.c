/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba262c
 */

void psa_free_persistent_key_data(void)

{
  mbedtls_zeroize_and_free();
  return;
}

