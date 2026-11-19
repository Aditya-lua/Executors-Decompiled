/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0b9b0
 */

void BUF_MEM_free(BUF_MEM *a)

{
  if (a == (BUF_MEM *)0x0) {
    return;
  }
  if (a->data != (char *)0x0) {
    if ((a[1].length & 1) == 0) {
      CRYPTO_clear_free();
    }
    else {
      CRYPTO_secure_clear_free(a->data,a->max,"crypto/buffer/buffer.c",0x31);
    }
  }
  CRYPTO_free(a);
  return;
}

