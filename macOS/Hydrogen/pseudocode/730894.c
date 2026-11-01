
void FUN_00730894(long param_1,undefined8 param_2)

{
  int iVar1;
  char *pcVar2;
  undefined1 uStack000000000000001c;
  
  _uStack000000000000001c = (uint)((ulong)*(undefined8 *)(param_1 + 0xa1a) >> 0x29) & 1;
  iVar1 = _setsockopt(param_2,0xffff,8,&uStack000000000000001c,4);
  if (iVar1 < 0) {
    if (-1 < *(char *)(param_1 + 0xa1d)) {
      return;
    }
    if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  param_1 + 0x18) != 0) &&
       (*(int *)(*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + param_1 + 0x18) + 8) < 1)) {
      return;
    }
    pcVar2 = "Failed to set SO_KEEPALIVE on fd %d: errno %d";
  }
  else {
    _uStack000000000000001c = func_0x0078bbd8((long)*(int *)(param_1 + 0x9ac));
    iVar1 = _setsockopt();
    if (((iVar1 < 0) && (*(char *)(param_1 + 0xa1d) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  param_1 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + param_1 + 0x18) + 8))))) {
      ___error();
      func_0x0073cab8(param_1,"Failed to set TCP_KEEPALIVE on fd %d: errno %d");
    }
    _uStack000000000000001c = func_0x0078bbd8((long)*(int *)(param_1 + 0x9b0));
    iVar1 = _setsockopt();
    if (((iVar1 < 0) && (*(char *)(param_1 + 0xa1d) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  param_1 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + param_1 + 0x18) + 8))))) {
      ___error();
      func_0x0073cab8(param_1,"Failed to set TCP_KEEPINTVL on fd %d: errno %d");
    }
    _uStack000000000000001c = func_0x0078bbd8((long)*(int *)(param_1 + 0x9b4));
    iVar1 = _setsockopt();
    if (((-1 < iVar1) || (-1 < *(char *)(param_1 + 0xa1d))) ||
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  param_1 + 0x18) != 0 &&
        (*(int *)(*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + param_1 + 0x18) + 8) < 1)))) {
      return;
    }
    pcVar2 = "Failed to set TCP_KEEPCNT on fd %d: errno %d";
  }
  ___error();
  func_0x0073cab8(param_1,pcVar2);
  return;
}

