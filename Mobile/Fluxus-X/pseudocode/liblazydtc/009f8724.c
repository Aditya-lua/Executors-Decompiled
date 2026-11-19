/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f8724
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_INFO * X509_INFO_new(void)

{
  X509_INFO *pXVar1;
  
  pXVar1 = (X509_INFO *)CRYPTO_zalloc(0x40,"crypto/asn1/x_info.c",0x14);
  if (pXVar1 == (X509_INFO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/x_info.c",0x16,"X509_INFO_new");
    ERR_set_error(0xd,0xc0100,0);
    return (X509_INFO *)0x0;
  }
  return pXVar1;
}

