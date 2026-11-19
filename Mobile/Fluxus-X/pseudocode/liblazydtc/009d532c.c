/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d532c
 */

undefined8 tls_parse_stoc_key_share(long param_1,long *param_2,uint param_3)

{
  uint uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  int iVar4;
  EVP_PKEY *to;
  undefined8 uVar5;
  undefined8 uVar6;
  long lVar7;
  uint *puVar8;
  undefined1 *puVar9;
  ulong uVar10;
  EVP_PKEY *from;
  ulong local_50;
  long local_48;
  
  from = *(EVP_PKEY **)(param_1 + 0x2e8);
  if ((from == (EVP_PKEY *)0x0) || (*(long *)(param_1 + 0x4b0) != 0)) {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0x6d4,"tls_parse_stoc_key_share");
    uVar6 = 0xc0103;
    uVar5 = 0x50;
    goto LAB_009d5384;
  }
  if ((ulong)param_2[1] < 2) {
    ERR_new();
    uVar5 = 0x6d9;
LAB_009d5538:
    ERR_set_debug("ssl/statem/extensions_clnt.c",uVar5,"tls_parse_stoc_key_share");
    uVar5 = 0x32;
    uVar6 = 0x9f;
  }
  else {
    puVar9 = (undefined1 *)*param_2;
    lVar7 = param_2[1] - 2;
    uVar2 = *puVar9;
    uVar3 = puVar9[1];
    *param_2 = (long)(puVar9 + 2);
    param_2[1] = lVar7;
    uVar1 = (uint)CONCAT11(uVar2,uVar3);
    if ((param_3 >> 0xb & 1) == 0) {
      if (uVar1 != *(ushort *)(param_1 + 0x4ae)) {
        ERR_new();
        uVar5 = 0x708;
        goto LAB_009d5608;
      }
      puVar8 = (uint *)(*(long *)(param_1 + 0x918) + 0x308);
      if (*(int *)(param_1 + 0x4d0) == 0) {
LAB_009d5440:
        *puVar8 = uVar1;
      }
      else if (uVar1 != *puVar8) {
        lVar7 = ssl_session_dup(*(long *)(param_1 + 0x918),0);
        if (lVar7 == 0) {
          ERR_new();
          ERR_set_debug("ssl/statem/extensions_clnt.c",0x71a,"tls_parse_stoc_key_share");
          uVar5 = 0x50;
          uVar6 = 0xc0100;
          goto LAB_009d5384;
        }
        SSL_SESSION_free(*(SSL_SESSION **)(param_1 + 0x918));
        puVar8 = (uint *)(lVar7 + 0x308);
        *(long *)(param_1 + 0x918) = lVar7;
        goto LAB_009d5440;
      }
      lVar7 = tls1_group_id_lookup(*(undefined8 *)(param_1 + 0x9a8),uVar1);
      if (lVar7 != 0) {
        if (1 < (ulong)param_2[1]) {
          puVar9 = (undefined1 *)*param_2;
          uVar10 = (ulong)CONCAT11(*puVar9,puVar9[1]);
          if (param_2[1] - 2U == uVar10) {
            puVar9 = puVar9 + 2;
            *param_2 = (long)(puVar9 + uVar10);
            param_2[1] = 0;
            if (uVar10 != 0) {
              if (*(char *)(lVar7 + 0x30) != '\0') {
                uVar5 = ssl_decapsulate(param_1,from,puVar9,uVar10,1);
                if ((int)uVar5 == 0) {
                  return uVar5;
                }
LAB_009d54ac:
                *(undefined1 *)(param_1 + 0x4ad) = 1;
                return 1;
              }
              to = EVP_PKEY_new();
              if ((to == (EVP_PKEY *)0x0) || (iVar4 = EVP_PKEY_copy_parameters(to,from), iVar4 < 1))
              {
                ERR_new();
                ERR_set_debug("ssl/statem/extensions_clnt.c",0x731,"tls_parse_stoc_key_share");
                uVar5 = 0x50;
                uVar6 = 0x128;
              }
              else {
                iVar4 = tls13_set_encoded_pub_key(to,puVar9,uVar10);
                if (0 < iVar4) {
                  iVar4 = ssl_derive(param_1,from,to,1);
                  if (iVar4 != 0) {
                    *(EVP_PKEY **)(param_1 + 0x4b0) = to;
                    goto LAB_009d54ac;
                  }
                  goto LAB_009d56f4;
                }
                ERR_new();
                ERR_set_debug("ssl/statem/extensions_clnt.c",0x738,"tls_parse_stoc_key_share");
                uVar5 = 0x2f;
                uVar6 = 0x132;
              }
              ossl_statem_fatal(param_1,uVar5,uVar6,0);
LAB_009d56f4:
              EVP_PKEY_free(to);
              return 0;
            }
          }
        }
        ERR_new();
        uVar5 = 0x729;
        goto LAB_009d5538;
      }
      ERR_new();
      uVar5 = 0x723;
    }
    else {
      local_48 = 0;
      if (lVar7 != 0) {
        ERR_new();
        uVar5 = 0x6e2;
        goto LAB_009d5538;
      }
      if (uVar1 == *(ushort *)(param_1 + 0x4ae)) {
        ERR_new();
        uVar5 = 0x6eb;
      }
      else {
        tls1_get_supported_groups(param_1,&local_48,&local_50);
        if (local_50 != 0) {
          uVar10 = 0;
          do {
            if (uVar1 == *(ushort *)(local_48 + uVar10 * 2)) {
              iVar4 = tls_group_allowed(param_1,uVar1,0x20004);
              if ((iVar4 != 0) &&
                 (iVar4 = tls_valid_group(param_1,uVar1,0x304,0x304,0,0), iVar4 != 0)) {
                *(ushort *)(param_1 + 0x4ae) = CONCAT11(uVar2,uVar3);
                EVP_PKEY_free(*(EVP_PKEY **)(param_1 + 0x2e8));
                *(undefined8 *)(param_1 + 0x2e8) = 0;
                return 1;
              }
              break;
            }
            uVar10 = uVar10 + 1;
          } while (uVar10 < local_50);
        }
        ERR_new();
        uVar5 = 0x6f9;
      }
    }
LAB_009d5608:
    ERR_set_debug("ssl/statem/extensions_clnt.c",uVar5,"tls_parse_stoc_key_share");
    uVar5 = 0x2f;
    uVar6 = 0x6c;
  }
LAB_009d5384:
  ossl_statem_fatal(param_1,uVar5,uVar6,0);
  return 0;
}

