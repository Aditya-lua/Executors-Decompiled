/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009db244
 */

undefined8 ossl_statem_client_read_transition(SSL *param_1,int param_2)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  BIO *b;
  undefined4 uVar4;
  uint uVar5;
  long lVar6;
  
  uVar1 = *(uint *)(param_1->method->get_timeout + 0x60);
  if ((((uVar1 >> 3 & 1) == 0) && (iVar3 = param_1->method->version, 0x303 < iVar3)) &&
     (iVar3 != 0x10000)) {
    switch(*(undefined4 *)((long)&param_1->init_msg + 4)) {
    case 1:
      if (param_2 == 0x18) {
        uVar4 = 0x2d;
        goto LAB_009db530;
      }
      if (param_2 == 0xd) {
        if (*(int *)&param_1[4].enc_write_ctx == 1) {
          *(undefined4 *)&param_1[4].enc_write_ctx = 4;
          iVar3 = tls13_restore_handshake_digest_for_pha(param_1);
          if (iVar3 != 0) goto LAB_009db52c;
        }
        break;
      }
      if (param_2 != 4) break;
LAB_009db300:
      uVar4 = 9;
      goto LAB_009db530;
    case 3:
      if (param_2 == 8) {
        uVar4 = 0x26;
        goto LAB_009db530;
      }
      break;
    case 4:
      if (param_2 == 0xf) {
        uVar4 = 0x27;
        goto LAB_009db530;
      }
      break;
    case 7:
      if (param_2 == 0xb) {
LAB_009db414:
        uVar4 = 4;
        goto LAB_009db530;
      }
      break;
    case 0xc:
      if (param_2 == 2) goto LAB_009db424;
      break;
    case 0x26:
      if ((int)param_1[1].tlsext_ecpointformatlist_length != 0) goto switchD_009db298_caseD_27;
      if (param_2 == 0xb) goto LAB_009db414;
      if (param_2 != 0xd) break;
      goto LAB_009db52c;
    case 0x27:
switchD_009db298_caseD_27:
      if (param_2 == 0x14) goto LAB_009db43c;
    }
    goto switchD_009db298_caseD_2;
  }
  switch(*(undefined4 *)((long)&param_1->init_msg + 4)) {
  case 1:
    if (param_2 == 0) {
      uVar4 = 0x29;
      goto LAB_009db530;
    }
    break;
  case 3:
    if ((int)param_1[1].tlsext_ecpointformatlist_length != 0) goto switchD_009db2d8_caseD_12;
    if ((param_2 == 3) && ((uVar1 >> 3 & 1) != 0)) {
LAB_009db450:
      uVar4 = 2;
      goto LAB_009db530;
    }
    iVar3 = param_1->version;
    if ((((0x300 < iVar3) &&
         (lVar6._0_4_ = param_1[4].server, lVar6._4_4_ = param_1[4].new_session, lVar6 != 0)) &&
        (param_2 == 0x101)) && (*(long *)(*(long *)&param_1[3].sid_ctx_length + 0x338) != 0)) {
      *(undefined4 *)&param_1[1].tlsext_ecpointformatlist_length = 1;
      *(undefined4 *)((long)&param_1->init_msg + 4) = 10;
      return 1;
    }
    uVar5 = *(uint *)(param_1[1].handshake_func + 0x20);
    if ((uVar5 & 0x54) == 0) {
      if (param_2 == 0xb) goto LAB_009db414;
      break;
    }
    uVar2 = *(uint *)(param_1[1].handshake_func + 0x1c);
    if ((uVar2 & 0x1a6) != 0) goto LAB_009db344;
    if ((param_2 == 0xc) && ((uVar2 & 0x1c8) != 0)) goto LAB_009db3a0;
    if (param_2 == 0xe) goto LAB_009db4fc;
    if (param_2 != 0xd) break;
    goto LAB_009db3cc;
  case 4:
    if ((param_2 == 0x16) && (*(int *)((long)&param_1[3].tls_session_ticket_ext_cb_arg + 4) != 0)) {
      uVar4 = 5;
      goto LAB_009db530;
    }
  case 5:
    if ((*(uint *)(param_1[1].handshake_func + 0x1c) & 0x1a6) != 0) {
LAB_009db344:
      if (param_2 == 0xc) {
LAB_009db3a0:
        uVar4 = 6;
LAB_009db530:
        *(undefined4 *)((long)&param_1->init_msg + 4) = uVar4;
        return 1;
      }
      break;
    }
    if ((param_2 == 0xc) && ((*(uint *)(param_1[1].handshake_func + 0x1c) & 0x1c8) != 0))
    goto LAB_009db3a0;
switchD_009db2d8_caseD_6:
    if (param_2 == 0xe) {
LAB_009db4fc:
      uVar4 = 8;
      goto LAB_009db530;
    }
    if (param_2 != 0xd) break;
    iVar3 = param_1->version;
    uVar5 = *(uint *)(param_1[1].handshake_func + 0x20);
LAB_009db3cc:
    if (((uVar5 & 0x50) == 0) && (iVar3 < 0x301 || (uVar5 & 4) == 0)) {
LAB_009db52c:
      uVar4 = 7;
      goto LAB_009db530;
    }
    goto switchD_009db298_caseD_2;
  case 6:
    goto switchD_009db2d8_caseD_6;
  case 7:
    if (param_2 != 0xe) break;
    goto LAB_009db4fc;
  case 9:
switchD_009db2d8_caseD_9:
    if (param_2 == 0x101) {
      uVar4 = 10;
      goto LAB_009db530;
    }
    goto switchD_009db298_caseD_2;
  case 10:
    if (param_2 == 0x14) {
LAB_009db43c:
      uVar4 = 0xb;
      goto LAB_009db530;
    }
    break;
  case 0xc:
    if (param_2 == 2) {
LAB_009db424:
      uVar4 = 3;
      goto LAB_009db530;
    }
    if ((param_2 == 3) && ((uVar1 >> 3 & 1) != 0)) goto LAB_009db450;
    break;
  case 0x12:
switchD_009db2d8_caseD_12:
    if (*(int *)&param_1[3].next_proto_negotiated_len == 0) goto switchD_009db2d8_caseD_9;
    if (param_2 == 4) goto LAB_009db300;
    break;
  case 0x2e:
    if (param_2 == 2) goto LAB_009db424;
  }
  if ((param_2 == 0x101) && ((uVar1 >> 3 & 1) != 0)) {
    param_1->msg_callback = (_func_3150 *)0x0;
    param_1->rwstate = 3;
    b = SSL_get_rbio(param_1);
    BIO_clear_flags(b,0xf);
    BIO_set_flags(b,9);
  }
  else {
switchD_009db298_caseD_2:
    ERR_new();
    ERR_set_debug("ssl/statem/statem_clnt.c",0x18e,"ossl_statem_client_read_transition");
    ossl_statem_fatal(param_1,10,0xf4,0);
  }
  return 0;
}

