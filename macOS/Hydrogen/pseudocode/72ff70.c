
/* WARNING: Removing unreachable block (ram,0x007303f4) */
/* WARNING: Removing unreachable block (ram,0x00730410) */
/* WARNING: Removing unreachable block (ram,0x00730418) */
/* WARNING: Removing unreachable block (ram,0x00730424) */
/* WARNING: Removing unreachable block (ram,0x00730440) */

ulong FUN_0072ff70(void)

{
  undefined4 uVar1;
  undefined1 uVar2;
  ushort uVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  undefined4 *puVar7;
  ulong uVar8;
  undefined1 *puVar9;
  undefined1 uVar10;
  uint uVar11;
  ulong uVar12;
  long lVar13;
  long *unaff_x19;
  long unaff_x20;
  uint uVar14;
  int *unaff_x21;
  undefined8 uVar15;
  undefined1 *puVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  long unaff_x26;
  long lVar20;
  ulong *unaff_x28;
  long unaff_x29;
  undefined1 auVar21 [16];
  undefined1 auVar22 [12];
  undefined1 uStack0000000000000050;
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
  
  _uStack0000000000000050 = 1;
  iVar5 = _setsockopt(*(undefined4 *)(unaff_x26 + 0x98),6,1,&uStack0000000000000050,4);
  if (((iVar5 < 0) && (*(char *)((long)unaff_x28 + 3) < '\0')) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x20 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x20 + 0x18) + 8))))) {
    puVar7 = (undefined4 *)___error();
    func_0x0077ea88(*puVar7,&uStack0000000000000150,0x100);
    func_0x0073cab8();
  }
  _uStack0000000000000050 = 1;
  iVar5 = _setsockopt(*(undefined4 *)(unaff_x26 + 0x98),0xffff,"k/Versions/A/CoreFoundation",
                      &uStack0000000000000050,4);
  uVar12 = *unaff_x28;
  if (((iVar5 < 0) && ((int)uVar12 < 0)) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x20 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x20 + 0x18) + 8))))) {
    puVar7 = (undefined4 *)___error();
    func_0x0077ea88(*puVar7,&uStack0000000000000150,0x100);
    func_0x0073cab8();
    uVar12 = *unaff_x28;
  }
  if ((uVar12 >> 0x29 & 1) != 0) {
    func_0x0073087c();
  }
  if (*(long *)(unaff_x20 + 0x268) == 0) {
LAB_00730108:
    bVar4 = false;
code_r0x0073010c:
    iVar5 = *unaff_x21;
    if ((iVar5 == 0x1e) || (iVar5 == 2)) {
      lVar13 = unaff_x19[3];
      uVar1 = *(undefined4 *)(unaff_x26 + 0x98);
      uVar12 = func_0x0075af24(unaff_x26 + 0x18);
      uVar3 = *(ushort *)(unaff_x20 + 0xa0e);
      uVar11 = (uint)*(ushort *)(unaff_x20 + 0xa10);
      lVar18 = *(long *)(unaff_x20 + 2000);
      lVar19 = *(long *)(unaff_x20 + 0x7d8);
      lVar20 = *(long *)(unaff_x20 + 0x7e0);
      lVar17 = lVar18;
      if (lVar19 != 0) {
        lVar17 = lVar19;
      }
      uVar14 = (uint)uVar3;
      if (((lVar17 != 0) || (lVar20 != 0 || lVar18 != 0)) || (uVar14 != 0)) {
        if (lVar17 == 0) {
          if (lVar20 == 0 && lVar18 == 0) {
            if (iVar5 != 2) {
              if (iVar5 == 0x1e) {
                *(undefined1 *)(unaff_x29 + -0xef) = 0x1e;
                *(ushort *)(unaff_x29 + -0xee) = uVar3 >> 8 | (ushort)((uVar14 & 0xff00ff) << 8);
                goto LAB_00730344;
              }
              goto LAB_007305b0;
            }
            *(undefined1 *)(unaff_x29 + -0xef) = 2;
            *(ushort *)(unaff_x29 + -0xee) = uVar3 >> 8 | (ushort)((uVar14 & 0xff00ff) << 8);
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
          if (lVar20 == 0) {
            iVar6 = func_0x0075b008(iVar5,uVar12,*(undefined4 *)(lVar13 + 0x520),lVar17,
                                    &uStack0000000000000150,0x100);
            if (iVar6 == 2) {
              if ((*(char *)((long)unaff_x28 + 3) < '\0') &&
                 ((*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x20 + 0x18) == 0 ||
                  (0 < *(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + unaff_x20 + 0x18) + 8))))) {
                func_0x0073cab8();
              }
              if (lVar19 != 0) {
                if (iVar5 == 2) {
                  iVar5 = _inet_pton(2,&uStack0000000000000150,unaff_x29 - 0xf0U | 4);
                  if (iVar5 < 1) goto LAB_007305b0;
                  *(undefined1 *)(unaff_x29 + -0xef) = 2;
                  *(ushort *)(unaff_x29 + -0xee) = uVar3 >> 8 | (ushort)((uVar14 & 0xff00ff) << 8);
                  uVar15 = 0x10;
                }
                else if (iVar5 == 0x1e) {
                  puVar9 = (undefined1 *)_strchr(&uStack0000000000000150,0x25);
                  puVar16 = puVar9;
                  if (puVar9 != (undefined1 *)0x0) {
                    puVar16 = puVar9 + 1;
                    *puVar9 = 0;
                  }
                  iVar5 = _inet_pton(0x1e,&uStack0000000000000150,unaff_x29 - 0xf0U | 8);
                  if (0 < iVar5) {
                    *(undefined1 *)(unaff_x29 + -0xef) = 0x1e;
                    *(ushort *)(unaff_x29 + -0xee) = uVar3 >> 8 | (ushort)((uVar14 & 0xff00ff) << 8)
                    ;
                    if (puVar16 != (undefined1 *)0x0) {
                      uVar12 = _strtoul(puVar16,0,10);
                      if (uVar12 >> 0x20 != 0) {
                        uVar11 = 1;
                        goto FUN_007306c0;
                      }
                      *(int *)(unaff_x29 + -0xd8) = (int)uVar12;
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
                iVar5 = _bind(uVar1,unaff_x29 + -0xf0,uVar15);
                while (iVar5 < 0) {
                  uVar14 = uVar14 + 1;
                  if (((int)uVar11 < 2) || ((uVar14 & 0xffff) == 0)) {
                    puVar7 = (undefined4 *)___error();
                    uVar1 = *puVar7;
                    *(undefined4 *)(unaff_x20 + 0xc54) = uVar1;
                    func_0x0077ea88(uVar1,&uStack0000000000000150,0x100);
                    goto LAB_007306b4;
                  }
                  if ((*(char *)((long)unaff_x28 + 3) < '\0') &&
                     ((*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x20 + 0x18) == 0 ||
                      (0 < *(int *)(*(long *)(
                                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                             + unaff_x20 + 0x18) + 8))))) {
                    func_0x0073cab8();
                  }
                  *(ushort *)(unaff_x29 + -0xee) =
                       (ushort)(uVar14 >> 8) & 0xff | (ushort)((uVar14 & 0xff00ff) << 8);
                  iVar5 = _bind(uVar1,unaff_x29 + -0xf0,uVar15);
                  uVar11 = uVar11 - 1;
                }
                if ((*(char *)((long)unaff_x28 + 3) < '\0') &&
                   ((*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x20 + 0x18) == 0 ||
                    (0 < *(int *)(*(long *)(
                                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                           + unaff_x20 + 0x18) + 8))))) {
                  func_0x0073cab8();
                }
                *(ulong *)(lVar13 + 0x398) = *(ulong *)(lVar13 + 0x398) | 0x100000;
                goto code_r0x00730180;
              }
              goto code_r0x007302f8;
            }
            uVar11 = 1;
            if (iVar6 == 1) goto FUN_007306c0;
            if (iVar6 != 0) {
              if (lVar19 == 0) goto code_r0x007302f8;
              goto code_r0x00730460;
            }
            if (lVar19 == 0) goto code_r0x007302f8;
            puVar7 = (undefined4 *)___error();
            uVar1 = *puVar7;
            *(undefined4 *)(unaff_x20 + 0xc54) = uVar1;
            func_0x0077ea88(uVar1,&uStack0000000000000050,0x100);
          }
          else {
code_r0x007302f8:
            uVar2 = *(undefined1 *)(lVar13 + 0x52b);
            if (iVar5 == 2) {
              uVar10 = 1;
code_r0x007303b8:
              *(undefined1 *)(lVar13 + 0x52b) = uVar10;
            }
            else if (iVar5 == 0x1e) {
              uVar10 = 2;
              goto code_r0x007303b8;
            }
            iVar5 = func_0x0074f754();
            if (iVar5 == 1) {
              func_0x00728b3c();
            }
            *(undefined1 *)(lVar13 + 0x52b) = uVar2;
code_r0x00730460:
            *(uint *)(&UNK_00001344 + unaff_x20) = *(uint *)(&UNK_00001344 + unaff_x20) & 0xffffffdf
            ;
            puVar7 = (undefined4 *)___error();
            uVar1 = *puVar7;
            *(undefined4 *)(unaff_x20 + 0xc54) = uVar1;
            func_0x0077ea88(uVar1,&uStack0000000000000050,0x100);
          }
LAB_007306b4:
          func_0x0073c9e4();
          uVar11 = 0x2d;
        }
        else {
          uVar8 = _strlen(lVar17);
          if (uVar8 < 0xff) {
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
            iVar6 = _setsockopt(uVar1,0xffff,"eworks/CoreServices.framework/Versions/A/CoreServices"
                                ,lVar17,(int)uVar8 + 1);
            uVar12 = uVar12 & 0xffffffff;
            if ((iVar6 != 0) || (lVar20 != 0)) goto LAB_007302f0;
            if ((*(char *)((long)unaff_x28 + 3) < '\0') &&
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
          uVar11 = 0x2b;
        }
FUN_007306c0:
        uVar14 = 7;
        if (uVar11 != 1) {
          uVar14 = uVar11;
        }
        uVar12 = (ulong)uVar14;
        goto LAB_0072fe24;
      }
    }
code_r0x00730180:
    iVar5 = func_0x0076d02c(*(undefined4 *)(unaff_x26 + 0x98),1);
    if (iVar5 < 0) {
      puVar7 = (undefined4 *)___error();
      *(undefined4 *)(unaff_x26 + 0x130) = *puVar7;
      uVar12 = 1;
      goto LAB_0072fe24;
    }
    *(byte *)(unaff_x26 + 0x134) =
         *(byte *)(unaff_x26 + 0x134) & 0xf7 | (*(int *)(unaff_x26 + 0xc) != 2) << 3;
    if (bVar4) {
      func_0x0072fadc(unaff_x19[2]);
      auVar21 = func_0x00782d28();
      uVar12 = 0;
      *(undefined1 (*) [16])(unaff_x26 + 0x110) = auVar21;
      *(byte *)((long)unaff_x19 + 0x24) = *(byte *)((long)unaff_x19 + 0x24) | 1;
    }
    else {
      uVar12 = 0;
    }
  }
  else {
    bVar4 = true;
    func_0x0076bad4();
    iVar5 = (**(code **)(unaff_x20 + 0x268))
                      (*(undefined8 *)(unaff_x20 + 0x270),*(undefined4 *)(unaff_x26 + 0x98),0);
    func_0x0076bad4();
    if (iVar5 == 2) goto code_r0x0073010c;
    if (iVar5 == 0) goto LAB_00730108;
    uVar12 = 0x2a;
LAB_0072fe24:
    iVar5 = *(int *)(unaff_x26 + 0x98);
    if (iVar5 != -1) {
      lVar17 = unaff_x19[3];
      if ((lVar17 == 0) || (lVar13 = *(long *)(lVar17 + 0x20), func_0x0076b038(), lVar13 == 0)) {
        _close(iVar5);
      }
      else {
        func_0x0076bad4();
        (**(code **)(lVar17 + 0x20))(*(undefined8 *)(lVar17 + 0x28),iVar5);
        func_0x0076bad4();
      }
      *(undefined4 *)(unaff_x26 + 0x98) = 0xffffffff;
    }
  }
  if (*(char *)(unaff_x20 + 0xa1d) < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x20 + 0x18) == 0) {
      if (unaff_x19 == (long *)0x0) goto code_r0x0072fed8;
    }
    else if ((unaff_x19 == (long *)0x0) ||
            (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x20 + 0x18) + 8) < 1)) goto code_r0x0072fed8;
    if (0 < *(int *)(*unaff_x19 + 0xc)) {
      func_0x0073cbdc();
    }
  }
code_r0x0072fed8:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return uVar12;
  }
  auVar22 = ___stack_chk_fail();
  lVar17 = auVar22._0_8_;
  if (auVar22._8_4_ == 0) {
                    /* WARNING: Could not recover jumptable at 0x007b3250. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar12 = (*(code *)PTR__connect_00a24cd0)
                       (*(undefined4 *)(lVar17 + 0x98),lVar17 + 0x18,*(undefined4 *)(lVar17 + 0x14))
    ;
    return uVar12;
  }
  auStack_38[0] = 0;
  uStack_30 = 0;
  uStack_28 = 0;
  lStack_20 = lVar17 + 0x18;
  uStack_18 = *(undefined4 *)(lVar17 + 0x14);
  uVar12 = _connectx(*(undefined4 *)(lVar17 + 0x98),auStack_38,0,3,0,0,0,0);
  return uVar12;
}

