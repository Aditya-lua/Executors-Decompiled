/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab90b4
 */

int i2d_PKCS8PrivateKey_bio
              (BIO *bp,EVP_PKEY *x,EVP_CIPHER *enc,char *kstr,int klen,undefined1 *cb,void *u)

{
  int iVar1;
  
  iVar1 = FUN_00ab8d5c((int)bp,x,1,0xffffffff,enc,kstr,klen,cb,u);
  return iVar1;
}

