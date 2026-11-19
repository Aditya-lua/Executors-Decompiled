/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00865c74
 */

/* WARNING: Removing unreachable block (ram,0x00865eb8) */

void FUN_00865c74(long *param_1,long param_2,long *param_3,ulong param_4,undefined8 *param_5)

{
  long lVar1;
  long lVar2;
  uint uVar3;
  undefined1 uVar4;
  long lVar5;
  undefined8 *puVar6;
  long *plVar7;
  long *plVar8;
  undefined8 *puVar9;
  ulong uVar10;
  long lVar11;
  undefined8 *puVar12;
  long lVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  undefined8 uVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  ulong uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  long local_98;
  long local_90;
  long lStack_88;
  long local_80;
  undefined8 uStack_78;
  undefined1 local_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  if ((param_4 & 1) == 0) {
    lVar11 = 0;
  }
  else {
    lStack_88 = param_3[1];
    local_90 = *param_3;
    local_98 = *(long *)(param_2 + 0x128);
    local_80 = 0;
    uStack_78 = 0;
    local_70 = 0;
    plVar7 = (long *)FUN_0086e18c(param_2 + 0x180,&local_98);
    lVar11 = *(long *)(param_2 + 0x158);
    lVar14 = *(long *)(param_2 + 0x160);
    plVar8 = (long *)FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),0x40);
    lVar13 = *plVar7;
    uVar3 = *(uint *)(lVar14 + -4);
    *plVar8 = local_98;
    plVar8[3] = lVar13;
    plVar8[4] = (lVar14 - lVar11 >> 3) + -1;
    plVar8[5] = (ulong)uVar3;
    *(undefined1 *)(plVar8 + 6) = local_70;
    plVar8[2] = lStack_88;
    plVar8[1] = local_90;
    *(undefined1 *)((long)plVar8 + 0x31) = 0;
    plVar8[7] = local_80;
    *plVar7 = (long)plVar8;
    FUN_0086e2d0(param_2 + 0x1b8,plVar7);
    lVar11 = *plVar7;
  }
  lVar13 = *(long *)(param_2 + 800);
  lVar14 = *(long *)(param_2 + 0x318);
  lVar16 = lVar13 - lVar14;
  if (param_5[2] == 0) {
    uVar21 = 0;
    lVar18 = 0;
    goto LAB_00865e90;
  }
  lVar20 = 0;
  lVar18 = 0;
  uVar21 = 0;
  do {
    lVar19 = *(long *)*param_5 + param_5[1] * 0x30;
                    /* try { // try from 00865d88 to 00865e0f has its CatchHandler @ 00865f38 */
    plVar7 = (long *)FUN_0086e18c(param_2 + 0x180,lVar19 + lVar20);
    lVar1 = *(long *)(param_2 + 0x158);
    lVar2 = *(long *)(param_2 + 0x160);
    puVar9 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),0x40);
    puVar12 = (undefined8 *)(lVar19 + lVar20);
    lVar19 = *plVar7;
    uVar3 = *(uint *)(lVar2 + -4);
    uVar17 = puVar12[3];
    uVar4 = *(undefined1 *)(puVar12 + 5);
    *puVar9 = *puVar12;
    uVar23 = puVar12[2];
    uVar22 = puVar12[1];
    puVar9[3] = lVar19;
    puVar9[4] = (lVar2 - lVar1 >> 3) + -1;
    puVar9[5] = (ulong)uVar3;
    *(undefined1 *)(puVar9 + 6) = uVar4;
    *(undefined1 *)((long)puVar9 + 0x31) = 0;
    puVar9[2] = uVar23;
    puVar9[1] = uVar22;
    puVar9[7] = uVar17;
    *plVar7 = (long)puVar9;
    FUN_0086e2d0(param_2 + 0x1b8,plVar7);
    local_98 = *plVar7;
    FUN_0086e2d0((long *)(param_2 + 0x318),&local_98);
    uVar21 = uVar21 + 1;
    lVar18 = lVar18 + 8;
    lVar20 = lVar20 + 0x30;
  } while (uVar21 < (ulong)param_5[2]);
  lVar20 = *(long *)(param_2 + 0x318);
                    /* try { // try from 00865e30 to 00865e37 has its CatchHandler @ 00865f34 */
  lVar18 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),lVar18);
  if ((uVar21 < 8) || ((ulong)((lVar14 + lVar18) - (lVar20 + lVar13)) < 0x20)) {
    uVar10 = 0;
LAB_00865e64:
    do {
      *(undefined8 *)(lVar18 + uVar10 * 8) = *(undefined8 *)(lVar20 + lVar16 + uVar10 * 8);
      uVar10 = uVar10 + 1;
    } while (uVar21 != uVar10);
  }
  else {
    uVar10 = uVar21 & 0xfffffffffffffffc;
    puVar12 = (undefined8 *)(lVar18 + 0x10);
    puVar9 = (undefined8 *)(lVar16 + lVar20 + 0x10);
    uVar15 = uVar10;
    do {
      puVar6 = puVar9 + -1;
      uVar17 = puVar9[-2];
      uVar23 = puVar9[1];
      uVar22 = *puVar9;
      uVar15 = uVar15 - 4;
      puVar9 = puVar9 + 4;
      puVar12[-1] = *puVar6;
      puVar12[-2] = uVar17;
      puVar12[1] = uVar23;
      *puVar12 = uVar22;
      puVar12 = puVar12 + 4;
    } while (uVar15 != 0);
    if (uVar21 != uVar10) goto LAB_00865e64;
  }
  lVar14 = *(long *)(param_2 + 0x318);
LAB_00865e90:
  lVar13 = *(long *)(param_2 + 800);
  *param_1 = lVar11;
  param_1[1] = lVar18;
  param_1[2] = uVar21;
  if (lVar16 + lVar14 != lVar13) {
    *(long *)(param_2 + 800) = lVar16 + lVar14;
  }
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

