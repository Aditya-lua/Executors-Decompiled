/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d9550
 */

undefined8 tls_construct_stoc_ems(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((*(byte *)(param_1 + 0xa9) >> 1 & 1) == 0) {
    uVar2 = 2;
  }
  else {
    iVar1 = WPACKET_put_bytes__(param_2,0x17,2);
    if ((iVar1 == 0) || (iVar1 = WPACKET_put_bytes__(param_2,0,2), iVar1 == 0)) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_srvr.c",0x618,"tls_construct_stoc_ems");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      uVar2 = 0;
    }
    else {
      uVar2 = 1;
    }
  }
  return uVar2;
}

