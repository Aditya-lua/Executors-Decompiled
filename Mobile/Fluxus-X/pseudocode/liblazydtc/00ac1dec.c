/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac1dec
 */

undefined8 FUN_00ac1dec(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  
  uVar2 = 0;
  if ((param_1 != 0) && (lVar1 = BIO_get_data(), uVar2 = 0, lVar1 != 0)) {
    EVP_CIPHER_CTX_free(*(EVP_CIPHER_CTX **)(lVar1 + 0x18));
    CRYPTO_clear_free(lVar1,0x1150,"crypto/evp/bio_enc.c",99);
    BIO_set_data(param_1,0);
    BIO_set_init(param_1,0);
    uVar2 = 1;
  }
  return uVar2;
}

