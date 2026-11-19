/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d39b8
 */

undefined8 tls_construct_ctos_early_data(long param_1,undefined8 param_2)

{
  SSL_SESSION *pSVar1;
  bool bVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  byte *pbVar6;
  byte *a;
  undefined8 uVar7;
  undefined8 uVar8;
  ulong uVar9;
  ulong uVar10;
  code *pcVar11;
  undefined2 local_364 [2];
  undefined1 auStack_360 [512];
  SSL_SESSION *local_160;
  size_t local_158;
  char *local_150;
  char acStack_144 [260];
  
  local_158 = 0;
  local_150 = (char *)0x0;
  local_160 = (SSL_SESSION *)0x0;
  uVar7 = 0;
  if (*(int *)(param_1 + 0x8e8) == 1) {
    uVar7 = ssl_handshake_md(param_1,0);
  }
  if (*(code **)(param_1 + 0x9a0) != (code *)0x0) {
    iVar3 = (**(code **)(param_1 + 0x9a0))(param_1,uVar7,&local_150,&local_158,&local_160);
    if (iVar3 != 0) {
      if (local_160 == (SSL_SESSION *)0x0) goto LAB_009d3a64;
      if (local_160->ssl_version != 0x304) goto LAB_009d3a34;
      goto LAB_009d3b68;
    }
LAB_009d3a34:
    SSL_SESSION_free(local_160);
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0x2f8,"tls_construct_ctos_early_data");
    uVar7 = 0x50;
    uVar8 = 0xdb;
    goto LAB_009d3c4c;
  }
