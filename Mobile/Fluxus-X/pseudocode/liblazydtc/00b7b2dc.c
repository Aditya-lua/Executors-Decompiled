/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7b2dc
 */

void mbedtls_zeroize_and_free(void *param_1,size_t param_2)

{
  if ((param_1 != (void *)0x0) && (param_2 != 0)) {
    memset(param_1,0,param_2);
  }
  free(param_1);
  return;
}

