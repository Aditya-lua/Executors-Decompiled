
long FUN_004b5cc0(void)

{
  undefined8 *puVar1;
  uint uVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  ulong uVar6;
  undefined8 extraout_x8;
  uint *extraout_x9;
  long unaff_x19;
  code *pcVar7;
  undefined1 auVar8 [16];
  
  puVar1 = (undefined8 *)(unaff_x19 + 0xd60);
  pcVar7 = (code *)*puVar1;
  auVar8 = (*pcVar7)(puVar1);
  uVar5 = auVar8._8_8_;
  uVar2 = *auVar8._0_8_;
  uVar6 = (ulong)uVar2;
  if ((uVar2 & 1) != 0) goto LAB_004b5cd8;
  if (extraout_x9 == (uint *)0x0) {
LAB_004b5d04:
    uVar6 = func_0x0042b2b8(uVar6,auVar8._0_8_,uVar5);
  }
  else {
    uVar6 = *(ulong *)(extraout_x9 + 2);
    uVar5 = *(undefined8 *)(extraout_x9 + 4);
    extraout_x9[0] = 0;
    extraout_x9[1] = 0;
    if ((*extraout_x9 & 1) == 0) goto LAB_004b5d04;
  }
  auVar8 = (*pcVar7)(uVar6,puVar1);
  puVar4 = auVar8._0_8_;
  *puVar4 = 1;
  puVar4[1] = extraout_x8;
  puVar4[2] = auVar8._8_8_;
LAB_004b5cd8:
  lVar3 = (*pcVar7)(puVar1);
  return lVar3 + 8;
}

