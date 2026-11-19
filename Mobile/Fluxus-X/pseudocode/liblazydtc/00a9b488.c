/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9b488
 */

char * CRYPTO_strdup(char *str,char *file,int line)

{
  size_t sVar1;
  char *__dest;
  
  if (str == (char *)0x0) {
    __dest = (char *)0x0;
  }
  else {
    sVar1 = strlen(str);
    __dest = CRYPTO_malloc((int)sVar1 + 1,file,line);
    if (__dest != (char *)0x0) {
      strcpy(__dest,str);
    }
  }
  return __dest;
}

