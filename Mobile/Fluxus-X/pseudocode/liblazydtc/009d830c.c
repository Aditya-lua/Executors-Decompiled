/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d830c
 */

undefined8 tls_parse_ctos_early_data(long param_1,long param_2)

{
  undefined8 uVar1;
  
  if (*(long *)(param_2 + 8) == 0) {
    if (*(int *)(param_1 + 0x8e8) == 0) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_srvr.c",0x3b5,"tls_parse_ctos_early_data");
    uVar1 = 0x2f;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_srvr.c",0x3b0,"tls_parse_ctos_early_data");
    uVar1 = 0x32;
  }
  ossl_statem_fatal(param_1,uVar1,0x6e,0);
  return 0;
}

