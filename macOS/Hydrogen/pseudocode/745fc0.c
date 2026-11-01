
undefined4 FUN_00745fc0(void)

{
  undefined4 uVar1;
  undefined4 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  if (*(char *)(unaff_x20 + 0x4f6) == '\0') {
    *unaff_x19 = *(undefined4 *)(unaff_x20 + 0x238);
    return 1;
  }
  *unaff_x19 = *(undefined4 *)(*(long *)(unaff_x21 + 0x18) + 0x238);
  uVar1 = 0x10000;
  if (*(long *)(unaff_x20 + 0x400) == 0) {
    uVar1 = 1;
  }
  return uVar1;
}

