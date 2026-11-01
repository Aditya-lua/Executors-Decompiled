
void FUN_005cf340(void)

{
  undefined8 *puVar1;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar2;
  undefined1 auVar3 [16];
  undefined8 uStack_28;
  undefined8 uStack_20;
  undefined1 uStack_18;
  
  puVar1 = (undefined8 *)func_0x00187bd0(0x10,8);
  if (puVar1 == (undefined8 *)0x0) {
    auVar3 = func_0x007a1f18(8,0x10);
    uStack_28 = auVar3._8_8_;
    uStack_18 = 1;
    uStack_20 = 0;
    func_0x005ac048(&uStack_28,auVar3._0_8_);
    return;
  }
  uVar2 = *unaff_x20;
  puVar1[1] = unaff_x20[1];
  *puVar1 = uVar2;
  *unaff_x19 = 2;
  unaff_x19[1] = puVar1;
  unaff_x19[2] = 2;
  return;
}

