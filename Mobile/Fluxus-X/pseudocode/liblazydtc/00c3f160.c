/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3f160
 */

int PEM_write_bio_RSAPrivateKey
              (BIO *bp,RSA *x,EVP_CIPHER *enc,uchar *kstr,int klen,undefined1 *cb,void *u)

{
  int iVar1;
  
  iVar1 = PEM_write_bio_RSAPrivateKey(bp,x,enc,kstr,klen,cb,u);
  return iVar1;
}

