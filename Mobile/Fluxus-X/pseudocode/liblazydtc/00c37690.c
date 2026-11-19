/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37690
 */

ASN1_OBJECT * d2i_ASN1_OBJECT(ASN1_OBJECT **a,uchar **pp,long length)

{
  ASN1_OBJECT *pAVar1;
  
  pAVar1 = d2i_ASN1_OBJECT(a,pp,length);
  return pAVar1;
}

