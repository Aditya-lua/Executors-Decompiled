
undefined8 * FUN_006517a4(void)

{
  undefined8 *puVar1;
  long lVar2;
  undefined1 auVar3 [16];
  
  func_0x006514b4();
  __Unwind_Resume();
  auVar3 = func_0x0001753c();
  lVar2 = auVar3._8_8_;
  puVar1 = auVar3._0_8_;
  *puVar1 = &UNK_00a09a40;
  func_0x005fe0b4(puVar1 + 1,lVar2 + 8);
  func_0x005fe0b4(puVar1 + 7,lVar2 + 0x38);
  *(undefined1 *)(puVar1 + 0xd) = *(undefined1 *)(lVar2 + 0x68);
  func_0x005fe0b4(puVar1 + 0xe,lVar2 + 0x70);
  return puVar1;
}

