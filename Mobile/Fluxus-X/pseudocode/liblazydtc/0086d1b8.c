/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086d1b8
 */

/* WARNING: Removing unreachable block (ram,0x0086d740) */
/* WARNING: Removing unreachable block (ram,0x0086d77c) */

undefined8 FUN_0086d1b8(long param_1)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  int iVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  long *plVar10;
  undefined8 uVar11;
  long lVar12;
  undefined8 *puVar13;
  undefined8 uVar14;
  long lVar15;
  long lVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  char *local_c0;
  size_t local_b8;
  int local_b0;
  undefined4 uStack_ac;
  undefined4 local_a8;
  undefined4 uStack_a4;
  long lStack_a0;
  undefined8 *local_98;
  long local_90;
  long local_88;
  int local_80;
  undefined8 local_7c;
  int local_74;
  undefined8 *local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  plVar10 = (long *)(param_1 + 0x94);
  puVar9 = (undefined8 *)*plVar10;
  plVar1 = (long *)(param_1 + 0x3c0);
  plVar2 = (long *)(param_1 + 0x3d8);
  local_74 = *(int *)(param_1 + 0x90);
  lVar5 = *(long *)(param_1 + 0x3c8) - *plVar1;
  lVar6 = *(long *)(param_1 + 0x3e0) - *plVar2;
  local_70 = puVar9;
  if (local_74 == 0x7b) {
                    /* try { // try from 0086d238 to 0086d257 has its CatchHandler @ 0086d7c8 */
    FUN_00858f2c(param_1);
  }
  else {
    FUN_0086e3b4(param_1,0x7b,"table literal");
  }
  lVar16 = 0;
  lVar15 = 0;
  do {
    iVar7 = *(int *)(param_1 + 0x90);
    if (iVar7 == 0x5b) {
      puVar13 = *(undefined8 **)(param_1 + 0x94);
      uStack_ac = SUB84(puVar13,0);
      local_a8 = (undefined4)((ulong)puVar13 >> 0x20);
      local_b0 = iVar7;
                    /* try { // try from 0086d2f0 to 0086d2f7 has its CatchHandler @ 0086d808 */
      FUN_00858f2c(param_1);
                    /* try { // try from 0086d2f8 to 0086d303 has its CatchHandler @ 0086d80c */
      uVar14 = FUN_0086060c(param_1,0);
      if (*(int *)(param_1 + 0x90) == 0x5d) {
                    /* try { // try from 0086d314 to 0086d31b has its CatchHandler @ 0086d81c */
        FUN_00858f2c(param_1);
LAB_0086d3bc:
        uVar11 = *(undefined8 *)(param_1 + 0xb0);
      }
      else {
                    /* try { // try from 0086d394 to 0086d3b7 has its CatchHandler @ 0086d81c */
        FUN_0086b5f8(param_1,0x5d,&local_b0,0);
        uVar4 = FUN_0086e434(param_1,0x5d);
        if ((uVar4 & 1) != 0) goto LAB_0086d3bc;
        uVar11 = 0xffffffffffffffff;
      }
      if (*(int *)(param_1 + 0x90) == 0x3d) {
                    /* try { // try from 0086d3d4 to 0086d3f7 has its CatchHandler @ 0086d810 */
        FUN_00858f2c(param_1);
        lVar12 = *(long *)(param_1 + 0xb0);
      }
      else {
        FUN_0086e3b4(param_1,0x3d,"table field");
        lVar12 = -1;
      }
                    /* try { // try from 0086d3fc to 0086d407 has its CatchHandler @ 0086d814 */
      local_88 = FUN_0086060c(param_1,0);
      local_98 = (undefined8 *)CONCAT44(local_98._4_4_,2);
                    /* try { // try from 0086d414 to 0086d41f has its CatchHandler @ 0086d818 */
      local_90 = uVar14;
      FUN_008723f0(plVar1,&local_98);
      if (*(char *)(param_1 + 0x68) == '\x01') {
        iVar7 = 1;
        if (*(int *)(param_1 + 0x90) != 0x3b) {
          iVar7 = 2;
        }
        local_80 = 0;
        if (*(int *)(param_1 + 0x90) != 0x2c) {
          local_80 = iVar7;
        }
        local_7c = *(undefined8 *)(param_1 + 0x94);
        if (local_80 == 2) {
          local_7c = 0xffffffffffffffff;
        }
                    /* try { // try from 0086d460 to 0086d46b has its CatchHandler @ 0086d7f8 */
        local_98 = puVar13;
        local_90 = uVar11;
        local_88 = lVar12;
        FUN_0087251c(plVar2,&local_98);
LAB_0086d46c:
        lVar16 = lVar16 + 1;
      }
    }
    else {
      if (iVar7 == 0x7d) {
        lVar12 = *(long *)(param_1 + 0x9c);
                    /* try { // try from 0086d5d4 to 0086d5db has its CatchHandler @ 0086d7cc */
        FUN_00858f2c(param_1);
        goto LAB_0086d5dc;
      }
      if (iVar7 != 0x119) {
LAB_0086d320:
                    /* try { // try from 0086d320 to 0086d32b has its CatchHandler @ 0086d800 */
        local_88 = FUN_0086060c(param_1,0);
        local_98 = (undefined8 *)((ulong)local_98 & 0xffffffff00000000);
        local_90 = 0;
                    /* try { // try from 0086d334 to 0086d33f has its CatchHandler @ 0086d804 */
        FUN_008723f0(plVar1,&local_98);
        if (*(char *)(param_1 + 0x68) != '\x01') goto LAB_0086d470;
        local_90 = 0xffffffffffffffff;
        local_88 = -1;
        local_98 = (undefined8 *)0xffffffffffffffff;
        iVar7 = 1;
        if (*(int *)(param_1 + 0x90) != 0x3b) {
          iVar7 = 2;
        }
        local_80 = 0;
        if (*(int *)(param_1 + 0x90) != 0x2c) {
          local_80 = iVar7;
        }
        local_7c = *(undefined8 *)(param_1 + 0x94);
        if (local_80 == 2) {
          local_7c = 0xffffffffffffffff;
        }
                    /* try { // try from 0086d384 to 0086d38f has its CatchHandler @ 0086d7f0 */
        FUN_0087251c(plVar2,&local_98);
        goto LAB_0086d46c;
      }
                    /* try { // try from 0086d2a0 to 0086d2ab has its CatchHandler @ 0086d7fc */
      FUN_00853d20(&local_98,param_1 + 0x70);
      if ((int)local_98 != 0x3d) goto LAB_0086d320;
      if (*(int *)(param_1 + 0x90) == 0x119) {
        lStack_a0 = *(long *)(param_1 + 0x9c);
        uVar14 = *(undefined8 *)(param_1 + 0xa8);
        local_a8 = (undefined4)*plVar10;
        uStack_a4 = (undefined4)((ulong)*plVar10 >> 0x20);
                    /* try { // try from 0086d2d4 to 0086d2db has its CatchHandler @ 0086d7ec */
        FUN_00858f2c(param_1);
        lVar12 = *plVar10;
      }
      else {
                    /* try { // try from 0086d4b4 to 0086d4c3 has its CatchHandler @ 0086d7ec */
        FUN_0086e040(param_1,"table field");
        lVar12 = *(long *)(param_1 + 0x94);
        uVar14 = *(undefined8 *)(param_1 + 0x138);
        local_a8 = (undefined4)lVar12;
        uStack_a4 = (undefined4)((ulong)lVar12 >> 0x20);
        lStack_a0 = lVar12;
      }
      local_b0 = (int)uVar14;
      uStack_ac = (undefined4)((ulong)uVar14 >> 0x20);
      if (*(int *)(param_1 + 0x90) == 0x3d) {
                    /* try { // try from 0086d4e0 to 0086d4ff has its CatchHandler @ 0086d7e8 */
        FUN_00858f2c(param_1);
      }
      else {
        FUN_0086e3b4(param_1,0x3d,"table field");
      }
      local_c0 = (char *)CONCAT44(uStack_ac,local_b0);
      local_b8 = 0;
      local_b8 = strlen(local_c0);
                    /* try { // try from 0086d514 to 0086d537 has its CatchHandler @ 0086d7f4 */
      uVar14 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
      FUN_0084ec94(uVar14,&local_a8,&local_c0,3);
                    /* try { // try from 0086d538 to 0086d543 has its CatchHandler @ 0086d7e4 */
      local_88 = FUN_0086060c(param_1,0);
      if ((local_88 != 0) && (*(int *)(local_88 + 8) == DAT_00d1b070)) {
        *(ulong *)(local_88 + 0xa0) = CONCAT44(uStack_ac,local_b0);
      }
      local_98 = (undefined8 *)CONCAT44(local_98._4_4_,1);
                    /* try { // try from 0086d570 to 0086d57b has its CatchHandler @ 0086d7e0 */
      local_90 = uVar14;
      FUN_008723f0(plVar1,&local_98);
      if (*(char *)(param_1 + 0x68) == '\x01') {
        local_98 = (undefined8 *)0xffffffffffffffff;
        local_90 = 0xffffffffffffffff;
        iVar7 = 1;
        if (*(int *)(param_1 + 0x90) != 0x3b) {
          iVar7 = 2;
        }
        local_80 = 0;
        if (*(int *)(param_1 + 0x90) != 0x2c) {
          local_80 = iVar7;
        }
        local_7c = *(undefined8 *)(param_1 + 0x94);
        if (local_80 == 2) {
          local_7c = 0xffffffffffffffff;
        }
                    /* try { // try from 0086d5c0 to 0086d5cb has its CatchHandler @ 0086d7dc */
        local_88 = lVar12;
        FUN_0087251c(plVar2,&local_98);
        goto LAB_0086d46c;
      }
    }
LAB_0086d470:
    iVar7 = *(int *)(param_1 + 0x90);
    if (iVar7 < 0x5b) {
      if ((iVar7 != 0x2c) && (iVar7 != 0x3b)) {
LAB_0086d6ac:
        lVar12 = *(long *)(param_1 + 0x9c);
                    /* try { // try from 0086d6b0 to 0086d6d3 has its CatchHandler @ 0086d7cc */
        FUN_0086b5f8(param_1,0x7d,&local_74,0);
        uVar4 = FUN_0086e434(param_1,0x7d);
        lVar15 = lVar15 + 1;
        if ((uVar4 & 1) == 0) {
          lVar12 = *(long *)(param_1 + 0xb8);
        }
LAB_0086d5dc:
        uVar14 = *(undefined8 *)(param_1 + 0xe8);
        local_98 = puVar9;
        local_90 = lVar12;
        if (lVar15 == 0) {
          puVar9 = (undefined8 *)0x0;
        }
        else {
          lVar12 = *plVar1;
                    /* try { // try from 0086d5f8 to 0086d64f has its CatchHandler @ 0086d7d8 */
          puVar9 = (undefined8 *)FUN_0084e938(uVar14,lVar15 * 0x18);
          puVar13 = (undefined8 *)(lVar12 + lVar5);
          puVar8 = puVar9;
          lVar12 = lVar15;
          do {
            uVar17 = puVar13[1];
            uVar11 = *puVar13;
            lVar12 = lVar12 + -1;
            puVar8[2] = puVar13[2];
            puVar8[1] = uVar17;
            *puVar8 = uVar11;
            puVar13 = puVar13 + 3;
            puVar8 = puVar8 + 3;
          } while (lVar12 != 0);
        }
        local_b0 = (int)puVar9;
        uStack_ac = (undefined4)((ulong)puVar9 >> 0x20);
        local_a8 = (undefined4)lVar15;
        uStack_a4 = (undefined4)((ulong)lVar15 >> 0x20);
        uVar14 = FUN_0084e938(uVar14,0x30);
        FUN_0084f1cc(uVar14,&local_98,&local_b0);
        if (*(char *)(param_1 + 0x68) == '\x01') {
          uVar11 = *(undefined8 *)(param_1 + 0xe8);
          if (lVar16 == 0) {
            local_98 = (undefined8 *)0x0;
          }
          else {
            lVar15 = *plVar2;
                    /* try { // try from 0086d674 to 0086d67b has its CatchHandler @ 0086d7d0 */
            local_98 = (undefined8 *)FUN_0084e938(uVar11,lVar16 * 0x24);
            puVar9 = (undefined8 *)(lVar15 + lVar6);
            puVar13 = local_98;
            lVar15 = lVar16;
            do {
              uVar20 = puVar9[1];
              uVar19 = *puVar9;
              uVar18 = puVar9[3];
              uVar17 = puVar9[2];
              lVar15 = lVar15 + -1;
              puVar8 = puVar9 + 4;
              puVar9 = (undefined8 *)((long)puVar9 + 0x24);
              *(undefined4 *)(puVar13 + 4) = *(undefined4 *)puVar8;
              puVar13[1] = uVar20;
              *puVar13 = uVar19;
              puVar13[3] = uVar18;
              puVar13[2] = uVar17;
              puVar13 = (undefined8 *)((long)puVar13 + 0x24);
            } while (lVar15 != 0);
          }
          local_90 = lVar16;
                    /* try { // try from 0086d6ec to 0086d703 has its CatchHandler @ 0086d7d0 */
          uVar11 = FUN_0084e938(uVar11,0x18);
          FUN_00851e58(uVar11,&local_98);
          local_b0 = (int)uVar14;
          uStack_ac = (undefined4)((ulong)uVar14 >> 0x20);
                    /* try { // try from 0086d708 to 0086d713 has its CatchHandler @ 0086d7c4 */
          puVar9 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_b0);
          *puVar9 = uVar11;
        }
        lVar6 = lVar6 + *(long *)(param_1 + 0x3d8);
        if (lVar6 != *(long *)(param_1 + 0x3e0)) {
          *(long *)(param_1 + 0x3e0) = lVar6;
        }
        lVar5 = lVar5 + *(long *)(param_1 + 0x3c0);
        if (lVar5 != *(long *)(param_1 + 0x3c8)) {
          *(long *)(param_1 + 0x3c8) = lVar5;
        }
        if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
          __stack_chk_fail();
        }
        return uVar14;
      }
                    /* try { // try from 0086d4a8 to 0086d4af has its CatchHandler @ 0086d820 */
      FUN_00858f2c(param_1);
    }
    else if ((iVar7 == 0x5b) || (iVar7 == 0x119)) {
                    /* try { // try from 0086d26c to 0086d27f has its CatchHandler @ 0086d820 */
      FUN_00860ecc(param_1,plVar10,"Expected \',\' after table constructor element");
    }
    else if (iVar7 != 0x7d) goto LAB_0086d6ac;
    lVar15 = lVar15 + 1;
  } while( true );
}

