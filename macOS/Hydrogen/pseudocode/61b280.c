
undefined8 * FUN_0061b280(void)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  
  uVar1 = __Unwind_Resume();
  ___cxa_free_exception();
  puVar2 = (undefined8 *)__Unwind_Resume(uVar1);
  *puVar2 = &UNK_009f46d8;
  func_0x005edf2c(puVar2 + 1,1);
  *puVar2 = &UNK_009f8980;
  puVar2[1] = &UNK_009f8a58;
  puVar2[2] = 0;
  return puVar2;
}

