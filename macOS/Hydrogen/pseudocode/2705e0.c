
undefined8 FUN_002705e0(undefined8 param_1)

{
  undefined8 uVar1;
  undefined1 auVar2 [16];
  undefined1 uStack000000000000000c;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  long lStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined *puStack_68;
  undefined8 uStack_60;
  undefined8 **ppuStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 *puStack_38;
  undefined *puStack_30;
  undefined8 uStack_28;
  
  uStack0000000000000028 = 0;
  uStack0000000000000030 = 0;
  uStack0000000000000020 = param_1;
  func_0x0079ffdc(0,&UNK_0082d5c4,&uStack000000000000000c,&uStack0000000000000010,&UNK_009ccb48);
  auVar2 = func_0x007a2810(&UNK_0082d5c8,0x20,&uStack0000000000000010,&UNK_009cca80,&UNK_009ccb20);
  uStack_28 = *(undefined8 *)(&UNK_009cc4a0 + *auVar2._0_8_ * 8);
  puStack_38 = &uStack_28;
  puStack_30 = &DAT_002703bc;
  puStack_68 = &UNK_009cc388;
  uStack_60 = 2;
  ppuStack_58 = &puStack_38;
  uStack_50 = 1;
  uStack_48 = 0;
  func_0x00459f08(&lStack_80,&puStack_68);
  uVar1 = func_0x0046920c(auVar2._8_8_,uStack_78,uStack_70);
  if (lStack_80 != 0) {
    func_0x00187bd4(uStack_78,lStack_80,1);
  }
  return uVar1;
}

