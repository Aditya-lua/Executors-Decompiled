
undefined8 FUN_0072f8cc(undefined8 param_1,undefined8 param_2,char *param_3,uint *param_4)

{
  char in_NG;
  char in_OV;
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  uint *puVar4;
  long lVar5;
  long *plVar6;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x23;
  long unaff_x29;
  undefined1 auVar7 [16];
  long *plStack_48;
  
  if ((in_NG == in_OV) && (0 < *(int *)(*unaff_x20 + 0xc))) {
    param_3 = "accepted_set(sock=%d, remote=%s port=%d)";
    func_0x0073cbdc();
  }
  if (*(long *)(unaff_x19 + 0x268) != 0) {
    func_0x0076bad4();
    param_3 = (char *)0x1;
    iVar1 = (**(code **)(unaff_x19 + 0x268))
                      (*(undefined8 *)(unaff_x19 + 0x270),*(undefined4 *)(unaff_x23 + 0x98));
    func_0x0076bad4();
    if (iVar1 != 0) {
      uVar2 = 0x2a;
      goto LAB_0072f6c4;
    }
  }
  uVar2 = 0;
LAB_0072f6c4:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return uVar2;
  }
  auVar7 = ___stack_chk_fail(uVar2);
  lVar5 = auVar7._8_8_;
  lVar3 = auVar7._0_8_;
  plStack_48 = (long *)0x0;
  func_0x00730b8c();
  puVar4 = (uint *)(*pcRam0000000000a2b608)(1,0x138);
  if (puVar4 == (uint *)0x0) {
    plVar6 = (long *)0x0;
    uVar2 = 0x1b;
  }
  else {
    *puVar4 = (uint)*(byte *)(lVar5 + 0x52a);
    puVar4[0x26] = *param_4;
    *(byte *)(puVar4 + 0x4d) = (byte)puVar4[0x4d] & 0xfb | 2;
    uVar2 = func_0x00730fe0(&plStack_48,0xa2b3e0,puVar4);
    if ((int)uVar2 == 0) {
      func_0x00731058(lVar3,lVar5,param_3);
      auVar7 = func_0x00782d28();
      *(undefined1 (*) [16])(puVar4 + 0x40) = auVar7;
      *(uint *)(lVar5 + (long)(int)param_3 * 4 + 0x238) = puVar4[0x26];
      func_0x0072fadc(plStack_48[2],lVar3);
      if ((lVar3 != 0) && (*(char *)(lVar3 + 0xa1d) < '\0')) {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar3 + 0x18) == 0) {
          if (plStack_48 == (long *)0x0) {
            return 0;
          }
        }
        else {
          if (*(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar3 + 0x18) + 8) < 1) {
            return 0;
          }
          if (plStack_48 == (long *)0x0) {
            return 0;
          }
        }
        if (0 < *(int *)(*plStack_48 + 0xc)) {
          func_0x0073cbdc(lVar3,plStack_48,"set filter for listen socket fd=%d ip=%s:%d");
        }
      }
      return 0;
    }
    plVar6 = plStack_48;
  }
  (*pcRam0000000000a2b5f0)(plVar6);
  plStack_48 = (long *)0x0;
  (*pcRam0000000000a2b5f0)(puVar4);
  return uVar2;
}

