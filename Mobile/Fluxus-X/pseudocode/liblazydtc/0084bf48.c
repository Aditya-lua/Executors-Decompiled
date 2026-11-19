/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084bf48
 */

void FUN_0084bf48(long param_1)

{
  ulong uVar1;
  void *pvVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  ulong uVar6;
  long *plVar7;
  long lVar8;
  long lVar9;
  
  puVar3 = *(undefined8 **)(param_1 + 8);
  puVar5 = *(undefined8 **)(param_1 + 0x10);
  if (puVar5 != puVar3) {
    uVar6 = *(ulong *)(param_1 + 0x20);
    uVar1 = *(long *)(param_1 + 0x28) + uVar6;
    plVar7 = puVar3 + uVar6 / 0x2a;
    lVar9 = *plVar7 + (uVar6 % 0x2a) * 0x60;
    lVar8 = puVar3[uVar1 / 0x2a] + (uVar1 % 0x2a) * 0x60;
    if (lVar9 != lVar8) {
      do {
        pvVar2 = *(void **)(lVar9 + 0x38);
        if (pvVar2 != (void *)0x0) {
          *(void **)(lVar9 + 0x40) = pvVar2;
          operator_delete(pvVar2,*(long *)(lVar9 + 0x48) - (long)pvVar2);
        }
        pvVar2 = *(void **)(lVar9 + 0x20);
        if (pvVar2 != (void *)0x0) {
          *(void **)(lVar9 + 0x28) = pvVar2;
          operator_delete(pvVar2,*(long *)(lVar9 + 0x30) - (long)pvVar2);
        }
        lVar9 = lVar9 + 0x60;
        if (lVar9 - *plVar7 == 0xfc0) {
          plVar7 = plVar7 + 1;
          lVar9 = *plVar7;
        }
      } while (lVar9 != lVar8);
      puVar3 = *(undefined8 **)(param_1 + 8);
      puVar5 = *(undefined8 **)(param_1 + 0x10);
    }
  }
  *(undefined8 *)(param_1 + 0x28) = 0;
  lVar9 = (long)puVar5 - (long)puVar3;
  while (uVar1 = lVar9 >> 3, 2 < uVar1) {
    operator_delete((void *)*puVar3,0xfc0);
    puVar3 = (undefined8 *)(*(long *)(param_1 + 8) + 8);
    *(undefined8 **)(param_1 + 8) = puVar3;
    lVar9 = *(long *)(param_1 + 0x10) - (long)puVar3;
  }
  if (uVar1 == 1) {
    uVar4 = 0x15;
  }
  else {
    if (uVar1 != 2) {
      return;
    }
    uVar4 = 0x2a;
  }
  *(undefined8 *)(param_1 + 0x20) = uVar4;
  return;
}

