/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ddc34
 */

undefined8 tls_process_server_hello(int *param_1,long *param_2)

{
  undefined8 *__s2;
  uint uVar1;
  byte bVar2;
  byte bVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  char cVar6;
  bool bVar7;
  ulong uVar8;
  int iVar9;
  void *pvVar10;
  long lVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined4 uVar14;
  uint uVar15;
  ulong uVar16;
  undefined1 *puVar17;
  byte *pbVar18;
  byte *__s1;
  ulong __n;
  int *piVar19;
  int local_7c;
  void *local_78;
  byte *local_70;
  ulong uStack_68;
  void *local_58;
  
  local_78 = (void *)0x0;
  if ((ulong)param_2[1] < 2) {
    ERR_new();
    uVar12 = 0x56f;
    goto LAB_009ddd7c;
  }
  puVar17 = (undefined1 *)*param_2;
  uVar16 = param_2[1] - 2;
  uVar4 = *puVar17;
  uVar5 = puVar17[1];
  __s2 = (undefined8 *)(puVar17 + 2);
  *param_2 = (long)__s2;
  param_2[1] = uVar16;
  if ((CONCAT11(uVar4,uVar5) == 0x303) && (*param_1 == 0x304)) {
    if (0x1f < uVar16) {
      iVar9 = memcmp(hrrrandom,__s2,0x20);
      if (iVar9 != 0) goto LAB_009ddd2c;
      if (param_1[0x23a] == 0) {
        bVar7 = true;
        pbVar18 = puVar17 + 0x22;
        param_1[0x23a] = 1;
        goto LAB_009ddd48;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0x579,"tls_process_server_hello");
      uVar12 = 10;
      uVar13 = 0xf4;
      goto LAB_009ddd88;
    }
LAB_009ddd10:
    ERR_new();
    uVar12 = 0x584;
LAB_009ddd7c:
    ERR_set_debug("ssl/statem/statem_clnt.c",uVar12,"tls_process_server_hello");
    uVar12 = 0x32;
    uVar13 = 0x9f;
LAB_009ddd88:
    ossl_statem_fatal(param_1,uVar12,uVar13,0);
  }
  else {
    if (uVar16 < 0x20) goto LAB_009ddd10;
LAB_009ddd2c:
    uVar12 = *(undefined8 *)(puVar17 + 0x12);
    bVar7 = false;
    *(undefined8 *)(param_1 + 0x56) = *(undefined8 *)(puVar17 + 0x1a);
    *(undefined8 *)(param_1 + 0x54) = uVar12;
    uVar12 = *__s2;
    *(undefined8 *)(param_1 + 0x52) = *(undefined8 *)(puVar17 + 10);
    *(undefined8 *)(param_1 + 0x50) = uVar12;
    uVar16 = param_2[1];
    pbVar18 = (byte *)(*param_2 + 0x20);
LAB_009ddd48:
    *param_2 = (long)pbVar18;
    param_2[1] = uVar16 - 0x20;
    if (uVar16 - 0x20 == 0) {
LAB_009ddd64:
      ERR_new();
      uVar12 = 0x58b;
      goto LAB_009ddd7c;
    }
    __s1 = pbVar18 + 1;
    bVar2 = *pbVar18;
    __n = (ulong)bVar2;
    uVar8 = (uVar16 - 0x21) - __n;
    if (uVar16 - 0x21 < __n) goto LAB_009ddd64;
    pbVar18 = __s1 + __n;
    *param_2 = (long)pbVar18;
    param_2[1] = uVar8;
    if (0x20 < bVar2) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0x591,"tls_process_server_hello");
      uVar12 = 0x2f;
      uVar13 = 300;
      goto LAB_009ddd88;
    }
    if (uVar8 < 2) {
      ERR_new();
      uVar12 = 0x596;
      goto LAB_009ddd7c;
    }
    *param_2 = (long)(pbVar18 + 2);
    param_2[1] = uVar8 - 2;
    if (uVar8 - 2 == 0) {
      ERR_new();
      uVar12 = 0x59b;
      goto LAB_009ddd7c;
    }
    bVar3 = pbVar18[2];
    uVar15 = (uint)bVar3;
    uVar16 = uVar8 - 3;
    *param_2 = (long)(pbVar18 + 3);
    param_2[1] = uVar16;
    if ((bVar7) || (uVar16 != 0)) {
      if ((uVar16 < 2) || (uVar16 = (ulong)CONCAT11(pbVar18[3],pbVar18[4]), uVar8 - 5 != uVar16)) {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_clnt.c",0x5a4,"tls_process_server_hello");
        uVar12 = 0x32;
        uVar13 = 0x10f;
        goto LAB_009ddd88;
      }
      local_70 = pbVar18 + 5;
      *param_2 = (long)(local_70 + uVar16);
      param_2[1] = 0;
      uStack_68 = uVar16;
      if (!bVar7) goto LAB_009ddeb8;
LAB_009ddeec:
      piVar19 = *(int **)(param_1 + 2);
      uVar1 = *(uint *)(*(long *)(piVar19 + 0x30) + 0x60);
      if (((uVar1 >> 3 & 1) != 0) || (*piVar19 < 0x304)) {
        if (!bVar7) goto LAB_009de080;
LAB_009ddf44:
        if (bVar3 == 0) {
          if ((*(ulong *)(param_1 + 600) == __n) &&
             (iVar9 = memcmp(__s1,param_1 + 0x250,__n), iVar9 == 0)) {
            uVar15 = 0;
            goto LAB_009ddfbc;
          }
          ERR_new();
          ERR_set_debug("ssl/statem/statem_clnt.c",0x5c1,"tls_process_server_hello");
          uVar12 = 0x2f;
          uVar13 = 999;
        }
        else {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_clnt.c",0x5ba,"tls_process_server_hello");
          uVar12 = 0x2f;
          uVar13 = 0x155;
        }
        goto LAB_009ddd88;
      }
      if ((bVar7) || (*piVar19 != 0x10000)) goto LAB_009ddf44;
LAB_009ddfbc:
      if (bVar7) {
        iVar9 = FUN_009e066c(param_1,pbVar18);
        if (iVar9 != 0) {
          local_58 = (void *)0x0;
          EVP_CIPHER_CTX_free(*(EVP_CIPHER_CTX **)(param_1 + 0x21e));
          param_1[0x21e] = 0;
          param_1[0x21f] = 0;
          iVar9 = tls_collect_extensions(param_1,&local_70,0x800,&local_58,0,1);
          if ((iVar9 != 0) &&
             (iVar9 = tls_parse_all_extensions(param_1,0x800,local_58,0,0,1), iVar9 != 0)) {
            CRYPTO_free(local_58);
            local_58 = (void *)0x0;
            if ((*(long *)(param_1 + 0x2d0) == 0) && (*(long *)(param_1 + 0xba) != 0)) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_clnt.c",0x6cd,"tls_process_as_hello_retry_request");
              ossl_statem_fatal(param_1,0x2f,0xd6,0);
            }
            else {
              iVar9 = create_synthetic_message_hash(param_1,0,0,0,0);
              if ((iVar9 != 0) &&
                 (iVar9 = ssl3_finish_mac(param_1,*(undefined8 *)(*(long *)(param_1 + 0x22) + 8),
                                          *(long *)(param_1 + 0x26) + 4), iVar9 != 0)) {
                return 1;
              }
            }
          }
          pvVar10 = local_58;
          goto LAB_009ddda4;
        }
        goto LAB_009ddd94;
      }
