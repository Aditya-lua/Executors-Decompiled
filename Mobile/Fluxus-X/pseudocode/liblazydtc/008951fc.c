/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008951fc
 */

/* WARNING: Removing unreachable block (ram,0x00895498) */

void FUN_008951fc(long *param_1,ulong *param_2)

{
  ulong uVar1;
  uint uVar2;
  void *__s;
  void *pvVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong *puVar14;
  void *pvVar15;
  undefined1 uVar16;
  ulong uVar17;
  
  if ((ulong)param_1[5] < (ulong)(param_1[4] * 3) >> 2) {
    return;
  }
  if (param_1[5] != 0) {
    uVar9 = *param_2;
    uVar11 = ((ulong)(uint)((int)uVar9 << 3) + 8 ^ uVar9 >> 0x20) * -0x622015f714c7d297;
    uVar11 = (uVar9 >> 0x20 ^ uVar11 >> 0x2f ^ uVar11) * -0x622015f714c7d297;
    uVar11 = (uVar11 ^ uVar11 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 6) & 0x3f);
    if ((*(ulong *)(param_1[3] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*param_1 + uVar11 * 8) == uVar9) {
          return;
        }
        uVar11 = uVar11 + 1 & param_1[4] - 1U;
      } while ((*(ulong *)(param_1[3] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0);
    }
  }
  uVar9 = 0x10;
  if (param_1[4] != 0) {
    uVar9 = param_1[4] << 1;
  }
  if (uVar9 == 0) {
    uVar11 = 0;
    __s = (void *)0x0;
    pvVar3 = (void *)0x0;
    uVar17 = 0x40;
    uVar16 = 0x40;
    uVar1 = param_1[2];
    puVar14 = (ulong *)param_1[3];
  }
  else {
    uVar11 = uVar9;
    if (uVar9 < 0x41) {
      uVar11 = 0x40;
    }
    uVar11 = uVar11 >> 6;
    __s = operator_new(uVar11 << 3);
    memset(__s,0,uVar11 << 3);
                    /* try { // try from 00895310 to 00895313 has its CatchHandler @ 0089550c */
    pvVar3 = operator_new(uVar9 << 3);
    uVar1 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
    uVar1 = (uVar1 & 0xcccccccccccccccc) >> 2 | (uVar1 & 0x3333333333333333) << 2;
    uVar1 = (uVar1 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar1 = (uVar1 & 0xff00ff00ff00ff00) >> 8 | (uVar1 & 0xff00ff00ff00ff) << 8;
    uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
    uVar2 = 0x40 - (int)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20);
    uVar16 = (undefined1)uVar2;
    uVar17 = (ulong)uVar2;
    uVar1 = param_1[2];
    puVar14 = (ulong *)param_1[3];
  }
  if (uVar1 == 0) {
LAB_0089549c:
    pvVar15 = (void *)*param_1;
  }
  else {
    uVar16 = (undefined1)uVar17;
    uVar12 = *puVar14;
    if (uVar12 == 0) {
      uVar10 = 0;
      do {
        if (uVar1 - 1 == uVar10) goto LAB_0089549c;
        uVar12 = puVar14[uVar10 + 1];
        uVar10 = uVar10 + 1;
      } while (uVar12 == 0);
    }
    else {
      uVar10 = 0;
    }
    uVar13 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
    uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
    uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
    uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
    pvVar15 = (void *)*param_1;
    uVar13 = LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) | uVar10 << 6;
    do {
      do {
        uVar4 = *(ulong *)((long)pvVar15 + uVar13 * 8);
        uVar5 = ((ulong)(uint)((int)uVar4 << 3) + 8 ^ uVar4 >> 0x20) * -0x622015f714c7d297;
        uVar5 = (uVar4 >> 0x20 ^ uVar5 >> 0x2f ^ uVar5) * -0x622015f714c7d297;
        uVar5 = (uVar5 ^ uVar5 >> 0x2f) * -0x6b622cb0470b6a63 >> (uVar17 & 0x3f);
        uVar6 = uVar5 >> 6;
        uVar7 = 1L << (uVar5 & 0x3f);
        uVar8 = *(ulong *)((long)__s + uVar6 * 8);
        if ((uVar7 & uVar8) != 0) {
          do {
            if (*(ulong *)((long)pvVar3 + uVar5 * 8) == uVar4) {
              uVar6 = uVar5 >> 6;
              uVar7 = 1L << (uVar5 & 0x3f);
              break;
            }
            uVar5 = uVar5 + 1 & uVar9 - 1;
            uVar6 = uVar5 >> 6;
            uVar7 = 1L << (uVar5 & 0x3f);
          } while ((*(ulong *)((long)__s + uVar6 * 8) & uVar7) != 0);
          uVar8 = *(ulong *)((long)__s + uVar6 * 8);
        }
        *(ulong *)((long)__s + uVar6 * 8) = uVar8 | uVar7;
        uVar12 = uVar12 - 1 & uVar12;
        *(ulong *)((long)pvVar3 + uVar5 * 8) = uVar4;
        if (uVar12 == 0) {
          uVar5 = uVar10;
          uVar4 = uVar1;
          if (uVar1 <= uVar10 + 1) {
            uVar4 = uVar10 + 1;
          }
          do {
            uVar10 = uVar5 + 1;
            if (uVar1 <= uVar10) {
              uVar12 = 0;
              goto LAB_00895480;
            }
            uVar12 = puVar14[uVar5 + 1];
            uVar5 = uVar10;
          } while (uVar12 == 0);
        }
        uVar13 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
        uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
        uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
        uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
        uVar13 = LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) | uVar10 << 6;
        uVar4 = uVar10;
      } while (uVar12 != 0);
LAB_00895480:
      uVar10 = uVar4;
    } while (uVar4 != uVar1);
  }
  *param_1 = (long)pvVar3;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  operator_delete((void *)0x0);
  param_1[2] = uVar11;
  param_1[3] = (long)__s;
  param_1[1] = uVar9;
  operator_delete((void *)0x0);
  operator_delete((void *)0x0);
  param_1[4] = uVar9;
  *(undefined1 *)(param_1 + 6) = uVar16;
  if (pvVar15 != (void *)0x0) {
    operator_delete(pvVar15);
    operator_delete(puVar14);
    operator_delete((void *)0x0);
    puVar14 = (ulong *)0x0;
  }
  operator_delete(puVar14);
  return;
}

