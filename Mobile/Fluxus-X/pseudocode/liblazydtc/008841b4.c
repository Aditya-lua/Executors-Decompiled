/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008841b4
 */

/* WARNING: Removing unreachable block (ram,0x008844e0) */

void FUN_008841b4(long *param_1,ulong *param_2)

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
        if (*(ulong *)(*param_1 + uVar17 * 0x40) == uVar13) {
          return;
        }
        uVar17 = uVar17 + 1 & param_1[4] - 1U;
      } while ((*(ulong *)(param_1[3] + (uVar17 >> 6) * 8) >> (uVar17 & 0x3f) & 1) != 0);
    }
  }
  lVar5 = tpidr_el0;
  local_58 = *(long *)(lVar5 + 0x28);
  uStack_80 = 0;
  local_78 = (void *)0x0;
  uVar13 = 0x10;
  if (param_1[4] != 0) {
    uVar13 = param_1[4] << 1;
  }
  local_88 = uVar13;
  if (uVar13 == 0) {
    uVar14 = 0;
    pvVar6 = (void *)0x0;
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
                    /* try { // try from 008842f0 to 008842f3 has its CatchHandler @ 008845ac */
    pvVar6 = operator_new(uVar13 << 6);
    uVar17 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
    uVar17 = (uVar17 & 0xcccccccccccccccc) >> 2 | (uVar17 & 0x3333333333333333) << 2;
    uVar17 = (uVar17 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar17 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar17 = (uVar17 & 0xff00ff00ff00ff00) >> 8 | (uVar17 & 0xff00ff00ff00ff) << 8;
    uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
    uVar15 = uVar13 - 1;
    uVar4 = 0x40 - (int)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20);
    local_60 = (undefined1)uVar4;
    uVar14 = (ulong)uVar4 & 0xff;
    uVar17 = param_1[2];
    puVar19 = (ulong *)param_1[3];
    local_70 = uVar13;
  }
  if (uVar17 != 0) {
    uVar13 = *puVar19;
    if (uVar13 == 0) {
      uVar7 = 1;
      do {
        uVar18 = uVar7;
        if (uVar17 == uVar18) goto LAB_008844e8;
        uVar13 = puVar19[uVar18];
        uVar7 = uVar18 + 1;
      } while (uVar13 == 0);
    }
    else {
      uVar18 = 0;
    }
    uVar7 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
    uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
    uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
    uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
    local_68 = 0;
    uVar7 = LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) | uVar18 << 6;
    do {
      do {
        puVar1 = (ulong *)(*param_1 + uVar7 * 0x40);
        uVar8 = *puVar1;
        uVar9 = ((ulong)(uint)((int)uVar8 << 3) + 8 ^ uVar8 >> 0x20) * -0x622015f714c7d297;
        uVar9 = (uVar8 >> 0x20 ^ uVar9 >> 0x2f ^ uVar9) * -0x622015f714c7d297;
        uVar9 = (uVar9 ^ uVar9 >> 0x2f) * -0x6b622cb0470b6a63 >> (uVar14 & 0x3f);
        uVar10 = uVar9 >> 6;
        uVar11 = 1L << (uVar9 & 0x3f);
        uVar12 = *(ulong *)((long)__s + uVar10 * 8);
        if ((uVar11 & uVar12) != 0) {
          do {
            if (*(ulong *)((long)pvVar6 + uVar9 * 0x40) == uVar8) {
              uVar10 = uVar9 >> 6;
              uVar11 = 1L << (uVar9 & 0x3f);
              break;
            }
            uVar9 = uVar9 + 1 & uVar15;
            uVar10 = uVar9 >> 6;
            uVar11 = 1L << (uVar9 & 0x3f);
          } while ((*(ulong *)((long)__s + uVar10 * 8) & uVar11) != 0);
          uVar12 = *(ulong *)((long)__s + uVar10 * 8);
        }
        puVar2 = (ulong *)((long)pvVar6 + uVar9 * 0x40);
        local_68 = local_68 + 1;
        *(ulong *)((long)__s + uVar10 * 8) = uVar12 | uVar11;
        uVar9 = puVar1[1];
        *puVar2 = uVar8;
        uVar8 = puVar1[4];
        uVar11 = puVar1[3];
        uVar10 = puVar1[2];
        puVar2[1] = uVar9;
        puVar2[4] = uVar8;
        uVar8 = puVar1[7];
        puVar2[3] = uVar11;
        puVar2[2] = uVar10;
        puVar1[3] = 0;
        puVar1[4] = 0;
        uVar10 = puVar1[6];
        uVar9 = puVar1[5];
        puVar1[2] = 0;
        *(char *)(puVar2 + 7) = (char)uVar8;
        uVar13 = uVar13 - 1 & uVar13;
        puVar2[6] = uVar10;
        puVar2[5] = uVar9;
        puVar1[1] = 0;
        puVar1[5] = 0;
        puVar1[6] = 0;
        *(undefined1 *)(puVar1 + 7) = 0x40;
        if (uVar13 == 0) {
          uVar9 = uVar18;
          uVar8 = uVar17;
          if (uVar17 <= uVar18 + 1) {
            uVar8 = uVar18 + 1;
          }
          do {
            uVar18 = uVar9 + 1;
            if (uVar17 <= uVar18) {
              uVar13 = 0;
              goto LAB_008844c8;
            }
            uVar13 = puVar19[uVar9 + 1];
            uVar9 = uVar18;
          } while (uVar13 == 0);
        }
        uVar7 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
        uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
        uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
        uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
        uVar7 = LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) | uVar18 << 6;
        uVar8 = uVar18;
      } while (uVar13 != 0);
LAB_008844c8:
      uVar18 = uVar8;
    } while (uVar8 != uVar17);
    uVar17 = param_1[2];
    puVar19 = (ulong *)param_1[3];
  }
LAB_008844e8:
  local_90 = *param_1;
  lVar3 = param_1[1];
  *param_1 = (long)pvVar6;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  if (param_1 != &local_90) {
    operator_delete((void *)0x0);
    puVar1 = local_78;
    uVar13 = uStack_80;
    __s = (void *)0x0;
    uStack_80 = 0;
    local_78 = (void *)0x0;
    param_1[3] = (long)puVar1;
    param_1[2] = uVar13;
    param_1[1] = local_88;
    local_88 = 0;
  }
  operator_delete(__s);
  local_88 = lVar3;
  uStack_80 = uVar17;
  local_78 = puVar19;
  operator_delete((void *)0x0);
  lVar16 = param_1[4];
  param_1[4] = local_70;
  lVar3 = param_1[6];
  *(undefined1 *)(param_1 + 6) = local_60;
  local_70 = lVar16;
  local_60 = (char)lVar3;
  if (local_90 != 0) {
                    /* try { // try from 0088456c to 00884573 has its CatchHandler @ 008845a8 */
    FUN_00882bf8(&local_90);
  }
  operator_delete(local_78);
  if (*(long *)(lVar5 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

