
bool FUN_007889ec(undefined8 param_1,long *param_2)

{
  byte bVar1;
  long lVar2;
  
  lVar2 = *param_2;
  if (lVar2 != 0) {
    func_0x00768a04(param_2[1],lVar2);
    return lVar2 != 0;
  }
  bVar1 = *(byte *)(param_2 + 3);
  if ((bVar1 & 0xc0) == 0x40) {
    bVar1 = bVar1 & 0xf7;
  }
  else if ((bVar1 >> 5 & 1) != 0) {
    lVar2 = param_2[1];
    if ((*(ulong *)(lVar2 + 0xa1a) >> 0x2d & 1) != 0) {
      if (((int)*(ulong *)(lVar2 + 0xa1a) < 0) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    lVar2 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + lVar2 + 0x18) + 8))))) {
        func_0x0073cab8(lVar2,"Found pending candidate for reuse and CURLOPT_PIPEWAIT is set");
        bVar1 = *(byte *)(param_2 + 3);
      }
      bVar1 = bVar1 | 8;
    }
  }
  *(byte *)(param_2 + 3) = bVar1 & 0xef;
  return false;
}

