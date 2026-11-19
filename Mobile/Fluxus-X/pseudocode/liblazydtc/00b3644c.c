/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b3644c
 */

int i2b_PVK_bio(BIO *out,EVP_PKEY *pk,int enclevel,undefined1 *cb,void *u)

{
  int iVar1;
  
  iVar1 = i2b_PVK_bio_ex((int)out,pk,enclevel,cb,u,0,0);
  return iVar1;
}

