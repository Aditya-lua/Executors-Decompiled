/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d95e8
 */

undefined8 tls_construct_stoc_supported_versions(int *param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0) &&
      (iVar1 = **(int **)(param_1 + 2), 0x303 < iVar1)) && (iVar1 != 0x10000)) {
    iVar1 = WPACKET_put_bytes__(param_2,0x2b,2);
    if (((iVar1 != 0) && (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 != 0)) &&
       ((iVar1 = WPACKET_put_bytes__(param_2,(long)*param_1,2), iVar1 != 0 &&
        (iVar1 = WPACKET_close(param_2), iVar1 != 0)))) {
      return 1;
    }
    ERR_new();
    uVar2 = 0x62c;
  }
  else {
    ERR_new();
    uVar2 = 0x624;
  }
  ERR_set_debug("ssl/statem/extensions_srvr.c",uVar2,"tls_construct_stoc_supported_versions");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return 0;
}

