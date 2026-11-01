
/* WARNING: Removing unreachable block (ram,0x0075df08) */

undefined8 FUN_0075dd78(void)

{
  long unaff_x20;
  int unaff_w22;
  long unaff_x28;
  long unaff_x29;
  long in_stack_00000060;
  
  func_0x0073c9e4();
  if (in_stack_00000060 != 0) {
    _ldap_msgfree();
  }
  if (((unaff_w22 == 4) && (*(char *)(unaff_x28 + 3) < '\0')) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x20 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x20 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  if (*(long *)(unaff_x29 + -0x58) != 0) {
    _ldap_free_urldesc();
  }
  func_0x00783c98();
  func_0x00734f74();
  return 0x3a;
}

