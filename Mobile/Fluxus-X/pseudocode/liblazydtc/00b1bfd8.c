/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1bfd8
 */

undefined8 FUN_00b1bfd8(undefined8 *param_1)

{
  long *ptr;
  long lVar1;
  BUF_MEM *pBVar2;
  
  ptr = (long *)CRYPTO_zalloc(0x28,"crypto/x509/x_name.c",0x5c);
  if (ptr == (long *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_name.c",0x69,"x509_name_ex_new");
    ERR_set_error(0xd,0xc0100,0);
  }
  else {
    lVar1 = OPENSSL_sk_new_null();
    *ptr = lVar1;
    if (lVar1 != 0) {
      pBVar2 = BUF_MEM_new();
      ptr[2] = (long)pBVar2;
      if (pBVar2 != (BUF_MEM *)0x0) {
        *(undefined4 *)(ptr + 1) = 1;
        *param_1 = ptr;
        return 1;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/x509/x_name.c",0x69,"x509_name_ex_new");
    ERR_set_error(0xd,0xc0100,0);
    OPENSSL_sk_free(*ptr);
    CRYPTO_free(ptr);
  }
  return 0;
}

