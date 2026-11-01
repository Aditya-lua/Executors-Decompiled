
long FUN_005605d0(void)

{
  uint uVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  ulong uVar5;
  undefined8 extraout_x8;
  uint *extraout_x9;
  code *unaff_x20;
  undefined1 auVar6 [16];
  
  auVar6 = (*unaff_x20)();
  uVar4 = auVar6._8_8_;
  uVar1 = *auVar6._0_8_;
  uVar5 = (ulong)uVar1;
  if ((uVar1 & 1) != 0) goto LAB_005605dc;
  if (extraout_x9 == (uint *)0x0) {
LAB_00560608:
    uVar5 = func_0x0042b2b8(uVar5,auVar6._0_8_,uVar4);
  }
  else {
    uVar5 = *(ulong *)(extraout_x9 + 2);
    uVar4 = *(undefined8 *)(extraout_x9 + 4);
    extraout_x9[0] = 0;
    extraout_x9[1] = 0;
    if ((*extraout_x9 & 1) == 0) goto LAB_00560608;
  }
  auVar6 = (*unaff_x20)(uVar5);
  puVar3 = auVar6._0_8_;
  *puVar3 = 1;
  puVar3[1] = extraout_x8;
  puVar3[2] = auVar6._8_8_;
LAB_005605dc:
  lVar2 = (*unaff_x20)();
  return lVar2 + 8;
}

