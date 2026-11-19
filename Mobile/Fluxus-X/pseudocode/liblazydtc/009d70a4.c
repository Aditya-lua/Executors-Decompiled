/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d70a4
 */

undefined8 tls_parse_ctos_status_request(long param_1,long *param_2,undefined8 param_3,long param_4)

{
  ulong len;
  byte bVar1;
  int iVar2;
  OCSP_RESPID *a;
  X509_EXTENSIONS *pXVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  byte *pbVar6;
  ulong uVar7;
  undefined1 *puVar8;
  long lVar9;
  ulong uVar10;
  byte *local_48;
  
  if (param_4 != 0) {
    return 1;
  }
  if (*(int *)(param_1 + 0x4d0) != 0) {
    return 1;
  }
  lVar9 = param_2[1];
  if (lVar9 == 0) {
    ERR_new(1);
    uVar4 = 0x13b;
  }
  else {
    pbVar6 = (byte *)*param_2;
    bVar1 = *pbVar6;
    *(uint *)(param_1 + 0xa60) = (uint)bVar1;
    *param_2 = (long)(pbVar6 + 1);
    param_2[1] = lVar9 - 1U;
    if (bVar1 != 1) {
      *(undefined4 *)(param_1 + 0xa60) = 0xffffffff;
      return 1;
    }
    if (1 < lVar9 - 1U) {
      uVar10 = (ulong)CONCAT11(pbVar6[1],pbVar6[2]);
      if (uVar10 <= lVar9 - 3U) {
        pbVar6 = pbVar6 + 3;
        *param_2 = (long)(pbVar6 + uVar10);
        param_2[1] = (lVar9 - 3U) - uVar10;
        OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0xa78),OCSP_RESPID_free);
        if (uVar10 == 0) {
          *(undefined8 *)(param_1 + 0xa78) = 0;
        }
        else {
          lVar9 = OPENSSL_sk_new_null();
          *(long *)(param_1 + 0xa78) = lVar9;
          if (lVar9 == 0) {
            ERR_new();
            ERR_set_debug("ssl/statem/extensions_srvr.c",0x154,"tls_parse_ctos_status_request");
            uVar4 = 0x50;
            uVar5 = 0xc0100;
            goto LAB_009d715c;
          }
          do {
            if (uVar10 == 1) {
LAB_009d7300:
              ERR_new();
              uVar4 = 0x162;
              goto LAB_009d7150;
            }
            len = (ulong)CONCAT11(*pbVar6,pbVar6[1]);
            uVar7 = uVar10 - 2;
            uVar10 = uVar7 - len;
            if ((uVar7 < len) || (len == 0)) goto LAB_009d7300;
            local_48 = pbVar6 + 2;
            a = d2i_OCSP_RESPID((OCSP_RESPID **)0x0,&local_48,len);
            if (a == (OCSP_RESPID *)0x0) {
              ERR_new();
              uVar4 = 0x16a;
              goto LAB_009d7150;
            }
            pbVar6 = pbVar6 + 2 + len;
            if (local_48 != pbVar6) {
              OCSP_RESPID_free(a);
              ERR_new();
              uVar4 = 0x170;
              goto LAB_009d7150;
            }
            iVar2 = OPENSSL_sk_push(*(undefined8 *)(param_1 + 0xa78),a);
            if (iVar2 == 0) {
              OCSP_RESPID_free(a);
              ERR_new();
              ERR_set_debug("ssl/statem/extensions_srvr.c",0x177,"tls_parse_ctos_status_request");
              uVar5 = 0xc0103;
              uVar4 = 0x50;
              goto LAB_009d715c;
            }
          } while (uVar10 != 0);
        }
        if (1 < (ulong)param_2[1]) {
          puVar8 = (undefined1 *)*param_2;
          uVar10 = (ulong)CONCAT11(*puVar8,puVar8[1]);
          if (param_2[1] - 2U == uVar10) {
            local_48 = puVar8 + 2;
            pbVar6 = local_48 + uVar10;
            *param_2 = (long)pbVar6;
            param_2[1] = 0;
            if (uVar10 == 0) {
              return 1;
            }
            OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0xa80),X509_EXTENSION_free);
            pXVar3 = d2i_X509_EXTENSIONS((X509_EXTENSIONS **)0x0,&local_48,uVar10);
            *(X509_EXTENSIONS **)(param_1 + 0xa80) = pXVar3;
            if ((pXVar3 != (X509_EXTENSIONS *)0x0) && (local_48 == pbVar6)) {
              return 1;
            }
            ERR_new();
            uVar4 = 0x18b;
            goto LAB_009d7150;
          }
        }
        ERR_new();
        uVar4 = 0x17f;
        goto LAB_009d7150;
      }
    }
    ERR_new(1);
    uVar4 = 0x148;
  }
LAB_009d7150:
  ERR_set_debug("ssl/statem/extensions_srvr.c",uVar4,"tls_parse_ctos_status_request");
  uVar4 = 0x32;
  uVar5 = 0x6e;
LAB_009d715c:
  ossl_statem_fatal(param_1,uVar4,uVar5,0);
  return 0;
}

