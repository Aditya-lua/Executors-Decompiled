
undefined8 FUN_00783ba0(void)

{
  int iVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  
  func_0x0073cab8();
  *(uint *)(&UNK_00001344 + unaff_x19) = *(uint *)(&UNK_00001344 + unaff_x19) & 0xffffffef;
  iVar1 = *(int *)(unaff_x19 + 0xc50);
  *(int *)(unaff_x19 + 0xc50) = iVar1 + 1;
  if (4 < iVar1) {
    func_0x0073c9e4();
    *(undefined4 *)(unaff_x19 + 0xc50) = 0;
    return 0x37;
  }
  if ((*(char *)(unaff_x22 + 3) < '\0') &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  lVar2 = (*pcRam0000000000a2b600)
                    (*(undefined8 *)
                      ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                      unaff_x19 + 0x28));
  *unaff_x21 = lVar2;
  if (lVar2 == 0) {
    return 0x1b;
  }
  func_0x00734f74();
  *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) | 0x4000;
  func_0x00773f38();
  return 0;
}

