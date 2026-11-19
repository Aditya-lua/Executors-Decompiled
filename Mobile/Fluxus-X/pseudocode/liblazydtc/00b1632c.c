/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1632c
 */

EC_KEY * d2i_ECPrivateKey_fp(FILE *fp,EC_KEY **eckey)

{
  EC_KEY *pEVar1;
  
  pEVar1 = ASN1_d2i_fp(EC_KEY_new,d2i_ECPrivateKey,fp,eckey);
  return pEVar1;
}

