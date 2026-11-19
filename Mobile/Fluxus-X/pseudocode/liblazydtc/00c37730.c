/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37730
 */

ASN1_OBJECT * OBJ_dup(ASN1_OBJECT *o)

{
  ASN1_OBJECT *pAVar1;
  
  pAVar1 = OBJ_dup(o);
  return pAVar1;
}

