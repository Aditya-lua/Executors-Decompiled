/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9a6d0
 */

void CRYPTO_secure_zalloc(void)

{
  if (DAT_00d220f0 == '\x01') {
    CRYPTO_secure_malloc();
    return;
  }
  CRYPTO_zalloc();
  return;
}

