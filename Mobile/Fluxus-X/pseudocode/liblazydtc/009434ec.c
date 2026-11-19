/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009434ec
 */

undefined8 FUN_009434ec(long param_1,undefined8 param_2,undefined8 param_3,long *param_4)

{
  bool bVar1;
  undefined8 uVar2;
  long lVar3;
  
  if ((param_1 == 0) || (lVar3 = *(long *)(param_1 + 0x20), lVar3 == 0)) {
    uVar2 = 2;
  }
  else {
    if (*(int *)(lVar3 + 0x3cc) == -1) {
      bVar1 = false;
    }
    else {
      bVar1 = *(int *)(lVar3 + 0x3cc) == *(int *)(lVar3 + 0x224);
    }
    uVar2 = FUN_009083b8(param_1,bVar1,param_2,param_3,param_4);
    if ((int)uVar2 == 0) {
      if (*param_4 == 0) {
        uVar2 = 0;
      }
      else {
        uVar2 = 0;
        *(long *)(param_1 + 0x1340) = *(long *)(param_1 + 0x1340) + *param_4;
      }
    }
    else if ((int)uVar2 == 0x51) {
      uVar2 = 0;
      *param_4 = 0;
    }
  }
  return uVar2;
}

