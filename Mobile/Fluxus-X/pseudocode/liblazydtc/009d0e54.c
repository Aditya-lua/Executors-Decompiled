/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d0e54
 */

undefined8
tls_psk_do_binder(long param_1,EVP_MD *param_2,void *param_3,size_t param_4,void *param_5,
                 void **param_6,long param_7,int param_8,int param_9)

{
  char *pcVar1;
  long lVar2;
  ulong uVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  EVP_MD_CTX *ctx;
  size_t cnt;
  undefined8 uVar7;
  ulong uVar8;
  size_t len;
  EVP_PKEY *pkey;
  size_t local_170;
  void *local_168 [8];
  undefined1 auStack_128 [64];
  undefined1 auStack_e8 [64];
  uchar auStack_a8 [72];
  
  iVar5 = EVP_MD_get_size(param_2);
  if (iVar5 < 0) {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions.c",0x5cf,"tls_psk_do_binder");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
LAB_009d10c8:
    ctx = (EVP_MD_CTX *)0x0;
LAB_009d1104:
    pkey = (EVP_PKEY *)0x0;
  }
  else {
    if (param_9 == 0) {
      bVar4 = false;
    }
    else {
      bVar4 = false;
      if ((*(int *)(param_1 + 0x84) == 2) &&
         (bVar4 = false, *(int *)(*(long *)(param_1 + 0x918) + 0x354) == 0)) {
        bVar4 = *(int *)(param_7 + 0x354) != 0;
      }
    }
    pcVar1 = "ext binder";
    if (param_9 == 0) {
      pcVar1 = "res binder";
    }
    lVar2 = param_1 + 0x544;
    if ((*(int *)(param_1 + 0x38) == 0 && param_9 != 0) && !bVar4) {
      lVar2 = param_7 + 0x10;
    }
    iVar6 = tls13_generate_secret
                      (param_1,param_2,0,param_7 + 0x50,*(undefined8 *)(param_7 + 8),lVar2);
    if (iVar6 == 0) goto LAB_009d10c8;
    ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
    if (((ctx == (EVP_MD_CTX *)0x0) ||
        (iVar6 = EVP_DigestInit_ex(ctx,param_2,(ENGINE *)0x0), iVar6 < 1)) ||
       (iVar6 = EVP_DigestFinal_ex(ctx,auStack_a8,(uint *)0x0), iVar6 < 1)) {
      ERR_new();
      uVar7 = 0x5fd;
LAB_009d10e8:
      ERR_set_debug("ssl/statem/extensions.c",uVar7,"tls_psk_do_binder");
      uVar7 = 0xc0103;
LAB_009d10f8:
      ossl_statem_fatal(param_1,0x50,uVar7,0);
      goto LAB_009d1104;
    }
    len = (size_t)iVar5;
    iVar5 = tls13_hkdf_expand(param_1,param_2,lVar2,pcVar1,10,auStack_a8,len,auStack_e8,len,1);
    if ((iVar5 == 0) ||
       (iVar5 = tls13_derive_finishedkey(param_1,param_2,auStack_e8,auStack_128,len), iVar5 == 0))
    goto LAB_009d1104;
    iVar5 = EVP_DigestInit_ex(ctx,param_2,(ENGINE *)0x0);
    if (iVar5 < 1) {
      ERR_new();
      uVar7 = 0x60f;
      goto LAB_009d10e8;
    }
    if (*(int *)(param_1 + 0x8e8) == 1) {
      cnt = BIO_ctrl(*(BIO **)(param_1 + 0x188),3,0,local_168);
      if (0 < (long)cnt) {
        if (*(int *)(param_1 + 0x38) == 0) {
LAB_009d11a0:
          iVar5 = EVP_DigestUpdate(ctx,local_168[0],cnt);
          if (0 < iVar5) goto LAB_009d11b0;
          ERR_new();
          uVar7 = 0x638;
        }
        else {
          if (2 < cnt - 1) {
            uVar8 = (ulong)*(byte *)((long)local_168[0] + 1) << 0x10 |
                    (ulong)*(byte *)((long)local_168[0] + 2) << 8 |
                    (ulong)*(byte *)((long)local_168[0] + 3);
            uVar3 = (cnt - 4) - uVar8;
            if (((uVar8 <= cnt - 4) && (3 < uVar3)) &&
               (uVar8 = (ulong)*(byte *)((long)local_168[0] + uVar8 + 5) << 0x10 |
                        (ulong)*(byte *)((long)local_168[0] + uVar8 + 6) << 8 |
                        (ulong)*(byte *)((long)local_168[0] + uVar8 + 7), uVar8 <= uVar3 - 4)) {
              cnt = (4 - uVar3) + cnt + uVar8;
              goto LAB_009d11a0;
            }
          }
          ERR_new();
          uVar7 = 0x631;
        }
        goto LAB_009d10e8;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/extensions.c",0x620,"tls_psk_do_binder");
      uVar7 = 0x14c;
      goto LAB_009d10f8;
    }
LAB_009d11b0:
    iVar5 = EVP_DigestUpdate(ctx,param_3,param_4);
    if ((iVar5 < 1) || (iVar5 = EVP_DigestFinal_ex(ctx,auStack_a8,(uint *)0x0), iVar5 < 1)) {
      ERR_new();
      uVar7 = 0x63f;
      goto LAB_009d10e8;
    }
    pkey = (EVP_PKEY *)
           EVP_PKEY_new_raw_private_key_ex
                     (**(undefined8 **)(param_1 + 0x9a8),&DAT_002c35d3,
                      (*(undefined8 **)(param_1 + 0x9a8))[0x88],auStack_128,len);
    if (pkey == (EVP_PKEY *)0x0) {
      ERR_new();
      uVar7 = 0x647;
    }
    else {
      if (param_8 == 0) {
        param_6 = local_168;
      }
      local_170 = len;
      uVar7 = EVP_MD_get0_name(param_2);
      iVar5 = EVP_DigestSignInit_ex
                        (ctx,0,uVar7,**(undefined8 **)(param_1 + 0x9a8),
                         (*(undefined8 **)(param_1 + 0x9a8))[0x88],pkey,0);
      if ((((0 < iVar5) && (iVar5 = EVP_DigestSignUpdate(ctx,auStack_a8,len), 0 < iVar5)) &&
          (iVar5 = EVP_DigestSignFinal(ctx,(uchar *)param_6,&local_170), 0 < iVar5)) &&
         (local_170 == len)) {
        if ((param_8 == 0) && (iVar5 = CRYPTO_memcmp(param_5,param_6,len), iVar5 != 0)) {
          ERR_new();
          ERR_set_debug("ssl/statem/extensions.c",0x65e,"tls_psk_do_binder");
          ossl_statem_fatal(param_1,0x2f,0xfd,0);
          uVar7 = 0;
        }
        else {
          uVar7 = 1;
        }
        goto LAB_009d110c;
      }
      ERR_new();
      uVar7 = 0x654;
    }
    ERR_set_debug("ssl/statem/extensions.c",uVar7,"tls_psk_do_binder");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
  }
  uVar7 = 0xffffffff;
LAB_009d110c:
  OPENSSL_cleanse(auStack_e8,0x40);
  OPENSSL_cleanse(auStack_128,0x40);
  EVP_PKEY_free(pkey);
  EVP_MD_CTX_free(ctx);
  return uVar7;
}

