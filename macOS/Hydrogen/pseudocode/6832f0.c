
void FUN_006832f0(ulong param_1)

{
  uint uVar1;
  uint *puVar2;
  ulong in_x9;
  long lVar3;
  undefined8 *puVar4;
  uint *puVar5;
  undefined1 (*pauVar6) [16];
  ulong uVar7;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  
  if (0x3f < (ulong)(unaff_x21 - unaff_x20)) {
    param_1 = in_x9 & 0x3ffffffffffffff0;
    puVar4 = (undefined8 *)(unaff_x21 + 0x20);
    pauVar6 = (undefined1 (*) [16])(unaff_x20 + 0x20);
    uVar7 = param_1;
    do {
      auVar8 = NEON_rev32(pauVar6[-2],1);
      auVar9 = NEON_rev32(pauVar6[-1],1);
      auVar10 = NEON_rev32(*pauVar6,1);
      auVar11 = NEON_rev32(pauVar6[1],1);
      puVar4[-3] = auVar8._8_8_;
      puVar4[-4] = auVar8._0_8_;
      puVar4[-1] = auVar9._8_8_;
      puVar4[-2] = auVar9._0_8_;
      puVar4[1] = auVar10._8_8_;
      *puVar4 = auVar10._0_8_;
      puVar4[3] = auVar11._8_8_;
      puVar4[2] = auVar11._0_8_;
      uVar7 = uVar7 - 0x10;
      puVar4 = puVar4 + 8;
      pauVar6 = pauVar6 + 4;
    } while (uVar7 != 0);
    if (in_x9 == param_1) goto LAB_006833c8;
  }
  lVar3 = in_x9 - param_1;
  puVar2 = (uint *)(unaff_x21 + param_1 * 4);
  puVar5 = (uint *)(unaff_x20 + param_1 * 4);
  do {
    uVar1 = (*puVar5 & 0xff00ff00) >> 8 | (*puVar5 & 0xff00ff) << 8;
    *puVar2 = uVar1 >> 0x10 | uVar1 << 0x10;
    lVar3 = lVar3 + -1;
    puVar2 = puVar2 + 1;
    puVar5 = puVar5 + 1;
  } while (lVar3 != 0);
LAB_006833c8:
                    /* WARNING: Could not recover jumptable at 0x006833f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x19 + 0x40))();
  return;
}

