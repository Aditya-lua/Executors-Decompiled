/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009843bc
 */

/* ix::inet_pton(int, char const*, void*) */

int ix::inet_pton(int param_1,char *param_2,void *param_3)

{
  int iVar1;
  
  iVar1 = ::inet_pton(param_1,param_2,param_3);
  return iVar1;
}

