/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d3084
 */

undefined8 tls_construct_ctos_use_srtp(SSL *param_1,undefined8 param_2)

{
  int iVar1;
  int iVar2;
  stack_st_SRTP_PROTECTION_PROFILE *psVar3;
  long lVar4;
  undefined8 uVar5;
  int iVar6;
  
  psVar3 = SSL_get_srtp_profiles(param_1);
  if (psVar3 == (stack_st_SRTP_PROTECTION_PROFILE *)0x0) {
    uVar5 = 2;
  }
  else {
    iVar1 = WPACKET_put_bytes__(param_2,0xe,2);
    if (((iVar1 == 0) || (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 == 0)) ||
       (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 == 0)) {
      ERR_new();
      uVar5 = 0x1be;
    }
    else {
      iVar1 = OPENSSL_sk_num(psVar3);
      if (0 < iVar1) {
        iVar6 = 0;
        do {
          lVar4 = OPENSSL_sk_value(psVar3,iVar6);
          if ((lVar4 == 0) ||
             (iVar2 = WPACKET_put_bytes__(param_2,*(undefined8 *)(lVar4 + 8),2), iVar2 == 0)) {
            ERR_new();
            uVar5 = 0x1c8;
            goto LAB_009d3174;
          }
          iVar6 = iVar6 + 1;
        } while (iVar6 < iVar1);
      }
      iVar1 = WPACKET_close(param_2);
      if (((iVar1 != 0) && (iVar1 = WPACKET_put_bytes__(param_2,0,1), iVar1 != 0)) &&
         (iVar1 = WPACKET_close(param_2), iVar1 != 0)) {
        return 1;
      }
      ERR_new();
      uVar5 = 0x1d0;
    }
LAB_009d3174:
    ERR_set_debug("ssl/statem/extensions_clnt.c",uVar5,"tls_construct_ctos_use_srtp");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    uVar5 = 0;
  }
  return uVar5;
}

