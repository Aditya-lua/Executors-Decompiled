/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009eaaf0
 */

undefined8 tls_process_next_proto(long param_1,long *param_2)

{
  byte *pbVar1;
  byte bVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  ulong uVar7;
  ulong uVar8;
  byte *pbVar9;
  
  if (param_2[1] != 0) {
    uVar7 = param_2[1] - 1;
    pbVar9 = (byte *)*param_2 + 1;
    bVar2 = *(byte *)*param_2;
    uVar8 = (ulong)bVar2;
    lVar4 = uVar7 - uVar8;
    if (uVar8 <= uVar7) {
      pbVar1 = pbVar9 + uVar8;
      *param_2 = (long)pbVar1;
      param_2[1] = lVar4;
      if (lVar4 != 0) {
        uVar7 = (ulong)*pbVar1;
        lVar3 = (lVar4 - 1U) - uVar7;
        if (uVar7 <= lVar4 - 1U) {
          *param_2 = (long)(pbVar1 + uVar7 + 1);
          param_2[1] = lVar3;
          if (lVar3 == 0) {
            CRYPTO_free(*(void **)(param_1 + 0xb18));
            *(undefined8 *)(param_1 + 0xb18) = 0;
            if (bVar2 == 0) {
              uVar8 = 0;
LAB_009eac00:
              *(ulong *)(param_1 + 0xb20) = uVar8;
              return 3;
            }
            lVar4 = CRYPTO_memdup(pbVar9,uVar8,"include/internal/packet.h",0x1cf);
            *(long *)(param_1 + 0xb18) = lVar4;
            if (lVar4 != 0) goto LAB_009eac00;
            *(undefined8 *)(param_1 + 0xb20) = 0;
            ERR_new();
            ERR_set_debug("ssl/statem/statem_srvr.c",0xff6,"tls_process_next_proto");
            uVar5 = 0x50;
            uVar6 = 0xc0103;
            goto LAB_009eab70;
          }
        }
      }
    }
  }
  ERR_new();
  ERR_set_debug("ssl/statem/statem_srvr.c",0xff0,"tls_process_next_proto");
  uVar5 = 0x32;
  uVar6 = 0x9f;
LAB_009eab70:
  ossl_statem_fatal(param_1,uVar5,uVar6,0);
  return 0;
}

