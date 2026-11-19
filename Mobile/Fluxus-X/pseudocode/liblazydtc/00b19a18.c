/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b19a18
 */

void BIO_CONNECT_free(void *param_1)

{
  if (param_1 == (void *)0x0) {
    return;
  }
  CRYPTO_free(*(void **)((long)param_1 + 8));
  CRYPTO_free(*(void **)((long)param_1 + 0x10));
  BIO_ADDRINFO_free(*(undefined8 *)((long)param_1 + 0x20));
  CRYPTO_free(param_1);
  return;
}

