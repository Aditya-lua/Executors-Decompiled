/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a9cc
 */

undefined4 * X509_OBJECT_new(void)

{
  undefined4 *puVar1;
  
  puVar1 = (undefined4 *)CRYPTO_zalloc(0x10,"crypto/x509/x509_lu.c",0x1c0);
  if (puVar1 == (undefined4 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_lu.c",0x1c3,"X509_OBJECT_new");
    ERR_set_error(0xb,0xc0100,0);
    return (undefined4 *)0x0;
  }
  *puVar1 = 0;
  return puVar1;
}

