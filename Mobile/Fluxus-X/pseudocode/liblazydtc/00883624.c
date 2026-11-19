/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00883624
 */

/* WARNING: Removing unreachable block (ram,0x00883930) */

void FUN_00883624(long *param_1,ulong *param_2)

{
  ulong *puVar1;
  ulong *puVar2;
  long lVar3;
  uint uVar4;
  long lVar5;
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
  long lVar15;
  ulong uVar16;
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
    uVar12 = *param_2;
    uVar16 = ((ulong)(uint)((int)uVar12 << 3) + 8 ^ uVar12 >> 0x20) * -0x622015f714c7d297;
    uVar16 = (uVar12 >> 0x20 ^ uVar16 >> 0x2f ^ uVar16) * -0x622015f714c7d297;
    uVar16 = (uVar16 ^ uVar16 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 6) & 0x3f);
    if ((*(ulong *)(param_1[3] + (uVar16 >> 6) * 8) >> (uVar16 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*param_1 + uVar16 * 0x20) == uVar12) {
          return;
        }
        uVar16 = uVar16 + 1 & param_1[4] - 1U;
      } while ((*(ulong *)(param_1[3] + (uVar16 >> 6) * 8) >> (uVar16 & 0x3f) & 1) != 0);
    }
  }
  lVar5 = tpidr_el0;
  local_58 = *(long *)(lVar5 + 0x28);
  uStack_80 = 0;
  local_78 = (void *)0x0;
  uVar12 = 0x10;
  if (param_1[4] != 0) {
    uVar12 = param_1[4] << 1;
  }
  local_88 = uVar12;
  if (uVar12 == 0) {
    uVar13 = 0;
    pvVar6 = (void *)0x0;
    __s = (void *)0x0;
    local_70 = 0;
    local_68 = 0;
    uVar14 = 0xffffffffffffffff;
    local_60 = 0x40;
    uVar16 = param_1[2];
    puVar19 = (ulong *)param_1[3];
  }
  else {
    uStack_80 = uVar12;
    if (uVar12 < 0x41) {
      uStack_80 = 0x40;
    }
    uStack_80 = uStack_80 >> 6;
    uVar16 = uStack_80 << 3;
    __s = operator_new(uVar16);
    local_78 = __s;
    memset(__s,0,uVar16);
    local_68 = 0;
                    /* try { // try from 00883760 to 00883763 has its CatchHandler @ 008839fc */
    pvVar6 = operator_new(uVar12 << 5);
    uVar16 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
    uVar16 = (uVar16 & 0xcccccccccccccccc) >> 2 | (uVar16 & 0x3333333333333333) << 2;
    uVar16 = (uVar16 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar16 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar16 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
    uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
    uVar14 = uVar12 - 1;
    uVar4 = 0x40 - (int)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20);
    local_60 = (undefined1)uVar4;
    uVar13 = (ulong)uVar4 & 0xff;
    uVar16 = param_1[2];
    puVar19 = (ulong *)param_1[3];
    local_70 = uVar12;
  }
  if (uVar16 != 0) {
    uVar12 = *puVar19;
    if (uVar12 == 0) {
      uVar18 = 1;
      do {
        uVar17 = uVar18;
        if (uVar16 == uVar17) goto LAB_00883938;
        uVar12 = puVar19[uVar17];
        uVar18 = uVar17 + 1;
      } while (uVar12 == 0);
    }
    else {
      uVar17 = 0;
    }
    uVar18 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
    uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
    uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
    uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
    local_68 = 0;
    uVar18 = LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) | uVar17 << 6;
    do {
      do {
        puVar1 = (ulong *)(*param_1 + uVar18 * 0x20);
        uVar7 = *puVar1;
        uVar8 = ((ulong)(uint)((int)uVar7 << 3) + 8 ^ uVar7 >> 0x20) * -0x622015f714c7d297;
        uVar8 = (uVar7 >> 0x20 ^ uVar8 >> 0x2f ^ uVar8) * -0x622015f714c7d297;
        uVar8 = (uVar8 ^ uVar8 >> 0x2f) * -0x6b622cb0470b6a63 >> (uVar13 & 0x3f);
        uVar9 = uVar8 >> 6;
        uVar10 = 1L << (uVar8 & 0x3f);
        uVar11 = *(ulong *)((long)__s + uVar9 * 8);
        if ((uVar10 & uVar11) != 0) {
          do {
            if (*(ulong *)((long)pvVar6 + uVar8 * 0x20) == uVar7) {
              uVar9 = uVar8 >> 6;
              uVar10 = 1L << (uVar8 & 0x3f);
              break;
            }
            uVar8 = uVar8 + 1 & uVar14;
            uVar9 = uVar8 >> 6;
            uVar10 = 1L << (uVar8 & 0x3f);
          } while ((*(ulong *)((long)__s + uVar9 * 8) & uVar10) != 0);
          uVar11 = *(ulong *)((long)__s + uVar9 * 8);
        }
        puVar2 = (ulong *)((long)pvVar6 + uVar8 * 0x20);
        *(ulong *)((long)__s + uVar9 * 8) = uVar11 | uVar10;
        local_68 = local_68 + 1;
        puVar2[1] = 0;
        puVar2[2] = 0;
        puVar2[3] = 0;
        uVar9 = puVar1[2];
        uVar8 = puVar1[1];
        *puVar2 = uVar7;
        puVar2[2] = uVar9;
        puVar2[1] = uVar8;
        puVar2[3] = puVar1[3];
        uVar12 = uVar12 - 1 & uVar12;
        puVar1[1] = 0;
        puVar1[2] = 0;
        puVar1[3] = 0;
        if (uVar12 == 0) {
          uVar8 = uVar17;
          uVar7 = uVar16;
          if (uVar16 <= uVar17 + 1) {
            uVar7 = uVar17 + 1;
          }
          do {
            uVar17 = uVar8 + 1;
            if (uVar16 <= uVar17) {
              uVar12 = 0;
              goto LAB_00883918;
            }
            uVar12 = puVar19[uVar8 + 1];
            uVar8 = uVar17;
          } while (uVar12 == 0);
        }
        uVar18 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
        uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
        uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
        uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
        uVar18 = LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) | uVar17 << 6;
        uVar7 = uVar17;
      } while (uVar12 != 0);
LAB_00883918:
      uVar17 = uVar7;
    } while (uVar7 != uVar16);
    uVar16 = param_1[2];
    puVar19 = (ulong *)param_1[3];
  }
LAB_00883938:
  local_90 = *param_1;
  lVar3 = param_1[1];
  *param_1 = (long)pvVar6;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  if (param_1 != &local_90) {
    operator_delete((void *)0x0);
    puVar1 = local_78;
    uVar12 = uStack_80;
    __s = (void *)0x0;
    uStack_80 = 0;
    local_78 = (void *)0x0;
    param_1[3] = (long)puVar1;
    param_1[2] = uVar12;
    param_1[1] = local_88;
    local_88 = 0;
  }
  operator_delete(__s);
  local_88 = lVar3;
  uStack_80 = uVar16;
  local_78 = puVar19;
  operator_delete((void *)0x0);
  lVar15 = param_1[4];
  param_1[4] = local_70;
  lVar3 = param_1[6];
  *(undefined1 *)(param_1 + 6) = local_60;
  local_70 = lVar15;
  local_60 = (char)lVar3;
  if (local_90 != 0) {
                    /* try { // try from 008839bc to 008839c3 has its CatchHandler @ 008839f8 */
    FUN_00882da0(&local_90);
  }
  operator_delete(local_78);
  if (*(long *)(lVar5 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

