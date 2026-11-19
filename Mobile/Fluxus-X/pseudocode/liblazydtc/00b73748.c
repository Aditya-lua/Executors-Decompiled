/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b73748
 */

void mbedtls_ctr_drbg_init(void *param_1)

{
  memset(param_1,0,0x158);
  mbedtls_aes_init((long)param_1 + 0x28);
  *(undefined4 *)((long)param_1 + 0x10) = 0xffffffff;
  *(undefined4 *)((long)param_1 + 0x20) = 10000;
  return;
}

