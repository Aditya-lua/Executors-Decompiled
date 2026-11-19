/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c3a1c
 */

long * ssl_hmac_new(undefined8 *param_1)

{
  int iVar1;
  long *ptr;
  long lVar2;
  long lVar3;
  
  ptr = (long *)CRYPTO_zalloc(0x10,"ssl/t1_lib.c",0xd54);
  if (ptr != (long *)0x0) {
    if ((param_1[0x49] == 0) && (param_1[0x48] != 0)) {
      iVar1 = ssl_hmac_old_new(ptr);
      if (iVar1 != 0) {
        return ptr;
      }
      lVar2 = 0;
    }
    else {
      lVar2 = EVP_MAC_fetch(*param_1,&DAT_002c35d3,param_1[0x88]);
      if (lVar2 != 0) {
        lVar3 = EVP_MAC_CTX_new(lVar2);
        *ptr = lVar3;
        if (lVar3 != 0) {
          EVP_MAC_free(lVar2);
          return ptr;
        }
      }
    }
    EVP_MAC_CTX_free(*ptr);
    EVP_MAC_free(lVar2);
    CRYPTO_free(ptr);
  }
  return (long *)0x0;
}

