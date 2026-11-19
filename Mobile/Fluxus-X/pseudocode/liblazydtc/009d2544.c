/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d2544
 */

undefined8 tls_construct_ctos_ec_pt_formats(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  undefined4 local_40;
  undefined4 uStack_3c;
  undefined8 local_38;
  undefined8 local_28;
  
  iVar1 = ssl_get_min_max_version(param_1,&uStack_3c,&local_40,0);
  if (iVar1 == 0) {
    iVar1 = FUN_009d2668(param_1,uStack_3c,local_40);
    if (iVar1 == 0) {
      return 2;
    }
    tls1_get_formatlist(param_1,&local_28,&local_38);
    iVar1 = WPACKET_put_bytes__(param_2,0xb,2);
    if ((((iVar1 != 0) && (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 != 0)) &&
        (iVar1 = WPACKET_sub_memcpy__(param_2,local_28,local_38,1), iVar1 != 0)) &&
       (iVar1 = WPACKET_close(param_2), iVar1 != 0)) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0xb2,"tls_construct_ctos_ec_pt_formats");
    iVar1 = 0xc0103;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0xa4,"tls_construct_ctos_ec_pt_formats");
  }
  ossl_statem_fatal(param_1,0x50,iVar1,0);
  return 0;
}

