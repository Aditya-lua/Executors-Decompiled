
undefined1  [16] FUN_0044eecc(void)

{
  undefined8 uVar1;
  undefined *puVar2;
  undefined8 uVar3;
  undefined *puVar4;
  bool in_ZR;
  int in_w8;
  undefined4 in_register_00004044;
  undefined *in_x9;
  undefined *in_x10;
  undefined8 in_x11;
  undefined8 in_x12;
  undefined1 auVar5 [16];
  
  if (!in_ZR) {
    in_x10 = in_x9;
    in_x11 = in_x12;
  }
  uVar1 = 0x1a;
  if (in_w8 != 0xa020) {
    uVar1 = CONCAT44(in_register_00004044,in_w8);
  }
  puVar2 = &UNK_0088b82e;
  if (in_w8 != 0xa020) {
    puVar2 = (undefined *)0x0;
  }
  uVar3 = 0x15;
  if (in_w8 != 0xa000) {
    uVar3 = uVar1;
  }
  puVar4 = &UNK_0088b819;
  if (in_w8 != 0xa000) {
    puVar4 = puVar2;
  }
  if (in_w8 < 0xb000) {
    in_x10 = puVar4;
    in_x11 = uVar3;
  }
  auVar5._8_8_ = in_x11;
  auVar5._0_8_ = in_x10;
  return auVar5;
}

