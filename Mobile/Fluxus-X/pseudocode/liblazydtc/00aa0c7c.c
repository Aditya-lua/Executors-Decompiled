/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa0c7c
 */

void ossl_pw_clear_passphrase_cache(long param_1)

{
  CRYPTO_clear_free(*(undefined8 *)(param_1 + 0x20),*(undefined8 *)(param_1 + 0x28),
                    "crypto/passphrase.c",0x1d);
  *(undefined8 *)(param_1 + 0x20) = 0;
  return;
}

