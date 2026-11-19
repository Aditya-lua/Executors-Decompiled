/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d27c0
 */

undefined8 tls_construct_ctos_supported_groups(long param_1,undefined8 param_2)

{
  undefined2 uVar1;
  int iVar2;
  undefined8 uVar3;
  char *pcVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  int local_5c;
  int local_58;
  undefined4 uStack_54;
  ulong local_50;
  long local_48;
  
  local_50 = 0;
  local_48 = 0;
  iVar2 = ssl_get_min_max_version(param_1,&uStack_54,&local_58,0);
  if (iVar2 == 0) {
    iVar2 = FUN_009d2668(param_1,uStack_54,local_58);
    if (iVar2 == 0) {
      if ((*(uint *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) != 0) {
        return 2;
      }
      if (local_58 < 0x304) {
        return 2;
      }
    }
    tls1_get_supported_groups(param_1,&local_48,&local_50);
    iVar2 = WPACKET_put_bytes__(param_2,10,2);
    if ((((iVar2 != 0) && (iVar2 = WPACKET_start_sub_packet_len__(param_2,2), iVar2 != 0)) &&
        (iVar2 = WPACKET_start_sub_packet_len__(param_2,2), iVar2 != 0)) &&
       (iVar2 = WPACKET_set_flags(param_2,1), iVar2 != 0)) {
      if (local_50 == 0) {
        lVar6 = 0;
        lVar5 = 0;
      }
      else {
        uVar7 = 0;
        lVar5 = 0;
        lVar6 = 0;
        do {
          uVar1 = *(undefined2 *)(local_48 + uVar7 * 2);
          iVar2 = tls_valid_group(param_1,uVar1,uStack_54,local_58,0,&local_5c);
          if ((iVar2 != 0) && (iVar2 = tls_group_allowed(param_1,uVar1,0x20004), iVar2 != 0)) {
            iVar2 = WPACKET_put_bytes__(param_2,uVar1,2);
            if (iVar2 == 0) {
              ERR_new();
              uVar3 = 0xe4;
              goto LAB_009d2960;
            }
            lVar5 = lVar5 + 1;
            lVar6 = lVar6 + (ulong)(local_5c != 0 && local_58 == 0x304);
          }
          uVar7 = uVar7 + 1;
        } while (uVar7 < local_50);
      }
      iVar2 = WPACKET_close(param_2);
      if ((iVar2 == 0) || (iVar2 = WPACKET_close(param_2), iVar2 == 0)) {
        ERR_new();
        if (lVar5 != 0) {
          uVar3 = 0xf1;
          goto LAB_009d2960;
        }
        uVar3 = 0xee;
      }
      else {
        if (lVar6 != 0) {
          return 1;
        }
        if (local_58 != 0x304) {
          return 1;
        }
        ERR_new(1);
        uVar3 = 0xf6;
      }
      ERR_set_debug("ssl/statem/extensions_clnt.c",uVar3,"tls_construct_ctos_supported_groups");
      pcVar4 = "No groups enabled for max supported SSL/TLS version";
      iVar2 = 0x127;
      goto LAB_009d2978;
    }
    ERR_new();
    uVar3 = 0xd9;
LAB_009d2960:
    ERR_set_debug("ssl/statem/extensions_clnt.c",uVar3,"tls_construct_ctos_supported_groups");
    iVar2 = 0xc0103;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_clnt.c",0xc3,"tls_construct_ctos_supported_groups");
  }
  pcVar4 = (char *)0x0;
LAB_009d2978:
  ossl_statem_fatal(param_1,0x50,iVar2,pcVar4);
  return 0;
}

