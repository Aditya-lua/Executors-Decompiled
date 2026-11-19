/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086c3dc
 */

/* WARNING: Removing unreachable block (ram,0x0086c58c) */

undefined1  [16] FUN_0086c3dc(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  long lVar1;
  undefined4 uVar2;
  int iVar3;
  long lVar4;
  undefined8 *puVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  ulong uVar12;
  long **pplVar13;
  long lVar14;
  undefined8 uVar15;
  undefined8 *puVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined1 auVar20 [16];
  undefined4 local_8c;
  undefined8 local_88;
  long *local_80;
  long lStack_78;
  ulong local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  if (param_2 == (undefined8 *)0x0) {
    pplVar13 = (long **)0x0;
  }
  else {
    pplVar13 = &local_80;
    *param_2 = *(undefined8 *)(param_1 + 0x94);
  }
  uVar2 = *(undefined4 *)(param_1 + 0x90);
  puVar16 = (undefined8 *)(param_1 + 0x94);
  uVar15 = *puVar16;
  FUN_00853424(param_1 + 0x70);
  local_70 = 0;
  local_80 = (long *)(param_1 + 0x450);
  puVar10 = (undefined8 *)0x0;
  if (param_2 != (undefined8 *)0x0) {
    puVar10 = param_2 + 1;
  }
  lStack_78 = *(long *)(param_1 + 0x458) - *(long *)(param_1 + 0x450) >> 3;
  puVar11 = (undefined8 *)0x0;
  if (param_2 != (undefined8 *)0x0) {
    puVar11 = param_2 + 4;
  }
                    /* try { // try from 0086c470 to 0086c47b has its CatchHandler @ 0086c610 */
  auVar20 = FUN_0086ab5c(param_1,puVar10,pplVar13,puVar11);
  uVar6 = local_70;
  lVar1 = lStack_78;
  if (param_2 == (undefined8 *)0x0) goto LAB_0086c518;
  if (local_70 == 0) {
    lVar7 = 0;
  }
  else {
    lVar14 = *local_80;
                    /* try { // try from 0086c4a8 to 0086c4ab has its CatchHandler @ 0086c60c */
    lVar7 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),local_70 << 3);
    if ((uVar6 < 8) || (lVar9 = lVar1 * 8 + lVar14, (ulong)(lVar7 - lVar9) < 0x20)) {
      uVar8 = 0;
    }
    else {
      uVar8 = uVar6 & 0xfffffffffffffffc;
      puVar10 = (undefined8 *)(lVar7 + 0x10);
      puVar11 = (undefined8 *)(lVar9 + 0x10);
      uVar12 = uVar8;
      do {
        puVar5 = puVar11 + -1;
        uVar17 = puVar11[-2];
        uVar19 = puVar11[1];
        uVar18 = *puVar11;
        uVar12 = uVar12 - 4;
        puVar11 = puVar11 + 4;
        puVar10[-1] = *puVar5;
        puVar10[-2] = uVar17;
        puVar10[1] = uVar19;
        *puVar10 = uVar18;
        puVar10 = puVar10 + 4;
      } while (uVar12 != 0);
      if (uVar6 == uVar8) goto LAB_0086c4fc;
    }
    lVar9 = uVar6 - uVar8;
    puVar10 = (undefined8 *)(lVar14 + uVar8 * 8 + lVar1 * 8);
    puVar11 = (undefined8 *)(lVar7 + uVar8 * 8);
    do {
      lVar9 = lVar9 + -1;
      *puVar11 = *puVar10;
      puVar10 = puVar10 + 1;
      puVar11 = puVar11 + 1;
    } while (lVar9 != 0);
  }
LAB_0086c4fc:
  iVar3 = *(int *)(param_1 + 0x90);
  param_2[2] = lVar7;
  param_2[3] = uVar6;
  if (iVar3 == 0x3e) {
    param_2[5] = *puVar16;
  }
LAB_0086c518:
  if (param_3 != (undefined8 *)0x0) {
    uVar17 = *puVar16;
    param_3[1] = *(undefined8 *)(param_1 + 0x9c);
    *param_3 = uVar17;
  }
  local_8c = uVar2;
  local_88 = uVar15;
  if (*(int *)(param_1 + 0x90) == 0x3e) {
                    /* try { // try from 0086c538 to 0086c567 has its CatchHandler @ 0086c614 */
    FUN_00858f2c(param_1);
  }
  else {
    FUN_0086b5f8(param_1,0x3e,&local_8c,0);
    FUN_0086e434(param_1,0x3e);
  }
  lVar1 = *local_80 + lStack_78 * 8;
  if (lVar1 != local_80[1]) {
    local_80[1] = lVar1;
  }
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return auVar20;
}

