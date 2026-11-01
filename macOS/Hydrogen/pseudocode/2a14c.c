
undefined8 FUN_0002a14c(void)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 unaff_x19;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined8 *unaff_x23;
  
  puVar1 = (undefined8 *)__Znwm(0x30);
  puVar1[4] = unaff_x19;
  *(undefined4 *)(puVar1 + 5) = 0;
  *puVar1 = 0;
  puVar1[1] = 0;
  puVar1[2] = unaff_x23;
  *unaff_x23 = puVar1;
  puVar2 = puVar1;
  if ((long *)*plRam0000000000a33370 != (long *)0x0) {
    puVar2 = (undefined8 *)*unaff_x23;
    plRam0000000000a33370 = (long *)*plRam0000000000a33370;
  }
  func_0x0003767c(*unaff_x21,puVar2);
  unaff_x21[1] = unaff_x21[1] + 1;
  *(undefined4 *)(puVar1 + 5) = *(undefined4 *)(unaff_x22 + 0x28);
  return 1;
}

