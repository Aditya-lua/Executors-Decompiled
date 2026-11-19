/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d96cc
 */

undefined8 tls_construct_stoc_key_share(long param_1,undefined8 param_2)

{
  undefined4 uVar1;
  int iVar2;
  long lVar3;
  EVP_PKEY *pkey;
  undefined8 uVar4;
  long lVar5;
  long local_40;
  void *local_38;
  
  lVar5 = *(long *)(param_1 + 0x4b0);
  if (*(int *)(param_1 + 0x8e8) == 1) {
    if (lVar5 != 0) {
      return 2;
    }
    iVar2 = WPACKET_put_bytes__(param_2,0x33,2);
    if ((((iVar2 != 0) && (iVar2 = WPACKET_start_sub_packet_len__(param_2,2), iVar2 != 0)) &&
        (iVar2 = WPACKET_put_bytes__(param_2,*(undefined2 *)(param_1 + 0x4ae),2), iVar2 != 0)) &&
       (iVar2 = WPACKET_close(param_2), iVar2 != 0)) {
      return 1;
    }
    ERR_new();
    uVar4 = 0x646;
  }
  else if (lVar5 == 0) {
    if ((*(int *)(param_1 + 0x4d0) != 0) &&
       (iVar2 = tls13_generate_handshake_secret(param_1,0,0), iVar2 != 0)) {
      return 2;
    }
    ERR_new();
    uVar4 = 0x650;
  }
  else {
    if ((*(int *)(param_1 + 0x4d0) != 0) && ((*(byte *)(param_1 + 0xb28) >> 1 & 1) == 0)) {
      return 2;
    }
    iVar2 = WPACKET_put_bytes__(param_2,0x33,2);
    if (((iVar2 == 0) || (iVar2 = WPACKET_start_sub_packet_len__(param_2,2), iVar2 == 0)) ||
       (iVar2 = WPACKET_put_bytes__(param_2,*(undefined2 *)(param_1 + 0x4ae),2), iVar2 == 0)) {
      ERR_new();
      uVar4 = 0x660;
    }
    else {
      lVar3 = tls1_group_id_lookup
                        (*(undefined8 *)(param_1 + 0x9a8),*(undefined2 *)(param_1 + 0x4ae));
      if (lVar3 != 0) {
        if (*(char *)(lVar3 + 0x30) != '\0') {
          local_40 = 0;
          local_38 = (void *)0x0;
          uVar4 = ssl_encapsulate(param_1,lVar5,&local_38,&local_40,0);
          if ((int)uVar4 == 0) {
            return uVar4;
          }
          if (local_40 == 0) {
            ERR_new();
            ERR_set_debug("ssl/statem/extensions_srvr.c",0x69b,"tls_construct_stoc_key_share");
            ossl_statem_fatal(param_1,0x50,0xc0103,0);
          }
          else {
            iVar2 = WPACKET_sub_memcpy__(param_2,local_38,local_40,2);
            if ((iVar2 != 0) && (iVar2 = WPACKET_close(param_2), iVar2 != 0)) {
              CRYPTO_free(local_38);
              uVar4 = ssl_gensecret(param_1,*(undefined8 *)(param_1 + 0x360),
                                    *(undefined8 *)(param_1 + 0x368));
              iVar2 = (int)uVar4;
              goto joined_r0x009d9950;
            }
            ERR_new();
            ERR_set_debug("ssl/statem/extensions_srvr.c",0x6a2,"tls_construct_stoc_key_share");
            ossl_statem_fatal(param_1,0x50,0xc0103,0);
          }
LAB_009d9aa0:
          CRYPTO_free(local_38);
          return 0;
        }
        pkey = (EVP_PKEY *)ssl_generate_pkey(param_1,lVar5);
        if (pkey != (EVP_PKEY *)0x0) {
          lVar3 = EVP_PKEY_get1_encoded_public_key(pkey,&local_38);
          if (lVar3 == 0) {
            ERR_new();
            ERR_set_debug("ssl/statem/extensions_srvr.c",0x674,"tls_construct_stoc_key_share");
            ossl_statem_fatal(param_1,0x50,0x80010,0);
            EVP_PKEY_free(pkey);
            return 0;
          }
          iVar2 = WPACKET_sub_memcpy__(param_2,local_38,lVar3,2);
          if ((iVar2 != 0) && (iVar2 = WPACKET_close(param_2), iVar2 != 0)) {
            CRYPTO_free(local_38);
            *(EVP_PKEY **)(param_1 + 0x2e8) = pkey;
            uVar4 = ssl_derive(param_1,pkey,lVar5,1);
            iVar2 = (int)uVar4;
joined_r0x009d9950:
            if (iVar2 == 0) {
              return uVar4;
            }
            *(undefined1 *)(param_1 + 0x4ad) = 1;
            return 1;
          }
          ERR_new();
          ERR_set_debug("ssl/statem/extensions_srvr.c",0x67b,"tls_construct_stoc_key_share");
          ossl_statem_fatal(param_1,0x50,0xc0103,0);
          EVP_PKEY_free(pkey);
          goto LAB_009d9aa0;
        }
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_srvr.c",0x66d,"tls_construct_stoc_key_share");
        uVar1 = 0xc0100;
        goto LAB_009d98a0;
      }
      ERR_new();
      uVar4 = 0x665;
    }
  }
  ERR_set_debug("ssl/statem/extensions_srvr.c",uVar4,"tls_construct_stoc_key_share");
  uVar1 = 0xc0103;
LAB_009d98a0:
  ossl_statem_fatal(param_1,0x50,uVar1,0);
  return 0;
}

