
undefined1  [16] FUN_00537cc0(void)

{
  undefined8 *puVar1;
  long unaff_x19;
  long lVar2;
  undefined1 auVar3 [16];
  long lStack_50;
  long lStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  
  func_0x007a28a4(unaff_x19 + 1);
  func_0x007a28b0();
  puVar1 = (undefined8 *)func_0x007a28a4();
  lVar2 = puVar1[2];
  if (lVar2 != 0) {
    unaff_x19 = puVar1[3];
    func_0x00537bf0(&lStack_50,lVar2,unaff_x19,*puVar1,puVar1[1]);
    if (lStack_50 == 0) {
      uStack_40 = 0;
    }
    else {
      puVar1[3] = uStack_38;
      unaff_x19 = lStack_48;
      lVar2 = lStack_50;
    }
    puVar1[2] = uStack_40;
  }
  auVar3._8_8_ = unaff_x19;
  auVar3._0_8_ = lVar2;
  return auVar3;
}

