/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab3764
 */

int ASN1_item_verify_ctx
              (ASN1_ITEM *param_1,undefined8 *param_2,int *param_3,ASN1_VALUE *param_4,
              EVP_MD_CTX *param_5)

{
  int iVar1;
  int iVar2;
  EVP_PKEY_CTX *ctx;
  EVP_PKEY *pkey;
  char *pcVar3;
  EVP_MD *type;
  undefined8 uVar4;
  code *pcVar5;
  long lVar6;
  int local_50;
  int local_4c;
  uchar *local_48;
  
  local_48 = (uchar *)0x0;
  ctx = (EVP_PKEY_CTX *)EVP_MD_CTX_get_pkey_ctx(param_5);
  pkey = EVP_PKEY_CTX_get0_pkey(ctx);
  if (pkey == (EVP_PKEY *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_verify.c",0x7d,"ASN1_item_verify_ctx");
    uVar4 = 0xc0102;
LAB_00ab388c:
    ERR_set_error(0xd,uVar4,0);
    return -1;
  }
  if ((param_3[1] == 3) && ((*(byte *)(param_3 + 4) & 7) != 0)) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_verify.c",0x82,"ASN1_item_verify_ctx");
    uVar4 = 0xdc;
    goto LAB_00ab388c;
  }
  iVar1 = OBJ_obj2nid((ASN1_OBJECT *)*param_2);
  iVar1 = OBJ_find_sigid_algs(iVar1,&local_4c,&local_50);
  if (iVar1 == 0) {
    ERR_new();
    uVar4 = 0x88;
LAB_00ab38b4:
    ERR_set_debug("crypto/asn1/a_verify.c",uVar4,"ASN1_item_verify_ctx");
    uVar4 = 199;
LAB_00ab3974:
    ERR_set_error(0xd,uVar4,0);
    lVar6 = 0;
    iVar1 = -1;
    goto LAB_00ab3984;
  }
  if (local_4c == 0) {
    if ((pkey->type == 0) || (*(long *)&pkey[1].save_parameters != 0)) {
      if (local_50 != 0x390) goto LAB_00ab380c;
      iVar1 = EVP_PKEY_is_a(pkey,&DAT_002db996);
      if ((iVar1 == 0) && (iVar1 = EVP_PKEY_is_a(pkey,"RSA-PSS"), iVar1 == 0)) {
        ERR_new();
        uVar4 = 0xa7;
        goto LAB_00ab3968;
      }
      iVar1 = ossl_rsa_pss_to_ctx(param_5,0,param_2,pkey);
      if (iVar1 < 1) {
        ERR_new();
        ERR_set_debug("crypto/asn1/a_verify.c",0xac,"ASN1_item_verify_ctx");
        uVar4 = 0xc0103;
        goto LAB_00ab3974;
      }
      goto LAB_00ab39d4;
    }
    if ((*(long *)&pkey->references == 0) ||
       (pcVar5 = *(code **)(*(long *)&pkey->references + 200), pcVar5 == (code *)0x0)) {
      ERR_new();
      uVar4 = 0x8e;
      goto LAB_00ab38b4;
    }
    iVar1 = (*pcVar5)(param_5,param_1,param_4,param_2,param_3,pkey);
    if (0 < iVar1) {
      if (iVar1 == 1) {
        lVar6 = 0;
        goto LAB_00ab3984;
      }
      goto LAB_00ab39d8;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/a_verify.c",0x99,"ASN1_item_verify_ctx");
    uVar4 = 0x80006;
  }
  else {
LAB_00ab380c:
    pcVar3 = OBJ_nid2sn(local_50);
    iVar1 = EVP_PKEY_is_a(pkey,pcVar3);
    if (iVar1 == 0) {
      ERR_new();
      uVar4 = 0xb2;
LAB_00ab3968:
      ERR_set_debug("crypto/asn1/a_verify.c",uVar4,"ASN1_item_verify_ctx");
      uVar4 = 200;
      goto LAB_00ab3974;
    }
    if (local_4c == 0) {
      type = (EVP_MD *)0x0;
    }
    else {
      pcVar3 = OBJ_nid2sn(local_4c);
      type = EVP_get_digestbyname(pcVar3);
      if (type == (EVP_MD *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/asn1/a_verify.c",0xba,"ASN1_item_verify_ctx");
        uVar4 = 0xa1;
        goto LAB_00ab3974;
      }
    }
    iVar1 = EVP_DigestVerifyInit(param_5,(EVP_PKEY_CTX **)0x0,type,(ENGINE *)0x0,pkey);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/a_verify.c",0xc4,"ASN1_item_verify_ctx");
      ERR_set_error(0xd,0x80006,0);
      iVar1 = 0;
      lVar6 = 0;
      goto LAB_00ab3984;
    }
LAB_00ab39d4:
    iVar1 = -1;
LAB_00ab39d8:
    iVar2 = ASN1_item_i2d(param_4,&local_48,param_1);
    if (iVar2 < 1) {
      ERR_new();
      ERR_set_debug("crypto/asn1/a_verify.c",0xcd,"ASN1_item_verify_ctx");
      uVar4 = 0xc0103;
    }
    else {
      if (local_48 != (uchar *)0x0) {
        lVar6 = (long)iVar2;
        iVar1 = EVP_DigestVerify(param_5,*(undefined8 *)(param_3 + 2),(long)*param_3,local_48,lVar6)
        ;
        if (iVar1 < 1) {
          ERR_new();
          ERR_set_debug("crypto/asn1/a_verify.c",0xd9,"ASN1_item_verify_ctx");
          ERR_set_error(0xd,0x80006,0);
        }
        else {
          iVar1 = 1;
        }
        goto LAB_00ab3984;
      }
      ERR_new();
      ERR_set_debug("crypto/asn1/a_verify.c",0xd1,"ASN1_item_verify_ctx");
      uVar4 = 0xc0100;
    }
  }
  ERR_set_error(0xd,uVar4,0);
  lVar6 = 0;
LAB_00ab3984:
  CRYPTO_clear_free(local_48,lVar6,"crypto/asn1/a_verify.c",0xde);
  return iVar1;
}

