/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d7b08
 */

undefined8 tls_parse_ctos_cookie(int *param_1,long *param_2)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  ulong uVar3;
  ulong uVar4;
  char cVar5;
  int iVar6;
  long lVar7;
  EVP_PKEY *pkey;
  undefined8 uVar8;
  undefined8 uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  undefined1 *puVar13;
  ulong uVar14;
  undefined1 auStack_1198 [8];
  undefined8 local_1190;
  undefined1 auStack_1184 [4300];
  undefined1 auStack_b8 [32];
  undefined1 auStack_98 [56];
  long local_58;
  
  if ((*(long *)(*(long *)(param_1 + 0x26a) + 0xe8) == 0) ||
     ((*(byte *)((long)param_1 + 0xa9) >> 3 & 1) == 0)) {
    return 1;
  }
  if ((ulong)param_2[1] < 2) {
LAB_009d7ba0:
    ERR_new();
    uVar8 = 0x2c4;
  }
  else {
    puVar13 = (undefined1 *)*param_2;
    uVar3 = (ulong)CONCAT11(*puVar13,puVar13[1]);
    if (param_2[1] - 2U != uVar3) goto LAB_009d7ba0;
    puVar1 = puVar13 + 2;
    *param_2 = (long)(puVar1 + uVar3);
    param_2[1] = 0;
    if (uVar3 < 0x20) {
      ERR_new();
      uVar8 = 0x2cd;
    }
    else {
      lVar7 = EVP_MD_CTX_new();
      pkey = (EVP_PKEY *)
             EVP_PKEY_new_raw_private_key_ex
                       (**(undefined8 **)(param_1 + 0x26a),&DAT_002c35d3,
                        (*(undefined8 **)(param_1 + 0x26a))[0x88],*(long *)(param_1 + 0x2e2) + 0x2d8
                        ,0x20);
      if ((lVar7 == 0) || (pkey == (EVP_PKEY *)0x0)) {
        EVP_MD_CTX_free(lVar7);
        EVP_PKEY_free(pkey);
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_srvr.c",0x2db,"tls_parse_ctos_cookie");
        uVar9 = 0xc0100;
        uVar8 = 0x50;
        goto LAB_009d7bc4;
      }
      local_58 = 0x20;
      iVar6 = EVP_DigestSignInit_ex
                        (lVar7,0,"SHA2-256",**(undefined8 **)(param_1 + 0x26a),
                         (*(undefined8 **)(param_1 + 0x26a))[0x88],pkey,0);
      if (((iVar6 < 1) ||
          (iVar6 = EVP_DigestSign(lVar7,auStack_b8,&local_58,puVar1,uVar3 - 0x20), iVar6 < 1)) ||
         (local_58 != 0x20)) {
        EVP_MD_CTX_free(lVar7);
        EVP_PKEY_free(pkey);
        ERR_new();
        uVar8 = 0x2e7;
LAB_009d7d4c:
        ERR_set_debug("ssl/statem/extensions_srvr.c",uVar8,"tls_parse_ctos_cookie");
        uVar8 = 0x50;
        uVar9 = 0xc0103;
        goto LAB_009d7bc4;
      }
      EVP_MD_CTX_free(lVar7);
      EVP_PKEY_free(pkey);
      iVar6 = CRYPTO_memcmp(auStack_b8,puVar1 + (uVar3 - 0x20),0x20);
      if (iVar6 != 0) {
        ERR_new();
        uVar8 = 0x2ef;
LAB_009d7cd4:
        ERR_set_debug("ssl/statem/extensions_srvr.c",uVar8,"tls_parse_ctos_cookie");
        uVar8 = 0x2f;
        uVar9 = 0x134;
        goto LAB_009d7bc4;
      }
      if (CONCAT11(puVar13[2],puVar13[3]) != 1) {
        return 1;
      }
      if (CONCAT11(puVar13[4],puVar13[5]) != 0x304) {
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_srvr.c",0x307,"tls_parse_ctos_cookie");
        uVar8 = 0x2f;
        uVar9 = 0x74;
        goto LAB_009d7bc4;
      }
      if ((CONCAT11(puVar13[6],puVar13[7]) != *(short *)((long)param_1 + 0x4ae)) ||
         (lVar11 = *(long *)(param_1 + 0xb8), lVar7 = ssl_get_cipher_by_char(param_1,puVar13 + 8,0),
         lVar11 != lVar7)) {
        ERR_new();
        ERR_set_debug("ssl/statem/extensions_srvr.c",0x31c,"tls_parse_ctos_cookie");
        uVar8 = 0x2f;
        uVar9 = 0xba;
        goto LAB_009d7bc4;
      }
      uVar4 = (ulong)CONCAT11(puVar13[0x13],puVar13[0x14]);
      lVar7 = (uVar3 - 0x13) - uVar4;
      if ((uVar4 <= uVar3 - 0x13) && (lVar7 != 0)) {
        puVar2 = puVar13 + 0x15;
        uVar12 = (ulong)(byte)puVar2[uVar4];
        uVar10 = lVar7 - 1;
        if ((uVar12 <= uVar10) && (uVar10 - uVar12 == 0x20)) {
          cVar5 = puVar13[10];
          uVar10 = (*(ulong *)(puVar13 + 0xb) & 0xff00ff00ff00ff00) >> 8 |
                   (*(ulong *)(puVar13 + 0xb) & 0xff00ff00ff00ff) << 8;
          uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
          uVar14 = uVar10 >> 0x20 | uVar10 << 0x20;
          uVar10 = time((time_t *)0x0);
          if (uVar10 < uVar14) {
            return 1;
          }
          if (600 < uVar10 - uVar14) {
            return 1;
          }
          iVar6 = (**(code **)(*(long *)(param_1 + 0x26a) + 0xe8))
                            (param_1,puVar2 + uVar4 + 1,uVar12);
          if (iVar6 != 0) {
            iVar6 = WPACKET_init_static_len(auStack_98,auStack_1184,0x10cc,0);
            if (iVar6 == 0) {
              ERR_new();
              uVar8 = 0x33d;
            }
            else {
              iVar6 = WPACKET_put_bytes__(auStack_98,2,1);
              if ((((((iVar6 == 0) ||
                     (iVar6 = WPACKET_start_sub_packet_len__(auStack_98,3), iVar6 == 0)) ||
                    (iVar6 = WPACKET_put_bytes__(auStack_98,0x303,2), iVar6 == 0)) ||
                   ((iVar6 = WPACKET_memcpy(auStack_98,hrrrandom,0x20), iVar6 == 0 ||
                    (iVar6 = WPACKET_sub_memcpy__
                                       (auStack_98,param_1 + 0x250,*(undefined8 *)(param_1 + 600),1)
                    , iVar6 == 0)))) ||
                  (iVar6 = (**(code **)(*(long *)(param_1 + 2) + 0x98))
                                     (*(undefined8 *)(param_1 + 0xb8),auStack_98,auStack_1198),
                  iVar6 == 0)) ||
                 ((iVar6 = WPACKET_put_bytes__(auStack_98,0,1), iVar6 == 0 ||
                  (iVar6 = WPACKET_start_sub_packet_len__(auStack_98,2), iVar6 == 0)))) {
                WPACKET_cleanup(auStack_98);
                ERR_new();
                uVar8 = 0x34b;
              }
              else {
                iVar6 = WPACKET_put_bytes__(auStack_98,0x2b,2);
                if ((((iVar6 == 0) ||
                     (iVar6 = WPACKET_start_sub_packet_len__(auStack_98,2), iVar6 == 0)) ||
                    (iVar6 = WPACKET_put_bytes__(auStack_98,(long)*param_1,2), iVar6 == 0)) ||
                   (iVar6 = WPACKET_close(auStack_98), iVar6 == 0)) {
                  WPACKET_cleanup(auStack_98);
                  ERR_new();
                  uVar8 = 0x353;
                }
                else if ((cVar5 == '\0') ||
                        (((iVar6 = WPACKET_put_bytes__(auStack_98,0x33,2), iVar6 != 0 &&
                          (iVar6 = WPACKET_start_sub_packet_len__(auStack_98,2), iVar6 != 0)) &&
                         ((iVar6 = WPACKET_put_bytes__(auStack_98,
                                                       *(undefined2 *)((long)param_1 + 0x4ae),2),
                          iVar6 != 0 && (iVar6 = WPACKET_close(auStack_98), iVar6 != 0)))))) {
                  iVar6 = WPACKET_put_bytes__(auStack_98,0x2c,2);
                  if ((((iVar6 != 0) &&
                       (iVar6 = WPACKET_start_sub_packet_len__(auStack_98,2), iVar6 != 0)) &&
                      (iVar6 = WPACKET_sub_memcpy__(auStack_98,puVar1,uVar3,2), iVar6 != 0)) &&
                     ((((iVar6 = WPACKET_close(auStack_98), iVar6 != 0 &&
                        (iVar6 = WPACKET_close(auStack_98), iVar6 != 0)) &&
                       (iVar6 = WPACKET_close(auStack_98), iVar6 != 0)) &&
                      ((iVar6 = WPACKET_get_total_written(auStack_98,&local_1190), iVar6 != 0 &&
                       (iVar6 = WPACKET_finish(auStack_98), iVar6 != 0)))))) {
                    uVar8 = create_synthetic_message_hash
                                      (param_1,puVar2,uVar4,auStack_1184,local_1190);
                    if ((int)uVar8 == 0) {
                      return uVar8;
                    }
                    param_1[0x23a] = 1;
                    param_1[0x2d2] = 1;
                    return 1;
                  }
                  WPACKET_cleanup(auStack_98);
                  ERR_new();
                  uVar8 = 0x369;
                }
                else {
                  WPACKET_cleanup(auStack_98);
                  ERR_new();
                  uVar8 = 0x35c;
                }
              }
            }
            goto LAB_009d7d4c;
          }
          ERR_new();
          uVar8 = 0x333;
          goto LAB_009d7cd4;
        }
      }
      ERR_new();
      uVar8 = 0x325;
    }
  }
  ERR_set_debug("ssl/statem/extensions_srvr.c",uVar8,"tls_parse_ctos_cookie");
  uVar8 = 0x32;
  uVar9 = 0x9f;
LAB_009d7bc4:
  ossl_statem_fatal(param_1,uVar8,uVar9,0);
  return 0;
}

