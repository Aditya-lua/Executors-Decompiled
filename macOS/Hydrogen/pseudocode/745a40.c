
undefined8 FUN_00745a40(void)

{
  int iVar1;
  undefined8 uVar2;
  uint in_w8;
  long unaff_x19;
  uint *unaff_x20;
  long unaff_x21;
  long lVar3;
  long unaff_x23;
  
  if (((in_w8 >> 0xf & 1) == 0) && (*(long *)(unaff_x21 + 0x4a0) != 0)) {
    uVar2 = func_0x00749ef0();
    iVar1 = (int)uVar2;
  }
  else {
    if (*(int *)(unaff_x23 + 0x10) != 0) goto LAB_00745b74;
    uVar2 = func_0x00749ef0();
    iVar1 = (int)uVar2;
  }
  if (iVar1 != 0) {
    return uVar2;
  }
LAB_00745b74:
  lVar3 = *(long *)(unaff_x19 + 0x18);
  uVar2 = func_0x0076dfc0();
  *unaff_x20 = (uint)(*(char *)(lVar3 + 0x4f6) == '\0');
  return uVar2;
}

