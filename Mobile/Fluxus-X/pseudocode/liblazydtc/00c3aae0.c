/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3aae0
 */

EC_GROUP * EC_GROUP_new_curve_GFp(BIGNUM *p,BIGNUM *a,BIGNUM *b,BN_CTX *ctx)

{
  EC_GROUP *pEVar1;
  
  pEVar1 = EC_GROUP_new_curve_GFp(p,a,b,ctx);
  return pEVar1;
}

