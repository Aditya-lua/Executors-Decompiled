/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d46f0
 */

undefined8 tls_parse_stoc_server_name(long param_1,long param_2)

{
  char *pcVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  if (*(char **)(param_1 + 0xa58) == (char *)0x0) {
    ERR_new();
    uVar2 = 0x513;
  }
  else {
    if (*(long *)(param_2 + 8) != 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x518,"tls_parse_stoc_server_name");
      uVar2 = 0x32;
      uVar3 = 0x6e;
      goto LAB_009d4760;
    }
    if (*(int *)(param_1 + 0x4d0) != 0) {
      return 1;
    }
    if (*(long *)(*(long *)(param_1 + 0x918) + 0x330) == 0) {
      pcVar1 = CRYPTO_strdup(*(char **)(param_1 + 0xa58),"ssl/statem/extensions_clnt.c",0x521);
      *(char **)(*(long *)(param_1 + 0x918) + 0x330) = pcVar1;
      if (pcVar1 != (char *)0x0) {
        return 1;
      }
      ERR_new();
      uVar2 = 0x523;
    }
    else {
      ERR_new();
      uVar2 = 0x51e;
    }
  }
  ERR_set_debug("ssl/statem/extensions_clnt.c",uVar2,"tls_parse_stoc_server_name");
  uVar2 = 0x50;
  uVar3 = 0xc0103;
LAB_009d4760:
  ossl_statem_fatal(param_1,uVar2,uVar3,0);
  return 0;
}

