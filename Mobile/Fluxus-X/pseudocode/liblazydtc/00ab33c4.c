/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab33c4
 */

int ASN1_verify(undefined1 *i2d,X509_ALGOR *algor1,ASN1_BIT_STRING *signature,char *data,
               EVP_PKEY *pkey)

{
  int iVar1;
  int iVar2;
  EVP_MD_CTX *ctx;
  char *name;
  EVP_MD *type;
  void *d;
  undefined8 uVar3;
  void *local_58;
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (ctx == (EVP_MD_CTX *)0x0) {
    ERR_new();
    uVar3 = 0x24;
LAB_00ab3470:
    ERR_set_debug("crypto/asn1/a_verify.c",uVar3,"ASN1_verify");
    uVar3 = 0xc0100;
  }
  else {
    iVar1 = OBJ_obj2nid(algor1->algorithm);
    name = OBJ_nid2sn(iVar1);
    type = EVP_get_digestbyname(name);
    if (type == (EVP_MD *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/a_verify.c",0x2a,"ASN1_verify");
      uVar3 = 0xa1;
    }
    else if ((signature->type == 3) && ((signature->flags & 7) != 0)) {
      ERR_new();
      ERR_set_debug("crypto/asn1/a_verify.c",0x2f,"ASN1_verify");
      uVar3 = 0xdc;
    }
    else {
      iVar1 = (*(code *)i2d)(data,0);
      if (0 < iVar1) {
        d = CRYPTO_malloc(iVar1,"crypto/asn1/a_verify.c",0x38);
        if (d == (void *)0x0) {
          ERR_new();
          uVar3 = 0x3a;
          goto LAB_00ab3470;
        }
        local_58 = d;
        (*(code *)i2d)(data,&local_58);
        iVar2 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
        if (iVar2 == 0) {
          CRYPTO_clear_free(d,iVar1,"crypto/asn1/a_verify.c",0x43);
LAB_00ab35f0:
          ERR_new();
          uVar3 = 0x46;
        }
        else {
          iVar2 = EVP_DigestUpdate(ctx,d,(long)iVar1);
          CRYPTO_clear_free(d,iVar1,"crypto/asn1/a_verify.c",0x43);
          if (iVar2 == 0) goto LAB_00ab35f0;
          iVar1 = EVP_VerifyFinal(ctx,signature->data,signature->length,pkey);
          if (0 < iVar1) {
            iVar1 = 1;
            goto LAB_00ab3594;
          }
          ERR_new();
          uVar3 = 0x4d;
        }
        ERR_set_debug("crypto/asn1/a_verify.c",uVar3,"ASN1_verify");
        ERR_set_error(0xd,0x80006,0);
        iVar1 = 0;
        goto LAB_00ab3594;
      }
      ERR_new();
      ERR_set_debug("crypto/asn1/a_verify.c",0x35,"ASN1_verify");
      uVar3 = 0xc0103;
    }
  }
  ERR_set_error(0xd,uVar3,0);
  iVar1 = -1;
LAB_00ab3594:
  EVP_MD_CTX_free(ctx);
  return iVar1;
}

