/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c3404
 */

/* WARNING: Type propagation algorithm not settling */

uint tls_decrypt_ticket(long param_1,void *param_2,ulong param_3,void *param_4,size_t param_5,
                       undefined8 *param_6)

{
  uchar *in;
  uint uVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  long *ptr;
  EVP_CIPHER_CTX *ctx;
  size_t len;
  undefined8 uVar5;
  EVP_CIPHER *cipher;
  uchar *out;
  uint uVar6;
  code *pcVar7;
  long lVar8;
  SSL_SESSION *ses;
  int local_e0;
  int local_dc;
  uchar *local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  uchar *local_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  uchar *local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  
  if (param_3 == 0) {
    uVar6 = 3;
LAB_009c3508:
    EVP_CIPHER_CTX_free((EVP_CIPHER_CTX *)0x0);
    ses = (SSL_SESSION *)0x0;
  }
  else {
    lVar8 = *(long *)(param_1 + 0xb88);
    if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0) ||
        (iVar3 = **(int **)(param_1 + 8), iVar3 < 0x304)) || (iVar3 == 0x10000)) {
      uVar6 = 4;
      if ((0x1f < param_3) && (*(long *)(param_1 + 0xaf8) == 0)) goto LAB_009c348c;
      goto LAB_009c3508;
    }
    if (param_3 < 0x20) {
      uVar6 = 4;
      goto LAB_009c3508;
    }
