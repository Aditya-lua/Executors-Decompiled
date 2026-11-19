/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089f75c
 */

/* WARNING: Removing unreachable block (ram,0x0089f940) */

void FUN_0089f75c(long *param_1)

{
  ulong uVar1;
  ulong uVar2;
  uint uVar3;
  void *__s;
  void *pvVar4;
  ulong *puVar5;
  ulong uVar6;
  ulong *puVar7;
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
  
  uVar1 = 0x10;
  if (param_1[4] != 0) {
    uVar1 = param_1[4] << 1;
  }
  if (uVar1 == 0) {
    uVar17 = 0;
    __s = (void *)0x0;
    pvVar4 = (void *)0x0;
    uVar19 = 0x40;
    uVar18 = 0x40;
    uVar2 = param_1[2];
    puVar15 = (ulong *)param_1[3];
  }
  else {
    uVar17 = uVar1;
    if (uVar1 < 0x41) {
      uVar17 = 0x40;
    }
    uVar17 = uVar17 >> 6;
    __s = operator_new(uVar17 << 3);
    memset(__s,0,uVar17 << 3);
                    /* try { // try from 0089f7c4 to 0089f7c7 has its CatchHandler @ 0089f9b4 */
    pvVar4 = operator_new(uVar1 * 0x30);
    uVar2 = (uVar1 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar1 & 0x5555555555555555) << 1;
    uVar2 = (uVar2 & 0xcccccccccccccccc) >> 2 | (uVar2 & 0x3333333333333333) << 2;
    uVar2 = (uVar2 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar2 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar2 = (uVar2 & 0xff00ff00ff00ff00) >> 8 | (uVar2 & 0xff00ff00ff00ff) << 8;
    uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
    uVar3 = 0x40 - (int)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20);
    uVar18 = (undefined1)uVar3;
    uVar19 = (ulong)uVar3;
    uVar2 = param_1[2];
    puVar15 = (ulong *)param_1[3];
  }
  if (uVar2 == 0) {
LAB_0089f944:
    pvVar16 = (void *)*param_1;
  }
  else {
    uVar18 = (undefined1)uVar19;
    uVar13 = *puVar15;
    if (uVar13 == 0) {
      uVar12 = 0;
      do {
        if (uVar2 - 1 == uVar12) goto LAB_0089f944;
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
        puVar5 = (ulong *)((long)pvVar16 + uVar14 * 0x30);
        uVar10 = *puVar5;
        uVar6 = (uVar10 >> 4 ^ uVar10 >> 9) * -0x61c8864680b583eb >> (uVar19 & 0x3f);
        uVar8 = uVar6 >> 6;
        uVar9 = 1L << (uVar6 & 0x3f);
        uVar11 = *(ulong *)((long)__s + uVar8 * 8);
        if ((uVar9 & uVar11) != 0) {
          do {
            if (*(ulong *)((long)pvVar4 + uVar6 * 0x30) == uVar10) {
              uVar8 = uVar6 >> 6;
              uVar9 = 1L << (uVar6 & 0x3f);
              break;
            }
            uVar6 = uVar6 + 1 & uVar1 - 1;
            uVar8 = uVar6 >> 6;
            uVar9 = 1L << (uVar6 & 0x3f);
          } while ((*(ulong *)((long)__s + uVar8 * 8) & uVar9) != 0);
          uVar11 = *(ulong *)((long)__s + uVar8 * 8);
        }
        puVar7 = (ulong *)((long)pvVar4 + uVar6 * 0x30);
        *(ulong *)((long)__s + uVar8 * 8) = uVar11 | uVar9;
        uVar9 = puVar5[2];
        uVar8 = puVar5[5];
        uVar6 = puVar5[4];
        uVar11 = puVar5[1];
        uVar10 = *puVar5;
        uVar13 = uVar13 - 1 & uVar13;
        puVar7[3] = puVar5[3];
        puVar7[2] = uVar9;
        puVar7[5] = uVar8;
        puVar7[4] = uVar6;
        puVar7[1] = uVar11;
        *puVar7 = uVar10;
        if (uVar13 == 0) {
          uVar8 = uVar12;
          uVar6 = uVar2;
          if (uVar2 <= uVar12 + 1) {
            uVar6 = uVar12 + 1;
          }
          do {
            uVar12 = uVar8 + 1;
            if (uVar2 <= uVar12) {
              uVar13 = 0;
              goto LAB_0089f928;
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
        uVar6 = uVar12;
      } while (uVar13 != 0);
LAB_0089f928:
      uVar12 = uVar6;
    } while (uVar6 != uVar2);
  }
  *param_1 = (long)pvVar4;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  operator_delete((void *)0x0);
  param_1[2] = uVar17;
  param_1[3] = (long)__s;
  param_1[1] = uVar1;
  operator_delete((void *)0x0);
  operator_delete((void *)0x0);
  param_1[4] = uVar1;
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

