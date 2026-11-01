
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_0077f30c(ulong param_1)

{
  byte *pbVar1;
  undefined4 *puVar2;
  byte bVar3;
  int iVar4;
  long lVar5;
  byte *pbVar6;
  int *piVar7;
  long lVar8;
  char *pcVar9;
  long unaff_x19;
  uint uVar10;
  int *unaff_x23;
  long lVar11;
  long unaff_x24;
  uint unaff_w25;
  undefined4 *puVar12;
  uint uVar13;
  undefined8 unaff_x26;
  ulong uVar14;
  uint unaff_w27;
  long unaff_x29;
  undefined1 auVar15 [16];
  int iStack000000000000003c;
  long in_stack_00000040;
  int *in_stack_00000048;
  long lStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined1 uStack0000000000000060;
  
code_r0x0077f30c:
  lStack0000000000000050 = _read(param_1,&uStack0000000000000060,0x1000);
LAB_007802f0:
  if (lStack0000000000000050 < 1) goto code_r0x0078031c;
  unaff_x26 = func_0x007806b0();
  if ((int)unaff_x26 == 0) {
    func_0x00770948();
    goto code_r0x00780344;
  }
code_r0x0078030c:
  iVar4 = *(int *)(unaff_x19 + 0x998);
joined_r0x00780314:
  uVar10 = 0;
joined_r0x00780314:
  do {
    if (iVar4 != 0) {
      auVar15 = func_0x00782d28();
      lVar5 = func_0x00782dc4(auVar15._0_8_,auVar15._8_8_,*(undefined8 *)(unaff_x24 + 0x218),
                              *(undefined8 *)(unaff_x24 + 0x220));
      if ((long)(ulong)*(uint *)(unaff_x19 + 0x998) <= lVar5) {
        func_0x0073c9e4();
        uVar10 = 0;
        unaff_x26 = 0x1c;
      }
    }
    iVar4 = func_0x0077011c();
    if (iVar4 != 0) {
      unaff_x26 = 0x2a;
code_r0x007803a8:
      func_0x00783c98();
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return unaff_x26;
      }
      lVar5 = ___stack_chk_fail();
      lVar5 = *(long *)(lVar5 + 0x1b0);
      if (lVar5 != 0) {
        func_0x00779fa4(*(undefined8 *)(&UNK_00001c20 + lVar5));
        *(undefined8 *)(&UNK_00001c20 + lVar5) = 0;
        func_0x00740678(&UNK_00001c28 + lVar5);
      }
      return 0;
    }
    if ((uVar10 & 1) == 0) goto code_r0x007803a8;
    iVar4 = func_0x007733c8(unaff_x29 + -0x70);
    if (iVar4 == 0) {
      *(undefined2 *)(unaff_x29 + -0x6a) = 0;
      *(undefined2 *)(unaff_x29 + -0x62) = 0;
code_r0x0077f2f0:
      if ((unaff_w27 >> 4 & 1) == 0) {
code_r0x0077f2f8:
        lStack0000000000000050 = 0;
        if ((*(ushort *)(unaff_x29 + -0x62) & 1) != 0) {
          param_1 = (ulong)*(uint *)(unaff_x29 + -0x68);
          goto code_r0x0077f30c;
        }
code_r0x0078031c:
        uVar10 = (uint)(lStack0000000000000050 == 0);
        iVar4 = *(int *)(unaff_x19 + 0x998);
      }
      else {
code_r0x007802b0:
        iVar4 = (**(code **)(
                            "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                            + unaff_x19 + 0x38))
                          (&uStack0000000000000060,1,0x1000,
                           *(undefined8 *)
                            (
                            "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                            + unaff_x19 + 0x40));
        lStack0000000000000050 = (long)iVar4;
        if (iVar4 == 0x10000000) goto code_r0x0078030c;
        if (iVar4 != 0x10000001) goto LAB_007802f0;
code_r0x00780344:
        uVar10 = 1;
        iVar4 = *(int *)(unaff_x19 + 0x998);
      }
      goto joined_r0x00780314;
    }
    if (iVar4 == -1) goto code_r0x007803a8;
    if ((*(ushort *)(unaff_x29 + -0x6a) & 1) == 0) goto code_r0x0077f2f0;
    unaff_x26 = func_0x00784250();
    if ((int)unaff_x26 == 0) {
      if (lStack0000000000000050 < 1) {
        uVar10 = 0;
        unaff_x26 = 0;
        iVar4 = *(int *)(unaff_x19 + 0x998);
        goto joined_r0x00780314;
      }
      unaff_x26 = func_0x0077093c();
      if ((int)unaff_x26 != 0) {
        iVar4 = *(int *)(unaff_x19 + 0x998);
        goto joined_r0x00780314;
      }
      if (lStack0000000000000050 != 0) {
        lVar5 = 0;
        puVar12 = *(undefined4 **)(unaff_x19 + 0x1b0);
        pbVar1 = (byte *)(puVar12 + 0x792);
        puVar2 = puVar12 + 0x712;
        iStack000000000000003c = -1;
        do {
          if (8 < (uint)puVar12[0x707]) goto code_r0x0077f3c4;
          bVar3 = (&uStack0000000000000060)[lVar5];
          uVar14 = (ulong)bVar3;
          uVar10 = (uint)bVar3;
          uVar13 = (uint)bVar3;
          switch(puVar12[0x707]) {
          case 0:
            if (bVar3 == 0xd) {
              puVar12[0x707] = 6;
            }
            else if (bVar3 == 0xff) {
              puVar12[0x707] = 1;
              goto code_r0x0077f4c0;
            }
code_r0x0077fd78:
            iVar4 = (int)lVar5;
            if (-1 < iStack000000000000003c) {
              iVar4 = iStack000000000000003c;
            }
            iStack000000000000003c = iVar4;
            break;
          case 1:
code_r0x0077fcb0:
            switch(uVar13) {
            case 0xfa:
              *(undefined4 **)(puVar12 + 0x792) = puVar2;
code_r0x0077fcdc:
              puVar12[0x707] = 7;
              break;
            case 0xfb:
              puVar12[0x707] = 2;
              break;
            case 0xfc:
              puVar12[0x707] = 3;
              break;
            case 0xfd:
              puVar12[0x707] = 4;
              break;
            case 0xfe:
              puVar12[0x707] = 5;
              break;
            case 0xff:
              puVar12[0x707] = 0;
              goto code_r0x0077fd78;
            default:
              puVar12[0x707] = 0;
              if (*(char *)(in_stack_00000040 + 3) < '\0') {
                lVar8 = *(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18);
                if (uVar13 - 0xec < 0x14) {
                  if ((lVar8 == 0) || (0 < *(int *)(lVar8 + 8))) {
                    func_0x0073cab8();
                  }
                }
                else if ((lVar8 == 0) || (0 < *(int *)(lVar8 + 8))) {
                  func_0x0073cab8();
                }
              }
            }
            break;
          case 2:
            if (*(char *)(in_stack_00000040 + 3) < '\0') {
              if (uVar13 < 0x28) {
                lVar8 = *(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18);
code_r0x0077f660:
                if (lVar8 != 0) {
                  iVar4 = *(int *)(lVar8 + 8);
joined_r0x0077f788:
                  if (iVar4 < 1) goto code_r0x0077f7b8;
                }
              }
              else {
                lVar8 = *(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18);
                if (uVar13 == 0xff) goto code_r0x0077f660;
                if (lVar8 != 0) {
                  iVar4 = *(int *)(lVar8 + 8);
                  goto joined_r0x0077f788;
                }
              }
              func_0x0073cab8();
            }
code_r0x0077f7b8:
            *puVar12 = 1;
            lVar11 = *(long *)(unaff_x19 + 0x1b0);
            lVar8 = lVar11 + uVar14 * 4;
            piVar7 = (int *)(lVar8 + 0xc08);
            iVar4 = *(int *)(lVar8 + 0xc08);
            if (iVar4 == 3) {
              iVar4 = *(int *)(
                              "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                              + lVar8 + 0x18);
              if (iVar4 == 1) {
                pcVar9 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                         + lVar8 + 0x18;
                *piVar7 = 1;
                pcVar9[0] = '\0';
                pcVar9[1] = '\0';
                pcVar9[2] = '\0';
                pcVar9[3] = '\0';
              }
              else {
code_r0x0077fbe4:
                if (iVar4 == 0) goto code_r0x0077fbe8;
              }
            }
            else if (iVar4 == 2) {
              lVar11 = lVar11 + uVar14 * 4;
              if (*(int *)(
                          "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                          + lVar11 + 0x18) == 1) {
                pcVar9 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                         + lVar11 + 0x18;
                *piVar7 = 3;
                pcVar9[0] = '\0';
                pcVar9[1] = '\0';
                pcVar9[2] = '\0';
                pcVar9[3] = '\0';
                goto code_r0x0077fda0;
              }
              if (*(int *)(
                          "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                          + lVar11 + 0x18) == 0) {
                *piVar7 = 1;
              }
            }
            else if (iVar4 == 0) {
              if (*(int *)(&UNK_00001408 + lVar11 + uVar14 * 4) == 1) {
                *piVar7 = 1;
                goto code_r0x0077f8d8;
              }
code_r0x0077fda0:
              uStack0000000000000058._5_2_ = 0xfeff;
              uStack0000000000000058._7_1_ = bVar3;
              lVar8 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                            (long)&uStack0000000000000058 + 5,3,0x80000);
              if (lVar8 < 0) {
                ___error();
                func_0x0073c9e4();
              }
              if (*(char *)(in_stack_00000040 + 3) < '\0') {
                if ((uVar13 < 0x28) || (uVar10 == 0xff)) {
                  if (*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) != 0) {
                    iVar4 = *(int *)(*(long *)(
                                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                              + unaff_x19 + 0x18) + 8);
                    goto joined_r0x0077ff00;
                  }
                  goto code_r0x007800a0;
                }
                if (*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) != 0) {
                  iVar4 = *(int *)(*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) + 8);
                  goto joined_r0x007801c8;
                }
                goto code_r0x007801d4;
              }
            }
            goto code_r0x0077f3c0;
          case 3:
            if (*(char *)(in_stack_00000040 + 3) < '\0') {
              if (uVar13 < 0x28) {
                lVar8 = *(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18);
code_r0x0077f6ac:
                if (lVar8 != 0) {
                  iVar4 = *(int *)(lVar8 + 8);
joined_r0x0077f850:
                  if (iVar4 < 1) goto code_r0x0077f880;
                }
              }
              else {
                lVar8 = *(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18);
                if (uVar13 == 0xff) goto code_r0x0077f6ac;
                if (lVar8 != 0) {
                  iVar4 = *(int *)(lVar8 + 8);
                  goto joined_r0x0077f850;
                }
              }
              func_0x0073cab8();
            }
code_r0x0077f880:
            *puVar12 = 1;
            lVar8 = *(long *)(unaff_x19 + 0x1b0) + uVar14 * 4;
            piVar7 = (int *)(lVar8 + 0xc08);
            iVar4 = *(int *)(lVar8 + 0xc08);
            if (iVar4 == 3) {
              iVar4 = *(int *)(
                              "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                              + lVar8 + 0x18);
              if (iVar4 != 1) goto code_r0x0077f950;
              pcVar9 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                       + lVar8 + 0x18;
              *piVar7 = 2;
              pcVar9[0] = '\0';
              pcVar9[1] = '\0';
              pcVar9[2] = '\0';
              pcVar9[3] = '\0';
code_r0x0077f8d8:
              uStack0000000000000058._5_2_ = 0xfdff;
              uStack0000000000000058._7_1_ = bVar3;
              lVar8 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                            (long)&uStack0000000000000058 + 5,3,0x80000);
              if (lVar8 < 0) {
                ___error();
                func_0x0073c9e4();
              }
              if (*(char *)(in_stack_00000040 + 3) < '\0') {
                if ((0x27 < uVar13) && (uVar13 != 0xff)) {
                  if (*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) != 0) {
                    iVar4 = *(int *)(*(long *)(
                                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                              + unaff_x19 + 0x18) + 8);
                    goto joined_r0x007801c8;
                  }
                  goto code_r0x007801d4;
                }
                if (*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) != 0) {
                  iVar4 = *(int *)(*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) + 8);
joined_r0x0077ff00:
                  if (iVar4 < 1) goto code_r0x0077f3c0;
                }
code_r0x007800a0:
                func_0x0073cab8();
              }
            }
            else {
              if (iVar4 != 2) {
                if (iVar4 != 1) goto code_r0x0077f3c0;
                *piVar7 = 0;
                goto code_r0x0077fda0;
              }
              lVar8 = *(long *)(unaff_x19 + 0x1b0) + uVar14 * 4;
              iVar4 = *(int *)(
                              "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                              + lVar8 + 0x18);
              if (iVar4 == 1) {
                pcVar9 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                         + lVar8 + 0x18;
                goto code_r0x0077fed4;
              }
code_r0x0077f950:
              if (iVar4 != 0) goto code_r0x0077f3c0;
code_r0x0077fbe8:
              *piVar7 = 0;
            }
            goto code_r0x0077f3c0;
          case 4:
            if (*(char *)(in_stack_00000040 + 3) < '\0') {
              if (uVar10 < 0x28) {
                lVar8 = *(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18);
code_r0x0077f6f8:
                if (lVar8 != 0) {
                  iVar4 = *(int *)(lVar8 + 8);
joined_r0x0077f964:
                  if (iVar4 < 1) goto LAB_0077f994;
                }
              }
              else {
                lVar8 = *(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18);
                if (uVar10 == 0xff) goto code_r0x0077f6f8;
                if (lVar8 != 0) {
                  iVar4 = *(int *)(lVar8 + 8);
                  goto joined_r0x0077f964;
                }
              }
              func_0x0073cab8();
            }
LAB_0077f994:
            *puVar12 = 1;
            lVar11 = *(long *)(unaff_x19 + 0x1b0);
            lVar8 = lVar11 + uVar14 * 4;
            piVar7 = (int *)(lVar8 + 8);
            iVar4 = *piVar7;
            if (iVar4 == 3) {
              if (*(int *)(lVar8 + 0x408) == 1) {
                *piVar7 = 1;
                *(undefined4 *)(lVar8 + 0x408) = 0;
              }
              else if (*(int *)(lVar8 + 0x408) == 0) {
                *piVar7 = 0;
              }
            }
            else if (iVar4 == 2) {
              lVar8 = lVar11 + uVar14 * 4;
              iVar4 = *(int *)(lVar8 + 0x408);
              if (iVar4 == 1) {
                *piVar7 = 3;
                pcVar9 = "/System/Library/Frameworks/CoreFoundation.framework/Versions/A/CoreFoundation"
                         + lVar8 + 0x18;
                pcVar9[0] = '\0';
                pcVar9[1] = '\0';
                pcVar9[2] = '\0';
                pcVar9[3] = '\0';
code_r0x0077fe68:
                uStack0000000000000058._5_2_ = 0xfcff;
                uStack0000000000000058._7_1_ = bVar3;
                lVar8 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                              (long)&uStack0000000000000058 + 5,3,0x80000);
                if (lVar8 < 0) {
                  ___error();
                  func_0x0073c9e4();
                }
                if (*(char *)(in_stack_00000040 + 3) < '\0') {
                  if ((uVar13 < 0x28) || (uVar13 == 0xff)) {
                    if (*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) != 0) {
                      iVar4 = *(int *)(*(long *)(
                                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                + unaff_x19 + 0x18) + 8);
                      goto joined_r0x0077ffb8;
                    }
                  }
                  else if (*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) != 0) {
                    iVar4 = *(int *)(*(long *)(
                                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                              + unaff_x19 + 0x18) + 8);
joined_r0x0077ffb8:
                    if (iVar4 < 1) goto code_r0x007801ac;
                  }
                  func_0x0073cab8();
                }
              }
              else if (iVar4 == 0) {
                *piVar7 = 1;
                goto code_r0x00780190;
              }
            }
            else if (iVar4 == 0) {
              lVar8 = lVar11 + uVar14 * 4;
              if (*(int *)(lVar8 + 0x808) == 1) {
                *piVar7 = 1;
                uStack0000000000000058._5_2_ = 0xfbff;
                uStack0000000000000058._7_1_ = bVar3;
                lVar8 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                              (long)&uStack0000000000000058 + 5,3,0x80000);
                if (lVar8 < 0) {
                  ___error();
                  func_0x0073c9e4();
                }
                if (-1 < *(char *)(in_stack_00000040 + 3)) goto code_r0x00780190;
                if ((uVar13 < 0x28) || (uVar10 == 0xff)) {
                  if (*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) != 0) {
                    iVar4 = *(int *)(*(long *)(
                                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                              + unaff_x19 + 0x18) + 8);
                    goto joined_r0x00780004;
                  }
                }
                else if (*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) != 0) {
                  iVar4 = *(int *)(*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) + 8);
joined_r0x00780004:
                  if (iVar4 < 1) goto code_r0x00780190;
                }
                func_0x0073cab8();
code_r0x00780190:
                if (*(int *)(&UNK_00001808 + lVar11 + uVar14 * 4) != 1) goto code_r0x007801ac;
              }
              else {
                if (*(int *)(&UNK_00001808 + lVar8) != 1) goto code_r0x0077fe68;
                *piVar7 = 1;
                uStack0000000000000058._5_2_ = 0xfbff;
                uStack0000000000000058._7_1_ = bVar3;
                lVar8 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                              (long)&uStack0000000000000058 + 5,3,0x80000);
                if (lVar8 < 0) {
                  ___error();
                  func_0x0073c9e4();
                }
                if (*(char *)(in_stack_00000040 + 3) < '\0') {
                  if ((uVar13 < 0x28) || (uVar13 == 0xff)) {
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
            puVar12[0x707] = 0;
            unaff_x23 = in_stack_00000048;
            break;
          case 5:
            if (*(char *)(in_stack_00000040 + 3) < '\0') {
              if (uVar10 < 0x28) {
                lVar8 = *(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18);
code_r0x0077f744:
                if (lVar8 != 0) {
                  iVar4 = *(int *)(lVar8 + 8);
joined_r0x0077fa84:
                  if (iVar4 < 1) goto code_r0x0077fab4;
                }
              }
              else {
                lVar8 = *(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18);
                if (uVar10 == 0xff) goto code_r0x0077f744;
                if (lVar8 != 0) {
                  iVar4 = *(int *)(lVar8 + 8);
                  goto joined_r0x0077fa84;
                }
              }
              func_0x0073cab8();
            }
code_r0x0077fab4:
            *puVar12 = 1;
            lVar8 = *(long *)(unaff_x19 + 0x1b0) + uVar14 * 4;
            piVar7 = (int *)(lVar8 + 8);
            iVar4 = *piVar7;
            if (iVar4 == 3) {
              iVar4 = *(int *)(lVar8 + 0x408);
              if (iVar4 != 1) goto code_r0x0077fbe4;
              *piVar7 = 2;
              *(undefined4 *)(lVar8 + 0x408) = 0;
              uStack0000000000000058._5_2_ = 0xfbff;
              uStack0000000000000058._7_1_ = bVar3;
              lVar8 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                            (long)&uStack0000000000000058 + 5,3,0x80000);
              if (lVar8 < 0) {
                ___error();
                func_0x0073c9e4();
              }
              if (-1 < *(char *)(in_stack_00000040 + 3)) goto code_r0x0077f3c0;
              if ((uVar13 < 0x28) || (uVar13 == 0xff)) {
                if (*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) == 0) goto code_r0x007800a0;
                iVar4 = *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8);
                goto joined_r0x0077ff00;
              }
              if (*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) == 0) goto code_r0x007801d4;
              iVar4 = *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + unaff_x19 + 0x18) + 8);
