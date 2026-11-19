/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00857f44
 */

void FUN_00857f44(long param_1)

{
  void *pvVar1;
  undefined8 *puVar2;
  void *pvVar3;
  undefined8 *puVar4;
  int *piVar5;
  int *piVar6;
  undefined8 *puVar7;
  void *pvVar8;
  
  if (*(void **)(param_1 + 0x4b0) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x4b0));
    *(undefined8 *)(param_1 + 0x4b0) = 0;
    operator_delete(*(void **)(param_1 + 0x4c8));
    *(undefined8 *)(param_1 + 0x4c8) = 0;
    *(undefined8 *)(param_1 + 0x4c0) = 0;
    *(undefined8 *)(param_1 + 0x4b8) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x4d0) = 0;
    *(undefined1 *)(param_1 + 0x4e0) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x4c8));
  if ((*(byte *)(param_1 + 0x498) & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x4a8),*(ulong *)(param_1 + 0x498) & 0xfffffffffffffffe);
  }
  pvVar1 = *(void **)(param_1 + 0x480);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x488) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x490) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x468);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x470) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x478) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x450);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x458) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x460) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x438);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x440) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x448) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x420);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x428) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x430) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x408);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x410) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x418) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x3f0);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x3f8) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x400) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x3d8);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x3e0) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 1000) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x3c0);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x3c8) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x3d0) - (long)pvVar1);
  }
  piVar5 = *(int **)(param_1 + 0x3a8);
  if (piVar5 != (int *)0x0) {
    piVar6 = *(int **)(param_1 + 0x3b0);
    while (piVar6 != piVar5) {
                    /* try { // try from 008580b0 to 008580b7 has its CatchHandler @ 008583ec */
      (*(code *)(&PTR_LAB_00c4a6d8)[piVar6[-0x16]])(piVar6 + -0x14);
      piVar6 = piVar6 + -0x16;
    }
    *(int **)(param_1 + 0x3b0) = piVar5;
    operator_delete(*(void **)(param_1 + 0x3a8),
                    *(long *)(param_1 + 0x3b8) - (long)*(void **)(param_1 + 0x3a8));
  }
  pvVar1 = *(void **)(param_1 + 0x390);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x398) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x3a0) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x378);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x380) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x388) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x360);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x368) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x370) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x348);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x350) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x358) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x330);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x338) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x340) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x318);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 800) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x328) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x300);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x308) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x310) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x2e8);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x2f0) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x2f8) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x2d0);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x2d8) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x2e0) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x2b8);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x2c0) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x2c8) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x2a0);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x2a8) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x2b0) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x288);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x290) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x298) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x270);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x278) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x280) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 600);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x260) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x268) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x240);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x248) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x250) - (long)pvVar1);
  }
  if (*(void **)(param_1 + 0x200) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x200));
    *(undefined8 *)(param_1 + 0x200) = 0;
    operator_delete(*(void **)(param_1 + 0x218));
    *(undefined8 *)(param_1 + 0x218) = 0;
    *(undefined8 *)(param_1 + 0x210) = 0;
    *(undefined8 *)(param_1 + 0x208) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x220) = 0;
    *(undefined1 *)(param_1 + 0x230) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x218));
  pvVar1 = *(void **)(param_1 + 0x1e8);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x1f0) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x1f8) - (long)pvVar1);
  }
  puVar7 = *(undefined8 **)(param_1 + 0x1d0);
  if (puVar7 != (undefined8 *)0x0) {
    puVar4 = *(undefined8 **)(param_1 + 0x1d8);
    puVar2 = puVar7;
    if (puVar7 != puVar4) {
      do {
        puVar4 = puVar4 + -6;
        (**(code **)*puVar4)(puVar4);
      } while (puVar4 != puVar7);
      puVar2 = *(undefined8 **)(param_1 + 0x1d0);
    }
    *(undefined8 **)(param_1 + 0x1d8) = puVar7;
    operator_delete(puVar2,*(long *)(param_1 + 0x1e0) - (long)puVar2);
  }
  pvVar1 = *(void **)(param_1 + 0x1b8);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x1c0) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x1c8) - (long)pvVar1);
  }
  if (*(void **)(param_1 + 0x180) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x180));
    *(undefined8 *)(param_1 + 0x180) = 0;
    operator_delete(*(void **)(param_1 + 0x198));
    *(undefined8 *)(param_1 + 0x188) = 0;
    *(undefined8 *)(param_1 + 400) = 0;
    *(undefined8 *)(param_1 + 0x198) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x1a0) = 0;
    *(undefined1 *)(param_1 + 0x1b0) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x198));
  pvVar1 = *(void **)(param_1 + 0x158);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x160) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x168) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x108);
  if (pvVar1 != (void *)0x0) {
    pvVar8 = *(void **)(param_1 + 0x110);
    pvVar3 = pvVar1;
    if (pvVar1 != pvVar8) {
      do {
        if ((*(byte *)((long)pvVar8 + -0x18) & 1) != 0) {
          operator_delete(*(void **)((long)pvVar8 + -8),
                          *(ulong *)((long)pvVar8 + -0x18) & 0xfffffffffffffffe);
        }
        pvVar8 = (void *)((long)pvVar8 + -0x30);
      } while (pvVar8 != pvVar1);
      pvVar3 = *(void **)(param_1 + 0x108);
    }
    *(void **)(param_1 + 0x110) = pvVar1;
    operator_delete(pvVar3,*(long *)(param_1 + 0x118) - (long)pvVar3);
  }
  pvVar1 = *(void **)(param_1 + 0xf0);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0xf8) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x100) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0xd0);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0xd8) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0xe0) - (long)pvVar1);
  }
  FUN_00807360(param_1 + 8);
  return;
}

