/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d6b9c
 */

undefined8 tls_parse_ctos_maxfragmentlen(long param_1,undefined8 *param_2)

{
  byte bVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  if (param_2[1] == 1) {
    bVar1 = *(byte *)*param_2;
    *param_2 = (byte *)*param_2 + 1;
    param_2[1] = 0;
    if (bVar1 - 1 < 4) {
      if ((*(int *)(param_1 + 0x4d0) == 0) ||
         ((uint)bVar1 == (uint)*(byte *)(*(long *)(param_1 + 0x918) + 0x368))) {
        *(byte *)(*(long *)(param_1 + 0x918) + 0x368) = bVar1;
        return 1;
      }
      ERR_new();
      uVar2 = 0xbe;
    }
    else {
      ERR_new();
      uVar2 = 0xb3;
    }
    ERR_set_debug("ssl/statem/extensions_srvr.c",uVar2,"tls_parse_ctos_maxfragmentlen");
    uVar2 = 0x2f;
    uVar3 = 0xe8;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_srvr.c",0xac,"tls_parse_ctos_maxfragmentlen");
    uVar2 = 0x32;
    uVar3 = 0x6e;
  }
  ossl_statem_fatal(param_1,uVar2,uVar3,0);
  return 0;
}

