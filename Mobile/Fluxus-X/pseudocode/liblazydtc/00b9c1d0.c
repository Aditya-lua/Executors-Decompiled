/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9c1d0
 */

void mbedtls_hmac_drbg_init(void *param_1)

{
  memset(param_1,0,0x80);
  *(undefined4 *)((long)param_1 + 0x6c) = 10000;
  return;
}

