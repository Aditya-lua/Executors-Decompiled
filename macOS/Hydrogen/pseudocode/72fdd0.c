
/* WARNING: Removing unreachable block (ram,0x007303f4) */
/* WARNING: Removing unreachable block (ram,0x00730410) */
/* WARNING: Removing unreachable block (ram,0x00730418) */
/* WARNING: Removing unreachable block (ram,0x00730424) */
/* WARNING: Removing unreachable block (ram,0x00730440) */

ulong FUN_0072fdd0(int param_1)

{
  ulong *puVar1;
  undefined4 uVar2;
  undefined1 uVar3;
  ushort uVar4;
  bool bVar5;
  int iVar6;
  int iVar7;
  undefined4 *puVar8;
  ulong uVar9;
  undefined1 *puVar10;
  undefined1 uVar11;
  uint uVar12;
  long *unaff_x19;
  long unaff_x20;
  uint uVar13;
  int *unaff_x21;
  ulong uVar14;
  undefined8 uVar15;
  undefined1 *puVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  long unaff_x26;
  long lVar21;
  long unaff_x29;
  undefined1 auVar22 [16];
  undefined1 auVar23 [12];
  undefined4 uStack0000000000000050;
  undefined8 uStack0000000000000150;
  undefined8 in_stack_00000158;
  undefined8 in_stack_00000160;
  undefined8 in_stack_00000168;
  undefined8 in_stack_00000170;
  undefined8 in_stack_00000178;
  undefined8 in_stack_00000180;
  undefined8 in_stack_00000188;
  undefined8 in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined8 in_stack_000001b0;
  undefined8 in_stack_000001b8;
  undefined8 in_stack_000001c0;
  undefined8 in_stack_000001c8;
  undefined8 in_stack_000001d0;
  undefined8 in_stack_000001d8;
  undefined8 in_stack_000001e0;
  undefined8 in_stack_000001e8;
  undefined4 auStack_38 [2];
  undefined8 uStack_30;
  undefined4 uStack_28;
  long lStack_20;
  undefined4 uStack_18;
  
  *(int *)(unaff_x26 + 0x98) = param_1;
  if (param_1 == -1) {
    uVar14 = 7;
LAB_0072fe24:
    iVar6 = *(int *)(unaff_x26 + 0x98);
    if (iVar6 != -1) {
      lVar17 = unaff_x19[3];
      if ((lVar17 == 0) || (lVar19 = *(long *)(lVar17 + 0x20), func_0x0076b038(), lVar19 == 0)) {
        _close(iVar6);
      }
      else {
        func_0x0076bad4();
        (**(code **)(lVar17 + 0x20))(*(undefined8 *)(lVar17 + 0x28),iVar6);
        func_0x0076bad4();
      }
      *(undefined4 *)(unaff_x26 + 0x98) = 0xffffffff;
    }
  }
  else {
    iVar6 = *(int *)(*(long *)(unaff_x20 + 0x18) + 0x520);
    if ((iVar6 != 0) && (*unaff_x21 == 0x1e)) {
      *(int *)(unaff_x26 + 0x30) = iVar6;
    }
    lVar17 = unaff_x19[2];
    uVar14 = func_0x00734e00(lVar17 + 0x18,*(undefined4 *)(lVar17 + 0x14),lVar17 + 0x9c,
                             lVar17 + 0xf8);
    if ((uVar14 & 1) == 0) {
      puVar8 = (undefined4 *)___error();
      *(undefined4 *)(lVar17 + 0x130) = *puVar8;
      ___error();
      puVar8 = (undefined4 *)___error();
      func_0x0077ea88(*puVar8,&uStack0000000000000150,0x100);
      func_0x0073c9e4();
      uVar14 = 2;
      goto LAB_0072fe24;
    }
    puVar1 = (ulong *)(unaff_x20 + 0xa1a);
    if (*unaff_x21 == 0x1e) {
      if ((int)*puVar1 < 0) {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x20 + 0x18) != 0) {
          iVar6 = *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x20 + 0x18) + 8);
joined_r0x0072ff28:
          if (iVar6 < 1) goto code_r0x0072ff48;
        }
