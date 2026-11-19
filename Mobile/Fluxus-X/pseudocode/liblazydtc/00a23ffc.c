/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a23ffc
 */

int EC_KEY_print(BIO *bp,EC_KEY *key,int off)

{
  int iVar1;
  BIGNUM *pBVar2;
  
  pBVar2 = EC_KEY_get0_private_key(key);
  iVar1 = FUN_00a24044(bp,key,off,pBVar2 == (BIGNUM *)0x0);
  return iVar1;
}

