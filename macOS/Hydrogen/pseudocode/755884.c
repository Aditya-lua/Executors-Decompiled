
/* WARNING: Removing unreachable block (ram,0x007561cc) */
/* WARNING: Removing unreachable block (ram,0x007561b0) */

undefined8 FUN_00755884(void)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  long unaff_x21;
  long unaff_x27;
  undefined8 uStack0000000000000010;
  
  iVar1 = func_0x0077ed9c(unaff_x21 + 0xf,0,10,&uStack0000000000000010);
  if (iVar1 == 1) {
    if (*(long *)(unaff_x19 + 0x6b0) != 0) {
      func_0x0073c9e4();
      return 0x3f;
    }
    func_0x00734f74();
    if ((*(char *)(unaff_x27 + 3) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
  }
  else {
    if (iVar1 != 0) {
      func_0x0073c9e4();
      return 8;
    }
    *(undefined8 *)(unaff_x19 + 0xe8) = uStack0000000000000010;
    *(undefined8 *)(unaff_x19 + 0xf0) = uStack0000000000000010;
  }
  func_0x0073c8fc();
  uVar2 = func_0x007738a0();
  if ((int)uVar2 == 0) {
    uVar2 = func_0x00754e80();
  }
  return uVar2;
}

