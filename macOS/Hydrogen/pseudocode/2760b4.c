
void FUN_002760b4(undefined8 param_1)

{
  ulong uVar1;
  int iVar2;
  undefined8 *puVar3;
  long lVar4;
  long lVar5;
  undefined8 *extraout_x8;
  undefined8 *extraout_x8_00;
  undefined1 auVar6 [16];
  undefined1 uStack0000000000000010;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  ulong uStack_38;
  
  puVar3 = (undefined8 *)
           func_0x007a2810(param_1,0x20,&uStack0000000000000010,&UNK_009cca80,&UNK_009ccb20);
  lVar4 = func_0x00187bdc(0x1278,1);
  if (lVar4 == 0) {
    auVar6 = func_0x007a1f00(1,0x1278,&UNK_009ccb60);
    func_0x00283a8c(&uStack_d0,auVar6._0_8_,auVar6._8_8_);
    uStack_e0 = uStack_d0;
    uStack_d8 = uStack_c8;
    lVar4 = func_0x002905fc(&uStack_e0);
    if (lVar4 == 0) {
      *extraout_x8_00 = &UNK_0082d532;
      extraout_x8_00[1] = 0xf;
    }
    else {
      lVar5 = func_0x002d9650();
      if (lVar5 == 0) {
        *extraout_x8_00 = &UNK_0082d668;
        extraout_x8_00[1] = 0xb;
        func_0x002d8de8(lVar4);
      }
      else {
        func_0x002f7efc();
        *extraout_x8_00 = 0;
        extraout_x8_00[1] = lVar4;
      }
    }
    return;
  }
  func_0x00281e9c(&uStack_a0,lVar4,0x1278);
  iVar2 = func_0x002907d4(&uStack_a0,*puVar3);
  if (iVar2 == 1) {
    uStack_68 = uStack_98;
    uStack_70 = uStack_a0;
    uStack_58 = uStack_88;
    uStack_60 = uStack_90;
    uStack_48 = uStack_78;
    uStack_50 = uStack_80;
    uStack_40 = 0;
    uStack_38 = 0;
    iVar2 = func_0x00281efc(&uStack_70,&uStack_40,&uStack_38);
    uVar1 = uStack_38;
    func_0x00281ecc(&uStack_70);
    if (iVar2 == 1) {
      if (0x1277 < uVar1) {
        uVar1 = 0x1278;
      }
      *extraout_x8 = 0x1278;
      extraout_x8[1] = lVar4;
      extraout_x8[2] = uVar1;
      return;
    }
    *extraout_x8 = 0x8000000000000000;
  }
  else {
    *extraout_x8 = 0x8000000000000000;
    func_0x00281ecc(&uStack_a0);
  }
  func_0x00187bd4(lVar4,0x1278,1);
  return;
}

