
long FUN_004b5cc4(void)

{
  uint uVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  ulong uVar5;
  undefined8 extraout_x8;
  uint *extraout_x9;
  undefined8 *unaff_x19;
  code *pcVar6;
  undefined1 auVar7 [16];
  
  pcVar6 = (code *)*unaff_x19;
  auVar7 = (*pcVar6)();
  uVar4 = auVar7._8_8_;
  uVar1 = *auVar7._0_8_;
  uVar5 = (ulong)uVar1;
  if ((uVar1 & 1) != 0) goto LAB_004b5cd8;
  if (extraout_x9 == (uint *)0x0) {
LAB_004b5d04:
    uVar5 = func_0x0042b2b8(uVar5,auVar7._0_8_,uVar4);
  }
  else {
    uVar5 = *(ulong *)(extraout_x9 + 2);
    uVar4 = *(undefined8 *)(extraout_x9 + 4);
    extraout_x9[0] = 0;
    extraout_x9[1] = 0;
    if ((*extraout_x9 & 1) == 0) goto LAB_004b5d04;
  }
  auVar7 = (*pcVar6)(uVar5);
  puVar3 = auVar7._0_8_;
  *puVar3 = 1;
  puVar3[1] = extraout_x8;
  puVar3[2] = auVar7._8_8_;
LAB_004b5cd8:
  lVar2 = (*pcVar6)();
  return lVar2 + 8;
}

