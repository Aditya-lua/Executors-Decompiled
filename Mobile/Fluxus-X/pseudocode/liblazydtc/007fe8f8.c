/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fe8f8
 */

void FUN_007fe8f8(undefined8 *param_1)

{
  void *pvVar1;
  ulong *puVar2;
  undefined8 *puVar4;
  long lVar3;
  undefined8 uVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong *puVar10;
  ulong *puVar11;
  
  puVar4 = (undefined8 *)param_1[1];
  puVar8 = (undefined8 *)param_1[2];
  puVar7 = puVar4;
  if (puVar8 != puVar4) {
    uVar6 = param_1[4];
    puVar9 = puVar4 + uVar6 / 0xaa;
    puVar2 = (ulong *)*puVar9;
    puVar11 = puVar2 + (uVar6 % 0xaa) * 3;
    puVar10 = (ulong *)(puVar4[(param_1[5] + uVar6) / 0xaa] + ((param_1[5] + uVar6) % 0xaa) * 0x18);
    puVar4 = puVar8;
    if (puVar11 != puVar10) {
      do {
        if ((*puVar11 & 1) != 0) {
          operator_delete((void *)puVar11[2],*puVar11 & 0xfffffffffffffffe);
          puVar2 = (ulong *)*puVar9;
        }
        puVar11 = puVar11 + 3;
        if ((long)puVar11 - (long)puVar2 == 0xff0) {
          puVar9 = puVar9 + 1;
          puVar2 = (ulong *)*puVar9;
          puVar11 = puVar2;
        }
      } while (puVar11 != puVar10);
      puVar7 = (undefined8 *)param_1[1];
      puVar4 = (undefined8 *)param_1[2];
    }
    puVar8 = puVar4;
  }
  param_1[5] = 0;
  lVar3 = (long)puVar4 - (long)puVar7;
  while (uVar6 = lVar3 >> 3, 2 < uVar6) {
    operator_delete((void *)*puVar7,0xff0);
    puVar8 = (undefined8 *)param_1[2];
    puVar7 = (undefined8 *)(param_1[1] + 8);
    param_1[1] = puVar7;
    lVar3 = (long)puVar8 - (long)puVar7;
  }
  if (uVar6 == 1) {
    uVar5 = 0x55;
  }
  else {
    if (uVar6 != 2) goto LAB_007fea30;
    uVar5 = 0xaa;
  }
  param_1[4] = uVar5;
LAB_007fea30:
  if (puVar7 != puVar8) {
    do {
      puVar4 = puVar7 + 1;
      operator_delete((void *)*puVar7,0xff0);
      puVar7 = puVar4;
    } while (puVar4 != puVar8);
    lVar3 = param_1[1] - param_1[2];
    if (lVar3 != 0) {
      param_1[2] = param_1[2] + (lVar3 + 7U & 0xfffffffffffffff8);
    }
  }
  pvVar1 = (void *)*param_1;
  if (pvVar1 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar1,param_1[3] - (long)pvVar1);
  return;
}

