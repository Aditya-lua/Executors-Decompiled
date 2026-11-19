/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e6fb0
 */

undefined8
ossl_statem_server_construct_message
          (long param_1,undefined8 param_2,undefined8 *param_3,undefined4 *param_4)

{
  code *pcVar1;
  undefined4 uVar2;
  
  switch(*(undefined4 *)(param_1 + 0x5c)) {
  case 0x13:
    *param_3 = 0;
    *param_4 = 0;
    return 1;
  default:
    ERR_new();
    ERR_set_debug("ssl/statem/statem_srvr.c",0x401,"ossl_statem_server_construct_message");
    ossl_statem_fatal(param_1,0x50,0xec,0);
    return 0;
  case 0x15:
    pcVar1 = dtls_construct_hello_verify_request;
    uVar2 = 3;
    break;
  case 0x16:
    pcVar1 = tls_construct_server_hello;
    uVar2 = 2;
    break;
  case 0x17:
    pcVar1 = tls_construct_server_certificate;
    uVar2 = 0xb;
    break;
  case 0x18:
    pcVar1 = tls_construct_server_key_exchange;
    uVar2 = 0xc;
    break;
  case 0x19:
    pcVar1 = tls_construct_certificate_request;
    uVar2 = 0xd;
    break;
  case 0x1a:
    pcVar1 = tls_construct_server_done;
    uVar2 = 0xe;
    break;
  case 0x21:
    pcVar1 = tls_construct_new_session_ticket;
    uVar2 = 4;
    break;
  case 0x22:
    pcVar1 = tls_construct_cert_status;
    uVar2 = 0x16;
    break;
  case 0x23:
    pcVar1 = tls_construct_change_cipher_spec;
    if ((*(uint *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) & 8) != 0) {
      pcVar1 = dtls_construct_change_cipher_spec;
    }
    *param_3 = pcVar1;
    *param_4 = 0x101;
    return 1;
  case 0x24:
    pcVar1 = tls_construct_finished;
    uVar2 = 0x14;
    break;
  case 0x25:
    pcVar1 = FUN_009e8d10;
    uVar2 = 8;
    break;
  case 0x28:
    pcVar1 = tls_construct_cert_verify;
    uVar2 = 0xf;
    break;
  case 0x2a:
    pcVar1 = tls_construct_key_update;
    uVar2 = 0x18;
    break;
  case 0x2e:
    *param_3 = 0;
    *param_4 = 0xffffffff;
    return 1;
  }
  *param_3 = pcVar1;
  *param_4 = uVar2;
  return 1;
}

