/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31bd0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

char * inet_ntop(int __af,void *__cp,char *__buf,socklen_t __len)

{
  char *pcVar1;
  
  pcVar1 = inet_ntop(__af,__cp,__buf,__len);
  return pcVar1;
}

