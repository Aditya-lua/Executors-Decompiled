/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba0000
 */

undefined8 mbedtls_psa_pake_abort(int *param_1)

{
  mbedtls_zeroize_and_free(*(undefined8 *)(param_1 + 2),*(undefined8 *)(param_1 + 4));
  param_1[2] = 0;
  param_1[3] = 0;
  param_1[4] = 0;
  param_1[5] = 0;
  if (*param_1 == 0xa000100) {
    param_1[6] = 2;
    mbedtls_platform_zeroize(param_1 + 7,0x150);
    param_1[0x5c] = 0;
    param_1[0x5d] = 0;
    param_1[0x5e] = 0;
    param_1[0x5f] = 0;
    mbedtls_ecjpake_free(param_1 + 0x60);
  }
  *param_1 = 0;
  return 0;
}

