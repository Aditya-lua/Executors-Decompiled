/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16214
 */

DSA * d2i_DSAPrivateKey_fp(FILE *fp,DSA **dsa)

{
  DSA *pDVar1;
  
  pDVar1 = ASN1_d2i_fp(DSA_new,d2i_DSAPrivateKey,fp,dsa);
  return pDVar1;
}

