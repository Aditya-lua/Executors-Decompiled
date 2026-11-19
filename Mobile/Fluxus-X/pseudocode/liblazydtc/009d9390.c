/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d9390
 */

undefined8 tls_construct_stoc_use_srtp(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if (*(long *)(param_1 + 0xb98) == 0) {
    uVar2 = 2;
  }
  else {
    iVar1 = WPACKET_put_bytes__(param_2,0xe,2);
    if ((((iVar1 == 0) || (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 == 0)) ||
        (iVar1 = WPACKET_put_bytes__(param_2,2,2), iVar1 == 0)) ||
       (((iVar1 = WPACKET_put_bytes__(param_2,*(undefined8 *)(*(long *)(param_1 + 0xb98) + 8),2),
         iVar1 == 0 || (iVar1 = WPACKET_put_bytes__(param_2,0,1), iVar1 == 0)) ||
        (iVar1 = WPACKET_close(param_2), iVar1 == 0)))) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_srvr.c",0x5eb,"tls_construct_stoc_use_srtp");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      uVar2 = 0;
    }
    else {
      uVar2 = 1;
    }
  }
  return uVar2;
}

