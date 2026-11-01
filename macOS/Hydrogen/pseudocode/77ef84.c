
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_0077ef84(undefined8 param_1,undefined8 param_2,long param_3)

{
  byte *pbVar1;
  undefined4 *puVar2;
  byte bVar3;
  char cVar4;
  undefined1 uVar5;
  int iVar6;
  long lVar7;
  char *pcVar8;
  byte *pbVar9;
  int *piVar10;
  char *pcVar11;
  long unaff_x19;
  undefined8 uVar12;
  undefined8 uVar13;
  long lVar14;
  int *unaff_x23;
  long lVar15;
  long unaff_x24;
  undefined4 unaff_w25;
  undefined4 *puVar16;
  uint uVar18;
  uint uVar17;
  undefined8 uVar19;
  ulong uVar20;
  uint uVar21;
  long *plVar22;
  long unaff_x29;
  undefined1 auVar23 [16];
  int iStack000000000000003c;
  long in_stack_00000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  
  func_0x00764560(&uStack0000000000000060,0x100,param_3 + 0xfc);
  lVar7 = func_0x00779dfc(*(undefined8 *)(unaff_x23 + 0x708),&uStack0000000000000060);
  if (lVar7 == 0) {
    func_0x00779fa4(*(undefined8 *)(unaff_x23 + 0x708));
    unaff_x23[0x708] = 0;
    unaff_x23[0x709] = 0;
    uVar19 = 0x1b;
  }
  else {
    *(long *)(unaff_x23 + 0x708) = lVar7;
    unaff_x23[0x229] = 1;
    plVar22 = *(long **)(unaff_x19 + 0x4f0);
    if (plVar22 != (long *)0x0) {
      do {
        lVar14 = *plVar22;
        lVar7 = _strchr(lVar14,0x3d);
        if (lVar7 == 0) {
          uVar19 = 0x31;
LAB_0077f1bc:
          func_0x0073c9e4();
          goto LAB_0077f1dc;
        }
        pcVar11 = (char *)(lVar7 + 1);
        pcVar8 = pcVar11;
        do {
          cVar4 = *pcVar8;
          pcVar8 = pcVar8 + 1;
        } while ('\0' < cVar4);
        if (cVar4 == '\0') {
          uVar19 = 0x30;
          switch(lVar7 - lVar14) {
          case 2:
            iVar6 = func_0x0077e76c(lVar14,"WS",2);
            if (iVar6 == 0) goto LAB_0077f1dc;
            lVar7 = _strtoul(pcVar11,&uStack0000000000000060,10);
            pcVar11 = uStack0000000000000060;
            if ((lVar7 - 1U < 0xffff) &&
               (iVar6 = func_0x0077e6e4((long)*uStack0000000000000060), iVar6 == 0x78)) {
              lVar14 = _strtoul(pcVar11 + 1,0,10);
              if (lVar14 - 1U < 0xffff) {
                uVar19 = 0;
                *(short *)(unaff_x23 + 0x706) = (short)lVar7;
                *(short *)((long)unaff_x23 + 0x1c1a) = (short)lVar14;
                unaff_x23[0x221] = 1;
                break;
              }
              if (lVar14 != 0) goto code_r0x0077effc;
            }
            func_0x0073c9e4();
            uVar19 = 0x31;
            break;
          default:
            goto LAB_0077f1bc;
          case 5:
            iVar6 = func_0x0077e76c(lVar14,"TTYPE",5);
            if (iVar6 == 0) goto LAB_0077f1dc;
            uVar19 = 0;
            *(char **)(unaff_x23 + 0x702) = pcVar11;
            unaff_x23[0x21a] = 1;
            break;
          case 6:
            iVar6 = func_0x0077e76c(lVar14,"BINARY",6);
            if (iVar6 == 0) goto LAB_0077f1dc;
            iVar6 = _atoi(pcVar11);
            if (iVar6 == 1) goto code_r0x0077effc;
            uVar19 = 0;
            unaff_x23[0x202] = 0;
            unaff_x23[0x502] = 0;
            break;
          case 7:
            iVar6 = func_0x0077e76c(lVar14,"NEW_ENV",7);
            if (iVar6 == 0) goto LAB_0077f1dc;
            lVar7 = func_0x00779dfc(*(undefined8 *)(unaff_x23 + 0x708),pcVar11);
            if (lVar7 == 0) {
              uVar19 = 0x1b;
              goto LAB_0077f1dc;
            }
            uVar19 = 0;
            *(long *)(unaff_x23 + 0x708) = lVar7;
            unaff_x23[0x229] = 1;
            break;
          case 8:
            iVar6 = func_0x0077e76c(lVar14,"XDISPLOC",8);
            if (iVar6 == 0) goto LAB_0077f1dc;
            uVar19 = 0;
            *(char **)(unaff_x23 + 0x704) = pcVar11;
            unaff_x23[0x225] = 1;
          }
        }
        else {
code_r0x0077effc:
          uVar19 = 0;
        }
      } while (((int)uVar19 == 0) && (plVar22 = (long *)plVar22[1], plVar22 != (long *)0x0));
      if ((int)uVar19 != 0) {
LAB_0077f1dc:
        func_0x00779fa4(*(undefined8 *)(unaff_x23 + 0x708));
        unaff_x23[0x708] = 0;
        unaff_x23[0x709] = 0;
        goto LAB_007803b0;
      }
    }
    *(undefined4 *)(unaff_x29 + -0x70) = unaff_w25;
    *(undefined2 *)(unaff_x29 + -0x6c) = 1;
    uVar21 = (uint)*(undefined8 *)(unaff_x19 + 0xa1a);
    if ((uVar21 >> 4 & 1) == 0) {
      iVar6 = _fileno(*(undefined8 *)
                       ("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                       + unaff_x19 + 0x40));
      *(int *)(unaff_x29 + -0x68) = iVar6;
      *(undefined2 *)(unaff_x29 + -100) = 1;
      if (iVar6 < 0) {
        func_0x0073c9e4();
        uVar5 = false;
        uVar19 = 0x38;
        uVar12 = 2;
        uVar13 = 1000;
      }
      else {
        uVar19 = 0;
        uVar12 = 2;
        uVar13 = 1000;
        uVar5 = true;
      }
    }
    else {
      uVar19 = 0;
      uVar13 = 100;
      uVar12 = 1;
      uVar5 = true;
    }
    do {
      if (!(bool)uVar5) goto LAB_007803a8;
      iVar6 = func_0x007733c8(unaff_x29 + -0x70,uVar12,uVar13);
      if (iVar6 == 0) {
        *(undefined2 *)(unaff_x29 + -0x6a) = 0;
        *(undefined2 *)(unaff_x29 + -0x62) = 0;
joined_r0x0077f2f4:
        if ((uVar21 >> 4 & 1) == 0) {
          in_stack_00000050 = 0;
          if ((*(ushort *)(unaff_x29 + -0x62) & 1) != 0) {
            in_stack_00000050 =
                 _read(*(undefined4 *)(unaff_x29 + -0x68),&uStack0000000000000060,0x1000);
code_r0x007802f0:
            if (0 < in_stack_00000050) {
              uVar19 = func_0x007806b0();
              if ((int)uVar19 != 0) goto code_r0x0078030c;
              func_0x00770948();
              goto code_r0x00780344;
            }
          }
          uVar5 = in_stack_00000050 == 0;
          iVar6 = *(int *)(unaff_x19 + 0x998);
        }
        else {
          iVar6 = (**(code **)(
                              "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                              + unaff_x19 + 0x38))
                            (&uStack0000000000000060,1,0x1000,
                             *(undefined8 *)
                              (
                              "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                              + unaff_x19 + 0x40));
          in_stack_00000050 = (long)iVar6;
          if (iVar6 == 0x10000000) {
code_r0x0078030c:
            uVar5 = false;
            iVar6 = *(int *)(unaff_x19 + 0x998);
          }
          else {
            if (iVar6 != 0x10000001) goto code_r0x007802f0;
code_r0x00780344:
            uVar5 = true;
            iVar6 = *(int *)(unaff_x19 + 0x998);
          }
        }
      }
      else {
        if (iVar6 == -1) goto LAB_007803a8;
        if ((*(ushort *)(unaff_x29 + -0x6a) & 1) == 0) goto joined_r0x0077f2f4;
        uVar19 = func_0x00784250();
        if ((int)uVar19 == 0) {
          if (in_stack_00000050 < 1) {
            uVar5 = false;
            uVar19 = 0;
            iVar6 = *(int *)(unaff_x19 + 0x998);
          }
          else {
            uVar19 = func_0x0077093c();
            if ((int)uVar19 == 0) {
              if (in_stack_00000050 != 0) {
                lVar7 = 0;
                puVar16 = *(undefined4 **)(unaff_x19 + 0x1b0);
                pbVar1 = (byte *)(puVar16 + 0x792);
                puVar2 = puVar16 + 0x712;
                iStack000000000000003c = -1;
                do {
                  if (8 < (uint)puVar16[0x707]) goto code_r0x0077f3c4;
                  bVar3 = *(byte *)((long)&uStack0000000000000060 + lVar7);
                  uVar20 = (ulong)bVar3;
                  uVar17 = (uint)bVar3;
                  uVar18 = (uint)bVar3;
                  switch(puVar16[0x707]) {
                  case 0:
                    if (bVar3 == 0xd) {
                      puVar16[0x707] = 6;
                    }
                    else if (bVar3 == 0xff) {
                      puVar16[0x707] = 1;
                      goto code_r0x0077f4c0;
                    }
code_r0x0077fd78:
                    iVar6 = (int)lVar7;
                    if (-1 < iStack000000000000003c) {
                      iVar6 = iStack000000000000003c;
                    }
                    iStack000000000000003c = iVar6;
                    break;
                  case 1:
code_r0x0077fcb0:
                    switch(uVar18) {
                    case 0xfa:
                      *(undefined4 **)(puVar16 + 0x792) = puVar2;
code_r0x0077fcdc:
                      puVar16[0x707] = 7;
                      break;
                    case 0xfb:
                      puVar16[0x707] = 2;
                      break;
                    case 0xfc:
                      puVar16[0x707] = 3;
                      break;
                    case 0xfd:
                      puVar16[0x707] = 4;
                      break;
                    case 0xfe:
                      puVar16[0x707] = 5;
                      break;
                    case 0xff:
                      puVar16[0x707] = 0;
                      goto code_r0x0077fd78;
                    default:
                      puVar16[0x707] = 0;
                      if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
                        lVar14 = *(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18);
                        if (uVar18 - 0xec < 0x14) {
                          if ((lVar14 == 0) || (0 < *(int *)(lVar14 + 8))) {
                            func_0x0073cab8();
                          }
                        }
                        else if ((lVar14 == 0) || (0 < *(int *)(lVar14 + 8))) {
                          func_0x0073cab8();
                        }
                      }
                    }
                    break;
                  case 2:
                    if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
                      if (uVar18 < 0x28) {
                        lVar14 = *(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18);
code_r0x0077f660:
                        if (lVar14 != 0) {
                          iVar6 = *(int *)(lVar14 + 8);
joined_r0x0077f788:
                          if (iVar6 < 1) goto code_r0x0077f7b8;
                        }
                      }
                      else {
                        lVar14 = *(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18);
                        if (uVar18 == 0xff) goto code_r0x0077f660;
                        if (lVar14 != 0) {
                          iVar6 = *(int *)(lVar14 + 8);
                          goto joined_r0x0077f788;
                        }
                      }
                      func_0x0073cab8();
                    }
code_r0x0077f7b8:
                    *puVar16 = 1;
                    lVar15 = *(long *)(unaff_x19 + 0x1b0);
                    lVar14 = lVar15 + uVar20 * 4;
                    piVar10 = (int *)(lVar14 + 0xc08);
                    iVar6 = *(int *)(lVar14 + 0xc08);
                    if (iVar6 == 3) {
                      iVar6 = *(int *)(
                                      "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                                      + lVar14 + 0x18);
                      if (iVar6 == 1) {
                        pcVar11 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                                  + lVar14 + 0x18;
                        *piVar10 = 1;
                        pcVar11[0] = '\0';
                        pcVar11[1] = '\0';
                        pcVar11[2] = '\0';
                        pcVar11[3] = '\0';
                      }
                      else {
code_r0x0077fbe4:
                        if (iVar6 == 0) goto code_r0x0077fbe8;
                      }
                    }
                    else if (iVar6 == 2) {
                      lVar15 = lVar15 + uVar20 * 4;
                      if (*(int *)(
                                  "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                                  + lVar15 + 0x18) == 1) {
                        pcVar11 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                                  + lVar15 + 0x18;
                        *piVar10 = 3;
                        pcVar11[0] = '\0';
                        pcVar11[1] = '\0';
                        pcVar11[2] = '\0';
                        pcVar11[3] = '\0';
                        goto code_r0x0077fda0;
                      }
                      if (*(int *)(
                                  "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                                  + lVar15 + 0x18) == 0) {
                        *piVar10 = 1;
                      }
                    }
                    else if (iVar6 == 0) {
                      if (*(int *)(&UNK_00001408 + lVar15 + uVar20 * 4) == 1) {
                        *piVar10 = 1;
                        goto code_r0x0077f8d8;
                      }
code_r0x0077fda0:
                      uStack0000000000000058._5_2_ = 0xfeff;
                      uStack0000000000000058._7_1_ = bVar3;
                      lVar14 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                                     (long)&uStack0000000000000058 + 5,3,0x80000);
                      if (lVar14 < 0) {
                        ___error();
                        func_0x0073c9e4();
                      }
                      if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
                        if ((uVar18 < 0x28) || (uVar17 == 0xff)) {
                          if (*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x19 + 0x18) != 0) {
                            iVar6 = *(int *)(*(long *)(
                                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                  + unaff_x19 + 0x18) + 8);
                            goto joined_r0x0077ff00;
                          }
                          goto code_r0x007800a0;
                        }
                        if (*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) != 0) {
                          iVar6 = *(int *)(*(long *)(
                                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                  + unaff_x19 + 0x18) + 8);
                          goto joined_r0x007801c8;
                        }
                        goto code_r0x007801d4;
                      }
                    }
                    goto code_r0x0077f3c0;
                  case 3:
                    if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
                      if (uVar18 < 0x28) {
                        lVar14 = *(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18);
code_r0x0077f6ac:
                        if (lVar14 != 0) {
                          iVar6 = *(int *)(lVar14 + 8);
joined_r0x0077f850:
                          if (iVar6 < 1) goto code_r0x0077f880;
                        }
                      }
                      else {
                        lVar14 = *(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18);
                        if (uVar18 == 0xff) goto code_r0x0077f6ac;
                        if (lVar14 != 0) {
                          iVar6 = *(int *)(lVar14 + 8);
                          goto joined_r0x0077f850;
                        }
                      }
                      func_0x0073cab8();
                    }
code_r0x0077f880:
                    *puVar16 = 1;
                    lVar14 = *(long *)(unaff_x19 + 0x1b0) + uVar20 * 4;
                    piVar10 = (int *)(lVar14 + 0xc08);
                    iVar6 = *(int *)(lVar14 + 0xc08);
                    if (iVar6 == 3) {
                      iVar6 = *(int *)(
                                      "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                                      + lVar14 + 0x18);
                      if (iVar6 != 1) goto code_r0x0077f950;
                      pcVar11 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                                + lVar14 + 0x18;
                      *piVar10 = 2;
                      pcVar11[0] = '\0';
                      pcVar11[1] = '\0';
                      pcVar11[2] = '\0';
                      pcVar11[3] = '\0';
code_r0x0077f8d8:
                      uStack0000000000000058._5_2_ = 0xfdff;
                      uStack0000000000000058._7_1_ = bVar3;
                      lVar14 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                                     (long)&uStack0000000000000058 + 5,3,0x80000);
                      if (lVar14 < 0) {
                        ___error();
                        func_0x0073c9e4();
                      }
                      if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
                        if ((0x27 < uVar18) && (uVar18 != 0xff)) {
                          if (*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x19 + 0x18) != 0) {
                            iVar6 = *(int *)(*(long *)(
                                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                  + unaff_x19 + 0x18) + 8);
                            goto joined_r0x007801c8;
                          }
                          goto code_r0x007801d4;
                        }
                        if (*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) != 0) {
                          iVar6 = *(int *)(*(long *)(
                                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                  + unaff_x19 + 0x18) + 8);
joined_r0x0077ff00:
                          if (iVar6 < 1) goto code_r0x0077f3c0;
                        }
code_r0x007800a0:
                        func_0x0073cab8();
                      }
                    }
                    else {
                      if (iVar6 != 2) {
                        if (iVar6 != 1) goto code_r0x0077f3c0;
                        *piVar10 = 0;
                        goto code_r0x0077fda0;
                      }
                      lVar14 = *(long *)(unaff_x19 + 0x1b0) + uVar20 * 4;
                      iVar6 = *(int *)(
                                      "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                                      + lVar14 + 0x18);
                      if (iVar6 == 1) {
                        pcVar11 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                                  + lVar14 + 0x18;
                        goto code_r0x0077fed4;
                      }
code_r0x0077f950:
                      if (iVar6 != 0) goto code_r0x0077f3c0;
code_r0x0077fbe8:
                      *piVar10 = 0;
                    }
                    goto code_r0x0077f3c0;
                  case 4:
                    if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
                      if (uVar17 < 0x28) {
                        lVar14 = *(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18);
code_r0x0077f6f8:
                        if (lVar14 != 0) {
                          iVar6 = *(int *)(lVar14 + 8);
joined_r0x0077f964:
                          if (iVar6 < 1) goto code_r0x0077f994;
                        }
                      }
                      else {
                        lVar14 = *(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18);
                        if (uVar17 == 0xff) goto code_r0x0077f6f8;
                        if (lVar14 != 0) {
                          iVar6 = *(int *)(lVar14 + 8);
                          goto joined_r0x0077f964;
                        }
                      }
                      func_0x0073cab8();
                    }
code_r0x0077f994:
                    *puVar16 = 1;
                    lVar15 = *(long *)(unaff_x19 + 0x1b0);
                    lVar14 = lVar15 + uVar20 * 4;
                    piVar10 = (int *)(lVar14 + 8);
                    iVar6 = *piVar10;
                    if (iVar6 == 3) {
                      if (*(int *)(lVar14 + 0x408) == 1) {
                        *piVar10 = 1;
                        *(undefined4 *)(lVar14 + 0x408) = 0;
                      }
                      else if (*(int *)(lVar14 + 0x408) == 0) {
                        *piVar10 = 0;
                      }
                    }
                    else if (iVar6 == 2) {
                      lVar14 = lVar15 + uVar20 * 4;
                      iVar6 = *(int *)(lVar14 + 0x408);
                      if (iVar6 == 1) {
                        *piVar10 = 3;
                        pcVar11 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                                  + lVar14 + 0x18;
                        pcVar11[0] = '\0';
                        pcVar11[1] = '\0';
                        pcVar11[2] = '\0';
                        pcVar11[3] = '\0';
code_r0x0077fe68:
                        uStack0000000000000058._5_2_ = 0xfcff;
                        uStack0000000000000058._7_1_ = bVar3;
                        lVar14 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                                       (long)&uStack0000000000000058 + 5,3,0x80000);
                        if (lVar14 < 0) {
                          ___error();
                          func_0x0073c9e4();
                        }
                        if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
                          if ((uVar18 < 0x28) || (uVar18 == 0xff)) {
                            if (*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + unaff_x19 + 0x18) != 0) {
                              iVar6 = *(int *)(*(long *)(
                                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                  + unaff_x19 + 0x18) + 8);
                              goto joined_r0x0077ffb8;
                            }
                          }
                          else if (*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) != 0) {
                            iVar6 = *(int *)(*(long *)(
                                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                  + unaff_x19 + 0x18) + 8);
joined_r0x0077ffb8:
                            if (iVar6 < 1) goto code_r0x007801ac;
                          }
                          func_0x0073cab8();
                        }
                      }
                      else if (iVar6 == 0) {
                        *piVar10 = 1;
                        goto code_r0x00780190;
                      }
                    }
                    else if (iVar6 == 0) {
                      lVar14 = lVar15 + uVar20 * 4;
                      if (*(int *)(lVar14 + 0x808) == 1) {
                        *piVar10 = 1;
                        uStack0000000000000058._5_2_ = 0xfbff;
                        uStack0000000000000058._7_1_ = bVar3;
                        lVar14 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                                       (long)&uStack0000000000000058 + 5,3,0x80000);
                        if (lVar14 < 0) {
                          ___error();
                          func_0x0073c9e4();
                        }
                        if (-1 < *(char *)(unaff_x19 + 0xa1d)) goto code_r0x00780190;
                        if ((uVar18 < 0x28) || (uVar17 == 0xff)) {
                          if (*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x19 + 0x18) != 0) {
                            iVar6 = *(int *)(*(long *)(
                                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                  + unaff_x19 + 0x18) + 8);
                            goto joined_r0x00780004;
                          }
                        }
                        else if (*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) != 0) {
                          iVar6 = *(int *)(*(long *)(
                                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                  + unaff_x19 + 0x18) + 8);
joined_r0x00780004:
                          if (iVar6 < 1) goto code_r0x00780190;
                        }
                        func_0x0073cab8();
code_r0x00780190:
                        if (*(int *)(&UNK_00001808 + lVar15 + uVar20 * 4) != 1)
                        goto code_r0x007801ac;
                      }
                      else {
                        if (*(int *)(&UNK_00001808 + lVar14) != 1) goto code_r0x0077fe68;
                        *piVar10 = 1;
                        uStack0000000000000058._5_2_ = 0xfbff;
                        uStack0000000000000058._7_1_ = bVar3;
                        lVar14 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                                       (long)&uStack0000000000000058 + 5,3,0x80000);
                        if (lVar14 < 0) {
                          ___error();
                          func_0x0073c9e4();
                        }
                        if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
                          if ((uVar18 < 0x28) || (uVar18 == 0xff)) {
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
                    puVar16[0x707] = 0;
                    break;
                  case 5:
                    if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
                      if (uVar17 < 0x28) {
                        lVar14 = *(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18);
code_r0x0077f744:
                        if (lVar14 != 0) {
                          iVar6 = *(int *)(lVar14 + 8);
joined_r0x0077fa84:
                          if (iVar6 < 1) goto code_r0x0077fab4;
                        }
                      }
                      else {
                        lVar14 = *(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18);
                        if (uVar17 == 0xff) goto code_r0x0077f744;
                        if (lVar14 != 0) {
                          iVar6 = *(int *)(lVar14 + 8);
                          goto joined_r0x0077fa84;
                        }
                      }
                      func_0x0073cab8();
                    }
code_r0x0077fab4:
                    *puVar16 = 1;
                    lVar14 = *(long *)(unaff_x19 + 0x1b0) + uVar20 * 4;
                    piVar10 = (int *)(lVar14 + 8);
                    iVar6 = *piVar10;
                    if (iVar6 == 3) {
                      iVar6 = *(int *)(lVar14 + 0x408);
                      if (iVar6 != 1) goto code_r0x0077fbe4;
                      *piVar10 = 2;
                      *(undefined4 *)(lVar14 + 0x408) = 0;
                      uStack0000000000000058._5_2_ = 0xfbff;
                      uStack0000000000000058._7_1_ = bVar3;
                      lVar14 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                                     (long)&uStack0000000000000058 + 5,3,0x80000);
                      if (lVar14 < 0) {
                        ___error();
                        func_0x0073c9e4();
                      }
                      if (-1 < *(char *)(unaff_x19 + 0xa1d)) goto code_r0x0077f3c0;
                      if ((uVar18 < 0x28) || (uVar18 == 0xff)) {
                        if (*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) == 0) goto code_r0x007800a0;
                        iVar6 = *(int *)(*(long *)(
                                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                  + unaff_x19 + 0x18) + 8);
                        goto joined_r0x0077ff00;
                      }
                      if (*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) == 0) goto code_r0x007801d4;
                      iVar6 = *(int *)(*(long *)(
                                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                + unaff_x19 + 0x18) + 8);
joined_r0x007801c8:
                      if (iVar6 < 1) goto code_r0x0077f3c0;
                    }
                    else {
                      if (iVar6 == 2) {
                        lVar14 = *(long *)(unaff_x19 + 0x1b0) + uVar20 * 4;
                        iVar6 = *(int *)(lVar14 + 0x408);
                        if (iVar6 != 1) goto code_r0x0077fbe4;
                        pcVar11 = (char *)(lVar14 + 0x408);
code_r0x0077fed4:
                        *piVar10 = 0;
                        pcVar11[0] = '\0';
                        pcVar11[1] = '\0';
                        pcVar11[2] = '\0';
                        pcVar11[3] = '\0';
                        goto code_r0x0077f3c0;
                      }
                      if (iVar6 != 1) goto code_r0x0077f3c0;
                      *piVar10 = 0;
                      uStack0000000000000058._5_2_ = 0xfcff;
                      uStack0000000000000058._7_1_ = bVar3;
                      lVar14 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                                     (long)&uStack0000000000000058 + 5,3,0x80000);
                      if (lVar14 < 0) {
                        ___error();
                        func_0x0073c9e4();
                      }
                      if (-1 < *(char *)(unaff_x19 + 0xa1d)) goto code_r0x0077f3c0;
                      if ((uVar18 < 0x28) || (uVar17 == 0xff)) {
                        if (*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) != 0) {
                          iVar6 = *(int *)(*(long *)(
                                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                  + unaff_x19 + 0x18) + 8);
                          goto joined_r0x0077ff00;
                        }
                        goto code_r0x007800a0;
                      }
                      if (*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) != 0) {
                        iVar6 = *(int *)(*(long *)(
                                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                  + unaff_x19 + 0x18) + 8);
                        goto joined_r0x007801c8;
                      }
                    }
