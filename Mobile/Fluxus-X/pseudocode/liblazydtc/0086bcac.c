/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086bcac
 */

/* WARNING: Removing unreachable block (ram,0x0086c13c) */
/* WARNING: Removing unreachable block (ram,0x0086c174) */

long * FUN_0086bcac(long param_1,long param_2,uint param_3)

{
  int iVar1;
  long lVar2;
  undefined8 *puVar3;
  ulong uVar4;
  long lVar5;
  long *plVar6;
  undefined8 *puVar7;
  long **pplVar8;
  ulong uVar9;
  long lVar10;
  long lVar11;
  undefined8 *puVar12;
  ulong uVar13;
  undefined8 uVar14;
  long lVar15;
  undefined8 uVar16;
  ulong uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 local_e8;
  undefined8 uStack_e0;
  undefined8 local_d8;
  undefined8 uStack_d0;
  long local_c8;
  ulong uStack_c0;
  long *local_b8;
  undefined8 uStack_b0;
  long *local_a8;
  long lStack_a0;
  ulong local_98;
  long *local_90;
  long lStack_88;
  ulong local_80;
  undefined4 local_74;
  undefined8 local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  iVar1 = *(int *)(param_1 + 0x90);
  if (iVar1 - 0x116U < 2) {
    lStack_88 = *(long *)(param_1 + 0x9c);
    local_90 = *(long **)(param_1 + 0x94);
    lVar5 = FUN_0086d048(param_1);
    uVar18 = *(undefined8 *)(param_1 + 0xe8);
    local_a8 = *(long **)(param_2 + 0xc);
    lStack_a0 = *(long *)(lVar5 + 0x14);
    local_b8 = (long *)FUN_0084e938(uVar18,8);
    *local_b8 = lVar5;
    uStack_b0 = 1;
    local_c8 = 0;
    uStack_c0 = 0;
    plVar6 = (long *)FUN_0084e938(uVar18,0x60);
    FUN_0084edd0(plVar6,&local_a8,param_2,&local_b8,param_3 & 1,0,&local_c8,&local_90);
    if (*(char *)(param_1 + 0x68) == '\x01') {
      uVar18 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x30);
      FUN_00851df0(uVar18,0xffffffffffffffff,0xffffffffffffffff,0,0);
      pplVar8 = &local_a8;
      local_a8 = plVar6;
LAB_0086be80:
      puVar7 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,pplVar8);
      *puVar7 = uVar18;
    }
  }
  else if (iVar1 == 0x7b) {
    lVar15 = *(long *)(param_1 + 0x9c);
    lVar5 = FUN_0086d1b8(param_1);
    uVar18 = *(undefined8 *)(param_1 + 0xe8);
    local_90 = *(long **)(param_2 + 0xc);
    lStack_88 = *(long *)(lVar5 + 0x14);
    uVar17 = *(ulong *)(param_1 + 0xb8);
    local_a8 = (long *)FUN_0084e938(uVar18,8);
    *local_a8 = lVar5;
    lStack_a0 = 1;
    local_b8 = (long *)0x0;
    uStack_b0 = 0;
    local_c8 = lVar15;
    uStack_c0 = uVar17;
    plVar6 = (long *)FUN_0084e938(uVar18,0x60);
    FUN_0084edd0(plVar6,&local_90,param_2,&local_a8,param_3 & 1,1,&local_b8,&local_c8);
    if (*(char *)(param_1 + 0x68) == '\x01') {
      uVar18 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x30);
      FUN_00851df0(uVar18,0xffffffffffffffff,0xffffffffffffffff,0,0);
      pplVar8 = &local_90;
      local_90 = plVar6;
      goto LAB_0086be80;
    }
  }
  else {
    if (iVar1 != 0x28) {
      if (*(long *)(lVar2 + 0x28) == local_68) {
        plVar6 = (long *)FUN_0086db28(param_1,param_2,param_3 & 1);
        return plVar6;
      }
      goto LAB_0086c2c4;
    }
    uVar18 = *(undefined8 *)(param_1 + 0x9c);
    if (*(int *)(param_2 + 0x14) == *(int *)(param_1 + 0x94)) {
      local_74 = 0x28;
    }
    else {
      FUN_0086bc9c(param_1);
      local_74 = *(undefined4 *)(param_1 + 0x90);
    }
    uVar14 = *(undefined8 *)(param_1 + 0x94);
    local_70 = uVar14;
    FUN_00858f2c(param_1);
    local_90 = (long *)(param_1 + 0x2a0);
    lStack_88 = *(long *)(param_1 + 0x2a8) - *(long *)(param_1 + 0x2a0) >> 3;
    local_98 = 0;
    lStack_a0 = *(long *)(param_1 + 0x458) - *(long *)(param_1 + 0x450) >> 3;
    local_a8 = (long *)(param_1 + 0x450);
    local_80 = 0;
    if (*(int *)(param_1 + 0x90) == 0x29) {
      uVar19 = *(undefined8 *)(param_1 + 0x9c);
LAB_0086bf60:
                    /* try { // try from 0086bf60 to 0086bf93 has its CatchHandler @ 0086c230 */
      FUN_00858f2c(param_1);
      uVar17 = 1;
    }
    else {
      pplVar8 = &local_a8;
      if (*(char *)(param_1 + 0x68) == '\0') {
        pplVar8 = (long **)0x0;
      }
                    /* try { // try from 0086bf44 to 0086bf4f has its CatchHandler @ 0086c228 */
      FUN_00861848(param_1,&local_90,pplVar8);
      uVar19 = *(undefined8 *)(param_1 + 0x9c);
      if (*(int *)(param_1 + 0x90) == 0x29) goto LAB_0086bf60;
      FUN_0086b5f8(param_1,0x29,&local_74,0);
      uVar17 = FUN_0086e434(param_1,0x29);
      uVar17 = uVar17 & 0xffffffff;
    }
    uVar4 = local_80;
    lVar5 = lStack_88;
    local_b8 = *(long **)(param_2 + 0xc);
    uVar16 = *(undefined8 *)(param_1 + 0xe8);
    uStack_b0 = uVar19;
    if (local_80 == 0) {
      local_c8 = 0;
    }
    else {
      lVar15 = *local_90;
                    /* try { // try from 0086bfc0 to 0086bfc7 has its CatchHandler @ 0086c22c */
      local_c8 = FUN_0084e938(uVar16,local_80 << 3);
      if ((uVar4 < 8) || (lVar10 = lVar5 * 8 + lVar15, (ulong)(local_c8 - lVar10) < 0x20)) {
        uVar9 = 0;
      }
      else {
        uVar9 = uVar4 & 0xfffffffffffffffc;
        puVar7 = (undefined8 *)(local_c8 + 0x10);
        puVar12 = (undefined8 *)(lVar10 + 0x10);
        uVar13 = uVar9;
        do {
          puVar3 = puVar12 + -1;
          uVar20 = puVar12[-2];
          uVar22 = puVar12[1];
          uVar21 = *puVar12;
          uVar13 = uVar13 - 4;
          puVar12 = puVar12 + 4;
          puVar7[-1] = *puVar3;
          puVar7[-2] = uVar20;
          puVar7[1] = uVar22;
          *puVar7 = uVar21;
          puVar7 = puVar7 + 4;
        } while (uVar13 != 0);
        if (uVar4 == uVar9) goto LAB_0086c01c;
      }
      lVar10 = uVar4 - uVar9;
      puVar7 = (undefined8 *)(lVar15 + uVar9 * 8 + lVar5 * 8);
      puVar12 = (undefined8 *)(local_c8 + uVar9 * 8);
      do {
        lVar10 = lVar10 + -1;
        *puVar12 = *puVar7;
        puVar7 = puVar7 + 1;
        puVar12 = puVar12 + 1;
      } while (lVar10 != 0);
    }
LAB_0086c01c:
    uStack_c0 = uVar4;
    local_d8 = 0;
    uStack_d0 = 0;
    local_e8 = uVar18;
    uStack_e0 = uVar19;
                    /* try { // try from 0086c028 to 0086c057 has its CatchHandler @ 0086c238 */
    plVar6 = (long *)FUN_0084e938(uVar16,0x60);
    FUN_0084edd0(plVar6,&local_b8,param_2,&local_c8,param_3 & 1,0,&local_d8,&local_e8);
    uVar4 = local_98;
    lVar5 = lStack_a0;
    if (*(char *)(param_1 + 0x68) == '\x01') {
      uVar18 = *(undefined8 *)(param_1 + 0xb0);
      uVar19 = *(undefined8 *)(param_1 + 0xe8);
      if ((uVar17 & 1) == 0) {
        uVar18 = 0xffffffffffffffff;
      }
      if (local_98 == 0) {
        lVar15 = 0;
      }
      else {
        lVar10 = *local_a8;
                    /* try { // try from 0086c088 to 0086c103 has its CatchHandler @ 0086c234 */
        lVar15 = FUN_0084e938(uVar19,local_98 << 3);
        if ((uVar4 < 8) || (lVar11 = lVar5 * 8 + lVar10, (ulong)(lVar15 - lVar11) < 0x20)) {
          uVar17 = 0;
        }
        else {
          uVar17 = uVar4 & 0xfffffffffffffffc;
          puVar7 = (undefined8 *)(lVar15 + 0x10);
          puVar12 = (undefined8 *)(lVar11 + 0x10);
          uVar9 = uVar17;
          do {
            puVar3 = puVar12 + -1;
            uVar16 = puVar12[-2];
            uVar21 = puVar12[1];
            uVar20 = *puVar12;
            uVar9 = uVar9 - 4;
            puVar12 = puVar12 + 4;
            puVar7[-1] = *puVar3;
            puVar7[-2] = uVar16;
            puVar7[1] = uVar21;
            *puVar7 = uVar20;
            puVar7 = puVar7 + 4;
          } while (uVar9 != 0);
          if (uVar4 == uVar17) goto LAB_0086c0e0;
        }
        lVar11 = uVar4 - uVar17;
        puVar7 = (undefined8 *)(lVar10 + uVar17 * 8 + lVar5 * 8);
        puVar12 = (undefined8 *)(lVar15 + uVar17 * 8);
        do {
          lVar11 = lVar11 + -1;
          *puVar12 = *puVar7;
          puVar7 = puVar7 + 1;
          puVar12 = puVar12 + 1;
        } while (lVar11 != 0);
      }
LAB_0086c0e0:
      uVar19 = FUN_0084e938(uVar19,0x30);
      FUN_00851df0(uVar19,uVar14,uVar18,lVar15,uVar4);
                    /* try { // try from 0086c108 to 0086c113 has its CatchHandler @ 0086c224 */
      local_b8 = plVar6;
      puVar7 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_b8);
      *puVar7 = uVar19;
    }
    lVar5 = *local_a8 + lStack_a0 * 8;
    if (lVar5 != local_a8[1]) {
      local_a8[1] = lVar5;
    }
    lVar5 = *local_90 + lStack_88 * 8;
    if (lVar5 != local_90[1]) {
      local_90[1] = lVar5;
    }
  }
  if (*(long *)(lVar2 + 0x28) == local_68) {
    return plVar6;
  }
LAB_0086c2c4:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

