/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab02d0
 */

int ASN1_sign(undefined1 *i2d,X509_ALGOR *algor1,X509_ALGOR *algor2,ASN1_BIT_STRING *signature,
             char *data,EVP_PKEY *pkey,EVP_MD *type)

{
  undefined4 uVar1;
  int iVar2;
  EVP_MD_CTX *ctx;
  ASN1_TYPE *pAVar3;
  ASN1_OBJECT *pAVar4;
  void *d;
  uchar *md;
  undefined8 uVar5;
  size_t cnt;
  long lVar6;
  uint local_6c;
  void *local_68;
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  local_6c = 0;
  if (ctx == (EVP_MD_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_sign.c",0x26,"ASN1_sign");
    uVar5 = 0xc0100;
LAB_00ab0578:
    ERR_set_error(0xd,uVar5,0);
  }
  else {
    if (algor1 == (X509_ALGOR *)0x0) {
LAB_00ab03b0:
      if (algor2 != (X509_ALGOR *)0x0) {
        pAVar3 = algor2->parameter;
        if (type->pkey_type == 0x71) {
          ASN1_TYPE_free(pAVar3);
          algor2->parameter = (ASN1_TYPE *)0x0;
        }
        else if ((pAVar3 == (ASN1_TYPE *)0x0) || (pAVar3->type != 5)) {
          ASN1_TYPE_free(pAVar3);
          pAVar3 = ASN1_TYPE_new();
          algor2->parameter = pAVar3;
          if (pAVar3 == (ASN1_TYPE *)0x0) goto LAB_00ab0580;
          pAVar3->type = 5;
        }
        ASN1_OBJECT_free(algor2->algorithm);
        pAVar4 = OBJ_nid2obj(type->pkey_type);
        algor2->algorithm = pAVar4;
        if (pAVar4 == (ASN1_OBJECT *)0x0) {
LAB_00ab04fc:
          ERR_new();
          ERR_set_debug("crypto/asn1/a_sign.c",0x41,"ASN1_sign");
          uVar5 = 0xa2;
          goto LAB_00ab0578;
        }
        if (pAVar4->length == 0) goto LAB_00ab0524;
      }
      iVar2 = (*(code *)i2d)(data,0);
      if (0 < iVar2) {
        cnt = (size_t)iVar2;
        d = CRYPTO_malloc(iVar2,"crypto/asn1/a_sign.c",0x50);
        local_6c = EVP_PKEY_get_size(pkey);
        lVar6 = (long)(int)local_6c;
        md = CRYPTO_malloc(local_6c,"crypto/asn1/a_sign.c",0x52);
        if ((d == (void *)0x0) || (md == (uchar *)0x0)) {
          local_6c = 0;
          ERR_new();
          ERR_set_debug("crypto/asn1/a_sign.c",0x55,"ASN1_sign");
          uVar1 = 0xc0100;
        }
        else {
          local_68 = d;
          (*(code *)i2d)(data,&local_68);
          iVar2 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
          if (iVar2 != 0) {
            iVar2 = EVP_DigestUpdate(ctx,d,cnt);
            if (iVar2 != 0) {
              iVar2 = EVP_SignFinal(ctx,md,&local_6c,pkey);
              if (iVar2 != 0) {
                CRYPTO_free(signature->data);
                signature->data = md;
                signature->flags = signature->flags & 0xfffffffffffffff0U | 8;
                md = (uchar *)0x0;
                signature->length = local_6c;
                goto LAB_00ab0590;
              }
            }
          }
          local_6c = 0;
          ERR_new();
          ERR_set_debug("crypto/asn1/a_sign.c",0x60,"ASN1_sign");
          uVar1 = 0x80006;
        }
        ERR_set_error(0xd,uVar1,0);
        goto LAB_00ab0590;
      }
      ERR_new();
      ERR_set_debug("crypto/asn1/a_sign.c",0x4c,"ASN1_sign");
      uVar5 = 0xc0103;
      goto LAB_00ab0578;
    }
    pAVar3 = algor1->parameter;
    if (type->pkey_type == 0x71) {
      ASN1_TYPE_free(pAVar3);
      algor1->parameter = (ASN1_TYPE *)0x0;
LAB_00ab0390:
      ASN1_OBJECT_free(algor1->algorithm);
      pAVar4 = OBJ_nid2obj(type->pkey_type);
      algor1->algorithm = pAVar4;
      if (pAVar4 == (ASN1_OBJECT *)0x0) goto LAB_00ab04fc;
      if (pAVar4->length != 0) goto LAB_00ab03b0;
LAB_00ab0524:
      ERR_new();
      ERR_set_debug("crypto/asn1/a_sign.c",0x46,"ASN1_sign");
      uVar5 = 0x9a;
      goto LAB_00ab0578;
    }
    if ((pAVar3 != (ASN1_TYPE *)0x0) && (pAVar3->type == 5)) goto LAB_00ab0390;
    ASN1_TYPE_free(pAVar3);
    pAVar3 = ASN1_TYPE_new();
    algor1->parameter = pAVar3;
    if (pAVar3 != (ASN1_TYPE *)0x0) {
      pAVar3->type = 5;
      goto LAB_00ab0390;
    }
  }
LAB_00ab0580:
  d = (void *)0x0;
  md = (uchar *)0x0;
  cnt = 0;
  lVar6 = 0;
LAB_00ab0590:
  EVP_MD_CTX_free(ctx);
  CRYPTO_clear_free(d,cnt,"crypto/asn1/a_sign.c",0x6f);
  CRYPTO_clear_free(md,lVar6,"crypto/asn1/a_sign.c",0x70);
  return local_6c;
}