code_r0x0072ff34:
        func_0x0073cab8();
      }
    }
    else if ((int)*puVar1 < 0) {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x20 + 0x18) != 0) {
        iVar6 = *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x20 + 0x18) + 8);
        goto joined_r0x0072ff28;
      }
      goto code_r0x0072ff34;
    }
code_r0x0072ff48:
    if (((*unaff_x21 == 0x1e) || (*unaff_x21 == 2)) && (*(int *)(unaff_x26 + 0xc) == 1)) {
      if ((*(byte *)(unaff_x20 + 0xa1e) >> 3 & 1) != 0) {
        uStack0000000000000050 = 1;
        iVar6 = _setsockopt(*(undefined4 *)(unaff_x26 + 0x98),6,1,&uStack0000000000000050,4);
        if (((iVar6 < 0) && (*(char *)(unaff_x20 + 0xa1d) < '\0')) &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x20 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x20 + 0x18) + 8))))) {
          puVar8 = (undefined4 *)___error();
          func_0x0077ea88(*puVar8,&uStack0000000000000150,0x100);
          func_0x0073cab8();
        }
      }
      uStack0000000000000050 = 1;
      iVar6 = _setsockopt(*(undefined4 *)(unaff_x26 + 0x98),0xffff,"k/Versions/A/CoreFoundation",
                          &uStack0000000000000050,4);
      uVar14 = *puVar1;
      if (((iVar6 < 0) && ((int)uVar14 < 0)) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x20 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x20 + 0x18) + 8))))) {
        puVar8 = (undefined4 *)___error();
        func_0x0077ea88(*puVar8,&uStack0000000000000150,0x100);
        func_0x0073cab8();
        uVar14 = *puVar1;
      }
      if ((uVar14 >> 0x29 & 1) != 0) {
        func_0x0073087c();
      }
    }
    else {
      uStack0000000000000050 = 1;
      iVar6 = _setsockopt(*(undefined4 *)(unaff_x26 + 0x98),0xffff,"k/Versions/A/CoreFoundation",
                          &uStack0000000000000050,4);
      if (((iVar6 < 0) && (*(char *)(unaff_x20 + 0xa1d) < '\0')) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x20 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x20 + 0x18) + 8))))) {
        puVar8 = (undefined4 *)___error();
        func_0x0077ea88(*puVar8,&uStack0000000000000150,0x100);
        func_0x0073cab8();
      }
    }
    if (*(long *)(unaff_x20 + 0x268) == 0) {
LAB_00730108:
      bVar5 = false;
    }
    else {
      bVar5 = true;
      func_0x0076bad4();
      iVar6 = (**(code **)(unaff_x20 + 0x268))
                        (*(undefined8 *)(unaff_x20 + 0x270),*(undefined4 *)(unaff_x26 + 0x98),0);
      func_0x0076bad4();
      if (iVar6 != 2) {
        if (iVar6 != 0) {
          uVar14 = 0x2a;
          goto LAB_0072fe24;
        }
        goto LAB_00730108;
      }
    }
    iVar6 = *unaff_x21;
    if ((iVar6 == 0x1e) || (iVar6 == 2)) {
      lVar19 = unaff_x19[3];
      uVar2 = *(undefined4 *)(unaff_x26 + 0x98);
      uVar14 = func_0x0075af24(unaff_x26 + 0x18);
      uVar4 = *(ushort *)(unaff_x20 + 0xa0e);
      uVar12 = (uint)*(ushort *)(unaff_x20 + 0xa10);
      lVar18 = *(long *)(unaff_x20 + 2000);
      lVar20 = *(long *)(unaff_x20 + 0x7d8);
      lVar21 = *(long *)(unaff_x20 + 0x7e0);
      lVar17 = lVar18;
      if (lVar20 != 0) {
        lVar17 = lVar20;
      }
      uVar13 = (uint)uVar4;
      if (((lVar17 != 0) || (lVar21 != 0 || lVar18 != 0)) || (uVar13 != 0)) {
        if (lVar17 == 0) {
          if (lVar21 == 0 && lVar18 == 0) {
            if (iVar6 != 2) {
              if (iVar6 == 0x1e) {
                *(undefined1 *)(unaff_x29 + -0xef) = 0x1e;
                *(ushort *)(unaff_x29 + -0xee) = uVar4 >> 8 | (ushort)((uVar13 & 0xff00ff) << 8);
                goto LAB_00730344;
              }
              goto LAB_007305b0;
            }
            *(undefined1 *)(unaff_x29 + -0xef) = 2;
            *(ushort *)(unaff_x29 + -0xee) = uVar4 >> 8 | (ushort)((uVar13 & 0xff00ff) << 8);
            uVar15 = 0x10;
            goto LAB_007305b4;
          }
          in_stack_000001d8 = 0;
          in_stack_000001d0 = 0;
          in_stack_000001e8 = 0;
          in_stack_000001e0 = 0;
          in_stack_000001b8 = 0;
          in_stack_000001b0 = 0;
          in_stack_000001c8 = 0;
          in_stack_000001c0 = 0;
          in_stack_00000198 = 0;
          in_stack_00000190 = 0;
          in_stack_000001a8 = 0;
          in_stack_000001a0 = 0;
          in_stack_00000178 = 0;
          in_stack_00000170 = 0;
          in_stack_00000188 = 0;
          in_stack_00000180 = 0;
          in_stack_00000158 = 0;
          uStack0000000000000150 = 0;
          in_stack_00000168 = 0;
          in_stack_00000160 = 0;
LAB_007302f0:
          if (lVar21 == 0) {
            iVar7 = func_0x0075b008(iVar6,uVar14,*(undefined4 *)(lVar19 + 0x520),lVar17,
                                    &uStack0000000000000150,0x100);
            if (iVar7 == 2) {
              if ((*(char *)(unaff_x20 + 0xa1d) < '\0') &&
                 ((*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x20 + 0x18) == 0 ||
                  (0 < *(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + unaff_x20 + 0x18) + 8))))) {
                func_0x0073cab8();
              }
              if (lVar20 != 0) {
                if (iVar6 == 2) {
                  iVar6 = _inet_pton(2,&uStack0000000000000150,unaff_x29 - 0xf0U | 4);
                  if (iVar6 < 1) goto LAB_007305b0;
                  *(undefined1 *)(unaff_x29 + -0xef) = 2;
                  *(ushort *)(unaff_x29 + -0xee) = uVar4 >> 8 | (ushort)((uVar13 & 0xff00ff) << 8);
                  uVar15 = 0x10;
                }
                else if (iVar6 == 0x1e) {
                  puVar10 = (undefined1 *)_strchr(&uStack0000000000000150,0x25);
                  puVar16 = puVar10;
                  if (puVar10 != (undefined1 *)0x0) {
                    puVar16 = puVar10 + 1;
                    *puVar10 = 0;
                  }
                  iVar6 = _inet_pton(0x1e,&uStack0000000000000150,unaff_x29 - 0xf0U | 8);
                  if (0 < iVar6) {
                    *(undefined1 *)(unaff_x29 + -0xef) = 0x1e;
                    *(ushort *)(unaff_x29 + -0xee) = uVar4 >> 8 | (ushort)((uVar13 & 0xff00ff) << 8)
                    ;
                    if (puVar16 != (undefined1 *)0x0) {
                      uVar14 = _strtoul(puVar16,0,10);
                      if (uVar14 >> 0x20 != 0) {
                        uVar12 = 1;
                        goto FUN_007306c0;
                      }
                      *(int *)(unaff_x29 + -0xd8) = (int)uVar14;
                    }
                  }
LAB_00730344:
                  uVar15 = 0x1c;
                }
                else {
LAB_007305b0:
                  uVar15 = 0;
                }
LAB_007305b4:
                iVar6 = _bind(uVar2,unaff_x29 + -0xf0,uVar15);
                while (iVar6 < 0) {
                  uVar13 = uVar13 + 1;
                  if (((int)uVar12 < 2) || ((uVar13 & 0xffff) == 0)) {
                    puVar8 = (undefined4 *)___error();
                    uVar2 = *puVar8;
                    *(undefined4 *)(unaff_x20 + 0xc54) = uVar2;
                    func_0x0077ea88(uVar2,&uStack0000000000000150,0x100);
                    goto LAB_007306b4;
                  }
                  if ((*(char *)(unaff_x20 + 0xa1d) < '\0') &&
                     ((*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x20 + 0x18) == 0 ||
                      (0 < *(int *)(*(long *)(
                                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                             + unaff_x20 + 0x18) + 8))))) {
                    func_0x0073cab8();
                  }
                  *(ushort *)(unaff_x29 + -0xee) =
                       (ushort)(uVar13 >> 8) & 0xff | (ushort)((uVar13 & 0xff00ff) << 8);
                  iVar6 = _bind(uVar2,unaff_x29 + -0xf0,uVar15);
                  uVar12 = uVar12 - 1;
                }
                if ((*(char *)(unaff_x20 + 0xa1d) < '\0') &&
                   ((*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x20 + 0x18) == 0 ||
                    (0 < *(int *)(*(long *)(
                                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                           + unaff_x20 + 0x18) + 8))))) {
                  func_0x0073cab8();
                }
                *(ulong *)(lVar19 + 0x398) = *(ulong *)(lVar19 + 0x398) | 0x100000;
                goto code_r0x00730180;
              }
              goto code_r0x007302f8;
            }
            uVar12 = 1;
            if (iVar7 == 1) goto FUN_007306c0;
            if (iVar7 != 0) {
              if (lVar20 == 0) goto code_r0x007302f8;
              goto code_r0x00730460;
            }
            if (lVar20 == 0) goto code_r0x007302f8;
            puVar8 = (undefined4 *)___error();
            uVar2 = *puVar8;
            *(undefined4 *)(unaff_x20 + 0xc54) = uVar2;
            func_0x0077ea88(uVar2,&uStack0000000000000050,0x100);
          }
          else {
code_r0x007302f8:
            uVar3 = *(undefined1 *)(lVar19 + 0x52b);
            if (iVar6 == 2) {
              uVar11 = 1;
code_r0x007303b8:
              *(undefined1 *)(lVar19 + 0x52b) = uVar11;
            }
            else if (iVar6 == 0x1e) {
              uVar11 = 2;
              goto code_r0x007303b8;
            }
            iVar6 = func_0x0074f754();
            if (iVar6 == 1) {
              func_0x00728b3c();
            }
            *(undefined1 *)(lVar19 + 0x52b) = uVar3;
code_r0x00730460:
            *(uint *)(&UNK_00001344 + unaff_x20) = *(uint *)(&UNK_00001344 + unaff_x20) & 0xffffffdf
            ;
            puVar8 = (undefined4 *)___error();
            uVar2 = *puVar8;
            *(undefined4 *)(unaff_x20 + 0xc54) = uVar2;
            func_0x0077ea88(uVar2,&uStack0000000000000050,0x100);
          }
