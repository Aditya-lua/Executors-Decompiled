
void FUN_0076b900(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  int in_w8;
  long unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  long unaff_x25;
  
  if (in_w8 != 0) {
    lVar2 = func_0x00782dc4();
    if (0 < lVar2) {
      return;
    }
    iVar1 = func_0x0077e580(*(undefined8 *)(unaff_x25 + 0xf0),unaff_x19 + 0xd60);
    if (((iVar1 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
  }
  *(undefined8 *)(unaff_x19 + 0xd50) = unaff_x20;
  *(undefined8 *)(unaff_x19 + 0xd58) = unaff_x21;
  func_0x0077e6c8(unaff_x19 + 0xd60);
  uVar3 = func_0x0077e3f0(*(undefined8 *)(unaff_x19 + 0xd50),*(undefined8 *)(unaff_x19 + 0xd58),
                          *(undefined8 *)(unaff_x25 + 0xf0),unaff_x19 + 0xd60);
  *(undefined8 *)(unaff_x25 + 0xf0) = uVar3;
  return;
}

