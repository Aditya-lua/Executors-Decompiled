/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009dbc20
 */

undefined8
ossl_statem_client_construct_message
          (long param_1,undefined8 param_2,undefined8 *param_3,undefined4 *param_4)

{
  code *pcVar1;
  undefined4 uVar2;
  
  switch(*(undefined4 *)(param_1 + 0x5c)) {
  case 0xc:
    *param_3 = tls_construct_client_hello;
    *param_4 = 1;
    return 1;
  case 0xd:
    pcVar1 = tls_construct_client_certificate;
    uVar2 = 0xb;
    break;
  case 0xe:
    pcVar1 = tls_construct_client_key_exchange;
    uVar2 = 0x10;
    break;
  case 0xf:
    pcVar1 = tls_construct_cert_verify;
    uVar2 = 0xf;
    break;
  case 0x10:
    pcVar1 = tls_construct_change_cipher_spec;
    if ((*(uint *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) & 8) != 0) {
      pcVar1 = dtls_construct_change_cipher_spec;
    }
    *param_3 = pcVar1;
    *param_4 = 0x101;
    return 1;
  case 0x11:
    pcVar1 = tls_construct_next_proto;
    uVar2 = 0x43;
    break;
  case 0x12:
    pcVar1 = tls_construct_finished;
    uVar2 = 0x14;
    break;
  default:
    ERR_new();
    ERR_set_debug("ssl/statem/statem_clnt.c",0x37a,"ossl_statem_client_construct_message");
    ossl_statem_fatal(param_1,0x50,0xec,0);
    return 0;
  case 0x2b:
    pcVar1 = tls_construct_key_update;
    uVar2 = 0x18;
    break;
  case 0x2f:
    *param_3 = 0;
    *param_4 = 0xffffffff;
    return 1;
  case 0x30:
    pcVar1 = tls_construct_end_of_early_data;
    uVar2 = 5;
  }
  *param_3 = pcVar1;
  *param_4 = uVar2;
  return 1;
}

