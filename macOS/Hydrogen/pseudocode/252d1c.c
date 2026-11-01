
void FUN_00252d1c(void)

{
  code *pcVar1;
  undefined8 *extraout_x8;
  undefined1 auVar2 [16];
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  ulong uStack_30;
  
  auVar2 = func_0x007a2810();
  uStack_30 = auVar2._8_8_;
  uStack_48 = 0;
  uStack_50 = 0;
  uStack_38 = 0;
  uStack_40 = 0;
  uStack_68 = 0;
  uStack_70 = 0;
  uStack_58 = 0;
  uStack_60 = 0;
  if (0x40 < uStack_30) {
    func_0x007a28b0(uStack_30,0x40,&UNK_009ca5d8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x252da0);
    (*pcVar1)();
  }
  _memcpy(&uStack_70,auVar2._0_8_,uStack_30);
  extraout_x8[5] = uStack_48;
  extraout_x8[4] = uStack_50;
  extraout_x8[7] = uStack_38;
  extraout_x8[6] = uStack_40;
  extraout_x8[8] = uStack_30;
  extraout_x8[1] = uStack_68;
  *extraout_x8 = uStack_70;
  extraout_x8[3] = uStack_58;
  extraout_x8[2] = uStack_60;
  return;
}

