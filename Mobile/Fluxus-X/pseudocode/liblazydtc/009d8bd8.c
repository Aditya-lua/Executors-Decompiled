/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d8bd8
 */

undefined8 tls_construct_stoc_server_name(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if (*(int *)(param_1 + 0xb60) == 1) {
    if (*(int *)(param_1 + 0x4d0) != 0) {
      if ((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0)
      goto LAB_009d8c58;
      iVar1 = **(int **)(param_1 + 8);
      if (iVar1 < 0x304) {
        return 2;
      }
      if (iVar1 == 0x10000) {
        return 2;
      }
    }
    iVar1 = WPACKET_put_bytes__(param_2,0,2);
    if ((iVar1 == 0) || (iVar1 = WPACKET_put_bytes__(param_2,0,2), iVar1 == 0)) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_srvr.c",0x4fe,"tls_construct_stoc_server_name");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      uVar2 = 0;
    }
    else {
      uVar2 = 1;
    }
  }
  else {
LAB_009d8c58:
    uVar2 = 2;
  }
  return uVar2;
}

