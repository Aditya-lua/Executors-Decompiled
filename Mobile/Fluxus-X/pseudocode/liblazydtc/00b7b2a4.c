/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7b2a4
 */

void mbedtls_platform_zeroize(void *param_1,size_t param_2)

{
  if (param_2 != 0) {
    memset(param_1,0,param_2);
  }
  return;
}

