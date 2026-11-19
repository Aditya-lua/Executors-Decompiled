/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932700
 */

bool FUN_00932700(char *param_1,char *param_2)

{
  int iVar1;
  
  iVar1 = rename(param_1,param_2);
  return iVar1 != 0;
}

