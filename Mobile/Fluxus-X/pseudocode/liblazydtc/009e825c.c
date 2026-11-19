/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e825c
 */

undefined8 tls_construct_new_session_ticket(long param_1,undefined8 param_2)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  undefined8 uVar7;
  time_t tVar8;
  long lVar9;
  uchar *in;
  EVP_CIPHER_CTX *ctx;
  SSL_SESSION *in_00;
  EVP_CIPHER *cipher;
  char *pcVar10;
  uint uVar11;
  code *pcVar12;
  long lVar13;
  undefined4 local_e0 [2];
  undefined1 local_d8;
  undefined1 local_d7;
  undefined1 local_d6;
  undefined1 local_d5;
  undefined1 local_d4;
  undefined1 local_d3;
  undefined1 local_d2;
  undefined1 local_d1;
  long local_d0;
  long lStack_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  uchar auStack_b0 [16];
  ulong local_a0;
  int local_98;
  int local_94;
  uchar *local_90;
  long local_88;
  long local_80;
  uchar *local_78;
  uchar *local_70;
  uchar *local_68;
  
  lVar13 = *(long *)(param_1 + 0xb88);
  local_e0[0] = 0;
  if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
      (iVar2 = **(int **)(param_1 + 8), 0x303 < iVar2)) && (iVar2 != 0x10000)) {
    uVar5 = ssl_handshake_md(param_1);
    iVar2 = EVP_MD_get_size();
    if (iVar2 < 0) {
      ERR_new();
      pcVar10 = "tls_construct_new_session_ticket";
      uVar5 = 0xf4d;
    }
    else {
      if ((*(long *)(param_1 + 0x1d78) == 0) && (*(int *)(param_1 + 0x4d0) == 0)) {
        lVar6 = *(long *)(param_1 + 0x918);
      }
      else {
        lVar6 = ssl_session_dup(*(undefined8 *)(param_1 + 0x918),0);
        if (lVar6 == 0) {
          return 0;
        }
        SSL_SESSION_free(*(SSL_SESSION **)(param_1 + 0x918));
        *(long *)(param_1 + 0x918) = lVar6;
      }
      uVar7 = ssl_generate_session_id(param_1,lVar6);
      if ((int)uVar7 == 0) {
        return uVar7;
      }
      iVar3 = RAND_bytes_ex(**(undefined8 **)(param_1 + 0x9a8),local_e0,4,0);
      if (0 < iVar3) {
        lVar6 = *(long *)(param_1 + 0x918);
        *(undefined4 *)(lVar6 + 0x350) = local_e0[0];
        uVar7 = *(undefined8 *)(param_1 + 0x1d80);
        local_d2 = (undefined1)((ulong)uVar7 >> 8);
        local_d3 = (undefined1)((ulong)uVar7 >> 0x10);
        local_d4 = (undefined1)((ulong)uVar7 >> 0x18);
        local_d5 = (undefined1)((ulong)uVar7 >> 0x20);
        local_d1 = (undefined1)uVar7;
        local_d6 = (undefined1)((ulong)uVar7 >> 0x28);
        local_d8 = (undefined1)((ulong)uVar7 >> 0x38);
        local_d7 = (undefined1)((ulong)uVar7 >> 0x30);
        uVar5 = tls13_hkdf_expand(param_1,uVar5,param_1 + 0x604,"resumption",10,&local_d8,8,
                                  lVar6 + 0x50,(long)iVar2,1);
        if ((int)uVar5 == 0) {
          return uVar5;
        }
        *(long *)(*(long *)(param_1 + 0x918) + 8) = (long)iVar2;
        tVar8 = time((time_t *)0x0);
        lVar6 = *(long *)(param_1 + 0x918);
        *(time_t *)(lVar6 + 0x2e0) = tVar8;
        ssl_session_calculate_timeout(lVar6);
        lVar6 = *(long *)(param_1 + 0x918);
        if (*(long *)(param_1 + 0x488) != 0) {
          CRYPTO_free(*(void **)(lVar6 + 0x358));
          lVar9 = CRYPTO_memdup(*(undefined8 *)(param_1 + 0x488),*(undefined8 *)(param_1 + 0x490),
                                "ssl/statem/statem_srvr.c",0xf85);
          lVar6 = *(long *)(param_1 + 0x918);
          *(long *)(lVar6 + 0x358) = lVar9;
          if (lVar9 == 0) {
            *(undefined8 *)(lVar6 + 0x360) = 0;
            ERR_new();
            ERR_set_debug("ssl/statem/statem_srvr.c",0xf88,"tls_construct_new_session_ticket");
            uVar1 = 0xc0100;
            goto LAB_009e8638;
          }
          *(undefined8 *)(lVar6 + 0x360) = *(undefined8 *)(param_1 + 0x490);
        }
        *(undefined4 *)(lVar6 + 0x354) = *(undefined4 *)(param_1 + 0x1d40);
        goto LAB_009e8448;
      }
      ERR_new();
      pcVar10 = "tls_construct_new_session_ticket";
      uVar5 = 0xf69;
    }
  }
  else {
LAB_009e8448:
    pcVar12 = *(code **)(lVar13 + 0x3f8);
    if ((pcVar12 == (code *)0x0) ||
       (iVar2 = (*pcVar12)(param_1,*(undefined8 *)(lVar13 + 0x408)), iVar2 != 0)) {
      uVar1 = local_e0[0];
      if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0) ||
          ((iVar2 = **(int **)(param_1 + 8), iVar2 < 0x304 || (iVar2 == 0x10000)))) ||
         ((uVar11 = (uint)*(undefined8 *)(param_1 + 0x9e8), (uVar11 >> 0xe & 1) == 0 &&
          (((uVar11 >> 0x18 & 1) != 0 || (*(int *)(param_1 + 0x1d40) == 0)))))) {
        lVar13 = *(long *)(param_1 + 0xb88);
        iVar2 = i2d_SSL_SESSION(*(SSL_SESSION **)(param_1 + 0x918),(uchar **)0x0);
        if ((iVar2 == 0) || (0xff00 < iVar2)) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0xe6a,"construct_stateless_ticket");
          ossl_statem_fatal(param_1,0x50,0xc0103,0);
          lVar6 = 0;
          ctx = (EVP_CIPHER_CTX *)0x0;
          in = (uchar *)0x0;
