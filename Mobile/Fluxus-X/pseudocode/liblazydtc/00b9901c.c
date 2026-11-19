/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9901c
 */

undefined8 mbedtls_psa_cipher_abort(uint *param_1)

{
  if ((*param_1 & 0x7f000000) == 0x4000000) {
    mbedtls_cipher_free(param_1 + 2);
    return 0;
  }
  return 0xffffff77;
}

