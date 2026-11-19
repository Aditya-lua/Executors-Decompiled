/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009077cc
 */

byte FUN_009077cc(long param_1,int param_2)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + (long)param_2 * 8 + 0x248);
  if (lVar1 == 0) {
    return 0;
  }
  return *(byte *)(lVar1 + 0x24) & 1;
}

