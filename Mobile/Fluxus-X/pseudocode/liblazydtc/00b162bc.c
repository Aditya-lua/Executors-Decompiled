/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b162bc
 */

DSA * d2i_DSA_PUBKEY_bio(BIO *bp,DSA **dsa)

{
  DSA *pDVar1;
  
  pDVar1 = ASN1_d2i_bio(DSA_new,d2i_DSA_PUBKEY,bp,dsa);
  return pDVar1;
}

