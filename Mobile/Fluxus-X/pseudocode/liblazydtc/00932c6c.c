/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932c6c
 */

int FUN_00932c6c(long param_1,long param_2,long param_3,ulong param_4,ulong *param_5)

{
  ulong uVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  
  *param_5 = 0;
  lVar4 = *(long *)(param_1 + 0x328);
  lVar3 = param_3;
  if ((lVar4 != 0) && (lVar3 = lVar4 + param_4, (long)(param_3 - param_4) <= lVar4)) {
    lVar3 = param_3;
  }
  iVar2 = FUN_009434ec(param_1,param_2,lVar3,param_5);
  if ((iVar2 == 0) && (uVar5 = *param_5, uVar5 != 0)) {
    if (param_4 != 0) {
      uVar1 = param_4;
      if (uVar5 <= param_4) {
        uVar1 = uVar5;
      }
      FUN_00904a98(param_1,2,param_2,uVar1);
      uVar5 = *param_5;
    }
    lVar3 = uVar5 - param_4;
    if (param_4 <= uVar5 && lVar3 != 0) {
      FUN_00904a98(param_1,4,param_2 + param_4,lVar3);
      *(long *)(param_1 + 0xf0) = *(long *)(param_1 + 0xf0) + lVar3;
      FUN_00931fec(param_1);
    }
  }
  return iVar2;
}

