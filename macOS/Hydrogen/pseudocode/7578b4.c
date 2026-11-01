
undefined8 FUN_007578b4(long param_1)

{
  bool in_ZR;
  long lVar1;
  uint in_w8;
  long *in_x9;
  
  if (!in_ZR) {
    *in_x9 = -1;
    in_x9[1] = -1;
    return 0;
  }
  lVar1 = *in_x9;
  if (lVar1 == -1) {
    return 0;
  }
  if ((*(long *)(param_1 + 0x6b0) != 0 && *(long *)(param_1 + 0x6b0) < lVar1) &&
      (in_w8 & 0x400) == 0) {
    func_0x0073c9e4(param_1,"Maximum file size exceeded");
    return 0x3f;
  }
  if ((((in_w8 >> 10 & 1) != 0) && (*(char *)(param_1 + 0xa1d) < '\0')) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                param_1 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + param_1 + 0x18) + 8))))) {
    func_0x0073cab8(param_1,"setting size while ignoring");
    lVar1 = *(long *)(param_1 + 0xe8);
  }
  func_0x00770554(param_1,lVar1);
  *(undefined8 *)(param_1 + 0xf0) = *(undefined8 *)(param_1 + 0xe8);
  return 0;
}

