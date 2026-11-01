
void FUN_0018c224(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  long lVar2;
  ulong uVar3;
  ulong *extraout_x8;
  ulong uVar4;
  ulong extraout_x8_00;
  ulong extraout_x9;
  undefined8 *puVar5;
  undefined8 *puVar6;
  ulong uVar7;
  long unaff_x20;
  ulong uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined1 auVar15 [16];
  undefined1 uStack0000000000000008;
  
  uVar1 = __Unwind_Resume();
  func_0x0016b01c(&uStack0000000000000008);
  auVar15 = __Unwind_Resume(uVar1);
  lVar2 = auVar15._0_8_;
  uVar8 = auVar15._8_8_ - lVar2;
  if (uVar8 < 0x7ffffffffffffff9) {
    if (auVar15._8_8_ == lVar2) {
      uVar4 = 0;
      uVar3 = 8;
      goto LAB_0018c310;
    }
    uVar1 = 8;
    uVar3 = func_0x00187bd0(uVar8,8);
    unaff_x20 = lVar2;
    if (uVar3 == 0) goto LAB_0018c2ec;
    uVar4 = uVar8 >> 3;
    if (0x3f < uVar8) {
      uVar8 = uVar4 & 0xffffffffffffff8;
      puVar5 = (undefined8 *)(uVar3 + 0x20);
      puVar6 = (undefined8 *)(lVar2 + 0x20);
      uVar7 = uVar8;
      do {
        uVar1 = puVar6[-4];
        uVar10 = puVar6[-1];
        uVar9 = puVar6[-2];
        uVar12 = puVar6[1];
        uVar11 = *puVar6;
        uVar14 = puVar6[3];
        uVar13 = puVar6[2];
        puVar5[-3] = puVar6[-3];
        puVar5[-4] = uVar1;
        puVar5[-1] = uVar10;
        puVar5[-2] = uVar9;
        puVar5[1] = uVar12;
        *puVar5 = uVar11;
        puVar5[3] = uVar14;
        puVar5[2] = uVar13;
        uVar7 = uVar7 - 8;
        puVar5 = puVar5 + 8;
        puVar6 = puVar6 + 8;
        if (uVar7 == 0) goto LAB_0018c308;
      } while( true );
    }
    uVar8 = 0;
  }
  else {
    uVar1 = 0;
LAB_0018c2ec:
    uVar3 = func_0x007a1f00(uVar1,uVar8,param_3);
    uVar4 = extraout_x8_00;
    uVar8 = extraout_x9;
  }
  do {
    *(undefined8 *)(uVar3 + uVar8 * 8) = *(undefined8 *)(unaff_x20 + uVar8 * 8);
    uVar8 = uVar8 + 1;
LAB_0018c308:
  } while (uVar4 != uVar8);
LAB_0018c310:
  *extraout_x8 = uVar4;
  extraout_x8[1] = uVar3;
  extraout_x8[2] = uVar4;
  return;
}

