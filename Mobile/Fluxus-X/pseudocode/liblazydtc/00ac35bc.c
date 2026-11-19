/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac35bc
 */

void PKCS7_RECIP_INFO_get0_alg(PKCS7_RECIP_INFO *ri,X509_ALGOR **penc)

{
  if (penc != (X509_ALGOR **)0x0) {
    *penc = ri->key_enc_algor;
  }
  return;
}

