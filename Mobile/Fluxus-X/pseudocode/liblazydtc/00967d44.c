/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00967d44
 */

/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00967d44(long *param_1,long *param_2)

{
  byte bVar1;
  byte bVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  
  bVar2 = *(byte *)((long)param_2 + 0x79);
  *(char *)(param_2 + 0xf) = (char)param_1[0xf];
  *(undefined4 *)((long)param_2 + 0x74) = *(undefined4 *)((long)param_1 + 0x74);
  bVar1 = *(byte *)((long)param_1 + 0x79) & 1;
  *(byte *)((long)param_2 + 0x79) = bVar2 & 0xfe | bVar1;
  bVar1 = bVar1 | (*(byte *)((long)param_1 + 0x79) >> 1 & 1) << 1;
  *(byte *)((long)param_2 + 0x79) = bVar2 & 0xfc | bVar1;
  bVar1 = bVar1 | (*(byte *)((long)param_1 + 0x79) >> 2 & 1) << 2;
  *(byte *)((long)param_2 + 0x79) = bVar2 & 0xf8 | bVar1;
  *(byte *)((long)param_2 + 0x79) = bVar2 & 0xf0 | bVar1 | *(byte *)((long)param_1 + 0x79) & 8;
  *(char *)(param_2 + 0xe) = (char)param_1[0xe];
  puVar6 = (undefined8 *)param_1[8];
  if (puVar6 != (undefined8 *)0x0) {
    puVar3 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(puVar6[1] + 0x18);
    if (puVar3 == (undefined8 *)0x0) {
      return 0;
    }
    uVar5 = puVar6[1];
    *(undefined4 *)(puVar3 + 2) = 1;
    *puVar3 = puVar3 + 3;
    puVar3[1] = uVar5;
    memcpy(puVar3 + 3,(void *)*puVar6,puVar6[1]);
    param_2[8] = (long)puVar3;
  }
  puVar6 = (undefined8 *)param_1[9];
  if (puVar6 != (undefined8 *)0x0) {
    puVar3 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(puVar6[1] + 0x18);
    if (puVar3 == (undefined8 *)0x0) {
      return 0;
    }
    uVar5 = puVar6[1];
    *(undefined4 *)(puVar3 + 2) = 1;
    *puVar3 = puVar3 + 3;
    puVar3[1] = uVar5;
    memcpy(puVar3 + 3,(void *)*puVar6,puVar6[1]);
    param_2[9] = (long)puVar3;
  }
  puVar6 = (undefined8 *)param_1[10];
  if (puVar6 != (undefined8 *)0x0) {
    puVar3 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(puVar6[1] + 0x18);
    if (puVar3 == (undefined8 *)0x0) {
      return 0;
    }
    uVar5 = puVar6[1];
    *(undefined4 *)(puVar3 + 2) = 1;
    *puVar3 = puVar3 + 3;
    puVar3[1] = uVar5;
    memcpy(puVar3 + 3,(void *)*puVar6,puVar6[1]);
    param_2[10] = (long)puVar3;
  }
  if (*param_1 == 0) {
    *param_2 = 0;
    lVar4 = param_1[1];
  }
  else {
    lVar4 = (*(code *)PTR_strdup_00cc4688)();
    *param_2 = lVar4;
    if (lVar4 == 0) {
      return 0;
    }
    lVar4 = param_1[1];
  }
  if (lVar4 == 0) {
    param_2[1] = 0;
    lVar4 = param_1[2];
  }
  else {
    lVar4 = (*(code *)PTR_strdup_00cc4688)();
    param_2[1] = lVar4;
    if (lVar4 == 0) {
      return 0;
    }
    lVar4 = param_1[2];
  }
  if (lVar4 == 0) {
    param_2[2] = 0;
    lVar4 = param_1[3];
  }
  else {
    lVar4 = (*(code *)PTR_strdup_00cc4688)();
    param_2[2] = lVar4;
    if (lVar4 == 0) {
      return 0;
    }
    lVar4 = param_1[3];
  }
  if (lVar4 == 0) {
    param_2[3] = 0;
    lVar4 = param_1[4];
  }
  else {
    lVar4 = (*(code *)PTR_strdup_00cc4688)();
    param_2[3] = lVar4;
    if (lVar4 == 0) {
      return 0;
    }
    lVar4 = param_1[4];
  }
  if (lVar4 == 0) {
    param_2[4] = 0;
    lVar4 = param_1[5];
  }
  else {
    lVar4 = (*(code *)PTR_strdup_00cc4688)();
    param_2[4] = lVar4;
    if (lVar4 == 0) {
      return 0;
    }
    lVar4 = param_1[5];
  }
  if (lVar4 == 0) {
    param_2[5] = 0;
    lVar4 = param_1[6];
  }
  else {
    lVar4 = (*(code *)PTR_strdup_00cc4688)();
    param_2[5] = lVar4;
    if (lVar4 == 0) {
      return 0;
    }
    lVar4 = param_1[6];
  }
  if (lVar4 == 0) {
    param_2[6] = 0;
    lVar4 = param_1[0xd];
  }
  else {
    lVar4 = (*(code *)PTR_strdup_00cc4688)();
    param_2[6] = lVar4;
    if (lVar4 == 0) {
      return 0;
    }
    lVar4 = param_1[0xd];
  }
  if (lVar4 == 0) {
    param_2[0xd] = 0;
    lVar4 = param_1[7];
  }
  else {
    lVar4 = (*(code *)PTR_strdup_00cc4688)();
    param_2[0xd] = lVar4;
    if (lVar4 == 0) {
      return 0;
    }
    lVar4 = param_1[7];
  }
  if (lVar4 == 0) {
    param_2[7] = 0;
  }
  else {
    lVar4 = (*(code *)PTR_strdup_00cc4688)();
    param_2[7] = lVar4;
    if (lVar4 == 0) {
      return 0;
    }
  }
  if (param_1[0xb] == 0) {
    param_2[0xb] = 0;
  }
  else {
    lVar4 = (*(code *)PTR_strdup_00cc4688)();
    param_2[0xb] = lVar4;
    if (lVar4 == 0) {
      return 0;
    }
  }
  if (param_1[0xc] == 0) {
    param_2[0xc] = 0;
  }
  else {
    lVar4 = (*(code *)PTR_strdup_00cc4688)();
    param_2[0xc] = lVar4;
    if (lVar4 == 0) {
      return 0;
    }
  }
  return 1;
}

