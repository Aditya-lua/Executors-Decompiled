
undefined8 thunk_FUN_007757cc(void)

{
  int iVar1;
  long lVar2;
  char *pcVar3;
  undefined1 auVar4 [16];
  
  auVar4 = ___stack_chk_fail();
  lVar2 = auVar4._0_8_;
  if ((*(byte *)(*(long *)(auVar4._8_8_ + 0x10) + 0x44) >> 2 & 1) == 0) {
    return 0;
  }
  if (*(long *)(lVar2 + 0x218) == 0) {
    if (*(long *)(lVar2 + 0x260) == 0) {
      if (*(undefined **)
           ("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
           lVar2 + 0x38) == PTR__fread_009b0218) {
        iVar1 = _fseek(*(undefined8 *)
                        ("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                        + lVar2 + 0x40),0,0);
        if (*(char *)(lVar2 + 0xa1d) < '\0') {
          if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + lVar2 + 0x18) == 0) {
            if (0 < iRam0000000000a2b550) goto code_r0x007759ac;
          }
          else if (0 < *(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + lVar2 + 0x18) + 8) && 0 < iRam0000000000a2b550) {
code_r0x007759ac:
            ___error();
            func_0x0073cd4c(lVar2,"cr_in, rewind via fseek -> %d(%d)");
          }
        }
        if (iVar1 != -1) {
          return 0;
        }
      }
      pcVar3 = "necessary data rewind was not possible";
      goto code_r0x00775938;
    }
    func_0x0076bad4(lVar2,1);
    iVar1 = (**(code **)(lVar2 + 0x260))(lVar2,1,*(undefined8 *)(lVar2 + 0x2d8));
    func_0x0076bad4(lVar2,0);
    if (*(char *)(lVar2 + 0xa1d) < '\0') {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   lVar2 + 0x18) == 0) {
        if (0 < iRam0000000000a2b550) goto code_r0x007758f4;
      }
      else if (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + lVar2 + 0x18) + 8) && 0 < iRam0000000000a2b550) {
code_r0x007758f4:
        func_0x0073cd4c(lVar2,"cr_in, rewind via set.ioctl_func -> %d");
      }
    }
    if (iVar1 == 0) {
      return 0;
    }
    pcVar3 = "ioctl callback returned error %d";
    goto code_r0x00775938;
  }
  func_0x0076bad4(lVar2,1);
  iVar1 = (**(code **)(lVar2 + 0x218))(*(undefined8 *)(lVar2 + 0x2a8),0,0);
  func_0x0076bad4(lVar2,0);
  if (*(char *)(lVar2 + 0xa1d) < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar2 + 0x18) == 0) {
      if (0 < iRam0000000000a2b550) goto code_r0x00775868;
    }
    else if (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + lVar2 + 0x18) + 8) && 0 < iRam0000000000a2b550) {
code_r0x00775868:
      func_0x0073cd4c(lVar2,"cr_in, rewind via set.seek_func -> %d");
    }
  }
  if (iVar1 == 0) {
    return 0;
  }
  pcVar3 = "seek callback returned error %d";
code_r0x00775938:
  func_0x0073c9e4(lVar2,pcVar3);
  return 0x41;
}

