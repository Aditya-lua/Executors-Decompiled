/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00844994
 */

void FUN_00844994(long *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  void *pvVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  
  puVar9 = (undefined8 *)*param_1;
  puVar3 = (undefined8 *)param_1[1];
  puVar2 = (undefined8 *)((long)puVar9 + (param_2[1] - (long)puVar3));
  if (puVar3 != puVar9) {
    puVar5 = puVar9;
    puVar6 = puVar2;
    do {
      uVar12 = puVar5[1];
      uVar11 = *puVar5;
      uVar10 = puVar5[3];
      uVar8 = puVar5[2];
      puVar6[5] = 0;
      puVar6[6] = 0;
      puVar6[4] = 0;
      puVar6[1] = uVar12;
      *puVar6 = uVar11;
      puVar6[3] = uVar10;
      puVar6[2] = uVar8;
      uVar8 = puVar5[4];
      puVar6[5] = puVar5[5];
      puVar6[4] = uVar8;
      puVar6[6] = puVar5[6];
      puVar5[4] = 0;
      puVar5[5] = 0;
      puVar5[6] = 0;
      puVar6[7] = 0;
      puVar6[8] = 0;
      puVar6[9] = 0;
      uVar8 = puVar5[7];
      puVar6[8] = puVar5[8];
      puVar6[7] = uVar8;
      puVar6[9] = puVar5[9];
      puVar1 = (undefined8 *)((long)puVar5 + 0x55);
      uVar8 = puVar5[10];
      puVar5[7] = 0;
      puVar5[8] = 0;
      puVar5[9] = 0;
      puVar5 = puVar5 + 0xc;
      *(undefined8 *)((long)puVar6 + 0x55) = *puVar1;
      puVar6[10] = uVar8;
      puVar6 = puVar6 + 0xc;
    } while (puVar5 != puVar3);
    do {
      pvVar4 = (void *)puVar9[7];
      if (pvVar4 != (void *)0x0) {
        puVar9[8] = pvVar4;
        operator_delete(pvVar4,puVar9[9] - (long)pvVar4);
      }
      pvVar4 = (void *)puVar9[4];
      if (pvVar4 != (void *)0x0) {
        puVar9[5] = pvVar4;
        operator_delete(pvVar4,puVar9[6] - (long)pvVar4);
      }
      puVar9 = puVar9 + 0xc;
    } while (puVar9 != puVar3);
    puVar9 = (undefined8 *)*param_1;
  }
  param_2[1] = puVar2;
  *param_1 = (long)puVar2;
  param_1[1] = (long)puVar9;
  param_2[1] = puVar9;
  lVar7 = param_1[1];
  param_1[1] = param_2[2];
  param_2[2] = lVar7;
  lVar7 = param_1[2];
  param_1[2] = param_2[3];
  param_2[3] = lVar7;
  *param_2 = param_2[1];
  return;
}

