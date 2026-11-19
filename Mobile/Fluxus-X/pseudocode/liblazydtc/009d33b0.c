/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d33b0
 */

undefined8 tls_construct_ctos_supported_versions(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  int local_28;
  int local_24;
  
  iVar1 = ssl_get_min_max_version(param_1,&local_24,&local_28,0);
  if (iVar1 == 0) {
    if (local_28 < 0x304) {
      return 2;
    }
    iVar1 = WPACKET_put_bytes__(param_2,0x2b,2);
    if (((iVar1 == 0) || (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 == 0)) ||
       (iVar1 = WPACKET_start_sub_packet_len__(param_2,1), iVar1 == 0)) {
      ERR_new();
      uVar2 = 0x221;
    }
    else {
      if (local_24 <= local_28) {
        lVar3 = (long)local_28 + 1;
        do {
          lVar3 = lVar3 + -1;
          iVar1 = WPACKET_put_bytes__(param_2,lVar3,2);
          if (iVar1 == 0) {
            ERR_new();
            uVar2 = 0x227;
            goto LAB_009d34c4;
          }
        } while (local_24 < lVar3);
      }
      iVar1 = WPACKET_close(param_2);
      if ((iVar1 != 0) && (iVar1 = WPACKET_close(param_2), iVar1 != 0)) {
        return 1;
      }
      ERR_new();
      uVar2 = 0x22c;
    }
LAB_009d34c4:
    ERR_set_debug("ssl/statem/extensions_clnt.c",uVar2,"tls_construct_ctos_supported_versions");
    iVar1 = 0xc0103;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0x213,"tls_construct_ctos_supported_versions");
  }
  ossl_statem_fatal(param_1,0x50,iVar1,0);
  return 0;
}

