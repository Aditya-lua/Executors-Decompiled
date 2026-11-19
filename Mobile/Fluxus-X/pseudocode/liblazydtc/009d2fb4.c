/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d2fb4
 */

undefined8 tls_construct_ctos_alpn(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  *(undefined4 *)(param_1 + 0x4a8) = 0;
  if ((*(long *)(param_1 + 0xb08) == 0) ||
     ((*(long *)(param_1 + 0x240) != 0 && (*(long *)(param_1 + 0x2c8) != 0)))) {
    uVar2 = 2;
  }
  else {
    iVar1 = WPACKET_put_bytes__(param_2,0x10,2);
    if ((iVar1 == 0) ||
       (((iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 == 0 ||
         (iVar1 = WPACKET_sub_memcpy__
                            (param_2,*(undefined8 *)(param_1 + 0xb08),
                             *(undefined8 *)(param_1 + 0xb10),2), iVar1 == 0)) ||
        (iVar1 = WPACKET_close(param_2), iVar1 == 0)))) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x1a5,"tls_construct_ctos_alpn");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      uVar2 = 0;
    }
    else {
      uVar2 = 1;
      *(undefined4 *)(param_1 + 0x4a8) = 1;
    }
  }
  return uVar2;
}

