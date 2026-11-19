/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a81410
 */

ulong ossl_release_default_drbg_ctx(ulong param_1)

{
  int idx;
  uint uVar1;
  
  idx = DAT_00d21c54;
  if (DAT_00d21c54 == -1) {
    return param_1;
  }
  CRYPTO_get_ex_data((CRYPTO_EX_DATA *)&DAT_00d21b98,DAT_00d21c54);
  ossl_rand_ctx_free();
  uVar1 = CRYPTO_set_ex_data((CRYPTO_EX_DATA *)&DAT_00d21b98,idx,(void *)0x0);
  return (ulong)uVar1;
}

