
/* WARNING: Removing unreachable block (ram,0x0058fb50) */

void FUN_0058faf4(void)

{
  long lVar1;
  long lVar2;
  bool in_ZR;
  long lVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  undefined8 *puVar11;
  ulong uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined1 auVar20 [16];
  undefined8 uStack0000000000000080;
  long *in_stack_00000088;
  undefined8 uStack0000000000000098;
  
  if (((!in_ZR) &&
      (func_0x005ec378(&uStack0000000000000080,&uStack0000000000000098),
      lVar3 = uStack0000000000000080, uStack0000000000000080 != 2)) &&
     (func_0x005ec3ac(&uStack0000000000000080,uStack0000000000000098), lVar3 != 0)) {
    lVar3 = *in_stack_00000088;
    *in_stack_00000088 = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      DataMemoryBarrier(2,1);
      func_0x005e80f0((ulong)&uStack0000000000000080 | 8);
    }
  }
  __Unwind_Resume();
  func_0x00493e08(&uStack0000000000000080);
  func_0x007a2668();
  func_0x007a2668();
  auVar20 = func_0x007a2668();
  puVar5 = auVar20._8_8_;
  puVar4 = auVar20._0_8_;
  puVar6 = (undefined8 *)puVar4[3];
  puVar9 = (undefined8 *)puVar4[1];
  if (puVar9 == puVar6) {
    *(undefined8 *)*puVar5 = puVar5[1];
    lVar3 = puVar4[2];
    goto joined_r0x0058fc50;
  }
  lVar3 = puVar5[1];
  lVar2 = puVar5[2];
  uVar7 = (long)puVar6 + (-8 - (long)puVar9);
  puVar8 = puVar9;
  if ((uVar7 < 0x38) || (lVar1 = lVar3 * 8 + lVar2, (ulong)(lVar1 - (long)puVar9) < 0x40)) {
LAB_0058fc04:
    puVar9 = puVar8;
    do {
      puVar8 = puVar9 + 1;
      *(undefined8 *)(lVar2 + lVar3 * 8) = *puVar9;
      lVar3 = lVar3 + 1;
      puVar9 = puVar8;
    } while (puVar8 != puVar6);
  }
  else {
    uVar7 = (uVar7 >> 3) + 1;
    uVar10 = uVar7 & 0x3ffffffffffffff8;
    lVar3 = lVar3 + uVar10;
    puVar8 = puVar9 + uVar10;
    puVar9 = puVar9 + 4;
    puVar11 = (undefined8 *)(lVar1 + 0x20);
    uVar12 = uVar10;
    do {
      uVar13 = puVar9[-4];
      uVar15 = puVar9[-1];
      uVar14 = puVar9[-2];
      uVar17 = puVar9[1];
      uVar16 = *puVar9;
      uVar19 = puVar9[3];
      uVar18 = puVar9[2];
      puVar11[-3] = puVar9[-3];
      puVar11[-4] = uVar13;
      puVar11[-1] = uVar15;
      puVar11[-2] = uVar14;
      puVar11[1] = uVar17;
      *puVar11 = uVar16;
      puVar11[3] = uVar19;
      puVar11[2] = uVar18;
      uVar12 = uVar12 - 8;
      puVar9 = puVar9 + 8;
      puVar11 = puVar11 + 8;
    } while (uVar12 != 0);
    if (uVar7 != uVar10) goto LAB_0058fc04;
  }
  puVar4[1] = puVar8;
  puVar5[1] = lVar3;
  *(long *)*puVar5 = lVar3;
  lVar3 = puVar4[2];
joined_r0x0058fc50:
  if (lVar3 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*puVar4,lVar3 << 3,8);
  return;
}

