/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e2ea0
 */

undefined8 tls_construct_cert_verify(int *param_1,undefined8 param_2)

{
  undefined4 uVar1;
  int iVar2;
  EVP_MD_CTX *ctx;
  undefined8 uVar3;
  uchar *sigret;
  long lVar4;
  long lVar5;
  undefined1 auStack_11c [164];
  undefined8 local_78;
  size_t local_70;
  undefined8 local_68;
  undefined8 local_60;
  long local_58;
  
  local_60 = 0;
  local_58 = 0;
  local_70 = 0;
  local_68 = 0;
  lVar4 = *(long *)(param_1 + 0xe0);
  if ((lVar4 == 0) || (*(long *)(param_1 + 0xe2) == 0)) {
    ERR_new();
    uVar3 = 0x11e;
LAB_009e2f8c:
    ERR_set_debug("ssl/statem/statem_lib.c",uVar3,"tls_construct_cert_verify");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    ctx = (EVP_MD_CTX *)0x0;
  }
  else {
    lVar5 = *(long *)(*(long *)(param_1 + 0xe2) + 8);
    if ((lVar5 == 0) ||
       (iVar2 = tls1_lookup_md(*(undefined8 *)(param_1 + 0x26a),lVar4,&local_58), iVar2 == 0)) {
      ERR_new();
      uVar3 = 0x124;
      goto LAB_009e2f8c;
    }
    ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
    if (ctx == (EVP_MD_CTX *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_lib.c",0x12a,"tls_construct_cert_verify");
      uVar3 = 0xc0100;
LAB_009e32a4:
      ossl_statem_fatal(param_1,0x50,uVar3,0);
    }
    else {
      iVar2 = FUN_009e3318(param_1,auStack_11c,&local_78,&local_68);
      if (iVar2 != 0) {
        if (((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 1 & 1) == 0) ||
           (iVar2 = WPACKET_put_bytes__(param_2,*(undefined2 *)(lVar4 + 8),2), iVar2 != 0)) {
          if (local_58 == 0) {
            uVar3 = 0;
          }
          else {
            uVar3 = EVP_MD_get0_name();
          }
          iVar2 = EVP_DigestSignInit_ex
                            (ctx,&local_60,uVar3,**(undefined8 **)(param_1 + 0x26a),
                             (*(undefined8 **)(param_1 + 0x26a))[0x88],lVar5,0);
          if (iVar2 < 1) {
            ERR_new();
            uVar3 = 0x13d;
          }
          else {
            if ((*(int *)(lVar4 + 0x14) != 0x390) ||
               ((iVar2 = EVP_PKEY_CTX_set_rsa_padding(local_60,6), 0 < iVar2 &&
                (iVar2 = EVP_PKEY_CTX_set_rsa_pss_saltlen(local_60,0xffffffff), 0 < iVar2)))) {
              uVar3 = local_68;
              if (*param_1 == 0x300) {
                iVar2 = EVP_DigestSignUpdate(ctx,local_78,local_68);
                if (((iVar2 < 1) ||
                    (iVar2 = EVP_MD_CTX_ctrl(ctx,0x1d,*(undefined4 *)
                                                       (*(long *)(param_1 + 0x246) + 8),
                                             *(long *)(param_1 + 0x246) + 0x50), iVar2 < 1)) ||
                   (iVar2 = EVP_DigestSignFinal(ctx,(uchar *)0x0,&local_70), iVar2 < 1)) {
                  ERR_new();
                  uVar3 = 0x154;
                  goto LAB_009e3294;
                }
                sigret = CRYPTO_malloc((int)local_70,"ssl/statem/statem_lib.c",0x157);
                if ((sigret == (uchar *)0x0) ||
                   (iVar2 = EVP_DigestSignFinal(ctx,sigret,&local_70), iVar2 < 1)) {
                  ERR_new();
                  uVar3 = 0x15a;
                  goto LAB_009e32cc;
                }
LAB_009e31d0:
                if ((*(int *)(lVar4 + 0x14) - 0x3d3U < 2) || (*(int *)(lVar4 + 0x14) == 0x32b)) {
                  BUF_reverse(sigret,(uchar *)0x0,local_70);
                }
                iVar2 = WPACKET_sub_memcpy__(param_2,sigret,local_70,2);
                if (iVar2 != 0) {
                  iVar2 = ssl3_digest_cached_records(param_1,0);
                  if (iVar2 != 0) {
                    CRYPTO_free(sigret);
                    EVP_MD_CTX_free(ctx);
                    return 1;
                  }
                  goto LAB_009e2fb0;
                }
                ERR_new();
                ERR_set_debug("ssl/statem/statem_lib.c",0x17a,"tls_construct_cert_verify");
                uVar1 = 0xc0103;
              }
              else {
                iVar2 = EVP_DigestSign(ctx,0,&local_70,local_78,local_68);
                if (iVar2 < 1) {
                  ERR_new();
                  uVar3 = 0x163;
                  goto LAB_009e3294;
                }
                sigret = CRYPTO_malloc((int)local_70,"ssl/statem/statem_lib.c",0x166);
                if ((sigret != (uchar *)0x0) &&
                   (iVar2 = EVP_DigestSign(ctx,sigret,&local_70,local_78,uVar3), 0 < iVar2))
                goto LAB_009e31d0;
                ERR_new();
                uVar3 = 0x169;
LAB_009e32cc:
                ERR_set_debug("ssl/statem/statem_lib.c",uVar3,"tls_construct_cert_verify");
                uVar1 = 0x80006;
              }
              ossl_statem_fatal(param_1,0x50,uVar1,0);
              goto LAB_009e2fb0;
            }
            ERR_new();
            uVar3 = 0x145;
          }
LAB_009e3294:
          ERR_set_debug("ssl/statem/statem_lib.c",uVar3,"tls_construct_cert_verify");
          uVar3 = 0x80006;
        }
        else {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_lib.c",0x135,"tls_construct_cert_verify");
          uVar3 = 0xc0103;
        }
        goto LAB_009e32a4;
      }
    }
  }
  sigret = (uchar *)0x0;
LAB_009e2fb0:
  CRYPTO_free(sigret);
  EVP_MD_CTX_free(ctx);
  return 0;
}

