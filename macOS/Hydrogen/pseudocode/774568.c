
undefined8 FUN_00774568(void)

{
  char cVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  long unaff_x19;
  long *unaff_x21;
  long unaff_x23;
  long *unaff_x24;
  
  uVar2 = func_0x00774334();
  if ((int)uVar2 == 0) {
    lVar4 = *unaff_x24;
    if ((lVar4 != 0) && (*(uint *)(lVar4 + 0x18) < *(uint *)(unaff_x21 + 3))) {
      do {
        lVar3 = lVar4;
        lVar4 = *(long *)(lVar3 + 8);
        if (lVar4 == 0) break;
      } while (*(uint *)(lVar4 + 0x18) < *(uint *)(unaff_x21 + 3));
      unaff_x24 = (long *)(lVar3 + 8);
    }
    uVar2 = 0;
    unaff_x21[1] = lVar4;
    *unaff_x24 = (long)unaff_x21;
    cVar1 = *(char *)(unaff_x23 + 3);
  }
  else {
    (**(code **)(*unaff_x21 + 0x18))();
    (*pcRam0000000000a2b5f0)();
    cVar1 = *(char *)(unaff_x23 + 3);
  }
  if (cVar1 < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b550 < 1) {
        return uVar2;
      }
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b550 < 1) {
      return uVar2;
    }
    func_0x0073cd4c();
  }
  return uVar2;
}

