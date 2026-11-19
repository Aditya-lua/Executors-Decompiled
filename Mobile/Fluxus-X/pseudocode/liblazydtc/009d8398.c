/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d8398
 */

undefined8 tls_parse_ctos_psk(long param_1,long *param_2)

{
  ushort uVar1;
  int iVar2;
  uint uVar3;
  SSL_SESSION *pSVar4;
  void *ptr;
  time_t tVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  byte *pbVar8;
  ulong uVar9;
  ulong uVar10;
  uint uVar11;
  uint uVar12;
  undefined1 *puVar13;
  byte *pbVar14;
  ulong uVar15;
  uint *puVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  undefined4 uVar20;
  uint uVar21;
  undefined2 local_274 [2];
  undefined1 auStack_270 [512];
  SSL_SESSION *local_70 [2];
  
  local_70[0] = (SSL_SESSION *)0x0;
  if ((*(byte *)(param_1 + 0xb28) & 3) == 0) {
    return 1;
  }
  uVar10 = param_2[1] - 2;
  if ((ulong)param_2[1] < 2) {
LAB_009d83f8:
    ERR_new();
    uVar6 = 0x3ea;
LAB_009d8410:
    ERR_set_debug("ssl/statem/extensions_srvr.c",uVar6,"tls_parse_ctos_psk");
    uVar6 = 0x32;
LAB_009d8418:
    uVar7 = 0x6e;
LAB_009d841c:
    ossl_statem_fatal(param_1,uVar6,uVar7,0);
    return 0;
  }
  puVar13 = (undefined1 *)*param_2;
  uVar9 = (ulong)CONCAT11(*puVar13,puVar13[1]);
  if (uVar10 < uVar9) goto LAB_009d83f8;
  puVar16 = (uint *)(puVar13 + 2);
  lVar19 = 0;
  uVar20 = 0;
  uVar21 = 0;
  *param_2 = (long)puVar16 + uVar9;
  param_2[1] = uVar10 - uVar9;
  *(undefined4 *)(param_1 + 0xa98) = 0;
  if (uVar9 != 0) {
LAB_009d8458:
    if (uVar9 == 1) {
LAB_009d87ac:
      ERR_new();
      uVar6 = 0x3f6;
      goto LAB_009d8410;
    }
    uVar1 = CONCAT11((char)*puVar16,*(undefined1 *)((long)puVar16 + 1));
    uVar10 = (ulong)uVar1;
    uVar15 = (uVar9 - 2) - uVar10;
    if ((uVar9 - 2 < uVar10) || (uVar15 < 4)) goto LAB_009d87ac;
    lVar17 = (long)puVar16 + 2;
    puVar16 = (uint *)(lVar17 + uVar10) + 1;
    uVar12 = *(uint *)(lVar17 + uVar10);
    if ((*(code **)(param_1 + 0x998) != (code *)0x0) &&
       (iVar2 = (**(code **)(param_1 + 0x998))(param_1,lVar17,uVar10,local_70), iVar2 == 0)) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_srvr.c",0x3fe,"tls_parse_ctos_psk");
      uVar6 = 0x50;
      goto LAB_009d8418;
    }
    if (local_70[0] == (SSL_SESSION *)0x0) {
      if ((0x100 < uVar10) || (*(long *)(param_1 + 0x990) == 0)) {
LAB_009d8674:
        uVar3 = (uint)*(undefined8 *)(param_1 + 0x9e8);
        if (((uVar3 >> 0xe & 1) == 0) &&
           (((uVar3 >> 0x18 & 1) != 0 || (*(int *)(param_1 + 0x1d40) == 0)))) {
          uVar3 = tls_decrypt_ticket(param_1,lVar17,uVar10,0,0,local_70);
          if (uVar3 == 3) {
LAB_009d891c:
            ERR_new();
            uVar6 = 0x45b;
            goto LAB_009d8410;
          }
          if (uVar3 < 2) {
            ERR_new();
            uVar6 = 0x461;
            goto LAB_009d8a5c;
          }
          if ((uVar3 != 2) && (uVar3 != 4)) {
            iVar2 = *(int *)(param_1 + 0x1d40);
            goto joined_r0x009d8728;
          }
        }
        else {
          *(undefined4 *)(param_1 + 0xa98) = 1;
          if (uVar1 == 0x20) {
            pSVar4 = (SSL_SESSION *)lookup_sess_in_cache(param_1,lVar17,0x20);
            if (pSVar4 != (SSL_SESSION *)0x0) {
              iVar2 = *(int *)(param_1 + 0x1d40);
              local_70[0] = pSVar4;
joined_r0x009d8728:
              if (((iVar2 == 0) || ((*(byte *)(param_1 + 0x9eb) & 1) != 0)) ||
                 (iVar2 = SSL_CTX_remove_session(*(SSL_CTX **)(param_1 + 0xb88),local_70[0]),
                 iVar2 != 0)) {
                tVar5 = time((time_t *)0x0);
                pSVar4 = local_70[0];
                if (uVar21 == 0) {
                  uVar10 = tVar5 - *(long *)(local_70[0][1].sid_ctx + 0x1c);
                  uVar11 = (uint)uVar10;
                  uVar3 = uVar11 * 1000;
                  if ((uVar3 / 1000 == uVar11) &&
                     ((long)(uVar10 & 0xffffffff) <= *(long *)(local_70[0][1].sid_ctx + 0x14))) {
                    uVar3 = uVar3 + 1000;
                    uVar12 = (uVar12 & 0xff00ff00) >> 8 | (uVar12 & 0xff00ff) << 8;
                    uVar12 = (uVar12 >> 0x10 | uVar12 << 0x10) -
                             *(int *)(local_70[0][1].krb5_client_princ + 0x68);
                    if ((uVar12 <= uVar3) && (uVar3 <= uVar12 + 10000)) {
                      *(undefined4 *)(param_1 + 0xb34) = 1;
                    }
                  }
                }
                goto LAB_009d8500;
              }
              SSL_SESSION_free(local_70[0]);
              local_70[0] = (SSL_SESSION *)0x0;
            }
          }
          else if (uVar1 == 0) goto LAB_009d891c;
        }
LAB_009d8550:
        uVar9 = uVar15 - 4;
        uVar21 = uVar21 + 1;
        if (uVar9 == 0) goto LAB_009d87c8;
        goto LAB_009d8458;
      }
      CRYPTO_free((void *)0x0);
      ptr = (void *)CRYPTO_strndup(lVar17,uVar10,"include/internal/packet.h",0x1e6);
      if (ptr == (void *)0x0) {
        ERR_new();
        uVar6 = 0x40b;
      }
      else {
        uVar3 = (**(code **)(param_1 + 0x990))(param_1,ptr,auStack_270,0x200);
        CRYPTO_free(ptr);
        if (0x200 < uVar3) {
          ERR_new();
          uVar6 = 0x412;
          goto LAB_009d8a5c;
        }
        if (uVar3 == 0) {
LAB_009d8660:
          if (local_70[0] != (SSL_SESSION *)0x0) goto LAB_009d84b8;
          goto LAB_009d8674;
        }
        local_274[0] = 0x113;
        lVar18 = SSL_CIPHER_find(param_1,local_274);
        if (lVar18 != 0) {
          local_70[0] = SSL_SESSION_new();
          if (local_70[0] != (SSL_SESSION *)0x0) {
            iVar2 = SSL_SESSION_set1_master_key(local_70[0],auStack_270,(ulong)uVar3);
            if (((iVar2 != 0) && (iVar2 = SSL_SESSION_set_cipher(local_70[0],lVar18), iVar2 != 0))
               && (iVar2 = SSL_SESSION_set_protocol_version(local_70[0],0x304), iVar2 != 0)) {
              OPENSSL_cleanse(auStack_270,(ulong)uVar3);
              goto LAB_009d8660;
            }
          }
          OPENSSL_cleanse(auStack_270,(ulong)uVar3);
          ERR_new();
          ERR_set_debug("ssl/statem/extensions_srvr.c",0x42b,"tls_parse_ctos_psk");
          ossl_statem_fatal(param_1,0x50,0xc0103,0);
          goto LAB_009d8910;
        }
        OPENSSL_cleanse(auStack_270,(ulong)uVar3);
        ERR_new();
        uVar6 = 0x41f;
      }
    }
    else {
LAB_009d84b8:
      pSVar4 = (SSL_SESSION *)ssl_session_dup(local_70[0],0);
      if (pSVar4 != (SSL_SESSION *)0x0) {
        SSL_SESSION_free(local_70[0]);
        local_70[0] = pSVar4;
        memcpy(pSVar4[1].master_key + 0x14,(void *)(param_1 + 0x8f8),*(size_t *)(param_1 + 0x8f0));
        *(undefined8 *)(pSVar4[1].master_key + 0xc) = *(undefined8 *)(param_1 + 0x8f0);
        if (uVar21 == 0) {
          *(undefined4 *)(param_1 + 0xb34) = 1;
        }
        uVar20 = 1;
        *(undefined4 *)(param_1 + 0xa98) = 1;
LAB_009d8500:
        lVar19 = ssl_md(*(undefined8 *)(param_1 + 0x9a8),
                        *(undefined4 *)(*(long *)(pSVar4[1].krb5_client_princ + 0x10) + 0x40));
        if (lVar19 == 0) {
          ERR_new();
          ERR_set_debug("ssl/statem/extensions_srvr.c",0x48c,"tls_parse_ctos_psk");
          uVar6 = 0x50;
          uVar7 = 0xc0103;
          goto LAB_009d887c;
        }
        ssl_md(*(undefined8 *)(param_1 + 0x9a8),*(undefined4 *)(*(long *)(param_1 + 0x2e0) + 0x40));
        uVar6 = EVP_MD_get0_name();
        iVar2 = EVP_MD_is_a(lVar19,uVar6);
        if (iVar2 == 0) {
          SSL_SESSION_free(local_70[0]);
          local_70[0] = (SSL_SESSION *)0x0;
          *(undefined4 *)(param_1 + 0xb34) = 0;
          *(undefined4 *)(param_1 + 0xa98) = 0;
          goto LAB_009d8550;
        }
        goto LAB_009d87c8;
      }
      ERR_new();
      uVar6 = 0x438;
    }
LAB_009d8a5c:
    ERR_set_debug("ssl/statem/extensions_srvr.c",uVar6,"tls_parse_ctos_psk");
    uVar6 = 0x50;
    uVar7 = 0xc0103;
    goto LAB_009d841c;
  }
