
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_0077f758(char *param_1)

{
  byte bVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  uint *puVar5;
  undefined8 uVar6;
  byte *pbVar7;
  int *piVar8;
  char *pcVar9;
  char *in_x9;
  long unaff_x19;
  long unaff_x22;
  int *unaff_x23;
  long lVar10;
  long unaff_x24;
  undefined4 *unaff_x25;
  uint uVar12;
  uint uVar11;
  char *unaff_x26;
  uint unaff_w27;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar13 [16];
  char *pcStack0000000000000000;
  char *pcStack0000000000000008;
  char *pcStack0000000000000010;
  undefined4 *in_stack_00000020;
  byte *in_stack_00000028;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
  int *in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000058;
  undefined1 uStack0000000000000060;
  
code_r0x0077f758:
  pcStack0000000000000008 = param_1 + 0x1a1;
  pcStack0000000000000010 = in_x9;
LAB_0077fab0:
  pcStack0000000000000000 = "RCVD";
  func_0x0073cab8();
code_r0x0077fab4:
  *unaff_x25 = 1;
  lVar4 = *(long *)(unaff_x19 + 0x1b0) + (long)unaff_x26 * 4;
  piVar8 = (int *)(lVar4 + 8);
  iVar3 = *piVar8;
  uVar11 = (uint)unaff_x26;
  if (iVar3 == 3) {
    iVar3 = *(int *)(lVar4 + 0x408);
    if (iVar3 != 1) goto joined_r0x0077f950;
    *piVar8 = 2;
    *(undefined4 *)(lVar4 + 0x408) = 0;
    uStack0000000000000058._5_2_ = 0xfbff;
    uStack0000000000000058._7_1_ = (byte)unaff_x26;
    lVar4 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                  (long)&uStack0000000000000058 + 5,3,0x80000);
    if (lVar4 < 0) {
      puVar5 = (uint *)___error();
      pcStack0000000000000000 = (char *)(ulong)*puVar5;
      func_0x0073c9e4();
    }
    if (-1 < *(char *)(in_stack_00000040 + 3)) goto code_r0x0077f3c0;
    if (uVar11 < 0x28) {
      pcVar9 = *(char **)(&UNK_00a1fe40 + (long)unaff_x26 * 8);
    }
    else {
      pcVar9 = "EXOPL";
      if (uVar11 != 0xff) {
        if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) != 0) &&
           (*(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8) < 1)) goto code_r0x0077f3c0;
        pcStack0000000000000008 = "WILL";
        goto code_r0x007801d4;
      }
    }
    if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) != 0) &&
       (*(int *)(*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) + 8) < 1)) goto code_r0x0077f3c0;
    pcStack0000000000000008 = "WILL";
    pcStack0000000000000010 = pcVar9;
  }
  else {
    if (iVar3 == 2) {
      lVar4 = *(long *)(unaff_x19 + 0x1b0) + (long)unaff_x26 * 4;
      iVar3 = *(int *)(lVar4 + 0x408);
      if (iVar3 != 1) goto joined_r0x0077f950;
      pcVar9 = (char *)(lVar4 + 0x408);
      goto code_r0x0077fed4;
    }
    if (iVar3 != 1) goto code_r0x0077f3c0;
    *piVar8 = 0;
    uStack0000000000000058._5_2_ = 0xfcff;
    uStack0000000000000058._7_1_ = (byte)unaff_x26;
    lVar4 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                  (long)&uStack0000000000000058 + 5,3,0x80000);
    if (lVar4 < 0) {
      puVar5 = (uint *)___error();
      pcStack0000000000000000 = (char *)(ulong)*puVar5;
      func_0x0073c9e4();
    }
    if (-1 < *(char *)(in_stack_00000040 + 3)) goto code_r0x0077f3c0;
    if (uVar11 < 0x28) {
      pcVar9 = *(char **)(&UNK_00a1fe40 + (long)unaff_x26 * 8);
    }
    else {
      pcVar9 = "EXOPL";
      if (uVar11 != 0xff) {
        if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) != 0) &&
           (*(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8) < 1)) goto code_r0x0077f3c0;
        pcStack0000000000000008 = "WONT";
        goto code_r0x007801d4;
      }
    }
    if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) != 0) &&
       (*(int *)(*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) + 8) < 1)) goto code_r0x0077f3c0;
    pcStack0000000000000008 = "WONT";
    pcStack0000000000000010 = pcVar9;
  }
