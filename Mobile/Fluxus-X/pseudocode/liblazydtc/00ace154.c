/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ace154
 */

undefined8 FUN_00ace154(void)

{
  int iVar1;
  long lVar2;
  X509_ALGOR *pXVar3;
  ASN1_STRING *a;
  ASN1_STRING *a_00;
  ASN1_OBJECT *pAVar4;
  X509_ALGOR *in_x3;
  X509_ALGOR *in_x4;
  uchar *local_148;
  undefined8 uStack_140;
  undefined8 local_138;
  undefined8 uStack_130;
  long local_128;
  uchar *local_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  long local_100;
  uchar *local_f8;
  undefined8 uStack_f0;
  undefined8 local_e8;
  undefined8 uStack_e0;
  long local_d8;
  uchar auStack_c4 [128];
  int local_44;
  X509_ALGOR *local_40;
  X509_ALGOR *local_38;
  
  local_40 = in_x4;
  local_38 = in_x3;
  lVar2 = EVP_MD_CTX_get_pkey_ctx();
  iVar1 = EVP_PKEY_CTX_get_rsa_padding(lVar2,&local_44);
  if (iVar1 < 1) {
    return 0;
  }
  if (local_44 != 6) {
    return 2;
  }
  if (*(long *)(lVar2 + 0x20) != 0) {
    OSSL_PARAM_construct_octet_string(&local_148,"algorithm-id",auStack_c4,0x80);
    local_100 = local_128;
    uStack_118 = uStack_140;
    local_120 = local_148;
    uStack_108 = uStack_130;
    uStack_110 = local_138;
    OSSL_PARAM_construct_end(&local_148);
    local_d8 = local_128;
    uStack_e0 = uStack_130;
    local_e8 = local_138;
    uStack_f0 = uStack_140;
    local_f8 = local_148;
    iVar1 = EVP_PKEY_CTX_get_params(lVar2,&local_120);
    lVar2 = local_100;
    if (iVar1 < 1) {
      return 0;
    }
    if (local_100 == 0) {
      return 0;
    }
    if (in_x3 != (X509_ALGOR *)0x0) {
      local_148 = auStack_c4;
      pXVar3 = d2i_X509_ALGOR(&local_38,&local_148,local_100);
      if (pXVar3 == (X509_ALGOR *)0x0) {
        return 0;
      }
      in_x4 = local_40;
    }
    if (in_x4 == (X509_ALGOR *)0x0) {
      return 3;
    }
    local_148 = auStack_c4;
    pXVar3 = d2i_X509_ALGOR(&local_40,&local_148,lVar2);
    if (pXVar3 == (X509_ALGOR *)0x0) {
      return 0;
    }
    return 3;
  }
  a = (ASN1_STRING *)ossl_rsa_ctx_to_pss_string(lVar2);
  if (a == (ASN1_STRING *)0x0) {
    return 0;
  }
  if (local_40 == (X509_ALGOR *)0x0) {
LAB_00ace2bc:
    pXVar3 = local_38;
    pAVar4 = OBJ_nid2obj(0x390);
    iVar1 = X509_ALGOR_set0(pXVar3,pAVar4,0x10,a);
    if (iVar1 != 0) {
      return 3;
    }
  }
  else {
    a_00 = ASN1_STRING_dup(a);
    pXVar3 = local_40;
    if (a_00 != (ASN1_STRING *)0x0) {
      pAVar4 = OBJ_nid2obj(0x390);
      iVar1 = X509_ALGOR_set0(pXVar3,pAVar4,0x10,a_00);
      if (iVar1 == 0) {
        ASN1_STRING_free(a);
        goto LAB_00ace2fc;
      }
      goto LAB_00ace2bc;
    }
  }
  a_00 = a;
LAB_00ace2fc:
  ASN1_STRING_free(a_00);
  return 0;
}

