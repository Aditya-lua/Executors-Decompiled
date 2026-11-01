
undefined8 FUN_0077a2ac(long param_1)

{
  char cVar1;
  byte bVar2;
  int iVar3;
  uint uVar4;
  ulong uVar5;
  char *pcVar6;
  long unaff_x19;
  char *unaff_x20;
  long lVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  long lVar10;
  long unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x27;
  bool bVar11;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  undefined1 *in_stack_00000040;
  undefined8 in_stack_00000048;
  
  bVar11 = false;
  if (param_1 == 0) {
LAB_0077a3fc:
    lVar7 = 0;
code_r0x0077a400:
    lVar10 = 0;
    uVar8 = 0x1b;
    goto code_r0x0077a528;
  }
  pcVar6 = *(char **)(unaff_x19 + 0x898);
  if ((pcVar6 == (char *)0x0) || (*(short *)(unaff_x27 + 0x4a4) == 0)) {
    lVar7 = 0;
  }
  else {
    if (*pcVar6 == '\0') {
      lVar7 = (*pcRam0000000000a2b600)("<>");
    }
    else {
      in_stack_00000038 = 0;
      uStack0000000000000030 = 0;
      in_stack_00000048 = 0;
      in_stack_00000040 = (undefined1 *)0x0;
      if (*pcVar6 == '<') {
        pcVar6 = pcVar6 + 1;
      }
      lVar10 = (*pcRam0000000000a2b600)(pcVar6);
      if (lVar10 == 0) goto LAB_0077a3fc;
      lVar7 = _strlen();
      if ((lVar7 != 0) && (*(char *)(lVar10 + lVar7 + -1) == '>')) {
        *(undefined1 *)(lVar10 + lVar7 + -1) = 0;
      }
      in_stack_00000040 = (undefined1 *)_strchr(lVar10,0x40);
      if (in_stack_00000040 != (undefined1 *)0x0) {
        *in_stack_00000040 = 0;
        in_stack_00000040 = in_stack_00000040 + 1;
        func_0x0075af14(&uStack0000000000000030);
      }
      if (((*(byte *)(unaff_x27 + 0x4b8) >> 3 & 1) == 0) ||
         (((in_stack_00000038 == 0 && (iVar3 = func_0x0075aee4(lVar10), iVar3 != 0)) &&
          (uVar5 = func_0x0075aee4(in_stack_00000040), (uVar5 & 1) != 0)))) {
        bVar11 = false;
      }
      else {
        bVar11 = true;
      }
      if (in_stack_00000040 == (undefined1 *)0x0) {
        pcVar6 = "<%s>";
      }
      else {
        pcVar6 = "<%s@%s>";
      }
      lVar7 = func_0x00764704(pcVar6);
      (*(code *)*unaff_x26)(lVar10);
    }
    if (lVar7 == 0) goto code_r0x0077a400;
  }
  if (*(int *)(unaff_x19 + 0x348) == 0) {
    uVar8 = func_0x00774334();
    if ((int)uVar8 == 0) goto code_r0x0077a778;
  }
  else {
    *(uint *)(unaff_x19 + 0x34c) = *(uint *)(unaff_x19 + 0x34c) & 0xfffffffd;
    func_0x007600a8(unaff_x19 + 0x338,*(undefined8 *)(unaff_x19 + 0x328),0);
    uVar8 = func_0x00761020();
    if ((((int)uVar8 == 0) &&
        ((lVar10 = func_0x00782efc(), lVar10 != 0 ||
         (uVar8 = func_0x00760e1c(unaff_x19 + 0x380,"Mime-Version: 1.0"), (int)uVar8 == 0)))) &&
       (uVar8 = func_0x007616ac(), (int)uVar8 == 0)) {
      uVar8 = func_0x00774c24();
      *(undefined8 *)
       ("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
       unaff_x19 + 0x30) = uVar8;
code_r0x0077a778:
      bVar2 = *(byte *)(unaff_x27 + 0x4b8);
      if (((bVar2 >> 2 & 1) == 0) ||
         (*(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
                   unaff_x19 + 0x30) < 1)) {
        lVar10 = 0;
      }
      else {
        lVar10 = func_0x00764704("%ld");
        if (lVar10 == 0) {
          uVar8 = 0x1b;
          goto code_r0x0077a528;
        }
        bVar2 = *(byte *)(unaff_x27 + 0x4b8);
      }
      if ((bVar2 & 8) == 0) {
        bVar11 = true;
      }
      if ((!bVar11) &&
         (puVar9 = *(undefined8 **)(*(long *)(unaff_x19 + 0x1b0) + 0x10),
         puVar9 != (undefined8 *)0x0)) {
        do {
          uVar4 = func_0x0075aee4(*puVar9);
          puVar9 = (undefined8 *)puVar9[1];
          if (puVar9 == (undefined8 *)0x0) break;
        } while ((uVar4 & 1) != 0);
      }
      uStack0000000000000030 = 0;
      uVar8 = func_0x00774234(&uStack0000000000000030);
      if ((int)uVar8 == 0) {
        uVar8 = func_0x00774738();
      }
      if (((int)uVar8 == 0) || (uStack0000000000000030 == 0)) {
        if ((int)uVar8 == 0) {
          uVar8 = func_0x0076e34c();
        }
      }
      else {
        func_0x007742f4();
      }
      goto code_r0x0077a528;
    }
  }
  lVar10 = 0;
code_r0x0077a528:
  (*(code *)*unaff_x26)(param_1);
  (*(code *)*unaff_x26)(lVar7);
  (*(code *)*unaff_x26)(lVar10);
  if ((int)uVar8 == 0) {
    lVar7 = *(long *)(unaff_x19 + 0x18);
    if (((((unaff_x19 != 0) && (*(int *)(lVar7 + 0x4a8) != 8)) && (*(char *)(unaff_x25 + 3) < '\0'))
        && ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
      func_0x0073d0f4();
    }
    *(undefined4 *)(lVar7 + 0x4a8) = 8;
    lVar7 = *(long *)(unaff_x19 + 0x18);
    uVar8 = func_0x0076dfc0();
    *unaff_x20 = *(int *)(lVar7 + 0x4a8) == 0;
    func_0x00731574(*(undefined8 *)(unaff_x19 + 0x18),0);
    cVar1 = *(char *)(unaff_x25 + 3);
  }
  else {
    cVar1 = *(char *)(unaff_x25 + 3);
  }
  if (((cVar1 < '\0') &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
    func_0x0073d0f4();
  }
  if ((((int)uVar8 == 0) && (*unaff_x20 != '\0')) && (**(int **)(unaff_x19 + 0x1b0) != 0)) {
    func_0x00783c98();
  }
  if (((*(char *)(unaff_x25 + 3) < '\0') &&
      (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) != 0 &&
        (*(int *)(*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) + 8) < 1)) ||
       ((iRam0000000000a2b580 < 1 || (func_0x0073d0f4(), *(char *)(unaff_x25 + 3) < '\0')))))) &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b580)))) {
    func_0x0073d0f4();
  }
  return uVar8;
}

