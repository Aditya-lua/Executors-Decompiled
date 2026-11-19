/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0774
 */

int ASN1_item_sign_ctx(ASN1_ITEM *it,X509_ALGOR *algor1,X509_ALGOR *algor2,
                      ASN1_BIT_STRING *signature,void *asn,EVP_MD_CTX *ctx)

{
  undefined4 uVar1;
  int iVar2;
  int dig_nid;
  long lVar3;
  EVP_PKEY_CTX *ctx_00;
  EVP_PKEY *pEVar4;
  int *piVar5;
  X509_ALGOR *pXVar6;
  ASN1_OBJECT *pAVar7;
  undefined8 uVar8;
  code *pcVar9;
  uchar *puVar10;
  int *local_188;
  undefined8 uStack_180;
  undefined8 local_178;
  undefined8 uStack_170;
  long local_168;
  int local_160 [32];
  int *local_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  long local_c0;
  int *local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  long local_98;
  long local_88;
  long local_80;
  uchar *local_78;
  X509_ALGOR *local_70;
  X509_ALGOR *local_68;
  
  local_80 = 0;
  local_78 = (uchar *)0x0;
  local_88 = 0;
  local_70 = algor2;
  local_68 = algor1;
  lVar3 = EVP_MD_CTX_get0_md(ctx);
  ctx_00 = (EVP_PKEY_CTX *)EVP_MD_CTX_get_pkey_ctx(ctx);
  pEVar4 = EVP_PKEY_CTX_get0_pkey(ctx_00);
  if (pEVar4 == (EVP_PKEY *)0x0) {
    ERR_new();
    uVar8 = 0xa6;
LAB_00ab09b0:
    ERR_set_debug("crypto/asn1/a_sign.c",uVar8,"ASN1_item_sign_ctx");
    uVar8 = 0xd9;
LAB_00ab09bc:
    ERR_set_error(0xd,uVar8,0);
LAB_00ab09c4:
    lVar3 = 0;
  }
  else {
    if (*(long *)&pEVar4->references != 0) {
      pcVar9 = *(code **)(*(long *)&pEVar4->references + 0xd0);
      if (pcVar9 == (code *)0x0) {
LAB_00ab0960:
        if (lVar3 == 0) {
          ERR_new();
          uVar8 = 0xeb;
          goto LAB_00ab09b0;
        }
        iVar2 = EVP_PKEY_get_id(pEVar4);
        if (iVar2 == 0x494) {
          iVar2 = 0x494;
        }
        else {
          iVar2 = **(int **)&pEVar4->references;
        }
        dig_nid = EVP_MD_get_type(lVar3);
        iVar2 = OBJ_find_sigid_by_algs(local_160,dig_nid,iVar2);
        pXVar6 = local_68;
        if (iVar2 == 0) {
          ERR_new();
          uVar8 = 0xf6;
LAB_00ab0c10:
          ERR_set_debug("crypto/asn1/a_sign.c",uVar8,"ASN1_item_sign_ctx");
          uVar8 = 0xc6;
          goto LAB_00ab09bc;
        }
        iVar2 = 5;
        if ((*(byte *)(*(long *)&pEVar4->references + 8) & 4) == 0) {
          iVar2 = -1;
        }
        if (local_68 != (X509_ALGOR *)0x0) {
          pAVar7 = OBJ_nid2obj(local_160[0]);
          X509_ALGOR_set0(pXVar6,pAVar7,iVar2,(void *)0x0);
        }
        pXVar6 = local_70;
        if (local_70 != (X509_ALGOR *)0x0) {
          pAVar7 = OBJ_nid2obj(local_160[0]);
          X509_ALGOR_set0(pXVar6,pAVar7,iVar2,(void *)0x0);
        }
        goto LAB_00ab0aa0;
      }
      iVar2 = (*pcVar9)(ctx,it,asn,algor1,algor2,signature);
      if (iVar2 == 1) {
        local_80 = (long)signature->length;
        lVar3 = 0;
        puVar10 = (uchar *)0x0;
        goto LAB_00ab09cc;
      }
      if (0 < iVar2) {
        if (iVar2 == 2) goto LAB_00ab0960;
        goto LAB_00ab0aa0;
      }
      ERR_new();
      ERR_set_debug("crypto/asn1/a_sign.c",0xe2,"ASN1_item_sign_ctx");
      uVar8 = 0x80006;
      goto LAB_00ab09bc;
    }
    piVar5 = (int *)EVP_MD_CTX_get_pkey_ctx(ctx);
    if (piVar5 == (int *)0x0) {
LAB_00ab097c:
      ERR_new();
      uVar8 = 0xb2;
      goto LAB_00ab09b0;
    }
    iVar2 = *piVar5;
    if ((((0x30 < iVar2 - 0x10U) ||
         ((1L << ((ulong)(iVar2 - 0x10U) & 0x3f) & 0x1000000010001U) == 0)) && (iVar2 != 0x80)) &&
       (iVar2 != 0x100)) goto LAB_00ab097c;
    OSSL_PARAM_construct_octet_string(&local_188,"algorithm-id",local_160,0x80);
    local_c0 = local_168;
    uStack_d8 = uStack_180;
    local_e0 = local_188;
    uStack_c8 = uStack_170;
    uStack_d0 = local_178;
    OSSL_PARAM_construct_end(&local_188);
    local_98 = local_168;
    uStack_a0 = uStack_170;
    local_a8 = local_178;
    uStack_b0 = uStack_180;
    local_b8 = local_188;
    iVar2 = EVP_PKEY_CTX_get_params(piVar5,&local_e0);
    lVar3 = local_c0;
    if (iVar2 < 1) goto LAB_00ab09c4;
    if (local_c0 == 0) {
      ERR_new();
      uVar8 = 0xbf;
      goto LAB_00ab0c10;
    }
    if (algor1 != (X509_ALGOR *)0x0) {
      local_188 = local_160;
      pXVar6 = d2i_X509_ALGOR(&local_68,(uchar **)&local_188,local_c0);
      if (pXVar6 != (X509_ALGOR *)0x0) {
        algor2 = local_70;
        goto LAB_00ab0914;
      }
      ERR_new();
      uVar8 = 199;
LAB_00ab0b64:
      ERR_set_debug("crypto/asn1/a_sign.c",uVar8,"ASN1_item_sign_ctx");
      uVar8 = 0xc0103;
      goto LAB_00ab09bc;
    }
LAB_00ab0914:
    if (algor2 != (X509_ALGOR *)0x0) {
      local_188 = local_160;
      pXVar6 = d2i_X509_ALGOR(&local_70,(uchar **)&local_188,lVar3);
      if (pXVar6 == (X509_ALGOR *)0x0) {
        ERR_new();
        uVar8 = 0xd0;
        goto LAB_00ab0b64;
      }
    }
LAB_00ab0aa0:
    iVar2 = ASN1_item_i2d(asn,&local_78,it);
    if (iVar2 < 1) {
      local_80 = 0;
      ERR_new();
      uVar8 = 0x109;
      goto LAB_00ab0b64;
    }
    lVar3 = (long)iVar2;
    iVar2 = EVP_DigestSign(ctx,0,&local_88,local_78,lVar3);
    if (iVar2 != 0) {
      local_80 = local_88;
      puVar10 = CRYPTO_malloc((int)local_88,"crypto/asn1/a_sign.c",0x113);
      if ((puVar10 == (uchar *)0x0) || (local_78 == (uchar *)0x0)) {
        local_80 = 0;
        ERR_new();
        ERR_set_debug("crypto/asn1/a_sign.c",0x116,"ASN1_item_sign_ctx");
        uVar1 = 0xc0100;
      }
      else {
        iVar2 = EVP_DigestSign(ctx,puVar10,&local_80,local_78,lVar3);
        if (iVar2 != 0) {
          CRYPTO_free(signature->data);
          signature->length = (int)local_80;
          signature->data = puVar10;
          signature->flags = signature->flags & 0xfffffffffffffff0U | 8;
          goto LAB_00ab09c8;
        }
        local_80 = 0;
        ERR_new();
        ERR_set_debug("crypto/asn1/a_sign.c",0x11c,"ASN1_item_sign_ctx");
        uVar1 = 0x80006;
      }
      ERR_set_error(0xd,uVar1,0);
      goto LAB_00ab09cc;
    }
    local_80 = 0;
    ERR_new();
    ERR_set_debug("crypto/asn1/a_sign.c",0x10f,"ASN1_item_sign_ctx");
    ERR_set_error(0xd,0x80006,0);
  }
LAB_00ab09c8:
  puVar10 = (uchar *)0x0;
LAB_00ab09cc:
  CRYPTO_clear_free(local_78,lVar3,"crypto/asn1/a_sign.c",0x12a);
  CRYPTO_clear_free(puVar10,local_88,"crypto/asn1/a_sign.c",299);
  return (int)local_80;
}

