/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00842c2c
 */

long FUN_00842c2c(long param_1,long param_2,undefined8 param_3)

{
  int iVar1;
  bool bVar2;
  long lVar3;
  undefined8 uVar4;
  
  do {
    lVar3 = FUN_00842d60(param_1,param_2,param_3);
    if (lVar3 == param_2) {
      uVar4 = *(undefined8 *)(param_1 + 0x38);
      iVar1 = *(int *)(param_1 + 0x1c);
      lVar3 = FUN_008430a0(param_1,param_2,param_3);
      if (lVar3 == param_2) {
        return param_2;
      }
      lVar3 = FUN_00843334(param_1,lVar3,param_3,uVar4,iVar1 + 1,*(int *)(param_1 + 0x1c) + 1);
    }
    bVar2 = lVar3 != param_2;
    param_2 = lVar3;
  } while (bVar2);
  return lVar3;
}

