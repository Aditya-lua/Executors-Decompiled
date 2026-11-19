/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab8d20
 */

int PEM_write_bio_PKCS8PrivateKey_nid
              (BIO *bp,EVP_PKEY *x,int nid,char *kstr,int klen,undefined1 *cb,void *u)

{
  int iVar1;
  
  iVar1 = FUN_00ab8d5c((int)bp,x,0,nid,0,kstr,klen,cb,u);
  return iVar1;
}

