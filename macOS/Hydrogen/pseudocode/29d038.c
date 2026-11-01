
void FUN_0029d038(ulong param_1,undefined8 param_2,long param_3)

{
  undefined1 *puVar1;
  ulong in_x9;
  ulong in_x10;
  ulong in_x11;
  ulong uVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined1 *puVar6;
  undefined1 (*pauVar7) [16];
  ulong uVar8;
  ulong unaff_x19;
  undefined8 uVar9;
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  
  if ((in_x11 < param_1 + in_x10) && (param_1 < param_3 + unaff_x19)) {
    uVar2 = 0;
  }
  else {
    if (in_x10 < 0x40) {
      uVar8 = 0;
    }
    else {
      uVar2 = in_x10 & 0xffffffc0;
      puVar4 = (undefined8 *)(unaff_x19 + param_3 + -0x20);
      pauVar7 = (undefined1 (*) [16])(param_1 + 0x20);
      uVar8 = uVar2;
      do {
        auVar11 = *pauVar7;
        auVar13 = pauVar7[1];
        auVar10 = NEON_rev64(pauVar7[-2],1);
        auVar10 = NEON_ext(auVar10,auVar10,8,1);
        auVar12 = NEON_rev64(pauVar7[-1],1);
        auVar12 = NEON_ext(auVar12,auVar12,8,1);
        puVar4[1] = auVar12._8_8_;
        *puVar4 = auVar12._0_8_;
        puVar4[3] = auVar10._8_8_;
        puVar4[2] = auVar10._0_8_;
        auVar11 = NEON_rev64(auVar11,1);
        auVar11 = NEON_ext(auVar11,auVar11,8,1);
        auVar13 = NEON_rev64(auVar13,1);
        auVar13 = NEON_ext(auVar13,auVar13,8,1);
        puVar4[-3] = auVar13._8_8_;
        puVar4[-4] = auVar13._0_8_;
        puVar4[-1] = auVar11._8_8_;
        puVar4[-2] = auVar11._0_8_;
        puVar4 = puVar4 + -8;
        uVar8 = uVar8 - 0x40;
        pauVar7 = pauVar7 + 4;
      } while (uVar8 != 0);
      if (in_x10 == uVar2) goto LAB_0029d078;
      uVar8 = uVar2;
      if ((in_x10 & 0x38) == 0) goto LAB_0029d054;
    }
    uVar2 = in_x10 & 0xfffffff8;
    puVar4 = (undefined8 *)((unaff_x19 - uVar8) + param_3);
    lVar3 = uVar8 - uVar2;
    puVar5 = (undefined8 *)(param_1 + uVar8);
    do {
      puVar4 = puVar4 + -1;
      uVar9 = NEON_rev64(*puVar5,1);
      *puVar4 = uVar9;
      lVar3 = lVar3 + 8;
      puVar5 = puVar5 + 1;
    } while (lVar3 != 0);
    if (in_x10 == uVar2) goto LAB_0029d078;
  }
LAB_0029d054:
  lVar3 = in_x10 - uVar2;
  puVar1 = (undefined1 *)(param_1 + uVar2);
  puVar6 = (undefined1 *)(param_3 + unaff_x19 + ~uVar2);
  do {
    *puVar6 = *puVar1;
    lVar3 = lVar3 + -1;
    puVar1 = puVar1 + 1;
    puVar6 = puVar6 + -1;
  } while (lVar3 != 0);
LAB_0029d078:
  if (in_x9 < unaff_x19) {
    _bzero(param_3,unaff_x19 - in_x10);
  }
  return;
}

