
undefined8 FUN_0077a23c(undefined8 param_1)

{
  char cVar1;
  byte bVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  ulong uVar6;
  char *pcVar7;
  long unaff_x19;
  char *unaff_x20;
  long lVar8;
  undefined8 uVar9;
  undefined8 *puVar10;
  long lVar11;
  long unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x27;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  undefined1 *in_stack_00000040;
  undefined8 in_stack_00000048;
  
  in_stack_00000040 = (undefined1 *)_strchr(param_1,0x40);
  if (in_stack_00000040 != (undefined1 *)0x0) {
    *in_stack_00000040 = 0;
    in_stack_00000040 = in_stack_00000040 + 1;
    func_0x0075af14(&uStack0000000000000030);
  }
  if ((*(byte *)(unaff_x27 + 0x4b8) >> 3 & 1) == 0) {
    uVar4 = 0;
  }
  else if ((in_stack_00000038 == 0) && (iVar3 = func_0x0075aee4(), iVar3 != 0)) {
    uVar4 = func_0x0075aee4(in_stack_00000040);
    uVar4 = uVar4 ^ 1;
  }
  else {
    uVar4 = 1;
  }
  if (in_stack_00000040 == (undefined1 *)0x0) {
    lVar5 = func_0x00764704("<%s>");
    (*(code *)*unaff_x26)();
    if (lVar5 != 0) goto code_r0x0077a358;
code_r0x0077a3fc:
    lVar8 = 0;
  }
  else {
    lVar5 = func_0x00764704("<%s@%s>");
    (*(code *)*unaff_x26)();
    if (lVar5 == 0) goto code_r0x0077a3fc;
code_r0x0077a358:
    pcVar7 = *(char **)(unaff_x19 + 0x898);
    if ((pcVar7 == (char *)0x0) || (*(short *)(unaff_x27 + 0x4a4) == 0)) {
      lVar8 = 0;
code_r0x0077a494:
      if (*(int *)(unaff_x19 + 0x348) == 0) {
        uVar9 = func_0x00774334();
        if ((int)uVar9 == 0) goto code_r0x0077a778;
      }
      else {
        *(uint *)(unaff_x19 + 0x34c) = *(uint *)(unaff_x19 + 0x34c) & 0xfffffffd;
        func_0x007600a8(unaff_x19 + 0x338,*(undefined8 *)(unaff_x19 + 0x328),0);
        uVar9 = func_0x00761020();
        if ((((int)uVar9 == 0) &&
            ((lVar11 = func_0x00782efc(), lVar11 != 0 ||
             (uVar9 = func_0x00760e1c(unaff_x19 + 0x380,"Mime-Version: 1.0"), (int)uVar9 == 0)))) &&
           (uVar9 = func_0x007616ac(), (int)uVar9 == 0)) {
          uVar9 = func_0x00774c24();
          *(undefined8 *)
           ("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
           unaff_x19 + 0x30) = uVar9;
code_r0x0077a778:
          bVar2 = *(byte *)(unaff_x27 + 0x4b8);
          if (((bVar2 >> 2 & 1) == 0) ||
             (*(long *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                       + unaff_x19 + 0x30) < 1)) {
            lVar11 = 0;
          }
          else {
            lVar11 = func_0x00764704("%ld");
            if (lVar11 == 0) {
              uVar9 = 0x1b;
              goto code_r0x0077a528;
            }
            bVar2 = *(byte *)(unaff_x27 + 0x4b8);
          }
          if ((bVar2 & 8) == 0) {
            uVar4 = 1;
          }
          if (((uVar4 & 1) == 0) &&
             (puVar10 = *(undefined8 **)(*(long *)(unaff_x19 + 0x1b0) + 0x10),
             puVar10 != (undefined8 *)0x0)) {
            do {
              uVar4 = func_0x0075aee4(*puVar10);
              puVar10 = (undefined8 *)puVar10[1];
              if (puVar10 == (undefined8 *)0x0) break;
            } while ((uVar4 & 1) != 0);
          }
          uStack0000000000000030 = 0;
          uVar9 = func_0x00774234(&uStack0000000000000030);
          if ((int)uVar9 == 0) {
            uVar9 = func_0x00774738();
          }
          if (((int)uVar9 == 0) || (uStack0000000000000030 == 0)) {
            if ((int)uVar9 == 0) {
              uVar9 = func_0x0076e34c();
            }
          }
          else {
            func_0x007742f4();
          }
          goto code_r0x0077a528;
        }
      }
      lVar11 = 0;
      goto code_r0x0077a528;
    }
    if (*pcVar7 == '\0') {
      lVar8 = (*pcRam0000000000a2b600)("<>");
    }
    else {
      in_stack_00000038 = 0;
      uStack0000000000000030 = 0;
      in_stack_00000048 = 0;
      in_stack_00000040 = (undefined1 *)0x0;
      if (*pcVar7 == '<') {
        pcVar7 = pcVar7 + 1;
      }
      lVar11 = (*pcRam0000000000a2b600)(pcVar7);
      if (lVar11 == 0) goto code_r0x0077a3fc;
      lVar8 = _strlen();
      if ((lVar8 != 0) && (*(char *)(lVar11 + lVar8 + -1) == '>')) {
        *(undefined1 *)(lVar11 + lVar8 + -1) = 0;
      }
      in_stack_00000040 = (undefined1 *)_strchr(lVar11,0x40);
      if (in_stack_00000040 != (undefined1 *)0x0) {
        *in_stack_00000040 = 0;
        in_stack_00000040 = in_stack_00000040 + 1;
        func_0x0075af14(&uStack0000000000000030);
      }
      if (((uVar4 & 1) == 0) &&
         (((*(byte *)(unaff_x27 + 0x4b8) >> 3 & 1) == 0 ||
          (((in_stack_00000038 == 0 && (iVar3 = func_0x0075aee4(lVar11), iVar3 != 0)) &&
           (uVar6 = func_0x0075aee4(in_stack_00000040), (uVar6 & 1) != 0)))))) {
        uVar4 = 0;
      }
      else {
        uVar4 = 1;
      }
      if (in_stack_00000040 == (undefined1 *)0x0) {
        pcVar7 = "<%s>";
      }
      else {
        pcVar7 = "<%s@%s>";
      }
      lVar8 = func_0x00764704(pcVar7);
      (*(code *)*unaff_x26)(lVar11);
    }
    if (lVar8 != 0) goto code_r0x0077a494;
  }
  lVar11 = 0;
  uVar9 = 0x1b;
code_r0x0077a528:
  (*(code *)*unaff_x26)(lVar5);
  (*(code *)*unaff_x26)(lVar8);
  (*(code *)*unaff_x26)(lVar11);
  if ((int)uVar9 == 0) {
    lVar5 = *(long *)(unaff_x19 + 0x18);
    if (((((unaff_x19 != 0) && (*(int *)(lVar5 + 0x4a8) != 8)) && (*(char *)(unaff_x25 + 3) < '\0'))
        && ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
      func_0x0073d0f4();
    }
    *(undefined4 *)(lVar5 + 0x4a8) = 8;
    lVar5 = *(long *)(unaff_x19 + 0x18);
    uVar9 = func_0x0076dfc0();
    *unaff_x20 = *(int *)(lVar5 + 0x4a8) == 0;
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
  if ((((int)uVar9 == 0) && (*unaff_x20 != '\0')) && (**(int **)(unaff_x19 + 0x1b0) != 0)) {
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
  return uVar9;
}

