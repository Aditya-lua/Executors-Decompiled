/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e29a4
 */

/* WARNING: Removing unreachable block (ram,0x009e2a04) */

undefined8 tls_setup_handshake(SSL *param_1)

{
  char cVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  int *piVar7;
  stack_st_SSL_CIPHER *psVar8;
  long lVar9;
  undefined8 uVar10;
  char *pcVar11;
  SSL_METHOD *pSVar12;
  undefined4 *puVar13;
  int iVar14;
  int *piVar15;
  
  uVar6 = ssl3_init_finished_mac();
  if ((int)uVar6 == 0) {
    return uVar6;
  }
  param_1[3].tlsext_ecpointformatlist_length = 0;
  param_1[3].tlsext_ocsp_resplen = 0;
  param_1[3].tlsext_ticket_expected = 0;
  pSVar12 = param_1->method;
  *(undefined2 *)&param_1[3].tlsext_ellipticcurvelist_length = 0;
  param_1[3].tlsext_ecpointformatlist = (uchar *)0x0;
  iVar14 = pSVar12->version;
  if (iVar14 == 0x10000) {
    puVar13 = &DAT_00c58798;
LAB_009e2a18:
    iVar4 = 0;
    iVar14 = 0;
    bVar2 = true;
    piVar15 = puVar13 + 6;
    do {
      while (*(code **)(piVar15 + -4) != (code *)0x0) {
        piVar7 = (int *)(**(code **)(piVar15 + -4))();
        iVar3 = FUN_009e4f38(param_1,piVar7);
        if (iVar3 == 0) {
          iVar4 = *piVar7;
          if (bVar2) {
            iVar14 = iVar4;
          }
          iVar3 = *piVar15;
          bVar2 = false;
        }
        else {
          bVar2 = true;
          iVar3 = *piVar15;
        }
        piVar15 = piVar15 + 6;
        if (iVar3 == 0) goto LAB_009e2a80;
      }
      bVar2 = true;
      iVar3 = *piVar15;
      piVar15 = piVar15 + 6;
    } while (iVar3 != 0);
LAB_009e2a80:
    if (iVar14 != 0) goto LAB_009e2abc;
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x68,"tls_setup_handshake");
    uVar6 = 0x46;
    uVar10 = 0xbf;
LAB_009e2aa8:
    pcVar11 = (char *)0x0;
    goto LAB_009e2c88;
  }
  if (iVar14 == 0x1ffff) {
    puVar13 = &DAT_00c58828;
    goto LAB_009e2a18;
  }
  iVar4 = param_1->version;
  iVar14 = iVar4;
LAB_009e2abc:
  if (*(long *)(*(long *)&param_1[3].ex_data.dummy + 0x588) == 0) {
    if (((byte)param_1->method->get_timeout[0x60] >> 3 & 1) != 0) {
      if ((iVar14 == 0x100) || (0xfefe < iVar14)) goto LAB_009e2c58;
      lVar9 = 0xfefd;
      if ((iVar4 == 0x100) || (0xfefd < iVar4)) goto LAB_009e2c18;
      goto LAB_009e2ac8;
    }
    if (0x302 < iVar14) {
      if (iVar4 < 0x303) {
        lVar9 = 0x303;
LAB_009e2c18:
        lVar9 = SSL_ctrl(param_1,0x7b,lVar9,(void *)0x0);
        if ((int)lVar9 == 0) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_lib.c",0x8d,"tls_setup_handshake");
          uVar6 = 0x28;
          uVar10 = 0xc0103;
          goto LAB_009e2aa8;
        }
      }
      goto LAB_009e2ac8;
    }
