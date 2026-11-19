/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085c3e4
 */

/* WARNING: Removing unreachable block (ram,0x0085ca40) */

long * FUN_0085c3e4(char *param_1)

{
  uint uVar1;
  void *pvVar2;
  uint uVar3;
  uint uVar4;
  long lVar5;
  undefined8 *puVar6;
  bool bVar7;
  int iVar8;
  long *plVar9;
  long lVar10;
  undefined8 *puVar11;
  ulong uVar12;
  long lVar13;
  long lVar14;
  uint *puVar15;
  undefined8 *puVar16;
  uint uVar17;
  ulong uVar18;
  ulong *puVar19;
  char *__s1;
  undefined8 uVar20;
  ulong uVar21;
  long lVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 local_d0;
  undefined8 uStack_c8;
  long *local_c0;
  long lStack_b8;
  ulong local_b0;
  undefined1 local_a8 [16];
  long *local_98;
  undefined8 uStack_90;
  undefined1 local_84 [4];
  undefined4 local_80;
  uint uStack_7c;
  undefined4 uStack_78;
  undefined4 uStack_74;
  void *local_70;
  undefined8 uStack_68;
  long local_58;
  
  lVar5 = tpidr_el0;
  local_58 = *(long *)(lVar5 + 0x28);
  uVar18 = *(ulong *)(param_1 + 0x9c);
  puVar19 = (ulong *)(param_1 + 0x94);
  uVar21 = *puVar19;
  local_a8._0_8_ = 0;
  local_a8._8_8_ = 0;
  local_c0 = (long *)(param_1 + 0x480);
  local_b0 = 0;
  lStack_b8 = *(long *)(param_1 + 0x488) - *(long *)(param_1 + 0x480) >> 3;
                    /* try { // try from 0085c43c to 0085c443 has its CatchHandler @ 0085cab8 */
  local_a8 = FUN_00862f80(param_1,&local_c0);
  iVar8 = *(int *)(param_1 + 0x90);
  if (iVar8 == 0x119) {
    __s1 = *(char **)(param_1 + 0xa8);
    if (DAT_00d1ec40 == '\x01') {
      iVar8 = strcmp(__s1,"export");
      if (iVar8 == 0) {
        uVar20 = *(undefined8 *)(param_1 + 0x94);
                    /* try { // try from 0085c678 to 0085c67f has its CatchHandler @ 0085ca88 */
        FUN_00858f2c(param_1);
        if (local_a8._8_8_ == 0) {
          if (local_b0 == 0) {
            uStack_7c = (uint)(uVar21 >> 0x20);
          }
          else {
            uVar18 = **(ulong **)(*local_c0 + lStack_b8 * 8);
            uStack_7c = (uint)(uVar18 >> 0x20);
            uVar21 = uVar18 & 0xffffffff;
          }
        }
        else {
          lVar14 = *(long *)local_a8._0_8_;
          if (local_b0 == 0) {
            uVar21 = (ulong)*(uint *)(lVar14 + 0xc);
            uStack_7c = *(uint *)(lVar14 + 0x10);
            uVar18 = *(ulong *)(lVar14 + 0x14);
          }
          else {
            uVar17 = *(uint *)(lVar14 + 0xc);
            uVar18 = **(ulong **)(*local_c0 + lStack_b8 * 8);
            uStack_7c = (uint)(uVar18 >> 0x20);
            bVar7 = *(uint *)(lVar14 + 0x10) < uStack_7c;
            if (uVar17 != (uint)uVar18) {
              bVar7 = uVar17 < (uint)uVar18;
            }
            if (bVar7) {
              uVar18 = *(ulong *)(lVar14 + 0x14);
              uVar21 = (ulong)uVar17;
              uStack_7c = *(uint *)(lVar14 + 0x10);
            }
            else {
              uVar21 = uVar18;
            }
          }
        }
        local_80 = (uint)uVar21;
        uStack_78 = (undefined4)uVar18;
        uStack_74 = (undefined4)(uVar18 >> 0x20);
                    /* try { // try from 0085ca00 to 0085ca17 has its CatchHandler @ 0085ca84 */
        plVar9 = (long *)FUN_0085eb28(param_1,&local_80,uVar20,local_a8,&local_c0);
        goto LAB_0085ca1c;
      }
    }
    iVar8 = strcmp("const",__s1);
    if (iVar8 == 0) {
      uVar20 = *(undefined8 *)(param_1 + 0x94);
                    /* try { // try from 0085c5f8 to 0085c5ff has its CatchHandler @ 0085ca90 */
      FUN_00858f2c(param_1);
      if (local_a8._8_8_ == 0) {
        if (local_b0 == 0) {
          uVar12 = uVar21 >> 0x20;
        }
        else {
          uVar18 = **(ulong **)(*local_c0 + lStack_b8 * 8);
          uVar12 = uVar18 >> 0x20;
          uVar21 = uVar18 & 0xffffffff;
        }
      }
      else {
        lVar14 = *(long *)local_a8._0_8_;
        if (local_b0 == 0) {
          uVar21 = (ulong)*(uint *)(lVar14 + 0xc);
          uVar12 = (ulong)*(uint *)(lVar14 + 0x10);
          uVar18 = *(ulong *)(lVar14 + 0x14);
        }
        else {
          uVar17 = *(uint *)(lVar14 + 0xc);
          uVar18 = **(ulong **)(*local_c0 + lStack_b8 * 8);
          uVar12 = uVar18 >> 0x20;
          bVar7 = *(uint *)(lVar14 + 0x10) < (uint)(uVar18 >> 0x20);
          if (uVar17 != (uint)uVar18) {
            bVar7 = uVar17 < (uint)uVar18;
          }
          if (bVar7) {
            uVar18 = *(ulong *)(lVar14 + 0x14);
            uVar12 = (ulong)*(uint *)(lVar14 + 0x10);
            uVar21 = (ulong)uVar17;
          }
          else {
            uVar21 = uVar18;
          }
        }
      }
                    /* try { // try from 0085c9c8 to 0085c9e3 has its CatchHandler @ 0085ca90 */
      plVar9 = (long *)FUN_0085b410(param_1,uVar21 & 0xffffffff | uVar12 << 0x20,uVar18,uVar20,
                                    local_a8,1,&local_c0);
      goto LAB_0085ca1c;
    }
    if (*param_1 == '\x01') {
      iVar8 = strcmp("declare",__s1);
      if (iVar8 == 0) {
                    /* try { // try from 0085c928 to 0085c943 has its CatchHandler @ 0085ca8c */
        lVar14 = FUN_0085cb14(param_1,1);
        plVar9 = (long *)FUN_0085f204(param_1,lVar14 + 0xc,local_a8);
        goto LAB_0085ca1c;
      }
    }
  }
  else {
    if (iVar8 == 299) {
      if (local_a8._8_8_ == 0) {
        if (local_b0 == 0) {
          uVar17 = (uint)*puVar19;
          uVar21 = (ulong)*(uint *)(param_1 + 0x98);
        }
        else {
          puVar15 = *(uint **)(*local_c0 + lStack_b8 * 8);
          uVar17 = *puVar15;
          uVar21 = (ulong)puVar15[1];
        }
      }
      else {
        lVar14 = *local_a8._0_8_;
        if (local_b0 == 0) {
          uVar17 = *(uint *)(lVar14 + 0xc);
          uVar21 = (ulong)*(uint *)(lVar14 + 0x10);
        }
        else {
          puVar15 = *(uint **)(*local_c0 + lStack_b8 * 8);
          uVar17 = *(uint *)(lVar14 + 0xc);
          uVar3 = *puVar15;
          uVar4 = puVar15[1];
          bVar7 = *(uint *)(lVar14 + 0x10) < uVar4;
          if (uVar17 != uVar3) {
            bVar7 = uVar17 < uVar3;
          }
          uVar1 = *(uint *)(lVar14 + 0x10);
          if (!bVar7) {
            uVar1 = uVar4;
            uVar17 = uVar3;
          }
          uVar21 = (ulong)uVar1;
        }
      }
      uStack_68 = *(undefined8 *)(param_1 + 0xa8);
      local_70 = *(void **)(param_1 + 0xa0);
      uStack_78 = (undefined4)*(undefined8 *)(param_1 + 0x98);
      uStack_74 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x98) >> 0x20);
      local_80 = (uint)*(undefined8 *)(param_1 + 0x90);
      uStack_7c = (uint)((ulong)*(undefined8 *)(param_1 + 0x90) >> 0x20);
                    /* try { // try from 0085c6e4 to 0085c8ff has its CatchHandler @ 0085cabc */
      FUN_00858f2c(param_1);
      local_84[0] = 0;
      local_d0 = 0;
      lVar14 = FUN_00861b90(param_1,local_84,&local_d0);
      iVar8 = *(int *)(lVar14 + 8);
      if ((((iVar8 != DAT_00d1b010) || (*(char *)(*(long *)(lVar14 + 0x20) + 0x30) == '\x01')) &&
          (iVar8 != DAT_00d1b020)) && ((iVar8 != DAT_00d1b060 && (iVar8 != DAT_00d1b050)))) {
        if (DAT_00d1ec40 == '\x01') {
          lVar14 = FUN_00864840(param_1,lVar14);
        }
        else {
          local_98 = (long *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),8);
          *local_98 = lVar14;
          uStack_90 = 1;
          lVar14 = FUN_008659e8(param_1,lVar14 + 0xc,&local_98,
                                "Assigned expression must be a variable or a field");
        }
      }
      *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) =
           *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) + 1;
      lVar10 = FUN_00863248(param_1,local_84[0],&local_80,&local_d0,0,local_a8,0,0);
      local_98 = (long *)((ulong)uVar17 | uVar21 << 0x20);
      *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) =
           *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) + -1;
      uStack_90 = *(undefined8 *)(lVar10 + 0x14);
      plVar9 = (long *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x30);
      FUN_00850304(plVar9,&local_98,lVar14,lVar10);
      uVar21 = local_b0;
      lVar14 = lStack_b8;
      if (param_1[0x68] != '\x01') goto LAB_0085ca1c;
      uVar20 = *(undefined8 *)(param_1 + 0xe8);
      if (local_b0 == 0) {
        lVar10 = 0;
      }
      else {
        lVar22 = *local_c0;
        lVar10 = FUN_0084e938(uVar20,local_b0 << 3);
        if ((uVar21 < 8) || (lVar13 = lVar14 * 8 + lVar22, (ulong)(lVar10 - lVar13) < 0x20)) {
          uVar18 = 0;
        }
        else {
          uVar18 = uVar21 & 0xfffffffffffffffc;
          puVar11 = (undefined8 *)(lVar10 + 0x10);
          puVar16 = (undefined8 *)(lVar13 + 0x10);
          uVar12 = uVar18;
          do {
            puVar6 = puVar16 + -1;
            uVar23 = puVar16[-2];
            uVar25 = puVar16[1];
            uVar24 = *puVar16;
            uVar12 = uVar12 - 4;
            puVar16 = puVar16 + 4;
            puVar11[-1] = *puVar6;
            puVar11[-2] = uVar23;
            puVar11[1] = uVar25;
            *puVar11 = uVar24;
            puVar11 = puVar11 + 4;
          } while (uVar12 != 0);
          if (uVar21 == uVar18) goto LAB_0085c8d0;
        }
        lVar13 = uVar21 - uVar18;
        puVar11 = (undefined8 *)(lVar22 + uVar18 * 8 + lVar14 * 8);
        puVar16 = (undefined8 *)(lVar10 + uVar18 * 8);
        do {
          lVar13 = lVar13 + -1;
          *puVar16 = *puVar11;
          puVar11 = puVar11 + 1;
          puVar16 = puVar16 + 1;
        } while (lVar13 != 0);
      }
