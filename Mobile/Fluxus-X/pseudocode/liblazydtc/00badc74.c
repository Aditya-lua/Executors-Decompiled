/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00badc74
 */

void mbedtls_sha512_clone(void *param_1,void *param_2)

{
  memcpy(param_1,param_2,0xd8);
  return;
}