LAB_009d87c8:
  if (local_70[0] == (SSL_SESSION *)0x0) {
    return 1;
  }
  lVar17 = *param_2;
  lVar18 = *(long *)(*(long *)(param_1 + 0x88) + 8);
  iVar2 = EVP_MD_get_size(lVar19);
  uVar10 = param_2[1] - 2;
  if ((ulong)param_2[1] < 2) {
LAB_009d8808:
    ERR_new();
    uVar6 = 0x4a3;
  }
  else {
    puVar13 = (undefined1 *)*param_2;
    uVar9 = (ulong)CONCAT11(*puVar13,puVar13[1]);
    if (uVar10 < uVar9) goto LAB_009d8808;
    pbVar14 = puVar13 + 2;
    uVar12 = 0;
    *param_2 = (long)(pbVar14 + uVar9);
    param_2[1] = uVar10 - uVar9;
    do {
      if (uVar9 == 0) {
LAB_009d8a00:
        ERR_new();
        uVar6 = 0x4a9;
        goto LAB_009d8820;
      }
      pbVar8 = pbVar14 + 1;
      uVar15 = (ulong)*pbVar14;
      uVar10 = uVar9 - 1;
      uVar9 = uVar10 - uVar15;
      if (uVar10 < uVar15) goto LAB_009d8a00;
      uVar12 = uVar12 + 1;
      pbVar14 = pbVar8 + uVar15;
    } while (uVar12 <= uVar21);
    if (uVar15 == (long)iVar2) {
      iVar2 = tls_psk_do_binder(param_1,lVar19,*(undefined8 *)(*(long *)(param_1 + 0x88) + 8),
                                lVar17 - lVar18,pbVar8,0,local_70[0],0,uVar20);
      if (iVar2 == 1) {
        *(uint *)(param_1 + 0xb50) = uVar21;
        SSL_SESSION_free(*(SSL_SESSION **)(param_1 + 0x918));
        *(SSL_SESSION **)(param_1 + 0x918) = local_70[0];
        return 1;
      }
      goto LAB_009d8910;
    }
    ERR_new();
    uVar6 = 0x4af;
  }
LAB_009d8820:
  ERR_set_debug("ssl/statem/extensions_srvr.c",uVar6,"tls_parse_ctos_psk");
  uVar6 = 0x32;
  uVar7 = 0x6e;
LAB_009d887c:
  ossl_statem_fatal(param_1,uVar6,uVar7,0);
LAB_009d8910:
  SSL_SESSION_free(local_70[0]);
  return 0;
}

