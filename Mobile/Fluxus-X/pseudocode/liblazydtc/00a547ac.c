/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a547ac
 */

ulong ERR_get_error_line(char **file,int *line)

{
  ulong uVar1;
  
  uVar1 = FUN_00a54484(0,file,line,0,0,0);
  return uVar1;
}

