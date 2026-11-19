/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d3620
 */

undefined8 tls_construct_ctos_key_share(long param_1,undefined8 param_2)

{
  short sVar1;
  undefined4 uVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  char *pcVar6;
  EVP_PKEY *pkey;
  ulong uVar7;
  long local_50;
  ulong local_48;
  void *local_38;
  
  local_48 = 0;
  local_50 = 0;
  iVar3 = WPACKET_put_bytes__(param_2,0x33,2);
  if (((iVar3 == 0) || (iVar3 = WPACKET_start_sub_packet_len__(param_2,2), iVar3 == 0)) ||
     (iVar3 = WPACKET_start_sub_packet_len__(param_2,2), iVar3 == 0)) {
    ERR_new();
    pcVar6 = "tls_construct_ctos_key_share";
    uVar5 = 0x298;
  }
  else {
    tls1_get_supported_groups(param_1,&local_50,&local_48);
    sVar1 = *(short *)(param_1 + 0x4ae);
    if (sVar1 == 0) {
      if (local_48 != 0) {
        uVar7 = 0;
        do {
          iVar3 = tls_group_allowed(param_1,*(undefined2 *)(local_50 + uVar7 * 2),0x20004);
          if ((iVar3 != 0) &&
             (iVar3 = tls_valid_group(param_1,*(undefined2 *)(local_50 + uVar7 * 2),0x304,0x304,0,0)
             , iVar3 != 0)) {
            sVar1 = *(short *)(local_50 + uVar7 * 2);
            if (sVar1 != 0) goto LAB_009d3690;
            break;
          }
          uVar7 = uVar7 + 1;
        } while (uVar7 < local_48);
      }
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x2b4,"tls_construct_ctos_key_share");
      uVar5 = 0x65;
      goto LAB_009d36ec;
    }
LAB_009d3690:
    local_38 = (void *)0x0;
    pkey = *(EVP_PKEY **)(param_1 + 0x2e8);
    if (pkey == (EVP_PKEY *)0x0) {
      pkey = (EVP_PKEY *)ssl_generate_pkey_group(param_1,sVar1);
      if (pkey == (EVP_PKEY *)0x0) {
        return 0;
      }
    }
    else if (*(int *)(param_1 + 0x8e8) != 1) {
      ERR_new();
      pcVar6 = "add_key_share";
      uVar5 = 0x259;
      goto LAB_009d36dc;
    }
    lVar4 = EVP_PKEY_get1_encoded_public_key(pkey,&local_38);
    if (lVar4 == 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x26c,"add_key_share");
      uVar2 = 0x80010;
LAB_009d387c:
      ossl_statem_fatal(param_1,0x50,uVar2,0);
      if (*(long *)(param_1 + 0x2e8) == 0) {
        EVP_PKEY_free(pkey);
      }
      CRYPTO_free(local_38);
      return 0;
    }
    iVar3 = WPACKET_put_bytes__(param_2,sVar1,2);
    if ((iVar3 == 0) || (iVar3 = WPACKET_sub_memcpy__(param_2,local_38,lVar4,2), iVar3 == 0)) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x273,"add_key_share");
      uVar2 = 0xc0103;
      goto LAB_009d387c;
    }
    *(EVP_PKEY **)(param_1 + 0x2e8) = pkey;
    *(short *)(param_1 + 0x4ae) = sVar1;
    CRYPTO_free(local_38);
    iVar3 = WPACKET_close(param_2);
    if ((iVar3 != 0) && (iVar3 = WPACKET_close(param_2), iVar3 != 0)) {
      return 1;
    }
    ERR_new();
    pcVar6 = "tls_construct_ctos_key_share";
    uVar5 = 0x2be;
  }
LAB_009d36dc:
  ERR_set_debug("ssl/statem/extensions_clnt.c",uVar5,pcVar6);
  uVar5 = 0xc0103;
LAB_009d36ec:
  ossl_statem_fatal(param_1,0x50,uVar5,0);
  return 0;
}

