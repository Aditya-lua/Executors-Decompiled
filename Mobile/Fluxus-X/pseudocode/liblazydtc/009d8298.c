/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d8298
 */

undefined8 tls_parse_ctos_ems(long param_1,long param_2)

{
  undefined8 uVar1;
  
  if (*(long *)(param_2 + 8) == 0) {
    if ((*(byte *)(param_1 + 0x9e8) & 1) == 0) {
      *(ulong *)(param_1 + 0xa8) = *(ulong *)(param_1 + 0xa8) | 0x200;
    }
    uVar1 = 1;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_srvr.c",0x39f,"tls_parse_ctos_ems");
    ossl_statem_fatal(param_1,0x32,0x6e,0);
    uVar1 = 0;
  }
  return uVar1;
}

