/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00857d50
 */

undefined8 FUN_00857d50(long param_1)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  undefined8 uVar8;
  ulong uVar9;
  
  lVar1 = *(long *)(param_1 + 0x1b8);
  lVar2 = *(long *)(param_1 + 0x1c0);
  uVar3 = FUN_00859498();
  lVar6 = *(long *)(param_1 + 0x1b8);
  uVar7 = (ulong)(lVar2 - lVar1) >> 3 & 0xffffffff;
  uVar5 = *(long *)(param_1 + 0x1c0) - lVar6 >> 3;
  if (uVar7 < uVar5) {
    do {
      uVar9 = uVar5 - 1;
      uVar8 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + uVar5 * 8 + -8) + 0x18);
      puVar4 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
      *puVar4 = uVar8;
      uVar5 = uVar9;
    } while (uVar7 < uVar9);
    lVar6 = *(long *)(param_1 + 0x1b8);
    uVar5 = *(long *)(param_1 + 0x1c0) - lVar6 >> 3;
  }
  if (uVar7 < uVar5 || uVar7 - uVar5 == 0) {
    if (uVar7 < uVar5) {
      *(ulong *)(param_1 + 0x1c0) = lVar6 + uVar7 * 8;
    }
  }
  else {
    FUN_00870174(param_1 + 0x1b8,uVar7 - uVar5);
  }
  if (*(int *)(param_1 + 0x90) != 0) {
    FUN_00859330(param_1,0,0);
  }
  return uVar3;
}

