/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d146c
 */

undefined8 FUN_009d146c(SSL *param_1,undefined8 param_2,int param_3)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  size_t sVar4;
  int iVar5;
  uint uVar6;
  int iVar7;
  char *pcVar8;
  SSL_SESSION *pSVar9;
  undefined4 uVar10;
  undefined8 uVar11;
  long lVar12;
  long lVar13;
  undefined4 local_34;
  
  local_34 = 0x70;
  uVar6 = SSL_get_options();
  lVar12 = *(long *)&param_1[3].ex_data.dummy;
  if ((lVar12 == 0) || (lVar13 = *(long *)&param_1[4].mac_flags, lVar13 == 0)) {
    ERR_new();
    uVar11 = 0x3ae;
  }
  else {
    if (*(code **)(lVar12 + 0x218) == (code *)0x0) {
      if (*(code **)(lVar13 + 0x218) != (code *)0x0) {
        iVar7 = (**(code **)(lVar13 + 0x218))(param_1,&local_34,*(undefined8 *)(lVar13 + 0x220));
        goto LAB_009d1518;
      }
      iVar7 = 3;
      iVar5 = 3;
      if (param_1->server != 0) goto LAB_009d1524;
LAB_009d15c0:
      if (param_1->tlsext_opaque_prf_input == (void *)0x0) goto LAB_009d15d0;
LAB_009d15c8:
      if (param_1[1].wbio == (BIO *)0x0) goto LAB_009d15d0;
    }
    else {
      iVar7 = (**(code **)(lVar12 + 0x218))(param_1,&local_34,*(undefined8 *)(lVar12 + 0x220));
LAB_009d1518:
      iVar5 = iVar7;
      if (param_1->server == 0) goto LAB_009d15c0;
LAB_009d1524:
      iVar7 = iVar5;
      if (((param_3 == 0) || (iVar7 != 0)) || ((int)param_1[1].tlsext_ecpointformatlist_length != 0)
         ) goto LAB_009d15c0;
      CRYPTO_free(*(void **)(*(long *)&param_1[3].sid_ctx_length + 0x330));
      pcVar8 = CRYPTO_strdup((char *)param_1[3].tlsext_opaque_prf_input_len,
                             "ssl/statem/extensions.c",0x3c5);
      *(char **)(*(long *)&param_1[3].sid_ctx_length + 0x330) = pcVar8;
      if ((pcVar8 != (char *)0x0) || (param_1[3].tlsext_opaque_prf_input_len == 0))
      goto LAB_009d15c0;
      ERR_new();
      ERR_set_debug("ssl/statem/extensions.c",0x3c7,"final_server_name");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      if (param_1->tlsext_opaque_prf_input != (void *)0x0) goto LAB_009d15c8;
LAB_009d15d0:
      lVar12 = *(long *)&param_1[3].ex_data.dummy;
      if ((lVar12 != *(long *)&param_1[4].mac_flags) && (*(int *)&param_1[3].read_hash == 0)) {
        piVar1 = (int *)(lVar12 + 0x84);
        do {
          cVar2 = '\x01';
          bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
          if (bVar3) {
            *piVar1 = *piVar1 + 1;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
        piVar1 = (int *)(*(long *)&param_1[4].mac_flags + 0x84);
        do {
          cVar2 = '\x01';
          bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
          if (bVar3) {
            *piVar1 = *piVar1 + -1;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
      }
    }
    switch(iVar7) {
    case 0:
      if ((uVar6 >> 0xe & 1) != 0) {
        return 1;
      }
      if (*(int *)&param_1[3].next_proto_negotiated_len == 0) {
        return 1;
      }
      uVar6 = SSL_get_options(param_1);
      if ((uVar6 >> 0xe & 1) == 0) {
        return 1;
      }
      sVar4 = param_1[1].tlsext_ecpointformatlist_length;
      *(undefined4 *)&param_1[3].next_proto_negotiated_len = 0;
      if ((int)sVar4 != 0) {
        return 1;
      }
      pSVar9 = SSL_get_session(param_1);
      if (pSVar9 == (SSL_SESSION *)0x0) {
        ERR_new();
        uVar11 = 0x3ee;
      }
      else {
        CRYPTO_free(*(void **)(pSVar9[1].krb5_client_princ + 0x50));
        pSVar9[1].krb5_client_princ[0x58] = '\0';
        pSVar9[1].krb5_client_princ[0x59] = '\0';
        pSVar9[1].krb5_client_princ[0x5a] = '\0';
        pSVar9[1].krb5_client_princ[0x5b] = '\0';
        pSVar9[1].krb5_client_princ[0x5c] = '\0';
        pSVar9[1].krb5_client_princ[0x5d] = '\0';
        pSVar9[1].krb5_client_princ[0x5e] = '\0';
        pSVar9[1].krb5_client_princ[0x5f] = '\0';
        pSVar9[1].krb5_client_princ[0x50] = '\0';
        pSVar9[1].krb5_client_princ[0x51] = '\0';
        pSVar9[1].krb5_client_princ[0x52] = '\0';
        pSVar9[1].krb5_client_princ[0x53] = '\0';
        pSVar9[1].krb5_client_princ[0x54] = '\0';
        pSVar9[1].krb5_client_princ[0x55] = '\0';
        pSVar9[1].krb5_client_princ[0x56] = '\0';
        pSVar9[1].krb5_client_princ[0x57] = '\0';
        pSVar9[1].krb5_client_princ[0x68] = '\0';
        pSVar9[1].krb5_client_princ[0x69] = '\0';
        pSVar9[1].krb5_client_princ[0x6a] = '\0';
        pSVar9[1].krb5_client_princ[0x6b] = '\0';
        pSVar9[1].krb5_client_princ[0x60] = '\0';
        pSVar9[1].krb5_client_princ[0x61] = '\0';
        pSVar9[1].krb5_client_princ[0x62] = '\0';
        pSVar9[1].krb5_client_princ[99] = '\0';
        pSVar9[1].krb5_client_princ[100] = '\0';
        pSVar9[1].krb5_client_princ[0x65] = '\0';
        pSVar9[1].krb5_client_princ[0x66] = '\0';
        pSVar9[1].krb5_client_princ[0x67] = '\0';
        iVar7 = ssl_generate_session_id(param_1,pSVar9);
        if (iVar7 != 0) {
          return 1;
        }
        ERR_new();
        uVar11 = 0x3ea;
      }
      break;
    case 1:
      if (((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) != 0) ||
          (iVar7 = param_1->method->version, iVar7 < 0x304)) || (iVar7 == 0x10000)) {
        ssl3_send_alert(param_1,1,local_34);
      }
    case 3:
      *(undefined4 *)&param_1[4].msg_callback_arg = 0;
    default:
      return 1;
    case 2:
      ERR_new();
      ERR_set_debug("ssl/statem/extensions.c",0x3f6,"final_server_name");
      uVar11 = 0xea;
      uVar10 = local_34;
      goto LAB_009d14ec;
    }
  }
  ERR_set_debug("ssl/statem/extensions.c",uVar11,"final_server_name");
  uVar11 = 0xc0103;
  uVar10 = 0x50;
LAB_009d14ec:
  ossl_statem_fatal(param_1,uVar10,uVar11,0);
  return 0;
}

