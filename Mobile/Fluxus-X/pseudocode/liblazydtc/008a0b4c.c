/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a0b4c
 */

/* WARNING: Removing unreachable block (ram,0x008a0e14) */

void FUN_008a0b4c(long *param_1,ulong *param_2)

{
  ulong uVar1;
  uint uVar2;
  void *__s;
  void *pvVar3;
  ulong uVar4;
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
  ulong uVar15;
  ulong *puVar16;
  void *pvVar17;
  undefined1 uVar18;
  ulong uVar19;
  
  if ((ulong)param_1[5] < (ulong)(param_1[4] * 3) >> 2) {
    return;
  }
  if (param_1[5] != 0) {
    uVar12 = *param_2;
    uVar14 = ((ulong)(uint)((int)uVar12 << 3) + 8 ^ uVar12 >> 0x20) * -0x622015f714c7d297;
    uVar14 = (uVar12 >> 0x20 ^ uVar14 >> 0x2f ^ uVar14) * -0x622015f714c7d297;
    uVar14 = (uVar14 ^ uVar14 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 6) & 0x3f);
    if ((*(ulong *)(param_1[3] + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*param_1 + uVar14 * 0x30) == uVar12) {
          return;
        }
        uVar14 = uVar14 + 1 & param_1[4] - 1U;
      } while ((*(ulong *)(param_1[3] + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0);
    }
  }
  uVar12 = 0x10;
  if (param_1[4] != 0) {
    uVar12 = param_1[4] << 1;
  }
  if (uVar12 == 0) {
    uVar14 = 0;
    __s = (void *)0x0;
    pvVar3 = (void *)0x0;
    uVar19 = 0x40;
    uVar18 = 0x40;
    uVar1 = param_1[2];
    puVar16 = (ulong *)param_1[3];
  }
  else {
    uVar14 = uVar12;
    if (uVar12 < 0x41) {
      uVar14 = 0x40;
    }
    uVar14 = uVar14 >> 6;
    __s = operator_new(uVar14 << 3);
    memset(__s,0,uVar14 << 3);
                    /* try { // try from 008a0c6c to 008a0c6f has its CatchHandler @ 008a0e88 */
    pvVar3 = operator_new(uVar12 * 0x30);
    uVar1 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
    uVar1 = (uVar1 & 0xcccccccccccccccc) >> 2 | (uVar1 & 0x3333333333333333) << 2;
    uVar1 = (uVar1 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar1 = (uVar1 & 0xff00ff00ff00ff00) >> 8 | (uVar1 & 0xff00ff00ff00ff) << 8;
    uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
    uVar2 = 0x40 - (int)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20);
    uVar18 = (undefined1)uVar2;
    uVar19 = (ulong)uVar2;
    uVar1 = param_1[2];
    puVar16 = (ulong *)param_1[3];
  }
  if (uVar1 == 0) {
LAB_008a0e18:
    pvVar17 = (void *)*param_1;
  }
  else {
    uVar18 = (undefined1)uVar19;
    uVar15 = *puVar16;
    if (uVar15 == 0) {
      uVar13 = 0;
      do {
        if (uVar1 - 1 == uVar13) goto LAB_008a0e18;
        uVar15 = puVar16[uVar13 + 1];
        uVar13 = uVar13 + 1;
      } while (uVar15 == 0);
    }
    else {
      uVar13 = 0;
    }
    uVar4 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
    uVar4 = (uVar4 & 0xcccccccccccccccc) >> 2 | (uVar4 & 0x3333333333333333) << 2;
    uVar4 = (uVar4 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar4 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
    uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
    pvVar17 = (void *)*param_1;
    uVar4 = LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) | uVar13 << 6;
    do {
      do {
        puVar5 = (ulong *)((long)pvVar17 + uVar4 * 0x30);
        uVar10 = *puVar5;
        uVar6 = ((ulong)(uint)((int)uVar10 << 3) + 8 ^ uVar10 >> 0x20) * -0x622015f714c7d297;
        uVar6 = (uVar10 >> 0x20 ^ uVar6 >> 0x2f ^ uVar6) * -0x622015f714c7d297;
        uVar6 = (uVar6 ^ uVar6 >> 0x2f) * -0x6b622cb0470b6a63 >> (uVar19 & 0x3f);
        uVar8 = uVar6 >> 6;
        uVar9 = 1L << (uVar6 & 0x3f);
        uVar11 = *(ulong *)((long)__s + uVar8 * 8);
        if ((uVar9 & uVar11) != 0) {
          do {
            if (*(ulong *)((long)pvVar3 + uVar6 * 0x30) == uVar10) {
              uVar8 = uVar6 >> 6;
              uVar9 = 1L << (uVar6 & 0x3f);
              break;
            }
            uVar6 = uVar6 + 1 & uVar12 - 1;
            uVar8 = uVar6 >> 6;
            uVar9 = 1L << (uVar6 & 0x3f);
          } while ((*(ulong *)((long)__s + uVar8 * 8) & uVar9) != 0);
          uVar11 = *(ulong *)((long)__s + uVar8 * 8);
        }
        puVar7 = (ulong *)((long)pvVar3 + uVar6 * 0x30);
        *(ulong *)((long)__s + uVar8 * 8) = uVar11 | uVar9;
        uVar9 = puVar5[2];
        uVar8 = puVar5[5];
        uVar6 = puVar5[4];
        uVar11 = puVar5[1];
        uVar10 = *puVar5;
        uVar15 = uVar15 - 1 & uVar15;
        puVar7[3] = puVar5[3];
        puVar7[2] = uVar9;
        puVar7[5] = uVar8;
        puVar7[4] = uVar6;
        puVar7[1] = uVar11;
        *puVar7 = uVar10;
        if (uVar15 == 0) {
          uVar8 = uVar13;
          uVar6 = uVar1;
          if (uVar1 <= uVar13 + 1) {
            uVar6 = uVar13 + 1;
          }
          do {
            uVar13 = uVar8 + 1;
            if (uVar1 <= uVar13) {
              uVar15 = 0;
              goto LAB_008a0dfc;
            }
            uVar15 = puVar16[uVar8 + 1];
            uVar8 = uVar13;
          } while (uVar15 == 0);
        }
        uVar4 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
        uVar4 = (uVar4 & 0xcccccccccccccccc) >> 2 | (uVar4 & 0x3333333333333333) << 2;
        uVar4 = (uVar4 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar4 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
        uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
        uVar4 = LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) | uVar13 << 6;
        uVar6 = uVar13;
      } while (uVar15 != 0);
LAB_008a0dfc:
      uVar13 = uVar6;
    } while (uVar6 != uVar1);
  }
  *param_1 = (long)pvVar3;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  operator_delete((void *)0x0);
  param_1[2] = uVar14;
  param_1[3] = (long)__s;
  param_1[1] = uVar12;
  operator_delete((void *)0x0);
  operator_delete((void *)0x0);
  param_1[4] = uVar12;
  *(undefined1 *)(param_1 + 6) = uVar18;
  if (pvVar17 != (void *)0x0) {
    operator_delete(pvVar17);
    operator_delete(puVar16);
    operator_delete((void *)0x0);
    puVar16 = (ulong *)0x0;
  }
  operator_delete(puVar16);
  return;
}