code_r0x007800a0:
  pcStack0000000000000000 = "SENT";
  func_0x0073cab8();
code_r0x0077f3c0:
  unaff_x25[0x707] = 0;
code_r0x0077f3c4:
  do {
    unaff_x22 = unaff_x22 + 1;
    if (unaff_x28 == unaff_x22) {
      if (in_stack_00000038._4_4_ < 0) goto code_r0x0078027c;
      uVar6 = func_0x007738a0();
      if ((int)uVar6 == 0) goto code_r0x0078027c;
      iVar3 = *(int *)(unaff_x19 + 0x998);
      goto joined_r0x0078039c;
    }
code_r0x0077f3d0:
  } while (8 < (uint)unaff_x25[0x707]);
  bVar1 = (&uStack0000000000000060)[unaff_x22];
  unaff_x26 = (char *)(ulong)bVar1;
  uVar11 = (uint)bVar1;
  uVar12 = (uint)bVar1;
  switch(unaff_x25[0x707]) {
  case 0:
    if (bVar1 == 0xd) {
      unaff_x25[0x707] = 6;
    }
    else if (bVar1 == 0xff) {
      unaff_x25[0x707] = 1;
      goto code_r0x0077f4c0;
    }
    break;
  case 1:
code_r0x0077fcb0:
    switch(uVar12) {
    case 0xfa:
      *(undefined4 **)(unaff_x25 + 0x792) = in_stack_00000020;
      goto code_r0x0077fcdc;
    case 0xfb:
      unaff_x25[0x707] = 2;
      goto code_r0x0077f3c4;
    case 0xfc:
      unaff_x25[0x707] = 3;
      goto code_r0x0077f3c4;
    case 0xfd:
      unaff_x25[0x707] = 4;
      goto code_r0x0077f3c4;
    case 0xfe:
      unaff_x25[0x707] = 5;
      goto code_r0x0077f3c4;
    case 0xff:
      unaff_x25[0x707] = 0;
      break;
    default:
      unaff_x25[0x707] = 0;
      if (*(char *)(in_stack_00000040 + 3) < '\0') {
        lVar4 = *(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18);
        if (uVar12 - 0xec < 0x14) {
          if ((lVar4 == 0) || (0 < *(int *)(lVar4 + 8))) {
            pcStack0000000000000008 = *(char **)(&UNK_00a1fda0 + (ulong)(uVar12 - 0xec) * 8);
            pcStack0000000000000000 = "RCVD";
            func_0x0073cab8();
          }
        }
        else if ((lVar4 == 0) || (0 < *(int *)(lVar4 + 8))) {
          pcStack0000000000000000 = "RCVD";
          pcStack0000000000000008 = unaff_x26;
          func_0x0073cab8();
        }
      }
      goto code_r0x0077f3c4;
    }
    break;
  case 2:
    goto code_r0x0077f418;
  case 3:
    if (*(char *)(in_stack_00000040 + 3) < '\0') {
      if (uVar12 < 0x28) {
        pcVar9 = *(char **)(&UNK_00a1fe40 + (long)unaff_x26 * 8);
        lVar4 = *(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18);
code_r0x0077f6ac:
        if ((lVar4 != 0) && (*(int *)(lVar4 + 8) < 1)) goto code_r0x0077f880;
        pcStack0000000000000010 = pcVar9;
      }
      else {
        lVar4 = *(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18);
        if (uVar12 == 0xff) {
          pcVar9 = "EXOPL";
          goto code_r0x0077f6ac;
        }
        if ((lVar4 != 0) && (*(int *)(lVar4 + 8) < 1)) goto code_r0x0077f880;
        pcStack0000000000000010 = unaff_x26;
      }
      pcStack0000000000000008 = "WONT";
      pcStack0000000000000000 = "RCVD";
      func_0x0073cab8();
    }
code_r0x0077f880:
    *unaff_x25 = 1;
    lVar4 = *(long *)(unaff_x19 + 0x1b0) + (long)unaff_x26 * 4;
    piVar8 = (int *)(lVar4 + 0xc08);
    iVar3 = *(int *)(lVar4 + 0xc08);
    if (iVar3 == 3) {
      iVar3 = *(int *)(
                      "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                      + lVar4 + 0x18);
      if (iVar3 != 1) goto joined_r0x0077f950;
      pcVar9 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation" +
               lVar4 + 0x18;
      *piVar8 = 2;
      pcVar9[0] = '\0';
      pcVar9[1] = '\0';
      pcVar9[2] = '\0';
      pcVar9[3] = '\0';
code_r0x0077f8d8:
      uStack0000000000000058._5_2_ = 0xfdff;
      uStack0000000000000058._7_1_ = bVar1;
      lVar4 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                    (long)&uStack0000000000000058 + 5,3,0x80000);
      if (lVar4 < 0) {
        puVar5 = (uint *)___error();
        pcStack0000000000000000 = (char *)(ulong)*puVar5;
        func_0x0073c9e4();
      }
      if (-1 < *(char *)(in_stack_00000040 + 3)) goto code_r0x0077f3c0;
      if (uVar12 < 0x28) {
        pcVar9 = *(char **)(&UNK_00a1fe40 + (long)unaff_x26 * 8);
code_r0x0077ff44:
        if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) != 0) &&
           (*(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8) < 1)) goto code_r0x0077f3c0;
        pcStack0000000000000008 = "DO";
        pcStack0000000000000010 = pcVar9;
        goto code_r0x007800a0;
      }
      pcVar9 = "EXOPL";
      if (uVar12 == 0xff) goto code_r0x0077ff44;
      if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) != 0) &&
         (*(int *)(*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) + 8) < 1)) goto code_r0x0077f3c0;
      pcStack0000000000000008 = "DO";
