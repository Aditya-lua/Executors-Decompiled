/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a3d9c
 */

/* WARNING: Removing unreachable block (ram,0x008a3f88) */

void FUN_008a3d9c(long *param_1)

{
  long *plVar1;
  long *plVar2;
  ulong uVar3;
  ulong uVar4;
  uint uVar5;
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
  long lVar20;
  
  uVar3 = 0x10;
  if (param_1[4] != 0) {
    uVar3 = param_1[4] << 1;
  }
  if (uVar3 == 0) {
    uVar17 = 0;
    __s = (void *)0x0;
    pvVar6 = (void *)0x0;
    uVar19 = 0x40;
    uVar18 = 0x40;
    uVar4 = param_1[2];
    puVar15 = (ulong *)param_1[3];
  }
  else {
    uVar17 = uVar3;
    if (uVar3 < 0x41) {
      uVar17 = 0x40;
    }
    uVar17 = uVar17 >> 6;
    __s = operator_new(uVar17 << 3);
    memset(__s,0,uVar17 << 3);
                    /* try { // try from 008a3e00 to 008a3e03 has its CatchHandler @ 008a3ffc */
    pvVar6 = operator_new(uVar3 << 4);
    uVar4 = (uVar3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar3 & 0x5555555555555555) << 1;
    uVar4 = (uVar4 & 0xcccccccccccccccc) >> 2 | (uVar4 & 0x3333333333333333) << 2;
    uVar4 = (uVar4 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar4 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
    uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
    uVar5 = 0x40 - (int)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20);
    uVar18 = (undefined1)uVar5;
    uVar19 = (ulong)uVar5;
    uVar4 = param_1[2];
    puVar15 = (ulong *)param_1[3];
  }
  if (uVar4 == 0) {
LAB_008a3f8c:
    pvVar16 = (void *)*param_1;
  }
  else {
    uVar18 = (undefined1)uVar19;
    uVar13 = *puVar15;
    if (uVar13 == 0) {
      uVar11 = 0;
      do {
        if (uVar4 - 1 == uVar11) goto LAB_008a3f8c;
        uVar13 = puVar15[uVar11 + 1];
        uVar11 = uVar11 + 1;
      } while (uVar13 == 0);
    }
    else {
      uVar11 = 0;
    }
    uVar14 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
    uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
    uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
    uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
    pvVar16 = (void *)*param_1;
    uVar14 = LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) | uVar11 << 6;
    do {
      do {
        plVar1 = (long *)((long)pvVar16 + uVar14 * 0x10);
        uVar12 = plVar1[1];
        uVar7 = *plVar1 * -0x40a7b892e31b1a47;
        uVar7 = (uVar12 >> 4 ^ uVar12 >> 9 ^ uVar7 >> 0x1f ^ uVar7) * -0x61c8864680b583eb >>
                (uVar19 & 0x3f);
        uVar8 = uVar7 >> 6;
        uVar9 = 1L << (uVar7 & 0x3f);
        uVar10 = *(ulong *)((long)__s + uVar8 * 8);
        if ((uVar9 & uVar10) != 0) {
          do {
            plVar2 = (long *)((long)pvVar6 + uVar7 * 0x10);
            if (*plVar2 == *plVar1 && plVar2[1] == uVar12) {
              uVar8 = uVar7 >> 6;
              uVar9 = 1L << (uVar7 & 0x3f);
              break;
            }
            uVar7 = uVar7 + 1 & uVar3 - 1;
            uVar8 = uVar7 >> 6;
            uVar9 = 1L << (uVar7 & 0x3f);
          } while ((*(ulong *)((long)__s + uVar8 * 8) & uVar9) != 0);
          uVar10 = *(ulong *)((long)__s + uVar8 * 8);
        }
        *(ulong *)((long)__s + uVar8 * 8) = uVar10 | uVar9;
        lVar20 = *plVar1;
        uVar13 = uVar13 - 1 & uVar13;
        plVar2 = (long *)((long)pvVar6 + uVar7 * 0x10);
        plVar2[1] = plVar1[1];
        *plVar2 = lVar20;
        if (uVar13 == 0) {
          uVar7 = uVar11;
          uVar12 = uVar4;
          if (uVar4 <= uVar11 + 1) {
            uVar12 = uVar11 + 1;
          }
          do {
            uVar11 = uVar7 + 1;
            if (uVar4 <= uVar11) {
              uVar13 = 0;
              goto LAB_008a3f70;
            }
            uVar13 = puVar15[uVar7 + 1];
            uVar7 = uVar11;
          } while (uVar13 == 0);
        }
        uVar14 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
        uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
        uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
        uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
        uVar14 = LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) | uVar11 << 6;
        uVar12 = uVar11;
      } while (uVar13 != 0);
LAB_008a3f70:
      uVar11 = uVar12;
    } while (uVar12 != uVar4);
  }
  *param_1 = (long)pvVar6;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  operator_delete((void *)0x0);
  param_1[2] = uVar17;
  param_1[3] = (long)__s;
  param_1[1] = uVar3;
  operator_delete((void *)0x0);
  operator_delete((void *)0x0);
  param_1[4] = uVar3;
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

