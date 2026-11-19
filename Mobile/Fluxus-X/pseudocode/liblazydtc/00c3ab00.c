/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3ab00
 */

int EC_GROUP_set_generator(EC_GROUP *group,EC_POINT *generator,BIGNUM *order,BIGNUM *cofactor)

{
  int iVar1;
  
  iVar1 = EC_GROUP_set_generator(group,generator,order,cofactor);
  return iVar1;
}

