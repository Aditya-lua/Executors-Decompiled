/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6a20
 */

undefined8 ssl_check_srvr_ecc_cert_and_alg(undefined8 param_1,long param_2)

{
  uint uVar1;
  
  if ((*(byte *)(*(long *)(param_2 + 0x2e0) + 0x20) >> 3 & 1) == 0) {
    return 1;
  }
  uVar1 = X509_get_key_usage();
  if ((uVar1 >> 7 & 1) == 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0xe80,"ssl_check_srvr_ecc_cert_and_alg");
    ERR_set_error(0x14,0x13e,0);
    return 0;
  }
  return 1;
}

