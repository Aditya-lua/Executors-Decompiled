/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008555ac
 */

void FUN_008555ac(long *param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  ulong uVar3;
  ulong uVar4;
  uint uVar5;
  int iVar6;
  void *__s;
  void *pvVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  byte *pbVar11;
  ulong uVar12;
  ulong uVar13;
  undefined1 uVar14;
  ulong uVar15;
  ulong uVar16;
  void *pvVar17;
  ulong uVar18;
  void *__s2;
  ulong *puVar19;
  ulong uVar20;
  undefined8 uVar21;
  
  uVar3 = 0x10;
  if (param_1[4] != 0) {
    uVar3 = param_1[4] << 1;
  }
  if (uVar3 == 0) {
    uVar18 = 0;
    __s = (void *)0x0;
    pvVar7 = (void *)0x0;
    uVar15 = 0x40;
    uVar14 = 0x40;
    uVar4 = param_1[2];
    puVar19 = (ulong *)param_1[3];
  }
  else {
    uVar18 = uVar3;
    if (uVar3 < 0x41) {
      uVar18 = 0x40;
    }
    uVar18 = uVar18 >> 6;
    __s = operator_new(uVar18 << 3);
    memset(__s,0,uVar18 << 3);
                    /* try { // try from 00855618 to 0085561b has its CatchHandler @ 008558a4 */
    pvVar7 = operator_new(uVar3 << 4);
    uVar4 = (uVar3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar3 & 0x5555555555555555) << 1;
    uVar4 = (uVar4 & 0xcccccccccccccccc) >> 2 | (uVar4 & 0x3333333333333333) << 2;
    uVar4 = (uVar4 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar4 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
    uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
    uVar5 = 0x40 - (int)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20);
    uVar15 = (ulong)uVar5;
    uVar14 = (undefined1)uVar5;
    uVar4 = param_1[2];
    puVar19 = (ulong *)param_1[3];
  }
  if (uVar4 == 0) {
LAB_0085582c:
    pvVar17 = (void *)*param_1;
  }
  else {
    uVar14 = (undefined1)uVar15;
    uVar16 = *puVar19;
    if (uVar16 == 0) {
      uVar20 = 0;
      do {
        if (uVar4 - 1 == uVar20) goto LAB_0085582c;
        uVar16 = puVar19[uVar20 + 1];
        uVar20 = uVar20 + 1;
      } while (uVar16 == 0);
    }
    else {
      uVar20 = 0;
    }
    uVar10 = (uVar16 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar16 & 0x5555555555555555) << 1;
    uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
    uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
    uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
    pvVar17 = (void *)*param_1;
    uVar10 = LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) | uVar20 << 6;
    do {
      do {
        puVar1 = (undefined8 *)((long)pvVar17 + uVar10 * 0x10);
        uVar5 = *(uint *)(puVar1 + 1);
        if (uVar5 == 0) {
          uVar8 = 0x8fc5e37bc9b65d29;
        }
        else {
          uVar8 = 0x811c9dc5;
          pbVar11 = (byte *)*puVar1;
          uVar9 = (ulong)uVar5;
          do {
            uVar9 = uVar9 - 1;
            uVar8 = (ulong)(((uint)uVar8 ^ (uint)*pbVar11) * 0x1000193);
            pbVar11 = pbVar11 + 1;
          } while (uVar9 != 0);
          uVar8 = uVar8 * -0x61c8864680b583eb;
        }
        uVar8 = uVar8 >> (uVar15 & 0x3f);
        uVar9 = uVar8 >> 6;
        uVar12 = 1L << (uVar8 & 0x3f);
        uVar13 = *(ulong *)((long)__s + uVar9 * 8);
        if ((uVar12 & uVar13) != 0) {
          __s2 = (void *)*puVar1;
          do {
            puVar2 = (undefined8 *)((long)pvVar7 + uVar8 * 0x10);
            if ((*(uint *)(puVar2 + 1) == uVar5) &&
               (iVar6 = memcmp((void *)*puVar2,__s2,(ulong)uVar5), iVar6 == 0)) {
              uVar9 = uVar8 >> 6;
              uVar12 = 1L << (uVar8 & 0x3f);
              break;
            }
            uVar8 = uVar8 + 1 & uVar3 - 1;
            uVar9 = uVar8 >> 6;
            uVar12 = 1L << (uVar8 & 0x3f);
          } while ((*(ulong *)((long)__s + uVar9 * 8) & uVar12) != 0);
          uVar13 = *(ulong *)((long)__s + uVar9 * 8);
        }
        *(ulong *)((long)__s + uVar9 * 8) = uVar13 | uVar12;
        uVar21 = *puVar1;
        uVar16 = uVar16 - 1 & uVar16;
        puVar2 = (undefined8 *)((long)pvVar7 + uVar8 * 0x10);
        puVar2[1] = puVar1[1];
        *puVar2 = uVar21;
        if (uVar16 == 0) {
          uVar9 = uVar20;
          uVar8 = uVar4;
          if (uVar4 <= uVar20 + 1) {
            uVar8 = uVar20 + 1;
          }
          do {
            uVar20 = uVar9 + 1;
            if (uVar4 <= uVar20) {
              uVar16 = 0;
              uVar20 = uVar8;
              goto LAB_008556dc;
            }
            uVar16 = puVar19[uVar9 + 1];
            uVar9 = uVar20;
          } while (uVar16 == 0);
        }
        uVar10 = (uVar16 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar16 & 0x5555555555555555) << 1;
        uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
        uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
        uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
        uVar10 = LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) | uVar20 << 6;
      } while (uVar16 != 0);
LAB_008556dc:
    } while (uVar20 != uVar4);
  }
  *param_1 = (long)pvVar7;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  operator_delete((void *)0x0);
  param_1[2] = uVar18;
  param_1[3] = (long)__s;
  param_1[1] = uVar3;
  operator_delete((void *)0x0);
  operator_delete((void *)0x0);
  param_1[4] = uVar3;
  *(undefined1 *)(param_1 + 6) = uVar14;
  if (pvVar17 != (void *)0x0) {
    operator_delete(pvVar17);
    operator_delete(puVar19);
    operator_delete((void *)0x0);
    puVar19 = (ulong *)0x0;
  }
  operator_delete(puVar19);
  return;
}

