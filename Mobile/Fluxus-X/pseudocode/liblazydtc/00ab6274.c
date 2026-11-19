/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab6274
 */

int PEM_ASN1_write_bio(undefined1 *i2d,char *name,BIO *bp,void *x,EVP_CIPHER *enc,uchar *kstr,
                      int klen,undefined1 *cb,void *u)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  char *__s;
  size_t sVar5;
  EVP_MD *md;
  undefined8 uVar6;
  uchar *out;
  uint uVar7;
  uchar *puVar8;
  EVP_CIPHER_CTX *ctx;
  long lVar9;
  byte local_4c8 [16];
  uchar auStack_4b8 [64];
  uchar local_478 [1024];
  uchar *local_78;
  int local_70 [4];
  
  local_70[0] = 0;
  local_70[1] = 0;
  if (enc == (EVP_CIPHER *)0x0) {
    __s = (char *)0x0;
LAB_00ab633c:
    iVar1 = (*(code *)i2d)(x,0);
    if (0 < iVar1) {
      out = CRYPTO_malloc(iVar1 + 0x14,"crypto/pem/pem_lib.c",0x15b);
      if (out == (uchar *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/pem/pem_lib.c",0x15d,"PEM_ASN1_write_bio");
        uVar6 = 0xc0100;
LAB_00ab647c:
        ERR_set_error(9,uVar6,0);
      }
      else {
        local_78 = out;
        iVar2 = (*(code *)i2d)(x,&local_78);
        local_70[1] = iVar2;
        if (enc == (EVP_CIPHER *)0x0) {
          ctx = (EVP_CIPHER_CTX *)0x0;
          local_478[0] = '\0';
LAB_00ab6490:
          iVar2 = PEM_write_bio(bp,name,(char *)local_478,out,(long)iVar2);
          uVar7 = (uint)(0 < iVar2);
          local_70[1] = iVar2;
          goto LAB_00ab63ec;
        }
        if (kstr == (uchar *)0x0) {
          if (cb == (undefined1 *)0x0) {
            klen = PEM_def_callback((char *)local_478,0x400,1,u);
          }
          else {
            klen = (*(code *)cb)();
          }
          if (klen < 1) {
            ERR_new();
            ERR_set_debug("crypto/pem/pem_lib.c",0x16a,"PEM_ASN1_write_bio");
            uVar6 = 0x6f;
            goto LAB_00ab647c;
          }
          kstr = local_478;
        }
        iVar2 = EVP_CIPHER_get_iv_length(enc);
        iVar2 = RAND_bytes(local_4c8,iVar2);
        if (0 < iVar2) {
          md = EVP_md5();
          iVar2 = EVP_BytesToKey(enc,md,local_4c8,kstr,klen,1,auStack_4b8,(uchar *)0x0);
          if (iVar2 != 0) {
            if (kstr == local_478) {
              OPENSSL_cleanse(local_478,0x400);
            }
            local_478[0] = '\0';
            sVar5 = strlen((char *)local_478);
            BIO_snprintf((char *)(local_478 + sVar5),0x400 - sVar5,"Proc-Type: 4,%s\n","ENCRYPTED");
            iVar3 = EVP_CIPHER_get_iv_length(enc);
            sVar5 = strlen((char *)local_478);
            puVar8 = local_478 + sVar5;
            iVar2 = 0x400 - (int)sVar5;
            iVar4 = BIO_snprintf((char *)puVar8,(long)iVar2,"DEK-Info: %s,",__s);
            if (0 < iVar4) {
              iVar2 = iVar2 - iVar4;
              puVar8 = puVar8 + iVar4;
              if (0 < iVar3) {
                lVar9 = 0;
                do {
                  iVar4 = BIO_snprintf((char *)puVar8,(long)iVar2,"%02X",(ulong)local_4c8[lVar9]);
                  if (iVar4 < 1) goto LAB_00ab65fc;
                  lVar9 = lVar9 + 1;
                  iVar2 = iVar2 - iVar4;
                  puVar8 = puVar8 + iVar4;
                } while (lVar9 < iVar3);
              }
              if (1 < iVar2) {
                puVar8[0] = '\n';
                puVar8[1] = '\0';
              }
            }
LAB_00ab65fc:
            ctx = EVP_CIPHER_CTX_new();
            if (((ctx == (EVP_CIPHER_CTX *)0x0) ||
                (iVar2 = EVP_EncryptInit_ex(ctx,enc,(ENGINE *)0x0,auStack_4b8,local_4c8), iVar2 == 0
                )) || ((iVar2 = EVP_EncryptUpdate(ctx,out,local_70,out,local_70[1]), iVar2 == 0 ||
                       (iVar2 = EVP_EncryptFinal_ex(ctx,out + local_70[0],local_70 + 1), iVar2 == 0)
                       ))) {
              uVar7 = 0;
              goto LAB_00ab63ec;
            }
            iVar2 = local_70[1] + local_70[0];
            local_70[1] = iVar2;
            goto LAB_00ab6490;
          }
        }
      }
      ctx = (EVP_CIPHER_CTX *)0x0;
      uVar7 = 0;
      goto LAB_00ab63ec;
    }
    ERR_new();
    ERR_set_debug("crypto/pem/pem_lib.c",0x155,"PEM_ASN1_write_bio");
    uVar6 = 0x8000d;
  }
  else {
    __s = (char *)EVP_CIPHER_get0_name(enc);
    if (((__s != (char *)0x0) && (iVar1 = EVP_CIPHER_get_iv_length(enc), iVar1 != 0)) &&
       (iVar1 = EVP_CIPHER_get_iv_length(enc), iVar1 < 0x11)) {
      sVar5 = strlen(__s);
      iVar1 = EVP_CIPHER_get_iv_length(enc);
      if (sVar5 + (long)(iVar1 << 1) + 0x24 < 0x401) goto LAB_00ab633c;
    }
    ERR_new();
    ERR_set_debug("crypto/pem/pem_lib.c",0x14f,"PEM_ASN1_write_bio");
    uVar6 = 0x71;
  }
  ERR_set_error(9,uVar6,0);
  ctx = (EVP_CIPHER_CTX *)0x0;
  iVar1 = 0;
  uVar7 = 0;
  out = (uchar *)0x0;
LAB_00ab63ec:
  OPENSSL_cleanse(auStack_4b8,0x40);
  OPENSSL_cleanse(local_4c8,0x10);
  EVP_CIPHER_CTX_free(ctx);
  OPENSSL_cleanse(local_478,0x400);
  CRYPTO_clear_free(out,iVar1,"crypto/pem/pem_lib.c",0x19a);
  return uVar7;
}

