/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00934a74
 */

void FUN_00934a74(long *param_1,long param_2,int param_3)

{
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  if ((param_2 != 0) && (param_3 != 0)) {
    *param_1 = param_2;
    *(int *)((long)param_1 + 0xc) = param_3;
  }
  return;
}

