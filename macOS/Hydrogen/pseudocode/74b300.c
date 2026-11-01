
undefined8 FUN_0074b300(ulong param_1)

{
  undefined8 uVar1;
  long unaff_x19;
  long unaff_x20;
  long lVar2;
  
  *(ulong *)(unaff_x20 + 0x398) = param_1 & 0xffffffffffff7fff;
  func_0x00730bf8();
  func_0x00730b8c();
  *(uint *)(&UNK_00001344 + unaff_x19) = *(uint *)(&UNK_00001344 + unaff_x19) & 0xffffffdf;
  uVar1 = func_0x0076e34c();
  if ((int)uVar1 != 0) {
    return uVar1;
  }
  *(int *)(unaff_x20 + 0x4e8) = *(int *)(unaff_x20 + 0x4e8) + 1;
  lVar2 = *(long *)(unaff_x19 + 0x18);
  if ((((*(char *)(lVar2 + 0x4f6) != '\x1e') && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
    func_0x0073cfbc();
  }
  *(undefined1 *)(lVar2 + 0x4f6) = 0x1e;
  return 0;
}

