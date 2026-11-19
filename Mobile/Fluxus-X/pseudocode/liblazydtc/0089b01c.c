/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089b01c
 */

/* WARNING: Removing unreachable block (ram,0x0089b35c) */

void FUN_0089b01c(long *param_1,ulong *param_2)

{
  long lVar1;
  uint uVar2;
  long lVar3;
  void *__s;
  void *pvVar4;
  ulong uVar5;
  ulong *puVar6;
  ulong uVar7;
  ulong uVar8;
  ulong *puVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  ulong uVar18;
  ulong *puVar19;
  long local_90;
  ulong local_88;
  ulong uStack_80;
  ulong *local_78;
  ulong local_70;
  long local_68;
  undefined1 local_60;
  long local_58;
  
  if ((ulong)param_1[5] < (ulong)(param_1[4] * 3) >> 2) {
    return;
  }
  if (param_1[5] != 0) {
    uVar13 = *param_2;
    uVar17 = ((ulong)(uint)((int)uVar13 << 3) + 8 ^ uVar13 >> 0x20) * -0x622015f714c7d297;
    uVar17 = (uVar13 >> 0x20 ^ uVar17 >> 0x2f ^ uVar17) * -0x622015f714c7d297;
    uVar17 = (uVar17 ^ uVar17 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 6) & 0x3f);
    if ((*(ulong *)(param_1[3] + (uVar17 >> 6) * 8) >> (uVar17 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*param_1 + uVar17 * 0x50) == uVar13) {
          return;
        }
        uVar17 = uVar17 + 1 & param_1[4] - 1U;
      } while ((*(ulong *)(param_1[3] + (uVar17 >> 6) * 8) >> (uVar17 & 0x3f) & 1) != 0);
    }
  }
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  uStack_80 = 0;
  local_78 = (void *)0x0;
  uVar13 = 0x10;
  if (param_1[4] != 0) {
    uVar13 = param_1[4] << 1;
  }
  local_88 = uVar13;
  if (uVar13 == 0) {
    uVar14 = 0;
    pvVar4 = (void *)0x0;
    __s = (void *)0x0;
    local_70 = 0;
    local_68 = 0;
    uVar15 = 0xffffffffffffffff;
    local_60 = 0x40;
    uVar17 = param_1[2];
    puVar19 = (ulong *)param_1[3];
  }
  else {
    uStack_80 = uVar13;
    if (uVar13 < 0x41) {
      uStack_80 = 0x40;
    }
    uStack_80 = uStack_80 >> 6;
    uVar17 = uStack_80 << 3;
    __s = operator_new(uVar17);
    local_78 = __s;
    memset(__s,0,uVar17);
    local_68 = 0;
                    /* try { // try from 0089b160 to 0089b163 has its CatchHandler @ 0089b428 */
    pvVar4 = operator_new(uVar13 * 0x50);
    uVar17 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
    uVar17 = (uVar17 & 0xcccccccccccccccc) >> 2 | (uVar17 & 0x3333333333333333) << 2;
    uVar17 = (uVar17 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar17 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar17 = (uVar17 & 0xff00ff00ff00ff00) >> 8 | (uVar17 & 0xff00ff00ff00ff) << 8;
    uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
    uVar15 = uVar13 - 1;
    uVar2 = 0x40 - (int)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20);
    local_60 = (undefined1)uVar2;
    uVar14 = (ulong)uVar2 & 0xff;
    uVar17 = param_1[2];
    puVar19 = (ulong *)param_1[3];
    local_70 = uVar13;
  }
  if (uVar17 != 0) {
    uVar13 = *puVar19;
    if (uVar13 == 0) {
      uVar5 = 1;
      do {
        uVar18 = uVar5;
        if (uVar17 == uVar18) goto LAB_0089b364;
        uVar13 = puVar19[uVar18];
        uVar5 = uVar18 + 1;
      } while (uVar13 == 0);
    }
    else {
      uVar18 = 0;
    }
    uVar5 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
    uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
    uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
    uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
    local_68 = 0;
    uVar5 = LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) | uVar18 << 6;
    do {
      do {
        puVar6 = (ulong *)(*param_1 + uVar5 * 0x50);
        uVar7 = *puVar6;
        uVar8 = ((ulong)(uint)((int)uVar7 << 3) + 8 ^ uVar7 >> 0x20) * -0x622015f714c7d297;
        uVar8 = (uVar7 >> 0x20 ^ uVar8 >> 0x2f ^ uVar8) * -0x622015f714c7d297;
        uVar8 = (uVar8 ^ uVar8 >> 0x2f) * -0x6b622cb0470b6a63 >> (uVar14 & 0x3f);
        uVar10 = uVar8 >> 6;
        uVar11 = 1L << (uVar8 & 0x3f);
        uVar12 = *(ulong *)((long)__s + uVar10 * 8);
        if ((uVar11 & uVar12) != 0) {
          do {
            if (*(ulong *)((long)pvVar4 + uVar8 * 0x50) == uVar7) {
              uVar10 = uVar8 >> 6;
              uVar11 = 1L << (uVar8 & 0x3f);
              break;
            }
            uVar8 = uVar8 + 1 & uVar15;
            uVar10 = uVar8 >> 6;
            uVar11 = 1L << (uVar8 & 0x3f);
          } while ((*(ulong *)((long)__s + uVar10 * 8) & uVar11) != 0);
          uVar12 = *(ulong *)((long)__s + uVar10 * 8);
        }
        puVar9 = (ulong *)((long)pvVar4 + uVar8 * 0x50);
        *(ulong *)((long)__s + uVar10 * 8) = uVar12 | uVar11;
        uVar8 = puVar6[1];
        local_68 = local_68 + 1;
        puVar9[3] = 0;
        puVar9[4] = 0;
        puVar9[2] = 0;
        uVar11 = puVar6[3];
        uVar10 = puVar6[2];
        *puVar9 = uVar7;
        *(int *)(puVar9 + 1) = (int)uVar8;
        puVar9[3] = uVar11;
        puVar9[2] = uVar10;
        uVar13 = uVar13 - 1 & uVar13;
        puVar9[4] = puVar6[4];
        uVar8 = puVar6[8];
        uVar7 = puVar6[7];
        uVar11 = puVar6[6];
        uVar10 = puVar6[5];
        puVar6[2] = 0;
        puVar6[3] = 0;
        puVar6[4] = 0;
        *(char *)(puVar9 + 9) = (char)puVar6[9];
        puVar9[8] = uVar8;
        puVar9[7] = uVar7;
        puVar9[6] = uVar11;
        puVar9[5] = uVar10;
        if (uVar13 == 0) {
          uVar8 = uVar18;
          uVar7 = uVar17;
          if (uVar17 <= uVar18 + 1) {
            uVar7 = uVar18 + 1;
          }
          do {
            uVar18 = uVar8 + 1;
            if (uVar17 <= uVar18) {
              uVar13 = 0;
              goto LAB_0089b344;
            }
            uVar13 = puVar19[uVar8 + 1];
            uVar8 = uVar18;
          } while (uVar13 == 0);
        }
        uVar5 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
        uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
        uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        uVar5 = LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) | uVar18 << 6;
        uVar7 = uVar18;
      } while (uVar13 != 0);
