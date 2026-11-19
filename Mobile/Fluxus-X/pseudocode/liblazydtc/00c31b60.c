/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31b60
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int inet_pton(int __af,char *__cp,void *__buf)

{
  int iVar1;
  
  iVar1 = inet_pton(__af,__cp,__buf);
  return iVar1;
}

