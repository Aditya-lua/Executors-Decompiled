
undefined1  [16] FUN_0044ef90(void)

{
  undefined8 uVar1;
  undefined *puVar2;
  undefined8 uVar3;
  undefined *puVar4;
  bool in_ZR;
  int in_w8;
  undefined4 in_register_00004044;
  int in_w9;
  undefined8 in_x10;
  undefined *in_x11;
  undefined *in_x13;
  undefined1 auVar5 [16];
  
  if (!in_ZR) {
    in_x11 = in_x13;
  }
  uVar1 = 0x16;
  if (in_w8 != in_w9) {
    uVar1 = CONCAT44(in_register_00004044,in_w8);
  }
  puVar2 = &UNK_0088b7d6;
  if (in_w8 != in_w9) {
    puVar2 = (undefined *)0x0;
  }
  uVar3 = 0x11;
  if (in_w8 != 0x5111) {
    uVar3 = uVar1;
  }
  puVar4 = &UNK_0088b7c5;
  if (in_w8 != 0x5111) {
    puVar4 = puVar2;
  }
  if (in_w8 <= in_w9) {
    in_x11 = puVar4;
    in_x10 = uVar3;
  }
  auVar5._8_8_ = in_x10;
  auVar5._0_8_ = in_x11;
  return auVar5;
}

