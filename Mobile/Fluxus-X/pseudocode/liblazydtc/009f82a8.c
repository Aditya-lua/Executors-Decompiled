/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f82a8
 */

int X509_ALGOR_set0(X509_ALGOR *alg,ASN1_OBJECT *aobj,int ptype,void *pval)

{
  int iVar1;
  ASN1_TYPE *pAVar2;
  
  iVar1 = 0;
  if (alg != (X509_ALGOR *)0x0) {
    if ((ptype != -1) && (alg->parameter == (ASN1_TYPE *)0x0)) {
      pAVar2 = ASN1_TYPE_new();
      alg->parameter = pAVar2;
      if (pAVar2 == (ASN1_TYPE *)0x0) {
        return 0;
      }
    }
    ASN1_OBJECT_free(alg->algorithm);
    alg->algorithm = aobj;
    if (ptype != 0) {
      if (ptype == -1) {
        ASN1_TYPE_free(alg->parameter);
        alg->parameter = (ASN1_TYPE *)0x0;
      }
      else {
        ASN1_TYPE_set(alg->parameter,ptype,pval);
      }
    }
    iVar1 = 1;
  }
  return iVar1;
}

