/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa880c
 */

size_t CRYPTO_ccm128_tag(byte *param_1,void *param_2,size_t param_3)

{
  size_t sVar1;
  
  sVar1 = 0;
  if ((*param_1 >> 2 & 0xe) + 2 == param_3) {
    memcpy(param_2,param_1 + 0x10,param_3);
    sVar1 = param_3;
  }
  return sVar1;
}

