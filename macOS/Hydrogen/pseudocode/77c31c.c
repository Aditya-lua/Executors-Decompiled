
undefined8 FUN_0077c31c(void)

{
  undefined1 *puVar1;
  undefined8 uVar2;
  long unaff_x19;
  long lVar3;
  undefined1 uStack0000000000000010;
  undefined1 *in_stack_00000020;
  
  puVar1 = (undefined1 *)_strchr();
  in_stack_00000020 = puVar1;
  if (puVar1 != (undefined1 *)0x0) {
    in_stack_00000020 = puVar1 + 1;
    *puVar1 = 0;
    func_0x0075af14(&uStack0000000000000010);
  }
  uVar2 = func_0x0076e34c();
  (*pcRam0000000000a2b5f0)();
  if ((int)uVar2 != 0) {
    return uVar2;
  }
  lVar3 = *(long *)(unaff_x19 + 0x18);
  if ((((*(int *)(lVar3 + 0x4a8) != 9) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
    func_0x0073d0f4();
  }
  *(undefined4 *)(lVar3 + 0x4a8) = 9;
  return 0;
}

