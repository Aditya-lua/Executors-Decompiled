/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087c53c
 */

void FUN_0087c53c(long *param_1)

{
  ulong uVar1;
  ulong uVar2;
  uint uVar3;
  char cVar4;
  char cVar5;
  int iVar6;
  void *__s;
  ulong *puVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  uint *puVar11;
  ulong uVar12;
  uint uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  void *__s2;
  size_t __n;
  void *pvVar18;
  void *__s1;
  ulong uVar19;
  void *local_68;
  
  uVar1 = 0x10;
  if (param_1[4] != 0) {
    uVar1 = param_1[4] << 1;
  }
  if (uVar1 == 0) {
    uVar17 = 0;
    __s = (void *)0x0;
    local_68 = (void *)0x0;
    uVar15 = 0x40;
  }
  else {
    uVar17 = uVar1;
    if (uVar1 < 0x41) {
      uVar17 = 0x40;
    }
    uVar17 = uVar17 >> 6;
    __s = operator_new(uVar17 << 3);
    memset(__s,0,uVar17 << 3);
                    /* try { // try from 0087c5ac to 0087c5b3 has its CatchHandler @ 0087c8d0 */
    local_68 = operator_new(uVar1 * 0x10c);
    uVar15 = (uVar1 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar1 & 0x5555555555555555) << 1;
    uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
    uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
    uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
    uVar15 = (ulong)(0x40 - (int)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20));
  }
  uVar2 = param_1[2];
  puVar7 = (ulong *)param_1[3];
  if (uVar2 == 0) {
LAB_0087c84c:
    pvVar18 = (void *)*param_1;
  }
  else {
    uVar19 = *puVar7;
    if (uVar19 == 0) {
      uVar16 = 0;
      do {
        if (uVar2 - 1 == uVar16) goto LAB_0087c84c;
        uVar19 = puVar7[uVar16 + 1];
        uVar16 = uVar16 + 1;
      } while (uVar19 == 0);
    }
    else {
      uVar16 = 0;
    }
    uVar10 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
    uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
    uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
    uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
    pvVar18 = (void *)*param_1;
    uVar10 = LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) | uVar16 << 6;
    do {
      do {
        __s2 = (void *)((long)pvVar18 + uVar10 * 0x10c);
        uVar3 = *(uint *)((long)__s2 + 0x100);
        if (uVar3 == 0) {
          uVar8 = 0x8fc5e37bc9b65d29;
        }
        else {
          puVar11 = (uint *)((long)__s2 + 0x80);
          uVar13 = 0x811c9dc5;
          uVar8 = (ulong)uVar3;
          do {
            uVar13 = (puVar11[-0x20] ^ uVar13) * 0x1000193;
            if (*(char *)((long)__s2 + 0x104) != '\0') {
              uVar13 = (*puVar11 ^ uVar13) * 0x1000193;
            }
            uVar8 = uVar8 - 1;
            puVar11 = puVar11 + 1;
          } while (uVar8 != 0);
          uVar8 = (ulong)uVar13 * -0x61c8864680b583eb;
        }
        uVar8 = uVar8 >> (uVar15 & 0x3f);
        uVar9 = uVar8 >> 6;
        uVar14 = 1L << (uVar8 & 0x3f);
        uVar12 = *(ulong *)((long)__s + uVar9 * 8);
        if ((uVar14 & uVar12) != 0) {
          cVar4 = *(char *)((long)__s2 + 0x104);
          __n = (ulong)uVar3 << 2;
          do {
            __s1 = (void *)((long)local_68 + uVar8 * 0x10c);
            if ((*(uint *)((long)__s1 + 0x100) == uVar3) &&
               (iVar6 = memcmp(__s1,__s2,__n), iVar6 == 0)) {
              cVar5 = *(char *)((long)__s1 + 0x104);
              if (cVar5 == cVar4 && cVar5 != '\0') {
                iVar6 = memcmp((void *)((long)__s1 + 0x80),(void *)((long)__s2 + 0x80),__n);
                if (iVar6 == 0) break;
              }
              else if ((cVar5 == cVar4) && (cVar5 == '\0')) break;
            }
            uVar8 = uVar8 + 1 & uVar1 - 1;
          } while ((*(ulong *)((long)__s + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1) != 0);
          uVar9 = uVar8 >> 6;
          uVar14 = 1L << (uVar8 & 0x3f);
          uVar12 = *(ulong *)((long)__s + uVar9 * 8);
        }
        *(ulong *)((long)__s + uVar9 * 8) = uVar12 | uVar14;
        memcpy((void *)((long)local_68 + uVar8 * 0x10c),__s2,0x10c);
        uVar19 = uVar19 - 1 & uVar19;
        if (uVar19 == 0) {
          uVar9 = uVar16;
          uVar8 = uVar2;
          if (uVar2 <= uVar16 + 1) {
            uVar8 = uVar16 + 1;
          }
          do {
            uVar16 = uVar9 + 1;
            if (uVar2 <= uVar16) {
              uVar19 = 0;
              uVar16 = uVar8;
              goto LAB_0087c674;
            }
            uVar19 = puVar7[uVar9 + 1];
            uVar9 = uVar16;
          } while (uVar19 == 0);
        }
        uVar10 = (uVar19 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar19 & 0x5555555555555555) << 1;
        uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
        uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
        uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
        uVar10 = LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) | uVar16 << 6;
      } while (uVar19 != 0);
LAB_0087c674:
    } while (uVar16 != uVar2);
  }
  param_1[2] = 0;
  param_1[3] = 0;
  *param_1 = (long)local_68;
  param_1[1] = 0;
  operator_delete((void *)0x0);
  param_1[1] = uVar1;
  param_1[2] = uVar17;
  param_1[3] = (long)__s;
  operator_delete((void *)0x0);
  operator_delete((void *)0x0);
  param_1[4] = uVar1;
  *(char *)(param_1 + 6) = (char)uVar15;
  if (pvVar18 != (void *)0x0) {
    operator_delete(pvVar18);
    operator_delete(puVar7);
    operator_delete((void *)0x0);
    puVar7 = (ulong *)0x0;
  }
  operator_delete(puVar7);
  return;
}

