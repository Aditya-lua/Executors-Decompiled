/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b40c
 */

undefined4 *
X509_CRL_METHOD_new(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined4 *puVar1;
  
  puVar1 = CRYPTO_malloc(0x28,"crypto/x509/x_crl.c",0x1e9);
  if (puVar1 == (undefined4 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_crl.c",0x1ec,"X509_CRL_METHOD_new");
    ERR_set_error(0xb,0xc0100,0);
    puVar1 = (undefined4 *)0x0;
  }
  else {
    *(undefined8 *)(puVar1 + 2) = param_1;
    *(undefined8 *)(puVar1 + 4) = param_2;
    *(undefined8 *)(puVar1 + 6) = param_3;
    *(undefined8 *)(puVar1 + 8) = param_4;
    *puVar1 = 1;
  }
  return puVar1;
}

