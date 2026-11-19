/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087c8e4
 */

/* WARNING: Removing unreachable block (ram,0x0087caa8) */

void FUN_0087c8e4(long *param_1)

{
  uint *puVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  void *__s;
  void *pvVar5;
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
  
  uVar2 = 0x10;
  if (param_1[4] != 0) {
    uVar2 = param_1[4] << 1;
  }
  if (uVar2 == 0) {
    uVar15 = 0;
    __s = (void *)0x0;
    pvVar5 = (void *)0x0;
    uVar17 = 0x40;
    uVar16 = 0x40;
    uVar3 = param_1[2];
    puVar13 = (ulong *)param_1[3];
  }
  else {
    uVar15 = uVar2;
    if (uVar2 < 0x41) {
      uVar15 = 0x40;
    }
    uVar15 = uVar15 >> 6;
    __s = operator_new(uVar15 << 3);
    memset(__s,0,uVar15 << 3);
                    /* try { // try from 0087c948 to 0087c94b has its CatchHandler @ 0087cb1c */
    pvVar5 = operator_new(uVar2 << 3);
    uVar3 = (uVar2 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar2 & 0x5555555555555555) << 1;
    uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
    uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
    uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
    uVar4 = 0x40 - (int)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20);
    uVar16 = (undefined1)uVar4;
    uVar17 = (ulong)uVar4;
    uVar3 = param_1[2];
    puVar13 = (ulong *)param_1[3];
  }
  if (uVar3 == 0) {
LAB_0087caac:
    pvVar14 = (void *)*param_1;
  }
  else {
    uVar16 = (undefined1)uVar17;
    uVar11 = *puVar13;
    if (uVar11 == 0) {
      uVar10 = 0;
      do {
        if (uVar3 - 1 == uVar10) goto LAB_0087caac;
        uVar11 = puVar13[uVar10 + 1];
        uVar10 = uVar10 + 1;
      } while (uVar11 == 0);
    }
    else {
      uVar10 = 0;
    }
    uVar12 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
    uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
    uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
    uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
    pvVar14 = (void *)*param_1;
    uVar12 = LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) | uVar10 << 6;
    do {
      do {
        puVar1 = (uint *)((long)pvVar14 + uVar12 * 8);
        uVar4 = *puVar1;
        uVar6 = (ulong)uVar4 * -0x61c8864680b583eb >> (uVar17 & 0x3f);
        uVar7 = uVar6 >> 6;
        uVar8 = 1L << (uVar6 & 0x3f);
        uVar9 = *(ulong *)((long)__s + uVar7 * 8);
        if ((uVar8 & uVar9) != 0) {
          do {
            if (*(uint *)((long)pvVar5 + uVar6 * 8) == uVar4) {
              uVar7 = uVar6 >> 6;
              uVar8 = 1L << (uVar6 & 0x3f);
              break;
            }
            uVar6 = uVar6 + 1 & uVar2 - 1;
            uVar7 = uVar6 >> 6;
            uVar8 = 1L << (uVar6 & 0x3f);
          } while ((*(ulong *)((long)__s + uVar7 * 8) & uVar8) != 0);
          uVar9 = *(ulong *)((long)__s + uVar7 * 8);
        }
        *(ulong *)((long)__s + uVar7 * 8) = uVar9 | uVar8;
        uVar11 = uVar11 - 1 & uVar11;
        *(undefined8 *)((long)pvVar5 + uVar6 * 8) = *(undefined8 *)puVar1;
        if (uVar11 == 0) {
          uVar7 = uVar10;
          uVar6 = uVar3;
          if (uVar3 <= uVar10 + 1) {
            uVar6 = uVar10 + 1;
          }
          do {
            uVar10 = uVar7 + 1;
            if (uVar3 <= uVar10) {
              uVar11 = 0;
              goto LAB_0087ca90;
            }
            uVar11 = puVar13[uVar7 + 1];
            uVar7 = uVar10;
          } while (uVar11 == 0);
        }
        uVar12 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
        uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
        uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
        uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
        uVar12 = LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) | uVar10 << 6;
        uVar6 = uVar10;
      } while (uVar11 != 0);
LAB_0087ca90:
      uVar10 = uVar6;
    } while (uVar6 != uVar3);
  }
  *param_1 = (long)pvVar5;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  operator_delete((void *)0x0);
  param_1[2] = uVar15;
  param_1[3] = (long)__s;
  param_1[1] = uVar2;
  operator_delete((void *)0x0);
  operator_delete((void *)0x0);
  param_1[4] = uVar2;
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

