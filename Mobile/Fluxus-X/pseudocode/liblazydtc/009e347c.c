/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e347c
 */

undefined8 tls_process_cert_verify(int *param_1,long *param_2)

{
  undefined1 uVar1;
  undefined1 uVar2;
  ushort uVar3;
  int iVar4;
  EVP_MD_CTX *ctx;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined1 *puVar11;
  uchar *out;
  ulong siz;
  uchar *in;
  undefined8 local_110;
  undefined1 auStack_104 [164];
  undefined8 local_60;
  undefined8 local_58;
  long local_48;
  
  local_48 = 0;
  local_58 = 0;
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  local_110 = 0;
  if (ctx == (EVP_MD_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x1a0,"tls_process_cert_verify");
    uVar7 = 0x50;
    uVar8 = 0xc0100;
    goto LAB_009e3730;
  }
  lVar5 = X509_get0_pubkey(*(undefined8 *)(*(long *)(param_1 + 0x246) + 0x2b8));
  if (lVar5 == 0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x1a7,"tls_process_cert_verify");
    uVar8 = 0xc0103;
    uVar7 = 0x50;
    out = (uchar *)0x0;
LAB_009e357c:
    ossl_statem_fatal(param_1,uVar7,uVar8,0);
    uVar7 = 0;
  }
  else {
    lVar6 = ssl_cert_lookup_by_pkey(lVar5,0);
    if (lVar6 == 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_lib.c",0x1ad,"tls_process_cert_verify");
      uVar7 = 0x2f;
      uVar8 = 0xdc;
      goto LAB_009e3730;
    }
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 1 & 1) == 0) {
      iVar4 = tls1_set_peer_legacy_sigalg(param_1,lVar5);
      if (iVar4 == 0) {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_lib.c",0x1be,"tls_process_cert_verify");
        uVar7 = 0x50;
        uVar8 = 0x14d;
      }
      else {
LAB_009e3618:
        iVar4 = tls1_lookup_md(*(undefined8 *)(param_1 + 0x26a),*(undefined8 *)(param_1 + 0xec),
                               &local_48);
        if (iVar4 == 0) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_lib.c",0x1c3,"tls_process_cert_verify");
          uVar8 = 0xc0103;
          uVar7 = 0x50;
        }
        else {
          if ((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 1 & 1) == 0) {
            lVar6 = param_2[1];
            if (lVar6 == 0x40) {
              iVar4 = EVP_PKEY_get_id(lVar5);
              if ((iVar4 != 0x32b) && (iVar4 = EVP_PKEY_get_id(lVar5), iVar4 != 0x3d3)) {
                lVar6 = param_2[1];
                goto LAB_009e366c;
              }
            }
            else {
LAB_009e366c:
              if ((lVar6 != 0x80) || (iVar4 = EVP_PKEY_get_id(lVar5), iVar4 != 0x3d4))
              goto LAB_009e3690;
            }
            uVar9 = param_2[1];
            uVar10 = uVar9;
LAB_009e3700:
            siz = uVar10 & 0xffffffff;
            if (siz <= uVar9) {
              in = (uchar *)*param_2;
              *param_2 = (long)(in + siz);
              param_2[1] = uVar9 - siz;
              iVar4 = FUN_009e3318(param_1,auStack_104,&local_60,&local_58);
              if (iVar4 == 0) goto LAB_009e373c;
              if (local_48 == 0) {
                uVar7 = 0;
              }
              else {
                uVar7 = EVP_MD_get0_name();
              }
              iVar4 = EVP_DigestVerifyInit_ex
                                (ctx,&local_110,uVar7,**(undefined8 **)(param_1 + 0x26a),
                                 (*(undefined8 **)(param_1 + 0x26a))[0x88],lVar5,0);
              if (iVar4 < 1) {
                ERR_new();
                ERR_set_debug("ssl/statem/statem_lib.c",0x1f0,"tls_process_cert_verify");
                uVar7 = 0x50;
                uVar8 = 0x80006;
                goto LAB_009e3730;
              }
              iVar4 = EVP_PKEY_get_id(lVar5);
              if ((iVar4 - 0x3d3U < 2) || (iVar4 == 0x32b)) {
                out = CRYPTO_malloc((int)uVar10,"ssl/statem/statem_lib.c",0x1f9);
                if (out == (uchar *)0x0) {
                  ERR_new();
                  ERR_set_debug("ssl/statem/statem_lib.c",0x1fa,"tls_process_cert_verify");
                  uVar7 = 0x50;
                  uVar8 = 0xc0100;
                  goto LAB_009e357c;
                }
                BUF_reverse(out,in,siz);
                lVar5 = *(long *)(param_1 + 0xec);
                in = out;
                if (lVar5 != 0) goto LAB_009e38ac;
LAB_009e38e0:
                if (*param_1 == 0x300) {
                  iVar4 = EVP_DigestVerifyUpdate(ctx,local_60,local_58);
                  if ((iVar4 < 1) ||
                     (iVar4 = EVP_MD_CTX_ctrl(ctx,0x1d,*(undefined4 *)
                                                        (*(long *)(param_1 + 0x246) + 8),
                                              *(long *)(param_1 + 0x246) + 0x50), iVar4 < 1)) {
                    ERR_new();
                    uVar7 = 0x210;
                    goto LAB_009e39ec;
                  }
                  iVar4 = EVP_DigestVerifyFinal(ctx,in,siz);
                  if (0 < iVar4) goto LAB_009e3970;
                  ERR_new();
                  uVar7 = 0x214;
                }
                else {
                  iVar4 = EVP_DigestVerify(ctx,in,siz,local_60,local_58);
                  if (0 < iVar4) {
LAB_009e3970:
                    if ((((param_1[0xe] == 0) &&
                         ((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0
                         )) && (iVar4 = **(int **)(param_1 + 2), 0x303 < iVar4)) &&
                       ((iVar4 != 0x10000 && (param_1[0xbc] == 1)))) {
                      uVar7 = 2;
                    }
                    else {
                      uVar7 = 3;
                    }
                    goto LAB_009e3744;
                  }
                  ERR_new();
                  uVar7 = 0x21a;
                }
                ERR_set_debug("ssl/statem/statem_lib.c",uVar7,"tls_process_cert_verify");
                uVar7 = 0x33;
                uVar8 = 0x7b;
              }
              else {
                out = (uchar *)0x0;
                lVar5 = *(long *)(param_1 + 0xec);
                if (lVar5 == 0) goto LAB_009e38e0;
LAB_009e38ac:
                if ((*(int *)(lVar5 + 0x14) != 0x390) ||
                   ((iVar4 = EVP_PKEY_CTX_set_rsa_padding(local_110,6), 0 < iVar4 &&
                    (iVar4 = EVP_PKEY_CTX_set_rsa_pss_saltlen(local_110,0xffffffff), 0 < iVar4))))
                goto LAB_009e38e0;
                ERR_new();
                uVar7 = 0x207;
LAB_009e39ec:
                ERR_set_debug("ssl/statem/statem_lib.c",uVar7,"tls_process_cert_verify");
                uVar7 = 0x50;
                uVar8 = 0x80006;
              }
              goto LAB_009e357c;
            }
            ERR_new();
            uVar7 = 0x1e0;
          }
          else {
LAB_009e3690:
            uVar9 = param_2[1] - 2;
            if (1 < (ulong)param_2[1]) {
              puVar11 = (undefined1 *)*param_2;
              uVar1 = *puVar11;
              uVar2 = puVar11[1];
              *param_2 = (long)(puVar11 + 2);
              param_2[1] = uVar9;
              uVar10 = (ulong)CONCAT11(uVar1,uVar2);
              goto LAB_009e3700;
            }
            ERR_new();
            uVar7 = 0x1db;
          }
          ERR_set_debug("ssl/statem/statem_lib.c",uVar7,"tls_process_cert_verify");
          uVar7 = 0x32;
          uVar8 = 0x9f;
        }
      }
LAB_009e3730:
      ossl_statem_fatal(param_1,uVar7,uVar8,0);
    }
    else {
      if ((ulong)param_2[1] < 2) {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_lib.c",0x1b5,"tls_process_cert_verify");
        uVar7 = 0x32;
        uVar8 = 0xf0;
        goto LAB_009e3730;
      }
      uVar3 = *(ushort *)*param_2;
      *param_2 = (long)((ushort *)*param_2 + 1);
      param_2[1] = param_2[1] - 2;
      iVar4 = tls12_check_peer_sigalg(param_1,uVar3 >> 8 | uVar3 << 8,lVar5);
      if (0 < iVar4) goto LAB_009e3618;
    }
LAB_009e373c:
    uVar7 = 0;
    out = (uchar *)0x0;
  }
LAB_009e3744:
  BIO_free(*(BIO **)(param_1 + 0x62));
  param_1[0x62] = 0;
  param_1[99] = 0;
  EVP_MD_CTX_free(ctx);
  CRYPTO_free(out);
  return uVar7;
}

