/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008792e0
 */

void FUN_008792e0(undefined8 *param_1)

{
  byte bVar1;
  byte *pbVar2;
  void *pvVar3;
  void *pvVar4;
  byte *pbVar5;
  void *pvVar6;
  byte *pbVar7;
  
  *param_1 = &PTR_FUN_00c4a718;
  if ((*(byte *)(param_1 + 0x5f) & 1) != 0) {
    operator_delete((void *)param_1[0x61],param_1[0x5f] & 0xfffffffffffffffe);
  }
  pvVar4 = (void *)param_1[0x5c];
  if (pvVar4 != (void *)0x0) {
    pvVar6 = (void *)param_1[0x5d];
    pvVar3 = pvVar4;
    if (pvVar4 != pvVar6) {
      do {
        if ((*(byte *)((long)pvVar6 + -0x18) & 1) != 0) {
          operator_delete(*(void **)((long)pvVar6 + -8),
                          *(ulong *)((long)pvVar6 + -0x18) & 0xfffffffffffffffe);
        }
        pvVar6 = (void *)((long)pvVar6 + -0x20);
      } while (pvVar6 != pvVar4);
      pvVar3 = (void *)param_1[0x5c];
    }
    param_1[0x5d] = pvVar4;
    operator_delete(pvVar3,param_1[0x5e] - (long)pvVar3);
  }
  pbVar5 = (byte *)param_1[0x59];
  if (pbVar5 != (byte *)0x0) {
    pbVar2 = pbVar5;
    if (pbVar5 != (byte *)param_1[0x5a]) {
      pbVar2 = (byte *)param_1[0x5a];
      do {
        pbVar7 = pbVar2 + -0x18;
        if ((*pbVar7 & 1) != 0) {
          operator_delete(*(void **)(pbVar2 + -8),*(ulong *)(pbVar2 + -0x18) & 0xfffffffffffffffe);
        }
        pbVar2 = pbVar7;
      } while (pbVar7 != pbVar5);
      pbVar2 = (byte *)param_1[0x59];
    }
    param_1[0x5a] = pbVar5;
    operator_delete(pbVar2,param_1[0x5b] - (long)pbVar2);
  }
  if ((*(byte *)(param_1 + 0x55) & 1) == 0) {
    bVar1 = *(byte *)(param_1 + 0x51);
  }
  else {
    operator_delete((void *)param_1[0x57],param_1[0x55] & 0xfffffffffffffffe);
    bVar1 = *(byte *)(param_1 + 0x51);
  }
  if ((bVar1 & 1) == 0) {
    pvVar4 = (void *)param_1[0x4e];
  }
  else {
    operator_delete((void *)param_1[0x53],param_1[0x51] & 0xfffffffffffffffe);
    pvVar4 = (void *)param_1[0x4e];
  }
  if (pvVar4 != (void *)0x0) {
    param_1[0x4f] = pvVar4;
    operator_delete(pvVar4,param_1[0x50] - (long)pvVar4);
  }
  pvVar4 = (void *)param_1[0x4b];
  if (pvVar4 != (void *)0x0) {
    param_1[0x4c] = pvVar4;
    operator_delete(pvVar4,param_1[0x4d] - (long)pvVar4);
  }
  if ((void *)param_1[0x44] != (void *)0x0) {
    operator_delete((void *)param_1[0x44]);
    param_1[0x44] = 0;
    operator_delete((void *)param_1[0x47]);
    param_1[0x47] = 0;
    param_1[0x46] = 0;
    param_1[0x45] = 0;
    operator_delete((void *)0x0);
    param_1[0x48] = 0;
    *(undefined1 *)(param_1 + 0x4a) = 0x40;
  }
  operator_delete((void *)param_1[0x47]);
  pbVar5 = (byte *)param_1[0x41];
  if (pbVar5 != (byte *)0x0) {
    pbVar2 = pbVar5;
    if (pbVar5 != (byte *)param_1[0x42]) {
      pbVar2 = (byte *)param_1[0x42];
      do {
        pbVar7 = pbVar2 + -0x20;
        if ((*pbVar7 & 1) != 0) {
          operator_delete(*(void **)(pbVar2 + -0x10),*(ulong *)(pbVar2 + -0x20) & 0xfffffffffffffffe
                         );
        }
        pbVar2 = pbVar7;
      } while (pbVar7 != pbVar5);
      pbVar2 = (byte *)param_1[0x41];
    }
    param_1[0x42] = pbVar5;
    operator_delete(pbVar2,param_1[0x43] - (long)pbVar2);
  }
  pvVar4 = (void *)param_1[0x3e];
  if (pvVar4 != (void *)0x0) {
    param_1[0x3f] = pvVar4;
    operator_delete(pvVar4,param_1[0x40] - (long)pvVar4);
  }
  pvVar4 = (void *)param_1[0x3b];
  if (pvVar4 != (void *)0x0) {
    param_1[0x3c] = pvVar4;
    operator_delete(pvVar4,param_1[0x3d] - (long)pvVar4);
  }
  pvVar4 = (void *)param_1[0x38];
  if (pvVar4 != (void *)0x0) {
    param_1[0x39] = pvVar4;
    operator_delete(pvVar4,param_1[0x3a] - (long)pvVar4);
  }
  pvVar4 = (void *)param_1[0x35];
  if (pvVar4 != (void *)0x0) {
    param_1[0x36] = pvVar4;
    operator_delete(pvVar4,param_1[0x37] - (long)pvVar4);
  }
  if ((void *)param_1[0x2d] != (void *)0x0) {
    operator_delete((void *)param_1[0x2d]);
    param_1[0x2d] = 0;
    operator_delete((void *)param_1[0x30]);
    param_1[0x2e] = 0;
    param_1[0x2f] = 0;
    param_1[0x30] = 0;
    operator_delete((void *)0x0);
    param_1[0x31] = 0;
    *(undefined1 *)(param_1 + 0x33) = 0x40;
  }
  operator_delete((void *)param_1[0x30]);
  if ((void *)param_1[0x26] != (void *)0x0) {
    operator_delete((void *)param_1[0x26]);
    param_1[0x26] = 0;
    operator_delete((void *)param_1[0x29]);
    param_1[0x27] = 0;
    param_1[0x28] = 0;
    param_1[0x29] = 0;
    operator_delete((void *)0x0);
    param_1[0x2a] = 0;
    *(undefined1 *)(param_1 + 0x2c) = 0x40;
  }
  operator_delete((void *)param_1[0x29]);
  if ((void *)param_1[0x1f] != (void *)0x0) {
    operator_delete((void *)param_1[0x1f]);
    param_1[0x1f] = 0;
    operator_delete((void *)param_1[0x22]);
    param_1[0x20] = 0;
    param_1[0x21] = 0;
    param_1[0x22] = 0;
    operator_delete((void *)0x0);
    param_1[0x23] = 0;
    *(undefined1 *)(param_1 + 0x25) = 0x40;
  }
  operator_delete((void *)param_1[0x22]);
  pvVar4 = (void *)param_1[0x1b];
  if (pvVar4 != (void *)0x0) {
    param_1[0x1c] = pvVar4;
    operator_delete(pvVar4,param_1[0x1d] - (long)pvVar4);
  }
  pvVar4 = (void *)param_1[0x18];
  if (pvVar4 != (void *)0x0) {
    pvVar6 = (void *)param_1[0x19];
    pvVar3 = pvVar4;
    if (pvVar4 != pvVar6) {
      do {
        pvVar3 = *(void **)((long)pvVar6 + -0x18);
        if (pvVar3 != (void *)0x0) {
          *(void **)((long)pvVar6 + -0x10) = pvVar3;
          operator_delete(pvVar3,*(long *)((long)pvVar6 + -8) - (long)pvVar3);
        }
        pvVar3 = *(void **)((long)pvVar6 + -0x30);
        if (pvVar3 != (void *)0x0) {
          *(void **)((long)pvVar6 + -0x28) = pvVar3;
          operator_delete(pvVar3,*(long *)((long)pvVar6 + -0x20) - (long)pvVar3);
        }
        pvVar6 = (void *)((long)pvVar6 + -0x38);
      } while (pvVar6 != pvVar4);
      pvVar3 = (void *)param_1[0x18];
    }
    param_1[0x19] = pvVar4;
    operator_delete(pvVar3,param_1[0x1a] - (long)pvVar3);
  }
  pvVar4 = (void *)param_1[0x15];
  if (pvVar4 != (void *)0x0) {
    param_1[0x16] = pvVar4;
    operator_delete(pvVar4,param_1[0x17] - (long)pvVar4);
  }
  pvVar4 = (void *)param_1[0x12];
  if (pvVar4 != (void *)0x0) {
    param_1[0x13] = pvVar4;
    operator_delete(pvVar4,param_1[0x14] - (long)pvVar4);
  }
  pvVar4 = (void *)param_1[0xf];
  if (pvVar4 != (void *)0x0) {
    param_1[0x10] = pvVar4;
    operator_delete(pvVar4,param_1[0x11] - (long)pvVar4);
  }
  pvVar4 = (void *)param_1[0xc];
  if (pvVar4 != (void *)0x0) {
    param_1[0xd] = pvVar4;
    operator_delete(pvVar4,param_1[0xe] - (long)pvVar4);
  }
  pvVar4 = (void *)param_1[9];
  if (pvVar4 != (void *)0x0) {
    param_1[10] = pvVar4;
    operator_delete(pvVar4,param_1[0xb] - (long)pvVar4);
  }
  pvVar4 = (void *)param_1[6];
  if (pvVar4 != (void *)0x0) {
    param_1[7] = pvVar4;
    operator_delete(pvVar4,param_1[8] - (long)pvVar4);
  }
  pvVar4 = (void *)param_1[1];
  if (pvVar4 == (void *)0x0) {
    return;
  }
  pvVar6 = (void *)param_1[2];
  pvVar3 = pvVar4;
  if (pvVar4 != pvVar6) {
    do {
      pvVar6 = (void *)((long)pvVar6 + -0x88);
      FUN_00873e90(pvVar6);
    } while (pvVar6 != pvVar4);
    pvVar3 = (void *)param_1[1];
  }
  param_1[2] = pvVar4;
  operator_delete(pvVar3,param_1[3] - (long)pvVar3);
  return;
}

