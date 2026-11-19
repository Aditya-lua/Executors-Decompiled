/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094358c
 */

undefined8 FUN_0094358c(long param_1,undefined8 param_2,ulong param_3,undefined8 param_4)

{
  ulong uVar1;
  uint uVar2;
  bool bVar3;
  undefined8 uVar4;
  long lVar5;
  
  if ((param_1 == 0) || (lVar5 = *(long *)(param_1 + 0x20), lVar5 == 0)) {
    return 2;
  }
  if (*(int *)(lVar5 + 0x3c8) == -1) {
    bVar3 = false;
  }
  else {
    bVar3 = *(int *)(lVar5 + 0x3c8) == *(int *)(lVar5 + 0x224);
  }
  uVar2 = *(uint *)(param_1 + 0x6e4);
  uVar1 = (ulong)uVar2;
  if (param_3 <= uVar2) {
    uVar1 = param_3;
  }
  if (uVar2 != 0) {
    param_3 = uVar1;
  }
  uVar4 = FUN_00908350(param_1,bVar3,param_2,param_3,param_4);
  return uVar4;
}

