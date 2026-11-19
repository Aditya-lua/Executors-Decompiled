/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae7484
 */

long * SRP_VBASE_new(char *param_1)

{
  long *ptr;
  long lVar1;
  long lVar2;
  char *pcVar3;
  
  ptr = CRYPTO_malloc(0x28,"crypto/srp/srp_vfy.c",0x118);
  if (ptr == (long *)0x0) {
    return (long *)0x0;
  }
  lVar1 = OPENSSL_sk_new_null();
  *ptr = lVar1;
  lVar2 = 0;
  if (lVar1 != 0) {
    lVar2 = OPENSSL_sk_new_null();
    ptr[1] = lVar2;
    if (lVar2 != 0) {
      ptr[2] = 0;
      ptr[3] = 0;
      ptr[4] = 0;
      if (param_1 == (char *)0x0) {
        return ptr;
      }
      pcVar3 = CRYPTO_strdup(param_1,"crypto/srp/srp_vfy.c",0x125);
      ptr[2] = (long)pcVar3;
      if (pcVar3 != (char *)0x0) {
        return ptr;
      }
      OPENSSL_sk_free(*ptr);
      OPENSSL_sk_free(ptr[1]);
      goto LAB_00ae7524;
    }
    lVar2 = *ptr;
  }
  OPENSSL_sk_free(lVar2);
LAB_00ae7524:
  CRYPTO_free(ptr);
  return (long *)0x0;
}

