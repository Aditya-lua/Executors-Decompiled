/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091694c
 */

void FUN_0091694c(long *param_1,undefined8 param_2,code *param_3)

{
  undefined8 *puVar1;
  int iVar2;
  ulong uVar3;
  long lVar4;
  long *plVar5;
  ulong uVar6;
  long *plVar7;
  
  if (((param_1 != (long *)0x0) && (lVar4 = *param_1, lVar4 != 0)) &&
     (uVar3 = param_1[4], uVar3 != 0)) {
    uVar6 = 0;
    while( true ) {
      puVar1 = (undefined8 *)(lVar4 + uVar6 * 0x20);
      plVar5 = (long *)*puVar1;
      if (plVar5 != (long *)0x0) {
        do {
          plVar7 = (long *)plVar5[2];
          if ((param_3 == (code *)0x0) ||
             (iVar2 = (*param_3)(param_2,*(undefined8 *)(*plVar5 + 0x18)), iVar2 != 0)) {
            FUN_00925d80(puVar1,plVar5,param_1);
            param_1[5] = param_1[5] + -1;
          }
          plVar5 = plVar7;
        } while (plVar7 != (long *)0x0);
        uVar3 = param_1[4];
      }
      uVar6 = uVar6 + 1;
      if (uVar3 <= uVar6) break;
      lVar4 = *param_1;
    }
  }
  return;
}

