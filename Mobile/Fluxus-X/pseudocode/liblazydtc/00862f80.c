/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00862f80
 */

/* WARNING: Removing unreachable block (ram,0x00863088) */

void FUN_00862f80(long param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  long *plVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  ulong uVar11;
  long lVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  long *local_60;
  long local_58;
  ulong local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  local_50 = 0;
  local_60 = (long *)(param_1 + 0x240);
  local_58 = *(long *)(param_1 + 0x248) - *(long *)(param_1 + 0x240) >> 3;
  while( true ) {
    while (uVar5 = local_50, lVar1 = local_58, plVar4 = local_60, *(int *)(param_1 + 0x90) == 0x11d)
    {
                    /* try { // try from 00862fcc to 00862ffb has its CatchHandler @ 00863108 */
      FUN_00862364(param_1,&local_60,param_2);
    }
    if (*(int *)(param_1 + 0x90) != 0x11c) break;
    FUN_00862e6c(param_1,&local_60);
  }
  if (local_50 == 0) {
    lVar6 = 0;
  }
  else {
    lVar12 = *local_60;
                    /* try { // try from 00863018 to 0086301b has its CatchHandler @ 00863104 */
    lVar6 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),local_50 << 3);
    if ((uVar5 < 8) || (lVar8 = lVar1 * 8 + lVar12, (ulong)(lVar6 - lVar8) < 0x20)) {
      uVar7 = 0;
    }
    else {
      uVar7 = uVar5 & 0xfffffffffffffffc;
      puVar9 = (undefined8 *)(lVar6 + 0x10);
      puVar10 = (undefined8 *)(lVar8 + 0x10);
      uVar11 = uVar7;
      do {
        puVar3 = puVar10 + -1;
        uVar13 = puVar10[-2];
        uVar15 = puVar10[1];
        uVar14 = *puVar10;
        uVar11 = uVar11 - 4;
        puVar10 = puVar10 + 4;
        puVar9[-1] = *puVar3;
        puVar9[-2] = uVar13;
        puVar9[1] = uVar15;
        *puVar9 = uVar14;
        puVar9 = puVar9 + 4;
      } while (uVar11 != 0);
      if (uVar5 == uVar7) goto LAB_00863068;
    }
    lVar8 = uVar5 - uVar7;
    puVar9 = (undefined8 *)(lVar12 + uVar7 * 8 + lVar1 * 8);
    puVar10 = (undefined8 *)(lVar6 + uVar7 * 8);
    do {
      lVar8 = lVar8 + -1;
      *puVar10 = *puVar9;
      puVar9 = puVar9 + 1;
      puVar10 = puVar10 + 1;
    } while (lVar8 != 0);
  }
LAB_00863068:
  lVar1 = *plVar4 + lVar1 * 8;
  if (lVar1 != plVar4[1]) {
    plVar4[1] = lVar1;
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(lVar6);
  }
  return;
}

