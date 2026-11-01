
undefined1  [16] FUN_00450724(undefined *param_1)

{
  undefined8 uVar1;
  undefined *puVar2;
  undefined8 uVar3;
  undefined *puVar4;
  int in_w8;
  undefined4 in_register_00004044;
  int in_w9;
  int in_w10;
  undefined *in_x11;
  undefined8 in_x12;
  int in_w13;
  undefined *in_x14;
  undefined1 auVar5 [16];
  
  uVar1 = 0x14;
  if (in_w8 != in_w13) {
    uVar1 = CONCAT44(in_register_00004044,in_w8);
    in_x14 = param_1;
  }
  if (in_w8 != in_w10) {
    in_x11 = in_x14;
    in_x12 = uVar1;
  }
  uVar1 = 0x15;
  if (in_w8 != 0x1f02) {
    uVar1 = CONCAT44(in_register_00004044,in_w8);
  }
  puVar2 = &UNK_0088ce9c;
  if (in_w8 != 0x1f02) {
    puVar2 = param_1;
  }
  uVar3 = 0x16;
  if (in_w8 != 0x1f01) {
    uVar3 = uVar1;
  }
  puVar4 = &UNK_0088ce86;
  if (in_w8 != 0x1f01) {
    puVar4 = puVar2;
  }
  if (in_w8 <= in_w9) {
    in_x11 = puVar4;
    in_x12 = uVar3;
  }
  auVar5._8_8_ = in_x12;
  auVar5._0_8_ = in_x11;
  return auVar5;
}

