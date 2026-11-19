/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008610f8
 */

undefined8 FUN_008610f8(long param_1,undefined8 *param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  uint uVar5;
  long lVar6;
  bool bVar7;
  byte bVar8;
  int iVar9;
  undefined8 uVar10;
  long *plVar11;
  undefined8 *puVar12;
  long lVar13;
  undefined8 uVar14;
  long lVar15;
  long lVar16;
  ulong uVar17;
  undefined8 uVar18;
  long lVar19;
  ulong uVar20;
  ulong uVar21;
  undefined4 local_110;
  undefined4 uStack_10c;
  undefined4 uStack_108;
  undefined4 uStack_104;
  undefined4 local_100;
  undefined4 uStack_fc;
  undefined4 uStack_f8;
  undefined4 uStack_f4;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
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
  
  lVar6 = tpidr_el0;
  local_70 = *(long *)(lVar6 + 0x28);
  if ((*(int *)(param_1 + 0x90) == 0x119) && (*(char **)(param_1 + 0xa8) != (char *)0x0)) {
    iVar9 = strcmp(*(char **)(param_1 + 0xa8),"const");
    bVar7 = iVar9 == 0;
  }
  else {
    bVar7 = false;
  }
  uStack_88 = *(undefined8 *)(param_1 + 0x9c);
  local_90 = *(undefined8 *)(param_1 + 0x94);
  local_80 = 1;
  FUN_00858f2c(param_1);
  FUN_00860d94(&local_c0,param_1,bVar7);
  iVar9 = *(int *)(param_1 + 0x90);
  if (iVar9 == 0x2c) {
    FUN_00860ecc(param_1,param_1 + 0x94,
                 "Expected \'=\' after variable name in \'while local\', got \',\'; only a single binding is allowed"
                );
    iVar9 = *(int *)(param_1 + 0x90);
  }
  local_e0 = local_e0 & 0xffffffffffffff00;
  local_d0 = 0;
  if (iVar9 == 0x3d) {
    uStack_d8 = *(undefined8 *)(param_1 + 0x9c);
    local_e0 = *(ulong *)(param_1 + 0x94);
    local_d0 = 1;
    FUN_00858f2c(param_1);
  }
  else {
    FUN_0086e3b4(param_1,0x3d,"while local declaration");
  }
  uVar10 = FUN_0086060c(param_1,0);
  iVar9 = *(int *)(param_1 + 0x90);
  uVar18 = *(undefined8 *)(param_1 + 0x90);
  uStack_e8 = *(undefined8 *)(param_1 + 0xa8);
  uStack_f0 = *(undefined8 *)(param_1 + 0xa0);
  uStack_f8 = (undefined4)*(undefined8 *)(param_1 + 0x98);
  uStack_f4 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x98) >> 0x20);
  local_100 = (undefined4)uVar18;
  uStack_fc = (undefined4)((ulong)uVar18 >> 0x20);
  if (iVar9 == 0x125) {
    FUN_00858f2c(param_1);
  }
  else {
    FUN_0086e3b4(param_1,0x125,"while loop");
  }
  lVar1 = *(long *)(param_1 + 0x1b8);
  lVar2 = *(long *)(param_1 + 0x1c0);
  plVar11 = (long *)FUN_0086e18c(param_1 + 0x180,&local_c0);
  lVar15 = *(long *)(param_1 + 0x158);
  lVar3 = *(long *)(param_1 + 0x160);
  puVar12 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x40);
  lVar16 = *plVar11;
  uVar5 = *(uint *)(lVar3 + -4);
  *puVar12 = local_c0;
  puVar12[3] = lVar16;
  puVar12[4] = (lVar3 - lVar15 >> 3) + -1;
  puVar12[5] = (ulong)uVar5;
  *(undefined1 *)(puVar12 + 6) = local_98;
  puVar12[2] = uStack_b0;
  puVar12[1] = local_b8;
  *(undefined1 *)((long)puVar12 + 0x31) = 0;
  puVar12[7] = local_a8;
  *plVar11 = (long)puVar12;
  FUN_0086e2d0(param_1 + 0x1b8,plVar11);
  lVar19 = *plVar11;
  *(int *)(*(long *)(param_1 + 0x160) + -4) = *(int *)(*(long *)(param_1 + 0x160) + -4) + 1;
  lVar3 = *(long *)(param_1 + 0x1b8);
  lVar4 = *(long *)(param_1 + 0x1c0);
  lVar13 = FUN_00859498(param_1);
  lVar16 = *(long *)(param_1 + 0x1b8);
  lVar15 = *(long *)(param_1 + 0x1c0);
  uVar17 = (ulong)(lVar4 - lVar3) >> 3 & 0xffffffff;
  uVar20 = lVar15 - lVar16 >> 3;
  if (uVar17 < uVar20) {
    do {
      lVar15 = uVar20 * 8;
      uVar20 = uVar20 - 1;
      uVar18 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + lVar15 + -8) + 0x18);
      puVar12 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
      *puVar12 = uVar18;
    } while (uVar17 < uVar20);
    lVar16 = *(long *)(param_1 + 0x1b8);
    lVar15 = *(long *)(param_1 + 0x1c0);
    uVar20 = lVar15 - lVar16 >> 3;
  }
  if (uVar17 < uVar20 || uVar17 - uVar20 == 0) {
    if (uVar17 < uVar20) {
      lVar15 = lVar16 + uVar17 * 8;
      *(long *)(param_1 + 0x1c0) = lVar15;
    }
  }
  else {
    FUN_00870174(param_1 + 0x1b8,uVar17 - uVar20);
    lVar16 = *(long *)(param_1 + 0x1b8);
    lVar15 = *(long *)(param_1 + 0x1c0);
  }
  uVar20 = (ulong)(lVar2 - lVar1) >> 3 & 0xffffffff;
  uVar17 = lVar15 - lVar16 >> 3;
  *(int *)(*(long *)(param_1 + 0x160) + -4) = *(int *)(*(long *)(param_1 + 0x160) + -4) + -1;
  if (uVar20 < uVar17) {
    do {
      uVar21 = uVar17 - 1;
      uVar18 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + uVar17 * 8 + -8) + 0x18);
      puVar12 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
      *puVar12 = uVar18;
      uVar17 = uVar21;
    } while (uVar20 < uVar21);
    lVar16 = *(long *)(param_1 + 0x1b8);
    uVar17 = *(long *)(param_1 + 0x1c0) - lVar16 >> 3;
  }
  if (uVar20 < uVar17 || uVar20 - uVar17 == 0) {
    if (uVar20 < uVar17) {
      *(ulong *)(param_1 + 0x1c0) = lVar16 + uVar20 * 8;
    }
  }
  else {
    FUN_00870174(param_1 + 0x1b8,uVar20 - uVar17);
  }
  uVar18 = *(undefined8 *)(param_1 + 0x9c);
  local_110 = local_100;
  uStack_10c = uStack_fc;
  uStack_108 = uStack_f8;
  bVar8 = FUN_00861094(param_1,0x128,&local_110);
  *(byte *)(lVar13 + 0x30) = bVar8 & 1;
  local_110 = (undefined4)*param_2;
  uStack_10c = (undefined4)((ulong)*param_2 >> 0x20);
  uStack_108 = (undefined4)uVar18;
  uStack_104 = (undefined4)((ulong)uVar18 >> 0x20);
  uVar18 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x80);
  FUN_0084fac4(uVar18,&local_110,uVar10,lVar13,iVar9 == 0x125,(ulong)&local_100 | 4,lVar19,bVar7,
               &local_90,&local_e0);
  if (*(char *)(param_1 + 0x68) == '\x01') {
    uVar10 = uStack_a0;
    if (local_a8 == 0) {
      uVar10 = 0xffffffffffffffff;
    }
    uVar14 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0xc);
    FUN_00851fa0(uVar14,uVar10);
    local_110 = (undefined4)uVar18;
    uStack_10c = (undefined4)((ulong)uVar18 >> 0x20);
    puVar12 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_110);
    *puVar12 = uVar14;
  }
  if (*(long *)(lVar6 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar18;
}

