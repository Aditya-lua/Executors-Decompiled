
void FUN_0077ab4c(void)

{
  char *pcVar1;
  char cVar2;
  long lVar3;
  int iVar4;
  undefined8 uVar5;
  undefined8 unaff_x19;
  long unaff_x20;
  char *unaff_x22;
  long lVar6;
  long lVar7;
  long unaff_x29;
  undefined1 auVar8 [16];
  char cStack0000000000000017;
  
  if (unaff_x22 == (char *)0x0) {
LAB_0077abec:
    lVar6 = *(long *)(unaff_x20 + 0x18);
    if (*(char *)(*(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation"
                           + unaff_x20 + 0x18) + 1) == '\0') {
      pcVar1 = &cStack0000000000000017;
      iVar4 = func_0x0073ab64(&cStack0000000000000017,0x401);
      if (iVar4 != 0) {
        pcVar1 = "localhost";
      }
      uVar5 = func_0x00742734(pcVar1,0,lVar6 + 0x4b0,0,3);
      iVar4 = (int)uVar5;
    }
    else {
      uVar5 = func_0x00742734((char *)(*(long *)(
                                                "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation"
                                                + unaff_x20 + 0x18) + 1),0,lVar6 + 0x4b0,0,3);
      iVar4 = (int)uVar5;
    }
    if (iVar4 == 0) {
      lVar7 = *(long *)(unaff_x20 + 0x18);
      lVar6 = lVar7;
      if ((((*(int *)(lVar7 + 0x4a8) != 1) && (*(char *)(unaff_x20 + 0xa1d) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x20 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x20 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
        func_0x0073d0f4();
        lVar6 = *(long *)(unaff_x20 + 0x18);
      }
      *(undefined4 *)(lVar7 + 0x4a8) = 1;
      uVar5 = func_0x0076dfc0();
      *(bool *)unaff_x19 = *(int *)(lVar6 + 0x4a8) == 0;
    }
  }
  else {
    do {
      cVar2 = *unaff_x22;
      if (cVar2 == '\0') goto LAB_0077abec;
      lVar6 = 0;
      while ((cVar2 != '\0' && (cVar2 != '='))) {
        lVar7 = lVar6 + 1;
        lVar6 = lVar6 + 1;
        cVar2 = unaff_x22[lVar7];
      }
      lVar7 = 0;
      while ((cVar2 != '\0' && (cVar2 != ';'))) {
        lVar3 = lVar7 + lVar6;
        lVar7 = lVar7 + 1;
        cVar2 = unaff_x22[lVar3 + 1];
      }
      iVar4 = func_0x0077e76c(unaff_x22,"AUTH=",5);
      if (iVar4 == 0) {
        uVar5 = 3;
        break;
      }
      uVar5 = func_0x0073b7d8();
      if (unaff_x22[lVar7 + lVar6] == ';') {
        unaff_x22 = unaff_x22 + 1;
      }
      unaff_x22 = unaff_x22 + lVar6 + lVar7;
    } while ((int)uVar5 == 0);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
  auVar8 = ___stack_chk_fail(uVar5);
  lVar6 = *(long *)(auVar8._0_8_ + 0x18);
  func_0x0076dfc0(auVar8._0_8_,lVar6 + 1000,0,0);
  *(bool *)auVar8._8_8_ = *(int *)(lVar6 + 0x4a8) == 0;
  return;
}