LAB_009e2c58:
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x79,"tls_setup_handshake");
    pcVar11 = 
    "The max supported SSL/TLS version needs the MD5-SHA1 digest but it is not available in the loaded providers. Use (D)TLSv1.2 or above, or load different providers"
    ;
    uVar10 = 0x129;
  }
  else {
LAB_009e2ac8:
    if (param_1->server == 0) {
      if ((param_1->tlsext_opaque_prf_input == (void *)0x0) || (param_1[1].wbio == (BIO *)0x0)) {
        piVar15 = (int *)(*(long *)&param_1[4].mac_flags + 0x78);
        do {
          cVar1 = '\x01';
          bVar2 = (bool)ExclusiveMonitorPass(piVar15,0x10);
          if (bVar2) {
            *piVar15 = *piVar15 + 1;
            cVar1 = ExclusiveMonitorsStatus();
          }
        } while (cVar1 != '\0');
      }
      else {
        piVar15 = (int *)(*(long *)&param_1[4].mac_flags + 0x7c);
        do {
          cVar1 = '\x01';
          bVar2 = (bool)ExclusiveMonitorPass(piVar15,0x10);
          if (bVar2) {
            *piVar15 = *piVar15 + 1;
            cVar1 = ExclusiveMonitorsStatus();
          }
        } while (cVar1 != '\0');
      }
      pSVar12 = param_1->method;
      param_1->psk_client_callback = (_func_3153 *)0x0;
      param_1->kssl_ctx = (KSSL_CTX *)0x0;
      param_1->ctx = (SSL_CTX *)0x0;
      param_1->psk_server_callback = (_func_3154 *)0x0;
      *(undefined4 *)&param_1[1].tlsext_ecpointformatlist_length = 0;
      param_1[1].quiet_shutdown = 0;
      if (((byte)pSVar12->get_timeout[0x60] >> 3 & 1) == 0) {
        return 1;
      }
      *(undefined4 *)&param_1->s2 = 1;
      return 1;
    }
    psVar8 = SSL_get_ciphers(param_1);
    iVar4 = OPENSSL_sk_num();
    if (0 < iVar4) {
      iVar4 = 0;
      iVar3 = 0xff00;
      if (iVar14 != 0x100) {
        iVar3 = iVar14;
      }
      do {
        lVar9 = OPENSSL_sk_value(psVar8,iVar4);
        if (((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) {
          if ((*(int *)(lVar9 + 0x2c) <= iVar14) && (iVar14 <= *(int *)(lVar9 + 0x30))) {
LAB_009e2ce8:
            if ((param_1->tlsext_opaque_prf_input == (void *)0x0) || (param_1[1].wbio == (BIO *)0x0)
               ) {
              piVar15 = (int *)(*(long *)&param_1[4].mac_flags + 0x84);
              do {
                cVar1 = '\x01';
                bVar2 = (bool)ExclusiveMonitorPass(piVar15,0x10);
                if (bVar2) {
                  *piVar15 = *piVar15 + 1;
                  cVar1 = ExclusiveMonitorsStatus();
                }
              } while (cVar1 != '\0');
              return 1;
            }
            piVar15 = (int *)(*(long *)&param_1[3].ex_data.dummy + 0x88);
            do {
              cVar1 = '\x01';
              bVar2 = (bool)ExclusiveMonitorPass(piVar15,0x10);
              if (bVar2) {
                *piVar15 = *piVar15 + 1;
                cVar1 = ExclusiveMonitorsStatus();
              }
            } while (cVar1 != '\0');
            *(undefined4 *)&param_1[1].msg_callback = 0;
            return 1;
          }
        }
        else {
          iVar5 = 0xff00;
          if (*(int *)(lVar9 + 0x34) != 0x100) {
            iVar5 = *(int *)(lVar9 + 0x34);
          }
          if (iVar3 <= iVar5) {
            iVar5 = 0xff00;
            if (*(int *)(lVar9 + 0x38) != 0x100) {
              iVar5 = *(int *)(lVar9 + 0x38);
            }
            if (iVar5 <= iVar3) goto LAB_009e2ce8;
          }
        }
        iVar4 = iVar4 + 1;
        iVar5 = OPENSSL_sk_num(psVar8);
      } while (iVar4 < iVar5);
    }
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0xaa,"tls_setup_handshake");
    pcVar11 = "No ciphers enabled for max supported SSL/TLS version";
    uVar10 = 0xb5;
  }
  uVar6 = 0x28;
LAB_009e2c88:
  ossl_statem_fatal(param_1,uVar6,uVar10,pcVar11);
  return 0;
}

