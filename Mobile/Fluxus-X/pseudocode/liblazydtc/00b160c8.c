/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b160c8
 */

RSA * d2i_RSA_PUBKEY_fp(FILE *fp,RSA **rsa)

{
  RSA *pRVar1;
  
  pRVar1 = ASN1_d2i_fp(RSA_new,d2i_RSA_PUBKEY,fp,rsa);
  return pRVar1;
}

