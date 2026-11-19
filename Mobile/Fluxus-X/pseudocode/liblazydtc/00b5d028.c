/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5d028
 */

void FUN_00b5d028(void *param_1)

{
  CRYPTO_free(*(void **)((long)param_1 + 8));
  EVP_MD_CTX_free(*(undefined8 *)((long)param_1 + 0x178));
  EVP_MD_free(*(undefined8 *)((long)param_1 + 0x170));
  *(undefined8 *)((long)param_1 + 8) = 0;
  *(undefined8 *)((long)param_1 + 0x160) = 0;
  *(undefined8 *)((long)param_1 + 0x170) = 0;
  *(undefined8 *)((long)param_1 + 0x178) = 0;
  EC_KEY_free(*(EC_KEY **)((long)param_1 + 0x10));
  BN_clear_free(*(BIGNUM **)((long)param_1 + 0x180));
  BN_clear_free(*(BIGNUM **)((long)param_1 + 0x188));
  CRYPTO_free(param_1);
  return;
}

