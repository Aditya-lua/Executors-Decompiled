/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084c38c
 */

void FUN_0084c38c(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  size_t __n;
  ulong uVar3;
  undefined8 *puVar4;
  void *pvVar5;
  long lVar6;
  ulong uVar7;
  undefined8 *puVar8;
  ulong uVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  ulong uVar12;
  undefined8 *__src;
  undefined8 *puVar13;
  ulong uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  
  puVar13 = (undefined8 *)param_1[2];
  if (puVar13 != (undefined8 *)param_1[3]) goto LAB_0084c4e4;
  puVar2 = (undefined8 *)*param_1;
  __src = (undefined8 *)param_1[1];
  if (puVar2 <= __src && (long)__src - (long)puVar2 != 0) {
    __n = (long)puVar13 - (long)__src;
    lVar6 = (((long)__src - (long)puVar2 >> 3) + 1) / 2;
    puVar13 = __src + -lVar6;
    if (__n != 0) {
      memmove(puVar13,__src,__n);
      __src = (undefined8 *)param_1[1];
    }
    puVar13 = (undefined8 *)((long)puVar13 + __n);
    param_1[1] = __src + -lVar6;
    goto LAB_0084c4e4;
  }
  uVar3 = (long)puVar13 - (long)puVar2;
  uVar7 = (long)uVar3 >> 2;
  if (uVar3 == 0) {
    uVar7 = 1;
  }
  if (uVar7 >> 0x3d != 0) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe1b8();
  }
  uVar14 = uVar7 >> 2;
  pvVar5 = operator_new(uVar7 * 8);
  puVar1 = (undefined8 *)((long)pvVar5 + uVar14 * 8);
  lVar6 = (long)puVar13 - (long)__src;
  puVar13 = puVar1;
  if (lVar6 != 0) {
    puVar13 = (undefined8 *)((long)puVar1 + lVar6);
    if (lVar6 - 8U < 0x38) {
      puVar8 = puVar1;
    }
    else {
      puVar8 = puVar1;
      if (0x1f < (long)pvVar5 + (uVar14 * 8 - (long)__src)) {
        puVar10 = __src + 2;
        puVar11 = (undefined8 *)((long)pvVar5 + uVar14 * 8 + 0x10);
        uVar14 = (lVar6 - 8U >> 3) + 1;
        uVar9 = uVar14 & 0x3ffffffffffffffc;
        puVar8 = puVar1 + uVar9;
        __src = __src + uVar9;
        uVar12 = uVar9;
        do {
          puVar4 = puVar10 + -1;
          uVar15 = puVar10[-2];
          uVar17 = puVar10[1];
          uVar16 = *puVar10;
          uVar12 = uVar12 - 4;
          puVar10 = puVar10 + 4;
          puVar11[-1] = *puVar4;
          puVar11[-2] = uVar15;
          puVar11[1] = uVar17;
          *puVar11 = uVar16;
          puVar11 = puVar11 + 4;
        } while (uVar12 != 0);
        if (uVar14 == uVar9) goto LAB_0084c4c8;
      }
    }
    do {
      puVar10 = puVar8 + 1;
      *puVar8 = *__src;
      puVar8 = puVar10;
      __src = __src + 1;
    } while (puVar10 != puVar13);
  }
LAB_0084c4c8:
  *param_1 = pvVar5;
  param_1[1] = puVar1;
  param_1[2] = puVar13;
  param_1[3] = (void *)((long)pvVar5 + uVar7 * 8);
  if (puVar2 != (undefined8 *)0x0) {
    operator_delete(puVar2,uVar3);
    puVar13 = (undefined8 *)param_1[2];
  }
LAB_0084c4e4:
  *puVar13 = *param_2;
  param_1[2] = puVar13 + 1;
  return;
}

