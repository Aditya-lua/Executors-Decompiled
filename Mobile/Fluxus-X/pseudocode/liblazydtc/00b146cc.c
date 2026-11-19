/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b146cc
 */

undefined8 X509_VERIFY_PARAM_get1_ip_asc(long param_1)

{
  undefined8 uVar1;
  
  if ((param_1 == 0) || (*(long *)(param_1 + 0x60) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vpm.c",0x1c0,"int_X509_VERIFY_PARAM_get0_ip");
    ERR_set_error(0xb,0xc0102,0);
    return 0;
  }
  uVar1 = ossl_ipaddr_to_asc(*(long *)(param_1 + 0x60),*(undefined4 *)(param_1 + 0x68));
  return uVar1;
}

