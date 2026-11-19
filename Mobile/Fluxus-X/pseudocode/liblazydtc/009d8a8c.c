/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d8a8c
 */

bool tls_parse_ctos_post_handshake_auth(long param_1,long param_2)

{
  bool bVar1;
  
  bVar1 = *(long *)(param_2 + 8) == 0;
  if (bVar1) {
    *(undefined4 *)(param_1 + 0xba8) = 2;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/extensions_srvr.c",0x4ca,"tls_parse_ctos_post_handshake_auth");
    ossl_statem_fatal(param_1,0x32,0x116,0);
  }
  return bVar1;
}

