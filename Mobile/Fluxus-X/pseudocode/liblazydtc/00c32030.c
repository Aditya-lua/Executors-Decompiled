/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32030
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

uint if_nametoindex(char *__ifname)

{
  uint uVar1;
  
  uVar1 = if_nametoindex(__ifname);
  return uVar1;
}

