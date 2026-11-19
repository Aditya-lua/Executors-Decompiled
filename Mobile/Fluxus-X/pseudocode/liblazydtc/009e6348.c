/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e6348
 */

undefined8 ossl_statem_server_read_transition(SSL *param_1,int param_2)

{
  uint uVar1;
  int iVar2;
  BIO *b;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined4 uVar5;
  
  uVar1 = *(uint *)(param_1->method->get_timeout + 0x60);
  if ((((uVar1 >> 3 & 1) == 0) && (iVar2 = param_1->method->version, 0x303 < iVar2)) &&
     (iVar2 != 0x10000)) {
    switch(*(undefined4 *)((long)&param_1->init_msg + 4)) {
    case 1:
      if (*(int *)((long)&param_1->s3 + 4) != 0xb) {
        if (param_2 == 0x18) {
          uVar5 = 0x2c;
          goto LAB_009e65b0;
        }
        if ((param_2 == 0xb) && (*(int *)&param_1[4].enc_write_ctx == 4)) goto LAB_009e6540;
      }
      break;
    case 0x1b:
      if (*(long *)(*(long *)&param_1[3].sid_ctx_length + 0x2b8) == 0)
      goto switchD_009e639c_caseD_1d;
      if (param_2 == 0xf) {
LAB_009e65a4:
        uVar5 = 0x1d;
        goto LAB_009e65b0;
      }
      break;
    case 0x1d:
switchD_009e639c_caseD_1d:
      if (param_2 == 0x14) goto LAB_009e6514;
      break;
    case 0x24:
    case 0x31:
switchD_009e639c_caseD_24:
      if (*(int *)&param_1[1].msg_callback == 0) goto switchD_009e639c_caseD_1d;
      if (param_2 == 0xb) goto LAB_009e6540;
      break;
    case 0x2e:
      if (*(int *)&param_1[3].read_hash == 1) {
        if (param_2 == 1) goto LAB_009e63dc;
      }
      else {
        if (param_1[4].packet_length != 2) goto switchD_009e639c_caseD_24;
        if (param_2 == 5) {
          uVar5 = 0x31;
          goto LAB_009e65b0;
        }
      }
    }
  }
  else {
    switch(*(undefined4 *)((long)&param_1->init_msg + 4)) {
    case 0:
    case 1:
    case 0x15:
      if (param_2 == 1) {
LAB_009e63dc:
        uVar5 = 0x14;
        goto LAB_009e65b0;
      }
      break;
    case 0x1a:
      if (param_2 != 0x10) {
        if ((param_2 != 0xb) || (*(int *)&param_1[1].msg_callback == 0)) break;
LAB_009e6540:
        uVar5 = 0x1b;
        goto LAB_009e65b0;
      }
      if (*(int *)&param_1[1].msg_callback != 0) {
        if (param_1->version != 0x300) goto switchD_009e639c_caseD_2;
        if ((~param_1[3].error & 3U) == 0) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0xc9,"ossl_statem_server_read_transition");
          uVar3 = 0x28;
          uVar4 = 199;
          goto LAB_009e6588;
        }
      }
LAB_009e6440:
      uVar5 = 0x1c;
      goto LAB_009e65b0;
    case 0x1b:
      if (param_2 == 0x10) goto LAB_009e6440;
      break;
    case 0x1c:
      if ((*(long *)(*(long *)&param_1[3].sid_ctx_length + 0x2b8) == 0) ||
         (*(int *)&param_1->field_0x74 != 0)) goto switchD_009e63d0_caseD_1d;
      if (param_2 == 0xf) goto LAB_009e65a4;
      break;
    case 0x1d:
    case 0x24:
switchD_009e63d0_caseD_1d:
      if (param_2 == 0x101) {
        uVar5 = 0x1f;
        goto LAB_009e65b0;
      }
      goto switchD_009e639c_caseD_2;
    case 0x1e:
switchD_009e63d0_caseD_1e:
      if (param_2 != 0x14) break;
LAB_009e6514:
      uVar5 = 0x20;
LAB_009e65b0:
      *(undefined4 *)((long)&param_1->init_msg + 4) = uVar5;
      return 1;
    case 0x1f:
      if (*(int *)&param_1[1].field_0x1d4 == 0) goto switchD_009e63d0_caseD_1e;
      if (param_2 == 0x43) {
        uVar5 = 0x1e;
        goto LAB_009e65b0;
      }
    }
    if ((param_2 == 0x101) && ((uVar1 >> 3 & 1) != 0)) {
      param_1->msg_callback = (_func_3150 *)0x0;
      param_1->rwstate = 3;
      b = SSL_get_rbio(param_1);
      BIO_clear_flags(b,0xf);
      BIO_set_flags(b,9);
      return 0;
    }
  }
switchD_009e639c_caseD_2:
  ERR_new();
  ERR_set_debug("ssl/statem/statem_srvr.c",0x138,"ossl_statem_server_read_transition");
  uVar3 = 10;
  uVar4 = 0xf4;
LAB_009e6588:
  ossl_statem_fatal(param_1,uVar3,uVar4,0);
  return 0;
}

