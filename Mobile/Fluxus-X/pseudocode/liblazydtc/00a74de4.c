/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a74de4
 */

EVP_PKEY_METHOD * EVP_PKEY_meth_new(int id,int flags)

{
  EVP_PKEY_METHOD *pEVar1;
  
  pEVar1 = (EVP_PKEY_METHOD *)CRYPTO_zalloc(0x100,"crypto/evp/pmeth_lib.c",0x82);
  if (pEVar1 == (EVP_PKEY_METHOD *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_lib.c",0x84,"EVP_PKEY_meth_new");
    ERR_set_error(6,0xc0100,0);
    pEVar1 = (EVP_PKEY_METHOD *)0x0;
  }
  else {
    *(int *)pEVar1 = id;
    *(uint *)(pEVar1 + 4) = flags | 1;
  }
  return pEVar1;
}

