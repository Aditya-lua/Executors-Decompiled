
undefined8 * FUN_002aa044(void)

{
  undefined8 *puVar1;
  long lVar2;
  long in_x11;
  long unaff_x19;
  undefined8 *unaff_x20;
  
  if (in_x11 != 0) {
    unaff_x20 = (undefined8 *)0x0;
  }
  if (*(char *)(unaff_x19 + 0x28) == '\0') {
    if (*(long *)(unaff_x19 + 0x10) == 0) {
      puVar1 = (undefined8 *)func_0x0079db4c();
      puVar1[3] = 0;
      puVar1[2] = 0;
      puVar1[5] = 0;
      puVar1[4] = 0;
      puVar1[7] = 0;
      puVar1[6] = 0;
      *puVar1 = 0;
      puVar1[1] = 0;
      puVar1[2] = 0;
      puVar1[3] = 0;
      puVar1[4] = 0;
      puVar1[5] = 0;
      return puVar1;
    }
    lVar2 = *(long *)(unaff_x19 + 0x10) + -1;
    *(long *)(unaff_x19 + 0x10) = lVar2;
    *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar2 * 8);
  }
  return unaff_x20;
}

