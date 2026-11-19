/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2b7b8
 */

ulong FUN_00c2b7b8(ulong param_1)

{
  uint uVar1;
  
  if (DAT_00d280a0 == '\x01') {
    uVar1 = pthread_key_delete(DAT_00d280a4);
    param_1 = (ulong)uVar1;
    DAT_00d280a0 = '\0';
  }
  return param_1;
}

