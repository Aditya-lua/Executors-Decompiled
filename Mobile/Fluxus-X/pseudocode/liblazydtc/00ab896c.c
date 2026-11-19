/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab896c
 */

int PEM_write_bio_PrivateKey
              (BIO *bp,EVP_PKEY *x,EVP_CIPHER *enc,uchar *kstr,int klen,undefined1 *cb,void *u)

{
  int iVar1;
  
  iVar1 = PEM_write_bio_PrivateKey_ex((int)bp);
  return iVar1;
}

