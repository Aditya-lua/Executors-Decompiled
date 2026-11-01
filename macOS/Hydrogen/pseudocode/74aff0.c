
/* WARNING: Removing unreachable block (ram,0x0074b044) */
/* WARNING: Removing unreachable block (ram,0x0074b048) */

undefined8 FUN_0074aff0(void)

{
  long lVar1;
  undefined8 uVar2;
  long unaff_x19;
  
  (*pcRam0000000000a2b5f0)();
  lVar1 = func_0x00764704("%s%s%s");
  (*pcRam0000000000a2b5f0)(0);
  if (lVar1 == 0) {
    uVar2 = 0x1b;
  }
  else {
    uVar2 = func_0x0076e34c();
    (*pcRam0000000000a2b5f0)(lVar1);
    if ((int)uVar2 == 0) {
      lVar1 = *(long *)(unaff_x19 + 0x18);
      if ((((*(char *)(lVar1 + 0x4f6) != '\x1f') && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
        func_0x0073cfbc();
      }
      uVar2 = 0;
      *(undefined1 *)(lVar1 + 0x4f6) = 0x1f;
    }
  }
  return uVar2;
}

