/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16284
 */

DSA * d2i_DSAPrivateKey_bio(BIO *bp,DSA **dsa)

{
  DSA *pDVar1;
  
  pDVar1 = ASN1_d2i_bio(DSA_new,d2i_DSAPrivateKey,bp,dsa);
  return pDVar1;
}

