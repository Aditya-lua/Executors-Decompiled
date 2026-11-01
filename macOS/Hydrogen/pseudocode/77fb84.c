
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_0077fb84(ulong param_1,long param_2)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  byte *pbVar6;
  int *piVar7;
  char *pcVar8;
  long unaff_x19;
  long unaff_x22;
  long lVar9;
  int *unaff_x23;
  long unaff_x24;
  undefined4 *unaff_x25;
  uint uVar10;
  ulong unaff_x26;
  uint unaff_w27;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined4 *in_stack_00000020;
  byte *in_stack_00000028;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
  int *in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000058;
  undefined1 uStack0000000000000060;
  
code_r0x0077fb84:
  lVar4 = _send(param_1,param_2,3,0x80000);
  if (lVar4 < 0) {
    ___error();
    func_0x0073c9e4();
  }
  if (-1 < *(char *)(in_stack_00000040 + 3)) goto LAB_0077f3c0;
  if ((0x27 < (uint)unaff_x26) && ((uint)unaff_x26 != 0xff)) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) goto code_r0x007801d4;
    if (*(int *)(*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) + 8) < 1) goto LAB_0077f3c0;
    goto code_r0x007801d4;
  }
  if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
               unaff_x19 + 0x18) != 0) {
    iVar3 = *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8);
    goto joined_r0x00780090;
  }