LAB_0085c8d0:
      uVar20 = FUN_0084e938(uVar20,0x20);
      FUN_00851ffc(uVar20,lVar10,uVar21,CONCAT44(uStack_78,uStack_7c));
      local_98 = plVar9;
      puVar11 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_98);
      *puVar11 = uVar20;
      goto LAB_0085ca1c;
    }
    if (iVar8 == 0x12e) {
      if (local_a8._8_8_ == 0) {
        if (local_b0 == 0) {
          uVar12 = uVar21 >> 0x20;
        }
        else {
          uVar18 = **(ulong **)(*local_c0 + lStack_b8 * 8);
          uVar12 = uVar18 >> 0x20;
          uVar21 = uVar18 & 0xffffffff;
        }
      }
      else {
        lVar14 = *local_a8._0_8_;
        if (local_b0 == 0) {
          uVar21 = (ulong)*(uint *)(lVar14 + 0xc);
          uVar12 = (ulong)*(uint *)(lVar14 + 0x10);
          uVar18 = *(ulong *)(lVar14 + 0x14);
        }
        else {
          uVar17 = *(uint *)(lVar14 + 0xc);
          uVar18 = **(ulong **)(*local_c0 + lStack_b8 * 8);
          uVar12 = uVar18 >> 0x20;
          bVar7 = *(uint *)(lVar14 + 0x10) < (uint)(uVar18 >> 0x20);
          if (uVar17 != (uint)uVar18) {
            bVar7 = uVar17 < (uint)uVar18;
          }
          if (bVar7) {
            uVar18 = *(ulong *)(lVar14 + 0x14);
            uVar12 = (ulong)*(uint *)(lVar14 + 0x10);
            uVar21 = (ulong)uVar17;
          }
          else {
            uVar21 = uVar18;
          }
        }
      }
      plVar9 = (long *)FUN_0085b410(param_1,uVar21 & 0xffffffff | uVar12 << 0x20,uVar18,
                                    *(undefined8 *)(param_1 + 0x94),local_a8,0,&local_c0);
      goto LAB_0085ca1c;
    }
  }
  local_98 = (long *)0x0;
  uStack_90 = 0;
  local_d0 = 0;
  uStack_c8 = 0;
                    /* try { // try from 0085c560 to 0085c56f has its CatchHandler @ 0085cab4 */
  FUN_008521fc(&local_80,param_1 + 0x90);
  pvVar2 = local_70;
  if ((local_80 & 1) == 0) {
    pvVar2 = (void *)((long)&local_80 + 1);
  }
                    /* try { // try from 0085c580 to 0085c59b has its CatchHandler @ 0085ca94 */
  plVar9 = (long *)FUN_0085e984(param_1,puVar19,&local_98,&local_d0,
                                "Expected \'function\', \'local function\', \'const function\', \'declare function\' or a function type declaration after attribute, but got %s instead"
                                ,pvVar2);
  if ((local_80 & 1) != 0) {
    operator_delete(local_70,CONCAT44(uStack_7c,local_80) & 0xfffffffffffffffe);
  }
LAB_0085ca1c:
  lVar14 = *local_c0 + lStack_b8 * 8;
  if (lVar14 != local_c0[1]) {
    local_c0[1] = lVar14;
  }
  if (*(long *)(lVar5 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return plVar9;
}

