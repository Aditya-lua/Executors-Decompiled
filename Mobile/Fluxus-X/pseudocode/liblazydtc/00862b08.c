/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00862b08
 */

/* WARNING: Removing unreachable block (ram,0x00862d28) */

void FUN_00862b08(long *param_1,long param_2,undefined8 param_3,undefined8 *param_4)

{
  undefined8 *puVar1;
  long lVar2;
  ulong uVar3;
  long *plVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  undefined8 uVar14;
  long lVar15;
  long lVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  long *local_90;
  long local_88;
  ulong local_80;
  undefined4 local_74;
  long local_70;
  long local_68;
  
  lVar16 = tpidr_el0;
  local_68 = *(long *)(lVar16 + 0x28);
  if (*(int *)(param_2 + 0x90) == 0x7b) {
    lVar13 = *(long *)(param_2 + 0x9c);
    lVar12 = FUN_0086d1b8(param_2);
    lVar11 = *(long *)(param_2 + 0xb8);
    plVar4 = (long *)FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),8);
    *plVar4 = lVar12;
    *param_1 = (long)plVar4;
    param_1[1] = 1;
    param_1[2] = lVar13;
    param_1[3] = lVar11;
  }
  else {
    if (*(int *)(param_2 + 0x90) == 0x28) {
      lVar12 = *(long *)(param_2 + 0x94);
      lVar13 = *(long *)(param_2 + 0x9c);
      local_74 = 0x28;
      local_70 = lVar12;
      FUN_00858f2c(param_2);
      local_80 = 0;
      local_90 = (long *)(param_2 + 0x2a0);
      local_88 = *(long *)(param_2 + 0x2a8) - *(long *)(param_2 + 0x2a0) >> 3;
      if (*(int *)(param_2 + 0x90) == 0x29) {
        uVar14 = *(undefined8 *)(param_2 + 0x94);
        lVar11 = *(long *)(param_2 + 0x9c);
LAB_00862c50:
                    /* try { // try from 00862c50 to 00862c83 has its CatchHandler @ 00862da8 */
        FUN_00858f2c(param_2);
        uVar5 = 1;
      }
      else {
                    /* try { // try from 00862c2c to 00862c3b has its CatchHandler @ 00862da0 */
        FUN_00861848(param_2,&local_90,param_3);
        uVar14 = *(undefined8 *)(param_2 + 0x94);
        lVar11 = *(long *)(param_2 + 0x9c);
        if (*(int *)(param_2 + 0x90) == 0x29) goto LAB_00862c50;
        FUN_0086b5f8(param_2,0x29,&local_74,0);
        uVar5 = FUN_0086e434(param_2,0x29);
      }
      uVar3 = local_80;
      lVar2 = local_88;
      plVar4 = local_90;
      if ((param_4 != (undefined8 *)0x0) && ((uVar5 & 1) != 0)) {
        *param_4 = uVar14;
      }
      if (local_80 == 0) {
        lVar6 = 0;
      }
      else {
        lVar15 = *local_90;
                    /* try { // try from 00862ca8 to 00862cab has its CatchHandler @ 00862da4 */
        lVar6 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),local_80 << 3);
        if ((uVar3 < 8) || (lVar7 = lVar2 * 8 + lVar15, (ulong)(lVar6 - lVar7) < 0x20)) {
          uVar5 = 0;
        }
        else {
          uVar5 = uVar3 & 0xfffffffffffffffc;
          puVar8 = (undefined8 *)(lVar6 + 0x10);
          puVar9 = (undefined8 *)(lVar7 + 0x10);
          uVar10 = uVar5;
          do {
            puVar1 = puVar9 + -1;
            uVar14 = puVar9[-2];
            uVar18 = puVar9[1];
            uVar17 = *puVar9;
            uVar10 = uVar10 - 4;
            puVar9 = puVar9 + 4;
            puVar8[-1] = *puVar1;
            puVar8[-2] = uVar14;
            puVar8[1] = uVar18;
            *puVar8 = uVar17;
            puVar8 = puVar8 + 4;
          } while (uVar10 != 0);
          if (uVar3 == uVar5) goto LAB_00862cf8;
        }
        lVar7 = uVar3 - uVar5;
        puVar8 = (undefined8 *)(lVar15 + uVar5 * 8 + lVar2 * 8);
        puVar9 = (undefined8 *)(lVar6 + uVar5 * 8);
        do {
          lVar7 = lVar7 + -1;
          *puVar9 = *puVar8;
          puVar8 = puVar8 + 1;
          puVar9 = puVar9 + 1;
        } while (lVar7 != 0);
      }
LAB_00862cf8:
      lVar15 = *plVar4;
      lVar7 = plVar4[1];
      *param_1 = lVar6;
      param_1[1] = uVar3;
      param_1[2] = lVar13;
      param_1[3] = lVar11;
      lVar15 = lVar15 + lVar2 * 8;
      lVar13 = *(long *)(param_2 + 0xb0);
      param_1[4] = lVar12;
      param_1[5] = lVar13;
      if (lVar15 != lVar7) {
        plVar4[1] = lVar15;
      }
      if (*(long *)(lVar16 + 0x28) == local_68) {
        return;
      }
      goto LAB_00862dfc;
    }
    lVar12 = *(long *)(param_2 + 0x94);
    param_1[3] = *(long *)(param_2 + 0x9c);
    param_1[2] = lVar12;
    lVar12 = FUN_0086d048(param_2);
    plVar4 = (long *)FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),8);
    *plVar4 = lVar12;
    *param_1 = (long)plVar4;
    param_1[1] = 1;
  }
  if (*(long *)(lVar16 + 0x28) == local_68) {
    lVar16 = *(long *)(lVar12 + 0xc);
    param_1[5] = *(long *)(lVar12 + 0x14);
    param_1[4] = lVar16;
    return;
  }
LAB_00862dfc:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

