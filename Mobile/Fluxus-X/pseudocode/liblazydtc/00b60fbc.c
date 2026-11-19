/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b60fbc
 */

void FUN_00b60fbc(void *param_1)

{
  EVP_MD_CTX_free(*(undefined8 *)((long)param_1 + 0x168));
  EVP_MD_free(*(undefined8 *)((long)param_1 + 0x160));
  *(undefined8 *)((long)param_1 + 0x160) = 0;
  *(undefined8 *)((long)param_1 + 0x168) = 0;
  EC_KEY_free(*(EC_KEY **)((long)param_1 + 0x10));
  CRYPTO_free(*(void **)((long)param_1 + 8));
  CRYPTO_free(*(void **)((long)param_1 + 0x178));
  CRYPTO_free(param_1);
  return;
}

