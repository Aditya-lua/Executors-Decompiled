/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab4b6c
 */

RSA * PEM_read_RSAPublicKey(FILE *fp,RSA **x,undefined1 *cb,void *u)

{
  RSA *pRVar1;
  
  pRVar1 = PEM_ASN1_read(d2i_RSAPublicKey,"RSA PUBLIC KEY",fp,x,cb,u);
  return pRVar1;
}