code_r0x007801d4:
      pcStack0000000000000000 = "SENT";
      pcStack0000000000000010 = unaff_x26;
      func_0x0073cab8();
    }
    else {
      if (iVar3 != 2) {
        if (iVar3 != 1) goto code_r0x0077f3c0;
        *piVar8 = 0;
        goto code_r0x0077fda0;
      }
      lVar4 = *(long *)(unaff_x19 + 0x1b0) + (long)unaff_x26 * 4;
      iVar3 = *(int *)(
                      "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                      + lVar4 + 0x18);
      if (iVar3 == 1) {
        pcVar9 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation" +
                 lVar4 + 0x18;
code_r0x0077fed4:
        *piVar8 = 0;
        pcVar9[0] = '\0';
        pcVar9[1] = '\0';
        pcVar9[2] = '\0';
        pcVar9[3] = '\0';
      }
      else {
joined_r0x0077f950:
        if (iVar3 == 0) {
          *piVar8 = 0;
        }
      }
    }
    goto code_r0x0077f3c0;
  case 4:
    if (*(char *)(in_stack_00000040 + 3) < '\0') {
      if (uVar11 < 0x28) {
        pcVar9 = *(char **)(&UNK_00a1fe40 + (long)unaff_x26 * 8);
        lVar4 = *(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18);
code_r0x0077f6f8:
        if ((lVar4 != 0) && (*(int *)(lVar4 + 8) < 1)) goto code_r0x0077f994;
        pcStack0000000000000010 = pcVar9;
      }
      else {
        lVar4 = *(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18);
        if (uVar11 == 0xff) {
          pcVar9 = "EXOPL";
          goto code_r0x0077f6f8;
        }
        if ((lVar4 != 0) && (*(int *)(lVar4 + 8) < 1)) goto code_r0x0077f994;
        pcStack0000000000000010 = unaff_x26;
      }
      pcStack0000000000000008 = "DO";
      pcStack0000000000000000 = "RCVD";
      func_0x0073cab8();
    }
code_r0x0077f994:
    *unaff_x25 = 1;
    lVar10 = *(long *)(unaff_x19 + 0x1b0);
    lVar4 = lVar10 + (long)unaff_x26 * 4;
    piVar8 = (int *)(lVar4 + 8);
    iVar3 = *piVar8;
    if (iVar3 == 3) {
      if (*(int *)(lVar4 + 0x408) == 1) {
        *piVar8 = 1;
        *(undefined4 *)(lVar4 + 0x408) = 0;
      }
      else if (*(int *)(lVar4 + 0x408) == 0) {
        *piVar8 = 0;
      }
      goto code_r0x007801ac;
    }
    if (iVar3 == 2) {
      lVar4 = lVar10 + (long)unaff_x26 * 4;
      iVar3 = *(int *)(lVar4 + 0x408);
      if (iVar3 == 1) {
        *piVar8 = 3;
        pcVar9 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation" +
                 lVar4 + 0x18;
        pcVar9[0] = '\0';
        pcVar9[1] = '\0';
        pcVar9[2] = '\0';
        pcVar9[3] = '\0';
code_r0x0077fe68:
        uStack0000000000000058._5_2_ = 0xfcff;
        uStack0000000000000058._7_1_ = bVar1;
        lVar4 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                      (long)&uStack0000000000000058 + 5,3,0x80000);
        if (lVar4 < 0) {
          puVar5 = (uint *)___error();
          pcStack0000000000000000 = (char *)(ulong)*puVar5;
          func_0x0073c9e4();
        }
        if (*(char *)(in_stack_00000040 + 3) < '\0') {
          if (uVar12 < 0x28) {
            pcVar9 = *(char **)(&UNK_00a1fe40 + (long)unaff_x26 * 8);
code_r0x0077ffa8:
            if ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) != 0) &&
               (*(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8) < 1)) goto code_r0x007801ac;
            pcStack0000000000000010 = pcVar9;
          }
          else {
            pcVar9 = "EXOPL";
            if (uVar12 == 0xff) goto code_r0x0077ffa8;
            if ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) != 0) &&
               (*(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8) < 1)) goto code_r0x007801ac;
            pcStack0000000000000010 = unaff_x26;
          }
          pcStack0000000000000008 = "WONT";
          pcStack0000000000000000 = "SENT";
          func_0x0073cab8();
        }
      }
      else if (iVar3 == 0) {
        *piVar8 = 1;
        goto code_r0x00780190;
      }
    }
    else {
      if (iVar3 != 0) goto code_r0x007801ac;
      lVar4 = lVar10 + (long)unaff_x26 * 4;
      if (*(int *)(lVar4 + 0x808) == 1) {
        *piVar8 = 1;
        uStack0000000000000058._5_2_ = 0xfbff;
        uStack0000000000000058._7_1_ = bVar1;
        lVar4 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                      (long)&uStack0000000000000058 + 5,3,0x80000);
        if (lVar4 < 0) {
          puVar5 = (uint *)___error();
          pcStack0000000000000000 = (char *)(ulong)*puVar5;
          func_0x0073c9e4();
        }
        if (*(char *)(in_stack_00000040 + 3) < '\0') {
          if (uVar12 < 0x28) {
            pcVar9 = *(char **)(&UNK_00a1fe40 + (long)unaff_x26 * 8);
code_r0x0077fff4:
            if ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) != 0) &&
               (*(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8) < 1)) goto code_r0x00780190;
            pcStack0000000000000010 = pcVar9;
          }
          else {
            pcVar9 = "EXOPL";
            if (uVar11 == 0xff) goto code_r0x0077fff4;
            if ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) != 0) &&
               (*(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8) < 1)) goto code_r0x00780190;
            pcStack0000000000000010 = unaff_x26;
          }
          pcStack0000000000000008 = "WILL";
          pcStack0000000000000000 = "SENT";
          func_0x0073cab8();
        }
