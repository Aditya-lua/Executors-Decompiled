/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d6d74
 */

undefined8 tls_parse_ctos_ec_pt_formats(long param_1,long *param_2)

{
  byte bVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  byte *pbVar5;
  ulong uVar6;
  
  lVar4 = param_2[1];
  if (lVar4 != 0) {
    pbVar5 = (byte *)*param_2;
    uVar6 = lVar4 - 1;
    bVar1 = *pbVar5;
    if (uVar6 == bVar1) {
      *param_2 = (long)(pbVar5 + lVar4);
      param_2[1] = 0;
      if (bVar1 != 0) {
        if (*(int *)(param_1 + 0x4d0) != 0) {
          return 1;
        }
        CRYPTO_free(*(void **)(param_1 + 0xab8));
        *(undefined8 *)(param_1 + 0xab8) = 0;
        *(undefined8 *)(param_1 + 0xab0) = 0;
        lVar4 = CRYPTO_memdup(pbVar5 + 1,uVar6,"include/internal/packet.h",0x1cf);
        *(long *)(param_1 + 0xab8) = lVar4;
        if (lVar4 != 0) {
          *(ulong *)(param_1 + 0xab0) = uVar6;
          return 1;
        }
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_srvr.c",0xee,"tls_parse_ctos_ec_pt_formats");
        uVar2 = 0x50;
        uVar3 = 0xc0103;
        goto LAB_009d6de8;
      }
    }
  }
  ERR_new();
  ERR_set_debug("ssl/statem/extensions_srvr.c",0xe6,"tls_parse_ctos_ec_pt_formats");
  uVar2 = 0x32;
  uVar3 = 0x6e;
LAB_009d6de8:
  ossl_statem_fatal(param_1,uVar2,uVar3,0);
  return 0;
}

