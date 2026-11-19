/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a18e38
 */

void bn_set_all_zero(long *param_1)

{
  int iVar1;
  int iVar2;
  
  iVar1 = (int)param_1[1];
  iVar2 = *(int *)((long)param_1 + 0xc);
  if (iVar1 < iVar2) {
    if (iVar2 <= iVar1 + 1) {
      iVar2 = iVar1 + 1;
    }
    memset((void *)(*param_1 + (long)iVar1 * 8),0,(ulong)(uint)((iVar2 + -1) - iVar1) * 8 + 8);
  }
  return;
}

