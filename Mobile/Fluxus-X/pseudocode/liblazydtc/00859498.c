/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00859498
 */

/* WARNING: Removing unreachable block (ram,0x00859684) */
/* WARNING: Removing unreachable block (ram,0x00859768) */

undefined8 FUN_00859498(long param_1)

{
  int iVar1;
  uint uVar2;
  long lVar3;
  undefined8 *puVar4;
  uint uVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  long lVar10;
  undefined8 *puVar11;
  long lVar12;
  undefined8 *puVar13;
  ulong uVar14;
  undefined8 uVar15;
  ulong uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  long local_88;
  ulong uStack_80;
  long local_78;
  undefined8 uStack_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  uVar16 = 0;
  local_68 = *(long *)(lVar3 + 0x28);
  lVar6 = *(long *)(param_1 + 0x260);
  lVar10 = *(long *)(param_1 + 600);
  lVar12 = *(long *)(param_1 + 0xb8);
  lVar7 = lVar6 - lVar10;
  do {
    uVar5 = DAT_00d1eba0;
    uVar2 = *(int *)(param_1 + 0x90) - 0x126;
    if (uVar2 < 0x11 && (1 << (ulong)(uVar2 & 0x1f) & 0x10007U) != 0 ||
        *(int *)(param_1 + 0x90) == 0) break;
    iVar1 = *(int *)(param_1 + 0x124);
    uVar2 = iVar1 + 1;
    *(uint *)(param_1 + 0x124) = uVar2;
    if (uVar5 < uVar2) {
      if (*(long *)(lVar3 + 0x28) == local_68) {
                    /* try { // try from 0085971c to 00859733 has its CatchHandler @ 00859738 */
        uVar15 = FUN_008578f8(param_1 + 0x94,
                              "Exceeded allowed recursion depth; simplify your %s to make the code compile"
                              ,"block");
                    /* catch() { ... } // from try @ 008595d8 with catch @ 00859734 */
                    /* catch() { ... } // from try @ 00859544 with catch @ 0085973c */
        lVar7 = lVar7 + *(long *)(param_1 + 600);
        if (lVar7 != *(long *)(param_1 + 0x260)) {
          *(long *)(param_1 + 0x260) = lVar7;
        }
        if (*(long *)(lVar3 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
          FUN_00c2c090(uVar15);
        }
      }
      goto LAB_00859798;
    }
                    /* try { // try from 00859544 to 00859583 has its CatchHandler @ 0085973c */
    local_78 = FUN_0085979c(param_1);
    *(int *)(param_1 + 0x124) = iVar1;
    if (*(int *)(param_1 + 0x90) == 0x3b) {
      FUN_00858f2c(param_1);
      *(undefined1 *)(local_78 + 0x1c) = 1;
      *(undefined8 *)(local_78 + 0x14) = *(undefined8 *)(param_1 + 0xb8);
    }
    FUN_00870688((long *)(param_1 + 600),&local_78);
    iVar1 = *(int *)(local_78 + 8);
    if ((iVar1 == DAT_00d1b130) || (iVar1 == DAT_00d1b140)) {
      uVar16 = uVar16 + 1;
      break;
    }
    uVar16 = uVar16 + 1;
  } while (iVar1 != DAT_00d1b150);
  uStack_70 = *(undefined8 *)(param_1 + 0x94);
  uVar15 = *(undefined8 *)(param_1 + 0xe8);
  local_78 = lVar12;
  if (uVar16 == 0) {
    local_88 = 0;
  }
  else {
    lVar12 = *(long *)(param_1 + 600);
                    /* try { // try from 008595d8 to 0085965f has its CatchHandler @ 00859734 */
    local_88 = FUN_0084e938(uVar15,uVar16 << 3);
    if ((uVar16 < 8) || ((ulong)((lVar10 + local_88) - (lVar12 + lVar6)) < 0x20)) {
      uVar8 = 0;
    }
    else {
      uVar8 = uVar16 & 0xfffffffffffffffc;
      puVar11 = (undefined8 *)(local_88 + 0x10);
      puVar13 = (undefined8 *)(lVar7 + lVar12 + 0x10);
      uVar14 = uVar8;
      do {
        puVar4 = puVar13 + -1;
        uVar17 = puVar13[-2];
        uVar19 = puVar13[1];
        uVar18 = *puVar13;
        uVar14 = uVar14 - 4;
        puVar13 = puVar13 + 4;
        puVar11[-1] = *puVar4;
        puVar11[-2] = uVar17;
        puVar11[1] = uVar19;
        *puVar11 = uVar18;
        puVar11 = puVar11 + 4;
      } while (uVar14 != 0);
      if (uVar16 == uVar8) goto LAB_0085963c;
    }
    lVar9 = uVar16 - uVar8;
    puVar11 = (undefined8 *)(lVar12 + ((lVar6 + uVar8 * 8) - lVar10));
    puVar13 = (undefined8 *)(local_88 + uVar8 * 8);
    do {
      lVar9 = lVar9 + -1;
      *puVar13 = *puVar11;
      puVar11 = puVar11 + 1;
      puVar13 = puVar13 + 1;
    } while (lVar9 != 0);
  }
LAB_0085963c:
  uStack_80 = uVar16;
  uVar15 = FUN_0084e938(uVar15,0x38);
  FUN_0084f804(uVar15,&local_78,&local_88,1);
  lVar7 = lVar7 + *(long *)(param_1 + 600);
  if (lVar7 != *(long *)(param_1 + 0x260)) {
    *(long *)(param_1 + 0x260) = lVar7;
  }
  if (*(long *)(lVar3 + 0x28) == local_68) {
    return uVar15;
  }
LAB_00859798:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

