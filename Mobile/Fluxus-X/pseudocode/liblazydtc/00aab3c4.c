/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aab3c4
 */

void CRYPTO_gcm128_tag(long param_1,void *param_2,size_t param_3)

{
  CRYPTO_gcm128_finish(param_1,0,0);
  if (0xf < param_3) {
    param_3 = 0x10;
  }
  memcpy(param_2,(void *)(param_1 + 0x40),param_3);
  return;
}

