/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9b4ec
 */

void * CRYPTO_strndup(char *param_1,long param_2,char *param_3,int param_4)

{
  void *__dest;
  char *pcVar1;
  size_t __n;
  
  if (param_1 == (char *)0x0) {
    __dest = (void *)0x0;
  }
  else {
    pcVar1 = param_1;
    if (param_2 != 0) {
      do {
        if (*pcVar1 == '\0') break;
        param_2 = param_2 + -1;
        pcVar1 = pcVar1 + 1;
      } while (param_2 != 0);
    }
    __n = (long)pcVar1 - (long)param_1;
    __dest = CRYPTO_malloc((int)__n + 1,param_3,param_4);
    if (__dest != (void *)0x0) {
      memcpy(__dest,param_1,__n);
      *(undefined1 *)((long)__dest + __n) = 0;
    }
  }
  return __dest;
}

