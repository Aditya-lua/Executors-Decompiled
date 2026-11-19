/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cbf8c
 */

long FUN_008cbf8c(long param_1,long param_2,long param_3)

{
  int iVar1;
  long lVar2;
  long lVar3;
  
  if ((param_2 == 0) || (*(char *)(param_2 + 6) < '\0')) {
    return 0;
  }
  if ((*(byte *)(param_2 + 7) >> 1 & 1) == 0) {
    lVar2 = FUN_008bdfe0(param_2,7,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x370));
    if (lVar2 == 0) {
      return 0;
    }
  }
  else {
    lVar2 = *(long *)(param_2 + 0x20) + -0x80;
  }
  if (param_2 == param_3) {
    return lVar2;
  }
  if ((param_3 == 0) || (*(char *)(param_3 + 6) < '\0')) {
LAB_008cc044:
    lVar3 = 0;
  }
  else {
    if ((*(byte *)(param_3 + 7) >> 1 & 1) == 0) {
      lVar3 = FUN_008bdfe0(param_3,7,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x370));
      if (lVar3 == 0) goto LAB_008cc044;
    }
    else {
      lVar3 = *(long *)(param_3 + 0x20) + -0x80;
    }
    iVar1 = FUN_008b9214(lVar2,lVar3);
    lVar3 = 0;
    if (iVar1 != 0) {
      lVar3 = lVar2;
    }
  }
  return lVar3;
}