code_r0x007800a0:
  do {
    func_0x0073cab8();
LAB_0077f3c0:
    do {
      unaff_x25[0x707] = 0;
code_r0x0077f3c4:
      do {
        unaff_x22 = unaff_x22 + 1;
        if (unaff_x28 == unaff_x22) {
          if (in_stack_00000038._4_4_ < 0) goto code_r0x0078027c;
          uVar5 = func_0x007738a0();
          if ((int)uVar5 == 0) goto code_r0x0078027c;
          iVar3 = *(int *)(unaff_x19 + 0x998);
          goto joined_r0x0078039c;
        }
code_r0x0077f3d0:
      } while (8 < (uint)unaff_x25[0x707]);
      bVar1 = (&uStack0000000000000060)[unaff_x22];
      unaff_x26 = (ulong)bVar1;
      uVar10 = (uint)bVar1;
      switch(unaff_x25[0x707]) {
      case 0:
        if (bVar1 == 0xd) {
          unaff_x25[0x707] = 6;
        }
        else if (bVar1 == 0xff) {
          unaff_x25[0x707] = 1;
          goto code_r0x0077f4c0;
        }
        goto code_r0x0077fd78;
      case 1:
code_r0x0077fcb0:
        switch(uVar10) {
        case 0xfa:
          *(undefined4 **)(unaff_x25 + 0x792) = in_stack_00000020;
          goto code_r0x0077fcdc;
        case 0xfb:
          unaff_x25[0x707] = 2;
          break;
        case 0xfc:
          unaff_x25[0x707] = 3;
          break;
        case 0xfd:
          unaff_x25[0x707] = 4;
          break;
        case 0xfe:
          unaff_x25[0x707] = 5;
          break;
        case 0xff:
          unaff_x25[0x707] = 0;
code_r0x0077fd78:
          iVar3 = (int)unaff_x22;
          if (-1 < in_stack_00000038._4_4_) {
            iVar3 = in_stack_00000038._4_4_;
          }
          in_stack_00000038._4_4_ = iVar3;
          break;
        default:
          unaff_x25[0x707] = 0;
          if (*(char *)(in_stack_00000040 + 3) < '\0') {
            lVar4 = *(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18);
            if (uVar10 - 0xec < 0x14) {
              if ((lVar4 == 0) || (0 < *(int *)(lVar4 + 8))) {
                func_0x0073cab8();
              }
            }
            else if ((lVar4 == 0) || (0 < *(int *)(lVar4 + 8))) {
              func_0x0073cab8();
            }
          }
        }
        goto code_r0x0077f3c4;
      case 2:
        if (*(char *)(in_stack_00000040 + 3) < '\0') {
          if (uVar10 < 0x28) {
            lVar4 = *(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18);
code_r0x0077f660:
            if (lVar4 != 0) {
              iVar3 = *(int *)(lVar4 + 8);
joined_r0x0077f788:
              if (iVar3 < 1) goto code_r0x0077f7b8;
            }
          }
          else {
            lVar4 = *(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18);
            if (uVar10 == 0xff) goto code_r0x0077f660;
            if (lVar4 != 0) {
              iVar3 = *(int *)(lVar4 + 8);
              goto joined_r0x0077f788;
            }
          }
          func_0x0073cab8();
        }
code_r0x0077f7b8:
        *unaff_x25 = 1;
        lVar9 = *(long *)(unaff_x19 + 0x1b0);
        lVar4 = lVar9 + unaff_x26 * 4;
        piVar7 = (int *)(lVar4 + 0xc08);
        iVar3 = *(int *)(lVar4 + 0xc08);
        if (iVar3 == 3) {
          iVar3 = *(int *)(
                          "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                          + lVar4 + 0x18);
          if (iVar3 == 1) {
            pcVar8 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                     + lVar4 + 0x18;
            *piVar7 = 1;
            pcVar8[0] = '\0';
            pcVar8[1] = '\0';
            pcVar8[2] = '\0';
            pcVar8[3] = '\0';
          }
          else {
joined_r0x0077f950:
            if (iVar3 == 0) {
              *piVar7 = 0;
            }
          }
          goto LAB_0077f3c0;
        }
        if (iVar3 == 2) {
          lVar9 = lVar9 + unaff_x26 * 4;
          if (*(int *)(
                      "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                      + lVar9 + 0x18) != 1) {
            if (*(int *)(
                        "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                        + lVar9 + 0x18) == 0) {
              *piVar7 = 1;
            }
            goto LAB_0077f3c0;
          }
          pcVar8 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation" +
                   lVar9 + 0x18;
          *piVar7 = 3;
          pcVar8[0] = '\0';
          pcVar8[1] = '\0';
          pcVar8[2] = '\0';
          pcVar8[3] = '\0';
        }
        else {
          if (iVar3 != 0) goto LAB_0077f3c0;
          if (*(int *)(&UNK_00001408 + lVar9 + unaff_x26 * 4) == 1) {
            *piVar7 = 1;
            goto code_r0x0077f8d8;
          }
        }
code_r0x0077fda0:
        uStack0000000000000058._5_2_ = 0xfeff;
        uStack0000000000000058._7_1_ = bVar1;
        lVar4 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                      (long)&uStack0000000000000058 + 5,3,0x80000);
        if (lVar4 < 0) {
          ___error();
          func_0x0073c9e4();
        }
        if (-1 < *(char *)(in_stack_00000040 + 3)) goto LAB_0077f3c0;
        if ((uVar10 < 0x28) || (bVar1 == 0xff)) {
          if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0) goto code_r0x007800a0;
          iVar3 = *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8);
          goto joined_r0x00780090;
        }
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0) goto code_r0x007801d4;
        iVar3 = *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8);
joined_r0x00780040:
        if (0 < iVar3) {
code_r0x007801d4:
          func_0x0073cab8();
        }
        goto LAB_0077f3c0;
      case 4:
        if (*(char *)(in_stack_00000040 + 3) < '\0') {
          if (bVar1 < 0x28) {
            lVar4 = *(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18);
code_r0x0077f6f8:
            if (lVar4 != 0) {
              iVar3 = *(int *)(lVar4 + 8);
joined_r0x0077f964:
              if (iVar3 < 1) goto code_r0x0077f994;
            }
          }
          else {
            lVar4 = *(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18);
            if (bVar1 == 0xff) goto code_r0x0077f6f8;
            if (lVar4 != 0) {
              iVar3 = *(int *)(lVar4 + 8);
              goto joined_r0x0077f964;
            }
          }
          func_0x0073cab8();
        }
code_r0x0077f994:
        *unaff_x25 = 1;
        lVar9 = *(long *)(unaff_x19 + 0x1b0);
        lVar4 = lVar9 + unaff_x26 * 4;
        piVar7 = (int *)(lVar4 + 8);
        iVar3 = *piVar7;
        if (iVar3 == 3) {
          if (*(int *)(lVar4 + 0x408) == 1) {
            *piVar7 = 1;
            *(undefined4 *)(lVar4 + 0x408) = 0;
          }
          else if (*(int *)(lVar4 + 0x408) == 0) {
            *piVar7 = 0;
          }
        }
        else if (iVar3 == 2) {
          lVar4 = lVar9 + unaff_x26 * 4;
          iVar3 = *(int *)(lVar4 + 0x408);
          if (iVar3 == 1) {
            *piVar7 = 3;
            pcVar8 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                     + lVar4 + 0x18;
            pcVar8[0] = '\0';
            pcVar8[1] = '\0';
            pcVar8[2] = '\0';
            pcVar8[3] = '\0';
code_r0x0077fe68:
            uStack0000000000000058._5_2_ = 0xfcff;
            uStack0000000000000058._7_1_ = bVar1;
            lVar4 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                          (long)&uStack0000000000000058 + 5,3,0x80000);
            if (lVar4 < 0) {
              ___error();
              func_0x0073c9e4();
            }
            if (*(char *)(in_stack_00000040 + 3) < '\0') {
              if ((uVar10 < 0x28) || (uVar10 == 0xff)) {
                if (*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) != 0) {
                  iVar3 = *(int *)(*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) + 8);
                  goto joined_r0x0077ffb8;
                }
              }
              else if (*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) != 0) {
                iVar3 = *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8);
