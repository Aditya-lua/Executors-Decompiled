/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b13d14
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_VERIFY_PARAM * X509_VERIFY_PARAM_new(void)

{
  X509_VERIFY_PARAM *pXVar1;
  
  pXVar1 = (X509_VERIFY_PARAM *)CRYPTO_zalloc(0x70,"crypto/x509/x509_vpm.c",0x56);
  if (pXVar1 == (X509_VERIFY_PARAM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vpm.c",0x58,"X509_VERIFY_PARAM_new");
    ERR_set_error(0xb,0xc0100,0);
    return (X509_VERIFY_PARAM *)0x0;
  }
  pXVar1->trust = 0;
  pXVar1->depth = -1;
  *(undefined4 *)&pXVar1->field_0x2c = 0xffffffff;
  return pXVar1;
}

