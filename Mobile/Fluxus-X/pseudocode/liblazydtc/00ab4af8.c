/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab4af8
 */

int PEM_write_RSAPrivateKey
              (FILE *fp,RSA *x,EVP_CIPHER *enc,uchar *kstr,int klen,undefined1 *cb,void *u)

{
  int iVar1;
  
  iVar1 = PEM_ASN1_write(i2d_RSAPrivateKey,"RSA PRIVATE KEY",fp,x,enc,kstr,klen,cb,u);
  return iVar1;
}

