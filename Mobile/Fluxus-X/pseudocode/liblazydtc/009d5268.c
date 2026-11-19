/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d5268
 */

undefined8 tls_parse_stoc_supported_versions(undefined4 *param_1,long *param_2,int param_3)

{
  undefined1 uVar1;
  undefined1 uVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 *puVar6;
  
  if (1 < (ulong)param_2[1]) {
    puVar6 = (undefined1 *)*param_2;
    lVar3 = param_2[1] - 2;
    uVar1 = *puVar6;
    uVar2 = puVar6[1];
    *param_2 = (long)(puVar6 + 2);
    param_2[1] = lVar3;
    if (lVar3 == 0) {
      if (CONCAT11(uVar1,uVar2) == 0x304) {
        if (param_3 != 0x800) {
          *param_1 = 0x304;
        }
        return 1;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x6bb,"tls_parse_stoc_supported_versions");
      uVar4 = 0x2f;
      uVar5 = 0x74;
      goto LAB_009d52c4;
    }
  }
  ERR_new();
  ERR_set_debug("ssl/statem/extensions_clnt.c",0x6b1,"tls_parse_stoc_supported_versions");
  uVar4 = 0x32;
  uVar5 = 0x9f;
LAB_009d52c4:
  ossl_statem_fatal(param_1,uVar4,uVar5,0);
  return 0;
}

