/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca4c8
 */

long * ossl_rand_pool_new(int param_1,int param_2,ulong param_3,ulong param_4)

{
  ulong uVar1;
  ulong uVar2;
  long *ptr;
  long lVar3;
  
  ptr = (long *)CRYPTO_zalloc(0x40,"crypto/rand/rand_pool.c",0x19);
  uVar1 = 0x10;
  if (param_2 == 0) {
    uVar1 = 0x30;
  }
  if (ptr == (long *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/rand/rand_pool.c",0x1d,"ossl_rand_pool_new");
    ERR_set_error(0x24,0xc0100,0);
  }
  else {
    if (0x2fff < param_4) {
      param_4 = 0x3000;
    }
    if (uVar1 <= param_3) {
      uVar1 = param_3;
    }
    uVar2 = param_4;
    if (uVar1 <= param_4) {
      uVar2 = uVar1;
    }
    ptr[3] = param_3;
    ptr[4] = param_4;
    ptr[5] = uVar2;
    if (param_2 == 0) {
      lVar3 = CRYPTO_zalloc(uVar2,"crypto/rand/rand_pool.c",0x2b);
      *ptr = lVar3;
    }
    else {
      lVar3 = CRYPTO_secure_zalloc(uVar2,"crypto/rand/rand_pool.c",0x29);
      *ptr = lVar3;
    }
    if (lVar3 == 0) {
      ERR_new();
      ERR_set_debug("crypto/rand/rand_pool.c",0x2e,"ossl_rand_pool_new");
      ERR_set_error(0x24,0xc0100,0);
      CRYPTO_free(ptr);
      ptr = (long *)0x0;
    }
    else {
      ptr[7] = (long)param_1;
      *(int *)((long)ptr + 0x14) = param_2;
    }
  }
  return ptr;
}

