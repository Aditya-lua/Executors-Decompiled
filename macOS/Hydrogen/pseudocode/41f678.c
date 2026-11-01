
ulong FUN_0041f678(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  undefined1 auVar6 [16];
  undefined8 uStack_70;
  ulong uStack_68;
  undefined *puStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  
  auVar6 = func_0x007a2668();
  uStack_70 = auVar6._0_8_;
  uStack_68 = 0;
  iVar2 = func_0x0046849c(&uStack_70,&UNK_009d9b10,auVar6._8_8_);
  if (iVar2 == 0) {
    if ((uStack_68 & 3) == 1) {
      puVar3 = (undefined8 *)(uStack_68 - 1);
      uVar4 = *puVar3;
      puVar5 = *(undefined8 **)(uStack_68 + 7);
      if ((code *)*puVar5 != (code *)0x0) {
        (*(code *)*puVar5)(uVar4);
      }
      if (puVar5[1] != 0) {
        func_0x00187bd4(uVar4,puVar5[1],puVar5[2]);
      }
      func_0x00187bd4(puVar3,0x18,8);
    }
    uStack_68 = 0;
  }
  else if (uStack_68 == 0) {
    puStack_60 = &UNK_009da710;
    uStack_58 = 1;
    uStack_48 = 0;
    uStack_40 = 0;
    uStack_50 = 8;
    func_0x007a2420(&puStack_60,&UNK_009da720);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x41f6e8);
    (*pcVar1)();
  }
  return uStack_68;
}

