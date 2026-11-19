/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087bad0
 */

void FUN_0087bad0(long *param_1)

{
  ulong uVar1;
  ulong uVar2;
  uint uVar3;
  void *__s;
  long *plVar4;
  long *plVar5;
  ulong uVar6;
  undefined8 *puVar7;
  ulong uVar8;
  ulong uVar9;
  int *piVar10;
  ulong uVar11;
  ulong uVar12;
  undefined1 uVar13;
  ulong uVar14;
  ulong uVar15;
  int *piVar16;
  ulong *puVar17;
  ulong uVar18;
  void *pvVar19;
  ulong uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  
  uVar1 = 0x10;
  if (param_1[4] != 0) {
    uVar1 = param_1[4] << 1;
  }
  if (uVar1 == 0) {
    uVar15 = 0;
    plVar4 = (long *)0x0;
    __s = (void *)0x0;
    uVar14 = 0x40;
    uVar13 = 0x40;
    uVar2 = param_1[2];
    puVar17 = (ulong *)param_1[3];
    plVar5 = param_1;
  }
  else {
    uVar15 = uVar1;
    if (uVar1 < 0x41) {
      uVar15 = 0x40;
    }
    uVar15 = uVar15 >> 6;
    __s = operator_new(uVar15 << 3);
    memset(__s,0,uVar15 << 3);
                    /* try { // try from 0087bb40 to 0087bb43 has its CatchHandler @ 0087bdb8 */
    plVar4 = operator_new(uVar1 * 0x30);
    uVar2 = (uVar1 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar1 & 0x5555555555555555) << 1;
    uVar2 = (uVar2 & 0xcccccccccccccccc) >> 2 | (uVar2 & 0x3333333333333333) << 2;
    uVar2 = (uVar2 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar2 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar2 = (uVar2 & 0xff00ff00ff00ff00) >> 8 | (uVar2 & 0xff00ff00ff00ff) << 8;
    uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
    uVar3 = 0x40 - (int)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20);
    uVar14 = (ulong)uVar3;
    uVar13 = (undefined1)uVar3;
    uVar2 = param_1[2];
    puVar17 = (ulong *)param_1[3];
    plVar5 = plVar4;
  }
  if (uVar2 == 0) {
LAB_0087bd40:
    pvVar19 = (void *)*param_1;
  }
  else {
    uVar13 = (undefined1)uVar14;
    uVar20 = *puVar17;
    if (uVar20 == 0) {
      uVar18 = 0;
      do {
        if (uVar2 - 1 == uVar18) goto LAB_0087bd40;
        uVar20 = puVar17[uVar18 + 1];
        uVar18 = uVar18 + 1;
      } while (uVar20 == 0);
    }
    else {
      uVar18 = 0;
    }
    uVar8 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
    uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
    uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
    uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
    pvVar19 = (void *)*param_1;
    uVar8 = LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) | uVar18 << 6;
    do {
      do {
        piVar16 = (int *)((long)pvVar19 + uVar8 * 0x30);
        plVar5 = (long *)FUN_0087337c(plVar5,piVar16);
        uVar6 = (ulong)((long)plVar5 * -0x61c8864680b583eb) >> (uVar14 & 0x3f);
        uVar9 = uVar6 >> 6;
        uVar11 = 1L << (uVar6 & 0x3f);
        uVar12 = *(ulong *)((long)__s + uVar9 * 8);
        if ((uVar11 & uVar12) != 0) {
          do {
            piVar10 = (int *)(plVar4 + uVar6 * 6);
            if ((((*piVar10 == *piVar16) && (*(long *)(piVar10 + 2) == *(long *)(piVar16 + 2))) &&
                (*(long *)(piVar10 + 4) == *(long *)(piVar16 + 4))) &&
               ((*(long *)(piVar10 + 6) == *(long *)(piVar16 + 6) &&
                (*(long *)(piVar10 + 8) == *(long *)(piVar16 + 8))))) {
              uVar9 = uVar6 >> 6;
              uVar11 = 1L << (uVar6 & 0x3f);
              break;
            }
            uVar6 = uVar6 + 1 & uVar1 - 1;
            uVar9 = uVar6 >> 6;
            uVar11 = 1L << (uVar6 & 0x3f);
          } while ((*(ulong *)((long)__s + uVar9 * 8) & uVar11) != 0);
          uVar12 = *(ulong *)((long)__s + uVar9 * 8);
        }
        puVar7 = plVar4 + uVar6 * 6;
        *(ulong *)((long)__s + uVar9 * 8) = uVar12 | uVar11;
        uVar23 = *(undefined8 *)(piVar16 + 4);
        uVar22 = *(undefined8 *)(piVar16 + 10);
        uVar21 = *(undefined8 *)(piVar16 + 8);
        uVar25 = *(undefined8 *)(piVar16 + 2);
        uVar24 = *(undefined8 *)piVar16;
        uVar20 = uVar20 - 1 & uVar20;
        puVar7[3] = *(undefined8 *)(piVar16 + 6);
        puVar7[2] = uVar23;
        puVar7[5] = uVar22;
        puVar7[4] = uVar21;
        puVar7[1] = uVar25;
        *puVar7 = uVar24;
        if (uVar20 == 0) {
          uVar9 = uVar18;
          uVar6 = uVar2;
          if (uVar2 <= uVar18 + 1) {
            uVar6 = uVar18 + 1;
          }
          do {
            uVar18 = uVar9 + 1;
            if (uVar2 <= uVar18) {
              uVar20 = 0;
              uVar18 = uVar6;
              goto LAB_0087bbfc;
            }
            uVar20 = puVar17[uVar9 + 1];
            uVar9 = uVar18;
          } while (uVar20 == 0);
        }
        uVar8 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
        uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
        uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
        uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
        uVar8 = LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) | uVar18 << 6;
      } while (uVar20 != 0);
LAB_0087bbfc:
    } while (uVar18 != uVar2);
  }
  *param_1 = (long)plVar4;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  operator_delete((void *)0x0);
  param_1[2] = uVar15;
  param_1[3] = (long)__s;
  param_1[1] = uVar1;
  operator_delete((void *)0x0);
  operator_delete((void *)0x0);
  param_1[4] = uVar1;
  *(undefined1 *)(param_1 + 6) = uVar13;
  if (pvVar19 != (void *)0x0) {
    operator_delete(pvVar19);
    operator_delete(puVar17);
    operator_delete((void *)0x0);
    puVar17 = (ulong *)0x0;
  }
  operator_delete(puVar17);
  return;
}

