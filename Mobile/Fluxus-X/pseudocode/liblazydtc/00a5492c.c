/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5492c
 */

ulong ERR_peek_last_error_line_data(char **file,int *line,char **data,int *flags)

{
  ulong uVar1;
  
  uVar1 = FUN_00a54484(2,file,line,0,data,flags);
  return uVar1;
}

