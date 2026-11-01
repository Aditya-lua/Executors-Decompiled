
void FUN_001b6f90(void)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  
  if (unaff_x20 == 0) {
    lVar2 = 1;
    _memcpy(1);
    if (-1 < unaff_x22) goto code_r0x001b6fc0;
LAB_001b7030:
    uVar5 = 0;
LAB_001b7034:
    func_0x007a1f00(uVar5);
    goto code_r0x001b7188;
  }
  lVar2 = func_0x00187bd0();
  if (lVar2 == 0) {
    func_0x007a1f00(1);
code_r0x001b7170:
    uVar5 = 0;
  }
  else {
    _memcpy();
    if (unaff_x22 < 0) goto LAB_001b7030;
code_r0x001b6fc0:
    if (unaff_x22 == 0) {
      lVar3 = 1;
    }
    else {
      uVar5 = 1;
      lVar3 = func_0x00187bd0();
      if (lVar3 == 0) goto LAB_001b7034;
    }
    _memcpy(lVar3);
    auVar6 = (**(code **)(unaff_x24 + 0x38))();
    unaff_x23 = auVar6._8_8_;
    if (unaff_x23 < 0) goto code_r0x001b7170;
    if (unaff_x23 == 0) {
      lVar4 = 1;
code_r0x001b70a0:
      _memcpy(lVar4,auVar6._0_8_,unaff_x23);
      *unaff_x19 = unaff_x20;
      unaff_x19[1] = lVar2;
      unaff_x19[2] = unaff_x20;
      unaff_x19[3] = unaff_x22;
      unaff_x19[4] = lVar3;
      unaff_x19[5] = unaff_x22;
      unaff_x19[6] = unaff_x23;
      unaff_x19[7] = lVar4;
      unaff_x19[8] = unaff_x23;
      return;
    }
    uVar5 = 1;
    lVar4 = func_0x00187bd0(unaff_x23,1);
    if (lVar4 != 0) goto code_r0x001b70a0;
  }
  func_0x007a1f00(uVar5,unaff_x23,&UNK_009c2560);
code_r0x001b7188:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1b718c);
  (*pcVar1)();
}

