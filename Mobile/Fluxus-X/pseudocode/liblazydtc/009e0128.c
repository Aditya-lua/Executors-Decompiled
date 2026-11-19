/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e0128
 */

undefined8 ossl_statem_client_post_process_message(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = *(int *)(param_1 + 0x5c);
  if ((iVar1 == 0x27) || (iVar1 == 7)) {
    uVar2 = tls_prepare_client_certificate(param_1);
    return uVar2;
  }
  if (iVar1 == 4) {
    uVar2 = tls_post_process_server_certificate(param_1);
    return uVar2;
  }
  ERR_new();
  ERR_set_debug("ssl/statem/statem_clnt.c",0x439,"ossl_statem_client_post_process_message");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return 0;
}