code_r0x007801d4:
                    func_0x0073cab8();
code_r0x0077f3c0:
                    puVar16[0x707] = 0;
                    break;
                  case 6:
                    puVar16[0x707] = 0;
                    if (uVar17 != 0) goto code_r0x0077fd78;
code_r0x0077f4c0:
                    if ((-1 < iStack000000000000003c) &&
                       (uVar19 = func_0x007738a0(), (int)uVar19 != 0)) {
                      uVar5 = false;
                      iVar6 = *(int *)(unaff_x19 + 0x998);
                      goto joined_r0x0078039c;
                    }
                    iStack000000000000003c = -1;
                    break;
                  case 7:
                    if (uVar17 == 0xff) {
                      puVar16[0x707] = 8;
                    }
                    else {
                      pbVar9 = *(byte **)pbVar1;
                      if (pbVar9 < pbVar1) {
                        *(byte **)pbVar1 = pbVar9 + 1;
                        *pbVar9 = bVar3;
                      }
                    }
                    break;
                  case 8:
                    if (uVar17 != 0xf0) {
                      if (uVar17 != 0xff) {
                        pbVar9 = *(byte **)pbVar1;
                        if (pbVar9 < pbVar1) {
                          *(byte **)pbVar1 = pbVar9 + 1;
                          *pbVar9 = 0xff;
                          pbVar9 = *(byte **)pbVar1;
                        }
                        if (pbVar9 < pbVar1) {
                          *(byte **)pbVar1 = pbVar9 + 1;
                          *pbVar9 = bVar3;
                          pbVar9 = *(byte **)pbVar1;
                        }
                        *(byte **)(puVar16 + 0x794) = pbVar9 + -2;
                        *(undefined4 **)(puVar16 + 0x792) = puVar2;
                        if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
                          lVar14 = *(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18);
                          if (uVar17 - 0xec < 0x14) {
                            if (lVar14 != 0) {
                              iVar6 = *(int *)(lVar14 + 8);
joined_r0x0077fc78:
                              if (iVar6 < 1) goto code_r0x0077fca0;
                            }
                          }
                          else if (lVar14 != 0) {
                            iVar6 = *(int *)(lVar14 + 8);
                            goto joined_r0x0077fc78;
                          }
                          func_0x0073cab8();
                        }
code_r0x0077fca0:
                        func_0x00780868();
                        puVar16[0x707] = 1;
                        goto code_r0x0077fcb0;
                      }
                      pbVar9 = *(byte **)pbVar1;
                      if (pbVar9 < pbVar1) {
                        *(byte **)pbVar1 = pbVar9 + 1;
                        *pbVar9 = 0xff;
                      }
                      goto code_r0x0077fcdc;
                    }
                    pbVar9 = *(byte **)pbVar1;
                    if (pbVar9 < pbVar1) {
                      *(byte **)pbVar1 = pbVar9 + 1;
                      *pbVar9 = 0xff;
                      pbVar9 = *(byte **)pbVar1;
                    }
                    if (pbVar9 < pbVar1) {
                      *(byte **)pbVar1 = pbVar9 + 1;
                      *pbVar9 = 0xf0;
                      pbVar9 = *(byte **)pbVar1;
                    }
                    *(byte **)(puVar16 + 0x794) = pbVar9 + -2;
                    *(undefined4 **)(puVar16 + 0x792) = puVar2;
                    func_0x00780868();
                    goto code_r0x0077f3c0;
                  }
