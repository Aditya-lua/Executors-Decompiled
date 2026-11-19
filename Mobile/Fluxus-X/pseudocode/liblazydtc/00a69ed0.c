/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a69ed0
 */

X509_ALGOR *
PKCS5_pbe2_set_scrypt
          (EVP_CIPHER *param_1,void *param_2,int param_3,void *param_4,undefined8 param_5,
          undefined8 param_6,undefined8 param_7)

{
  int iVar1;
  int iVar2;
  PBE2PARAM *a;
  ASN1_OBJECT *pAVar3;
  ASN1_TYPE *pAVar4;
  EVP_CIPHER_CTX *ctx;
  ASN1_VALUE *val;
  ASN1_INTEGER *pAVar5;
  undefined8 uVar6;
  long lVar7;
  X509_ALGOR *pXVar8;
  uchar auStack_70 [16];
  
  if (param_1 == (EVP_CIPHER *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/p5_scrypt.c",0x36,"PKCS5_pbe2_set_scrypt");
    uVar6 = 0xc0102;
  }
  else {
    iVar1 = EVP_PBE_scrypt(0,0,0,0);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/p5_scrypt.c",0x3b,"PKCS5_pbe2_set_scrypt");
      uVar6 = 0xe3;
    }
    else {
      iVar1 = EVP_CIPHER_get_type(param_1);
      if (iVar1 != 0) {
        a = PBE2PARAM_new();
        if (a == (PBE2PARAM *)0x0) {
LAB_00a69f9c:
          pXVar8 = (X509_ALGOR *)0x0;
LAB_00a69fa0:
          ERR_new();
          ERR_set_debug("crypto/asn1/p5_scrypt.c",0x89,"PKCS5_pbe2_set_scrypt");
          ERR_set_error(0xd,0xc0100,0);
        }
        else {
          pXVar8 = a->encryption;
          pAVar3 = OBJ_nid2obj(iVar1);
          pXVar8->algorithm = pAVar3;
          pAVar4 = ASN1_TYPE_new();
          pXVar8->parameter = pAVar4;
          if (pAVar4 == (ASN1_TYPE *)0x0) goto LAB_00a69f9c;
          iVar2 = EVP_CIPHER_get_iv_length(param_1);
          if (iVar2 == 0) {
LAB_00a6a0b8:
            ctx = EVP_CIPHER_CTX_new();
joined_r0x00a6a0bc:
            if (ctx == (EVP_CIPHER_CTX *)0x0) goto LAB_00a69f9c;
            iVar2 = EVP_CipherInit_ex(ctx,param_1,(ENGINE *)0x0,(uchar *)0x0,auStack_70,0);
            if (iVar2 == 0) {
LAB_00a6a2bc:
              pXVar8 = (X509_ALGOR *)0x0;
              goto LAB_00a6a068;
            }
            iVar2 = EVP_CIPHER_param_to_asn1(ctx,pXVar8->parameter);
            if (iVar2 < 1) {
              ERR_new();
              ERR_set_debug("crypto/asn1/p5_scrypt.c",0x61,"PKCS5_pbe2_set_scrypt");
              ERR_set_error(0xd,0x72,0);
              goto LAB_00a6a2bc;
            }
            EVP_CIPHER_CTX_free(ctx);
            lVar7 = 0;
            if (iVar1 == 0x25) {
              iVar1 = EVP_CIPHER_get_key_length(param_1);
              lVar7 = (long)iVar1;
            }
            X509_ALGOR_free(a->keyfunc);
            val = ASN1_item_new((ASN1_ITEM *)&DAT_00c5e8f0);
            if (val == (ASN1_VALUE *)0x0) {
LAB_00a6a238:
              pXVar8 = (X509_ALGOR *)0x0;
LAB_00a6a23c:
              ERR_new();
              ERR_set_debug("crypto/asn1/p5_scrypt.c",0xcc,"pkcs5_scrypt_set");
              ERR_set_error(0xd,0xc0100,0);
LAB_00a6a26c:
              ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5e8f0);
              X509_ALGOR_free(pXVar8);
              pXVar8 = (X509_ALGOR *)0x0;
              a->keyfunc = (X509_ALGOR *)0x0;
            }
            else {
              iVar1 = 8;
              if (param_3 != 0) {
                iVar1 = param_3;
              }
              iVar2 = ASN1_STRING_set(*(ASN1_STRING **)val,param_2,iVar1);
              if (iVar2 == 0) goto LAB_00a6a238;
              if ((param_2 == (void *)0x0) &&
                 (iVar1 = RAND_bytes(*(uchar **)(*(long *)val + 8),iVar1), iVar1 < 1)) {
                pXVar8 = (X509_ALGOR *)0x0;
                goto LAB_00a6a26c;
              }
              iVar1 = ASN1_INTEGER_set_uint64(*(undefined8 *)(val + 8),param_5);
              if (((iVar1 == 0) ||
                  (iVar1 = ASN1_INTEGER_set_uint64(*(undefined8 *)(val + 0x10),param_6), iVar1 == 0)
                  ) || (iVar1 = ASN1_INTEGER_set_uint64(*(undefined8 *)(val + 0x18),param_7),
                       iVar1 == 0)) goto LAB_00a6a238;
              if (lVar7 != 0) {
                pAVar5 = ASN1_INTEGER_new();
                *(ASN1_INTEGER **)(val + 0x20) = pAVar5;
                if ((pAVar5 == (ASN1_INTEGER *)0x0) ||
                   (iVar1 = ASN1_INTEGER_set_int64(pAVar5,lVar7), iVar1 == 0)) goto LAB_00a6a238;
              }
              pXVar8 = X509_ALGOR_new();
              if (pXVar8 == (X509_ALGOR *)0x0) goto LAB_00a6a23c;
              pAVar3 = OBJ_nid2obj(0x3cd);
              pXVar8->algorithm = pAVar3;
              lVar7 = ASN1_TYPE_pack_sequence(&DAT_00c5e8f0,val,&pXVar8->parameter);
              if (lVar7 == 0) goto LAB_00a6a23c;
              ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5e8f0);
              a->keyfunc = pXVar8;
              pXVar8 = X509_ALGOR_new();
              if (pXVar8 != (X509_ALGOR *)0x0) {
                pAVar3 = OBJ_nid2obj(0xa1);
                pXVar8->algorithm = pAVar3;
                uVar6 = PBE2PARAM_it();
                lVar7 = ASN1_TYPE_pack_sequence(uVar6,a,&pXVar8->parameter);
                if (lVar7 != 0) {
                  PBE2PARAM_free(a);
                  return pXVar8;
                }
              }
            }
            goto LAB_00a69fa0;
          }
          iVar2 = EVP_CIPHER_get_iv_length(param_1);
          if (param_4 != (void *)0x0) {
            memcpy(auStack_70,param_4,(long)iVar2);
            ctx = EVP_CIPHER_CTX_new();
            goto joined_r0x00a6a0bc;
          }
          iVar2 = RAND_bytes(auStack_70,iVar2);
          if (0 < iVar2) goto LAB_00a6a0b8;
          pXVar8 = (X509_ALGOR *)0x0;
        }
        ctx = (EVP_CIPHER_CTX *)0x0;
        goto LAB_00a6a068;
      }
      ERR_new();
      ERR_set_debug("crypto/asn1/p5_scrypt.c",0x41,"PKCS5_pbe2_set_scrypt");
      uVar6 = 0x6c;
    }
  }
  ERR_set_error(0xd,uVar6,0);
  pXVar8 = (X509_ALGOR *)0x0;
  ctx = (EVP_CIPHER_CTX *)0x0;
  a = (PBE2PARAM *)0x0;
LAB_00a6a068:
  PBE2PARAM_free(a);
  X509_ALGOR_free(pXVar8);
  EVP_CIPHER_CTX_free(ctx);
  return (X509_ALGOR *)0x0;
}

