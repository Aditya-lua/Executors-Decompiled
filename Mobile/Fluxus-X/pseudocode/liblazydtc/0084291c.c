/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084291c
 */

void * FUN_0084291c(long param_1,void *param_2,void *param_3)

{
  void *pvVar1;
  undefined8 *puVar2;
  void *pvVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  void *pvVar7;
  long lVar8;
  long lVar9;
  
  lVar8 = *(long *)(param_1 + 0x38);
  pvVar1 = memchr(param_2,10,(long)param_3 - (long)param_2);
  pvVar7 = param_3;
  if (pvVar1 != (void *)0x0) {
    pvVar7 = pvVar1;
  }
  if (pvVar7 == param_2) {
    puVar6 = operator_new(0x10);
    uVar4 = *(undefined8 *)(lVar8 + 8);
    *(undefined8 **)(param_1 + 0x38) = puVar6;
    *puVar6 = &PTR_LAB_00c48b00;
    puVar6[1] = uVar4;
    *(undefined8 **)(lVar8 + 8) = puVar6;
  }
  else {
    FUN_00842620(param_1,param_2,pvVar7);
  }
  if (pvVar7 != param_3) {
    pvVar7 = (void *)((long)pvVar7 + 1);
  }
  if (pvVar7 != param_3) {
    lVar9 = *(long *)(param_1 + 0x38);
    pvVar1 = pvVar7;
    do {
      pvVar3 = memchr(pvVar1,10,(long)param_3 - (long)pvVar1);
      pvVar7 = param_3;
      if (pvVar3 != (void *)0x0) {
        pvVar7 = pvVar3;
      }
      if (pvVar7 == pvVar1) {
        puVar6 = operator_new(0x10);
        uVar4 = *(undefined8 *)(lVar9 + 8);
        *(undefined8 **)(param_1 + 0x38) = puVar6;
        *puVar6 = &PTR_LAB_00c48b00;
        puVar6[1] = uVar4;
        *(undefined8 **)(lVar9 + 8) = puVar6;
      }
      else {
        FUN_00842620(param_1,pvVar1,pvVar7);
        puVar6 = *(undefined8 **)(param_1 + 0x38);
      }
      puVar2 = operator_new(0x18);
      uVar4 = *(undefined8 *)(lVar9 + 8);
      uVar5 = *(undefined8 *)(lVar8 + 8);
      *puVar2 = &PTR_LAB_00c49070;
      puVar2[1] = uVar5;
      puVar2[2] = uVar4;
      *(undefined8 **)(lVar8 + 8) = puVar2;
      *(undefined8 *)(lVar9 + 8) = 0;
      puVar2 = operator_new(0x10);
      uVar4 = puVar6[1];
      *puVar2 = &PTR_LAB_00c48b00;
      puVar2[1] = uVar4;
      *(undefined8 **)(lVar9 + 8) = puVar2;
      puVar6[1] = 0;
      puVar2 = operator_new(0x10);
      uVar4 = *(undefined8 *)(lVar9 + 8);
      *puVar2 = &PTR_LAB_00c490b8;
      puVar2[1] = uVar4;
      puVar6[1] = puVar2;
      if (pvVar7 != param_3) {
        pvVar7 = (void *)((long)pvVar7 + 1);
      }
      lVar9 = *(long *)(lVar9 + 8);
      *(long *)(param_1 + 0x38) = lVar9;
      pvVar1 = pvVar7;
    } while (pvVar7 != param_3);
  }
  return pvVar7;
}

