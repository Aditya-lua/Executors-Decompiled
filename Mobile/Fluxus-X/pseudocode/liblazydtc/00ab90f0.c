/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab90f0
 */

int i2d_PKCS8PrivateKey_nid_bio
              (BIO *bp,EVP_PKEY *x,int nid,char *kstr,int klen,undefined1 *cb,void *u)

{
  int iVar1;
  
  iVar1 = FUN_00ab8d5c((int)bp,x,1,nid,0,kstr,klen,cb,u);
  return iVar1;
}

