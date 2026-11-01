
void FUN_005ec6ec(void)

{
  int *piVar1;
  undefined1 auVar2 [16];
  int *piStack_80;
  undefined8 uStack_78;
  undefined1 auStack_68 [24];
  undefined *puStack_50;
  undefined8 uStack_48;
  undefined1 **ppuStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined1 *puStack_20;
  undefined *puStack_18;
  
  auVar2 = func_0x007b1070();
  piVar1 = auVar2._0_8_;
  piStack_80 = piVar1 + 2;
  if (*piVar1 == 1) {
    func_0x00469960(auStack_68,auVar2._8_8_,&UNK_008ba1cb,0x14);
    puStack_18 = &DAT_005e7d38;
  }
  else {
    uStack_78 = *(undefined8 *)(piVar1 + 4);
    piStack_80 = *(int **)piStack_80;
    func_0x00469960(auStack_68,auVar2._8_8_,&UNK_008ba1b7,0x14);
    puStack_18 = &DAT_005e9f3c;
  }
  puStack_50 = &UNK_007fc120;
  uStack_48 = 1;
  uStack_38 = 1;
  uStack_30 = 0;
  ppuStack_40 = &puStack_20;
  puStack_20 = (undefined1 *)&piStack_80;
  func_0x004656a8(auStack_68,&puStack_50,&UNK_009f4160);
  func_0x004658b0();
  return;
}

