/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54878
 */

ulong ERR_peek_error_line_data(char **file,int *line,char **data,int *flags)

{
  ulong uVar1;
  
  uVar1 = FUN_00a54484(1,file,line,0,data,flags);
  return uVar1;
}