code_r0x00780190:
        if (*(int *)(&UNK_00001808 + lVar10 + (long)unaff_x26 * 4) != 1) goto code_r0x007801ac;
      }
      else {
        if (*(int *)(&UNK_00001808 + lVar4) != 1) goto code_r0x0077fe68;
        *piVar8 = 1;
        uStack0000000000000058._5_2_ = 0xfbff;
        uStack0000000000000058._7_1_ = bVar1;
        lVar4 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                      (long)&uStack0000000000000058 + 5,3,0x80000);
        if (lVar4 < 0) {
          puVar5 = (uint *)___error();
          pcStack0000000000000000 = (char *)(ulong)*puVar5;
          func_0x0073c9e4();
        }
        if (*(char *)(in_stack_00000040 + 3) < '\0') {
          if (uVar12 < 0x28) {
            pcVar9 = *(char **)(&UNK_00a1fe40 + (long)unaff_x26 * 8);
          }
          else {
            pcVar9 = "EXOPL";
            if (uVar12 != 0xff) {
              if ((*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) == 0) ||
                 (0 < *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + unaff_x19 + 0x18) + 8))) {
                pcStack0000000000000000 = "SENT";
                pcStack0000000000000008 = "WILL";
                pcStack0000000000000010 = unaff_x26;
                func_0x0073cab8();
              }
              goto code_r0x007801a0;
            }
          }
          if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) == 0) ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8))) {
            pcStack0000000000000000 = "SENT";
            pcStack0000000000000008 = "WILL";
            pcStack0000000000000010 = pcVar9;
            func_0x0073cab8();
          }
        }
      }
