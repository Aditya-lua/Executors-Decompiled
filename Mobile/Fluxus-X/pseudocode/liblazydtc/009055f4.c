/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009055f4
 */

void FUN_009055f4(long *param_1,long param_2)

{
  long lVar1;
  
  if ((param_2 == 0) || ((*(byte *)(param_2 + 0xa85) >> 4 & 1) == 0)) {
LAB_00905618:
    if (param_1 == (long *)0x0) {
      return;
    }
  }
  else {
    if (*(long *)(param_2 + 0x12a0) == 0) {
      if (param_1 == (long *)0x0) {
        return;
      }
    }
    else if ((param_1 == (long *)0x0) || (*(int *)(*(long *)(param_2 + 0x12a0) + 8) < 1))
    goto LAB_00905618;
    if (0 < *(int *)(*param_1 + 0xc)) {
      FUN_00904ddc(param_2,param_1,"destroy");
      lVar1 = param_1[2];
      goto joined_r0x00905620;
    }
  }
  lVar1 = param_1[2];
joined_r0x00905620:
  if (lVar1 != 0) {
    if (*(int *)(lVar1 + 0xa8) != 5) {
      if ((((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
          ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8)))))
         && (0 < *(int *)(*param_1 + 0xc))) {
        FUN_00904ddc(param_2,param_1,"new tunnel state \'failed\'");
      }
      *(undefined4 *)(lVar1 + 0xa8) = 5;
      FUN_0090456c(lVar1);
      FUN_0090456c(lVar1 + 0x20);
      *(undefined4 *)(param_2 + 0x1328) = 0;
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_2 + 0x1300));
      *(undefined8 *)(param_2 + 0x1300) = 0;
    }
    FUN_00904534(lVar1);
    FUN_00904534(lVar1 + 0x20);
    FUN_00923494(param_2,lVar1 + 0x50);
    (*(code *)PTR_free_00cc4678)(lVar1);
    param_1[2] = 0;
  }
  return;
}

