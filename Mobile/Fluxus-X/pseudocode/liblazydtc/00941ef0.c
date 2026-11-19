/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941ef0
 */

undefined8 FUN_00941ef0(long param_1,long param_2)

{
  undefined8 uVar1;
  char *pcVar2;
  long lVar3;
  
  if ((param_2 == 0) || (lVar3 = *(long *)(param_1 + 0x520), lVar3 == 0)) {
LAB_00941f50:
    uVar1 = 1;
  }
  else {
    if (*(char *)(param_1 + 0x528) == '\x02') {
      if (param_2 < lVar3) goto LAB_00941f50;
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        pcVar2 = "The requested document is not old enough";
LAB_00941f84:
        FUN_00904c98(param_1,pcVar2);
      }
    }
    else {
      if (lVar3 < param_2) goto LAB_00941f50;
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        pcVar2 = "The requested document is not new enough";
        goto LAB_00941f84;
      }
    }
    uVar1 = 0;
    *(byte *)(param_1 + 0x140c) = *(byte *)(param_1 + 0x140c) | 1;
  }
  return uVar1;
}