joined_r0x007801c8:
              if (iVar4 < 1) goto code_r0x0077f3c0;
            }
            else {
              if (iVar4 == 2) {
                lVar8 = *(long *)(unaff_x19 + 0x1b0) + uVar14 * 4;
                iVar4 = *(int *)(lVar8 + 0x408);
                if (iVar4 != 1) goto code_r0x0077fbe4;
                pcVar9 = (char *)(lVar8 + 0x408);
code_r0x0077fed4:
                *piVar7 = 0;
                pcVar9[0] = '\0';
                pcVar9[1] = '\0';
                pcVar9[2] = '\0';
                pcVar9[3] = '\0';
                goto code_r0x0077f3c0;
              }
              if (iVar4 != 1) goto code_r0x0077f3c0;
              *piVar7 = 0;
              uStack0000000000000058._5_2_ = 0xfcff;
              uStack0000000000000058._7_1_ = bVar3;
              lVar8 = _send(*(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x238),
                            (long)&uStack0000000000000058 + 5,3,0x80000);
              if (lVar8 < 0) {
                ___error();
                func_0x0073c9e4();
              }
              if (-1 < *(char *)(in_stack_00000040 + 3)) goto code_r0x0077f3c0;
              if ((uVar13 < 0x28) || (uVar10 == 0xff)) {
                if (*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) != 0) {
                  iVar4 = *(int *)(*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) + 8);
                  goto joined_r0x0077ff00;
                }
                goto code_r0x007800a0;
              }
              if (*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) != 0) {
                iVar4 = *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8);
                goto joined_r0x007801c8;
              }
            }
