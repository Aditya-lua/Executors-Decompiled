/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aac4a0
 */

void CRYPTO_ocb128_cleanup(void *param_1)

{
  if (param_1 == (void *)0x0) {
    return;
  }
  CRYPTO_clear_free(*(undefined8 *)((long)param_1 + 0x58),*(long *)((long)param_1 + 0x30) << 4,
                    "crypto/modes/ocb128.c",0x22d);
  OPENSSL_cleanse(param_1,0xb0);
  return;
}

