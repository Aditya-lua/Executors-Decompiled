/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087151c
 */

/* WARNING: Removing unreachable block (ram,0x008716dc) */

void FUN_0087151c(long *param_1)

{
  ulong uVar1;
  ulong uVar2;
  uint uVar3;
  void *__s;
  void *pvVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong *puVar13;
  void *pvVar14;
  ulong uVar15;
  undefined1 uVar16;
  ulong uVar17;
  
  uVar1 = 0x10;
  if (param_1[4] != 0) {
    uVar1 = param_1[4] << 1;
  }
  if (uVar1 == 0) {
    uVar15 = 0;
    __s = (void *)0x0;
    pvVar4 = (void *)0x0;
    uVar17 = 0x40;
    uVar16 = 0x40;
    uVar2 = param_1[2];
    puVar13 = (ulong *)param_1[3];
  }
  else {
    uVar15 = uVar1;
    if (uVar1 < 0x41) {
      uVar15 = 0x40;
    }
    uVar15 = uVar15 >> 6;
    __s = operator_new(uVar15 << 3);
    memset(__s,0,uVar15 << 3);
                    /* try { // try from 00871580 to 00871583 has its CatchHandler @ 00871750 */
    pvVar4 = operator_new(uVar1 << 3);
    uVar2 = (uVar1 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar1 & 0x5555555555555555) << 1;
    uVar2 = (uVar2 & 0xcccccccccccccccc) >> 2 | (uVar2 & 0x3333333333333333) << 2;
    uVar2 = (uVar2 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar2 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar2 = (uVar2 & 0xff00ff00ff00ff00) >> 8 | (uVar2 & 0xff00ff00ff00ff) << 8;
    uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
    uVar3 = 0x40 - (int)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20);
    uVar16 = (undefined1)uVar3;
    uVar17 = (ulong)uVar3;
    uVar2 = param_1[2];
    puVar13 = (ulong *)param_1[3];
  }
  if (uVar2 == 0) {
LAB_008716e0:
    pvVar14 = (void *)*param_1;
  }
  else {
    uVar16 = (undefined1)uVar17;
    uVar10 = *puVar13;
    if (uVar10 == 0) {
      uVar9 = 0;
      do {
        if (uVar2 - 1 == uVar9) goto LAB_008716e0;
        uVar10 = puVar13[uVar9 + 1];
        uVar9 = uVar9 + 1;
      } while (uVar10 == 0);
    }
    else {
      uVar9 = 0;
    }
    uVar11 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
    uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
    uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
    uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
    pvVar14 = (void *)*param_1;
    uVar11 = LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) | uVar9 << 6;
    do {
      do {
        uVar12 = *(ulong *)((long)pvVar14 + uVar11 * 8);
        uVar5 = (uVar12 >> 4 ^ uVar12 >> 9) * -0x61c8864680b583eb >> (uVar17 & 0x3f);
        uVar6 = uVar5 >> 6;
        uVar7 = 1L << (uVar5 & 0x3f);
        uVar8 = *(ulong *)((long)__s + uVar6 * 8);
        if ((uVar7 & uVar8) != 0) {
          do {
            if (*(ulong *)((long)pvVar4 + uVar5 * 8) == uVar12) {
              uVar6 = uVar5 >> 6;
              uVar7 = 1L << (uVar5 & 0x3f);
              break;
            }
            uVar5 = uVar5 + 1 & uVar1 - 1;
            uVar6 = uVar5 >> 6;
            uVar7 = 1L << (uVar5 & 0x3f);
          } while ((*(ulong *)((long)__s + uVar6 * 8) & uVar7) != 0);
          uVar8 = *(ulong *)((long)__s + uVar6 * 8);
        }
        *(ulong *)((long)__s + uVar6 * 8) = uVar8 | uVar7;
        uVar10 = uVar10 - 1 & uVar10;
        *(ulong *)((long)pvVar4 + uVar5 * 8) = uVar12;
        if (uVar10 == 0) {
          uVar6 = uVar9;
          uVar5 = uVar2;
          if (uVar2 <= uVar9 + 1) {
            uVar5 = uVar9 + 1;
          }
          do {
            uVar9 = uVar6 + 1;
            if (uVar2 <= uVar9) {
              uVar10 = 0;
              goto LAB_008716c4;
            }
            uVar10 = puVar13[uVar6 + 1];
            uVar6 = uVar9;
          } while (uVar10 == 0);
        }
        uVar11 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
        uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
        uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
        uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
        uVar11 = LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) | uVar9 << 6;
        uVar5 = uVar9;
      } while (uVar10 != 0);
LAB_008716c4:
      uVar9 = uVar5;
    } while (uVar5 != uVar2);
  }
  *param_1 = (long)pvVar4;
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
  *(undefined1 *)(param_1 + 6) = uVar16;
  if (pvVar14 != (void *)0x0) {
    operator_delete(pvVar14);
    operator_delete(puVar13);
    operator_delete((void *)0x0);
    puVar13 = (ulong *)0x0;
  }
  operator_delete(puVar13);
  return;
}

