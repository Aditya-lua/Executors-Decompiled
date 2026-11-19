/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8b64
 */

undefined8
ssl_log_rsa_client_key_exchange
          (undefined8 param_1,undefined8 param_2,ulong param_3,undefined8 param_4,undefined8 param_5
          )

{
  undefined8 uVar1;
  
  if (param_3 < 8) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x15c9,"ssl_log_rsa_client_key_exchange");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    return 0;
  }
  uVar1 = FUN_009b8bec(&DAT_002db996,param_1,param_2,8,param_4,param_5);
  return uVar1;
}

