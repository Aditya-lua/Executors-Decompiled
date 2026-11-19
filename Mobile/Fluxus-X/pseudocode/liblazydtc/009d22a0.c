/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d22a0
 */

undefined8 tls_construct_ctos_server_name(long param_1,undefined8 param_2)

{
  int iVar1;
  size_t sVar2;
  undefined8 uVar3;
  char *__s;
  
  if (*(long *)(param_1 + 0xa58) == 0) {
    uVar3 = 2;
  }
  else {
    iVar1 = WPACKET_put_bytes__(param_2,0,2);
    if ((((iVar1 != 0) && (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 != 0)) &&
        (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 != 0)) &&
       (iVar1 = WPACKET_put_bytes__(param_2,0,1), iVar1 != 0)) {
      __s = *(char **)(param_1 + 0xa58);
      sVar2 = strlen(__s);
      iVar1 = WPACKET_sub_memcpy__(param_2,__s,sVar2,2);
      if (((iVar1 != 0) && (iVar1 = WPACKET_close(param_2), iVar1 != 0)) &&
         (iVar1 = WPACKET_close(param_2), iVar1 != 0)) {
        return 1;
      }
    }
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0x35,"tls_construct_ctos_server_name");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    uVar3 = 0;
  }
  return uVar3;
}

