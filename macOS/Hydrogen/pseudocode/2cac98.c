
long FUN_002cac98(void)

{
  int iVar1;
  long unaff_x19;
  long unaff_x20;
  
  iVar1 = func_0x002c2b7c();
  if ((iVar1 == 0) ||
     ((*(long *)(unaff_x20 + 0x10) != 0 && (iVar1 = func_0x002cad18(), iVar1 == 0)))) {
    func_0x002c3420();
    return 0;
  }
  *(undefined8 *)(unaff_x19 + 0x18) = *(undefined8 *)(unaff_x20 + 0x18);
  return unaff_x19;
}

