/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3b060
 */

int EC_POINT_dbl(EC_GROUP *group,EC_POINT *r,EC_POINT *a,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = EC_POINT_dbl(group,r,a,ctx);
  return iVar1;
}

