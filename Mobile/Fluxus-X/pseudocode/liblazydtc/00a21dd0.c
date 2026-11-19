/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a21dd0
 */

void DSA_SIG_free(DSA_SIG *a)

{
  if (a == (DSA_SIG *)0x0) {
    return;
  }
  BN_clear_free(a->r);
  BN_clear_free(a->s);
  CRYPTO_free(a);
  return;
}

