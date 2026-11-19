/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085bef4
 */

/* WARNING: Removing unreachable block (ram,0x0085c188) */
/* WARNING: Removing unreachable block (ram,0x0085c1c0) */

long FUN_0085bef4(long param_1)

{
  long **pplVar1;
  int iVar2;
  long lVar3;
  undefined8 *puVar4;
  long lVar5;
  long lVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  undefined8 *puVar12;
  ulong uVar13;
  undefined8 uVar14;
  long lVar15;
  long lVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  long local_b0;
  ulong uStack_a8;
  long local_a0;
  undefined8 uStack_98;
  long *local_88;
  long lStack_80;
  ulong local_78;
  long *local_70;
  long lStack_68;
  ulong local_60;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  uVar14 = *(undefined8 *)(param_1 + 0x9c);
  lVar16 = *(long *)(param_1 + 0x94);
  FUN_00858f2c();
  local_60 = 0;
  local_70 = (long *)(param_1 + 0x2a0);
  local_78 = 0;
  lStack_68 = *(long *)(param_1 + 0x2a8) - *(long *)(param_1 + 0x2a0) >> 3;
  local_88 = (long *)(param_1 + 0x450);
  iVar2 = *(int *)(param_1 + 0x90);
  lStack_80 = *(long *)(param_1 + 0x458) - *(long *)(param_1 + 0x450) >> 3;
  local_a0 = lVar16;
  if ((((iVar2 - 0x126U < 0x11) && ((1 << (ulong)(iVar2 - 0x126U & 0x1f) & 0x10007U) != 0)) ||
      (iVar2 == 0)) || (iVar2 == 0x3b)) {
LAB_0085bf8c:
    uStack_a8 = 0;
    uVar8 = *(undefined8 *)(param_1 + 0xe8);
    local_b0 = 0;
    uStack_98 = uVar14;
  }
  else {
    pplVar1 = &local_88;
    if (*(char *)(param_1 + 0x68) == '\0') {
      pplVar1 = (long **)0x0;
    }
                    /* try { // try from 0085c058 to 0085c063 has its CatchHandler @ 0085c26c */
    FUN_00861848(param_1,&local_70,pplVar1);
    uStack_a8 = local_60;
    lVar16 = lStack_68;
    if (local_60 == 0) goto LAB_0085bf8c;
    uVar8 = *(undefined8 *)(param_1 + 0xe8);
    uStack_98 = *(undefined8 *)(*(long *)(local_70[1] + -8) + 0x14);
    lVar5 = *local_70;
                    /* try { // try from 0085c098 to 0085c09f has its CatchHandler @ 0085c27c */
    local_b0 = FUN_0084e938(uVar8,local_60 << 3);
    if ((uStack_a8 < 8) || (lVar6 = lVar16 * 8 + lVar5, (ulong)(local_b0 - lVar6) < 0x20)) {
      uVar11 = 0;
LAB_0085c0c4:
      lVar6 = uStack_a8 - uVar11;
      puVar7 = (undefined8 *)(lVar5 + uVar11 * 8 + lVar16 * 8);
      puVar12 = (undefined8 *)(local_b0 + uVar11 * 8);
      do {
        lVar6 = lVar6 + -1;
        *puVar12 = *puVar7;
        puVar7 = puVar7 + 1;
        puVar12 = puVar12 + 1;
      } while (lVar6 != 0);
    }
    else {
      uVar11 = uStack_a8 & 0xfffffffffffffffc;
      puVar7 = (undefined8 *)(local_b0 + 0x10);
      puVar12 = (undefined8 *)(lVar6 + 0x10);
      uVar9 = uVar11;
      do {
        puVar4 = puVar12 + -1;
        uVar14 = puVar12[-2];
        uVar18 = puVar12[1];
        uVar17 = *puVar12;
        uVar9 = uVar9 - 4;
        puVar12 = puVar12 + 4;
        puVar7[-1] = *puVar4;
        puVar7[-2] = uVar14;
        puVar7[1] = uVar18;
        *puVar7 = uVar17;
        puVar7 = puVar7 + 4;
      } while (uVar9 != 0);
      if (uStack_a8 != uVar11) goto LAB_0085c0c4;
    }
  }
                    /* try { // try from 0085bfa8 to 0085bfc3 has its CatchHandler @ 0085c27c */
  lVar5 = FUN_0084e938(uVar8,0x30);
  FUN_0084fd10(lVar5,&local_a0,&local_b0);
  uVar11 = local_78;
  lVar16 = lStack_80;
  if (*(char *)(param_1 + 0x68) != '\x01') goto LAB_0085c120;
  uVar14 = *(undefined8 *)(param_1 + 0xe8);
  if (local_78 == 0) {
    lVar6 = 0;
  }
  else {
    lVar15 = *local_88;
                    /* try { // try from 0085bfe8 to 0085bfef has its CatchHandler @ 0085c278 */
    lVar6 = FUN_0084e938(uVar14,local_78 << 3);
    if ((uVar11 < 8) || (lVar10 = lVar16 * 8 + lVar15, (ulong)(lVar6 - lVar10) < 0x20)) {
      uVar9 = 0;
    }
    else {
      uVar9 = uVar11 & 0xfffffffffffffffc;
      puVar7 = (undefined8 *)(lVar6 + 0x10);
      puVar12 = (undefined8 *)(lVar10 + 0x10);
      uVar13 = uVar9;
      do {
        puVar4 = puVar12 + -1;
        uVar8 = puVar12[-2];
        uVar18 = puVar12[1];
        uVar17 = *puVar12;
        uVar13 = uVar13 - 4;
        puVar12 = puVar12 + 4;
        puVar7[-1] = *puVar4;
        puVar7[-2] = uVar8;
        puVar7[1] = uVar18;
        *puVar7 = uVar17;
        puVar7 = puVar7 + 4;
      } while (uVar13 != 0);
      if (uVar11 == uVar9) goto LAB_0085c0f0;
    }
    lVar10 = uVar11 - uVar9;
    puVar7 = (undefined8 *)(lVar15 + uVar9 * 8 + lVar16 * 8);
    puVar12 = (undefined8 *)(lVar6 + uVar9 * 8);
    do {
      lVar10 = lVar10 + -1;
      *puVar12 = *puVar7;
      puVar7 = puVar7 + 1;
      puVar12 = puVar12 + 1;
    } while (lVar10 != 0);
  }
LAB_0085c0f0:
                    /* try { // try from 0085c0f0 to 0085c10b has its CatchHandler @ 0085c278 */
  uVar14 = FUN_0084e938(uVar14,0x18);
  FUN_00851f20(uVar14,lVar6,uVar11);
                    /* try { // try from 0085c110 to 0085c11b has its CatchHandler @ 0085c274 */
  local_a0 = lVar5;
  puVar7 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_a0);
  *puVar7 = uVar14;
LAB_0085c120:
  if ((DAT_00d1ec40 == '\x01') && (*(long *)(param_1 + 0x160) - *(long *)(param_1 + 0x158) == 8)) {
    if (*(long *)(param_1 + 0x228) != 0) {
                    /* try { // try from 0085c148 to 0085c15b has its CatchHandler @ 0085c270 */
      FUN_00860ecc(param_1,lVar5 + 0xc,
                   "Exporting values is not compatible with top-level return (export/return conflict)"
                  );
    }
    *(undefined1 *)(param_1 + 0x238) = 1;
  }
  lVar16 = *local_88 + lStack_80 * 8;
  if (lVar16 != local_88[1]) {
    local_88[1] = lVar16;
  }
  lVar16 = *local_70 + lStack_68 * 8;
  if (lVar16 != local_70[1]) {
    local_70[1] = lVar16;
  }
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return lVar5;
}

