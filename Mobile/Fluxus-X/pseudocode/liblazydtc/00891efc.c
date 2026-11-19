/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00891efc
 */

/* WARNING: Removing unreachable block (ram,0x008921a8) */

void FUN_00891efc(long *param_1,ulong *param_2)

{
  ulong *puVar1;
  ulong uVar2;
  uint uVar3;
  ulong *puVar4;
  void *__s;
  void *pvVar5;
  ulong uVar6;
  ulong uVar7;
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
    uVar11 = *param_2;
    uVar13 = ((ulong)(uint)((int)uVar11 << 3) + 8 ^ uVar11 >> 0x20) * -0x622015f714c7d297;
    uVar13 = (uVar11 >> 0x20 ^ uVar13 >> 0x2f ^ uVar13) * -0x622015f714c7d297;
    uVar13 = (uVar13 ^ uVar13 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 6) & 0x3f);
    if ((*(ulong *)(param_1[3] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*param_1 + uVar13 * 0x10) == uVar11) {
          return;
        }
        uVar13 = uVar13 + 1 & param_1[4] - 1U;
      } while ((*(ulong *)(param_1[3] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0);
    }
  }
  uVar11 = 0x10;
  if (param_1[4] != 0) {
    uVar11 = param_1[4] << 1;
  }
  if (uVar11 == 0) {
    uVar13 = 0;
    __s = (void *)0x0;
    pvVar5 = (void *)0x0;
    uVar19 = 0x40;
    uVar18 = 0x40;
    uVar2 = param_1[2];
    puVar16 = (ulong *)param_1[3];
  }
  else {
    uVar13 = uVar11;
    if (uVar11 < 0x41) {
      uVar13 = 0x40;
    }
    uVar13 = uVar13 >> 6;
    __s = operator_new(uVar13 << 3);
    memset(__s,0,uVar13 << 3);
                    /* try { // try from 00892014 to 00892017 has its CatchHandler @ 0089221c */
    pvVar5 = operator_new(uVar11 << 4);
    uVar2 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
    uVar2 = (uVar2 & 0xcccccccccccccccc) >> 2 | (uVar2 & 0x3333333333333333) << 2;
    uVar2 = (uVar2 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar2 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar2 = (uVar2 & 0xff00ff00ff00ff00) >> 8 | (uVar2 & 0xff00ff00ff00ff) << 8;
    uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
    uVar3 = 0x40 - (int)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20);
    uVar18 = (undefined1)uVar3;
    uVar19 = (ulong)uVar3;
    uVar2 = param_1[2];
    puVar16 = (ulong *)param_1[3];
  }
  if (uVar2 == 0) {
LAB_008921ac:
    pvVar17 = (void *)*param_1;
  }
  else {
    uVar18 = (undefined1)uVar19;
    uVar14 = *puVar16;
    if (uVar14 == 0) {
      uVar12 = 0;
      do {
        if (uVar2 - 1 == uVar12) goto LAB_008921ac;
        uVar14 = puVar16[uVar12 + 1];
        uVar12 = uVar12 + 1;
      } while (uVar14 == 0);
    }
    else {
      uVar12 = 0;
    }
    uVar15 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
    uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
    uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
    uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
    pvVar17 = (void *)*param_1;
    uVar15 = LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) | uVar12 << 6;
    do {
      do {
        puVar1 = (ulong *)((long)pvVar17 + uVar15 * 0x10);
        uVar9 = *puVar1;
        uVar6 = ((ulong)(uint)((int)uVar9 << 3) + 8 ^ uVar9 >> 0x20) * -0x622015f714c7d297;
        uVar6 = (uVar9 >> 0x20 ^ uVar6 >> 0x2f ^ uVar6) * -0x622015f714c7d297;
        uVar6 = (uVar6 ^ uVar6 >> 0x2f) * -0x6b622cb0470b6a63 >> (uVar19 & 0x3f);
        uVar7 = uVar6 >> 6;
        uVar8 = 1L << (uVar6 & 0x3f);
        uVar10 = *(ulong *)((long)__s + uVar7 * 8);
        if ((uVar8 & uVar10) != 0) {
          do {
            if (*(ulong *)((long)pvVar5 + uVar6 * 0x10) == uVar9) {
              uVar7 = uVar6 >> 6;
              uVar8 = 1L << (uVar6 & 0x3f);
              break;
            }
            uVar6 = uVar6 + 1 & uVar11 - 1;
            uVar7 = uVar6 >> 6;
            uVar8 = 1L << (uVar6 & 0x3f);
          } while ((*(ulong *)((long)__s + uVar7 * 8) & uVar8) != 0);
          uVar10 = *(ulong *)((long)__s + uVar7 * 8);
        }
        *(ulong *)((long)__s + uVar7 * 8) = uVar10 | uVar8;
        uVar7 = *puVar1;
        uVar14 = uVar14 - 1 & uVar14;
        puVar4 = (ulong *)((long)pvVar5 + uVar6 * 0x10);
        puVar4[1] = puVar1[1];
        *puVar4 = uVar7;
        if (uVar14 == 0) {
          uVar7 = uVar12;
          uVar6 = uVar2;
          if (uVar2 <= uVar12 + 1) {
            uVar6 = uVar12 + 1;
          }
          do {
            uVar12 = uVar7 + 1;
            if (uVar2 <= uVar12) {
              uVar14 = 0;
              goto LAB_00892190;
            }
            uVar14 = puVar16[uVar7 + 1];
            uVar7 = uVar12;
          } while (uVar14 == 0);
        }
        uVar15 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
        uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
        uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        uVar15 = LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) | uVar12 << 6;
        uVar6 = uVar12;
      } while (uVar14 != 0);
LAB_00892190:
      uVar12 = uVar6;
    } while (uVar6 != uVar2);
  }
  *param_1 = (long)pvVar5;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  operator_delete((void *)0x0);
  param_1[2] = uVar13;
  param_1[3] = (long)__s;
  param_1[1] = uVar11;
  operator_delete((void *)0x0);
  operator_delete((void *)0x0);
  param_1[4] = uVar11;
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

