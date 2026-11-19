/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f836c
 */

void X509_ALGOR_set_md(X509_ALGOR *alg,EVP_MD *md)

{
  int n;
  ASN1_OBJECT *pAVar1;
  ASN1_TYPE *pAVar2;
  int type;
  uint uVar3;
  ulong uVar4;
  
  uVar4 = md->flags;
  type = 5;
  if ((uVar4 & 8) != 0) {
    type = -1;
  }
  n = EVP_MD_get_type(md);
  pAVar1 = OBJ_nid2obj(n);
  if (alg != (X509_ALGOR *)0x0) {
    uVar3 = (uint)uVar4;
    if (((uVar3 >> 3 & 1) == 0) && (alg->parameter == (ASN1_TYPE *)0x0)) {
      pAVar2 = ASN1_TYPE_new();
      alg->parameter = pAVar2;
      if (pAVar2 == (ASN1_TYPE *)0x0) {
        return;
      }
    }
    ASN1_OBJECT_free(alg->algorithm);
    alg->algorithm = pAVar1;
    if ((uVar3 >> 3 & 1) == 0) {
      ASN1_TYPE_set(alg->parameter,type,(void *)0x0);
      return;
    }
    ASN1_TYPE_free(alg->parameter);
    alg->parameter = (ASN1_TYPE *)0x0;
  }
  return;
}

