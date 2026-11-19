/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e95d8
 */

undefined8 tls_process_client_certificate(int *param_1,long *param_2)

{
  byte bVar1;
  int iVar2;
  undefined4 uVar3;
  long lVar4;
  byte *pbVar5;
  X509 *pXVar6;
  ulong uVar7;
  undefined8 uVar8;
  ulong uVar9;
  int *piVar10;
  uint uVar11;
  long lVar12;
  ulong uVar13;
  byte *local_70;
  ulong uStack_68;
  void *local_60;
  byte *local_58;
  X509 *local_48;
  
  local_48 = (X509 *)0x0;
  param_1[0x20] = 0;
  lVar4 = OPENSSL_sk_new_null();
  if (lVar4 == 0) {
    ERR_new();
    uVar8 = 0xd67;
LAB_009e96f0:
    ERR_set_debug("ssl/statem/statem_srvr.c",uVar8,"tls_process_client_certificate");
    uVar3 = 0x50;
LAB_009e96f8:
    uVar8 = 0xc0100;
    goto LAB_009e9994;
  }
  if ((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) != 0) ||
      (iVar2 = **(int **)(param_1 + 2), iVar2 < 0x304)) || (iVar2 == 0x10000)) goto LAB_009e9670;
  if (param_2[1] == 0) {
LAB_009e9970:
    ERR_new();
    ERR_set_debug("ssl/statem/statem_srvr.c",0xd6f,"tls_process_client_certificate");
    uVar3 = 0x32;
    uVar8 = 0x11a;
LAB_009e9994:
    ossl_statem_fatal(param_1,uVar3,uVar8,0);
  }
  else {
    uVar9 = param_2[1] - 1;
    pbVar5 = (byte *)*param_2 + 1;
    bVar1 = *(byte *)*param_2;
    uVar7 = (ulong)bVar1;
    if (uVar9 < uVar7) goto LAB_009e9970;
    *param_2 = (long)(pbVar5 + uVar7);
    param_2[1] = uVar9 - uVar7;
    if (*(void **)(param_1 + 0x2ec) == (void *)0x0) {
      if (bVar1 != 0) goto LAB_009e9970;
    }
    else if ((*(ulong *)(param_1 + 0x2ee) != uVar7) ||
            (iVar2 = CRYPTO_memcmp(pbVar5,*(void **)(param_1 + 0x2ec),uVar7), iVar2 != 0))
    goto LAB_009e9970;
LAB_009e9670:
    uVar7 = param_2[1] - 3;
    if ((ulong)param_2[1] < 3) {
LAB_009e96b0:
      ERR_new();
      ERR_set_debug("ssl/statem/statem_srvr.c",0xd75,"tls_process_client_certificate");
      uVar3 = 0x32;
      uVar8 = 0x9f;
      goto LAB_009e9994;
    }
    pbVar5 = (byte *)*param_2;
    uVar9 = (ulong)*pbVar5 << 0x10 | (ulong)pbVar5[1] << 8 | (ulong)pbVar5[2];
    lVar12 = uVar7 - uVar9;
    if (uVar7 < uVar9) goto LAB_009e96b0;
    pbVar5 = pbVar5 + 3;
    *param_2 = (long)(pbVar5 + uVar9);
    param_2[1] = lVar12;
    if (lVar12 != 0) goto LAB_009e96b0;
    if (uVar9 != 0) {
      lVar12 = 0;
      do {
        uVar7 = uVar9 - 3;
        if (uVar9 < 3) {
LAB_009e99dc:
          ERR_new();
          uVar8 = 0xd7c;
LAB_009e9afc:
          ERR_set_debug("ssl/statem/statem_srvr.c",uVar8,"tls_process_client_certificate");
          uVar3 = 0x32;
          uVar8 = 0x87;
          goto LAB_009e9994;
        }
        uVar13 = (ulong)*pbVar5 << 0x10 | (ulong)pbVar5[1] << 8 | (ulong)pbVar5[2];
        uVar9 = uVar7 - uVar13;
        if (uVar7 < uVar13) goto LAB_009e99dc;
        local_58 = pbVar5 + 3;
        local_48 = (X509 *)X509_new_ex(**(undefined8 **)(param_1 + 0x26a),
                                       (*(undefined8 **)(param_1 + 0x26a))[0x88]);
        if (local_48 == (X509 *)0x0) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0xd83,"tls_process_client_certificate");
          uVar3 = 0x32;
          goto LAB_009e96f8;
        }
        pXVar6 = d2i_X509(&local_48,&local_58,uVar13);
        if (pXVar6 == (X509 *)0x0) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0xd87,"tls_process_client_certificate");
          uVar3 = 0x32;
          uVar8 = 0x8000d;
          goto LAB_009e9994;
        }
        pbVar5 = pbVar5 + 3 + uVar13;
        if (local_58 != pbVar5) {
          ERR_new();
          uVar8 = 0xd8c;
          goto LAB_009e9afc;
        }
        if ((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0) &&
            (iVar2 = **(int **)(param_1 + 2), 0x303 < iVar2)) && (iVar2 != 0x10000)) {
          uVar7 = uVar9 - 2;
          local_60 = (void *)0x0;
          if (1 < uVar9) {
            uVar13 = (ulong)CONCAT11(*pbVar5,pbVar5[1]);
            uVar9 = uVar7 - uVar13;
            if (uVar13 <= uVar7) {
              local_70 = pbVar5 + 2;
              uStack_68 = uVar13;
              iVar2 = tls_collect_extensions(param_1,&local_70,0x1000,&local_60,0,lVar12 == 0);
              if ((iVar2 != 0) &&
                 (iVar2 = tls_parse_all_extensions
                                    (param_1,0x1000,local_60,local_48,lVar12,uVar9 == 0), iVar2 != 0
                 )) {
                pbVar5 = pbVar5 + 2 + uVar13;
                CRYPTO_free(local_60);
                goto LAB_009e9828;
              }
              CRYPTO_free(local_60);
              goto LAB_009e99a0;
            }
          }
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0xd95,"tls_process_client_certificate");
          uVar3 = 0x32;
          uVar8 = 0x10f;
          goto LAB_009e9994;
        }
