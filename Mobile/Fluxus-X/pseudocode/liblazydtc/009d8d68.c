/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d8d68
 */

undefined8 tls_construct_stoc_ec_pt_formats(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 local_30;
  undefined8 uStack_28;
  
  if ((((*(byte *)(*(long *)(param_1 + 0x2e0) + 0x1c) >> 2 & 1) == 0) &&
      ((*(byte *)(*(long *)(param_1 + 0x2e0) + 0x20) >> 3 & 1) == 0)) ||
     (*(long *)(param_1 + 0xab8) == 0)) {
    uVar2 = 2;
  }
  else {
    tls1_get_formatlist(param_1,&uStack_28,&local_30);
    iVar1 = WPACKET_put_bytes__(param_2,0xb,2);
    if (((iVar1 == 0) || (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 == 0)) ||
       ((iVar1 = WPACKET_sub_memcpy__(param_2,uStack_28,local_30,1), iVar1 == 0 ||
        (iVar1 = WPACKET_close(param_2), iVar1 == 0)))) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_srvr.c",0x52f,"tls_construct_stoc_ec_pt_formats");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      uVar2 = 0;
    }
    else {
      uVar2 = 1;
    }
  }
  return uVar2;
}

