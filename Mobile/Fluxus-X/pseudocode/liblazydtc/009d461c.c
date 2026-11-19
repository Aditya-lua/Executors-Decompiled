/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d461c
 */

undefined8 tls_parse_stoc_maxfragmentlen(long param_1,undefined8 *param_2)

{
  byte bVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  if (param_2[1] == 1) {
    bVar1 = *(byte *)*param_2;
    *param_2 = (byte *)*param_2 + 1;
    param_2[1] = 0;
    if (bVar1 - 1 < 4) {
      if ((uint)bVar1 == (uint)*(byte *)(param_1 + 0xb4c)) {
        *(byte *)(*(long *)(param_1 + 0x918) + 0x368) = bVar1;
        return 1;
      }
      ERR_new();
      uVar2 = 0x502;
    }
    else {
      ERR_new();
      uVar2 = 0x4f6;
    }
    ERR_set_debug("ssl/statem/extensions_clnt.c",uVar2,"tls_parse_stoc_maxfragmentlen");
    uVar2 = 0x2f;
    uVar3 = 0xe8;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0x4ef,"tls_parse_stoc_maxfragmentlen");
    uVar2 = 0x32;
    uVar3 = 0x6e;
  }
  ossl_statem_fatal(param_1,uVar2,uVar3,0);
  return 0;
}