joined_r0x0077ffb8:
                if (iVar3 < 1) goto code_r0x007801ac;
              }
              func_0x0073cab8();
            }
          }
          else if (iVar3 == 0) {
            *piVar7 = 1;
            goto code_r0x00780190;
          }
        }
        else if (iVar3 == 0) {
          lVar4 = lVar9 + unaff_x26 * 4;
          if (*(int *)(lVar4 + 0x808) == 1) {
            *piVar7 = 1;
            uStack0000000000000058._5_2_ = 0xfbff;
            uStack0000000000000058._7_1_ = bVar1;
            lVar4 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                          (long)&uStack0000000000000058 + 5,3,0x80000);
            if (lVar4 < 0) {
              ___error();
              func_0x0073c9e4();
            }
            if (-1 < *(char *)(in_stack_00000040 + 3)) goto code_r0x00780190;
            if ((uVar10 < 0x28) || (bVar1 == 0xff)) {
              if (*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) != 0) {
                iVar3 = *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8);
                goto joined_r0x00780004;
              }
            }
            else if (*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) != 0) {
              iVar3 = *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + unaff_x19 + 0x18) + 8);
joined_r0x00780004:
              if (iVar3 < 1) goto code_r0x00780190;
            }
            func_0x0073cab8();
code_r0x00780190:
            if (*(int *)(&UNK_00001808 + lVar9 + unaff_x26 * 4) != 1) goto code_r0x007801ac;
          }
          else {
            if (*(int *)(&UNK_00001808 + lVar4) != 1) goto code_r0x0077fe68;
            *piVar7 = 1;
            uStack0000000000000058._5_2_ = 0xfbff;
            uStack0000000000000058._7_1_ = bVar1;
            lVar4 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                          (long)&uStack0000000000000058 + 5,3,0x80000);
            if (lVar4 < 0) {
              ___error();
              func_0x0073c9e4();
            }
            if (*(char *)(in_stack_00000040 + 3) < '\0') {
              if ((uVar10 < 0x28) || (uVar10 == 0xff)) {
                if ((*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) == 0) ||
                   (0 < *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8))) {
                  func_0x0073cab8();
                }
              }
              else if ((*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) == 0) ||
                      (0 < *(int *)(*(long *)(
                                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                             + unaff_x19 + 0x18) + 8))) {
                func_0x0073cab8();
              }
            }
          }
          func_0x00780b18();
        }
