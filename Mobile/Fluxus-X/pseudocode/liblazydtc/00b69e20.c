/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b69e20
 */

undefined8 mbedtls_cipher_reset(long *param_1)

{
  if (*param_1 == 0) {
    return 0xffff9f00;
  }
  param_1[6] = 0;
  return 0;
}