LAB_009d3a64:
  pcVar11 = *(code **)(param_1 + 0x988);
  if (pcVar11 == (code *)0x0) {
LAB_009d3b68:
    SSL_SESSION_free(*(SSL_SESSION **)(param_1 + 0x920));
    *(SSL_SESSION **)(param_1 + 0x920) = local_160;
    if (local_160 != (SSL_SESSION *)0x0) {
      CRYPTO_free(*(void **)(param_1 + 0x928));
      lVar5 = CRYPTO_memdup(local_150,local_158,"ssl/statem/extensions_clnt.c",0x32f);
      *(long *)(param_1 + 0x928) = lVar5;
      if (lVar5 == 0) {
        *(undefined8 *)(param_1 + 0x930) = 0;
        ERR_new();
        uVar7 = 0x332;
        goto LAB_009d3c3c;
      }
      *(size_t *)(param_1 + 0x930) = local_158;
    }
    if (*(int *)(param_1 + 0x84) == 2) {
      iVar3 = *(int *)((*(SSL_SESSION **)(param_1 + 0x918))[1].krb5_client_princ + 0x6c);
      if ((iVar3 != 0) ||
         ((local_160 != (SSL_SESSION *)0x0 && (*(int *)(local_160[1].krb5_client_princ + 0x6c) != 0)
          ))) {
        pSVar1 = local_160;
        if (iVar3 != 0) {
          pSVar1 = *(SSL_SESSION **)(param_1 + 0x918);
        }
        *(undefined4 *)(param_1 + 0x1d40) = *(undefined4 *)(pSVar1[1].krb5_client_princ + 0x6c);
        if ((*(char **)(pSVar1[1].krb5_client_princ + 0x48) == (char *)0x0) ||
           ((*(char **)(param_1 + 0xa58) != (char *)0x0 &&
            (iVar3 = strcmp(*(char **)(param_1 + 0xa58),
                            *(char **)(pSVar1[1].krb5_client_princ + 0x48)), iVar3 == 0)))) {
          pbVar6 = *(byte **)(param_1 + 0xb08);
          if (pbVar6 == (byte *)0x0) {
            if (*(long *)(pSVar1[1].krb5_client_princ + 0x70) != 0) {
              ERR_new();
              uVar7 = 0x34c;
LAB_009d3ddc:
              ERR_set_debug("ssl/statem/extensions_clnt.c",uVar7,"tls_construct_ctos_early_data");
              uVar7 = 0x50;
              uVar8 = 0xde;
              goto LAB_009d3c4c;
            }
          }
          else if (*(long *)(pSVar1[1].krb5_client_princ + 0x70) != 0) {
            lVar5 = *(long *)(param_1 + 0xb10);
            if (lVar5 < 0) {
              ERR_new();
              uVar7 = 0x359;
              goto LAB_009d3c3c;
            }
            do {
              if (lVar5 == 0) {
LAB_009d3dc4:
                ERR_new();
                uVar7 = 0x365;
                goto LAB_009d3ddc;
              }
              a = pbVar6 + 1;
              uVar9 = (ulong)*pbVar6;
              uVar10 = lVar5 - 1;
              lVar5 = uVar10 - uVar9;
              if (uVar10 < uVar9) goto LAB_009d3dc4;
              bVar2 = false;
              pbVar6 = a + uVar9;
              if (*(ulong *)(pSVar1[1].krb5_client_princ + 0x78) == uVar9) {
                iVar3 = CRYPTO_memcmp(a,*(void **)(pSVar1[1].krb5_client_princ + 0x70),uVar9);
                bVar2 = iVar3 == 0;
              }
            } while (!bVar2);
          }
          iVar3 = WPACKET_put_bytes__(param_2,0x2a,2);
          if (((iVar3 != 0) && (iVar3 = WPACKET_start_sub_packet_len__(param_2,2), iVar3 != 0)) &&
             (iVar3 = WPACKET_close(param_2), iVar3 != 0)) {
            *(undefined8 *)(param_1 + 0xb30) = 0x100000001;
            return 1;
          }
          ERR_new();
          uVar7 = 0x36d;
          goto LAB_009d3c3c;
        }
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_clnt.c",0x346,"tls_construct_ctos_early_data");
        uVar7 = 0x50;
        uVar8 = 0xe7;
        goto LAB_009d3c4c;
      }
    }
    *(undefined4 *)(param_1 + 0x1d40) = 0;
    uVar7 = 2;
  }
  else {
    memset(acStack_144,0,0x101);
    uVar4 = (*pcVar11)(param_1,0,acStack_144,0x100,auStack_360,0x200);
    if (uVar4 < 0x201) {
      uVar9 = (ulong)uVar4;
      if (uVar4 == 0) goto LAB_009d3b68;
      local_364[0] = 0x113;
      local_158 = strlen(acStack_144);
      if (0x100 < local_158) {
        ERR_new();
        uVar7 = 0x30e;
LAB_009d3c3c:
        ERR_set_debug("ssl/statem/extensions_clnt.c",uVar7,"tls_construct_ctos_early_data");
        uVar7 = 0x50;
        goto LAB_009d3c44;
      }
      local_150 = acStack_144;
      lVar5 = SSL_CIPHER_find(param_1,local_364);
      if (lVar5 == 0) {
        ERR_new();
        uVar7 = 0x319;
        goto LAB_009d3c3c;
      }
      local_160 = SSL_SESSION_new();
      if ((((local_160 != (SSL_SESSION *)0x0) &&
           (iVar3 = SSL_SESSION_set1_master_key(local_160,auStack_360,uVar9), iVar3 != 0)) &&
          (iVar3 = SSL_SESSION_set_cipher(local_160,lVar5), iVar3 != 0)) &&
         (iVar3 = SSL_SESSION_set_protocol_version(local_160,0x304), iVar3 != 0)) {
        OPENSSL_cleanse(auStack_360,uVar9);
        goto LAB_009d3b68;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x322,"tls_construct_ctos_early_data");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      OPENSSL_cleanse(auStack_360,uVar9);
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x306,"tls_construct_ctos_early_data");
      uVar7 = 0x28;
LAB_009d3c44:
      uVar8 = 0xc0103;
LAB_009d3c4c:
      ossl_statem_fatal(param_1,uVar7,uVar8,0);
    }
    uVar7 = 0;
  }
  return uVar7;
}

