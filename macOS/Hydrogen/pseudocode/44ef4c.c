
undefined1  [16] FUN_0044ef4c(void)

{
  undefined8 uVar1;
  undefined *puVar2;
  undefined8 uVar3;
  undefined *puVar4;
  undefined *puVar5;
  undefined8 uVar6;
  int in_w8;
  undefined4 in_register_00004044;
  undefined1 auVar7 [16];
  
  if (in_w8 < 0x5111) {
    uVar6 = 0x1c;
    if (in_w8 != 0x5103) {
      uVar6 = CONCAT44(in_register_00004044,in_w8);
    }
    puVar5 = &UNK_0088b7a9;
    if (in_w8 != 0x5103) {
      puVar5 = (undefined *)0x0;
    }
    uVar1 = 0x1b;
    if (in_w8 != 0x5102) {
      uVar1 = uVar6;
    }
    puVar2 = &UNK_0088b78e;
    if (in_w8 != 0x5102) {
      puVar2 = puVar5;
    }
    uVar6 = 0x17;
    if (in_w8 != 0x5101) {
      uVar6 = uVar1;
    }
    puVar5 = &UNK_0088b777;
    if (in_w8 != 0x5101) {
      puVar5 = puVar2;
    }
  }
  else {
    uVar1 = 0x17;
    if (in_w8 != 0x8767) {
      uVar1 = CONCAT44(in_register_00004044,in_w8);
    }
    puVar2 = &UNK_0088b802;
    if (in_w8 != 0x8767) {
      puVar2 = (undefined *)0x0;
    }
    uVar6 = 0x16;
    if (in_w8 != 0x8766) {
      uVar6 = uVar1;
    }
    puVar5 = &UNK_0088b7ec;
    if (in_w8 != 0x8766) {
      puVar5 = puVar2;
    }
    uVar1 = 0x16;
    if (in_w8 != 0x8765) {
      uVar1 = CONCAT44(in_register_00004044,in_w8);
    }
    puVar2 = &UNK_0088b7d6;
    if (in_w8 != 0x8765) {
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
    if (in_w8 < 0x8766) {
      puVar5 = puVar4;
      uVar6 = uVar3;
    }
  }
  auVar7._8_8_ = uVar6;
  auVar7._0_8_ = puVar5;
  return auVar7;
}

