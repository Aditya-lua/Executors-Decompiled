/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00850840
 */

undefined1  [16] FUN_00850840(long param_1)

{
  long lVar1;
  
  lVar1 = 0xc;
  if (*(int *)(param_1 + 0x40) != 0) {
    lVar1 = 8;
  }
  return *(undefined1 (*) [16])(*(long *)(param_1 + 0x20) + lVar1);
}

