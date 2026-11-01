
undefined8 FUN_0007ee30(void)

{
  undefined8 uVar1;
  int *piVar2;
  long unaff_x19;
  undefined8 *unaff_x20;
  int unaff_w22;
  undefined1 uStack0000000000000028;
  
  if (unaff_w22 == 6) {
    uVar1 = _strtoll();
    piVar2 = (int *)___error();
    if (*piVar2 != 0x22) {
      *(undefined8 *)(unaff_x19 + 0x70) = uVar1;
      return 6;
    }
  }
  else if (unaff_w22 == 5) {
    uVar1 = _strtoull();
    piVar2 = (int *)___error();
    if (*piVar2 != 0x22) {
      *(undefined8 *)(unaff_x19 + 0x78) = uVar1;
      return 5;
    }
  }
  if (*(char *)(unaff_x19 + 0x67) < '\0') {
    unaff_x20 = (undefined8 *)*unaff_x20;
  }
  uVar1 = _strtod(unaff_x20,&uStack0000000000000028);
  *(undefined8 *)(unaff_x19 + 0x80) = uVar1;
  return 7;
}

