
long FUN_0064b764(undefined1 *param_1)

{
  undefined1 *in_x10;
  undefined1 *puVar1;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined1 *unaff_x21;
  
  do {
    puVar1 = in_x10 + 1;
    *param_1 = *in_x10;
    param_1 = param_1 + 1;
    in_x10 = puVar1;
  } while (puVar1 != unaff_x21);
  if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
    unaff_x19 = (undefined8 *)*unaff_x19;
  }
  return (long)unaff_x19 + unaff_x20;
}

