/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00872a50
 */

/* WARNING: Removing unreachable block (ram,0x00872c1c) */

void FUN_00872a50(long *param_1)

{
  ulong *puVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  ulong *puVar5;
  void *__s;
  void *pvVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong *puVar15;
  void *pvVar16;
  ulong uVar17;
  undefined1 uVar18;
  ulong uVar19;
  
  uVar2 = 0x10;
  if (param_1[4] != 0) {
    uVar2 = param_1[4] << 1;
  }
  if (uVar2 == 0) {
    uVar17 = 0;
    __s = (void *)0x0;
    pvVar6 = (void *)0x0;
    uVar19 = 0x40;
    uVar18 = 0x40;
    uVar3 = param_1[2];
    puVar15 = (ulong *)param_1[3];
  }
  else {
    uVar17 = uVar2;
    if (uVar2 < 0x41) {
      uVar17 = 0x40;
    }
    uVar17 = uVar17 >> 6;
    __s = operator_new(uVar17 << 3);
    memset(__s,0,uVar17 << 3);
                    /* try { // try from 00872ab4 to 00872ab7 has its CatchHandler @ 00872c90 */
    pvVar6 = operator_new(uVar2 << 4);
    uVar3 = (uVar2 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar2 & 0x5555555555555555) << 1;
    uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
    uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
    uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
    uVar4 = 0x40 - (int)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20);
    uVar18 = (undefined1)uVar4;
    uVar19 = (ulong)uVar4;
    uVar3 = param_1[2];
    puVar15 = (ulong *)param_1[3];
  }
  if (uVar3 == 0) {
LAB_00872c20:
    pvVar16 = (void *)*param_1;
  }
  else {
    uVar18 = (undefined1)uVar19;
    uVar13 = *puVar15;
    if (uVar13 == 0) {
      uVar12 = 0;
      do {
        if (uVar3 - 1 == uVar12) goto LAB_00872c20;
        uVar13 = puVar15[uVar12 + 1];
        uVar12 = uVar12 + 1;
      } while (uVar13 == 0);
    }
    else {
      uVar12 = 0;
    }
    uVar14 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
    uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
    uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
    uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
    pvVar16 = (void *)*param_1;
    uVar14 = LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) | uVar12 << 6;
    do {
      do {
        puVar1 = (ulong *)((long)pvVar16 + uVar14 * 0x10);
        uVar10 = *puVar1;
        uVar7 = (uVar10 >> 4 ^ uVar10 >> 9) * -0x61c8864680b583eb >> (uVar19 & 0x3f);
        uVar8 = uVar7 >> 6;
        uVar9 = 1L << (uVar7 & 0x3f);
        uVar11 = *(ulong *)((long)__s + uVar8 * 8);
        if ((uVar9 & uVar11) != 0) {
          do {
            if (*(ulong *)((long)pvVar6 + uVar7 * 0x10) == uVar10) {
              uVar8 = uVar7 >> 6;
              uVar9 = 1L << (uVar7 & 0x3f);
              break;
            }
            uVar7 = uVar7 + 1 & uVar2 - 1;
            uVar8 = uVar7 >> 6;
            uVar9 = 1L << (uVar7 & 0x3f);
          } while ((*(ulong *)((long)__s + uVar8 * 8) & uVar9) != 0);
          uVar11 = *(ulong *)((long)__s + uVar8 * 8);
        }
        *(ulong *)((long)__s + uVar8 * 8) = uVar11 | uVar9;
        uVar8 = *puVar1;
        uVar13 = uVar13 - 1 & uVar13;
        puVar5 = (ulong *)((long)pvVar6 + uVar7 * 0x10);
        puVar5[1] = puVar1[1];
        *puVar5 = uVar8;
        if (uVar13 == 0) {
          uVar8 = uVar12;
          uVar7 = uVar3;
          if (uVar3 <= uVar12 + 1) {
            uVar7 = uVar12 + 1;
          }
          do {
            uVar12 = uVar8 + 1;
            if (uVar3 <= uVar12) {
              uVar13 = 0;
              goto LAB_00872c04;
            }
            uVar13 = puVar15[uVar8 + 1];
            uVar8 = uVar12;
          } while (uVar13 == 0);
        }
        uVar14 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
        uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
        uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
        uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
        uVar14 = LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) | uVar12 << 6;
        uVar7 = uVar12;
      } while (uVar13 != 0);
LAB_00872c04:
      uVar12 = uVar7;
    } while (uVar7 != uVar3);
  }
  *param_1 = (long)pvVar6;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  operator_delete((void *)0x0);
  param_1[2] = uVar17;
  param_1[3] = (long)__s;
  param_1[1] = uVar2;
  operator_delete((void *)0x0);
  operator_delete((void *)0x0);
  param_1[4] = uVar2;
  *(undefined1 *)(param_1 + 6) = uVar18;
  if (pvVar16 != (void *)0x0) {
    operator_delete(pvVar16);
    operator_delete(puVar15);
    operator_delete((void *)0x0);
    puVar15 = (ulong *)0x0;
  }
  operator_delete(puVar15);
  return;
}

