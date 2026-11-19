/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094187c
 */

bool FUN_0094187c(char *param_1,char *param_2)

{
  int iVar1;
  
  if ((param_1 == (char *)0x0) || (param_2 == (char *)0x0)) {
    return param_1 == (char *)0x0 && param_2 == (char *)0x0;
  }
  iVar1 = strcmp(param_1,param_2);
  return iVar1 == 0;
}

