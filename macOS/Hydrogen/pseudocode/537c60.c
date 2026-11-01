
undefined1  [16] thunk_FUN_00537c84(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  ulong unaff_x19;
  long *unaff_x20;
  long lVar3;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  long lStack_50;
  ulong uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  
  if (unaff_x19 < unaff_x23) {
    func_0x007a28b0();
  }
  else {
    uVar1 = unaff_x23 + unaff_x22;
    if (uVar1 <= unaff_x19) {
      *unaff_x20 = unaff_x21;
      unaff_x20[1] = unaff_x23;
      unaff_x20[2] = unaff_x21 + uVar1;
      unaff_x20[3] = unaff_x19 - uVar1;
      auVar4._8_8_ = param_2;
      auVar4._0_8_ = uVar1;
      return auVar4;
    }
  }
  puVar2 = (undefined8 *)func_0x007a28a4();
  lVar3 = puVar2[2];
  if (lVar3 != 0) {
    unaff_x19 = puVar2[3];
    func_0x00537bf0(&lStack_50,lVar3,unaff_x19,*puVar2,puVar2[1]);
    if (lStack_50 == 0) {
      uStack_40 = 0;
    }
    else {
      puVar2[3] = uStack_38;
      unaff_x19 = uStack_48;
      lVar3 = lStack_50;
    }
    puVar2[2] = uStack_40;
  }
  auVar5._8_8_ = unaff_x19;
  auVar5._0_8_ = lVar3;
  return auVar5;
}

