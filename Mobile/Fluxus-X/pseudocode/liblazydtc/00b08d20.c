/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08d20
 */

ASN1_OBJECT * X509_ATTRIBUTE_get0_object(X509_ATTRIBUTE *attr)

{
  ASN1_OBJECT *pAVar1;
  
  pAVar1 = (ASN1_OBJECT *)0x0;
  if (attr != (X509_ATTRIBUTE *)0x0) {
    pAVar1 = attr->object;
  }
  return pAVar1;
}

