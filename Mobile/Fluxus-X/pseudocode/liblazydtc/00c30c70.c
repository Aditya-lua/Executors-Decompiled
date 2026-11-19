/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c30c70
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int vprintf(char *__format,__gnuc_va_list __arg)

{
  int iVar1;
  
  iVar1 = vprintf(__format,__arg);
  return iVar1;
}

