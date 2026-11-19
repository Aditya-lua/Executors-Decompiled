/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e6cbc
 */

undefined8 ossl_statem_server_post_work(SSL *param_1)

{
  undefined4 uVar1;
  int iVar2;
  int *piVar3;
  undefined8 uVar4;
  uint uVar5;
  _func_3076 *p_Var6;
  undefined1 auStack_28 [8];
  
  uVar1 = *(undefined4 *)((long)&param_1->init_msg + 4);
  param_1->msg_callback = (_func_3150 *)0x0;
  switch(uVar1) {
  case 0x13:
    iVar2 = statem_flush(param_1);
    if (iVar2 != 1) {
      return 3;
    }
    uVar4 = ssl3_init_finished_mac(param_1);
    iVar2 = (int)uVar4;
    goto joined_r0x009e6eb0;
  case 0x15:
    iVar2 = statem_flush(param_1);
    if (iVar2 != 1) {
      return 3;
    }
    if ((param_1->version != 0x100) && (uVar4 = ssl3_init_finished_mac(param_1), (int)uVar4 == 0)) {
      return uVar4;
    }
    param_1[3].tlsext_status_expected = 1;
    break;
  case 0x16:
    if (((byte)param_1->method->get_timeout[0x60] >> 3 & 1) != 0) {
      return 2;
    }
    iVar2 = param_1->method->version;
    if (iVar2 < 0x304) {
      return 2;
    }
    if (iVar2 == 0x10000) {
      return 2;
    }
    uVar5 = (uint)param_1[3].tlsext_debug_cb;
    if (*(int *)&param_1[3].read_hash != 1) {
      if (((uVar5 >> 0x14 & 1) != 0) && (*(int *)&param_1[3].read_hash != 2)) {
        return 2;
      }
      goto switchD_009e6cf4_caseD_23;
    }
    if ((uVar5 >> 0x14 & 1) != 0) {
      return 2;
    }
  case 0x1a:
switchD_009e6cf4_caseD_1a:
    iVar2 = statem_flush(param_1);
    if (iVar2 != 1) {
      return 3;
    }
    break;
  case 0x19:
    if (*(int *)&param_1[4].enc_write_ctx != 3) {
      return 2;
    }
    goto switchD_009e6cf4_caseD_1a;
  case 0x21:
    piVar3 = (int *)__errno();
    *piVar3 = 0;
    if (((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) &&
        (iVar2 = param_1->method->version, 0x303 < iVar2)) &&
       ((iVar2 != 0x10000 && (iVar2 = statem_flush(param_1), iVar2 != 1)))) {
      iVar2 = SSL_get_error(param_1,0);
      if (iVar2 != 5) {
        return 3;
      }
      if ((*piVar3 != 0x68) && (*piVar3 != 0x20)) {
        return 3;
      }
      param_1->rwstate = 1;
    }
    break;
  case 0x23:
switchD_009e6cf4_caseD_23:
    if (*(int *)&param_1[3].read_hash == 1) {
      iVar2 = statem_flush(param_1);
      if (iVar2 == 0) {
        return 3;
      }
      return 2;
    }
    p_Var6 = param_1->method->get_timeout;
    if (((((byte)p_Var6[0x60] >> 3 & 1) != 0) || (iVar2 = param_1->method->version, iVar2 < 0x304))
       || (iVar2 == 0x10000)) {
      uVar4 = (**(code **)(p_Var6 + 0x20))(param_1,0x22);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
      if (((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) {
        return 2;
      }
      dtls1_reset_seq_numbers(param_1,2);
      return 2;
    }
    uVar4 = (**(code **)(p_Var6 + 0x10))(param_1);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    uVar4 = (**(code **)(param_1->method->get_timeout + 0x20))(param_1,0xa2);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    if ((param_1[4].packet_length == 2) ||
       (uVar4 = (**(code **)(param_1->method->get_timeout + 0x20))(param_1,0xa1), (int)uVar4 != 0))
    {
      *(undefined4 *)&param_1->s3 = 1;
      return 2;
    }
    return uVar4;
  case 0x24:
    iVar2 = statem_flush(param_1);
    if (iVar2 != 1) {
      return 3;
    }
    p_Var6 = param_1->method->get_timeout;
    if ((((((byte)p_Var6[0x60] >> 3 & 1) == 0) && (iVar2 = param_1->method->version, 0x303 < iVar2))
        && (iVar2 != 0x10000)) &&
       ((iVar2 = (**(code **)(p_Var6 + 0x18))
                           (param_1,&param_1[2].init_off,(undefined1 *)((long)&param_1[2].bbio + 4),
                            0,auStack_28), iVar2 == 0 ||
        (iVar2 = (**(code **)(param_1->method->get_timeout + 0x20))(param_1,0x122), iVar2 == 0)))) {
      return 0;
    }
    break;
  case 0x2a:
    iVar2 = statem_flush(param_1);
    if (iVar2 != 1) {
      return 3;
    }
    uVar4 = tls13_update_key(param_1,1);
    iVar2 = (int)uVar4;
joined_r0x009e6eb0:
    if (iVar2 == 0) {
      return uVar4;
    }
  }
  return 2;
}

