
undefined1  [16] FUN_0044f12c(void)

{
  undefined8 uVar1;
  undefined *puVar2;
  undefined8 uVar3;
  undefined *puVar4;
  int in_w8;
  undefined4 in_register_00004044;
  undefined1 auVar5 [16];
  
  uVar1 = 0x1e;
  if (in_w8 != 0x410a) {
    uVar1 = CONCAT44(in_register_00004044,in_w8);
  }
  puVar2 = &UNK_0088b606;
  if (in_w8 != 0x410a) {
    puVar2 = (undefined *)0x0;
  }
  uVar3 = 0x14;
  if (in_w8 != 0x4109) {
    uVar3 = uVar1;
  }
  puVar4 = &UNK_0088b5f2;
  if (in_w8 != 0x4109) {
    puVar4 = puVar2;
  }
  auVar5._8_8_ = uVar3;
  auVar5._0_8_ = puVar4;
  return auVar5;
}

