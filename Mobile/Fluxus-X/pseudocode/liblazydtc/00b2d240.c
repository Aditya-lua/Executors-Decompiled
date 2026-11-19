/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2d240
 */

void ossl_cipher_hw_tdes_copyctx(void *param_1,void *param_2)

{
  memcpy(param_1,param_2,0x248);
  *(long *)((long)param_1 + 0xb0) = (long)param_1 + 0xc0;
  return;
}

