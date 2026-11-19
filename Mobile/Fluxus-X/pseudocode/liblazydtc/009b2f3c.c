/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b2f3c
 */

undefined8
SSL_dane_tlsa_add(long param_1,uint param_2,byte param_3,byte param_4,uchar *param_5,size_t param_6)

{
  int iVar1;
  int iVar2;
  undefined1 *ptr;
  void *__dest;
  byte *pbVar3;
  X509 *pXVar4;
  EVP_PKEY *pEVar5;
  undefined8 uVar6;
  long lVar7;
  EVP_PKEY *local_70;
  X509 *local_68;
  uchar *local_58;
  
  if (*(long *)(param_1 + 0x4e8) == 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x119,"dane_tlsa_add");
    uVar6 = 0xaf;
LAB_009b300c:
    ERR_set_error(0x14,uVar6,0);
LAB_009b3014:
    uVar6 = 0xffffffff;
  }
  else {
    iVar2 = (int)param_6;
    if ((iVar2 < 0) || ((long)iVar2 != param_6)) {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x11e,"dane_tlsa_add");
      uVar6 = 0xbd;
    }
    else if ((param_2 & 0xff) < 4) {
      if (param_3 < 2) {
        if (param_4 == 0) {
LAB_009b30b0:
          if (param_5 != (uchar *)0x0) {
            ptr = (undefined1 *)CRYPTO_zalloc(0x20,"ssl/ssl_lib.c",0x13d);
            if (ptr == (undefined1 *)0x0) {
              ERR_new();
              uVar6 = 0x13e;
LAB_009b33b4:
              ERR_set_debug("ssl/ssl_lib.c",uVar6,"dane_tlsa_add");
              uVar6 = 0xc0100;
              goto LAB_009b300c;
            }
            *ptr = (char)param_2;
            ptr[1] = param_3;
            ptr[2] = param_4;
            __dest = CRYPTO_malloc(iVar2,"ssl/ssl_lib.c",0x145);
            *(void **)(ptr + 8) = __dest;
            if (__dest == (void *)0x0) {
              CRYPTO_free((void *)0x0);
              EVP_PKEY_free(*(EVP_PKEY **)(ptr + 0x18));
              CRYPTO_free(ptr);
              ERR_new();
              uVar6 = 0x148;
              goto LAB_009b33b4;
            }
            memcpy(__dest,param_5,param_6);
            *(size_t *)(ptr + 0x10) = param_6;
            if (param_4 != 0) {
LAB_009b3110:
              iVar2 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x4e8));
              if (iVar2 < 1) {
                iVar1 = 0;
              }
              else {
                iVar1 = 0;
                do {
                  pbVar3 = (byte *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x4e8),iVar1);
                  if (((uint)*pbVar3 <= (param_2 & 0xff)) &&
                     (((uint)*pbVar3 < (param_2 & 0xff) ||
                      ((pbVar3[1] <= param_3 &&
                       ((pbVar3[1] < param_3 ||
                        (lVar7 = *(long *)(*(long *)(param_1 + 0x4e0) + 8),
                        *(byte *)(lVar7 + (ulong)pbVar3[2]) <= *(byte *)(lVar7 + (ulong)param_4)))))
                      )))) break;
                  iVar1 = iVar1 + 1;
                } while (iVar1 < iVar2);
              }
              iVar2 = OPENSSL_sk_insert(*(undefined8 *)(param_1 + 0x4e8),ptr,iVar1);
              if (iVar2 != 0) {
                *(uint *)(param_1 + 0x508) =
                     *(uint *)(param_1 + 0x508) | 1 << (ulong)(param_2 & 0x1f);
                return 1;
              }
              CRYPTO_free(*(void **)(ptr + 8));
              EVP_PKEY_free(*(EVP_PKEY **)(ptr + 0x18));
              CRYPTO_free(ptr);
              ERR_new();
              uVar6 = 0x1bd;
              goto LAB_009b33b4;
            }
            local_70 = (EVP_PKEY *)0x0;
            local_68 = (X509 *)0x0;
            local_58 = param_5;
            if (param_3 == 1) {
              pEVar5 = d2i_PUBKEY(&local_70,&local_58,param_6);
              if (((pEVar5 == (EVP_PKEY *)0x0) || (local_58 < param_5)) ||
                 ((long)local_58 - (long)param_5 != param_6)) {
                EVP_PKEY_free(local_70);
                CRYPTO_free(*(void **)(ptr + 8));
                EVP_PKEY_free(*(EVP_PKEY **)(ptr + 0x18));
                CRYPTO_free(ptr);
                ERR_new();
                ERR_set_debug("ssl/ssl_lib.c",0x18b,"dane_tlsa_add");
                uVar6 = 0xc9;
                goto LAB_009b2fd8;
              }
              if ((param_2 & 0xff) == 2) {
                *(EVP_PKEY **)(ptr + 0x18) = local_70;
              }
              else {
                EVP_PKEY_free(local_70);
              }
              goto LAB_009b3110;
            }
            if (param_3 != 0) goto LAB_009b3110;
            pXVar4 = d2i_X509(&local_68,&local_58,param_6);
            if (((pXVar4 == (X509 *)0x0) || (local_58 < param_5)) ||
               ((long)local_58 - (long)param_5 != param_6)) {
              X509_free(local_68);
              CRYPTO_free(*(void **)(ptr + 8));
              EVP_PKEY_free(*(EVP_PKEY **)(ptr + 0x18));
              CRYPTO_free(ptr);
              ERR_new();
              uVar6 = 0x15a;
LAB_009b3450:
              ERR_set_debug("ssl/ssl_lib.c",uVar6,"dane_tlsa_add");
              uVar6 = 0xb4;
              goto LAB_009b2fd8;
            }
            lVar7 = X509_get0_pubkey(local_68);
            if (lVar7 == 0) {
              X509_free(local_68);
              CRYPTO_free(*(void **)(ptr + 8));
              EVP_PKEY_free(*(EVP_PKEY **)(ptr + 0x18));
              CRYPTO_free(ptr);
              ERR_new();
              uVar6 = 0x160;
              goto LAB_009b3450;
            }
            if ((1 << (ulong)(param_2 & 0x1f) & 5U) == 0) {
              X509_free(local_68);
              goto LAB_009b3110;
            }
            lVar7 = *(long *)(param_1 + 0x4f0);
            if (lVar7 == 0) {
              lVar7 = OPENSSL_sk_new_null();
              *(long *)(param_1 + 0x4f0) = lVar7;
              if (lVar7 != 0) goto LAB_009b32cc;
            }
            else {
LAB_009b32cc:
              iVar2 = OPENSSL_sk_push(lVar7,local_68);
              if (iVar2 != 0) goto LAB_009b3110;
            }
            ERR_new();
            ERR_set_debug("ssl/ssl_lib.c",0x17f,"dane_tlsa_add");
            ERR_set_error(0x14,0xc0100,0);
            X509_free(local_68);
            CRYPTO_free(*(void **)(ptr + 8));
            EVP_PKEY_free(*(EVP_PKEY **)(ptr + 0x18));
            CRYPTO_free(ptr);
            goto LAB_009b3014;
          }
          ERR_new();
          ERR_set_debug("ssl/ssl_lib.c",0x139,"dane_tlsa_add");
          uVar6 = 0xcb;
        }
        else if ((*(byte *)(*(long **)(param_1 + 0x4e0) + 2) < param_4) ||
                (*(long *)(**(long **)(param_1 + 0x4e0) + (ulong)param_4 * 8) == 0)) {
          ERR_new();
          ERR_set_debug("ssl/ssl_lib.c",0x12f,"dane_tlsa_add");
          uVar6 = 200;
        }
        else {
          iVar1 = EVP_MD_get_size();
          if ((long)iVar1 == param_6) goto LAB_009b30b0;
          ERR_new();
          ERR_set_debug("ssl/ssl_lib.c",0x135,"dane_tlsa_add");
          uVar6 = 0xc0;
        }
      }
      else {
        ERR_new();
        ERR_set_debug("ssl/ssl_lib.c",0x128,"dane_tlsa_add");
        uVar6 = 0xca;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x123,"dane_tlsa_add");
      uVar6 = 0xb8;
    }
LAB_009b2fd8:
    ERR_set_error(0x14,uVar6,0);
    uVar6 = 0;
  }
  return uVar6;
}

