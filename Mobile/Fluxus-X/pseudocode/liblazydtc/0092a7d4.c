/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092a7d4
 */

bool FUN_0092a7d4(uint param_1,FILE *param_2)

{
  int iVar1;
  
  iVar1 = fputc(param_1 & 0xff,param_2);
  return iVar1 == -1;
}

