/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad30ec
 */

long * ossl_rsa_multip_info_new(void)

{
  long *ptr;
  long lVar1;
  
  ptr = (long *)CRYPTO_zalloc(0x28,"crypto/rsa/rsa_mp.c",0x24);
  if (ptr == (long *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_mp.c",0x25,"ossl_rsa_multip_info_new");
    ERR_set_error(4,0xc0100,0);
  }
  else {
    lVar1 = BN_secure_new();
    *ptr = lVar1;
    if (lVar1 != 0) {
      lVar1 = BN_secure_new();
      ptr[1] = lVar1;
      if (lVar1 != 0) {
        lVar1 = BN_secure_new();
        ptr[2] = lVar1;
        if (lVar1 != 0) {
          lVar1 = BN_secure_new();
          ptr[3] = lVar1;
          if (lVar1 != 0) {
            return ptr;
          }
        }
      }
    }
    BN_free((BIGNUM *)*ptr);
    BN_free((BIGNUM *)ptr[1]);
    BN_free((BIGNUM *)ptr[2]);
    BN_free((BIGNUM *)ptr[3]);
    CRYPTO_free(ptr);
  }
  return (long *)0x0;
}

