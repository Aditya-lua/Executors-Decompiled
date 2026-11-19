/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a999e8
 */

void * CRYPTO_zalloc(size_t param_1)

{
  void *__s;
  
  if ((code *)PTR_CRYPTO_malloc_00cc9138 == CRYPTO_malloc) {
    if (param_1 == 0) {
      return (void *)0x0;
    }
    if ((DAT_00d220e8 & 1) == 0) {
      DAT_00d220e8 = 1;
    }
    __s = malloc(param_1);
  }
  else {
    __s = (void *)(*(code *)PTR_CRYPTO_malloc_00cc9138)(param_1);
  }
  if (__s != (void *)0x0) {
    memset(__s,0,param_1);
  }
  return __s;
}

