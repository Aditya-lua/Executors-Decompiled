/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009aad0c
 */

undefined8 ssl3_setup_key_block(long param_1)

{
  uchar *md;
  int num;
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  void *pvVar5;
  EVP_MD *type;
  EVP_MD *type_00;
  EVP_MD_CTX *ctx;
  EVP_MD_CTX *ctx_00;
  undefined8 uVar6;
  long lVar7;
  long lVar8;
  size_t __n;
  uint uVar9;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  uchar auStack_84 [20];
  undefined1 auStack_70 [16];
  
  if (*(long *)(param_1 + 0x310) == 0) {
    iVar1 = ssl_cipher_get_evp(*(undefined8 *)(param_1 + 0x9a8),*(undefined8 *)(param_1 + 0x918),
                               &local_90,&uStack_98,0,0,&local_a0,0);
    if (iVar1 == 0) {
      ossl_statem_send_fatal(param_1,0x50);
    }
    else {
      ssl_evp_cipher_free(*(undefined8 *)(param_1 + 800));
      *(undefined8 *)(param_1 + 800) = local_90;
      ssl_evp_md_free(*(undefined8 *)(param_1 + 0x328));
      *(undefined8 *)(param_1 + 0x328) = uStack_98;
      *(undefined8 *)(param_1 + 0x340) = local_a0;
      iVar1 = EVP_MD_get_size();
      if (-1 < iVar1) {
        iVar2 = EVP_CIPHER_get_key_length(local_90);
        iVar3 = EVP_CIPHER_get_iv_length(local_90);
        iVar4 = iVar2 + iVar1 + iVar3;
        num = iVar4 * 2;
        CRYPTO_clear_free(*(undefined8 *)(param_1 + 0x318),*(undefined8 *)(param_1 + 0x310),
                          "ssl/s3_enc.c",0x13a);
        lVar8 = (long)num;
        *(undefined8 *)(param_1 + 0x310) = 0;
        *(undefined8 *)(param_1 + 0x318) = 0;
        pvVar5 = CRYPTO_malloc(num,"ssl/s3_enc.c",0x11a);
        if (pvVar5 == (void *)0x0) {
          ERR_new();
          ERR_set_debug("ssl/s3_enc.c",0x11b,"ssl3_setup_key_block");
          ossl_statem_fatal(param_1,0x50,0xc0100,0);
          return 0;
        }
        *(long *)(param_1 + 0x310) = lVar8;
        *(void **)(param_1 + 0x318) = pvVar5;
        type = (EVP_MD *)
               ssl_evp_md_fetch(**(undefined8 **)(param_1 + 0x9a8),4,
                                (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
        type_00 = (EVP_MD *)
                  ssl_evp_md_fetch(**(undefined8 **)(param_1 + 0x9a8),0x40,
                                   (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
        ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
        ctx_00 = (EVP_MD_CTX *)EVP_MD_CTX_new();
        if ((((type == (EVP_MD *)0x0) || (type_00 == (EVP_MD *)0x0)) || (ctx == (EVP_MD_CTX *)0x0))
           || (ctx_00 == (EVP_MD_CTX *)0x0)) {
          ERR_new();
          ERR_set_debug("ssl/s3_enc.c",0x25,"ssl3_generate_key_block");
          ossl_statem_fatal(param_1,0x50,0xc0100,0);
          uVar6 = 0;
        }
        else {
          if (0 < iVar4) {
            lVar7 = 0;
            __n = 0;
            uVar9 = (iVar1 + iVar2 + iVar3) * 2;
            iVar1 = 0x41;
            do {
              if (0xf < __n) {
                ERR_new();
                uVar6 = 0x2c;
LAB_009ab0ac:
                ERR_set_debug("ssl/s3_enc.c",uVar6,"ssl3_generate_key_block");
                ossl_statem_fatal(param_1,0x50,0xc0103,0);
                uVar6 = 0;
                goto LAB_009ab0d0;
              }
              __n = __n + 1;
              memset(auStack_70,iVar1,__n);
              iVar4 = EVP_DigestInit_ex(ctx_00,type_00,(ENGINE *)0x0);
              if ((((iVar4 == 0) || (iVar4 = EVP_DigestUpdate(ctx_00,auStack_70,__n), iVar4 == 0))
                  || ((iVar4 = EVP_DigestUpdate(ctx_00,(void *)(*(long *)(param_1 + 0x918) + 0x50),
                                                *(size_t *)(*(long *)(param_1 + 0x918) + 8)),
                      iVar4 == 0 ||
                      ((iVar4 = EVP_DigestUpdate(ctx_00,(void *)(param_1 + 0x140),0x20), iVar4 == 0
                       || (iVar4 = EVP_DigestUpdate(ctx_00,(void *)(param_1 + 0x160),0x20),
                          iVar4 == 0)))))) ||
                 ((iVar4 = EVP_DigestFinal_ex(ctx_00,auStack_84,(uint *)0x0), iVar4 == 0 ||
                  (((iVar4 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), iVar4 == 0 ||
                    (iVar4 = EVP_DigestUpdate(ctx,(void *)(*(long *)(param_1 + 0x918) + 0x50),
                                              *(size_t *)(*(long *)(param_1 + 0x918) + 8)),
                    iVar4 == 0)) || (iVar4 = EVP_DigestUpdate(ctx,auStack_84,0x14), iVar4 == 0))))))
              {
                ERR_new();
                uVar6 = 0x3d;
                goto LAB_009ab0ac;
              }
              md = (uchar *)((long)pvVar5 + lVar7);
              lVar7 = lVar7 + 0x10;
              if (lVar8 < lVar7) {
                iVar4 = EVP_DigestFinal_ex(ctx,auStack_84,(uint *)0x0);
                if (iVar4 == 0) {
                  ERR_new();
                  uVar6 = 0x42;
                  goto LAB_009ab0ac;
                }
                memcpy(md,auStack_84,(ulong)uVar9);
              }
              else {
                iVar4 = EVP_DigestFinal_ex(ctx,md,(uint *)0x0);
                if (iVar4 == 0) {
                  ERR_new();
                  uVar6 = 0x48;
                  goto LAB_009ab0ac;
                }
              }
              iVar1 = iVar1 + 1;
              uVar9 = uVar9 - 0x10;
            } while (lVar7 < lVar8);
          }
          OPENSSL_cleanse(auStack_84,0x14);
          uVar6 = 1;
        }
LAB_009ab0d0:
        EVP_MD_CTX_free(ctx);
        EVP_MD_CTX_free(ctx_00);
        ssl_evp_md_free(type);
        ssl_evp_md_free(type_00);
        if ((*(byte *)(param_1 + 0x9e9) >> 3 & 1) != 0) {
          return uVar6;
        }
        *(undefined4 *)(param_1 + 0x180) = 1;
        lVar8 = *(long *)(*(long *)(param_1 + 0x918) + 0x2f8);
        if (lVar8 == 0) {
          return uVar6;
        }
        iVar1 = *(int *)(lVar8 + 0x24);
        if ((iVar1 == 4) || (iVar1 == 0x20)) {
          *(undefined4 *)(param_1 + 0x180) = 0;
          return uVar6;
        }
        return uVar6;
      }
    }
    uVar6 = 0;
  }
  else {
    uVar6 = 1;
  }
  return uVar6;
}

