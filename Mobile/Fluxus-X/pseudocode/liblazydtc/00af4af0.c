/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4af0
 */

undefined8 X509V3_set_issuer_pkey(long param_1,long param_2)

{
  undefined4 uVar1;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_conf.c",0x1d3,"X509V3_set_issuer_pkey");
    uVar1 = 0xc0102;
  }
  else {
    if ((param_2 == 0) || (*(long *)(param_1 + 0x10) != 0)) {
      *(long *)(param_1 + 0x38) = param_2;
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/x509/v3_conf.c",0x1d7,"X509V3_set_issuer_pkey");
    uVar1 = 0x80106;
  }
  ERR_set_error(0x22,uVar1,0);
  return 0;
}

