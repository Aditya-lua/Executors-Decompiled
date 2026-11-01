
long * FUN_00651178(void)

{
  long *plVar1;
  undefined8 uVar2;
  long *plVar3;
  long *plVar4;
  long extraout_x1;
  undefined8 *puVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  long unaff_x22;
  undefined8 *puVar10;
  long lVar11;
  undefined8 *unaff_x23;
  long lVar12;
  undefined1 auVar13 [16];
  undefined1 uStack0000000000000008;
  long lStack0000000000000018;
  long lStack_78;
  undefined8 *puStack_70;
  long *plStack_68;
  long lStack_60;
  long *plStack_58;
  
  lStack0000000000000018 = (long)unaff_x23 + unaff_x22;
  func_0x0064fcb8(&uStack0000000000000008);
  auVar13 = __Unwind_Resume();
  lVar11 = auVar13._8_8_;
  plVar4 = auVar13._0_8_;
  lVar8 = plVar4[1] - *plVar4 >> 4;
  uVar6 = lVar8 * 0x6db6db6db6db6db7 + 1;
  if (uVar6 < 0x24924924924924a) {
    plVar3 = plVar4 + 2;
    lVar7 = *plVar3 - *plVar4 >> 4;
    uVar9 = lVar7 * -0x2492492492492492;
    if (uVar9 <= uVar6) {
      uVar9 = uVar6;
    }
    if (0x124924924924923 < (ulong)(lVar7 * 0x6db6db6db6db6db7)) {
      uVar9 = 0x249249249249249;
    }
    plStack_58 = plVar3;
    if (uVar9 == 0) {
      lVar7 = 0;
    }
    else {
      if (0x249249249249249 < uVar9) goto LAB_00651334;
      lVar7 = __Znwm(uVar9 * 0x70);
    }
    puStack_70 = (undefined8 *)(lVar7 + lVar8 * 0x10);
    lStack_60 = lVar7 + uVar9 * 0x70;
    *puStack_70 = &UNK_00a09a40;
    lStack_78 = lVar7;
    plStack_68 = puStack_70;
    func_0x005fe0b4(puStack_70 + 1,lVar11 + 8);
    func_0x005fe0b4(lVar7 + lVar8 * 0x10 + 0x38,lVar11 + 0x38);
    *(undefined1 *)(lVar7 + lVar8 * 0x10 + 0x68) = *(undefined1 *)(lVar11 + 0x68);
    plVar1 = plStack_68 + 0xe;
    plStack_68 = plVar1;
    func_0x0064fd0c(plVar3,plVar4[1],plVar4[1],*plVar4,*plVar4,puStack_70,puStack_70);
    puVar5 = (undefined8 *)*plVar4;
    puVar10 = (undefined8 *)plVar4[1];
    *plVar4 = extraout_x1;
    plVar4[1] = (long)plVar1;
    plVar4[2] = lStack_60;
    while (puVar10 != puVar5) {
      puVar10 = puVar10 + -0xe;
      (**(code **)*puVar10)(puVar10);
    }
    if (puVar5 != (undefined8 *)0x0) {
      __ZdlPv(puVar5);
    }
    return plVar1;
  }
  func_0x00017f90(plVar4);
LAB_00651334:
  uVar2 = func_0x00017514();
  *unaff_x23 = &UNK_009f5d60;
  lVar8 = unaff_x22 + lVar8 * 0x10;
  lVar11 = *(long *)(lVar8 + 0x28);
  uVar6 = *(ulong *)(lVar8 + 0x18);
  if (*(ulong *)(lVar8 + 0x20) <= *(ulong *)(lVar8 + 0x18)) {
    uVar6 = *(ulong *)(lVar8 + 0x20);
  }
  if (lVar11 != 0) {
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(lVar11 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644();
  }
  func_0x0064fcb8(&lStack_78);
  auVar13 = __Unwind_Resume(uVar2);
  puVar5 = auVar13._8_8_;
  plVar3 = auVar13._0_8_;
  lVar8 = *plVar3;
  lVar7 = plVar3[1];
  lVar11 = puVar5[1];
  plVar4 = plVar3;
  if (lVar7 != lVar8) {
    lVar12 = 0;
    do {
      plVar4 = (long *)func_0x00651558(lVar11 + lVar12 + -0xa0,lVar7 + lVar12 + -0xa0);
      lVar12 = lVar12 + -0xa0;
    } while (lVar7 + lVar12 != lVar8);
    lVar11 = lVar11 + lVar12;
  }
  puVar5[1] = lVar11;
  lVar8 = *plVar3;
  *plVar3 = lVar11;
  puVar5[1] = lVar8;
  lVar11 = plVar3[1];
  plVar3[1] = puVar5[2];
  puVar5[2] = lVar11;
  lVar11 = plVar3[2];
  plVar3[2] = puVar5[3];
  puVar5[3] = lVar11;
  *puVar5 = puVar5[1];
  return plVar4;
}