LAB_009e872c:
          iVar2 = -1;
        }
        else {
          in = CRYPTO_malloc(iVar2,"ssl/statem/statem_srvr.c",0xe6d);
          if (in == (uchar *)0x0) {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_srvr.c",0xe6f,"construct_stateless_ticket");
            ossl_statem_fatal(param_1,0x50,0xc0100,0);
            lVar6 = 0;
            ctx = (EVP_CIPHER_CTX *)0x0;
            goto LAB_009e872c;
          }
          ctx = EVP_CIPHER_CTX_new();
          lVar6 = ssl_hmac_new(lVar13);
          if ((ctx == (EVP_CIPHER_CTX *)0x0) || (lVar6 == 0)) {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_srvr.c",0xe76,"construct_stateless_ticket");
            uVar5 = 0xc0100;
LAB_009e8720:
            ossl_statem_fatal(param_1,0x50,uVar5,0);
            goto LAB_009e872c;
          }
          local_68 = in;
          iVar3 = i2d_SSL_SESSION(*(SSL_SESSION **)(param_1 + 0x918),&local_68);
          if (iVar3 == 0) {
            ERR_new();
            uVar5 = 0xe7c;
LAB_009e8710:
            ERR_set_debug("ssl/statem/statem_srvr.c",uVar5,"construct_stateless_ticket");
            uVar5 = 0xc0103;
            goto LAB_009e8720;
          }
          local_90 = in;
          in_00 = d2i_SSL_SESSION((SSL_SESSION **)0x0,&local_90,(long)iVar2);
          if (in_00 == (SSL_SESSION *)0x0) {
            ERR_new();
            uVar5 = 0xe86;
            goto LAB_009e8710;
          }
          iVar3 = i2d_SSL_SESSION(in_00,(uchar **)0x0);
          if ((iVar3 == 0) || (iVar2 < iVar3)) {
            ERR_new();
            uVar5 = 0xe8d;
LAB_009e87fc:
            ERR_set_debug("ssl/statem/statem_srvr.c",uVar5,"construct_stateless_ticket");
            ossl_statem_fatal(param_1,0x50,0xc0103,0);
            SSL_SESSION_free(in_00);
            goto LAB_009e872c;
          }
          local_68 = in;
          iVar2 = i2d_SSL_SESSION(in_00,&local_68);
          if (iVar2 == 0) {
            ERR_new();
            uVar5 = 0xe93;
            goto LAB_009e87fc;
          }
          SSL_SESSION_free(in_00);
          pcVar12 = *(code **)(lVar13 + 0x248);
          if (pcVar12 == (code *)0x0) {
            pcVar12 = *(code **)(lVar13 + 0x240);
            if (pcVar12 != (code *)0x0) {
              uVar5 = ssl_hmac_get0_HMAC_CTX(lVar6);
              goto LAB_009e8834;
            }
            cipher = (EVP_CIPHER *)
                     EVP_CIPHER_fetch(**(undefined8 **)(param_1 + 0x9a8),"AES-256-CBC",
                                      (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
            if (cipher == (EVP_CIPHER *)0x0) {
              ossl_statem_send_fatal(param_1,0x50);
              goto LAB_009e872c;
            }
            iVar2 = EVP_CIPHER_get_iv_length();
            if ((((iVar2 < 0) ||
                 (iVar4 = RAND_bytes_ex(**(undefined8 **)(param_1 + 0x9a8),auStack_b0,(long)iVar2,0)
                 , iVar4 < 1)) ||
                (iVar4 = EVP_EncryptInit_ex(ctx,cipher,(ENGINE *)0x0,
                                            (uchar *)(*(long *)(lVar13 + 0x238) + 0x20),auStack_b0),
                iVar4 == 0)) ||
               (iVar4 = ssl_hmac_init(lVar6,*(undefined8 *)(lVar13 + 0x238),0x20,"SHA256"),
               iVar4 == 0)) {
              EVP_CIPHER_free(cipher);
              ERR_new();
              uVar5 = 0xee1;
              goto LAB_009e8710;
            }
            EVP_CIPHER_free(cipher);
            uStack_b8 = *(undefined8 *)(lVar13 + 0x230);
            local_c0 = *(undefined8 *)(lVar13 + 0x228);
LAB_009e8868:
            iVar4 = FUN_009ebf0c(param_1,param_2,uVar1,&local_d8);
            if (iVar4 == 0) goto LAB_009e872c;
            iVar4 = WPACKET_get_total_written(param_2,&lStack_c8);
            if (((iVar4 != 0) && (iVar4 = WPACKET_memcpy(param_2,&local_c0,0x10), iVar4 != 0)) &&
               (iVar2 = WPACKET_memcpy(param_2,auStack_b0,(long)iVar2), iVar2 != 0)) {
              iVar2 = WPACKET_reserve_bytes(param_2,(long)(iVar3 + 0x20),&local_70);
              if ((((iVar2 != 0) &&
                   (iVar2 = EVP_EncryptUpdate(ctx,local_70,&local_94,in,iVar3), iVar2 != 0)) &&
                  ((((iVar2 = WPACKET_allocate_bytes(param_2,(long)local_94,&local_78), iVar2 != 0
                     && (((local_70 == local_78 &&
                          (iVar2 = EVP_EncryptFinal(ctx,local_70 + local_94,&local_98), iVar2 != 0))
                         && (iVar2 = WPACKET_allocate_bytes(param_2,(long)local_98,&local_78),
                            iVar2 != 0)))) &&
                    ((local_70 + local_94 == local_78 && (local_98 + local_94 <= iVar3 + 0x20)))) &&
                   (iVar2 = WPACKET_get_total_written(param_2,&local_d0), iVar2 != 0)))) &&
                 (((iVar2 = ssl_hmac_update(lVar6,*(long *)(*(long *)(param_1 + 0x88) + 8) +
                                                  lStack_c8,local_d0 - lStack_c8), iVar2 != 0 &&
                   (iVar2 = WPACKET_reserve_bytes(param_2,0x40,&local_80), iVar2 != 0)) &&
                  ((iVar2 = ssl_hmac_final(lVar6,local_80,&local_a0,0x40), iVar2 != 0 &&
                   (((local_a0 < 0x41 &&
                     (iVar2 = WPACKET_allocate_bytes(param_2,local_a0,&local_88), iVar2 != 0)) &&
                    (local_80 == local_88)))))))) {
                iVar2 = WPACKET_close(param_2);
                if (iVar2 != 0) {
                  iVar2 = 1;
                  goto LAB_009e8730;
                }
                ERR_new();
                uVar5 = 0xf0c;
                goto LAB_009e8710;
              }
            }
            ERR_new();
            uVar5 = 0xf06;
            goto LAB_009e8710;
          }
          uVar5 = ssl_hmac_get0_EVP_MAC_CTX(lVar6);
LAB_009e8834:
          iVar2 = (*pcVar12)(param_1,&local_c0,auStack_b0,ctx,uVar5,1);
          if (iVar2 != 0) {
            if (iVar2 < 0) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_srvr.c",0xec6,"construct_stateless_ticket");
              uVar5 = 0xea;
              goto LAB_009e8720;
            }
            iVar2 = EVP_CIPHER_CTX_get_iv_length(ctx);
            if (-1 < iVar2) goto LAB_009e8868;
            ERR_new();
            uVar5 = 0xecb;
            goto LAB_009e8710;
          }
          if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0) ||
              (iVar2 = **(int **)(param_1 + 8), iVar2 < 0x304)) || (iVar2 == 0x10000)) {
            iVar2 = WPACKET_put_bytes__(param_2,0,4);
            if ((iVar2 != 0) && (iVar2 = WPACKET_put_bytes__(param_2,0,2), iVar2 != 0)) {
              CRYPTO_free(in);
              EVP_CIPHER_CTX_free(ctx);
              ssl_hmac_free(lVar6);
              goto LAB_009e89ac;
            }
            ERR_new();
            uVar5 = 0xebd;
            goto LAB_009e8710;
          }
          iVar2 = 0;
        }