LAB_009e9828:
        iVar2 = OPENSSL_sk_push(lVar4,local_48);
        if (iVar2 == 0) {
          ERR_new();
          uVar8 = 0xda5;
          goto LAB_009e96f0;
        }
        lVar12 = lVar12 + 1;
        local_48 = (X509 *)0x0;
      } while (uVar9 != 0);
    }
    iVar2 = OPENSSL_sk_num(lVar4);
    if (0 < iVar2) {
      iVar2 = ssl_verify_cert_chain(param_1,lVar4);
      if (iVar2 < 1) {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_srvr.c",0xdc3,"tls_process_client_certificate");
        uVar3 = ssl_x509err2alert(param_1[0x26e]);
        uVar8 = 0x86;
      }
      else {
        OPENSSL_sk_value(lVar4,0);
        lVar12 = X509_get0_pubkey();
        if (lVar12 != 0) {
LAB_009e987c:
          lVar12 = *(long *)(param_1 + 0x246);
          if (param_1[0x2ea] == 4) {
            lVar12 = ssl_session_dup(lVar12,0);
            if (lVar12 == 0) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_srvr.c",0xdd8,"tls_process_client_certificate");
              ossl_statem_fatal(param_1,0x50,0xc0100,0);
              uVar8 = 0;
              goto LAB_009e99a4;
            }
            SSL_SESSION_free(*(SSL_SESSION **)(param_1 + 0x246));
            *(long *)(param_1 + 0x246) = lVar12;
          }
          X509_free(*(X509 **)(lVar12 + 0x2b8));
          uVar8 = OPENSSL_sk_shift(lVar4);
          lVar12 = *(long *)(param_1 + 0x246);
          *(undefined8 *)(lVar12 + 0x2b8) = uVar8;
          *(undefined8 *)(lVar12 + 0x2c8) = *(undefined8 *)(param_1 + 0x26e);
          OPENSSL_sk_pop_free(*(undefined8 *)(lVar12 + 0x2c0),X509_free);
          *(long *)(*(long *)(param_1 + 0x246) + 0x2c0) = lVar4;
          piVar10 = *(int **)(param_1 + 2);
          uVar11 = *(uint *)(*(long *)(piVar10 + 0x30) + 0x60);
          if ((((uVar11 >> 3 & 1) == 0) && (0x303 < *piVar10)) && (*piVar10 != 0x10000)) {
            iVar2 = ssl3_digest_cached_records(param_1,1);
            if (iVar2 != 0) {
              piVar10 = *(int **)(param_1 + 2);
              uVar11 = *(uint *)(*(long *)(piVar10 + 0x30) + 0x60);
              goto LAB_009e9928;
            }
LAB_009e9bf0:
            uVar8 = 0;
LAB_009e9bf4:
            lVar4 = 0;
          }
          else {
LAB_009e9928:
            if ((uVar11 >> 3 & 1) == 0) {
              uVar8 = 3;
              if (*piVar10 < 0x304) goto LAB_009e9bf4;
              lVar4 = 0;
              if (*piVar10 == 0x10000) goto LAB_009e99a4;
              iVar2 = ssl_handshake_hash(param_1,param_1 + 0x228,0x40,param_1 + 0x238);
              if (iVar2 == 0) goto LAB_009e9bf0;
              param_1[0x75e] = 0;
              param_1[0x75f] = 0;
            }
            lVar4 = 0;
            uVar8 = 3;
          }
          goto LAB_009e99a4;
        }
        ERR_new();
        ERR_set_debug("ssl/statem/statem_srvr.c",0xdc9,"tls_process_client_certificate");
        uVar3 = 0x28;
        uVar8 = 0xf7;
      }
      goto LAB_009e9994;
    }
    if (*param_1 == 0x300) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_srvr.c",0xdaf,"tls_process_client_certificate");
      uVar3 = 0x28;
      uVar8 = 0xb0;
      goto LAB_009e9994;
    }
    if ((~param_1[0x25a] & 3U) == 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_srvr.c",0xdb6,"tls_process_client_certificate");
      uVar3 = 0x74;
      uVar8 = 199;
      goto LAB_009e9994;
    }
    if ((*(long *)(param_1 + 0x62) == 0) ||
       (iVar2 = ssl3_digest_cached_records(param_1,0), iVar2 != 0)) goto LAB_009e987c;
  }
LAB_009e99a0:
  uVar8 = 0;
LAB_009e99a4:
  X509_free(local_48);
  OPENSSL_sk_pop_free(lVar4,X509_free);
  return uVar8;
}