code_r0x007801a0:
      func_0x00780b18();
    }
code_r0x007801ac:
    unaff_x25[0x707] = 0;
    unaff_x23 = in_stack_00000048;
    goto code_r0x0077f3c4;
  case 5:
    if (-1 < *(char *)(in_stack_00000040 + 3)) goto code_r0x0077fab4;
    if (uVar11 < 0x28) {
      in_x9 = *(char **)(&UNK_00a1fe40 + (long)unaff_x26 * 8);
      lVar4 = *(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18);
    }
    else {
      lVar4 = *(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18);
      if (uVar11 != 0xff) {
        if ((lVar4 != 0) && (*(int *)(lVar4 + 8) < 1)) goto code_r0x0077fab4;
        pcStack0000000000000008 = "DONT";
        pcStack0000000000000010 = unaff_x26;
        goto LAB_0077fab0;
      }
      in_x9 = "EXOPL";
    }
    if ((lVar4 != 0) && (*(int *)(lVar4 + 8) < 1)) goto code_r0x0077fab4;
    param_1 = "Unsupported number of slashes following scheme";
    goto code_r0x0077f758;
  case 6:
    unaff_x25[0x707] = 0;
    if (uVar11 != 0) break;
code_r0x0077f4c0:
    if ((-1 < in_stack_00000038._4_4_) && (uVar6 = func_0x007738a0(), (int)uVar6 != 0)) {
      iVar3 = *(int *)(unaff_x19 + 0x998);
joined_r0x0078039c:
      do {
        bVar2 = false;
        unaff_x28 = in_stack_00000050;
joined_r0x0078039c:
        if (iVar3 != 0) {
          auVar13 = func_0x00782d28();
          lVar4 = func_0x00782dc4(auVar13._0_8_,auVar13._8_8_,*(undefined8 *)(unaff_x24 + 0x218),
                                  *(undefined8 *)(unaff_x24 + 0x220));
          if ((long)(ulong)*(uint *)(unaff_x19 + 0x998) <= lVar4) {
            func_0x0073c9e4();
            bVar2 = false;
            uVar6 = 0x1c;
          }
        }
        iVar3 = func_0x0077011c();
        if (iVar3 != 0) {
          uVar6 = 0x2a;
code_r0x007803a8:
          func_0x00783c98();
          if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
            return uVar6;
          }
          lVar4 = ___stack_chk_fail();
          lVar4 = *(long *)(lVar4 + 0x1b0);
          if (lVar4 != 0) {
            func_0x00779fa4(*(undefined8 *)(&UNK_00001c20 + lVar4));
            *(undefined8 *)(&UNK_00001c20 + lVar4) = 0;
            func_0x00740678(&UNK_00001c28 + lVar4);
          }
          return 0;
        }
        if (!bVar2) goto code_r0x007803a8;
        iVar3 = func_0x007733c8(unaff_x29 + -0x70);
        if (iVar3 == 0) {
          *(undefined2 *)(unaff_x29 + -0x6a) = 0;
          *(undefined2 *)(unaff_x29 + -0x62) = 0;
          goto joined_r0x0077f2f4;
        }
        if (iVar3 == -1) goto code_r0x007803a8;
        if ((*(ushort *)(unaff_x29 + -0x6a) & 1) == 0) {
joined_r0x0077f2f4:
          if ((unaff_w27 >> 4 & 1) == 0) {
            in_stack_00000050 = 0;
            if ((*(ushort *)(unaff_x29 + -0x62) & 1) != 0) {
              in_stack_00000050 =
                   _read(*(undefined4 *)(unaff_x29 + -0x68),&uStack0000000000000060,0x1000);
code_r0x007802f0:
              if (0 < in_stack_00000050) {
                uVar6 = func_0x007806b0();
                if ((int)uVar6 != 0) goto code_r0x0078030c;
                func_0x00770948();
                goto code_r0x00780344;
              }
            }
            bVar2 = in_stack_00000050 == 0;
            iVar3 = *(int *)(unaff_x19 + 0x998);
            unaff_x28 = in_stack_00000050;
          }
          else {
            iVar3 = (**(code **)(
                                "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                                + unaff_x19 + 0x38))
                              (&uStack0000000000000060,1,0x1000,
                               *(undefined8 *)
                                (
                                "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                                + unaff_x19 + 0x40));
            in_stack_00000050 = (long)iVar3;
            if (iVar3 == 0x10000000) {
code_r0x0078030c:
              bVar2 = false;
              iVar3 = *(int *)(unaff_x19 + 0x998);
              unaff_x28 = in_stack_00000050;
            }
            else {
              if (iVar3 != 0x10000001) goto code_r0x007802f0;
code_r0x00780344:
              bVar2 = true;
              iVar3 = *(int *)(unaff_x19 + 0x998);
              unaff_x28 = in_stack_00000050;
            }
          }
          goto joined_r0x0078039c;
        }
        uVar6 = func_0x00784250();
        if ((int)uVar6 != 0) {
          bVar2 = (int)uVar6 == 0x51;
          iVar3 = *(int *)(unaff_x19 + 0x998);
          goto joined_r0x0078039c;
        }
        if (unaff_x28 < 1) {
          bVar2 = false;
          uVar6 = 0;
          iVar3 = *(int *)(unaff_x19 + 0x998);
          goto joined_r0x0078039c;
        }
        uVar6 = func_0x0077093c();
        in_stack_00000050 = unaff_x28;
        if ((int)uVar6 == 0) {
          if (unaff_x28 == 0) {
code_r0x0078027c:
            if ((*unaff_x23 != 0) && (unaff_x23[1] == 0)) {
              func_0x0078043c();
              unaff_x23[1] = 1;
            }
            uVar6 = 0;
            goto joined_r0x0077f2f4;
          }
          unaff_x22 = 0;
          unaff_x25 = *(undefined4 **)(unaff_x19 + 0x1b0);
          in_stack_00000028 = (byte *)(unaff_x25 + 0x792);
          in_stack_00000020 = unaff_x25 + 0x712;
          in_stack_00000038._4_4_ = -1;
          goto code_r0x0077f3d0;
        }
        iVar3 = *(int *)(unaff_x19 + 0x998);
      } while( true );
    }
    in_stack_00000038._4_4_ = -1;
    goto code_r0x0077f3c4;
  case 7:
    goto code_r0x0077f4f4;
  case 8:
    if (uVar11 == 0xf0) {
      pbVar7 = *(byte **)in_stack_00000028;
      if (pbVar7 < in_stack_00000028) {
        *(byte **)in_stack_00000028 = pbVar7 + 1;
        *pbVar7 = 0xff;
        pbVar7 = *(byte **)in_stack_00000028;
      }
      if (pbVar7 < in_stack_00000028) {
        *(byte **)in_stack_00000028 = pbVar7 + 1;
        *pbVar7 = 0xf0;
        pbVar7 = *(byte **)in_stack_00000028;
      }
      *(byte **)(unaff_x25 + 0x794) = pbVar7 + -2;
      *(undefined4 **)(unaff_x25 + 0x792) = in_stack_00000020;
      func_0x00780868();
      goto code_r0x0077f3c0;
    }
    if (uVar11 != 0xff) {
      pbVar7 = *(byte **)in_stack_00000028;
      if (pbVar7 < in_stack_00000028) {
        *(byte **)in_stack_00000028 = pbVar7 + 1;
        *pbVar7 = 0xff;
        pbVar7 = *(byte **)in_stack_00000028;
      }
      if (pbVar7 < in_stack_00000028) {
        *(byte **)in_stack_00000028 = pbVar7 + 1;
        *pbVar7 = bVar1;
        pbVar7 = *(byte **)in_stack_00000028;
      }
      *(byte **)(unaff_x25 + 0x794) = pbVar7 + -2;
      *(undefined4 **)(unaff_x25 + 0x792) = in_stack_00000020;
      if (*(char *)(in_stack_00000040 + 3) < '\0') {
        lVar4 = *(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18);
        if (uVar11 - 0xec < 0x14) {
          if ((lVar4 == 0) || (0 < *(int *)(lVar4 + 8))) {
            pcStack0000000000000008 = *(char **)(&UNK_00a1fda0 + (ulong)(uVar11 - 0xec) * 8);
code_r0x0077fc9c:
            pcStack0000000000000000 = "In SUBOPTION processing, RCVD";
            func_0x0073cab8();
          }
        }
        else if ((lVar4 == 0) || (0 < *(int *)(lVar4 + 8))) {
          pcStack0000000000000008 = unaff_x26;
          goto code_r0x0077fc9c;
        }
      }
      func_0x00780868();
      unaff_x25[0x707] = 1;
      goto code_r0x0077fcb0;
    }
    pbVar7 = *(byte **)in_stack_00000028;
    if (pbVar7 < in_stack_00000028) {
      *(byte **)in_stack_00000028 = pbVar7 + 1;
      *pbVar7 = 0xff;
    }
code_r0x0077fcdc:
    unaff_x25[0x707] = 7;
    goto code_r0x0077f3c4;
  }
  iVar3 = (int)unaff_x22;
  if (-1 < in_stack_00000038._4_4_) {
    iVar3 = in_stack_00000038._4_4_;
  }
  in_stack_00000038._4_4_ = iVar3;
  goto code_r0x0077f3c4;
code_r0x0077f4f4:
  if (uVar11 == 0xff) {
    unaff_x25[0x707] = 8;
  }
  else {
    pbVar7 = *(byte **)in_stack_00000028;
    if (pbVar7 < in_stack_00000028) {
      *(byte **)in_stack_00000028 = pbVar7 + 1;
      *pbVar7 = bVar1;
    }
  }
  goto code_r0x0077f3c4;
code_r0x0077f418:
  if (*(char *)(in_stack_00000040 + 3) < '\0') {
    if (uVar12 < 0x28) {
      pcVar9 = *(char **)(&UNK_00a1fe40 + (long)unaff_x26 * 8);
      lVar4 = *(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18);
code_r0x0077f660:
      if ((lVar4 != 0) && (*(int *)(lVar4 + 8) < 1)) goto code_r0x0077f7b8;
      pcStack0000000000000010 = pcVar9;
    }
    else {
      lVar4 = *(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18);
      if (uVar12 == 0xff) {
        pcVar9 = "EXOPL";
        goto code_r0x0077f660;
      }
      if ((lVar4 != 0) && (*(int *)(lVar4 + 8) < 1)) goto code_r0x0077f7b8;
      pcStack0000000000000010 = unaff_x26;
    }
    pcStack0000000000000008 = "WILL";
    pcStack0000000000000000 = "RCVD";
    func_0x0073cab8();
  }
code_r0x0077f7b8:
  *unaff_x25 = 1;
  lVar10 = *(long *)(unaff_x19 + 0x1b0);
  lVar4 = lVar10 + (long)unaff_x26 * 4;
  piVar8 = (int *)(lVar4 + 0xc08);
  iVar3 = *(int *)(lVar4 + 0xc08);
  if (iVar3 == 3) {
    iVar3 = *(int *)("/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                    + lVar4 + 0x18);
    if (iVar3 != 1) goto joined_r0x0077f950;
    pcVar9 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation" +
             lVar4 + 0x18;
    *piVar8 = 1;
    pcVar9[0] = '\0';
    pcVar9[1] = '\0';
    pcVar9[2] = '\0';
    pcVar9[3] = '\0';
    goto code_r0x0077f3c0;
  }
  if (iVar3 != 2) {
    if (iVar3 == 0) {
      if (*(int *)(&UNK_00001408 + lVar10 + (long)unaff_x26 * 4) == 1) {
        *piVar8 = 1;
        goto code_r0x0077f8d8;
      }
      goto code_r0x0077fda0;
    }
    goto code_r0x0077f3c0;
  }
  lVar10 = lVar10 + (long)unaff_x26 * 4;
  if (*(int *)("/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation" +
              lVar10 + 0x18) != 1) {
    if (*(int *)("/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation" +
                lVar10 + 0x18) == 0) {
      *piVar8 = 1;
    }
    goto code_r0x0077f3c0;
  }
  pcVar9 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation" +
           lVar10 + 0x18;
  *piVar8 = 3;
  pcVar9[0] = '\0';
  pcVar9[1] = '\0';
  pcVar9[2] = '\0';
  pcVar9[3] = '\0';
code_r0x0077fda0:
  uStack0000000000000058._5_2_ = 0xfeff;
  uStack0000000000000058._7_1_ = bVar1;
  lVar4 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                (long)&uStack0000000000000058 + 5,3,0x80000);
  if (lVar4 < 0) {
    puVar5 = (uint *)___error();
    pcStack0000000000000000 = (char *)(ulong)*puVar5;
    func_0x0073c9e4();
  }
  if (-1 < *(char *)(in_stack_00000040 + 3)) goto code_r0x0077f3c0;
  if (uVar12 < 0x28) {
    pcVar9 = *(char **)(&UNK_00a1fe40 + (long)unaff_x26 * 8);
  }
  else {
    pcVar9 = "EXOPL";
    if (uVar11 != 0xff) {
      if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) != 0) &&
         (*(int *)(*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) + 8) < 1)) goto code_r0x0077f3c0;
      pcStack0000000000000008 = "DONT";
      goto code_r0x007801d4;
    }
  }
  if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) != 0) &&
     (*(int *)(*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) + 8) < 1)) goto code_r0x0077f3c0;
  pcStack0000000000000008 = "DONT";
  pcStack0000000000000010 = pcVar9;
  goto code_r0x007800a0;
}

