/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32420
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ulong ERR_peek_last_error(void)

{
  ulong uVar1;
  
  uVar1 = ERR_peek_last_error();
  return uVar1;
}

