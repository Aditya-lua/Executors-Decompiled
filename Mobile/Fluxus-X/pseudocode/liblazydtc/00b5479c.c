/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5479c
 */

void FUN_00b5479c(void *param_1)

{
  if (param_1 == (void *)0x0) {
    return;
  }
  HMAC_CTX_free(*(undefined8 *)((long)param_1 + 8));
  ossl_prov_digest_reset((long)param_1 + 0x10);
  CRYPTO_secure_clear_free
            (*(undefined8 *)((long)param_1 + 0x28),*(undefined8 *)((long)param_1 + 0x30),
             "providers/implementations/macs/hmac_prov.c",0x61);
  CRYPTO_free(param_1);
  return;
}

