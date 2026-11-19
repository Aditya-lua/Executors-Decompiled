/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090738c
 */

void FUN_0090738c(long param_1,long param_2,int param_3,long *param_4)

{
  long lVar1;
  long lVar2;
  
  lVar1 = param_2 + (long)param_3 * 8;
  lVar2 = *(long *)(lVar1 + 0x248);
  param_4[3] = param_2;
  *(int *)(param_4 + 4) = param_3;
  param_4[1] = lVar2;
  *(long **)(lVar1 + 0x248) = param_4;
  if ((((param_1 == 0) || ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0)) ||
      ((*(long *)(param_1 + 0x12a0) != 0 && (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1)))) ||
     (*(int *)(*param_4 + 0xc) < 1)) {
    return;
  }
  FUN_00904ddc(param_1,param_4,"added");
  return;
}

