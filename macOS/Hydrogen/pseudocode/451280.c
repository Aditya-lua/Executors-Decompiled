
undefined1  [16] FUN_00451280(undefined *param_1)

{
  undefined8 uVar1;
  undefined *puVar2;
  undefined8 uVar3;
  undefined *puVar4;
  bool in_ZR;
  int in_w8;
  undefined4 in_register_00004044;
  undefined *in_x9;
  undefined8 in_x10;
  undefined *in_x12;
  undefined1 auVar5 [16];
  
  if (!in_ZR) {
    in_x9 = in_x12;
  }
  uVar1 = 0x18;
  if (in_w8 != 0x9101) {
    uVar1 = CONCAT44(in_register_00004044,in_w8);
  }
  puVar2 = &UNK_0088d56c;
  if (in_w8 != 0x9101) {
    puVar2 = param_1;
  }
  uVar3 = 0x15;
  if (in_w8 != 0x9001) {
    uVar3 = uVar1;
  }
  puVar4 = &UNK_0088d557;
  if (in_w8 != 0x9001) {
    puVar4 = puVar2;
  }
  if (in_w8 < 0xb000) {
    in_x9 = puVar4;
    in_x10 = uVar3;
  }
  auVar5._8_8_ = in_x10;
  auVar5._0_8_ = in_x9;
  return auVar5;
}

