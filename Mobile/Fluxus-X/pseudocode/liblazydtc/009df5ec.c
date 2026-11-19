/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009df5ec
 */

undefined8 tls_process_certificate_request(long param_1,long *param_2)

{
  long *plVar1;
  byte bVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  ulong uVar7;
  undefined1 *puVar8;
  ulong uVar9;
  byte *pbVar10;
  void *local_58;
  undefined1 *local_50;
  ulong uStack_48;
  
  *(undefined8 *)(param_1 + 0x3d0) = 0;
  *(undefined8 *)(param_1 + 0x3c8) = 0;
  *(undefined8 *)(param_1 + 0x3c0) = 0;
  *(undefined8 *)(param_1 + 0x3b8) = 0;
  *(undefined4 *)(param_1 + 0x3d8) = 0;
  if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
      (iVar3 = **(int **)(param_1 + 8), 0x303 < iVar3)) && (iVar3 != 0x10000)) {
    local_58 = (void *)0x0;
    if ((*(byte *)(param_1 + 0x44) & 1) != 0) {
      return 1;
    }
    CRYPTO_free(*(void **)(param_1 + 0x2f8));
    *(undefined8 *)(param_1 + 0x300) = 0;
    *(undefined8 *)(param_1 + 0x2f8) = 0;
    CRYPTO_free(*(void **)(param_1 + 0xbb0));
    *(undefined8 *)(param_1 + 3000) = 0;
    *(undefined8 *)(param_1 + 0xbb0) = 0;
    uVar7 = param_2[1];
    if (uVar7 != 0) {
      uVar7 = uVar7 - 1;
      pbVar10 = (byte *)*param_2 + 1;
      bVar2 = *(byte *)*param_2;
      uVar9 = (ulong)bVar2;
      if (uVar9 <= uVar7) {
        plVar1 = (long *)(param_1 + 0xbb0);
        *param_2 = (long)(pbVar10 + uVar9);
        param_2[1] = uVar7 - uVar9;
        CRYPTO_free((void *)*plVar1);
        *plVar1 = 0;
        *(undefined8 *)(param_1 + 3000) = 0;
        if (bVar2 != 0) {
          lVar4 = CRYPTO_memdup(pbVar10,uVar9,"include/internal/packet.h",0x1cf);
          *plVar1 = lVar4;
          if (lVar4 == 0) goto LAB_009df6b0;
          *(ulong *)(param_1 + 3000) = uVar9;
        }
        uVar9 = param_2[1];
        uVar7 = uVar9 - 2;
        if (uVar9 < 2) {
LAB_009df8b4:
          ERR_new();
          ERR_set_debug("ssl/statem/statem_clnt.c",0x943,"tls_process_certificate_request");
          uVar5 = 0x32;
        }
        else {
          puVar8 = (undefined1 *)*param_2;
          uVar9 = (ulong)CONCAT11(*puVar8,puVar8[1]);
          if (uVar7 < uVar9) goto LAB_009df8b4;
          local_50 = puVar8 + 2;
          *param_2 = (long)(local_50 + uVar9);
          param_2[1] = uVar7 - uVar9;
          uStack_48 = uVar9;
          iVar3 = tls_collect_extensions(param_1,&local_50,0x4000,&local_58,0,1);
          if ((iVar3 == 0) ||
             (iVar3 = tls_parse_all_extensions(param_1,0x4000,local_58,0,0,1), iVar3 == 0)) {
            CRYPTO_free(local_58);
            return 0;
          }
          CRYPTO_free(local_58);
          iVar3 = tls1_process_sigalgs(param_1);
          if (iVar3 != 0) goto LAB_009df7a8;
          ERR_new();
          ERR_set_debug("ssl/statem/statem_clnt.c",0x951,"tls_process_certificate_request");
          uVar5 = 0x50;
        }
        uVar6 = 0x10f;
        goto LAB_009df710;
      }
    }
LAB_009df6b0:
    ERR_new();
    uVar5 = 0x93e;
  }
  else {
    uVar7 = param_2[1];
    if (uVar7 != 0) {
      uVar7 = uVar7 - 1;
      pbVar10 = (byte *)*param_2 + 1;
      bVar2 = *(byte *)*param_2;
      uVar9 = (ulong)bVar2;
      if (uVar9 <= uVar7) {
        *param_2 = (long)(pbVar10 + uVar9);
        param_2[1] = uVar7 - uVar9;
        CRYPTO_free(*(void **)(param_1 + 0x2f8));
        *(undefined8 *)(param_1 + 0x300) = 0;
        *(undefined8 *)(param_1 + 0x2f8) = 0;
        if (bVar2 != 0) {
          lVar4 = CRYPTO_memdup(pbVar10,uVar9,"include/internal/packet.h",0x1cf);
          *(long *)(param_1 + 0x2f8) = lVar4;
          if (lVar4 == 0) {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_clnt.c",0x95e,"tls_process_certificate_request");
            uVar6 = 0xc0103;
            uVar5 = 0x50;
            goto LAB_009df710;
          }
          *(ulong *)(param_1 + 0x300) = uVar9;
        }
        if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 1 & 1) == 0) {
LAB_009df798:
          uVar5 = parse_ca_names(param_1,param_2);
          if ((int)uVar5 == 0) {
            return uVar5;
          }
LAB_009df7a8:
          if (param_2[1] == 0) {
            *(undefined4 *)(param_1 + 0x2f0) = 1;
            if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
                (iVar3 = **(int **)(param_1 + 8), 0x303 < iVar3)) &&
               ((iVar3 != 0x10000 && (*(int *)(param_1 + 0xba8) != 4)))) {
              return 3;
            }
            return 2;
          }
          ERR_new();
          uVar5 = 0x981;
        }
        else {
          uVar9 = param_2[1];
          uVar7 = uVar9 - 2;
          if (1 < uVar9) {
            puVar8 = (undefined1 *)*param_2;
            uVar9 = (ulong)CONCAT11(*puVar8,puVar8[1]);
            if (uVar9 <= uVar7) {
              local_50 = puVar8 + 2;
              *param_2 = (long)(local_50 + uVar9);
              param_2[1] = uVar7 - uVar9;
              uStack_48 = uVar9;
              iVar3 = tls1_save_sigalgs(param_1,&local_50,0);
              if (iVar3 == 0) {
                ERR_new();
                ERR_set_debug("ssl/statem/statem_clnt.c",0x970,"tls_process_certificate_request");
                uVar5 = 0x50;
                uVar6 = 0x168;
                goto LAB_009df710;
              }
              iVar3 = tls1_process_sigalgs(param_1);
              if (iVar3 == 0) {
                ERR_new();
                ERR_set_debug("ssl/statem/statem_clnt.c",0x974,"tls_process_certificate_request");
                uVar5 = 0x50;
                uVar6 = 0xc0100;
                goto LAB_009df710;
              }
              goto LAB_009df798;
            }
          }
          ERR_new();
          uVar5 = 0x966;
        }
        goto LAB_009df704;
      }
    }
    ERR_new();
    uVar5 = 0x959;
  }
LAB_009df704:
  ERR_set_debug("ssl/statem/statem_clnt.c",uVar5,"tls_process_certificate_request");
  uVar5 = 0x32;
  uVar6 = 0x9f;
LAB_009df710:
  ossl_statem_fatal(param_1,uVar5,uVar6,0);
  return 0;
}

