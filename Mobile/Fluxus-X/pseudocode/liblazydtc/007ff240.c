/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007ff240
 */

void FUN_007ff240(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  undefined8 *__src;
  ulong uVar2;
  void *pvVar3;
  ulong uVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  ulong uVar9;
  undefined8 *__dest;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  puVar1 = (undefined8 *)*param_1;
  __src = (undefined8 *)param_1[1];
  if (__src != puVar1) {
    __dest = __src;
    goto LAB_007ff3a8;
  }
  uVar11 = param_1[2];
  uVar2 = param_1[3];
  if (uVar11 < uVar2) {
    lVar10 = (((long)(uVar2 - uVar11) >> 3) + 1) / 2;
    __dest = __src + lVar10;
    if (uVar11 - (long)__src != 0) {
      memmove(__dest,__src,uVar11 - (long)__src);
      uVar11 = param_1[2];
    }
    param_1[2] = uVar11 + lVar10 * 8;
    goto LAB_007ff3a8;
  }
  uVar2 = uVar2 - (long)__src;
  uVar4 = (long)uVar2 >> 2;
  if (uVar2 == 0) {
    uVar4 = 1;
  }
  if (uVar4 >> 0x3d != 0) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe1b8();
  }
  uVar12 = uVar4 + 3 >> 2;
  pvVar3 = operator_new(uVar4 * 8);
  __dest = (undefined8 *)((long)pvVar3 + uVar12 * 8);
  lVar10 = uVar11 - (long)__src;
  puVar5 = __dest;
  if (lVar10 != 0) {
    puVar5 = (undefined8 *)((long)__dest + lVar10);
    puVar6 = __dest;
    puVar8 = __src;
    if ((0x37 < lVar10 - 8U) && (0x1f < (long)pvVar3 + (uVar12 * 8 - (long)__src))) {
      puVar6 = __src + 2;
      puVar8 = (undefined8 *)((long)pvVar3 + uVar12 * 8 + 0x10);
      uVar11 = (lVar10 - 8U >> 3) + 1;
      uVar9 = uVar11 & 0x3ffffffffffffffc;
      uVar12 = uVar9;
      do {
        puVar7 = puVar6 + -1;
        uVar13 = puVar6[-2];
        uVar15 = puVar6[1];
        uVar14 = *puVar6;
        uVar12 = uVar12 - 4;
        puVar6 = puVar6 + 4;
        puVar8[-1] = *puVar7;
        puVar8[-2] = uVar13;
        puVar8[1] = uVar15;
        *puVar8 = uVar14;
        puVar8 = puVar8 + 4;
      } while (uVar12 != 0);
      puVar6 = __dest + uVar9;
      puVar8 = __src + uVar9;
      if (uVar11 == uVar9) goto LAB_007ff38c;
    }
    do {
      puVar7 = puVar6 + 1;
      *puVar6 = *puVar8;
      puVar6 = puVar7;
      puVar8 = puVar8 + 1;
    } while (puVar7 != puVar5);
  }
LAB_007ff38c:
  *param_1 = pvVar3;
  param_1[1] = __dest;
  param_1[2] = puVar5;
  param_1[3] = (void *)((long)pvVar3 + uVar4 * 8);
  if (__src != (undefined8 *)0x0) {
    operator_delete(puVar1,uVar2);
    __dest = (undefined8 *)param_1[1];
  }
LAB_007ff3a8:
  __dest[-1] = *param_2;
  param_1[1] = __dest + -1;
  return;
}

