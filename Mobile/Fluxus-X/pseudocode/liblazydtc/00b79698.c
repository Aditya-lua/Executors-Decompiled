/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b79698
 */

void mbedtls_md5_clone(void *param_1,void *param_2)

{
  memcpy(param_1,param_2,0x58);
  return;
}

