/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009dd960
 */

ulong ossl_statem_client_process_message(long param_1,long *param_2)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  uint uVar5;
  long lVar6;
  undefined1 *puVar7;
  ulong __n;
  void *local_38;
  undefined1 *local_30;
  ulong uStack_28;
  
  switch(*(undefined4 *)(param_1 + 0x5c)) {
  case 2:
    uVar2 = param_2[1];
    if (1 < uVar2) {
      lVar6 = *param_2;
      *param_2 = lVar6 + 2;
      param_2[1] = uVar2 - 2;
      if (uVar2 - 2 != 0) {
        __n = (ulong)*(byte *)(lVar6 + 2);
        if (__n <= uVar2 - 3) {
          *param_2 = lVar6 + 3 + __n;
          param_2[1] = (uVar2 - 3) - __n;
          memcpy(*(void **)(param_1 + 0x4b8),(void *)(lVar6 + 3),__n);
          *(ulong *)(*(long *)(param_1 + 0x4b8) + 0x100) = __n;
          return 1;
        }
      }
    }
    ERR_new();
    ERR_set_debug("ssl/statem/statem_clnt.c",0x505,"dtls_process_hello_verify");
    uVar3 = 0x32;
    uVar4 = 0x9f;
    break;
  case 3:
    uVar2 = tls_process_server_hello(param_1);
    return uVar2;
  case 4:
    uVar2 = tls_process_server_certificate(param_1);
    return uVar2;
  case 5:
    iVar1 = tls_process_cert_status_body(param_1);
    uVar5 = 0;
    if (iVar1 != 0) {
      uVar5 = 3;
    }
    return (ulong)uVar5;
  case 6:
    uVar2 = tls_process_key_exchange(param_1);
    return uVar2;
  case 7:
    uVar2 = tls_process_certificate_request(param_1);
    return uVar2;
  case 8:
    uVar2 = tls_process_server_done(param_1);
    return uVar2;
  case 9:
    uVar2 = tls_process_new_session_ticket(param_1);
    return uVar2;
  case 10:
    uVar2 = tls_process_change_cipher_spec(param_1);
    return uVar2;
  case 0xb:
    uVar2 = tls_process_finished(param_1);
    return uVar2;
  default:
    ERR_new();
    ERR_set_debug("ssl/statem/statem_clnt.c",0x3ff,"ossl_statem_client_process_message");
    uVar3 = 0x50;
    uVar4 = 0xc0103;
    break;
  case 0x26:
    local_38 = (void *)0x0;
    if (1 < (ulong)param_2[1]) {
      puVar7 = (undefined1 *)*param_2;
      uVar2 = (ulong)CONCAT11(*puVar7,puVar7[1]);
      if (param_2[1] - 2U == uVar2) {
        local_30 = puVar7 + 2;
        *param_2 = (long)(local_30 + uVar2);
        param_2[1] = 0;
        uStack_28 = uVar2;
        iVar1 = tls_collect_extensions(param_1,&local_30,0x400,&local_38,0,1);
        if ((iVar1 != 0) &&
           (iVar1 = tls_parse_all_extensions(param_1,0x400,local_38,0,0,1), iVar1 != 0)) {
          CRYPTO_free(local_38);
          return 3;
        }
        goto LAB_009ddbe0;
      }
    }
    ERR_new();
    ERR_set_debug("ssl/statem/statem_clnt.c",0xe35,"tls_process_encrypted_extensions");
    ossl_statem_fatal(param_1,0x32,0x9f,0);
LAB_009ddbe0:
    CRYPTO_free(local_38);
    return 0;
  case 0x27:
    uVar2 = tls_process_cert_verify(param_1);
    return uVar2;
  case 0x29:
    uVar2 = tls_process_hello_req(param_1);
    return uVar2;
  case 0x2d:
    uVar2 = tls_process_key_update(param_1);
    return uVar2;
  }
  ossl_statem_fatal(param_1,uVar3,uVar4,0);
  return 0;
}

