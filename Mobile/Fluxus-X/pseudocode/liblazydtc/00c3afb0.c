/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3afb0
 */

EC_POINT * EC_POINT_dup(EC_POINT *src,EC_GROUP *group)

{
  EC_POINT *pEVar1;
  
  pEVar1 = EC_POINT_dup(src,group);
  return pEVar1;
}

