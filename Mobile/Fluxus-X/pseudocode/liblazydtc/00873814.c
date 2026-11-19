/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00873814
 */

void FUN_00873814(undefined8 *param_1,ulong param_2)

{
  long lVar1;
  undefined8 *puVar2;
  void *pvVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  void *pvVar8;
  void *pvVar9;
  undefined8 *puVar10;
  long lVar11;
  undefined8 uVar12;
  
  lVar11 = param_1[2];
  puVar7 = (undefined8 *)*param_1;
  if ((ulong)((lVar11 - (long)puVar7 >> 3) * -0xf0f0f0f0f0f0f0f) < param_2) {
    if (0x1e1e1e1e1e1e1e1 < param_2) {
      puVar7 = (undefined8 *)FUN_008797b8();
      pvVar8 = (void *)*puVar7;
      if (pvVar8 == (void *)0x0) {
        return;
      }
      pvVar9 = (void *)puVar7[1];
      pvVar3 = pvVar8;
      if (pvVar8 != pvVar9) {
        do {
          if ((*(byte *)((long)pvVar9 + -0x18) & 1) != 0) {
            operator_delete(*(void **)((long)pvVar9 + -8),
                            *(ulong *)((long)pvVar9 + -0x18) & 0xfffffffffffffffe);
          }
          pvVar9 = (void *)((long)pvVar9 + -0x20);
        } while (pvVar9 != pvVar8);
        pvVar3 = (void *)*puVar7;
      }
      puVar7[1] = pvVar8;
      operator_delete(pvVar3,puVar7[2] - (long)pvVar3);
      return;
    }
    puVar10 = (undefined8 *)param_1[1];
    puVar2 = operator_new(param_2 * 0x88);
    lVar1 = (long)puVar10 - (long)puVar7;
    if (lVar1 != 0) {
      puVar4 = puVar7;
      puVar5 = puVar2;
      do {
        uVar12 = puVar4[1];
        uVar6 = *puVar4;
        puVar5[2] = puVar4[2];
        puVar5[1] = uVar12;
        *puVar5 = uVar6;
        uVar6 = puVar4[3];
        puVar4[1] = 0;
        puVar4[2] = 0;
        *puVar4 = 0;
        *(undefined4 *)(puVar5 + 4) = *(undefined4 *)(puVar4 + 4);
        puVar5[3] = uVar6;
        uVar12 = puVar4[6];
        uVar6 = puVar4[5];
        puVar5[7] = puVar4[7];
        puVar5[6] = uVar12;
        puVar5[5] = uVar6;
        uVar12 = puVar4[9];
        uVar6 = puVar4[8];
        puVar4[6] = 0;
        puVar4[7] = 0;
        puVar4[5] = 0;
        puVar5[10] = puVar4[10];
        puVar5[9] = uVar12;
        puVar5[8] = uVar6;
        uVar6 = puVar4[0xb];
        puVar4[8] = 0;
        puVar4[9] = 0;
        puVar4[10] = 0;
        puVar5[0xc] = puVar4[0xc];
        puVar5[0xb] = uVar6;
        puVar5[0xd] = puVar4[0xd];
        uVar12 = puVar4[0xf];
        uVar6 = puVar4[0xe];
        puVar4[0xb] = 0;
        puVar4[0xc] = 0;
        puVar4[0xd] = 0;
        puVar5[0x10] = puVar4[0x10];
        puVar5[0xf] = uVar12;
        puVar5[0xe] = uVar6;
        puVar5 = puVar5 + 0x11;
        puVar4[0xf] = 0;
        puVar4[0x10] = 0;
        puVar4[0xe] = 0;
        puVar4 = puVar4 + 0x11;
      } while (puVar4 != puVar10);
      do {
        FUN_00873e90(puVar7);
        puVar7 = puVar7 + 0x11;
      } while (puVar7 != puVar10);
      puVar7 = (undefined8 *)*param_1;
      lVar11 = param_1[2];
    }
    *param_1 = puVar2;
    param_1[1] = (long)puVar2 + lVar1;
    param_1[2] = puVar2 + param_2 * 0x11;
    if (puVar7 != (undefined8 *)0x0) {
      operator_delete(puVar7,lVar11 - (long)puVar7);
      return;
    }
  }
  return;
}

