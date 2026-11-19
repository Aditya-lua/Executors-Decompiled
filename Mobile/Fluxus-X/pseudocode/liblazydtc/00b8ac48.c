/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8ac48
 */

undefined8 psa_cipher_abort(int *param_1)

{
  if (*param_1 != 0) {
    if (*param_1 == 1) {
      mbedtls_psa_cipher_abort(param_1 + 2);
    }
    *param_1 = 0;
    *(byte *)(param_1 + 1) = *(byte *)(param_1 + 1) & 0xfc;
  }
  return 0;
}

