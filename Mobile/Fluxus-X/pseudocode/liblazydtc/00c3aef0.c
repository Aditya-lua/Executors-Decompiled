/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3aef0
 */

int EC_POINT_add(EC_GROUP *group,EC_POINT *r,EC_POINT *a,EC_POINT *b,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = EC_POINT_add(group,r,a,b,ctx);
  return iVar1;
}

