/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54800
 */

ulong ERR_peek_error_line(char **file,int *line)

{
  ulong uVar1;
  
  uVar1 = FUN_00a54484(1,file,line,0,0,0);
  return uVar1;
}

