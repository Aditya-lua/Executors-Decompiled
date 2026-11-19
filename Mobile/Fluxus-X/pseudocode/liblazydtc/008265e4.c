/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008265e4
 */

void FUN_008265e4(undefined8 *param_1)

{
  long lVar1;
  long lVar2;
  void *pvVar3;
  undefined8 *puVar5;
  long lVar4;
  undefined8 uVar6;
  ulong uVar7;
  __shared_weak_count *this;
  undefined8 *puVar8;
  undefined8 *puVar9;
  long *plVar10;
  
  puVar5 = (undefined8 *)param_1[1];
  puVar9 = (undefined8 *)param_1[2];
  puVar8 = puVar5;
  if (puVar9 != puVar5) {
    uVar7 = param_1[4];
    plVar10 = puVar5 + (uVar7 >> 8);
    lVar4 = *plVar10 + (uVar7 & 0xff) * 0x10;
    lVar1 = puVar5[param_1[5] + uVar7 >> 8] + (param_1[5] + uVar7 & 0xff) * 0x10;
    puVar5 = puVar9;
    if (lVar4 != lVar1) {
      do {
        this = *(__shared_weak_count **)(lVar4 + 8);
        if ((this != (__shared_weak_count *)0x0) &&
           (lVar2 = FUN_00c2bd10(0xffffffffffffffff,this + 8), lVar2 == 0)) {
          (**(code **)(*(long *)this + 0x10))(this);
          std::__ndk1::__shared_weak_count::__release_weak(this);
        }
        lVar4 = lVar4 + 0x10;
        if (lVar4 - *plVar10 == 0x1000) {
          plVar10 = plVar10 + 1;
          lVar4 = *plVar10;
        }
      } while (lVar4 != lVar1);
      puVar8 = (undefined8 *)param_1[1];
      puVar5 = (undefined8 *)param_1[2];
    }
    puVar9 = puVar5;
  }
  param_1[5] = 0;
  lVar4 = (long)puVar5 - (long)puVar8;
  while (uVar7 = lVar4 >> 3, 2 < uVar7) {
    operator_delete((void *)*puVar8,0x1000);
    puVar9 = (undefined8 *)param_1[2];
    puVar8 = (undefined8 *)(param_1[1] + 8);
    param_1[1] = puVar8;
    lVar4 = (long)puVar9 - (long)puVar8;
  }
  if (uVar7 == 1) {
    uVar6 = 0x80;
  }
  else {
    if (uVar7 != 2) goto LAB_00826708;
    uVar6 = 0x100;
  }
  param_1[4] = uVar6;
LAB_00826708:
  if (puVar8 != puVar9) {
    do {
      puVar5 = puVar8 + 1;
      operator_delete((void *)*puVar8,0x1000);
      puVar8 = puVar5;
    } while (puVar5 != puVar9);
    lVar4 = param_1[1] - param_1[2];
    if (lVar4 != 0) {
      param_1[2] = param_1[2] + (lVar4 + 7U & 0xfffffffffffffff8);
    }
  }
  pvVar3 = (void *)*param_1;
  if (pvVar3 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar3,param_1[3] - (long)pvVar3);
  return;
}

