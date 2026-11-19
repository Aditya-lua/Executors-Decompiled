/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f8330
 */

void X509_ALGOR_get0(ASN1_OBJECT **paobj,int *pptype,void **ppval,X509_ALGOR *algor)

{
  ASN1_TYPE *pAVar1;
  
  if (paobj != (ASN1_OBJECT **)0x0) {
    *paobj = algor->algorithm;
  }
  if (pptype != (int *)0x0) {
    pAVar1 = algor->parameter;
    if (pAVar1 == (ASN1_TYPE *)0x0) {
      *pptype = -1;
      return;
    }
    *pptype = pAVar1->type;
    if (ppval != (void **)0x0) {
      *ppval = (pAVar1->value).ptr;
    }
  }
  return;
}

