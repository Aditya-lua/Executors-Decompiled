
undefined8 FUN_00283354(void)

{
  int iVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  
  iVar1 = func_0x0028253c();
  if ((iVar1 != 0) &&
     (iVar1 = func_0x002826e4(&uStack0000000000000008,unaff_x29 + -0x28), iVar1 != 0)) {
    if (unaff_x20 != 0) {
      _memcpy(*(undefined8 *)(unaff_x29 + -0x28));
    }
    iVar1 = func_0x00281fbc();
    if (iVar1 != 0) {
      return 1;
    }
  }
  puVar2 = unaff_x19 + 2;
  if (*(char *)(unaff_x19 + 1) != '\0') {
    puVar2 = (undefined8 *)*puVar2;
  }
  *(byte *)(puVar2 + 3) = *(byte *)(puVar2 + 3) | 2;
  *unaff_x19 = 0;
  return 0;
}

