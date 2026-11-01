
undefined8 * thunk_FUN_00651250(void)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long extraout_x1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  undefined8 *puVar3;
  long unaff_x24;
  long unaff_x25;
  undefined8 *puStack0000000000000010;
  undefined8 *puStack0000000000000018;
  long lStack0000000000000020;
  
  puStack0000000000000010 = (undefined8 *)(unaff_x22 + unaff_x24 * 0x70);
  lStack0000000000000020 = unaff_x22 + unaff_x25 * 0x70;
  *puStack0000000000000010 = &UNK_00a09a40;
  puStack0000000000000018 = puStack0000000000000010;
  func_0x005fe0b4(puStack0000000000000010 + 1,unaff_x20 + 8);
  func_0x005fe0b4(unaff_x22 + unaff_x24 * 0x70 + 0x38,unaff_x20 + 0x38);
  *(undefined1 *)(unaff_x22 + unaff_x24 * 0x70 + 0x68) = *(undefined1 *)(unaff_x20 + 0x68);
  puVar1 = puStack0000000000000018 + 0xe;
  puStack0000000000000018 = puVar1;
  func_0x0064fd0c();
  puVar2 = (undefined8 *)*unaff_x19;
  puVar3 = (undefined8 *)unaff_x19[1];
  *unaff_x19 = extraout_x1;
  unaff_x19[1] = (long)puVar1;
  unaff_x19[2] = lStack0000000000000020;
  while (puVar3 != puVar2) {
    puVar3 = puVar3 + -0xe;
    (**(code **)*puVar3)(puVar3);
  }
  if (puVar2 != (undefined8 *)0x0) {
    __ZdlPv(puVar2);
  }
  return puVar1;
}

