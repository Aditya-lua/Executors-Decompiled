/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d73bc
 */

undefined8 tls_parse_ctos_alpn(long param_1,long *param_2)

{
  byte *pbVar1;
  long *plVar2;
  ulong uVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  byte *pbVar7;
  undefined1 *puVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  
  if ((*(long *)(param_1 + 0x240) != 0) && (*(long *)(param_1 + 0x2c8) != 0)) {
    return 1;
  }
  if (1 < (ulong)param_2[1]) {
    puVar8 = (undefined1 *)*param_2;
    uVar3 = (ulong)CONCAT11(*puVar8,puVar8[1]);
    if (param_2[1] - 2U == uVar3) {
      pbVar1 = puVar8 + 2;
      *param_2 = (long)(pbVar1 + uVar3);
      param_2[1] = 0;
      if (1 < uVar3) {
        pbVar7 = pbVar1;
        uVar9 = uVar3;
        do {
          uVar11 = (ulong)*pbVar7;
          uVar10 = uVar9 - 1;
          uVar9 = uVar10 - uVar11;
          if ((uVar10 < uVar11) || (*pbVar7 == 0)) {
            ERR_new();
            uVar5 = 0x1ba;
            goto LAB_009d7438;
          }
          pbVar7 = pbVar7 + uVar11 + 1;
        } while (uVar9 != 0);
        plVar2 = (long *)(param_1 + 0x498);
        CRYPTO_free(*(void **)(param_1 + 0x498));
        *(undefined8 *)(param_1 + 0x4a0) = 0;
        *plVar2 = 0;
        CRYPTO_free((void *)0x0);
        *(undefined8 *)(param_1 + 0x4a0) = 0;
        *plVar2 = 0;
        if (uVar3 == 0) {
          return 1;
        }
        lVar4 = CRYPTO_memdup(pbVar1,uVar3,"include/internal/packet.h",0x1cf);
        *plVar2 = lVar4;
        if (lVar4 != 0) {
          *(ulong *)(param_1 + 0x4a0) = uVar3;
          return 1;
        }
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_srvr.c",0x1c4,"tls_parse_ctos_alpn");
        uVar5 = 0x50;
        uVar6 = 0xc0103;
        goto LAB_009d7444;
      }
    }
  }
  ERR_new();
  uVar5 = 0x1b1;
LAB_009d7438:
  ERR_set_debug("ssl/statem/extensions_srvr.c",uVar5,"tls_parse_ctos_alpn");
  uVar5 = 0x32;
  uVar6 = 0x6e;
LAB_009d7444:
  ossl_statem_fatal(param_1,uVar5,uVar6,0);
  return 0;
}