LAB_0089b344:
      uVar18 = uVar7;
    } while (uVar7 != uVar17);
    uVar17 = param_1[2];
    puVar19 = (ulong *)param_1[3];
  }
LAB_0089b364:
  local_90 = *param_1;
  lVar1 = param_1[1];
  *param_1 = (long)pvVar4;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  if (param_1 != &local_90) {
    operator_delete((void *)0x0);
    puVar6 = local_78;
    uVar13 = uStack_80;
    __s = (void *)0x0;
    uStack_80 = 0;
    local_78 = (void *)0x0;
    param_1[3] = (long)puVar6;
    param_1[2] = uVar13;
    param_1[1] = local_88;
    local_88 = 0;
  }
  operator_delete(__s);
  local_88 = lVar1;
  uStack_80 = uVar17;
  local_78 = puVar19;
  operator_delete((void *)0x0);
  lVar16 = param_1[4];
  param_1[4] = local_70;
  lVar1 = param_1[6];
  *(undefined1 *)(param_1 + 6) = local_60;
  local_70 = lVar16;
  local_60 = (char)lVar1;
  if (local_90 != 0) {
                    /* try { // try from 0089b3e8 to 0089b3ef has its CatchHandler @ 0089b424 */
    FUN_00882ff0(&local_90);
  }
  operator_delete(local_78);
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

