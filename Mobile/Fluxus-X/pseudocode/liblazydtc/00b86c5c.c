/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b86c5c
 */

undefined8 psa_remove_key_data_from_memory(long param_1)

{
  if (*(long *)(param_1 + 0x28) != 0) {
    mbedtls_zeroize_and_free(*(long *)(param_1 + 0x28),*(undefined8 *)(param_1 + 0x30));
  }
  *(undefined8 *)(param_1 + 0x28) = 0;
  *(undefined8 *)(param_1 + 0x30) = 0;
  return 0;
}

