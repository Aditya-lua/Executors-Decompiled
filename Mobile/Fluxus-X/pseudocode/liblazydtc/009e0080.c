/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e0080
 */

undefined8 tls_process_hello_req(SSL *param_1,long param_2)

{
  undefined8 uVar1;
  
  if (*(long *)(param_2 + 8) == 0) {
    if ((*(byte *)((long)&param_1[3].tlsext_debug_cb + 3) >> 6 & 1) == 0) {
      if (((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) {
        SSL_renegotiate_abbreviated(param_1);
      }
      else {
        SSL_renegotiate(param_1);
      }
      uVar1 = 1;
    }
    else {
      uVar1 = 1;
      ssl3_send_alert(param_1,1,100);
    }
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_clnt.c",0xe16,"tls_process_hello_req");
    ossl_statem_fatal(param_1,0x32,0x9f,0);
    uVar1 = 0;
  }
  return uVar1;
}

