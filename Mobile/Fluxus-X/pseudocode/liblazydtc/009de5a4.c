/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009de5a4
 */

undefined8 tls_process_server_certificate(long param_1,long *param_2)

{
  char cVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  ulong uVar5;
  int iVar6;
  long lVar7;
  X509 *pXVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  ulong uVar11;
  byte *pbVar12;
  undefined1 *puVar13;
  byte *pbVar14;
  long lVar15;
  undefined1 *local_68;
  ulong uStack_60;
  void *local_58;
  byte *local_50;
  X509 *local_48;
  
  local_48 = (X509 *)0x0;
  lVar7 = OPENSSL_sk_new_null();
  *(long *)(*(long *)(param_1 + 0x918) + 0x2c0) = lVar7;
  if (lVar7 == 0) {
    ERR_new();
    uVar9 = 0x6f6;
LAB_009de800:
    ERR_set_debug("ssl/statem/statem_clnt.c",uVar9,"tls_process_server_certificate");
    uVar9 = 0x50;
    uVar10 = 0xc0100;
    goto LAB_009de810;
  }
  if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
      (iVar6 = **(int **)(param_1 + 8), 0x303 < iVar6)) && (iVar6 != 0x10000)) {
    if (param_2[1] != 0) {
      cVar1 = *(char *)*param_2;
      *param_2 = (long)((char *)*param_2 + 1);
      param_2[1] = param_2[1] + -1;
      if (cVar1 == '\0') goto LAB_009de618;
    }
  }
  else {
LAB_009de618:
    if (2 < (ulong)param_2[1]) {
      pbVar14 = (byte *)*param_2;
      uVar5 = param_2[1] - 3;
      bVar2 = *pbVar14;
      bVar3 = pbVar14[1];
      bVar4 = pbVar14[2];
      *param_2 = (long)(pbVar14 + 3);
      param_2[1] = uVar5;
      if ((uVar5 != 0) &&
         (uVar11 = (ulong)bVar2 << 0x10 | (ulong)bVar3 << 8 | (ulong)bVar4, uVar5 == uVar11)) {
        lVar15 = 0;
        while (uVar5 = uVar11 - 3, 2 < uVar11) {
          pbVar12 = (byte *)*param_2;
          pbVar14 = pbVar12 + 3;
          uVar11 = (ulong)*pbVar12 << 0x10 | (ulong)pbVar12[1] << 8 | (ulong)pbVar12[2];
          *param_2 = (long)pbVar14;
          param_2[1] = uVar5;
          if (uVar5 < uVar11) break;
          *param_2 = (long)(pbVar14 + uVar11);
          param_2[1] = uVar5 - uVar11;
          local_50 = pbVar14;
          local_48 = (X509 *)X509_new_ex(**(undefined8 **)(param_1 + 0x9a8),
                                         (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
          if (local_48 == (X509 *)0x0) {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_clnt.c",0x70c,"tls_process_server_certificate");
            ossl_statem_fatal(param_1,0x32,0xc0100,0);
            ERR_new();
            ERR_set_debug("ssl/statem/statem_clnt.c",0x70d,"tls_process_server_certificate");
            ERR_set_error(0x14,0xc0100,0);
            goto LAB_009de81c;
          }
          pXVar8 = d2i_X509(&local_48,&local_50,uVar11);
          if (pXVar8 == (X509 *)0x0) {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_clnt.c",0x712,"tls_process_server_certificate");
            uVar9 = 0x2a;
            uVar10 = 0x8000d;
            goto LAB_009de810;
          }
          if (local_50 != pbVar14 + uVar11) {
            ERR_new();
            uVar9 = 0x717;
            goto LAB_009de924;
          }
          if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
              (iVar6 = **(int **)(param_1 + 8), 0x303 < iVar6)) && (iVar6 != 0x10000)) {
            local_58 = (void *)0x0;
            uVar5 = param_2[1] - 2;
            if (1 < (ulong)param_2[1]) {
              puVar13 = (undefined1 *)*param_2;
              uVar11 = (ulong)CONCAT11(*puVar13,puVar13[1]);
              if (uVar11 <= uVar5) {
                local_68 = puVar13 + 2;
                *param_2 = (long)(local_68 + uVar11);
                param_2[1] = uVar5 - uVar11;
                uStack_60 = uVar11;
                iVar6 = tls_collect_extensions(param_1,&local_68,0x1000,&local_58,0,lVar15 == 0);
                if ((iVar6 != 0) &&
                   (iVar6 = tls_parse_all_extensions
                                      (param_1,0x1000,local_58,local_48,lVar15,param_2[1] == 0),
                   iVar6 != 0)) {
                  CRYPTO_free(local_58);
                  goto LAB_009de794;
                }
                CRYPTO_free(local_58);
                goto LAB_009de81c;
              }
            }
            ERR_new();
            ERR_set_debug("ssl/statem/statem_clnt.c",0x720,"tls_process_server_certificate");
            uVar9 = 0x32;
            uVar10 = 0x10f;
            goto LAB_009de810;
          }
LAB_009de794:
          iVar6 = OPENSSL_sk_push(*(undefined8 *)(*(long *)(param_1 + 0x918) + 0x2c0),local_48);
          if (iVar6 == 0) {
            ERR_new();
            uVar9 = 0x731;
            goto LAB_009de800;
          }
          local_48 = (X509 *)0x0;
          uVar11 = param_2[1];
          lVar15 = lVar15 + 1;
          lVar7 = 2;
          if (uVar11 == 0) {
            return 2;
          }
        }
        ERR_new(lVar7);
        uVar9 = 0x705;
LAB_009de924:
        ERR_set_debug("ssl/statem/statem_clnt.c",uVar9,"tls_process_server_certificate");
        uVar9 = 0x32;
        uVar10 = 0x87;
        goto LAB_009de810;
      }
    }
  }
  ERR_new();
  ERR_set_debug("ssl/statem/statem_clnt.c",0x6ff,"tls_process_server_certificate");
  uVar9 = 0x32;
  uVar10 = 0x9f;
LAB_009de810:
  ossl_statem_fatal(param_1,uVar9,uVar10,0);
LAB_009de81c:
  X509_free(local_48);
  OPENSSL_sk_pop_free(*(undefined8 *)(*(long *)(param_1 + 0x918) + 0x2c0),X509_free);
  *(undefined8 *)(*(long *)(param_1 + 0x918) + 0x2c0) = 0;
  return 0;
}

