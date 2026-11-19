/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087a040
 */

void FUN_0087a040(long *param_1,undefined8 *param_2)

{
  undefined4 *puVar1;
  undefined4 *puVar2;
  undefined4 uVar3;
  undefined2 uVar4;
  void *pvVar5;
  undefined4 *puVar6;
  undefined4 *puVar7;
  long lVar8;
  undefined4 *puVar9;
  undefined8 uVar10;
  
  puVar9 = (undefined4 *)*param_1;
  puVar2 = (undefined4 *)param_1[1];
  puVar1 = (undefined4 *)((long)puVar9 + (param_2[1] - (long)puVar2));
  if (puVar2 != puVar9) {
    puVar6 = puVar1;
    puVar7 = puVar9;
    do {
      uVar4 = *(undefined2 *)(puVar7 + 1);
      uVar3 = *puVar7;
      *(undefined8 *)(puVar6 + 4) = 0;
      *(undefined8 *)(puVar6 + 6) = 0;
      *(undefined8 *)(puVar6 + 2) = 0;
      *(undefined2 *)(puVar6 + 1) = uVar4;
      *puVar6 = uVar3;
      uVar10 = *(undefined8 *)(puVar7 + 2);
      *(undefined8 *)(puVar6 + 4) = *(undefined8 *)(puVar7 + 4);
      *(undefined8 *)(puVar6 + 2) = uVar10;
      *(undefined8 *)(puVar6 + 6) = *(undefined8 *)(puVar7 + 6);
      *(undefined8 *)(puVar7 + 2) = 0;
      *(undefined8 *)(puVar7 + 4) = 0;
      *(undefined8 *)(puVar7 + 6) = 0;
      *(undefined8 *)(puVar6 + 8) = 0;
      *(undefined8 *)(puVar6 + 10) = 0;
      *(undefined8 *)(puVar6 + 0xc) = 0;
      uVar10 = *(undefined8 *)(puVar7 + 8);
      *(undefined8 *)(puVar6 + 10) = *(undefined8 *)(puVar7 + 10);
      *(undefined8 *)(puVar6 + 8) = uVar10;
      *(undefined8 *)(puVar6 + 0xc) = *(undefined8 *)(puVar7 + 0xc);
      puVar6 = puVar6 + 0xe;
      *(undefined8 *)(puVar7 + 8) = 0;
      *(undefined8 *)(puVar7 + 10) = 0;
      *(undefined8 *)(puVar7 + 0xc) = 0;
      puVar7 = puVar7 + 0xe;
    } while (puVar7 != puVar2);
    do {
      pvVar5 = *(void **)(puVar9 + 8);
      if (pvVar5 != (void *)0x0) {
        *(void **)(puVar9 + 10) = pvVar5;
        operator_delete(pvVar5,*(long *)(puVar9 + 0xc) - (long)pvVar5);
      }
      pvVar5 = *(void **)(puVar9 + 2);
      if (pvVar5 != (void *)0x0) {
        *(void **)(puVar9 + 4) = pvVar5;
        operator_delete(pvVar5,*(long *)(puVar9 + 6) - (long)pvVar5);
      }
      puVar9 = puVar9 + 0xe;
    } while (puVar9 != puVar2);
    puVar9 = (undefined4 *)*param_1;
  }
  param_2[1] = puVar1;
  *param_1 = (long)puVar1;
  param_1[1] = (long)puVar9;
  param_2[1] = puVar9;
  lVar8 = param_1[1];
  param_1[1] = param_2[2];
  param_2[2] = lVar8;
  lVar8 = param_1[2];
  param_1[2] = param_2[3];
  param_2[3] = lVar8;
  *param_2 = param_2[1];
  return;
}