LAB_007306b4:
          func_0x0073c9e4();
          uVar12 = 0x2d;
        }
        else {
          uVar9 = _strlen(lVar17);
          if (uVar9 < 0xff) {
            in_stack_000001d8 = 0;
            in_stack_000001d0 = 0;
            in_stack_000001e8 = 0;
            in_stack_000001e0 = 0;
            in_stack_000001b8 = 0;
            in_stack_000001b0 = 0;
            in_stack_000001c8 = 0;
            in_stack_000001c0 = 0;
            in_stack_00000198 = 0;
            in_stack_00000190 = 0;
            in_stack_000001a8 = 0;
            in_stack_000001a0 = 0;
            in_stack_00000178 = 0;
            in_stack_00000170 = 0;
            in_stack_00000188 = 0;
            in_stack_00000180 = 0;
            in_stack_00000158 = 0;
            uStack0000000000000150 = 0;
            in_stack_00000168 = 0;
            in_stack_00000160 = 0;
            iVar7 = _setsockopt(uVar2,0xffff,"eworks/CoreServices.framework/Versions/A/CoreServices"
                                ,lVar17,(int)uVar9 + 1);
            uVar14 = uVar14 & 0xffffffff;
            if ((iVar7 != 0) || (lVar21 != 0)) goto LAB_007302f0;
            if ((*(char *)(unaff_x20 + 0xa1d) < '\0') &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x20 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x20 + 0x18) + 8))))) {
              func_0x0073cab8();
            }
            goto code_r0x00730180;
          }
          uVar12 = 0x2b;
        }
