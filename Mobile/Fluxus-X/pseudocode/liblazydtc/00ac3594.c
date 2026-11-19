/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac3594
 */

void PKCS7_SIGNER_INFO_get0_algs
               (PKCS7_SIGNER_INFO *si,EVP_PKEY **pk,X509_ALGOR **pdig,X509_ALGOR **psig)

{
  if (pk != (EVP_PKEY **)0x0) {
    *pk = si->pkey;
  }
  if (pdig != (X509_ALGOR **)0x0) {
    *pdig = si->digest_alg;
  }
  if (psig != (X509_ALGOR **)0x0) {
    *psig = si->digest_enc_alg;
  }
  return;
}

