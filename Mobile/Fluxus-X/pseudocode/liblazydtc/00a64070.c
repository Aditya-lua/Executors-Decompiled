/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a64070
 */

long * EVP_KDF_CTX_dup(long *param_1)

{
  int iVar1;
  long *ptr;
  long lVar2;
  
  if (((param_1 != (long *)0x0) && (param_1[1] != 0)) && (*(long *)(*param_1 + 0x38) != 0)) {
    ptr = CRYPTO_malloc(0x10,"crypto/evp/kdf_lib.c",0x3e);
    if (ptr == (long *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/evp/kdf_lib.c",0x40,"EVP_KDF_CTX_dup");
      ERR_set_error(6,0xc0100,0);
      return (long *)0x0;
    }
    lVar2 = *param_1;
    ptr[1] = param_1[1];
    *ptr = lVar2;
    iVar1 = EVP_KDF_up_ref(*ptr);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/kdf_lib.c",0x46,"EVP_KDF_CTX_dup");
      ERR_set_error(6,0xc0100,0);
    }
    else {
      lVar2 = (**(code **)(*param_1 + 0x38))(param_1[1]);
      ptr[1] = lVar2;
      if (lVar2 != 0) {
        return ptr;
      }
      (**(code **)(*ptr + 0x40))();
      ptr[1] = 0;
      EVP_KDF_free(*ptr);
    }
    CRYPTO_free(ptr);
  }
  return (long *)0x0;
}

