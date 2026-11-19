/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a035bc
 */

void BN_MONT_CTX_free(BN_MONT_CTX *mont)

{
  if (mont != (BN_MONT_CTX *)0x0) {
    BN_clear_free(&mont->RR);
    BN_clear_free(&mont->N);
    BN_clear_free(&mont->Ni);
    if ((mont->flags & 1) != 0) {
      CRYPTO_free(mont);
      return;
    }
  }
  return;
}

