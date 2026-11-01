
undefined8 FUN_00797714(void)

{
  bool bVar1;
  long *plVar2;
  long lVar3;
  ulong uVar4;
  long unaff_x19;
  undefined8 *unaff_x22;
  undefined8 unaff_x23;
  long unaff_x24;
  long unaff_x26;
  
  while (unaff_x26 != 0) {
    plVar2 = (long *)func_0x00156654(unaff_x26);
    unaff_x26 = func_0x006f4058(unaff_x26);
    if ((int)plVar2[3] != 0x304) {
      lVar3 = func_0x00740a58(plVar2 + 8);
      if (lVar3 == 0) {
        if (*plVar2 != 0) {
          (*(code *)*unaff_x22)();
          *plVar2 = 0;
        }
        plVar2[1] = 0;
        if (plVar2[6] != 0) {
          (*(code *)*unaff_x22)();
          plVar2[6] = 0;
        }
        plVar2[7] = 0;
        *(undefined4 *)(plVar2 + 3) = 0;
        plVar2[2] = 0;
        (*(code *)*unaff_x22)(plVar2[4]);
        plVar2[4] = 0;
        (*(code *)*unaff_x22)(plVar2);
      }
      else {
        func_0x0075e5fc(plVar2 + 8);
      }
    }
  }
  func_0x0075e474();
  uVar4 = func_0x006f4058();
  if (*(ulong *)(unaff_x24 + 0x90) < uVar4) {
    do {
      func_0x00740a58();
      func_0x0075e5fc();
      uVar4 = func_0x006f4058();
    } while (*(ulong *)(unaff_x24 + 0x90) < uVar4);
  }
  if ((int)unaff_x23 != 0) {
    func_0x0073c9e4();
    goto LAB_00797a9c;
  }
  if ((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (0 < iRam0000000000a2b590) goto LAB_00797a20;
    }
    else {
      bVar1 = *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8) < 1;
      if ((!bVar1 && iRam0000000000a2b590 != 0) && (bVar1 || -1 < iRam0000000000a2b590)) {
LAB_00797a20:
        if (unaff_x24 != 0) {
          func_0x006f4058(unaff_x24 + 0x20);
        }
        func_0x0073d22c();
      }
    }
  }
  unaff_x23 = 0;
LAB_00797a9c:
  if ((*(long *)(unaff_x19 + 0xe0) != 0) &&
     ((*(byte *)(*(long *)(unaff_x19 + 0xe0) + 4) >> 4 & 1) != 0)) {
    func_0x00779d40();
  }
  return unaff_x23;
}

