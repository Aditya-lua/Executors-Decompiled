/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32400
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ulong ERR_get_error(void)

{
  ulong uVar1;
  
  uVar1 = ERR_get_error();
  return uVar1;
}

