/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b46ad4
 */

void FUN_00b46ad4(void *param_1)

{
  if (param_1 == (void *)0x0) {
    return;
  }
  ossl_prov_digest_reset((long)param_1 + 0x30);
  CRYPTO_free(*(void **)((long)param_1 + 0x18));
  CRYPTO_clear_free(*(undefined8 *)((long)param_1 + 8),*(undefined8 *)((long)param_1 + 0x10),
                    "providers/implementations/kdfs/pbkdf2.c",0x57);
  memset(param_1,0,0x50);
  CRYPTO_free(param_1);
  return;
}