code_r0x0077f3c4:
                  lVar7 = lVar7 + 1;
                } while (in_stack_00000050 != lVar7);
                if ((-1 < iStack000000000000003c) && (uVar19 = func_0x007738a0(), (int)uVar19 != 0))
                {
                  iVar6 = *(int *)(unaff_x19 + 0x998);
                  goto joined_r0x0077f354;
                }
              }
              if ((*unaff_x23 != 0) && (unaff_x23[1] == 0)) {
                func_0x0078043c();
                unaff_x23[1] = 1;
              }
              uVar19 = 0;
              goto joined_r0x0077f2f4;
            }
            iVar6 = *(int *)(unaff_x19 + 0x998);
joined_r0x0077f354:
            uVar5 = false;
          }
        }
        else {
          uVar5 = (int)uVar19 == 0x51;
          iVar6 = *(int *)(unaff_x19 + 0x998);
        }
      }
joined_r0x0078039c:
      if (iVar6 != 0) {
        auVar23 = func_0x00782d28();
        lVar7 = func_0x00782dc4(auVar23._0_8_,auVar23._8_8_,*(undefined8 *)(unaff_x24 + 0x218),
                                *(undefined8 *)(unaff_x24 + 0x220));
        if ((long)(ulong)*(uint *)(unaff_x19 + 0x998) <= lVar7) {
          func_0x0073c9e4();
          uVar5 = false;
          uVar19 = 0x1c;
        }
      }
      iVar6 = func_0x0077011c();
    } while (iVar6 == 0);
    uVar19 = 0x2a;
LAB_007803a8:
    func_0x00783c98();
  }
LAB_007803b0:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return uVar19;
  }
  lVar7 = ___stack_chk_fail();
  lVar7 = *(long *)(lVar7 + 0x1b0);
  if (lVar7 != 0) {
    func_0x00779fa4(*(undefined8 *)(&UNK_00001c20 + lVar7));
    *(undefined8 *)(&UNK_00001c20 + lVar7) = 0;
    func_0x00740678(&UNK_00001c28 + lVar7);
  }
  return 0;
}

