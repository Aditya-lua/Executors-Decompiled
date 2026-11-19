/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086dc74
 */

undefined8 FUN_0086dc74(long param_1,undefined8 *param_2)

{
  uint uVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  long lVar6;
  bool bVar7;
  bool bVar8;
  int iVar9;
  undefined8 uVar10;
  long *plVar11;
  undefined8 *puVar12;
  undefined8 uVar13;
  long lVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  ulong uVar17;
  long lVar18;
  long lVar19;
  ulong uVar20;
  long lVar21;
  undefined8 uVar22;
  ulong uVar23;
  undefined8 local_f0;
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
                 "Expected \'=\' after variable name in \'if local\', got \',\'; only a single binding is allowed"
                );
    iVar9 = *(int *)(param_1 + 0x90);
  }
  local_e0 = local_e0 & 0xffffffffffffff00;
  local_d0 = 0;
  if (iVar9 == 0x3d) {
    FUN_00858f2c(param_1);
    uStack_d8 = *(undefined8 *)(param_1 + 0xb8);
    local_e0 = *(ulong *)(param_1 + 0xb0);
    local_d0 = 1;
  }
  else {
    FUN_0086e3b4(param_1,0x3d,"if local declaration");
  }
  uVar10 = FUN_0086060c(param_1,0);
  iVar9 = *(int *)(param_1 + 0x90);
  if (iVar9 == 0x134) {
    FUN_00858f2c(param_1);
    uVar16 = *(undefined8 *)(param_1 + 0xb0);
  }
  else {
    FUN_0086e3b4(param_1,0x134,"if then else expression");
    uVar16 = 0xffffffffffffffff;
  }
  lVar14 = *(long *)(param_1 + 0x1b8);
  lVar2 = *(long *)(param_1 + 0x1c0);
  plVar11 = (long *)FUN_0086e18c(param_1 + 0x180,&local_c0);
  lVar18 = *(long *)(param_1 + 0x158);
  lVar21 = *(long *)(param_1 + 0x160);
  puVar12 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x40);
  lVar19 = *plVar11;
  uVar5 = *(uint *)(lVar21 + -4);
  *puVar12 = local_c0;
  puVar12[3] = lVar19;
  puVar12[4] = (lVar21 - lVar18 >> 3) + -1;
  puVar12[5] = (ulong)uVar5;
  *(undefined1 *)(puVar12 + 6) = local_98;
  puVar12[2] = uStack_b0;
  puVar12[1] = local_b8;
  *(undefined1 *)((long)puVar12 + 0x31) = 0;
  puVar12[7] = local_a8;
  *plVar11 = (long)puVar12;
  FUN_0086e2d0(param_1 + 0x1b8,plVar11);
  lVar21 = *plVar11;
  uVar13 = FUN_0086060c(param_1,0);
  lVar18 = *(long *)(param_1 + 0x1b8);
  uVar20 = (ulong)(lVar2 - lVar14) >> 3 & 0xffffffff;
  uVar17 = *(long *)(param_1 + 0x1c0) - lVar18 >> 3;
  if (uVar20 < uVar17) {
    do {
      uVar23 = uVar17 - 1;
      uVar22 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + uVar17 * 8 + -8) + 0x18);
      puVar12 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
      *puVar12 = uVar22;
      uVar17 = uVar23;
    } while (uVar20 < uVar23);
    lVar18 = *(long *)(param_1 + 0x1b8);
    uVar17 = *(long *)(param_1 + 0x1c0) - lVar18 >> 3;
  }
  if (uVar20 < uVar17 || uVar20 - uVar17 == 0) {
    if (uVar20 < uVar17) {
      *(ulong *)(param_1 + 0x1c0) = lVar18 + uVar20 * 8;
    }
  }
  else {
    FUN_00870174(param_1 + 0x1b8,uVar20 - uVar17);
  }
  uVar5 = DAT_00d1eba0;
  iVar3 = *(int *)(param_1 + 0x90);
  uVar22 = *(undefined8 *)(param_1 + 0x94);
  if (iVar3 == 0x127) {
    iVar4 = *(int *)(param_1 + 0x124);
    uVar1 = iVar4 + 1;
    *(uint *)(param_1 + 0x124) = uVar1;
    if (uVar5 < uVar1) {
      if (*(long *)(lVar6 + 0x28) == local_70) {
        FUN_008578f8(param_1 + 0x94,
                     "Exceeded allowed recursion depth; simplify your %s to make the code compile",
                     "expression");
      }
      goto LAB_0086e03c;
    }
    lVar14 = FUN_0086d8c0(param_1);
    *(int *)(param_1 + 0x124) = iVar4;
    bVar8 = true;
  }
  else {
    bVar8 = iVar3 == 0x126;
    if (bVar8) {
      FUN_00858f2c(param_1);
    }
    else {
      FUN_0086e3b4(param_1,0x126,"if then else expression");
    }
    lVar14 = FUN_0086060c(param_1,0);
  }
  local_f0 = *param_2;
  uStack_e8 = *(undefined8 *)(lVar14 + 0x14);
  uVar15 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x80);
  FUN_0084f4b8(uVar15,&local_f0,uVar10,iVar9 == 0x134,uVar13,bVar8,lVar14,lVar21,bVar7,&local_90,
               &local_e0);
  if (*(char *)(param_1 + 0x68) == '\x01') {
    uVar10 = uStack_a0;
    if (local_a8 == 0) {
      uVar10 = 0xffffffffffffffff;
    }
    uVar13 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
    FUN_00851e98(uVar13,uVar16,uVar22,iVar3 == 0x127,uVar10);
    local_f0 = uVar15;
    puVar12 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_f0);
    *puVar12 = uVar13;
  }
  if (*(long *)(lVar6 + 0x28) == local_70) {
    return uVar15;
  }
LAB_0086e03c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

