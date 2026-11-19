/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3031c
 */

EC_GROUP * EC_GROUP_new(EC_METHOD *meth)

{
  EC_GROUP *pEVar1;
  
  pEVar1 = (EC_GROUP *)ossl_ec_group_new_ex(0,0,meth);
  return pEVar1;
}

