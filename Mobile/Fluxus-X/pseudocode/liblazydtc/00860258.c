/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00860258
 */

undefined8 FUN_00860258(long param_1,undefined8 *param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  uint uVar4;
  long lVar5;
  bool bVar6;
  int iVar7;
  undefined8 uVar8;
  long *plVar9;
  undefined8 *puVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  undefined8 uVar16;
  long lVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  undefined8 local_160;
  undefined8 uStack_158;
  undefined1 auStack_150 [8];
  undefined8 local_148;
  undefined4 local_140;
  undefined4 uStack_13c;
  undefined4 uStack_138;
  undefined4 uStack_134;
  undefined4 uStack_130;
  undefined4 uStack_12c;
  undefined8 uStack_128;
  undefined1 local_114 [16];
  undefined1 local_104;
  ulong local_100;
  undefined8 uStack_f8;
  undefined1 local_f0;
  ulong local_e0;
  undefined8 uStack_d8;
  undefined1 local_d0;
  undefined8 local_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  long local_a8;
  undefined8 uStack_a0;
  undefined1 local_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined1 local_80;
  long local_70;
  
  lVar5 = tpidr_el0;
  local_70 = *(long *)(lVar5 + 0x28);
  if ((*(int *)(param_1 + 0x90) == 0x119) && (*(char **)(param_1 + 0xa8) != (char *)0x0)) {
    iVar7 = strcmp(*(char **)(param_1 + 0xa8),"const");
    bVar6 = iVar7 == 0;
  }
  else {
    bVar6 = false;
  }
  uStack_88 = *(undefined8 *)(param_1 + 0x9c);
  local_90 = *(undefined8 *)(param_1 + 0x94);
  local_80 = 1;
  FUN_00858f2c(param_1);
  FUN_00860d94(&local_c0,param_1,bVar6);
  iVar7 = *(int *)(param_1 + 0x90);
  if (iVar7 == 0x2c) {
    FUN_00860ecc(param_1,param_1 + 0x94,
                 "Expected \'=\' after variable name in \'if local\', got \',\'; only a single binding is allowed"
                );
    iVar7 = *(int *)(param_1 + 0x90);
  }
  local_e0 = local_e0 & 0xffffffffffffff00;
  local_d0 = 0;
  if (iVar7 == 0x3d) {
    uStack_d8 = *(undefined8 *)(param_1 + 0x9c);
    local_e0 = *(ulong *)(param_1 + 0x94);
    local_d0 = 1;
    FUN_00858f2c(param_1);
  }
  else {
    FUN_0086e3b4(param_1,0x3d,"if local declaration");
  }
  uVar8 = FUN_0086060c(param_1,0);
  lVar1 = *(long *)(param_1 + 0x1b8);
  lVar2 = *(long *)(param_1 + 0x1c0);
  plVar9 = (long *)FUN_0086e18c(param_1 + 0x180,&local_c0);
  lVar17 = *(long *)(param_1 + 0x158);
  lVar14 = *(long *)(param_1 + 0x160);
  puVar10 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x40);
  lVar15 = *plVar9;
  uVar4 = *(uint *)(lVar14 + -4);
  *puVar10 = local_c0;
  puVar10[3] = lVar15;
  puVar10[4] = (lVar14 - lVar17 >> 3) + -1;
  puVar10[5] = (ulong)uVar4;
  *(undefined1 *)(puVar10 + 6) = local_98;
  puVar10[2] = uStack_b0;
  puVar10[1] = local_b8;
  *(undefined1 *)((long)puVar10 + 0x31) = 0;
  puVar10[7] = local_a8;
  *plVar9 = (long)puVar10;
  FUN_0086e2d0(param_1 + 0x1b8,plVar9);
  uVar11 = *(undefined8 *)(param_1 + 0x90);
  uStack_128 = *(undefined8 *)(param_1 + 0xa8);
  lVar17 = *plVar9;
  local_100 = local_100 & 0xffffffffffffff00;
  local_f0 = 0;
  uStack_138 = (undefined4)*(undefined8 *)(param_1 + 0x98);
  uStack_134 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x98) >> 0x20);
  local_140 = (undefined4)uVar11;
  uStack_13c = (undefined4)((ulong)uVar11 >> 0x20);
  uStack_130 = (undefined4)*(undefined8 *)(param_1 + 0xa0);
  uStack_12c = (undefined4)((ulong)*(undefined8 *)(param_1 + 0xa0) >> 0x20);
  if (*(int *)(param_1 + 0x90) == 0x134) {
    FUN_00858f2c(param_1);
    uStack_f8 = CONCAT44(uStack_130,uStack_134);
    local_100 = CONCAT44(uStack_138,uStack_13c);
    local_f0 = 1;
  }
  else {
    FUN_0086e3b4(param_1,0x134,"if statement");
  }
  lVar15 = *(long *)(param_1 + 0x1b8);
  lVar3 = *(long *)(param_1 + 0x1c0);
  uVar11 = FUN_00859498(param_1);
  lVar13 = *(long *)(param_1 + 0x1b8);
  lVar14 = *(long *)(param_1 + 0x1c0);
  uVar20 = (ulong)(lVar3 - lVar15) >> 3 & 0xffffffff;
  uVar18 = lVar14 - lVar13 >> 3;
  if (uVar20 < uVar18) {
    do {
      lVar14 = uVar18 * 8;
      uVar18 = uVar18 - 1;
      uVar16 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + lVar14 + -8) + 0x18);
      puVar10 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
      *puVar10 = uVar16;
    } while (uVar20 < uVar18);
    lVar13 = *(long *)(param_1 + 0x1b8);
    lVar14 = *(long *)(param_1 + 0x1c0);
    uVar18 = lVar14 - lVar13 >> 3;
  }
  if (uVar20 < uVar18 || uVar20 - uVar18 == 0) {
    if (uVar20 < uVar18) {
      lVar14 = lVar13 + uVar20 * 8;
      *(long *)(param_1 + 0x1c0) = lVar14;
    }
  }
  else {
    FUN_00870174(param_1 + 0x1b8,uVar20 - uVar18);
    lVar13 = *(long *)(param_1 + 0x1b8);
    lVar14 = *(long *)(param_1 + 0x1c0);
  }
  uVar20 = (ulong)(lVar2 - lVar1) >> 3 & 0xffffffff;
  uVar18 = lVar14 - lVar13 >> 3;
  if (uVar20 < uVar18) {
    do {
      uVar19 = uVar18 - 1;
      uVar16 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + uVar18 * 8 + -8) + 0x18);
      puVar10 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
      *puVar10 = uVar16;
      uVar18 = uVar19;
    } while (uVar20 < uVar19);
    lVar13 = *(long *)(param_1 + 0x1b8);
    uVar18 = *(long *)(param_1 + 0x1c0) - lVar13 >> 3;
  }
  if (uVar20 < uVar18 || uVar20 - uVar18 == 0) {
    if (uVar20 < uVar18) {
      *(ulong *)(param_1 + 0x1c0) = lVar13 + uVar20 * 8;
    }
  }
  else {
    FUN_00870174(param_1 + 0x1b8,uVar20 - uVar18);
  }
  local_114[0] = 0;
  local_104 = 0;
  uVar16 = FUN_00860b6c(param_1,param_2,&local_140,uVar11,auStack_150,local_114);
  local_160 = *param_2;
  uStack_158 = local_148;
  uVar12 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x98);
  FUN_0084f924(uVar12,&local_160,uVar8,uVar11,uVar16,&local_100,local_114,lVar17,bVar6,&local_90,
               &local_e0);
  if (*(char *)(param_1 + 0x68) == '\x01') {
    uVar8 = uStack_a0;
    if (local_a8 == 0) {
      uVar8 = 0xffffffffffffffff;
    }
    uVar11 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0xc);
    FUN_00851f8c(uVar11,uVar8);
    local_160 = uVar12;
    puVar10 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_160);
    *puVar10 = uVar11;
  }
  if (*(long *)(lVar5 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar12;
}

