/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00824558
 */

undefined8 * FUN_00824558(undefined8 *param_1,undefined8 *param_2)

{
  undefined1 uVar1;
  long lVar2;
  void *pvVar3;
  long *plVar4;
  long lVar5;
  __shared_weak_count *this;
  void *pvVar6;
  undefined8 *puVar7;
  void *pvVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  
  uVar10 = param_2[1];
  uVar9 = *param_2;
  *param_2 = 0;
  param_2[1] = 0;
  this = (__shared_weak_count *)param_1[1];
  param_1[1] = uVar10;
  *param_1 = uVar9;
  if ((this != (__shared_weak_count *)0x0) &&
     (lVar2 = FUN_00c2bd10(0xffffffffffffffff,this + 8), lVar2 == 0)) {
    (**(code **)(*(long *)this + 0x10))(this);
    std::__ndk1::__shared_weak_count::__release_weak(this);
  }
  param_1[2] = param_2[2];
  if ((*(byte *)(param_1 + 3) & 1) != 0) {
    operator_delete((void *)param_1[5],param_1[3] & 0xfffffffffffffffe);
  }
  uVar10 = param_2[4];
  uVar9 = param_2[3];
  param_1[5] = param_2[5];
  param_1[4] = uVar10;
  param_1[3] = uVar9;
  *(undefined2 *)(param_2 + 3) = 0;
  puVar7 = param_1 + 7;
  FUN_00827168(param_1 + 6,*puVar7);
  plVar4 = param_2 + 7;
  lVar2 = *plVar4;
  lVar5 = param_2[8];
  param_1[6] = param_2[6];
  param_1[7] = lVar2;
  param_1[8] = lVar5;
  if (lVar5 == 0) {
    param_1[6] = puVar7;
  }
  else {
    *(undefined8 **)(lVar2 + 0x10) = puVar7;
    param_2[6] = plVar4;
    *plVar4 = 0;
    param_2[8] = 0;
  }
  if ((*(byte *)(param_1 + 10) & 1) != 0) {
    operator_delete((void *)param_1[0xc],param_1[10] & 0xfffffffffffffffe);
  }
  uVar10 = param_2[0xb];
  uVar9 = param_2[10];
  param_1[0xc] = param_2[0xc];
  param_1[0xb] = uVar10;
  param_1[10] = uVar9;
  *(undefined2 *)(param_2 + 10) = 0;
  uVar1 = *(undefined1 *)(param_2 + 0xe);
  puVar7 = param_1 + 0xf;
  pvVar8 = (void *)*puVar7;
  param_1[0xd] = param_2[0xd];
  *(undefined1 *)(param_1 + 0xe) = uVar1;
  if (pvVar8 != (void *)0x0) {
    pvVar6 = (void *)param_1[0x10];
    pvVar3 = pvVar8;
    if (pvVar8 != pvVar6) {
      do {
        pvVar6 = (void *)((long)pvVar6 + -0x78);
        FUN_008271dc(pvVar6);
      } while (pvVar6 != pvVar8);
      pvVar3 = (void *)*puVar7;
    }
    param_1[0x10] = pvVar8;
    operator_delete(pvVar3,param_1[0x11] - (long)pvVar3);
    *puVar7 = 0;
    param_1[0x10] = 0;
    param_1[0x11] = 0;
  }
  uVar9 = param_2[0xf];
  param_1[0x10] = param_2[0x10];
  param_1[0xf] = uVar9;
  param_1[0x11] = param_2[0x11];
  param_2[0xf] = 0;
  param_2[0x10] = 0;
  param_2[0x11] = 0;
  *(undefined4 *)(param_1 + 0x12) = *(undefined4 *)(param_2 + 0x12);
  if ((*(byte *)(param_1 + 0x13) & 1) != 0) {
    operator_delete((void *)param_1[0x15],param_1[0x13] & 0xfffffffffffffffe);
  }
  uVar10 = param_2[0x14];
  uVar9 = param_2[0x13];
  param_1[0x15] = param_2[0x15];
  param_1[0x14] = uVar10;
  param_1[0x13] = uVar9;
  *(undefined2 *)(param_2 + 0x13) = 0;
  if ((*(byte *)(param_1 + 0x16) & 1) != 0) {
    operator_delete((void *)param_1[0x18],param_1[0x16] & 0xfffffffffffffffe);
  }
  uVar10 = param_2[0x17];
  uVar9 = param_2[0x16];
  param_1[0x18] = param_2[0x18];
  param_1[0x17] = uVar10;
  param_1[0x16] = uVar9;
  *(undefined2 *)(param_2 + 0x16) = 0;
  if ((*(byte *)(param_1 + 0x19) & 1) != 0) {
    operator_delete((void *)param_1[0x1b],param_1[0x19] & 0xfffffffffffffffe);
  }
  uVar10 = param_2[0x1a];
  uVar9 = param_2[0x19];
  param_1[0x1b] = param_2[0x1b];
  param_1[0x1a] = uVar10;
  param_1[0x19] = uVar9;
  *(undefined2 *)(param_2 + 0x19) = 0;
  if ((*(byte *)(param_1 + 0x1c) & 1) != 0) {
    operator_delete((void *)param_1[0x1e],param_1[0x1c] & 0xfffffffffffffffe);
  }
  uVar10 = param_2[0x1d];
  uVar9 = param_2[0x1c];
  param_1[0x1e] = param_2[0x1e];
  param_1[0x1d] = uVar10;
  param_1[0x1c] = uVar9;
  uVar10 = param_2[0x20];
  uVar9 = param_2[0x1f];
  *(undefined2 *)(param_2 + 0x1c) = 0;
  param_1[0x21] = param_2[0x21];
  param_1[0x20] = uVar10;
  param_1[0x1f] = uVar9;
  return param_1;
}

