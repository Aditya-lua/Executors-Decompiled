/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b54068
 */

undefined8 * FUN_00b54068(undefined8 param_1)

{
  int iVar1;
  undefined8 *ptr;
  EVP_CIPHER_CTX *pEVar2;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 != 0) {
    ptr = (undefined8 *)CRYPTO_zalloc(0x28,"providers/implementations/macs/gmac_prov.c",0x41);
    if (ptr == (undefined8 *)0x0) {
      return (undefined8 *)0x0;
    }
    pEVar2 = EVP_CIPHER_CTX_new();
    ptr[1] = pEVar2;
    if (pEVar2 != (EVP_CIPHER_CTX *)0x0) {
      *ptr = param_1;
      return ptr;
    }
    EVP_CIPHER_CTX_free((EVP_CIPHER_CTX *)0x0);
    ossl_prov_cipher_reset(ptr + 2);
    CRYPTO_free(ptr);
  }
  return (undefined8 *)0x0;
}