FUN_007306c0:
        uVar13 = 7;
        if (uVar12 != 1) {
          uVar13 = uVar12;
        }
        uVar14 = (ulong)uVar13;
        goto LAB_0072fe24;
      }
    }
code_r0x00730180:
    iVar6 = func_0x0076d02c(*(undefined4 *)(unaff_x26 + 0x98),1);
    if (iVar6 < 0) {
      puVar8 = (undefined4 *)___error();
      *(undefined4 *)(unaff_x26 + 0x130) = *puVar8;
      uVar14 = 1;
      goto LAB_0072fe24;
    }
    *(byte *)(unaff_x26 + 0x134) =
         *(byte *)(unaff_x26 + 0x134) & 0xf7 | (*(int *)(unaff_x26 + 0xc) != 2) << 3;
    if (bVar5) {
      func_0x0072fadc(unaff_x19[2]);
      auVar22 = func_0x00782d28();
      uVar14 = 0;
      *(undefined1 (*) [16])(unaff_x26 + 0x110) = auVar22;
      *(byte *)((long)unaff_x19 + 0x24) = *(byte *)((long)unaff_x19 + 0x24) | 1;
    }
    else {
      uVar14 = 0;
    }
  }
  if (*(char *)(unaff_x20 + 0xa1d) < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x20 + 0x18) == 0) {
      if (unaff_x19 == (long *)0x0) goto LAB_0072fed8;
    }
    else if ((unaff_x19 == (long *)0x0) ||
            (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x20 + 0x18) + 8) < 1)) goto LAB_0072fed8;
    if (0 < *(int *)(*unaff_x19 + 0xc)) {
      func_0x0073cbdc();
    }
  }
LAB_0072fed8:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return uVar14;
  }
  auVar23 = ___stack_chk_fail();
  lVar17 = auVar23._0_8_;
  if (auVar23._8_4_ == 0) {
                    /* WARNING: Could not recover jumptable at 0x007b3250. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar14 = (*(code *)PTR__connect_00a24cd0)
                       (*(undefined4 *)(lVar17 + 0x98),lVar17 + 0x18,*(undefined4 *)(lVar17 + 0x14))
    ;
    return uVar14;
  }
  auStack_38[0] = 0;
  uStack_30 = 0;
  uStack_28 = 0;
  lStack_20 = lVar17 + 0x18;
  uStack_18 = *(undefined4 *)(lVar17 + 0x14);
  uVar14 = _connectx(*(undefined4 *)(lVar17 + 0x98),auStack_38,0,3,0,0,0,0);
  return uVar14;
}

