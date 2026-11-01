
void FUN_0077abe0(char *param_1,undefined8 param_2)

{
  char *pcVar1;
  char cVar2;
  long lVar3;
  int iVar4;
  long in_x9;
  undefined8 unaff_x19;
  long unaff_x20;
  long lVar5;
  long lVar6;
  long unaff_x29;
  undefined1 auVar7 [16];
  char cStack0000000000000017;
  
  do {
    param_1 = param_1 + in_x9;
    if ((int)param_2 != 0) {
LAB_0077ad00:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
        return;
      }
      auVar7 = ___stack_chk_fail(param_2);
      lVar5 = *(long *)(auVar7._0_8_ + 0x18);
      func_0x0076dfc0(auVar7._0_8_,lVar5 + 1000,0,0);
      *(bool *)auVar7._8_8_ = *(int *)(lVar5 + 0x4a8) == 0;
      return;
    }
    cVar2 = *param_1;
    if (cVar2 == '\0') {
      lVar5 = *(long *)(unaff_x20 + 0x18);
      if (*(char *)(*(long *)(
                             "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation"
                             + unaff_x20 + 0x18) + 1) == '\0') {
        pcVar1 = &cStack0000000000000017;
        iVar4 = func_0x0073ab64(&cStack0000000000000017,0x401);
        if (iVar4 != 0) {
          pcVar1 = "localhost";
        }
        param_2 = func_0x00742734(pcVar1,0,lVar5 + 0x4b0,0,3);
        iVar4 = (int)param_2;
      }
      else {
        param_2 = func_0x00742734((char *)(*(long *)(
                                                  "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation"
                                                  + unaff_x20 + 0x18) + 1),0,lVar5 + 0x4b0,0,3);
        iVar4 = (int)param_2;
      }
      if (iVar4 == 0) {
        lVar6 = *(long *)(unaff_x20 + 0x18);
        lVar5 = lVar6;
        if ((((*(int *)(lVar6 + 0x4a8) != 1) && (*(char *)(unaff_x20 + 0xa1d) < '\0')) &&
            ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x20 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x20 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
          func_0x0073d0f4();
          lVar5 = *(long *)(unaff_x20 + 0x18);
        }
        *(undefined4 *)(lVar6 + 0x4a8) = 1;
        param_2 = func_0x0076dfc0();
        *(bool *)unaff_x19 = *(int *)(lVar5 + 0x4a8) == 0;
      }
      goto LAB_0077ad00;
    }
    lVar5 = 0;
    while ((cVar2 != '\0' && (cVar2 != '='))) {
      lVar6 = lVar5 + 1;
      lVar5 = lVar5 + 1;
      cVar2 = param_1[lVar6];
    }
    lVar6 = 0;
    while ((cVar2 != '\0' && (cVar2 != ';'))) {
      lVar3 = lVar6 + lVar5;
      lVar6 = lVar6 + 1;
      cVar2 = param_1[lVar3 + 1];
    }
    iVar4 = func_0x0077e76c(param_1);
    if (iVar4 == 0) {
      param_2 = 3;
      goto LAB_0077ad00;
    }
    param_2 = func_0x0073b7d8();
    if (param_1[lVar6 + lVar5] == ';') {
      param_1 = param_1 + 1;
    }
    in_x9 = lVar5 + lVar6;
  } while( true );
}