LAB_009c348c:
    ptr = (long *)ssl_hmac_new(lVar8);
    if (ptr == (long *)0x0) {
      uVar6 = 0;
      goto LAB_009c3508;
    }
    ctx = EVP_CIPHER_CTX_new();
    if (ctx == (EVP_CIPHER_CTX *)0x0) {
      uVar6 = 0;
      ses = (SSL_SESSION *)0x0;
    }
    else {
      if (*(code **)(lVar8 + 0x248) == (code *)0x0) {
        pcVar7 = *(code **)(lVar8 + 0x240);
        if (pcVar7 != (code *)0x0) {
          uVar5 = ssl_hmac_get0_HMAC_CTX(ptr);
          iVar3 = (*pcVar7)(param_1,param_2,(long)param_2 + 0x10,ctx,uVar5,0);
          goto joined_r0x009c3684;
        }
        iVar3 = memcmp(param_2,(void *)(lVar8 + 0x228),0x10);
        if (iVar3 != 0) goto LAB_009c38b8;
        cipher = (EVP_CIPHER *)
                 EVP_CIPHER_fetch(**(undefined8 **)(param_1 + 0x9a8),"AES-256-CBC",
                                  (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
        if (cipher != (EVP_CIPHER *)0x0) {
          uVar5 = *(undefined8 *)(lVar8 + 0x238);
          if (*ptr == 0) {
LAB_009c3738:
            if ((ptr[1] == 0) || (iVar3 = ssl_hmac_old_init(ptr,uVar5,0x20,"SHA256"), iVar3 < 1))
            goto LAB_009c3828;
          }
          else {
            OSSL_PARAM_construct_utf8_string(&local_d8,"digest","SHA256",0);
            local_90 = local_b8;
            uStack_a8 = uStack_d0;
            local_b0 = local_d8;
            uStack_98 = uStack_c0;
            uStack_a0 = local_c8;
            OSSL_PARAM_construct_end(&local_d8);
            local_68 = local_b8;
            uStack_70 = uStack_c0;
            local_78 = local_c8;
            uStack_80 = uStack_d0;
            local_88 = local_d8;
            iVar3 = EVP_MAC_init(*ptr,uVar5,0x20,&local_b0);
            if (iVar3 == 0) goto LAB_009c3738;
          }
          iVar3 = EVP_DecryptInit_ex(ctx,cipher,(ENGINE *)0x0,
                                     (uchar *)(*(long *)(lVar8 + 0x238) + 0x20),
                                     (uchar *)((long)param_2 + 0x10));
          if (iVar3 < 1) goto LAB_009c3828;
          EVP_CIPHER_free(cipher);
          bVar2 = false;
          if ((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0)
          goto LAB_009c34e4;
          iVar3 = **(int **)(param_1 + 8);
          bVar2 = 0x303 < iVar3 && iVar3 != 0x10000;
          lVar8 = *ptr;
          goto joined_r0x009c37bc;
        }
LAB_009c3828:
        EVP_CIPHER_free(cipher);
      }
      else {
        iVar3 = (**(code **)(lVar8 + 0x248))(param_1,param_2,(long)param_2 + 0x10,ctx,*ptr,0);
joined_r0x009c3684:
        if (-1 < iVar3) {
          if (iVar3 == 0) goto LAB_009c38b8;
          bVar2 = false;
          if (iVar3 == 2) {
            bVar2 = true;
          }
LAB_009c34e4:
          lVar8 = *ptr;
joined_r0x009c37bc:
          if (lVar8 == 0) {
            if (ptr[1] == 0) goto LAB_009c3834;
            len = ssl_hmac_old_size(ptr);
          }
          else {
            len = EVP_MAC_CTX_get_mac_size();
          }
          if ((len == 0) || (iVar3 = EVP_CIPHER_CTX_get_iv_length(ctx), iVar3 < 0))
          goto LAB_009c3834;
          if (param_3 <= len + (long)(iVar3 + 0x10)) goto LAB_009c38b8;
          param_3 = param_3 - len;
          if (*ptr == 0) {
            if (ptr[1] == 0) goto LAB_009c3834;
            iVar4 = ssl_hmac_old_update(ptr,param_2,param_3);
          }
          else {
            iVar4 = EVP_MAC_update(*ptr,param_2,param_3);
          }
          if (0 < iVar4) {
            if (*ptr == 0) {
              if (ptr[1] == 0) goto LAB_009c3834;
              iVar4 = ssl_hmac_old_final(ptr,&local_b0,0);
            }
            else {
              iVar4 = EVP_MAC_final(*ptr,&local_b0,0,0x40);
            }
            if (0 < iVar4) {
              iVar4 = CRYPTO_memcmp(&local_b0,(void *)((long)param_2 + param_3),len);
              if (iVar4 != 0) goto LAB_009c38b8;
              in = (uchar *)((long)param_2 + (long)iVar3 + 0x10);
              param_3 = param_3 - (long)(iVar3 + 0x10);
              local_d8 = in;
              out = CRYPTO_malloc((int)param_3,"ssl/t1_lib.c",0x79f);
              if ((out == (uchar *)0x0) ||
                 (iVar3 = EVP_DecryptUpdate(ctx,out,&local_dc,in,(int)param_3), iVar3 < 1)) {
                CRYPTO_free(out);
                goto LAB_009c3834;
              }
              iVar3 = EVP_DecryptFinal(ctx,out + local_dc,&local_e0);
              if (iVar3 < 1) {
                CRYPTO_free(out);
LAB_009c38b8:
                ses = (SSL_SESSION *)0x0;
              }
              else {
                lVar8 = (long)local_dc;
                local_dc = (int)(lVar8 + local_e0);
                local_d8 = out;
                ses = d2i_SSL_SESSION((SSL_SESSION **)0x0,&local_d8,lVar8 + local_e0);
                local_dc = local_dc + ((int)out - (int)local_d8);
                CRYPTO_free(out);
                if (ses != (SSL_SESSION *)0x0) {
                  if (local_dc == 0) {
                    if (param_5 != 0) {
                      memcpy(ses + 1,param_4,param_5);
                      ses->tlsext_tick_lifetime_hint = param_5;
                    }
                    uVar6 = 5;
                    if (bVar2) {
                      uVar6 = 6;
                    }
                    goto LAB_009c38c0;
                  }
                  SSL_SESSION_free(ses);
                  goto LAB_009c38b8;
                }
                ERR_clear_error();
              }
              uVar6 = 4;
              goto LAB_009c38c0;
            }
          }
        }
      }
LAB_009c3834:
      ses = (SSL_SESSION *)0x0;
      uVar6 = 1;
    }
LAB_009c38c0:
    EVP_CIPHER_CTX_free(ctx);
    EVP_MAC_CTX_free(*ptr);
    ssl_hmac_old_free(ptr);
    CRYPTO_free(ptr);
  }
  if (uVar6 - 3 < 4) {
    pcVar7 = *(code **)(*(long *)(param_1 + 0xb88) + 0x400);
    if (pcVar7 != (code *)0x0) {
      if (0xf < param_3) {
        param_3 = 0x10;
      }
      iVar3 = (*pcVar7)(param_1,ses,param_2,param_3,uVar6,
                        *(undefined8 *)(*(long *)(param_1 + 0xb88) + 0x408));
      if (iVar3 - 3U < 2) {
        if (uVar6 - 5 < 2) {
          uVar6 = 5;
          if (iVar3 != 3) {
            uVar6 = 6;
          }
          lVar8 = *(long *)(param_1 + 0xaf8);
          goto joined_r0x009c3628;
        }
      }
      else {
        if (iVar3 == 2) {
          uVar1 = 4;
          if (uVar6 - 3 < 2) {
            uVar1 = uVar6;
          }
          SSL_SESSION_free(ses);
          ses = (SSL_SESSION *)0x0;
          lVar8 = *(long *)(param_1 + 0xaf8);
          uVar6 = uVar1;
          goto joined_r0x009c3628;
        }
        if (iVar3 == 1) {
          SSL_SESSION_free(ses);
          ses = (SSL_SESSION *)0x0;
          uVar6 = 2;
          goto LAB_009c357c;
        }
      }
      uVar6 = 1;
      lVar8 = *(long *)(param_1 + 0xaf8);
      goto joined_r0x009c3628;
    }
  }
LAB_009c357c:
  lVar8 = *(long *)(param_1 + 0xaf8);
joined_r0x009c3628:
  if (((lVar8 == 0) ||
      ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0 &&
        (iVar3 = **(int **)(param_1 + 8), 0x303 < iVar3)) && (iVar3 != 0x10000)))) &&
     ((uVar6 < 7 && ((1 << (ulong)uVar6 & 0x58U) != 0)))) {
    *(undefined4 *)(param_1 + 0xa98) = 1;
  }
  *param_6 = ses;
  return uVar6;
}

