/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a264e4
 */

void ECDSA_SIG_free(ECDSA_SIG *sig)

{
  if (sig == (ECDSA_SIG *)0x0) {
    return;
  }
  BN_clear_free(sig->r);
  BN_clear_free(sig->s);
  CRYPTO_free(sig);
  return;
}

