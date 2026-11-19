/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c35240
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int ERR_pop_to_mark(void)

{
  int iVar1;
  
  iVar1 = ERR_pop_to_mark();
  return iVar1;
}