LAB_009e8730:
        CRYPTO_free(in);
        EVP_CIPHER_CTX_free(ctx);
        ssl_hmac_free(lVar6);
        if (iVar2 != 1) {
          if (iVar2 != 0) {
            return 0;
          }
          *(long *)(param_1 + 0x1d80) = *(long *)(param_1 + 0x1d80) + 1;
          *(long *)(param_1 + 0x1d78) = *(long *)(param_1 + 0x1d78) + 1;
          if (0 < *(int *)(param_1 + 0xa9c)) {
            *(int *)(param_1 + 0xa9c) = *(int *)(param_1 + 0xa9c) + -1;
          }
          return 2;
        }
LAB_009e89ac:
        if ((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) {
          iVar2 = **(int **)(param_1 + 8);
          if (iVar2 < 0x304) {
            return 1;
          }
          if (iVar2 == 0x10000) {
            return 1;
          }
          uVar5 = tls_construct_extensions(param_1,param_2,0x2000,0,0);
          if ((int)uVar5 == 0) {
            return uVar5;
          }
          *(long *)(param_1 + 0x1d80) = *(long *)(param_1 + 0x1d80) + 1;
          *(long *)(param_1 + 0x1d78) = *(long *)(param_1 + 0x1d78) + 1;
          if (0 < *(int *)(param_1 + 0xa9c)) {
            *(int *)(param_1 + 0xa9c) = *(int *)(param_1 + 0xa9c) + -1;
          }
          ssl_update_cache(param_1,2);
        }
        return 1;
      }
      uVar5 = FUN_009ebf0c(param_1,param_2,local_e0[0],&local_d8);
      if ((int)uVar5 == 0) {
        return uVar5;
      }
      iVar2 = WPACKET_memcpy(param_2,*(long *)(param_1 + 0x918) + 600,
                             *(undefined8 *)(*(long *)(param_1 + 0x918) + 0x250));
      if ((iVar2 != 0) && (iVar2 = WPACKET_close(param_2), iVar2 != 0)) goto LAB_009e89ac;
      ERR_new();
      pcVar10 = "construct_stateful_ticket";
      uVar5 = 0xf23;
    }
    else {
      ERR_new();
      pcVar10 = "tls_construct_new_session_ticket";
      uVar5 = 0xf92;
    }
  }
  ERR_set_debug("ssl/statem/statem_srvr.c",uVar5,pcVar10);
  uVar1 = 0xc0103;
LAB_009e8638:
  ossl_statem_fatal(param_1,0x50,uVar1,0);
  return 0;
}

