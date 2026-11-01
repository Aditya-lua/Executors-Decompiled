
undefined8 FUN_00753258(long param_1)

{
  long lVar1;
  byte bVar2;
  long unaff_x19;
  long unaff_x20;
  char *unaff_x22;
  
  if (param_1 == 0) {
    (*pcRam0000000000a2b5f0)
              (*(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x20));
    lVar1 = func_0x00764704("Authorization: Bearer %s\r\n");
    *(long *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x20) = lVar1;
    if (lVar1 == 0) {
      return 0x1b;
    }
    unaff_x22 = "Bearer";
  }
  *(byte *)(unaff_x19 + 0x18) = *(byte *)(unaff_x19 + 0x18) | 1;
  if (unaff_x22 == (char *)0x0) {
    bVar2 = *(byte *)(unaff_x19 + 0x18) & 0xfd;
  }
  else {
    if (((unaff_x20 != 0) && (*(char *)(unaff_x20 + 0xa1d) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x20 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x20 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
    bVar2 = ((*(byte *)(unaff_x19 + 0x18) & 1) << 1 | *(byte *)(unaff_x19 + 0x18) & 0xfd) ^ 2;
  }
  *(byte *)(unaff_x19 + 0x18) = bVar2;
  return 0;
}