LAB_009de080:
      uVar14 = 0x100;
      if ((uVar1 >> 3 & 1) == 0) {
        iVar9 = *piVar19;
        uVar14 = 0x200;
        if ((iVar9 == 0x10000 || iVar9 == 0x303) || iVar9 < 0x303) {
          uVar14 = 0x100;
        }
      }
      iVar9 = tls_validate_all_contexts(param_1,uVar14,local_78);
      if (iVar9 == 0) {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_clnt.c",0x5d6,"tls_process_server_hello");
        uVar12 = 0x2f;
        uVar13 = 0x6e;
      }
      else {
        param_1[0x134] = 0;
        if ((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0) &&
            (iVar9 = **(int **)(param_1 + 2), 0x303 < iVar9)) && (iVar9 != 0x10000)) {
          iVar9 = RECORD_LAYER_processed_read_pending(param_1 + 0x316);
          if (iVar9 == 0) {
            iVar9 = tls_parse_extension(param_1,0x19,0x200,local_78,0,0);
            if (iVar9 == 0) goto LAB_009ddd94;
            goto LAB_009de214;
          }
          ERR_new();
          ERR_set_debug("ssl/statem/statem_clnt.c",0x5e3,"tls_process_server_hello");
          uVar12 = 10;
          uVar13 = 0xb6;
        }
        else {
          if (((0x300 < *param_1) && (*(code **)(param_1 + 0x2be) != (code *)0x0)) &&
             (*(long *)(*(long *)(param_1 + 0x246) + 0x338) != 0)) {
            local_58 = (void *)0x0;
            local_7c = 0x200;
            iVar9 = (**(code **)(param_1 + 0x2be))
                              (param_1,*(long *)(param_1 + 0x246) + 0x50,&local_7c,0,&local_58,
                               *(undefined8 *)(param_1 + 0x2c0));
            if ((iVar9 == 0) || (local_7c < 1)) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_clnt.c",0x60d,"tls_process_server_hello");
              uVar12 = 0x50;
              uVar13 = 0xc0103;
              goto LAB_009ddd88;
            }
            lVar11 = *(long *)(param_1 + 0x246);
            *(long *)(lVar11 + 8) = (long)local_7c;
            pvVar10 = local_58;
            if (local_58 == (void *)0x0) {
              pvVar10 = (void *)ssl_get_cipher_by_char(param_1,pbVar18,0);
              lVar11 = *(long *)(param_1 + 0x246);
            }
            *(void **)(lVar11 + 0x2f8) = pvVar10;
          }
          if (((bVar2 == 0) ||
              (piVar19 = *(int **)(param_1 + 0x246), *(ulong *)(piVar19 + 0x94) != __n)) ||
             (iVar9 = memcmp(__s1,piVar19 + 0x96,__n), iVar9 != 0)) {
LAB_009de214:
            piVar19 = *(int **)(param_1 + 0x246);
            if (param_1[0x134] != 0) goto LAB_009de224;
            if (*(long *)(piVar19 + 0x94) != 0) {
              piVar19 = (int *)(*(long *)(param_1 + 0x2e2) + 0x90);
              do {
                cVar6 = '\x01';
                bVar7 = (bool)ExclusiveMonitorPass(piVar19,0x10);
                if (bVar7) {
                  *piVar19 = *piVar19 + 1;
                  cVar6 = ExclusiveMonitorsStatus();
                }
              } while (cVar6 != '\0');
              iVar9 = ssl_get_new_session(param_1,0);
              if (iVar9 == 0) goto LAB_009ddd94;
              piVar19 = *(int **)(param_1 + 0x246);
            }
            *piVar19 = *param_1;
            if (((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) != 0) ||
                 (iVar9 = **(int **)(param_1 + 2), iVar9 < 0x304)) || (iVar9 == 0x10000)) &&
               (*(ulong *)(piVar19 + 0x94) = __n, bVar2 != 0)) {
              memcpy(piVar19 + 0x96,__s1,__n);
              piVar19 = *(int **)(param_1 + 0x246);
            }
          }
          else {
            param_1[0x134] = 1;
LAB_009de224:
            if ((*(size_t *)(param_1 + 0x23c) != *(size_t *)(piVar19 + 0x9e)) ||
               (iVar9 = memcmp(piVar19 + 0xa0,param_1 + 0x23e,*(size_t *)(param_1 + 0x23c)),
               iVar9 != 0)) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_clnt.c",0x61e,"tls_process_server_hello");
              uVar12 = 0x2f;
              uVar13 = 0x110;
              goto LAB_009ddd88;
            }
          }
          iVar9 = *param_1;
          if (iVar9 == *piVar19) {
            param_1[0xf9] = iVar9;
            param_1[0xfa] = iVar9;
            iVar9 = FUN_009e066c(param_1,pbVar18);
            if (iVar9 == 0) goto LAB_009ddd94;
            if ((param_1[0x134] == 0) || (uVar15 == *(uint *)(*(long *)(param_1 + 0x246) + 0x2f4)))
            {
              if (uVar15 == 0) {
                lVar11 = 0;
LAB_009de440:
                *(long *)(param_1 + 0xd0) = lVar11;
                iVar9 = tls_parse_all_extensions(param_1,uVar14,local_78,0,0,1);
                if (iVar9 != 0) {
                  lVar11 = *(long *)(*(int **)(param_1 + 2) + 0x30);
                  if (((((*(byte *)(lVar11 + 0x60) >> 3 & 1) != 0) ||
                       (iVar9 = **(int **)(param_1 + 2), iVar9 < 0x304)) || (iVar9 == 0x10000)) ||
                     ((iVar9 = (**(code **)(lVar11 + 0x10))(param_1), iVar9 != 0 &&
                      (iVar9 = (**(code **)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x20))
                                         (param_1,0x91), iVar9 != 0)))) {
                    CRYPTO_free(local_78);
                    return 3;
                  }
                }
                goto LAB_009ddd94;
              }
              iVar9 = ssl_allow_compression(param_1);
              if (iVar9 == 0) {
                ERR_new();
                ERR_set_debug("ssl/statem/statem_clnt.c",0x66a,"tls_process_server_hello");
                uVar12 = 0x2f;
                uVar13 = 0x157;
              }
              else {
                lVar11 = ssl3_comp_find(*(undefined8 *)(*(long *)(param_1 + 0x26a) + 0x118),uVar15);
                if (lVar11 != 0) goto LAB_009de440;
                ERR_new();
                ERR_set_debug("ssl/statem/statem_clnt.c",0x672,"tls_process_server_hello");
                uVar12 = 0x2f;
                uVar13 = 0x101;
              }
            }
            else {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_clnt.c",0x664,"tls_process_server_hello");
              uVar12 = 0x2f;
              uVar13 = 0x158;
            }
          }
          else {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_clnt.c",0x644,"tls_process_server_hello");
            uVar12 = 0x46;
            uVar13 = 0xd2;
          }
        }
      }
      goto LAB_009ddd88;
    }
    local_70 = (byte *)0x0;
    uStack_68 = 0;
LAB_009ddeb8:
    iVar9 = tls_collect_extensions(param_1,&local_70,0x300,&local_78,0,1);
    if (iVar9 != 0) {
      iVar9 = ssl_choose_client_version(param_1,CONCAT11(uVar4,uVar5),local_78);
      if (iVar9 != 0) goto LAB_009ddeec;
    }
  }
LAB_009ddd94:
  pvVar10 = local_78;
LAB_009ddda4:
  CRYPTO_free(pvVar10);
  return 0;
}

