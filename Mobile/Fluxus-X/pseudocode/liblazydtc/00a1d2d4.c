/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1d2d4
 */

void BN_RECP_CTX_free(BN_RECP_CTX *recp)

{
  if (recp != (BN_RECP_CTX *)0x0) {
    BN_free(&recp->N);
    BN_free(&recp->Nr);
    if ((recp->flags & 1) != 0) {
      CRYPTO_free(recp);
      return;
    }
  }
  return;
}

