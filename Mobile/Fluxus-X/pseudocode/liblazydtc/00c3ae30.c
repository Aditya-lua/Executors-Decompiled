/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3ae30
 */

int EC_POINT_mul(EC_GROUP *group,EC_POINT *r,BIGNUM *n,EC_POINT *q,BIGNUM *m,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = EC_POINT_mul(group,r,n,q,m,ctx);
  return iVar1;
}

