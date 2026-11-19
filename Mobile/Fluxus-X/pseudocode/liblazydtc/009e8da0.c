/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e8da0
 */

undefined8 ossl_statem_server_process_message(long param_1)

{
  undefined8 uVar1;
  
  switch(*(undefined4 *)(param_1 + 0x5c)) {
  case 0x14:
    uVar1 = tls_process_client_hello(param_1);
    return uVar1;
  default:
    ERR_new();
    ERR_set_debug("ssl/statem/statem_srvr.c",0x4a2,"ossl_statem_server_process_message");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    return 0;
  case 0x1b:
    uVar1 = tls_process_client_certificate(param_1);
    return uVar1;
  case 0x1c:
    uVar1 = tls_process_client_key_exchange(param_1);
    return uVar1;
  case 0x1d:
    uVar1 = tls_process_cert_verify(param_1);
    return uVar1;
  case 0x1e:
    uVar1 = tls_process_next_proto(param_1);
    return uVar1;
  case 0x1f:
    uVar1 = tls_process_change_cipher_spec(param_1);
    return uVar1;
  case 0x20:
    uVar1 = tls_process_finished(param_1);
    return uVar1;
  case 0x2c:
    uVar1 = tls_process_key_update(param_1);
    return uVar1;
  case 0x31:
    uVar1 = tls_process_end_of_early_data(param_1);
    return uVar1;
  }
}

