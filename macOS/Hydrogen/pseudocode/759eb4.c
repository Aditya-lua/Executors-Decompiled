
undefined8 FUN_00759eb4(int param_1)

{
  long *plVar1;
  undefined8 *puVar2;
  int iVar3;
  long *plVar4;
  ulong uVar5;
  long extraout_x1;
  long lVar6;
  undefined1 *unaff_x19;
  long unaff_x23;
  undefined8 uVar7;
  long unaff_x28;
  long unaff_x29;
  undefined8 *in_stack_00000030;
  
  func_0x0076bad4();
  puVar2 = in_stack_00000030;
  if (param_1 == 0) {
    for (; puVar2 != (undefined8 *)0x0; puVar2 = (undefined8 *)puVar2[1]) {
      uVar7 = *puVar2;
      lVar6 = _strchr(uVar7,0x3a);
      if ((lVar6 == 0) || (*(char *)(lVar6 + 1) != ' ')) {
        if ((*(char *)(unaff_x23 + 0xa1d) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x23 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x23 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
      }
      else {
        _strlen(uVar7);
        uVar7 = func_0x00729b5c();
        if (((int)uVar7 != 0) || (uVar7 = func_0x00729b5c(), (int)uVar7 != 0)) goto LAB_0075a0c8;
      }
    }
    uVar7 = func_0x00729b5c();
LAB_0075a0c8:
    func_0x00779fa4(in_stack_00000030);
    if (unaff_x23 != 0) goto LAB_00759ee4;
  }
  else {
    func_0x0073c9e4();
    uVar7 = 0x2a;
    func_0x00779fa4(in_stack_00000030);
LAB_00759ee4:
    if ((*(char *)(unaff_x23 + 0xa1d) < '\0') &&
       (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x23 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x23 + 0x18) + 8))) && (0 < iRam0000000000a2b550)))) {
      func_0x0073cd4c();
    }
  }
  if ((int)uVar7 != 0) goto LAB_00759f68;
  lVar6 = unaff_x28 + 0x20;
  uVar5 = func_0x007298e4(lVar6);
  if ((uVar5 & 1) == 0) {
    uVar7 = func_0x00729f70(lVar6);
    if ((int)uVar7 != 0) goto LAB_00759f68;
    if ((*(byte *)(unaff_x28 + 0x60) & 1) != 0) {
      iVar3 = func_0x007298e4(lVar6);
      uVar7 = 0;
      if (iVar3 != 0) {
        *(byte *)(unaff_x28 + 0x60) = *(byte *)(unaff_x28 + 0x60) | 2;
        *unaff_x19 = 1;
      }
      goto LAB_00759f68;
    }
  }
  uVar7 = 0;
LAB_00759f68:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return uVar7;
  }
  ___stack_chk_fail();
  lVar6 = *(long *)(extraout_x1 + 0x10);
  plVar1 = (long *)(lVar6 + 0x20);
  plVar4 = (long *)*plVar1;
  while (plVar4 != (long *)0x0) {
    *plVar1 = *plVar4;
    (*pcRam0000000000a2b5f0)();
    plVar4 = (long *)*plVar1;
  }
  while (*(undefined8 **)(lVar6 + 0x30) != (undefined8 *)0x0) {
    *(undefined8 *)(lVar6 + 0x30) = **(undefined8 **)(lVar6 + 0x30);
    (*pcRam0000000000a2b5f0)();
  }
  *(undefined8 *)(lVar6 + 0x28) = 0;
  *(undefined8 *)(lVar6 + 0x40) = 0;
  return 0;
}

