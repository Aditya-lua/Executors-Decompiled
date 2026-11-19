/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7fc70
 */

long * OPENSSL_LH_new(code *param_1,code *param_2)

{
  code *pcVar1;
  code *pcVar2;
  long *ptr;
  long lVar3;
  
  ptr = (long *)CRYPTO_zalloc(0x48,"crypto/lhash/lhash.c",0x33);
  if (ptr != (long *)0x0) {
    lVar3 = CRYPTO_zalloc(0x80,"crypto/lhash/lhash.c",0x3b);
    *ptr = lVar3;
    if (lVar3 == 0) {
      CRYPTO_free((void *)0x0);
      CRYPTO_free(ptr);
      ptr = (long *)0x0;
    }
    else {
      *(undefined4 *)((long)ptr + 0x24) = 8;
      ptr[3] = 0x1000000008;
      pcVar1 = strcmp;
      if (param_2 != (code *)0x0) {
        pcVar1 = param_2;
      }
      pcVar2 = OPENSSL_LH_strhash;
      if (param_1 != (code *)0x0) {
        pcVar2 = param_1;
      }
      ptr[1] = (long)pcVar1;
      ptr[2] = (long)pcVar2;
      ptr[6] = 0x100;
      ptr[5] = 0x200;
    }
  }
  return ptr;
}