code_r0x007801ac:
        unaff_x25[0x707] = 0;
        unaff_x23 = in_stack_00000048;
        goto code_r0x0077f3c4;
      case 5:
        if (*(char *)(in_stack_00000040 + 3) < '\0') {
          if (bVar1 < 0x28) {
            lVar4 = *(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18);
code_r0x0077f744:
            if (lVar4 != 0) {
              iVar3 = *(int *)(lVar4 + 8);
joined_r0x0077fa84:
              if (iVar3 < 1) goto code_r0x0077fab4;
            }
          }
          else {
            lVar4 = *(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18);
            if (bVar1 == 0xff) goto code_r0x0077f744;
            if (lVar4 != 0) {
              iVar3 = *(int *)(lVar4 + 8);
              goto joined_r0x0077fa84;
            }
          }
          func_0x0073cab8();
        }
code_r0x0077fab4:
        *unaff_x25 = 1;
        lVar4 = *(long *)(unaff_x19 + 0x1b0) + unaff_x26 * 4;
        piVar7 = (int *)(lVar4 + 8);
        iVar3 = *piVar7;
        if (iVar3 == 3) {
          iVar3 = *(int *)(lVar4 + 0x408);
          if (iVar3 != 1) goto joined_r0x0077f950;
          *piVar7 = 2;
          *(undefined4 *)(lVar4 + 0x408) = 0;
          uStack0000000000000058._5_2_ = 0xfbff;
          param_1 = (ulong)*(uint *)(*(long *)(unaff_x19 + 0x18) + 0x238);
          param_2 = (long)&uStack0000000000000058 + 5;
          uStack0000000000000058._7_1_ = bVar1;
          goto code_r0x0077fb84;
        }
        if (iVar3 == 2) {
          lVar4 = *(long *)(unaff_x19 + 0x1b0) + unaff_x26 * 4;
          iVar3 = *(int *)(lVar4 + 0x408);
          if (iVar3 != 1) goto joined_r0x0077f950;
          pcVar8 = (char *)(lVar4 + 0x408);
code_r0x0077fed4:
          *piVar7 = 0;
          pcVar8[0] = '\0';
          pcVar8[1] = '\0';
          pcVar8[2] = '\0';
          pcVar8[3] = '\0';
          goto LAB_0077f3c0;
        }
        if (iVar3 != 1) goto LAB_0077f3c0;
        *piVar7 = 0;
        uStack0000000000000058._5_2_ = 0xfcff;
        uStack0000000000000058._7_1_ = bVar1;
        lVar4 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                      (long)&uStack0000000000000058 + 5,3,0x80000);
        if (lVar4 < 0) {
          ___error();
          func_0x0073c9e4();
        }
        if (-1 < *(char *)(in_stack_00000040 + 3)) goto LAB_0077f3c0;
        if ((uVar10 < 0x28) || (bVar1 == 0xff)) {
          if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0) goto code_r0x007800a0;
          iVar3 = *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8);
          goto joined_r0x00780090;
        }
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0) goto code_r0x007801d4;
        iVar3 = *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8);
        goto joined_r0x00780040;
      case 6:
        unaff_x25[0x707] = 0;
        if (bVar1 != 0) goto code_r0x0077fd78;
