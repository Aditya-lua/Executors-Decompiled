/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087bff0
 */

void FUN_0087bff0(void **param_1)

{
  void *pvVar1;
  size_t __n;
  undefined1 uVar2;
  long lVar3;
  ulong *puVar4;
  int iVar5;
  ulong *__s;
  long lVar6;
  void *__s1;
  ulong uVar7;
  ulong uVar8;
  void *pvVar9;
  ulong uVar10;
  undefined8 *puVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong *puVar15;
  undefined8 *puVar16;
  void *pvVar17;
  void *pvVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  void *local_a8;
  void *local_a0;
  void *local_98;
  void *pvStack_90;
  ulong *local_88;
  void *local_80;
  long local_78;
  byte local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  pvStack_90 = (void *)0x0;
  local_88 = (void *)0x0;
  pvVar9 = (void *)0x10;
  if (param_1[4] != (void *)0x0) {
    pvVar9 = (void *)((long)param_1[4] << 1);
  }
  local_a0 = (void *)0x0;
  local_98 = pvVar9;
  if (pvVar9 == (void *)0x0) {
    local_70 = 0x40;
    __s = (void *)0x0;
    local_80 = (void *)0x0;
    local_78 = 0;
  }
  else {
    pvStack_90 = pvVar9;
    if (pvVar9 < (void *)0x41) {
      pvStack_90 = (void *)0x40;
    }
    pvStack_90 = (void *)((ulong)pvStack_90 >> 6);
    uVar14 = (long)pvStack_90 << 3;
    __s = operator_new(uVar14);
    local_88 = __s;
    memset(__s,0,uVar14);
    local_78 = 0;
                    /* try { // try from 0087c080 to 0087c083 has its CatchHandler @ 0087c38c */
    local_a0 = operator_new((long)pvVar9 * 0x18);
    uVar14 = ((ulong)pvVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | ((ulong)pvVar9 & 0x5555555555555555) << 1;
    uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
    uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
    uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
    local_70 = 0x40 - (char)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20);
    local_80 = pvVar9;
  }
  local_a8 = param_1[2];
  puVar15 = param_1[3];
  if (local_a8 != (void *)0x0) {
    uVar14 = *puVar15;
    if (uVar14 == 0) {
      pvVar9 = (void *)0x1;
      do {
        pvVar17 = pvVar9;
        if (local_a8 == pvVar17) goto LAB_0087c2a0;
        uVar14 = puVar15[(long)pvVar17];
        pvVar9 = (void *)((long)pvVar17 + 1);
      } while (uVar14 == 0);
    }
    else {
      pvVar17 = (void *)0x0;
    }
    uVar12 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
    uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
    uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
    uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
    uVar12 = LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) | (long)pvVar17 << 6;
    do {
      do {
        pvVar1 = local_80;
        puVar16 = (undefined8 *)((long)*param_1 + uVar12 * 0x18);
                    /* try { // try from 0087c144 to 0087c147 has its CatchHandler @ 0087c3a0 */
        lVar6 = FUN_008aa250(*puVar16,puVar16[1]);
        __s = local_88;
        pvVar9 = local_a0;
        uVar13 = (ulong)(lVar6 * -0x61c8864680b583eb) >> ((ulong)local_70 & 0x3f);
        uVar7 = uVar13 >> 6;
        uVar10 = 1L << (uVar13 & 0x3f);
        uVar8 = *(ulong *)((long)local_88 + uVar7 * 8);
        if ((uVar10 & uVar8) != 0) {
          pvVar18 = (void *)*puVar16;
          __n = puVar16[1];
          do {
            puVar16 = (undefined8 *)((long)pvVar9 + uVar13 * 0x18);
            __s1 = (void *)*puVar16;
            if (__s1 == (void *)0x0 || pvVar18 == (void *)0x0) {
              if (__s1 == pvVar18) break;
            }
            else if ((puVar16[1] == __n) && (iVar5 = memcmp(__s1,pvVar18,__n), iVar5 == 0)) break;
            uVar13 = uVar13 + 1 & (long)pvVar1 - 1U;
          } while ((*(ulong *)((long)__s + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0);
          uVar7 = uVar13 >> 6;
          uVar10 = 1L << (uVar13 & 0x3f);
          uVar8 = *(ulong *)((long)__s + uVar7 * 8);
        }
        *(ulong *)((long)__s + uVar7 * 8) = uVar8 | uVar10;
        puVar16 = (undefined8 *)((long)*param_1 + uVar12 * 0x18);
        uVar14 = uVar14 - 1 & uVar14;
        puVar11 = (undefined8 *)((long)pvVar9 + uVar13 * 0x18);
        local_78 = local_78 + 1;
        uVar20 = puVar16[1];
        uVar19 = *puVar16;
        puVar11[2] = puVar16[2];
        puVar11[1] = uVar20;
        *puVar11 = uVar19;
        if (uVar14 == 0) {
          pvVar18 = pvVar17;
          pvVar1 = local_a8;
          if (local_a8 <= (void *)((long)pvVar17 + 1U)) {
            pvVar1 = (void *)((long)pvVar17 + 1);
          }
          do {
            pvVar17 = (void *)((long)pvVar18 + 1);
            if (local_a8 <= pvVar17) {
              uVar14 = 0;
              pvVar17 = pvVar1;
              goto LAB_0087c124;
            }
            uVar14 = puVar15[(long)pvVar18 + 1];
            pvVar18 = pvVar17;
          } while (uVar14 == 0);
        }
        uVar12 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
        uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
        uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
        uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
        uVar12 = LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) | (long)pvVar17 << 6;
      } while (uVar14 != 0);
LAB_0087c124:
    } while (pvVar17 != local_a8);
    local_a8 = param_1[2];
    puVar15 = param_1[3];
    local_a0 = pvVar9;
  }
LAB_0087c2a0:
  pvVar9 = *param_1;
  pvVar17 = param_1[1];
  *param_1 = local_a0;
  param_1[1] = (void *)0x0;
  param_1[2] = (void *)0x0;
  param_1[3] = (void *)0x0;
  local_a0 = pvVar9;
  if (param_1 != &local_a0) {
    operator_delete((void *)0x0);
    puVar4 = local_88;
    pvVar9 = pvStack_90;
    __s = (void *)0x0;
    pvStack_90 = (void *)0x0;
    local_88 = (void *)0x0;
    param_1[3] = puVar4;
    param_1[2] = pvVar9;
    param_1[1] = local_98;
    local_98 = (void *)0x0;
  }
  operator_delete(__s);
  pvStack_90 = local_a8;
  local_98 = pvVar17;
  local_88 = puVar15;
  operator_delete((void *)0x0);
  pvVar9 = param_1[4];
  param_1[4] = local_80;
  uVar2 = *(undefined1 *)(param_1 + 6);
  *(byte *)(param_1 + 6) = local_70;
  local_80 = pvVar9;
  local_70 = uVar2;
  if (local_a0 != (void *)0x0) {
    operator_delete(local_a0);
    local_a0 = (void *)0x0;
    operator_delete(local_88);
    local_98 = (void *)0x0;
    pvStack_90 = (void *)0x0;
    local_88 = (ulong *)0x0;
    operator_delete((void *)0x0);
    local_80 = (void *)0x0;
    local_70 = 0x40;
  }
  operator_delete(local_88);
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

