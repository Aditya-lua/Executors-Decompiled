/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d8168
 */

undefined8 tls_parse_ctos_supported_groups(long param_1,long *param_2)

{
  ulong uVar1;
  byte bVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 *puVar6;
  undefined1 *local_30;
  ulong uStack_28;
  
  if (1 < (ulong)param_2[1]) {
    puVar6 = (undefined1 *)*param_2;
    bVar2 = puVar6[1];
    uVar1 = (ulong)CONCAT11(*puVar6,bVar2);
    if (param_2[1] - 2U == uVar1) {
      local_30 = puVar6 + 2;
      *param_2 = (long)(local_30 + uVar1);
      param_2[1] = 0;
      uStack_28 = uVar1;
      if ((uVar1 != 0) && ((bVar2 & 1) == 0)) {
        if (*(int *)(param_1 + 0x4d0) != 0) {
          if ((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0) {
            return 1;
          }
          iVar3 = **(int **)(param_1 + 8);
          if (iVar3 < 0x304) {
            return 1;
          }
          if (iVar3 == 0x10000) {
            return 1;
          }
        }
        CRYPTO_free(*(void **)(param_1 + 0xad8));
        *(undefined8 *)(param_1 + 0xad8) = 0;
        *(undefined8 *)(param_1 + 0xad0) = 0;
        iVar3 = tls1_save_u16(&local_30,param_1 + 0xad8,param_1 + 0xad0);
        if (iVar3 != 0) {
          return 1;
        }
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_srvr.c",0x392,"tls_parse_ctos_supported_groups");
        uVar4 = 0x50;
        uVar5 = 0xc0103;
        goto LAB_009d824c;
      }
    }
  }
  ERR_new();
  ERR_set_debug("ssl/statem/extensions_srvr.c",0x387,"tls_parse_ctos_supported_groups");
  uVar4 = 0x32;
  uVar5 = 0x6e;
LAB_009d824c:
  ossl_statem_fatal(param_1,uVar4,uVar5,0);
  return 0;
}

