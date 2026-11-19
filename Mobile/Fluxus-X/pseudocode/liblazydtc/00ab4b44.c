/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab4b44
 */

RSA * PEM_read_bio_RSAPublicKey(BIO *bp,RSA **x,undefined1 *cb,void *u)

{
  RSA *pRVar1;
  
  pRVar1 = PEM_ASN1_read_bio(d2i_RSAPublicKey,"RSA PUBLIC KEY",bp,x,cb,u);
  return pRVar1;
}

