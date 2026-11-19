/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da048
 */

undefined8 tls_construct_stoc_early_data(long param_1,undefined8 param_2,int param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  if (param_3 == 0x2000) {
    if (*(int *)(param_1 + 0x1d40) == 0) {
      return 2;
    }
    iVar1 = WPACKET_put_bytes__(param_2,0x2a,2);
    if (((iVar1 != 0) && (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 != 0)) &&
       ((iVar1 = WPACKET_put_bytes__(param_2,*(undefined4 *)(param_1 + 0x1d40),4), iVar1 != 0 &&
        (iVar1 = WPACKET_close(param_2), iVar1 != 0)))) {
      return 1;
    }
    ERR_new();
    uVar2 = 0x759;
  }
  else {
    if (*(int *)(param_1 + 0xb30) != 2) {
      return 2;
    }
    iVar1 = WPACKET_put_bytes__(param_2,0x2a,2);
    if (((iVar1 != 0) && (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 != 0)) &&
       (iVar1 = WPACKET_close(param_2), iVar1 != 0)) {
      return 1;
    }
    ERR_new();
    uVar2 = 0x766;
  }
  ERR_set_debug("ssl/statem/extensions_srvr.c",uVar2,"tls_construct_stoc_early_data");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return 0;
}

