/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a28448
 */

EC_GROUP * EC_GROUP_new_by_curve_name(int nid)

{
  EC_GROUP *pEVar1;
  
  pEVar1 = (EC_GROUP *)EC_GROUP_new_by_curve_name_ex(0,0,nid);
  return pEVar1;
}

