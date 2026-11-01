
void FUN_00236d2c(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  undefined8 extraout_x8;
  long lVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  ushort uStack_a4;
  undefined1 uStack_a2;
  undefined1 uStack_a1;
  ushort *puStack_a0;
  undefined8 uStack_98;
  undefined1 *puStack_90;
  undefined8 uStack_88;
  undefined *puStack_80;
  undefined8 uStack_78;
  undefined *puStack_70;
  undefined8 uStack_68;
  undefined1 *puStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  auVar5 = func_0x007a28b0();
  lVar4 = *(long *)(*auVar5._0_8_ + 0x10);
  auVar6 = (**(code **)(*(long *)(lVar4 + 0x18) + 0x30))
                     (*(undefined8 *)(lVar4 + 0x10),auVar5._0_8_ + 1);
  puVar3 = auVar6._8_8_;
  uVar2 = auVar6._0_8_;
  uVar1 = (*(code *)puVar3[5])();
  uStack_a4 = (ushort)(uVar1 >> 8) & 0xff | (ushort)((uVar1 & 0xff00ff) << 8);
  uStack_a2 = 0x10;
  uStack_a1 = (undefined1)param_3;
  puStack_a0 = &uStack_a4;
  uStack_98 = 2;
  puStack_90 = &uStack_a2;
  uStack_88 = 1;
  puStack_80 = &UNK_008294b3;
  uStack_78 = 6;
  puStack_70 = &UNK_00829497;
  uStack_68 = 10;
  puStack_60 = &uStack_a1;
  uStack_58 = 1;
  uStack_50 = auVar5._8_8_;
  uStack_48 = param_3;
  (*(code *)puVar3[4])(extraout_x8,uVar2,&puStack_a0,6);
  if ((code *)*puVar3 != (code *)0x0) {
    (*(code *)*puVar3)(uVar2);
  }
  if (puVar3[1] != 0) {
    func_0x00187bd4(uVar2,puVar3[1],puVar3[2]);
  }
  return;
}

