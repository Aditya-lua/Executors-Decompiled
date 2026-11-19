/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d4e10
 */

undefined8 tls_parse_stoc_alpn(long param_1,long *param_2)

{
  undefined1 uVar1;
  undefined1 uVar2;
  byte bVar3;
  ulong uVar4;
  int iVar5;
  void *pvVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  ulong uVar10;
  long lVar11;
  undefined1 *puVar12;
  
  if (*(int *)(param_1 + 0x4a8) == 0) {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0x623,"tls_parse_stoc_alpn");
    uVar8 = 0x6e;
  }
  else {
    uVar10 = param_2[1];
    if (uVar10 < 2) {
LAB_009d4e3c:
      ERR_new();
      uVar8 = 0x62f;
    }
    else {
      puVar12 = (undefined1 *)*param_2;
      uVar4 = uVar10 - 2;
      uVar1 = *puVar12;
      uVar2 = puVar12[1];
      *param_2 = (long)(puVar12 + 2);
      param_2[1] = uVar4;
      if ((uVar4 == 0) || (uVar4 != CONCAT11(uVar1,uVar2))) goto LAB_009d4e3c;
      bVar3 = puVar12[2];
      uVar10 = uVar10 - 3;
      *param_2 = (long)(puVar12 + 3);
      param_2[1] = uVar10;
      if (uVar10 != bVar3) goto LAB_009d4e3c;
      CRYPTO_free(*(void **)(param_1 + 0x488));
      pvVar6 = CRYPTO_malloc((int)uVar10,"ssl/statem/extensions_clnt.c",0x633);
      *(void **)(param_1 + 0x488) = pvVar6;
      if (pvVar6 == (void *)0x0) {
        *(undefined8 *)(param_1 + 0x490) = 0;
        ERR_new();
        uVar8 = 0x636;
LAB_009d4f58:
        ERR_set_debug("ssl/statem/extensions_clnt.c",uVar8,"tls_parse_stoc_alpn");
        uVar8 = 0x50;
        uVar9 = 0xc0103;
        goto LAB_009d4e84;
      }
      if (uVar10 <= (ulong)param_2[1]) {
        memcpy(pvVar6,(void *)*param_2,uVar10);
        *param_2 = *param_2 + uVar10;
        param_2[1] = param_2[1] - uVar10;
        *(ulong *)(param_1 + 0x490) = uVar10;
        pvVar6 = *(void **)(*(long *)(param_1 + 0x918) + 0x358);
        if (((pvVar6 == (void *)0x0) || (*(ulong *)(*(long *)(param_1 + 0x918) + 0x360) != uVar10))
           || (iVar5 = memcmp(pvVar6,*(void **)(param_1 + 0x488),uVar10), iVar5 != 0)) {
          *(undefined4 *)(param_1 + 0xb34) = 0;
        }
        if (*(int *)(param_1 + 0x4d0) != 0) {
          return 1;
        }
        if (pvVar6 == (void *)0x0) {
          lVar7 = CRYPTO_memdup(*(undefined8 *)(param_1 + 0x488),uVar10,
                                "ssl/statem/extensions_clnt.c",0x650);
          lVar11 = *(long *)(param_1 + 0x918);
          *(long *)(lVar11 + 0x358) = lVar7;
          if (lVar7 != 0) {
            *(undefined8 *)(lVar11 + 0x360) = *(undefined8 *)(param_1 + 0x490);
            return 1;
          }
          *(undefined8 *)(lVar11 + 0x360) = 0;
          ERR_new();
          uVar8 = 0x653;
        }
        else {
          ERR_new();
          uVar8 = 0x64c;
        }
        goto LAB_009d4f58;
      }
      ERR_new();
      uVar8 = 0x63a;
    }
    ERR_set_debug("ssl/statem/extensions_clnt.c",uVar8,"tls_parse_stoc_alpn");
    uVar8 = 0x32;
  }
  uVar9 = 0x6e;
LAB_009d4e84:
  ossl_statem_fatal(param_1,uVar8,uVar9,0);
  return 0;
}