code_r0x0077f4c0:
        if ((-1 < in_stack_00000038._4_4_) && (uVar5 = func_0x007738a0(), (int)uVar5 != 0)) {
          iVar3 = *(int *)(unaff_x19 + 0x998);
joined_r0x0078039c:
          do {
            uVar2 = false;
            unaff_x28 = in_stack_00000050;
joined_r0x0078039c:
            if (iVar3 != 0) {
              auVar11 = func_0x00782d28();
              lVar4 = func_0x00782dc4(auVar11._0_8_,auVar11._8_8_,*(undefined8 *)(unaff_x24 + 0x218)
                                      ,*(undefined8 *)(unaff_x24 + 0x220));
              if ((long)(ulong)*(uint *)(unaff_x19 + 0x998) <= lVar4) {
                func_0x0073c9e4();
                uVar2 = false;
                uVar5 = 0x1c;
              }
            }
            iVar3 = func_0x0077011c();
            if (iVar3 != 0) {
              uVar5 = 0x2a;
code_r0x007803a8:
              func_0x00783c98();
              if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
                return uVar5;
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
            if (!(bool)uVar2) goto code_r0x007803a8;
            iVar3 = func_0x007733c8(unaff_x29 + -0x70);
            if (iVar3 == 0) {
              *(undefined2 *)(unaff_x29 + -0x6a) = 0;
              *(undefined2 *)(unaff_x29 + -0x62) = 0;
code_r0x0077f2f0:
              if ((unaff_w27 >> 4 & 1) == 0) {
code_r0x0077f2f8:
                in_stack_00000050 = 0;
                if ((*(ushort *)(unaff_x29 + -0x62) & 1) != 0) {
                  in_stack_00000050 =
                       _read(*(undefined4 *)(unaff_x29 + -0x68),&uStack0000000000000060,0x1000);
code_r0x007802f0:
                  if (0 < in_stack_00000050) {
                    uVar5 = func_0x007806b0();
                    if ((int)uVar5 != 0) goto code_r0x0078030c;
                    func_0x00770948();
                    goto code_r0x00780344;
                  }
                }
                uVar2 = in_stack_00000050 == 0;
                iVar3 = *(int *)(unaff_x19 + 0x998);
                unaff_x28 = in_stack_00000050;
              }
              else {
code_r0x007802b0:
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
                  uVar2 = false;
                  iVar3 = *(int *)(unaff_x19 + 0x998);
                  unaff_x28 = in_stack_00000050;
                }
                else {
                  if (iVar3 != 0x10000001) goto code_r0x007802f0;
code_r0x00780344:
                  uVar2 = true;
                  iVar3 = *(int *)(unaff_x19 + 0x998);
                  unaff_x28 = in_stack_00000050;
                }
              }
              goto joined_r0x0078039c;
            }
            if (iVar3 == -1) goto code_r0x007803a8;
            if ((*(ushort *)(unaff_x29 + -0x6a) & 1) == 0) goto code_r0x0077f2f0;
            uVar5 = func_0x00784250();
            if ((int)uVar5 != 0) {
              uVar2 = (int)uVar5 == 0x51;
              iVar3 = *(int *)(unaff_x19 + 0x998);
              goto joined_r0x0078039c;
            }
            if (unaff_x28 < 1) {
              uVar2 = false;
              uVar5 = 0;
              iVar3 = *(int *)(unaff_x19 + 0x998);
              goto joined_r0x0078039c;
            }
            uVar5 = func_0x0077093c();
            in_stack_00000050 = unaff_x28;
            if ((int)uVar5 == 0) {
              if (unaff_x28 == 0) {
code_r0x0078027c:
                if ((*unaff_x23 != 0) && (unaff_x23[1] == 0)) {
                  func_0x0078043c();
                  unaff_x23[1] = 1;
                }
                uVar5 = 0;
                if ((unaff_w27 >> 4 & 1) == 0) goto code_r0x0077f2f8;
                goto code_r0x007802b0;
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
        if (bVar1 == 0xf0) {
          pbVar6 = *(byte **)in_stack_00000028;
          if (pbVar6 < in_stack_00000028) {
            *(byte **)in_stack_00000028 = pbVar6 + 1;
            *pbVar6 = 0xff;
            pbVar6 = *(byte **)in_stack_00000028;
          }
          if (pbVar6 < in_stack_00000028) {
            *(byte **)in_stack_00000028 = pbVar6 + 1;
            *pbVar6 = 0xf0;
            pbVar6 = *(byte **)in_stack_00000028;
          }
          *(byte **)(unaff_x25 + 0x794) = pbVar6 + -2;
          *(undefined4 **)(unaff_x25 + 0x792) = in_stack_00000020;
          func_0x00780868();
          goto LAB_0077f3c0;
        }
        if (bVar1 != 0xff) {
          pbVar6 = *(byte **)in_stack_00000028;
          if (pbVar6 < in_stack_00000028) {
            *(byte **)in_stack_00000028 = pbVar6 + 1;
            *pbVar6 = 0xff;
            pbVar6 = *(byte **)in_stack_00000028;
          }
          if (pbVar6 < in_stack_00000028) {
            *(byte **)in_stack_00000028 = pbVar6 + 1;
            *pbVar6 = bVar1;
            pbVar6 = *(byte **)in_stack_00000028;
          }
          *(byte **)(unaff_x25 + 0x794) = pbVar6 + -2;
          *(undefined4 **)(unaff_x25 + 0x792) = in_stack_00000020;
          if (*(char *)(in_stack_00000040 + 3) < '\0') {
            lVar4 = *(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18);
            if (uVar10 - 0xec < 0x14) {
              if (lVar4 != 0) {
                iVar3 = *(int *)(lVar4 + 8);
joined_r0x0077fc78:
                if (iVar3 < 1) goto code_r0x0077fca0;
              }
            }
            else if (lVar4 != 0) {
              iVar3 = *(int *)(lVar4 + 8);
              goto joined_r0x0077fc78;
            }
            func_0x0073cab8();
          }
code_r0x0077fca0:
          func_0x00780868();
          unaff_x25[0x707] = 1;
          goto code_r0x0077fcb0;
        }
        pbVar6 = *(byte **)in_stack_00000028;
        if (pbVar6 < in_stack_00000028) {
          *(byte **)in_stack_00000028 = pbVar6 + 1;
          *pbVar6 = 0xff;
        }
code_r0x0077fcdc:
        unaff_x25[0x707] = 7;
        goto code_r0x0077f3c4;
      }
      if (*(char *)(in_stack_00000040 + 3) < '\0') {
        if (uVar10 < 0x28) {
          lVar4 = *(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18);
code_r0x0077f6ac:
          if (lVar4 != 0) {
            iVar3 = *(int *)(lVar4 + 8);
joined_r0x0077f850:
            if (iVar3 < 1) goto code_r0x0077f880;
          }
        }
        else {
          lVar4 = *(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18);
          if (uVar10 == 0xff) goto code_r0x0077f6ac;
          if (lVar4 != 0) {
            iVar3 = *(int *)(lVar4 + 8);
            goto joined_r0x0077f850;
          }
        }
        func_0x0073cab8();
      }
code_r0x0077f880:
      *unaff_x25 = 1;
      lVar4 = *(long *)(unaff_x19 + 0x1b0) + unaff_x26 * 4;
      piVar7 = (int *)(lVar4 + 0xc08);
      iVar3 = *(int *)(lVar4 + 0xc08);
      if (iVar3 != 3) {
        if (iVar3 == 2) {
          lVar4 = *(long *)(unaff_x19 + 0x1b0) + unaff_x26 * 4;
          iVar3 = *(int *)(
                          "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                          + lVar4 + 0x18);
          if (iVar3 == 1) {
            pcVar8 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                     + lVar4 + 0x18;
            goto code_r0x0077fed4;
          }
          goto joined_r0x0077f950;
        }
        if (iVar3 == 1) {
          *piVar7 = 0;
          goto code_r0x0077fda0;
        }
        goto LAB_0077f3c0;
      }
      iVar3 = *(int *)(
                      "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                      + lVar4 + 0x18);
      if (iVar3 != 1) goto joined_r0x0077f950;
      pcVar8 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation" +
               lVar4 + 0x18;
      *piVar7 = 2;
      pcVar8[0] = '\0';
      pcVar8[1] = '\0';
      pcVar8[2] = '\0';
      pcVar8[3] = '\0';
code_r0x0077f8d8:
      uStack0000000000000058._5_2_ = 0xfdff;
      uStack0000000000000058._7_1_ = bVar1;
      lVar4 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                    (long)&uStack0000000000000058 + 5,3,0x80000);
      if (lVar4 < 0) {
        ___error();
        func_0x0073c9e4();
      }
      if (-1 < *(char *)(in_stack_00000040 + 3)) goto LAB_0077f3c0;
      if ((0x27 < uVar10) && (uVar10 != 0xff)) {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0) goto code_r0x007801d4;
        iVar3 = *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8);
        goto joined_r0x00780040;
      }
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0) break;
      iVar3 = *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8);
joined_r0x00780090:
    } while (iVar3 < 1);
  } while( true );
code_r0x0077f4f4:
  if (bVar1 == 0xff) {
    unaff_x25[0x707] = 8;
  }
  else {
    pbVar6 = *(byte **)in_stack_00000028;
    if (pbVar6 < in_stack_00000028) {
      *(byte **)in_stack_00000028 = pbVar6 + 1;
      *pbVar6 = bVar1;
    }
  }
  goto code_r0x0077f3c4;
}

