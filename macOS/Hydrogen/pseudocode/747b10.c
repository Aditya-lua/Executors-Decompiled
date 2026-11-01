
undefined8 FUN_00747b10(undefined8 param_1,long param_2)

{
  undefined8 uVar1;
  char cVar2;
  int in_w8;
  long unaff_x19;
  long lVar3;
  
  if ((in_w8 == 0) || (*(long *)(param_2 + 0x4a0) == 0)) {
    if (((*(byte *)(unaff_x19 + 0x1c3) >> 1 & 1) != 0) && (*(long *)(param_2 + 0x4a0) != 0)) {
      cVar2 = 'I';
      if (((&UNK_00001345)[unaff_x19] & 0x40) != 0) {
        cVar2 = 'A';
      }
      if (cVar2 != *(char *)(param_2 + 0x4c0)) {
        *(undefined4 *)(*(long *)(unaff_x19 + 0x1b0) + 0x10) = 1;
        uVar1 = func_0x00749ef0();
        return uVar1;
      }
    }
    uVar1 = func_0x0074a140();
    return uVar1;
  }
  uVar1 = func_0x0076e34c();
  if ((int)uVar1 != 0) {
    return uVar1;
  }
  lVar3 = *(long *)(unaff_x19 + 0x18);
  if ((*(char *)(lVar3 + 0x4f6) != '\x12') && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b570 < 1) goto LAB_00747c00;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
    goto LAB_00747c00;
    func_0x0073cfbc();
  }
LAB_00747c00:
  *(undefined1 *)(lVar3 + 0x4f6) = 0x12;
  return 0;
}

