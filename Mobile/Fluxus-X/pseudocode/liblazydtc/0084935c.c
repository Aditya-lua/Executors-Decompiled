/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084935c
 */

void FUN_0084935c(long param_1,undefined1 param_2)

{
  undefined1 *puVar1;
  undefined8 *puVar2;
  undefined1 uVar3;
  void *pvVar4;
  long *plVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  long lVar8;
  undefined8 uVar9;
  ulong uVar10;
  ulong uVar11;
  void *pvVar12;
  ulong uVar13;
  void *__dest;
  size_t __n;
  long lVar14;
  undefined8 *puVar15;
  undefined1 *puVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined1 auVar21 [16];
  
  if (*(char *)(param_1 + 0xa5) == '\x01') {
    uVar3 = (**(code **)(**(long **)(param_1 + 0x18) + 0x28))();
    puVar1 = *(undefined1 **)(param_1 + 0x48);
    if (puVar1 < *(undefined1 **)(param_1 + 0x50)) {
      puVar16 = puVar1 + 1;
      *puVar1 = uVar3;
      goto LAB_008494a8;
    }
    pvVar12 = *(void **)(param_1 + 0x40);
    __n = (long)puVar1 - (long)pvVar12;
    uVar10 = __n + 1;
    if ((long)uVar10 < 0) {
LAB_008494c4:
      auVar21 = FUN_00815830();
      puVar6 = auVar21._8_8_;
      plVar5 = auVar21._0_8_;
      puVar2 = (undefined8 *)plVar5[1];
      if (puVar2 < (undefined8 *)plVar5[2]) {
        uVar9 = puVar6[1];
        uVar7 = *puVar6;
        puVar15 = puVar2 + 6;
        puVar2[2] = puVar6[2];
        puVar2[1] = uVar9;
        *puVar2 = uVar7;
        uVar9 = puVar6[4];
        uVar7 = puVar6[3];
        puVar6[1] = 0;
        puVar6[2] = 0;
        *puVar6 = 0;
        puVar2[5] = puVar6[5];
        puVar2[4] = uVar9;
        puVar2[3] = uVar7;
        puVar6[4] = 0;
        puVar6[5] = 0;
        puVar6[3] = 0;
LAB_00849600:
        plVar5[1] = (long)puVar15;
        return;
      }
      lVar14 = (long)puVar2 - *plVar5;
      uVar10 = (lVar14 >> 4) * -0x5555555555555555 + 1;
      if (uVar10 < 0x555555555555556) {
        lVar8 = plVar5[2] - *plVar5 >> 4;
        uVar11 = lVar8 * 0x5555555555555556;
        if (uVar11 <= uVar10) {
          uVar11 = uVar10;
        }
        if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar8 * -0x5555555555555555)) {
          uVar11 = 0x555555555555555;
        }
        if (uVar11 < 0x555555555555556) {
          pvVar4 = operator_new(uVar11 * 0x30);
          uVar18 = puVar6[1];
          uVar17 = *puVar6;
          *puVar6 = 0;
          puVar6[1] = 0;
          puVar2 = (undefined8 *)((long)pvVar4 + lVar14);
          uVar7 = puVar6[2];
          uVar20 = puVar6[4];
          uVar19 = puVar6[3];
          puVar6[2] = 0;
          puVar6[3] = 0;
          uVar9 = puVar6[5];
          puVar15 = puVar2 + 6;
          puVar6[4] = 0;
          puVar6[5] = 0;
          pvVar12 = (void *)*plVar5;
          lVar14 = plVar5[1];
          puVar2[1] = uVar18;
          *puVar2 = uVar17;
          puVar2[2] = uVar7;
          puVar2[5] = uVar9;
          puVar2[4] = uVar20;
          puVar2[3] = uVar19;
          __dest = (void *)((long)puVar2 - (lVar14 - (long)pvVar12));
          memcpy(__dest,pvVar12,lVar14 - (long)pvVar12);
          lVar14 = plVar5[2];
          *plVar5 = (long)__dest;
          plVar5[1] = (long)puVar15;
          plVar5[2] = (long)((long)pvVar4 + uVar11 * 0x30);
          if (pvVar12 != (void *)0x0) {
            operator_delete(pvVar12,lVar14 - (long)pvVar12);
          }
          goto LAB_00849600;
        }
      }
      else {
        FUN_008497dc();
      }
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
    uVar13 = (long)*(undefined1 **)(param_1 + 0x50) - (long)pvVar12;
    uVar11 = uVar13 * 2;
    if (uVar13 * 2 <= uVar10) {
      uVar11 = uVar10;
    }
    if (0x3ffffffffffffffe < uVar13) {
      uVar11 = 0x7fffffffffffffff;
    }
    if (uVar11 == 0) {
      pvVar4 = (void *)0x0;
    }
    else {
      pvVar4 = operator_new(uVar11);
    }
    puVar16 = (undefined1 *)((long)pvVar4 + __n);
    lVar14 = (long)pvVar4 + uVar11;
    *puVar16 = uVar3;
  }
  else {
    puVar1 = *(undefined1 **)(param_1 + 0x48);
    if (puVar1 < *(undefined1 **)(param_1 + 0x50)) {
      puVar16 = puVar1 + 1;
      *puVar1 = param_2;
      goto LAB_008494a8;
    }
    pvVar12 = *(void **)(param_1 + 0x40);
    __n = (long)puVar1 - (long)pvVar12;
    uVar10 = __n + 1;
    if ((long)uVar10 < 0) goto LAB_008494c4;
    uVar13 = (long)*(undefined1 **)(param_1 + 0x50) - (long)pvVar12;
    uVar11 = uVar13 * 2;
    if (uVar13 * 2 <= uVar10) {
      uVar11 = uVar10;
    }
    if (0x3ffffffffffffffe < uVar13) {
      uVar11 = 0x7fffffffffffffff;
    }
    if (uVar11 == 0) {
      pvVar4 = (void *)0x0;
    }
    else {
      pvVar4 = operator_new(uVar11);
    }
    puVar16 = (undefined1 *)((long)pvVar4 + __n);
    lVar14 = (long)pvVar4 + uVar11;
    *puVar16 = param_2;
  }
  puVar16 = puVar16 + 1;
  memcpy(pvVar4,pvVar12,__n);
  *(void **)(param_1 + 0x40) = pvVar4;
  *(undefined1 **)(param_1 + 0x48) = puVar16;
  *(long *)(param_1 + 0x50) = lVar14;
  if (pvVar12 != (void *)0x0) {
    operator_delete(pvVar12,uVar13);
  }
LAB_008494a8:
  *(undefined1 **)(param_1 + 0x48) = puVar16;
  return;
}

