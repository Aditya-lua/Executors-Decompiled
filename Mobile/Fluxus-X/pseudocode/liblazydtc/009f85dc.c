/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f85dc
 */

bool ossl_x509_algor_md_to_mgf1(long *param_1,EVP_MD *param_2)

{
  ASN1_OCTET_STRING *value;
  int iVar1;
  ASN1_STRING *pAVar2;
  ASN1_VALUE *pAVar3;
  ASN1_OBJECT *pAVar4;
  ASN1_TYPE *pAVar5;
  X509_ALGOR *alg;
  ASN1_OCTET_STRING *local_38;
  
  local_38 = (ASN1_STRING *)0x0;
  *param_1 = 0;
  if ((param_2 == (EVP_MD *)0x0) || (iVar1 = EVP_MD_is_a(param_2,&DAT_002d142e), iVar1 != 0)) {
    return true;
  }
  iVar1 = EVP_MD_is_a(param_2,&DAT_002d142e);
  if (iVar1 == 0) {
    alg = (X509_ALGOR *)ASN1_item_new((ASN1_ITEM *)&DAT_00c59180);
    if (alg == (X509_ALGOR *)0x0) goto LAB_009f86d4;
    X509_ALGOR_set_md(alg,param_2);
  }
  else {
    alg = (X509_ALGOR *)0x0;
  }
  pAVar2 = ASN1_item_pack(alg,(ASN1_ITEM *)&DAT_00c59180,&local_38);
  if (pAVar2 != (ASN1_STRING *)0x0) {
    pAVar3 = ASN1_item_new((ASN1_ITEM *)&DAT_00c59180);
    *param_1 = (long)pAVar3;
    if (pAVar3 != (ASN1_VALUE *)0x0) {
      pAVar4 = OBJ_nid2obj(0x38f);
      value = local_38;
      if (*(long *)(pAVar3 + 8) == 0) {
        pAVar5 = ASN1_TYPE_new();
        *(ASN1_TYPE **)(pAVar3 + 8) = pAVar5;
        if (pAVar5 == (ASN1_TYPE *)0x0) {
          ASN1_item_free((ASN1_VALUE *)*param_1,(ASN1_ITEM *)&DAT_00c59180);
          *param_1 = 0;
          goto LAB_009f86d4;
        }
      }
      ASN1_OBJECT_free(*(ASN1_OBJECT **)pAVar3);
      *(ASN1_OBJECT **)pAVar3 = pAVar4;
      ASN1_TYPE_set(*(ASN1_TYPE **)(pAVar3 + 8),0x10,value);
      local_38 = (ASN1_STRING *)0x0;
    }
  }
LAB_009f86d4:
  ASN1_STRING_free(local_38);
  ASN1_item_free((ASN1_VALUE *)alg,(ASN1_ITEM *)&DAT_00c59180);
  return *param_1 != 0;
}

