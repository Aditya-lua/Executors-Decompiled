/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d9aac
 */

undefined8 tls_construct_stoc_cookie(long param_1,undefined8 param_2)

{
  undefined4 uVar1;
  int iVar2;
  time_t tVar3;
  long lVar4;
  EVP_PKEY *pkey;
  undefined8 uVar5;
  undefined8 local_98;
  long local_90;
  undefined8 local_88;
  ulong local_80;
  undefined1 auStack_78 [8];
  long local_70;
  long local_68;
  long local_60;
  long local_58;
  long local_50;
  long local_48;
  long local_40;
  long local_38;
  
  if ((*(byte *)(param_1 + 0xa9) >> 3 & 1) == 0) {
    return 2;
  }
  if (*(long *)(*(long *)(param_1 + 0x9a8) + 0xe0) == 0) {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_srvr.c",0x6c6,"tls_construct_stoc_cookie");
    uVar5 = 0x11f;
    goto LAB_009d9ca4;
  }
  iVar2 = WPACKET_put_bytes__(param_2,0x2c,2);
  if ((((((iVar2 == 0) || (iVar2 = WPACKET_start_sub_packet_len__(param_2,2), iVar2 == 0)) ||
        (iVar2 = WPACKET_start_sub_packet_len__(param_2,2), iVar2 == 0)) ||
       (((iVar2 = WPACKET_get_total_written(param_2,&local_70), iVar2 == 0 ||
         (iVar2 = WPACKET_reserve_bytes(param_2,0x1076,&local_58), iVar2 == 0)) ||
        ((iVar2 = WPACKET_put_bytes__(param_2,1,2), iVar2 == 0 ||
         ((iVar2 = WPACKET_put_bytes__(param_2,0x304,2), iVar2 == 0 ||
          (iVar2 = WPACKET_put_bytes__(param_2,*(undefined2 *)(param_1 + 0x4ae),2), iVar2 == 0))))))
       )) || (iVar2 = (**(code **)(*(long *)(param_1 + 8) + 0x98))
                                (*(undefined8 *)(param_1 + 0x2e0),param_2,auStack_78), iVar2 == 0))
     || (iVar2 = WPACKET_put_bytes__(param_2,*(long *)(param_1 + 0x4b0) == 0,1), iVar2 == 0)) {
LAB_009d9c54:
    ERR_new();
    uVar5 = 0x6d9;
  }
  else {
    tVar3 = time((time_t *)0x0);
    iVar2 = WPACKET_put_bytes__(param_2,tVar3,8);
    if (((iVar2 == 0) || (iVar2 = WPACKET_start_sub_packet_len__(param_2,2), iVar2 == 0)) ||
       (iVar2 = WPACKET_reserve_bytes(param_2,0x40,&local_38), iVar2 == 0)) goto LAB_009d9c54;
    iVar2 = ssl3_digest_cached_records(param_1,0);
    if (iVar2 == 0) {
      return 0;
    }
    iVar2 = ssl_handshake_hash(param_1,local_38,0x40,&local_88);
    if (iVar2 == 0) {
      return 0;
    }
    iVar2 = WPACKET_allocate_bytes(param_2,local_88,&local_40);
    if (((iVar2 == 0) || (local_38 != local_40)) ||
       ((iVar2 = WPACKET_close(param_2), iVar2 == 0 ||
        ((iVar2 = WPACKET_start_sub_packet_len__(param_2,1), iVar2 == 0 ||
         (iVar2 = WPACKET_reserve_bytes(param_2,0x1000,&local_48), iVar2 == 0)))))) {
      ERR_new();
      uVar5 = 0x6ed;
    }
    else {
      iVar2 = (**(code **)(*(long *)(param_1 + 0x9a8) + 0xe0))(param_1,local_48,&local_98);
      if (iVar2 == 0) {
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_srvr.c",0x6f3,"tls_construct_stoc_cookie");
        uVar5 = 400;
        goto LAB_009d9ca4;
      }
      iVar2 = WPACKET_allocate_bytes(param_2,local_98,&local_50);
      if ((((iVar2 == 0) || (local_48 != local_50)) || (iVar2 = WPACKET_close(param_2), iVar2 == 0))
         || ((iVar2 = WPACKET_get_total_written(param_2,&local_80), iVar2 == 0 ||
             (iVar2 = WPACKET_reserve_bytes(param_2,0x20,&local_60), iVar2 == 0)))) {
        ERR_new();
        uVar5 = 0x6fc;
      }
      else {
        local_90 = 0x20;
        local_80 = local_80 - local_70;
        if (local_80 < 0x1057) {
          lVar4 = EVP_MD_CTX_new();
          pkey = (EVP_PKEY *)
                 EVP_PKEY_new_raw_private_key_ex
                           (**(undefined8 **)(param_1 + 0x9a8),&DAT_002c35d3,
                            (*(undefined8 **)(param_1 + 0x9a8))[0x88],
                            *(long *)(param_1 + 0xb88) + 0x2d8,0x20);
          if ((lVar4 == 0) || (pkey == (EVP_PKEY *)0x0)) {
            ERR_new();
            ERR_set_debug("ssl/statem/extensions_srvr.c",0x70e,"tls_construct_stoc_cookie");
            uVar1 = 0xc0100;
          }
          else {
            iVar2 = EVP_DigestSignInit_ex
                              (lVar4,0,"SHA2-256",**(undefined8 **)(param_1 + 0x9a8),
                               (*(undefined8 **)(param_1 + 0x9a8))[0x88],pkey,0);
            if ((iVar2 < 1) ||
               (iVar2 = EVP_DigestSign(lVar4,local_60,&local_90,local_58,local_80), iVar2 < 1)) {
              ERR_new();
              uVar5 = 0x716;
            }
            else if (local_90 + local_80 < 0x1077) {
              iVar2 = WPACKET_allocate_bytes(param_2,local_90,&local_68);
              if ((((iVar2 != 0) && (local_60 == local_68)) && (local_58 == local_60 - local_80)) &&
                 ((iVar2 = WPACKET_close(param_2), iVar2 != 0 &&
                  (iVar2 = WPACKET_close(param_2), iVar2 != 0)))) {
                uVar5 = 1;
                goto LAB_009d9f58;
              }
              ERR_new();
              uVar5 = 0x724;
            }
            else {
              ERR_new();
              uVar5 = 0x71b;
            }
            ERR_set_debug("ssl/statem/extensions_srvr.c",uVar5,"tls_construct_stoc_cookie");
            uVar1 = 0xc0103;
          }
          ossl_statem_fatal(param_1,0x50,uVar1,0);
          uVar5 = 0;
LAB_009d9f58:
          EVP_MD_CTX_free(lVar4);
          EVP_PKEY_free(pkey);
          return uVar5;
        }
        ERR_new();
        uVar5 = 0x703;
      }
    }
  }
  ERR_set_debug("ssl/statem/extensions_srvr.c",uVar5,"tls_construct_stoc_cookie");
  uVar5 = 0xc0103;
LAB_009d9ca4:
  ossl_statem_fatal(param_1,0x50,uVar5,0);
  return 0;
}

