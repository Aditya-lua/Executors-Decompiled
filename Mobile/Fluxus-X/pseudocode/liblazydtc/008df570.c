/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008df570
 */

void FUN_008df570(undefined8 *param_1)

{
  long lVar1;
  undefined8 *puVar2;
  void *pvVar3;
  void *pvVar4;
  uint *puVar5;
  undefined *puVar6;
  long lVar7;
  undefined8 uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  
  memset(param_1,0,0x888);
                    /* try { // try from 008df590 to 008df597 has its CatchHandler @ 008df934 */
  puVar2 = operator_new(0x10);
  puVar2[1] = 0x40b82fd4;
  *puVar2 = 0x80892fd9144d5947;
  uVar8 = *puVar2;
  param_1[1] = puVar2[1];
  *param_1 = uVar8;
  operator_delete(puVar2,0x10);
                    /* try { // try from 008df5b4 to 008df5bb has its CatchHandler @ 008df910 */
  pvVar3 = operator_new(0x10000);
  memset(pvVar3,0,0x10000);
  puVar5 = &DAT_00364edc;
  lVar7 = -0xffc0;
  do {
    uVar8 = *(undefined8 *)(puVar5 + 2);
    lVar1 = lVar7 + 0x40;
    uVar9 = *puVar5;
    uVar10 = puVar5[4];
    uVar11 = puVar5[8];
    uVar12 = puVar5[0xc];
    uVar13 = *(undefined8 *)(puVar5 + 6);
    uVar14 = *(undefined8 *)(puVar5 + 10);
    *(undefined8 *)((long)pvVar3 + lVar7 + 0xffc0) = *(undefined8 *)(puVar5 + -2);
    *(ulong *)((long)pvVar3 + lVar7 + 0xffc8) = (ulong)uVar9;
    *(undefined8 *)((long)pvVar3 + lVar7 + 0xffd0) = uVar8;
    *(ulong *)((long)pvVar3 + lVar7 + 0xffd8) = (ulong)uVar10;
    *(undefined8 *)((long)pvVar3 + lVar7 + 0xffe0) = uVar13;
    *(ulong *)((long)pvVar3 + lVar7 + 0xffe8) = (ulong)uVar11;
    *(undefined8 *)((long)pvVar3 + lVar7 + 0xfff0) = uVar14;
    *(ulong *)((long)pvVar3 + lVar7 + 0xfff8) = (ulong)uVar12;
    puVar5 = puVar5 + 0x10;
    lVar7 = lVar1;
  } while (lVar1 != 0);
  pvVar4 = (void *)param_1[2];
  *(undefined8 *)((long)pvVar3 + 0xffc8) = 0x4536387c;
  *(undefined8 *)((long)pvVar3 + 0xffc0) = 0x1e19926ed7e87d5;
  *(undefined8 *)((long)pvVar3 + 0xffd0) = 0xa1ecc888a63238a;
  *(undefined8 *)((long)pvVar3 + 0xffd8) = 0x410e5f48;
  *(undefined8 *)((long)pvVar3 + 0xffe0) = 0xd60d74f486af01f3;
  *(undefined8 *)((long)pvVar3 + 0xffe8) = 0x9e76e7b5;
  *(undefined8 *)((long)pvVar3 + 0xfff0) = 0xddf2215ae1b2a5ac;
  *(undefined8 *)((long)pvVar3 + 0xfff8) = 0x9a4e8081;
  if (pvVar4 != (void *)0x0) {
    param_1[3] = pvVar4;
    operator_delete(pvVar4,param_1[4] - (long)pvVar4);
    param_1[2] = 0;
    param_1[3] = 0;
    param_1[4] = 0;
  }
  param_1[2] = pvVar3;
  param_1[3] = (long)pvVar3 + 0x10000;
  param_1[4] = (long)pvVar3 + 0x10000;
                    /* try { // try from 008df6c8 to 008df6cf has its CatchHandler @ 008df90c */
  pvVar3 = operator_new(0x10000);
  memset(pvVar3,0,0x10000);
  puVar5 = &DAT_00374edc;
  lVar7 = -0xffc0;
  do {
    uVar8 = *(undefined8 *)(puVar5 + 2);
    lVar1 = lVar7 + 0x40;
    uVar9 = *puVar5;
    uVar10 = puVar5[4];
    uVar11 = puVar5[8];
    uVar12 = puVar5[0xc];
    uVar13 = *(undefined8 *)(puVar5 + 6);
    uVar14 = *(undefined8 *)(puVar5 + 10);
    *(undefined8 *)((long)pvVar3 + lVar7 + 0xffc0) = *(undefined8 *)(puVar5 + -2);
    *(ulong *)((long)pvVar3 + lVar7 + 0xffc8) = (ulong)uVar9;
    *(undefined8 *)((long)pvVar3 + lVar7 + 0xffd0) = uVar8;
    *(ulong *)((long)pvVar3 + lVar7 + 0xffd8) = (ulong)uVar10;
    *(undefined8 *)((long)pvVar3 + lVar7 + 0xffe0) = uVar13;
    *(ulong *)((long)pvVar3 + lVar7 + 0xffe8) = (ulong)uVar11;
    *(undefined8 *)((long)pvVar3 + lVar7 + 0xfff0) = uVar14;
    *(ulong *)((long)pvVar3 + lVar7 + 0xfff8) = (ulong)uVar12;
    puVar5 = puVar5 + 0x10;
    lVar7 = lVar1;
  } while (lVar1 != 0);
  pvVar4 = (void *)param_1[5];
  *(undefined8 *)((long)pvVar3 + 0xffc8) = 0x8052f61e;
  *(undefined8 *)((long)pvVar3 + 0xffc0) = 0x76bc973206fc1ec2;
  *(undefined8 *)((long)pvVar3 + 0xffd0) = 0x8f8a06a6ba7da24b;
  *(undefined8 *)((long)pvVar3 + 0xffd8) = 0x36712d08;
  *(undefined8 *)((long)pvVar3 + 0xffe0) = 0xd9c22f0ffd48da0a;
  *(undefined8 *)((long)pvVar3 + 0xffe8) = 0xf1328f7;
  *(undefined8 *)((long)pvVar3 + 0xfff0) = 0x24a6968d2b52a3f6;
  *(undefined8 *)((long)pvVar3 + 0xfff8) = 0xdfe8392f;
  if (pvVar4 != (void *)0x0) {
    param_1[6] = pvVar4;
    operator_delete(pvVar4,param_1[7] - (long)pvVar4);
    param_1[5] = 0;
    param_1[6] = 0;
    param_1[7] = 0;
  }
  param_1[5] = pvVar3;
  param_1[6] = (long)pvVar3 + 0x10000;
  param_1[7] = (long)pvVar3 + 0x10000;
                    /* try { // try from 008df7dc to 008df7e3 has its CatchHandler @ 008df908 */
  pvVar3 = operator_new(0x3c0000);
  memset(pvVar3,0,0x3c0000);
  puVar6 = (undefined *)0x0;
  puVar5 = &DAT_00384edc;
  do {
    uVar8 = *(undefined8 *)(puVar5 + 2);
    puVar2 = (undefined8 *)((long)pvVar3 + (long)puVar6);
    puVar6 = puVar6 + 0x40;
    uVar9 = *puVar5;
    uVar10 = puVar5[4];
    uVar11 = puVar5[8];
    uVar12 = puVar5[0xc];
    uVar13 = *(undefined8 *)(puVar5 + 6);
    uVar14 = *(undefined8 *)(puVar5 + 10);
    *puVar2 = *(undefined8 *)(puVar5 + -2);
    puVar2[1] = (ulong)uVar9;
    puVar2[2] = uVar8;
    puVar2[3] = (ulong)uVar10;
    puVar2[4] = uVar13;
    puVar2[5] = (ulong)uVar11;
    puVar2[6] = uVar14;
    puVar2[7] = (ulong)uVar12;
    puVar5 = puVar5 + 0x10;
  } while (puVar6 != &DAT_003bffc0);
  pvVar4 = (void *)param_1[8];
  *(undefined8 *)((long)pvVar3 + 0x3bffc8) = 0x51a20e59;
  *(undefined8 *)((long)pvVar3 + 0x3bffc0) = 0x6ab0bbca651bd6b7;
  *(undefined8 *)((long)pvVar3 + 0x3bffd0) = 0xddbfa3e26a04546f;
  *(undefined8 *)((long)pvVar3 + 0x3bffd8) = 0xa785de0d;
  *(undefined8 *)((long)pvVar3 + 0x3bffe0) = 0x508af76aed174e29;
  *(undefined8 *)((long)pvVar3 + 0x3bffe8) = 0x8090aade;
  *(undefined8 *)((long)pvVar3 + 0x3bfff0) = 0xe785ef42e208ccf1;
  *(undefined8 *)((long)pvVar3 + 0x3bfff8) = 0x76b77a8a;
  if (pvVar4 != (void *)0x0) {
    param_1[9] = pvVar4;
    operator_delete(pvVar4,param_1[10] - (long)pvVar4);
    param_1[8] = 0;
    param_1[9] = 0;
    param_1[10] = 0;
  }
  param_1[8] = pvVar3;
  param_1[9] = (long)pvVar3 + 0x3c0000;
  param_1[10] = (long)pvVar3 + 0x3c0000;
                    /* try { // try from 008df8ec to 008df8f3 has its CatchHandler @ 008df904 */
  FUN_008de870(param_1);
  return;
}

