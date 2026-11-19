/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a6fc0
 */

undefined8 DTLSv1_listen(SSL *param_1,void *param_2)

{
  char *data;
  ulong uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  byte bVar5;
  int iVar6;
  int iVar7;
  BIO *b;
  BIO *bp;
  undefined4 *puVar8;
  void *parg;
  undefined8 uVar9;
  undefined8 uVar10;
  ulong uVar11;
  X509_EXTENSIONS *pXVar12;
  ulong uVar13;
  long lVar14;
  code *pcVar15;
  undefined8 uVar16;
  ulong uVar17;
  char *data_00;
  int local_1b8 [2];
  undefined1 auStack_1b0 [60];
  uint local_174;
  undefined8 local_170;
  undefined1 auStack_168 [264];
  
  if (param_1->handshake_func == (_func_3149 *)0x0) {
    SSL_set_accept_state(param_1);
  }
  iVar6 = SSL_clear(param_1);
  if (iVar6 != 0) {
    ERR_clear_error();
    b = SSL_get_rbio(param_1);
    bp = SSL_get_wbio(param_1);
    if ((b == (BIO *)0x0) || (bp == (BIO *)0x0)) {
      ERR_new();
      ERR_set_debug("ssl/d1_lib.c",0x1e5,"DTLSv1_listen");
      uVar16 = 0x80;
    }
    else {
      if ((param_1->version & 0xff00U) == 0xfe00) {
        iVar6 = ssl3_setup_buffers(param_1);
        if (iVar6 == 0) {
          return 0xffffffff;
        }
        data_00 = param_1[4].tlsext_hostname;
        uVar13 = (ulong)~((int)param_1[4].mode + 4U) & 7;
        data = (char *)(param_1[4].mode + uVar13);
        puVar8 = (undefined4 *)__errno();
        *puVar8 = 0;
        iVar6 = BIO_read(b,data,0x400d);
        if (iVar6 < 1) {
LAB_009a756c:
          bp = b;
LAB_009a7574:
          iVar6 = BIO_test_flags(bp,8);
          uVar16 = 0;
          if (iVar6 == 0) {
            return 0xffffffff;
          }
LAB_009a77ec:
          BIO_ADDR_free(0);
          return uVar16;
        }
        do {
          if (iVar6 < 0xd) {
            ERR_new();
            ERR_set_debug("ssl/d1_lib.c",0x227,"DTLSv1_listen");
            uVar16 = 0x12a;
            goto LAB_009a77e0;
          }
          if ((code *)param_1[1].tlsext_ocsp_resp != (code *)0x0) {
            uVar16._0_4_ = param_1[1].tlsext_ocsp_resplen;
            uVar16._4_4_ = param_1[1].tlsext_ticket_expected;
            (*(code *)param_1[1].tlsext_ocsp_resp)(0,0,0x100,data,0xd,param_1,uVar16);
          }
          if (*data != '\x16') {
            ERR_new();
            uVar16 = 0x237;
            goto LAB_009a775c;
          }
          if (data[1] != -2) {
            ERR_new();
            ERR_set_debug("ssl/d1_lib.c",0x240,"DTLSv1_listen");
            uVar16 = 0x74;
            goto LAB_009a77e0;
          }
          lVar14 = (long)iVar6;
          if ((lVar14 - 3U < 8) || (local_170 = *(undefined8 *)(data + 3), lVar14 - 0xbU < 2)) {
LAB_009a765c:
            ERR_new();
            uVar16 = 0x248;
LAB_009a77d4:
            ERR_set_debug("ssl/d1_lib.c",uVar16,"DTLSv1_listen");
            uVar16 = 0x9f;
LAB_009a77e0:
            ERR_set_error(0x14,uVar16,0);
            uVar16 = 0;
            goto LAB_009a77ec;
          }
          uVar1 = (ulong)CONCAT11(data[0xb],data[0xc]);
          if (lVar14 - 0xdU < uVar1) goto LAB_009a765c;
          if ((((uint)local_170 | (uint)((ulong)local_170 >> 8)) & 0xff) != 0) {
            ERR_new();
            uVar16 = 0x253;
LAB_009a775c:
            ERR_set_debug("ssl/d1_lib.c",uVar16,"DTLSv1_listen");
            uVar16 = 0xf4;
            goto LAB_009a77e0;
          }
          if (((((uVar1 == 0) || (uVar1 - 1 < 3)) ||
               (((ulong)(byte)data[0xc] & 0xfffe | (ulong)(byte)data[0xb] << 8) == 4)) ||
              ((uVar1 - 6 < 3 || (uVar1 - 9 < 3)))) ||
             (uVar17 = (ulong)(byte)data[0x16] << 0x10 | (ulong)(byte)data[0x17] << 8 |
                       (ulong)(byte)data[0x18], uVar1 - 0xc != uVar17)) {
            ERR_new();
            uVar16 = 0x262;
            goto LAB_009a77d4;
          }
          if (data[0xd] != '\x01') {
            ERR_new();
            uVar16 = 0x267;
            goto LAB_009a775c;
          }
          if (2 < CONCAT11(data[0x11],data[0x12])) {
            ERR_new();
            ERR_set_debug("ssl/d1_lib.c",0x26d,"DTLSv1_listen");
            uVar16 = 0x192;
            goto LAB_009a77e0;
          }
          if (((data[0x13] != '\0' || data[0x14] != '\0') || data[0x15] != '\0') ||
             (((ulong)(byte)data[0xe] << 0x10 | (ulong)(byte)data[0xf] << 8 |
              (ulong)(byte)data[0x10]) < uVar17)) {
            ERR_new();
            ERR_set_debug("ssl/d1_lib.c",0x27a,"DTLSv1_listen");
            uVar16 = 0x191;
            goto LAB_009a77e0;
          }
          if ((code *)param_1[1].tlsext_ocsp_resp != (code *)0x0) {
            uVar9._0_4_ = param_1[1].tlsext_ocsp_resplen;
            uVar9._4_4_ = param_1[1].tlsext_ticket_expected;
            (*(code *)param_1[1].tlsext_ocsp_resp)
                      (0,param_1->version,0x16,data + 0xd,uVar17 + 0xc,param_1,uVar9);
          }
          if (uVar17 < 2) {
            ERR_new();
            uVar16 = 0x284;
            goto LAB_009a77d4;
          }
          uVar4 = param_1->method->version;
          uVar2 = 0xff00;
          if (CONCAT11(data[0x19],data[0x1a]) != 0x100) {
            uVar2 = (uint)CONCAT11(data[0x19],data[0x1a]);
          }
          uVar3 = 0xff00;
          if (uVar4 != 0x100) {
            uVar3 = uVar4;
          }
          if ((uVar4 != 0x1ffff) && (uVar3 < uVar2)) {
            ERR_new();
            ERR_set_debug("ssl/d1_lib.c",0x28d,"DTLSv1_listen");
            uVar16 = 0x10b;
            goto LAB_009a77e0;
          }
          if ((uVar17 == 0x22) || (uVar17 - 2 < 0x20)) {
LAB_009a7678:
            ERR_new();
            uVar16 = 0x298;
            goto LAB_009a77d4;
          }
          uVar11 = (ulong)(byte)data[0x3b];
          lVar14 = (uVar17 - 0x23) - uVar11;
          if ((uVar17 - 0x23 < uVar11) || (lVar14 == 0)) goto LAB_009a7678;
          bVar5 = data[uVar11 + 0x3c];
          if (lVar14 - 1U < (ulong)bVar5) goto LAB_009a7678;
          if (bVar5 != 0) {
            pcVar15 = *(code **)(*(long *)&param_1[3].ex_data.dummy + 0xd8);
            if (pcVar15 == (code *)0x0) {
              ERR_new();
              ERR_set_debug("ssl/d1_lib.c",0x2a7,"DTLSv1_listen");
              uVar16 = 0x193;
              goto LAB_009a75d0;
            }
            iVar6 = (*pcVar15)(param_1,data + uVar11 + 0x3c + 1);
            if (iVar6 != 0) {
              pXVar12 = param_1[1].tlsext_ocsp_exts;
              *(undefined2 *)&pXVar12[8].stack.sorted = 1;
              *(undefined4 *)((long)&pXVar12[8].stack.data + 4) = 0x10001;
              DTLS_RECORD_LAYER_set_write_sequence(&param_1[4].ex_data.dummy,&local_170);
              SSL_set_options(param_1,0x2000);
              ossl_statem_set_hello_verify_done(param_1);
              lVar14 = BIO_ctrl(b,0x2e,0,param_2);
              if ((int)lVar14 < 1) {
                BIO_ADDR_clear(param_2);
              }
              iVar6 = dtls_buffer_listen_record(param_1,uVar1,&local_170,uVar13);
              if (iVar6 == 0) {
                return 0xffffffff;
              }
              uVar16 = 1;
              goto LAB_009a77ec;
            }
          }
          pcVar15 = *(code **)(*(long *)&param_1[3].ex_data.dummy + 0xd0);
          if (((pcVar15 == (code *)0x0) ||
              (iVar6 = (*pcVar15)(param_1,auStack_168,&local_174), iVar6 == 0)) ||
             (0xff < local_174)) {
            ERR_new();
            ERR_set_debug("ssl/d1_lib.c",0x2c7,"DTLSv1_listen");
            uVar16 = 400;
            goto LAB_009a75d0;
          }
          if (param_1->method->version == 0x1ffff) {
            iVar6 = 0xfeff;
          }
          else {
            iVar6 = param_1->version;
          }
          iVar7 = ssl_get_max_send_fragment(param_1);
          iVar7 = WPACKET_init_static_len(auStack_1b0,data_00,iVar7 + 0xd,0);
          if (((((iVar7 == 0) || (iVar7 = WPACKET_put_bytes__(auStack_1b0,0x16,1), iVar7 == 0)) ||
               ((iVar6 = WPACKET_put_bytes__(auStack_1b0,iVar6,2), iVar6 == 0 ||
                ((iVar6 = WPACKET_memcpy(auStack_1b0,&local_170,8), iVar6 == 0 ||
                 (iVar6 = WPACKET_start_sub_packet_len__(auStack_1b0,2), iVar6 == 0)))))) ||
              ((iVar6 = WPACKET_put_bytes__(auStack_1b0,3,1), iVar6 == 0 ||
               ((((iVar6 = WPACKET_put_bytes__(auStack_1b0,0,3), iVar6 == 0 ||
                  (iVar6 = WPACKET_put_bytes__(auStack_1b0,0,2), iVar6 == 0)) ||
                 (iVar6 = WPACKET_put_bytes__(auStack_1b0,0,3), iVar6 == 0)) ||
                ((iVar6 = WPACKET_start_sub_packet_len__(auStack_1b0,3), iVar6 == 0 ||
                 (iVar6 = dtls_raw_hello_verify_request(auStack_1b0,auStack_168,local_174),
                 iVar6 == 0)))))))) ||
             (((iVar6 = WPACKET_close(auStack_1b0), iVar6 == 0 ||
               ((iVar6 = WPACKET_close(auStack_1b0), iVar6 == 0 ||
                (iVar6 = WPACKET_get_total_written(auStack_1b0,local_1b8), iVar6 == 0)))) ||
              (iVar6 = WPACKET_finish(auStack_1b0), iVar6 == 0)))) {
            ERR_new();
            ERR_set_debug("ssl/d1_lib.c",0x306,"DTLSv1_listen");
            ERR_set_error(0x14,0xc0103,0);
            WPACKET_cleanup(auStack_1b0);
            return 0xffffffff;
          }
          data_00[0x10] = data_00[0x18];
          *(undefined2 *)(data_00 + 0xe) = *(undefined2 *)(data_00 + 0x16);
          if ((code *)param_1[1].tlsext_ocsp_resp != (code *)0x0) {
            uVar10._0_4_ = param_1[1].tlsext_ocsp_resplen;
            uVar10._4_4_ = param_1[1].tlsext_ticket_expected;
            (*(code *)param_1[1].tlsext_ocsp_resp)(1,0,0x100,data,0xd,param_1,uVar10);
          }
          parg = (void *)BIO_ADDR_new();
          if (parg == (void *)0x0) {
            ERR_new();
            ERR_set_debug("ssl/d1_lib.c",0x31c,"DTLSv1_listen");
            uVar16 = 0xc0100;
            goto LAB_009a77e0;
          }
          lVar14 = BIO_ctrl(b,0x2e,0,parg);
          if (0 < (int)lVar14) {
            BIO_ctrl(bp,0x2c,0,parg);
          }
          BIO_ADDR_free(parg);
          iVar6 = BIO_write(bp,data_00,local_1b8[0]);
          if ((iVar6 < local_1b8[0]) || (lVar14 = BIO_ctrl(bp,0xb,0,(void *)0x0), (int)lVar14 < 1))
          goto LAB_009a7574;
          *puVar8 = 0;
          iVar6 = BIO_read(b,data,0x400d);
          if (iVar6 < 1) goto LAB_009a756c;
        } while( true );
      }
      ERR_new();
      ERR_set_debug("ssl/d1_lib.c",0x1f1,"DTLSv1_listen");
      uVar16 = 0x103;
    }
LAB_009a75d0:
    ERR_set_error(0x14,uVar16,0);
  }
  return 0xffffffff;
}

