
undefined8 * thunk_FUN_00646314(void)

{
  undefined8 *puVar1;
  undefined1 auStack_7ffffffe [2147483614];
  
  func_0x00641ae4(auStack_7ffffffe + 0x800002e6,&UNK_009fd310);
  __Unwind_Resume();
  puVar1 = (undefined8 *)__Unwind_Resume();
  *puVar1 = &UNK_00a09fb0;
  puVar1[1] = &UNK_00a0a098;
  puVar1[2] = &UNK_00a0a0f0;
  puVar1[3] = &UNK_00a02f80;
  puVar1[4] = &UNK_00a03020;
  puVar1[5] = &UNK_00a030f0;
  func_0x00630324(puVar1 + 0x44);
  puVar1[4] = &UNK_00a03168;
  puVar1[5] = &UNK_00a03238;
  func_0x00638f0c(puVar1 + 6,&UNK_009fb428);
  return puVar1;
}

