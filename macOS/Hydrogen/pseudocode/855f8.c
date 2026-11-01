
long FUN_000855f8(void)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  long *unaff_x19;
  undefined1 unaff_w21;
  
  puVar1 = (undefined8 *)__Znwm();
  puVar1[2] = 0;
  puVar1[1] = 0;
  *puVar1 = puVar1 + 1;
  puVar2 = (undefined1 *)*unaff_x19;
  *puVar2 = unaff_w21;
  *(undefined8 **)(puVar2 + 8) = puVar1;
  func_0x00078220();
  return *unaff_x19;
}

