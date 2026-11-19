/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d57e0
 */

undefined8 tls_parse_stoc_early_data(long param_1,long *param_2,int param_3)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  ulong uVar7;
  byte *pbVar8;
  
  uVar7 = param_2[1];
  if (param_3 == 0x2000) {
    if (3 < uVar7) {
      pbVar8 = (byte *)*param_2;
      bVar1 = *pbVar8;
      bVar2 = pbVar8[1];
      bVar3 = pbVar8[2];
      bVar4 = pbVar8[3];
      *param_2 = (long)(pbVar8 + 4);
      param_2[1] = uVar7 - 4;
      if (uVar7 - 4 == 0) {
        *(uint *)(*(long *)(param_1 + 0x918) + 0x354) =
             (uint)bVar1 << 0x18 | (uint)bVar2 << 0x10 | (uint)bVar3 << 8 | (uint)bVar4;
        return 1;
      }
    }
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0x76a,"tls_parse_stoc_early_data");
    uVar5 = 0x32;
    uVar6 = 0xae;
  }
  else {
    if (uVar7 == 0) {
      if ((*(int *)(param_1 + 0xb34) != 0) && (*(int *)(param_1 + 0x4d0) != 0)) {
        *(undefined4 *)(param_1 + 0xb30) = 2;
        return 1;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x77f,"tls_parse_stoc_early_data");
      uVar5 = 0x2f;
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x774,"tls_parse_stoc_early_data");
      uVar5 = 0x32;
    }
    uVar6 = 0x6e;
  }
  ossl_statem_fatal(param_1,uVar5,uVar6,0);
  return 0;
}

