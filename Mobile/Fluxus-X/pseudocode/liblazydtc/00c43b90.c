/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43b90
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int vsscanf(char *__s,char *__format,__gnuc_va_list __arg)

{
  int iVar1;
  
  iVar1 = vsscanf(__s,__format,__arg);
  return iVar1;
}