code_r0x007801d4:
            func_0x0073cab8();
code_r0x0077f3c0:
            puVar12[0x707] = 0;
            break;
          case 6:
            puVar12[0x707] = 0;
            if (uVar10 != 0) goto code_r0x0077fd78;
code_r0x0077f4c0:
            if ((-1 < iStack000000000000003c) &&
               (unaff_x26 = func_0x007738a0(), (int)unaff_x26 != 0)) {
              uVar10 = 0;
              unaff_w25 = 1;
              iVar4 = *(int *)(unaff_x19 + 0x998);
              goto joined_r0x00780314;
            }
            iStack000000000000003c = -1;
            break;
          case 7:
            if (uVar10 == 0xff) {
              puVar12[0x707] = 8;
            }
            else {
              pbVar6 = *(byte **)pbVar1;
              if (pbVar6 < pbVar1) {
                *(byte **)pbVar1 = pbVar6 + 1;
                *pbVar6 = bVar3;
              }
            }
            break;
          case 8:
            if (uVar10 != 0xf0) {
              if (uVar10 != 0xff) {
                pbVar6 = *(byte **)pbVar1;
                if (pbVar6 < pbVar1) {
                  *(byte **)pbVar1 = pbVar6 + 1;
                  *pbVar6 = 0xff;
                  pbVar6 = *(byte **)pbVar1;
                }
                if (pbVar6 < pbVar1) {
                  *(byte **)pbVar1 = pbVar6 + 1;
                  *pbVar6 = bVar3;
                  pbVar6 = *(byte **)pbVar1;
                }
                *(byte **)(puVar12 + 0x794) = pbVar6 + -2;
                *(undefined4 **)(puVar12 + 0x792) = puVar2;
                if (*(char *)(in_stack_00000040 + 3) < '\0') {
                  lVar8 = *(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18);
                  if (uVar10 - 0xec < 0x14) {
                    if (lVar8 != 0) {
                      iVar4 = *(int *)(lVar8 + 8);
joined_r0x0077fc78:
                      if (iVar4 < 1) goto code_r0x0077fca0;
                    }
                  }
                  else if (lVar8 != 0) {
                    iVar4 = *(int *)(lVar8 + 8);
                    goto joined_r0x0077fc78;
                  }
                  func_0x0073cab8();
                }
code_r0x0077fca0:
                func_0x00780868();
                puVar12[0x707] = 1;
                goto code_r0x0077fcb0;
              }
              pbVar6 = *(byte **)pbVar1;
              if (pbVar6 < pbVar1) {
                *(byte **)pbVar1 = pbVar6 + 1;
                *pbVar6 = 0xff;
              }
              goto code_r0x0077fcdc;
            }
            pbVar6 = *(byte **)pbVar1;
            if (pbVar6 < pbVar1) {
              *(byte **)pbVar1 = pbVar6 + 1;
              *pbVar6 = 0xff;
              pbVar6 = *(byte **)pbVar1;
            }
            if (pbVar6 < pbVar1) {
              *(byte **)pbVar1 = pbVar6 + 1;
              *pbVar6 = 0xf0;
              pbVar6 = *(byte **)pbVar1;
            }
            *(byte **)(puVar12 + 0x794) = pbVar6 + -2;
            *(undefined4 **)(puVar12 + 0x792) = puVar2;
            func_0x00780868();
            goto code_r0x0077f3c0;
          }
code_r0x0077f3c4:
          lVar5 = lVar5 + 1;
        } while (lStack0000000000000050 != lVar5);
        unaff_w25 = 1;
        if ((-1 < iStack000000000000003c) && (unaff_x26 = func_0x007738a0(), (int)unaff_x26 != 0))
        break;
      }
      if ((*unaff_x23 != 0) && (unaff_x23[1] == 0)) {
        func_0x0078043c();
        unaff_x23[1] = unaff_w25;
      }
      unaff_x26 = 0;
      if ((unaff_w27 >> 4 & 1) != 0) goto code_r0x007802b0;
      goto code_r0x0077f2f8;
    }
    uVar10 = unaff_w25;
    if ((int)unaff_x26 != 0x51) {
      uVar10 = 0;
    }
    iVar4 = *(int *)(unaff_x19 + 0x998);
  } while( true );
  iVar4 = *(int *)(unaff_x19 + 0x998);
  goto joined_r0x00780314;
}

