/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e758c
 */

undefined8 tls_construct_server_key_exchange(long param_1,undefined8 param_2)

{
  uint uVar1;
  uint uVar2;
  bool bVar3;
  ushort uVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  undefined4 uVar8;
  long lVar9;
  size_t sVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  long lVar13;
  EVP_PKEY *pkey;
  uint uVar14;
  EVP_PKEY *pEVar15;
  long lVar16;
  long lVar17;
  char *__s;
  ulong uVar18;
  undefined8 local_c8;
  void *local_c0;
  long local_b8;
  long local_b0;
  long local_a8;
  long local_a0;
  uchar *local_98;
  undefined8 local_90;
  BIGNUM *local_88 [4];
  void *local_68;
  
  local_68 = (void *)0x0;
  lVar17 = *(long *)(param_1 + 0x380);
  lVar9 = EVP_MD_CTX_new();
  local_90 = 0;
  iVar5 = WPACKET_get_total_written(param_2,&local_a0);
  if (iVar5 == 0) {
    ERR_new();
    uVar11 = 0x984;
LAB_009e7680:
    ERR_set_debug("ssl/statem/statem_srvr.c",uVar11,"tls_construct_server_key_exchange");
    uVar11 = 0x50;
    uVar8 = 0xc0103;
LAB_009e76c0:
    ossl_statem_fatal(param_1,uVar11,uVar8,0);
    bVar3 = false;
  }
  else {
    if (lVar9 == 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_srvr.c",0x989,"tls_construct_server_key_exchange");
      uVar8 = 0xc0100;
LAB_009e76bc:
      uVar11 = 0x50;
      goto LAB_009e76c0;
    }
    uVar2 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x1c);
    local_88[3] = (BIGNUM *)0x0;
    local_88[2] = (BIGNUM *)0x0;
    local_88[1] = (BIGNUM *)0x0;
    local_88[0] = (BIGNUM *)0x0;
    if ((uVar2 & 0x48) == 0) {
      if ((uVar2 & 0x102) != 0) {
        lVar16 = *(long *)(param_1 + 0x898);
        if (*(int *)(lVar16 + 0x18) == 0) {
          if (*(EVP_PKEY **)(lVar16 + 8) == (EVP_PKEY *)0x0) {
            if (*(code **)(lVar16 + 0x10) == (code *)0x0) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_srvr.c",0x9ae,"tls_construct_server_key_exchange");
              uVar11 = 0x50;
              uVar8 = 0xab;
              goto LAB_009e76c0;
            }
            (**(code **)(lVar16 + 0x10))(param_1,0,0x400);
            pkey = (EVP_PKEY *)ssl_dh_to_pkey();
            pEVar15 = pkey;
            if (pkey == (EVP_PKEY *)0x0) {
              ERR_new();
              uVar11 = 0x9a7;
              goto LAB_009e79dc;
            }
          }
          else {
            pkey = (EVP_PKEY *)0x0;
            pEVar15 = *(EVP_PKEY **)(lVar16 + 8);
          }
LAB_009e7994:
          uVar8 = EVP_PKEY_get_security_bits(pEVar15);
          iVar5 = ssl_security(param_1,0x40007,uVar8,0,pEVar15);
          if (iVar5 != 0) {
            if (*(long *)(param_1 + 0x2e8) == 0) {
              lVar16 = ssl_generate_pkey(param_1,pEVar15);
              *(long *)(param_1 + 0x2e8) = lVar16;
              if (lVar16 != 0) {
                EVP_PKEY_free(pkey);
                iVar5 = EVP_PKEY_get_bn_param
                                  (*(undefined8 *)(param_1 + 0x2e8),&DAT_002a38e7,local_88);
                if (((iVar5 == 0) ||
                    (iVar5 = EVP_PKEY_get_bn_param
                                       (*(undefined8 *)(param_1 + 0x2e8),&DAT_002d92e5,local_88 + 1)
                    , iVar5 == 0)) ||
                   (iVar5 = EVP_PKEY_get_bn_param
                                      (*(undefined8 *)(param_1 + 0x2e8),&DAT_002ad463,local_88 + 2),
                   iVar5 == 0)) {
                  ERR_new();
                  ERR_set_debug("ssl/statem/statem_srvr.c",0x9cc,"tls_construct_server_key_exchange"
                               );
                  ossl_statem_fatal(param_1,0x50,0xc0103,0);
                  uVar11 = 0;
                  pkey = (EVP_PKEY *)0x0;
                  bVar3 = true;
                  goto LAB_009e7efc;
                }
                uVar14 = 0;
                lVar16 = 0;
                bVar3 = true;
                goto LAB_009e7608;
              }
              ERR_new();
              uVar11 = 0x9bd;
            }
            else {
              ERR_new();
              uVar11 = 0x9b7;
            }
            goto LAB_009e79dc;
          }
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0x9b3,"tls_construct_server_key_exchange");
          uVar11 = 0x28;
          uVar12 = 0x18a;
        }
        else {
          pkey = (EVP_PKEY *)ssl_get_auto_dh(param_1);
          pEVar15 = pkey;
          if (pkey != (EVP_PKEY *)0x0) goto LAB_009e7994;
          ERR_new();
          uVar11 = 0x99c;
LAB_009e79dc:
          ERR_set_debug("ssl/statem/statem_srvr.c",uVar11,"tls_construct_server_key_exchange");
          uVar11 = 0x50;
          uVar12 = 0xc0103;
        }
        ossl_statem_fatal(param_1,uVar11,uVar12,0);
        bVar3 = false;
        uVar11 = 0;
        goto LAB_009e7efc;
      }
      if ((uVar2 & 0x84) == 0) {
        if ((uVar2 >> 5 & 1) == 0) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0xa06,"tls_construct_server_key_exchange");
          uVar11 = 0x50;
          uVar8 = 0xfa;
        }
        else {
          if (((*(BIGNUM **)(param_1 + 0xbf8) != (BIGNUM *)0x0) &&
              (*(BIGNUM **)(param_1 + 0xc00) != (BIGNUM *)0x0)) &&
             ((*(BIGNUM **)(param_1 + 0xc08) != (BIGNUM *)0x0 &&
              (*(BIGNUM **)(param_1 + 0xc10) != (BIGNUM *)0x0)))) {
            bVar3 = false;
            uVar14 = 0;
            lVar16 = 0;
            local_88[0] = *(BIGNUM **)(param_1 + 0xbf8);
            local_88[1] = *(BIGNUM **)(param_1 + 0xc00);
            local_88[2] = *(BIGNUM **)(param_1 + 0xc08);
            local_88[3] = *(BIGNUM **)(param_1 + 0xc10);
            goto LAB_009e7608;
          }
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0x9fc,"tls_construct_server_key_exchange");
          uVar11 = 0x50;
          uVar8 = 0x166;
        }
        goto LAB_009e76c0;
      }
      if (*(long *)(param_1 + 0x2e8) != 0) {
        ERR_new();
        uVar11 = 0x9d2;
        goto LAB_009e7680;
      }
      uVar4 = tls1_shared_group(param_1,0xfffffffe);
      uVar14 = (uint)uVar4;
      if (uVar4 == 0) {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_srvr.c",0x9da,"tls_construct_server_key_exchange");
        uVar11 = 0x28;
        uVar8 = 0x13b;
        goto LAB_009e76c0;
      }
      *(uint *)(*(long *)(param_1 + 0x918) + 0x308) = uVar14;
      lVar16 = ssl_generate_pkey_group(param_1,uVar14);
      *(long *)(param_1 + 0x2e8) = lVar16;
      if (lVar16 != 0) {
        lVar16 = EVP_PKEY_get1_encoded_public_key(lVar16,&local_68);
        if (lVar16 == 0) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0x9ea,"tls_construct_server_key_exchange");
          uVar8 = 0x80010;
          goto LAB_009e76bc;
        }
        bVar3 = false;
        local_88[3] = (BIGNUM *)0x0;
        local_88[2] = (BIGNUM *)0x0;
        local_88[1] = (BIGNUM *)0x0;
        local_88[0] = (BIGNUM *)0x0;
        goto LAB_009e7608;
      }
      bVar3 = false;
    }
    else {
      bVar3 = false;
      uVar14 = 0;
      lVar16 = 0;
LAB_009e7608:
      lVar13 = 0;
      if ((((*(byte *)(*(long *)(param_1 + 0x2e0) + 0x20) & 0x44) == 0) &&
          (lVar13 = 0, (*(ushort *)(*(long *)(param_1 + 0x2e0) + 0x1c) & 0x1c8) == 0)) &&
         (lVar13 = lVar17, lVar17 == 0)) {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_srvr.c",0xa0e,"tls_construct_server_key_exchange");
        ossl_statem_fatal(param_1,0x32,0xc0103,0);
        uVar11 = 0;
        pkey = (EVP_PKEY *)0x0;
        goto LAB_009e7efc;
      }
      if ((uVar2 & 0x1c8) != 0) {
        __s = *(char **)(*(long *)(param_1 + 0x898) + 0x200);
        if (__s == (char *)0x0) {
          sVar10 = 0;
LAB_009e7720:
          iVar5 = WPACKET_sub_memcpy__(param_2,__s,sVar10,2);
          if (iVar5 != 0) goto LAB_009e7734;
        }
        else {
          sVar10 = strlen(__s);
          if (sVar10 < 0x101) goto LAB_009e7720;
        }
        ERR_new();
        uVar11 = 0xa1e;
        goto LAB_009e7ed8;
      }
LAB_009e7734:
      uVar18 = 0;
      do {
        if (local_88[uVar18] == (BIGNUM *)0x0) break;
        uVar11 = 1;
        if (uVar18 != 2 || (uVar2 & 0x20) == 0) {
          uVar11 = 2;
        }
        iVar5 = WPACKET_start_sub_packet_len__(param_2,uVar11);
        if (iVar5 == 0) {
          ERR_new();
          uVar11 = 0xa30;
          goto LAB_009e7ed8;
        }
        if (((uVar2 & 0x102) != 0) && (uVar18 == 2)) {
          iVar6 = BN_num_bits(local_88[0]);
          iVar5 = iVar6 + 0xe;
          if (-1 < iVar6 + 7) {
            iVar5 = iVar6 + 7;
          }
          iVar7 = BN_num_bits(local_88[2]);
          iVar6 = iVar7 + 0xe;
          if (-1 < iVar7 + 7) {
            iVar6 = iVar7 + 7;
          }
          iVar5 = (iVar5 >> 3) - (iVar6 >> 3);
          if (iVar5 != 0) {
            iVar6 = WPACKET_allocate_bytes(param_2,(long)iVar5,&local_98);
            if (iVar6 == 0) {
              ERR_new();
              uVar11 = 0xa3e;
              goto LAB_009e7ed8;
            }
            memset(local_98,0,(long)iVar5);
          }
        }
        iVar5 = BN_num_bits(local_88[uVar18]);
        uVar1 = iVar5 + 0xe;
        if (-1 < (int)(iVar5 + 7U)) {
          uVar1 = iVar5 + 7U;
        }
        iVar5 = WPACKET_allocate_bytes(param_2,(long)((ulong)uVar1 << 0x20) >> 0x23,&local_98);
        if ((iVar5 == 0) || (iVar5 = WPACKET_close(param_2), iVar5 == 0)) {
          ERR_new();
          uVar11 = 0xa47;
          goto LAB_009e7ed8;
        }
        BN_bn2bin(local_88[uVar18],local_98);
        uVar18 = uVar18 + 1;
      } while (uVar18 < 4);
      if ((uVar2 & 0x84) != 0) {
        iVar5 = WPACKET_put_bytes__(param_2,3,1);
        if ((((iVar5 == 0) || (iVar5 = WPACKET_put_bytes__(param_2,0,1), iVar5 == 0)) ||
            (iVar5 = WPACKET_put_bytes__(param_2,uVar14,1), iVar5 == 0)) ||
           (iVar5 = WPACKET_sub_memcpy__(param_2,local_68,lVar16,1), iVar5 == 0)) {
          ERR_new();
          uVar11 = 0xa59;
          goto LAB_009e7ed8;
        }
        CRYPTO_free(local_68);
        local_68 = (void *)0x0;
      }
      if (lVar13 == 0) {
LAB_009e7fac:
        pkey = (EVP_PKEY *)0x0;
        uVar11 = 1;
        goto LAB_009e7efc;
      }
      lVar17 = *(long *)(*(long *)(param_1 + 0x388) + 8);
      local_c8 = 0;
      if ((lVar17 == 0) ||
         (iVar5 = tls1_lookup_md(*(undefined8 *)(param_1 + 0x9a8),lVar13,&local_a8), iVar5 == 0)) {
        ERR_new();
        uVar11 = 0xa69;
LAB_009e7ed8:
        ERR_set_debug("ssl/statem/statem_srvr.c",uVar11,"tls_construct_server_key_exchange");
        uVar8 = 0xc0103;
      }
      else {
        iVar5 = WPACKET_get_length(param_2,&local_98);
        if (iVar5 == 0) {
          ERR_new();
          uVar11 = 0xa6e;
          goto LAB_009e7ed8;
        }
        if (((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 1 & 1) != 0) &&
           (iVar5 = WPACKET_put_bytes__(param_2,*(undefined2 *)(lVar13 + 8),2), iVar5 == 0)) {
          ERR_new();
          uVar11 = 0xa73;
          goto LAB_009e7ed8;
        }
        if (local_a8 == 0) {
          uVar11 = 0;
        }
        else {
          uVar11 = EVP_MD_get0_name();
        }
        iVar5 = EVP_DigestSignInit_ex
                          (lVar9,&local_90,uVar11,**(undefined8 **)(param_1 + 0x9a8),
                           (*(undefined8 **)(param_1 + 0x9a8))[0x88],lVar17,0);
        if (iVar5 < 1) {
          ERR_new();
          uVar11 = 0xa7b;
          goto LAB_009e7ed8;
        }
        if ((*(int *)(lVar13 + 0x14) != 0x390) ||
           ((iVar5 = EVP_PKEY_CTX_set_rsa_padding(local_90,6), 0 < iVar5 &&
            (iVar5 = EVP_PKEY_CTX_set_rsa_pss_saltlen(local_90,0xffffffff), 0 < iVar5)))) {
          lVar17 = construct_key_exchange_tbs
                             (param_1,&local_c0,*(long *)(*(long *)(param_1 + 0x88) + 8) + local_a0,
                              local_98);
          if (lVar17 == 0) goto LAB_009e7ef4;
          iVar5 = EVP_DigestSign(lVar9,0,&local_c8,local_c0,lVar17);
          if ((((0 < iVar5) &&
               (iVar5 = WPACKET_sub_reserve_bytes__(param_2,local_c8,&local_b0,2), iVar5 != 0)) &&
              (iVar5 = EVP_DigestSign(lVar9,local_b0,&local_c8,local_c0,lVar17), 0 < iVar5)) &&
             ((iVar5 = WPACKET_sub_allocate_bytes__(param_2,local_c8,&local_b8,2), iVar5 != 0 &&
              (local_b0 == local_b8)))) {
            CRYPTO_free(local_c0);
            goto LAB_009e7fac;
          }
          CRYPTO_free(local_c0);
          ERR_new();
          uVar11 = 0xa93;
          goto LAB_009e7ed8;
        }
        ERR_new();
        ERR_set_debug("ssl/statem/statem_srvr.c",0xa81,"tls_construct_server_key_exchange");
        uVar8 = 0x80006;
      }
      ossl_statem_fatal(param_1,0x50,uVar8,0);
    }
  }
LAB_009e7ef4:
  uVar11 = 0;
  pkey = (EVP_PKEY *)0x0;
LAB_009e7efc:
  EVP_PKEY_free(pkey);
  CRYPTO_free(local_68);
  EVP_MD_CTX_free(lVar9);
  if (bVar3) {
    BN_free(local_88[0]);
    BN_free(local_88[1]);
    BN_free(local_88[2]);
    BN_free(local_88[3]);
  }
  return uVar11;
}

