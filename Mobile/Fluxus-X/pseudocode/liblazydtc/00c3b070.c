/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3b070
 */

int EC_POINT_set_Jprojective_coordinates_GFp
              (EC_GROUP *group,EC_POINT *p,BIGNUM *x,BIGNUM *y,BIGNUM *z,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = EC_POINT_set_Jprojective_coordinates_GFp(group,p,x,y,z,ctx);
  return iVar1;
}

