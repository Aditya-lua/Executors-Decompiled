/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe37c
 */

void ASN1_PCTX_free(ASN1_PCTX *p)

{
  CRYPTO_free(p);
  return;
}

