/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a599c0
 */

undefined8 EVP_ENCODE_CTX_copy(void *param_1,void *param_2)

{
  memcpy(param_1,param_2,0x60);
  return 1;
}

