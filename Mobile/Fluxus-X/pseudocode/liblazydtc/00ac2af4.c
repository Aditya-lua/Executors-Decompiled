/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac2af4
 */

int PKCS7_set0_type_other(PKCS7 *p7,int type,ASN1_TYPE *other)

{
  ASN1_OBJECT *pAVar1;
  
  pAVar1 = OBJ_nid2obj(type);
  p7->type = pAVar1;
  (p7->d).other = other;
  return 1;
}

