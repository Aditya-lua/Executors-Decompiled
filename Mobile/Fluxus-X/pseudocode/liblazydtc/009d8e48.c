/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d8e48
 */

undefined8 tls_construct_stoc_supported_groups(SSL *param_1,undefined8 param_2)

{
  short sVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  undefined8 uVar5;
  ulong uVar6;
  ulong local_50;
  long local_48;
  
  if (*(short *)&param_1[1].field_0x1fe == 0) {
LAB_009d8f70:
    uVar5 = 2;
  }
  else {
    tls1_get_supported_groups(param_1,&local_48,&local_50);
    if (local_50 == 0) {
      ERR_new();
      uVar5 = 0x545;
    }
    else {
      iVar3 = SSL_version(param_1);
      if (local_50 != 0) {
        uVar6 = 0;
        bVar2 = true;
        do {
          sVar1 = *(short *)(local_48 + uVar6 * 2);
          iVar4 = tls_valid_group(param_1,sVar1,iVar3,iVar3,0,0);
          if ((iVar4 != 0) && (iVar4 = tls_group_allowed(param_1,sVar1,0x20004), iVar4 != 0)) {
            if (bVar2) {
              if (*(short *)&param_1[1].field_0x1fe == sVar1) goto LAB_009d8f70;
              iVar4 = WPACKET_put_bytes__(param_2,10,2);
              if (((iVar4 == 0) || (iVar4 = WPACKET_start_sub_packet_len__(param_2,2), iVar4 == 0))
                 || (iVar4 = WPACKET_start_sub_packet_len__(param_2,2), iVar4 == 0)) {
                ERR_new();
                uVar5 = 0x55d;
                goto LAB_009d8fe4;
              }
            }
            iVar4 = WPACKET_put_bytes__(param_2,sVar1,2);
            bVar2 = false;
            if (iVar4 == 0) {
              ERR_new();
              uVar5 = 0x564;
              goto LAB_009d8fe4;
            }
          }
          uVar6 = uVar6 + 1;
        } while (uVar6 < local_50);
      }
      iVar3 = WPACKET_close(param_2);
      if ((iVar3 != 0) && (iVar3 = WPACKET_close(param_2), iVar3 != 0)) {
        return 1;
      }
      ERR_new();
      uVar5 = 0x56b;
    }
LAB_009d8fe4:
    ERR_set_debug("ssl/statem/extensions_srvr.c",uVar5,"tls_construct_stoc_supported_groups");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    uVar5 = 0;
  }
  return uVar5;
}

