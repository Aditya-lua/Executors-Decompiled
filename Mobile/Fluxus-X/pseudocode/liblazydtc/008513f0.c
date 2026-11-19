/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008513f0
 */

undefined8 FUN_008513f0(long param_1)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  ulong uVar6;
  long lVar7;
  long *plVar8;
  
  iVar5 = DAT_00d1b000;
  iVar4 = DAT_00d1aff0;
  iVar3 = DAT_00d1afe0;
  iVar2 = DAT_00d1afd0;
  if (*(int *)(param_1 + 8) != DAT_00d1b080) {
    return 0;
  }
  if (*(long *)(param_1 + 0x28) == 0) {
    return 1;
  }
  lVar7 = *(long *)(param_1 + 0x28) * 0x18;
  plVar8 = (long *)(*(long *)(param_1 + 0x20) + 0x10);
  do {
    if (*(uint *)(plVar8 + -2) < 2) {
      iVar1 = *(int *)(*plVar8 + 8);
      if ((((iVar1 != iVar2) && (iVar1 != iVar3)) && (iVar1 != iVar4)) &&
         ((iVar1 != iVar5 && (uVar6 = FUN_008513f0(), (uVar6 & 1) == 0)))) {
        return 0;
      }
    }
    else if (*(uint *)(plVar8 + -2) == 2) {
      return 0;
    }
    lVar7 = lVar7 + -0x18;
    plVar8 = plVar8 + 3;
    if (lVar7 == 0) {
      return 1;
    }
  } while( true );
}

