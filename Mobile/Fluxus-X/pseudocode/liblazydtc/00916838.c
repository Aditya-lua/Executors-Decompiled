/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00916838
 */

void FUN_00916838(long *param_1)

{
  long lVar1;
  ulong uVar2;
  
  lVar1 = *param_1;
  if (lVar1 != 0) {
    if (param_1[4] != 0) {
      FUN_00925e04(lVar1,param_1);
      if (1 < (ulong)param_1[4]) {
        uVar2 = 1;
        lVar1 = 0x20;
        do {
          FUN_00925e04(*param_1 + lVar1,param_1);
          uVar2 = uVar2 + 1;
          lVar1 = lVar1 + 0x20;
        } while (uVar2 < (ulong)param_1[4]);
      }
      lVar1 = *param_1;
    }
    (*(code *)PTR_free_00cc4678)(lVar1);
    *param_1 = 0;
  }
  param_1[4] = 0;
  param_1[5] = 0;
  return;
}

