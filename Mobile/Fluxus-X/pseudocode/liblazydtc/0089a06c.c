/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089a06c
 */

void FUN_0089a06c(undefined8 *param_1,long param_2,undefined8 param_3)

{
  ulong uVar1;
  int *piVar2;
  uint uVar3;
  uint uVar4;
  ulong uVar5;
  undefined4 uVar6;
  undefined1 uVar7;
  long lVar8;
  uint uVar9;
  int iVar10;
  undefined8 uVar11;
  char *pcVar12;
  size_t sVar13;
  void *pvVar14;
  long lVar15;
  uint uVar16;
  undefined8 uVar17;
  int *piVar18;
  int *piVar19;
  ulong uVar20;
  int *__dest;
  int *piVar21;
  int local_128;
  undefined2 local_124;
  void *local_120;
  void *pvStack_118;
  long local_110;
  int *local_108;
  int *local_100;
  int *local_f8;
  undefined1 local_f0 [16];
  undefined8 *local_e0;
  undefined1 *puStack_d8;
  undefined1 *local_d0;
  int *piStack_c8;
  byte *local_c0;
  byte local_b8 [4];
  undefined1 local_b4 [4];
  int local_b0;
  undefined2 local_ac;
  void *local_a8;
  void *pvStack_a0;
  long local_98;
  int *piStack_90;
  int *local_88;
  int *piStack_80;
  undefined1 local_74 [4];
  long local_70;
  
  lVar8 = tpidr_el0;
  local_70 = *(long *)(lVar8 + 0x28);
  uVar6 = *(undefined4 *)((long)param_1 + 0x64c);
  uVar7 = *(undefined1 *)(param_2 + 0x44);
  local_74[0] = (undefined1)param_3;
  if (*(long *)(param_2 + 0x28) == 0) {
                    /* try { // try from 0089a108 to 0089a117 has its CatchHandler @ 0089a50c */
    FUN_00875b54(*param_1,0x5a,param_3,0xff,uVar7);
  }
  else {
                    /* try { // try from 0089a0bc to 0089a0c3 has its CatchHandler @ 0089a514 */
    uVar9 = FUN_0088df20(param_1);
    lVar15 = *(long *)(param_2 + 0x28);
    uVar16 = *(uint *)((long)param_1 + 0x64c);
    uVar3 = uVar16;
    if ((int)uVar9 < 0 && lVar15 != 0) {
      uVar3 = uVar16 + 1;
    }
    if (0xff < uVar3) {
      if (*(long *)(lVar8 + 0x28) == local_70) {
                    /* try { // try from 0089a4c8 to 0089a4db has its CatchHandler @ 0089a530 */
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 0xc,
                     "Out of registers when trying to allocate %d registers: exceeded limit %d",
                     (int)uVar9 < 0 && lVar15 != 0,0xff);
      }
      goto LAB_0089a580;
    }
    *(uint *)((long)param_1 + 0x64c) = uVar3;
    uVar4 = *(uint *)(param_1 + 0xca);
    if (*(uint *)(param_1 + 0xca) <= uVar3) {
      uVar4 = uVar3;
    }
    *(uint *)(param_1 + 0xca) = uVar4;
    if ((int)uVar9 < 0) {
                    /* try { // try from 0089a11c to 0089a143 has its CatchHandler @ 0089a530 */
      FUN_0088d1d0(param_1,lVar15,uVar16,0);
    }
    else {
      uVar16 = uVar9;
    }
    FUN_00875b54(*param_1,0x5a,local_74[0],uVar16,uVar7);
  }
                    /* try { // try from 0089a148 to 0089a15f has its CatchHandler @ 0089a544 */
  uVar11 = FUN_00875ec8(*param_1);
  FUN_00875d18(*param_1,0xdeadbeef);
  uVar17 = *param_1;
  local_ac = 0;
  pvStack_a0 = (void *)0x0;
  local_a8 = (void *)0x0;
  piStack_90 = (int *)0x0;
  local_98 = 0;
  piStack_80 = (int *)0x0;
  local_88 = (int *)0x0;
                    /* try { // try from 0089a17c to 0089a19b has its CatchHandler @ 0089a540 */
  pcVar12 = (char *)FUN_008507d0(param_2);
  sVar13 = strlen(pcVar12);
  iVar10 = FUN_00875070(uVar17,pcVar12,sVar13);
  local_b0 = iVar10;
                    /* try { // try from 0089a1a4 to 0089a1ab has its CatchHandler @ 0089a53c */
  local_f0 = FUN_00850840(param_2);
  if (iVar10 < 0) {
    if (*(long *)(lVar8 + 0x28) == local_70) {
                    /* try { // try from 0089a430 to 0089a43f has its CatchHandler @ 0089a53c */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(local_f0,"Exceeded constant limit; simplify the code to compile");
    }
    goto LAB_0089a580;
  }
  iVar10 = *(int *)((long)param_1 + 0x64c);
  uVar3 = iVar10 + 1;
  if (0xff < uVar3) {
    if (*(long *)(lVar8 + 0x28) == local_70) {
                    /* try { // try from 0089a454 to 0089a46b has its CatchHandler @ 0089a52c */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",1,0xff
                  );
    }
    goto LAB_0089a580;
  }
  *(uint *)((long)param_1 + 0x64c) = uVar3;
  local_b4[0] = (undefined1)iVar10;
  local_b8[0] = 0;
  uVar16 = *(uint *)(param_1 + 0xca);
  if (*(uint *)(param_1 + 0xca) <= uVar3) {
    uVar16 = uVar3;
  }
  *(uint *)(param_1 + 0xca) = uVar16;
  if (*(long *)(param_2 + 0x38) == 0) {
LAB_0089a250:
    uVar17 = *param_1;
                    /* try { // try from 0089a258 to 0089a2df has its CatchHandler @ 0089a54c */
    pcVar12 = (char *)FUN_00853198(param_1[199],"__init");
    sVar13 = strlen(pcVar12);
    iVar10 = FUN_00875070(uVar17,pcVar12,sVar13);
    piVar18 = piStack_90;
    if (iVar10 < 0) {
      if (*(long *)(lVar8 + 0x28) == local_70) {
                    /* try { // try from 0089a4a4 to 0089a4b3 has its CatchHandler @ 0089a54c */
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
      }
      goto LAB_0089a580;
    }
    if (piStack_80 <= local_88) {
      sVar13 = (long)local_88 - (long)piStack_90;
      uVar1 = ((long)sVar13 >> 2) + 1;
      if (uVar1 >> 0x3e == 0) {
        uVar20 = (long)piStack_80 - (long)piStack_90;
        uVar5 = (long)uVar20 >> 1;
        if ((ulong)((long)uVar20 >> 1) <= uVar1) {
          uVar5 = uVar1;
        }
        if (0x7ffffffffffffffb < uVar20) {
          uVar5 = 0x3fffffffffffffff;
        }
        if (uVar5 >> 0x3e == 0) {
          pvVar14 = operator_new(uVar5 << 2);
          piVar19 = (int *)((long)pvVar14 + sVar13);
          piVar2 = (int *)((long)pvVar14 + uVar5 * 4);
          __dest = piVar19 + -((long)sVar13 >> 2);
          piVar21 = piVar19 + 1;
          *piVar19 = iVar10;
          memcpy(__dest,piVar18,sVar13);
          piStack_90 = __dest;
          piStack_80 = piVar2;
          if (piVar18 != (int *)0x0) {
            local_88 = piVar21;
            operator_delete(piVar18,uVar20);
          }
          goto LAB_0089a320;
        }
      }
      else {
        if (*(long *)(lVar8 + 0x28) != local_70) goto LAB_0089a580;
                    /* try { // try from 0089a4f0 to 0089a50b has its CatchHandler @ 0089a54c */
        FUN_00879790();
      }
      if (*(long *)(lVar8 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe1b8();
      }
      goto LAB_0089a580;
    }
    piVar21 = local_88 + 1;
    *local_88 = iVar10;
  }
  else {
    piVar18 = *(int **)(param_2 + 0x30);
    piVar19 = piVar18 + *(long *)(param_2 + 0x38) * 0x16;
    do {
                    /* try { // try from 0089a224 to 0089a22f has its CatchHandler @ 0089a550 */
      local_f0._0_8_ = param_1;
      local_f0._8_8_ = &local_b0;
      local_e0 = param_1;
      puStack_d8 = local_b4;
      local_d0 = local_74;
      piStack_c8 = &local_b0;
      local_c0 = local_b8;
      (*(code *)(&PTR_LAB_00c4b748)[*piVar18])(local_f0,piVar18 + 2);
      piVar18 = piVar18 + 0x16;
    } while (piVar18 != piVar19);
    if ((local_b8[0] & 1) == 0) goto LAB_0089a250;
    piVar21 = local_88;
  }
LAB_0089a320:
  local_110 = local_98;
  pvStack_118 = pvStack_a0;
  local_120 = local_a8;
  local_128 = local_b0;
  local_124 = local_ac;
  pvStack_a0 = (void *)0x0;
  local_98 = 0;
  local_a8 = (void *)0x0;
  local_108 = piStack_90;
  local_f8 = piStack_80;
  local_88 = (int *)0x0;
  piStack_80 = (int *)0x0;
  piStack_90 = (int *)0x0;
                    /* try { // try from 0089a360 to 0089a367 has its CatchHandler @ 0089a51c */
  local_100 = piVar21;
  iVar10 = FUN_00875a20(*param_1,&local_128);
  if (local_108 != (int *)0x0) {
    local_100 = local_108;
    operator_delete(local_108,(long)local_f8 - (long)local_108);
  }
  if (local_120 != (void *)0x0) {
    pvStack_118 = local_120;
    operator_delete(local_120,local_110 - (long)local_120);
  }
  if (iVar10 < 0) {
    if (*(long *)(lVar8 + 0x28) == local_70) {
                    /* try { // try from 0089a480 to 0089a48f has its CatchHandler @ 0089a538 */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
    }
  }
  else {
                    /* try { // try from 0089a3a4 to 0089a3af has its CatchHandler @ 0089a538 */
    FUN_00876080(*param_1,uVar11,iVar10);
    if (piStack_90 != (int *)0x0) {
      local_88 = piStack_90;
      operator_delete(piStack_90,(long)piStack_80 - (long)piStack_90);
    }
    if (local_a8 != (void *)0x0) {
      pvStack_a0 = local_a8;
      operator_delete(local_a8,local_98 - (long)local_a8);
    }
    *(undefined4 *)((long)param_1 + 0x64c) = uVar6;
    if (*(long *)(lVar8 + 0x28) == local_70) {
      return;
    }
  }
LAB_0089a580:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

