/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009eac0c
 */

undefined8 ossl_statem_server_post_process_message(long param_1)

{
  undefined8 uVar1;
  
  if (*(int *)(param_1 + 0x5c) == 0x1c) {
    uVar1 = tls_post_process_client_key_exchange(param_1);
    return uVar1;
  }
  if (*(int *)(param_1 + 0x5c) == 0x14) {
    uVar1 = tls_post_process_client_hello(param_1);
    return uVar1;
  }
  ERR_new();
  ERR_set_debug("ssl/statem/statem_srvr.c",0x4d0,"ossl_statem_server_post_process_message");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return 0;
}

