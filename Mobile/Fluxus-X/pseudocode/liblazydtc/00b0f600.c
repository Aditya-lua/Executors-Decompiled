/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f600
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_STORE_CTX * X509_STORE_CTX_new(void)

{
  X509_STORE_CTX *pXVar1;
  
  pXVar1 = (X509_STORE_CTX *)CRYPTO_zalloc(0x110,"crypto/x509/x509_vfy.c",0x8ec);
  if (pXVar1 == (X509_STORE_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vfy.c",0x8ef,"X509_STORE_CTX_new_ex");
    ERR_set_error(0xb,0xc0100,0);
    return (X509_STORE_CTX *)0x0;
  }
  *(undefined8 *)&pXVar1[1].current_method = 0;
  return pXVar1;
}

