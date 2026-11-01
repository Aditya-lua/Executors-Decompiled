
ulong FUN_007301e0(void)

{
  uint uVar1;
  undefined4 uVar2;
  undefined1 uVar3;
  ushort uVar4;
  uint uVar5;
  int iVar6;
  ulong uVar7;
  undefined4 *puVar8;
  undefined1 *puVar9;
  undefined1 uVar10;
  int in_w8;
  long *unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  int unaff_w22;
  undefined8 uVar11;
  undefined1 *puVar12;
  long lVar13;
  long lVar14;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  undefined8 *unaff_x28;
  long unaff_x29;
  undefined1 auVar15 [16];
  undefined1 auVar16 [12];
  long in_stack_00000028;
  int iStack0000000000000030;
  undefined4 uStack0000000000000034;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  long *in_stack_00000048;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000150;
  undefined4 auStack_38 [2];
  undefined8 uStack_30;
  undefined4 uStack_28;
  long lStack_20;
  undefined4 uStack_18;
  
  uVar4 = (ushort)(unaff_w21 >> 8);
  if (unaff_x24 == 0) {
    unaff_x28[0x2d] = 0;
    unaff_x28[0x2c] = 0;
    unaff_x28[0x2f] = 0;
    unaff_x28[0x2e] = 0;
    unaff_x28[0x29] = 0;
    unaff_x28[0x28] = 0;
    unaff_x28[0x2b] = 0;
    unaff_x28[0x2a] = 0;
    unaff_x28[0x25] = 0;
    unaff_x28[0x24] = 0;
    unaff_x28[0x27] = 0;
    unaff_x28[0x26] = 0;
    unaff_x28[0x21] = 0;
    unaff_x28[0x20] = 0;
    unaff_x28[0x23] = 0;
    unaff_x28[0x22] = 0;
    if (in_w8 == 0) {
      if (unaff_w22 == 2) {
        *(undefined1 *)(unaff_x29 + -0xef) = 2;
        *(ushort *)(unaff_x29 + -0xee) = uVar4 & 0xff | (ushort)((unaff_w21 & 0xff00ff) << 8);
        uVar11 = 0x10;
      }
      else {
        if (unaff_w22 != 0x1e) goto LAB_007305b0;
        *(undefined1 *)(unaff_x29 + -0xef) = 0x1e;
        *(ushort *)(unaff_x29 + -0xee) = uVar4 & 0xff | (ushort)((unaff_w21 & 0xff00ff) << 8);
code_r0x00730344:
        uVar11 = 0x1c;
      }
code_r0x007305b4:
      iVar6 = _bind(uStack0000000000000034,unaff_x29 + -0xf0,uVar11);
      while (iVar6 < 0) {
        unaff_w21 = unaff_w21 + 1;
        if ((iStack0000000000000030 < 2) || ((unaff_w21 & 0xffff) == 0)) {
          puVar8 = (undefined4 *)___error();
          uVar2 = *puVar8;
          *(undefined4 *)(unaff_x20 + 0xc54) = uVar2;
          func_0x0077ea88(uVar2,&uStack0000000000000150,0x100);
          goto LAB_007306b4;
        }
        if ((*(char *)(in_stack_00000028 + 3) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x20 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x20 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        *(ushort *)(unaff_x29 + -0xee) =
             (ushort)(unaff_w21 >> 8) & 0xff | (ushort)((unaff_w21 & 0xff00ff) << 8);
        iVar6 = _bind(uStack0000000000000034,unaff_x29 + -0xf0,uVar11);
        iStack0000000000000030 = iStack0000000000000030 + -1;
      }
      if ((*(char *)(in_stack_00000028 + 3) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x20 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x20 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      *(ulong *)(in_stack_00000038 + 0x398) = *(ulong *)(in_stack_00000038 + 0x398) | 0x100000;
      goto LAB_0073017c;
    }
    unaff_x28[0x1d] = 0;
    unaff_x28[0x1c] = 0;
    unaff_x28[0x1f] = 0;
    unaff_x28[0x1e] = 0;
    unaff_x28[0x19] = 0;
    unaff_x28[0x18] = 0;
    unaff_x28[0x1b] = 0;
    unaff_x28[0x1a] = 0;
    unaff_x28[0x15] = 0;
    unaff_x28[0x14] = 0;
    unaff_x28[0x17] = 0;
    unaff_x28[0x16] = 0;
    unaff_x28[0x11] = 0;
    unaff_x28[0x10] = 0;
    unaff_x28[0x13] = 0;
    unaff_x28[0x12] = 0;
    unaff_x28[0xd] = 0;
    unaff_x28[0xc] = 0;
    unaff_x28[0xf] = 0;
    unaff_x28[0xe] = 0;
    unaff_x28[9] = 0;
    unaff_x28[8] = 0;
    unaff_x28[0xb] = 0;
    unaff_x28[10] = 0;
    unaff_x28[5] = 0;
    unaff_x28[4] = 0;
    unaff_x28[7] = 0;
    unaff_x28[6] = 0;
    unaff_x28[1] = 0;
    *unaff_x28 = 0;
    unaff_x28[3] = 0;
    unaff_x28[2] = 0;
code_r0x007302f0:
    if (unaff_x27 == 0) {
      iVar6 = func_0x0075b008();
      if (iVar6 == 2) {
        if ((*(char *)(in_stack_00000028 + 3) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x20 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x20 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        if (unaff_x25 == 0) goto LAB_007302f8;
code_r0x00730500:
        if (unaff_w22 == 2) {
          iVar6 = _inet_pton(2,&uStack0000000000000150,unaff_x29 - 0xf0U | 4);
          if (0 < iVar6) {
            *(undefined1 *)(unaff_x29 + -0xef) = 2;
            *(ushort *)(unaff_x29 + -0xee) = uVar4 & 0xff | (ushort)((unaff_w21 & 0xff00ff) << 8);
            uVar11 = 0x10;
            goto code_r0x007305b4;
          }
        }
        else if (unaff_w22 == 0x1e) {
          puVar9 = (undefined1 *)_strchr(&uStack0000000000000150,0x25);
          puVar12 = puVar9;
          if (puVar9 != (undefined1 *)0x0) {
            puVar12 = puVar9 + 1;
            *puVar9 = 0;
          }
          iVar6 = _inet_pton(0x1e,&uStack0000000000000150,unaff_x29 - 0xf0U | 8);
          if (0 < iVar6) {
            *(undefined1 *)(unaff_x29 + -0xef) = 0x1e;
            *(ushort *)(unaff_x29 + -0xee) = uVar4 & 0xff | (ushort)((unaff_w21 & 0xff00ff) << 8);
            if (puVar12 != (undefined1 *)0x0) {
              uVar7 = _strtoul(puVar12,0,10);
              if (uVar7 >> 0x20 != 0) goto code_r0x00730454;
              *(int *)(unaff_x29 + -0xd8) = (int)uVar7;
            }
          }
          goto code_r0x00730344;
        }
LAB_007305b0:
        uVar11 = 0;
        goto code_r0x007305b4;
      }
      uVar5 = 1;
      if (iVar6 == 1) goto LAB_007306c0;
      if (iVar6 != 0) {
        if (unaff_x25 == 0) goto LAB_007302f8;
        goto code_r0x00730460;
      }
      if (unaff_x25 == 0) goto LAB_007302f8;
      puVar8 = (undefined4 *)___error();
      uVar2 = *puVar8;
      *(undefined4 *)(unaff_x20 + 0xc54) = uVar2;
      func_0x0077ea88(uVar2,&uStack0000000000000050,0x100);
    }
    else {
LAB_007302f8:
      uVar3 = *(undefined1 *)(in_stack_00000038 + 0x52b);
      if (unaff_w22 == 2) {
        uVar10 = 1;
code_r0x007303b8:
        *(undefined1 *)(in_stack_00000038 + 0x52b) = uVar10;
      }
      else if (unaff_w22 == 0x1e) {
        uVar10 = 2;
        goto code_r0x007303b8;
      }
      iVar6 = func_0x0074f754();
      if (iVar6 == 1) {
        func_0x00728b3c();
      }
      *(undefined1 *)(in_stack_00000038 + 0x52b) = uVar3;
      if (in_stack_00000048 != (long *)0x0) {
        iVar6 = *(int *)(*in_stack_00000048 + 4);
        func_0x0074ef88(*in_stack_00000048,&uStack0000000000000150,0x100);
        if ((*(char *)(in_stack_00000028 + 3) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x20 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x20 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        func_0x00750010();
        if (iVar6 == unaff_w22) goto code_r0x00730500;
code_r0x00730454:
        uVar5 = 1;
        goto LAB_007306c0;
      }
code_r0x00730460:
      *(uint *)(&UNK_00001344 + unaff_x20) = *(uint *)(&UNK_00001344 + unaff_x20) & 0xffffffdf;
      puVar8 = (undefined4 *)___error();
      uVar2 = *puVar8;
      *(undefined4 *)(unaff_x20 + 0xc54) = uVar2;
      func_0x0077ea88(uVar2,&uStack0000000000000050,0x100);
    }
LAB_007306b4:
    func_0x0073c9e4();
    uVar5 = 0x2d;
LAB_007306c0:
    uVar1 = 7;
    if (uVar5 != 1) {
      uVar1 = uVar5;
    }
    uVar7 = (ulong)uVar1;
code_r0x0072fe24:
    iVar6 = *(int *)(unaff_x26 + 0x98);
    if (iVar6 != -1) {
      lVar13 = unaff_x19[3];
      if ((lVar13 == 0) || (lVar14 = *(long *)(lVar13 + 0x20), func_0x0076b038(), lVar14 == 0)) {
        _close(iVar6);
      }
      else {
        func_0x0076bad4();
        (**(code **)(lVar13 + 0x20))(*(undefined8 *)(lVar13 + 0x28),iVar6);
        func_0x0076bad4();
      }
      *(undefined4 *)(unaff_x26 + 0x98) = 0xffffffff;
    }
  }
  else {
    uVar7 = _strlen();
    if (0xfe < uVar7) {
      uVar5 = 0x2b;
      goto LAB_007306c0;
    }
    unaff_x28[0x2d] = 0;
    unaff_x28[0x2c] = 0;
    unaff_x28[0x2f] = 0;
    unaff_x28[0x2e] = 0;
    unaff_x28[0x29] = 0;
    unaff_x28[0x28] = 0;
    unaff_x28[0x2b] = 0;
    unaff_x28[0x2a] = 0;
    unaff_x28[0x25] = 0;
    unaff_x28[0x24] = 0;
    unaff_x28[0x27] = 0;
    unaff_x28[0x26] = 0;
    unaff_x28[0x21] = 0;
    unaff_x28[0x20] = 0;
    unaff_x28[0x23] = 0;
    unaff_x28[0x22] = 0;
    unaff_x28[0x1d] = 0;
    unaff_x28[0x1c] = 0;
    unaff_x28[0x1f] = 0;
    unaff_x28[0x1e] = 0;
    unaff_x28[0x19] = 0;
    unaff_x28[0x18] = 0;
    unaff_x28[0x1b] = 0;
    unaff_x28[0x1a] = 0;
    unaff_x28[0x15] = 0;
    unaff_x28[0x14] = 0;
    unaff_x28[0x17] = 0;
    unaff_x28[0x16] = 0;
    unaff_x28[0x11] = 0;
    unaff_x28[0x10] = 0;
    unaff_x28[0x13] = 0;
    unaff_x28[0x12] = 0;
    unaff_x28[0xd] = 0;
    unaff_x28[0xc] = 0;
    unaff_x28[0xf] = 0;
    unaff_x28[0xe] = 0;
    unaff_x28[9] = 0;
    unaff_x28[8] = 0;
    unaff_x28[0xb] = 0;
    unaff_x28[10] = 0;
    unaff_x28[5] = 0;
    unaff_x28[4] = 0;
    unaff_x28[7] = 0;
    unaff_x28[6] = 0;
    unaff_x28[1] = 0;
    *unaff_x28 = 0;
    unaff_x28[3] = 0;
    unaff_x28[2] = 0;
    iVar6 = _setsockopt(uStack0000000000000034,0xffff,
                        "eworks/CoreServices.framework/Versions/A/CoreServices");
    if ((iVar6 != 0) || (unaff_x27 != 0)) goto code_r0x007302f0;
    if ((*(char *)(in_stack_00000028 + 3) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x20 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x20 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
LAB_0073017c:
    iVar6 = func_0x0076d02c(*(undefined4 *)(unaff_x26 + 0x98),1);
    if (iVar6 < 0) {
      puVar8 = (undefined4 *)___error();
      *(undefined4 *)(unaff_x26 + 0x130) = *puVar8;
      uVar7 = 1;
      goto code_r0x0072fe24;
    }
    *(byte *)(unaff_x26 + 0x134) =
         *(byte *)(unaff_x26 + 0x134) & 0xf7 | (*(int *)(unaff_x26 + 0xc) != 2) << 3;
    if (in_stack_00000040._4_4_ == 0) {
      uVar7 = 0;
    }
    else {
      func_0x0072fadc(unaff_x19[2]);
      auVar15 = func_0x00782d28();
      uVar7 = 0;
      *(undefined1 (*) [16])(unaff_x26 + 0x110) = auVar15;
      *(byte *)((long)unaff_x19 + 0x24) = *(byte *)((long)unaff_x19 + 0x24) | 1;
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
    return uVar7;
  }
  auVar16 = ___stack_chk_fail();
  lVar13 = auVar16._0_8_;
  if (auVar16._8_4_ == 0) {
                    /* WARNING: Could not recover jumptable at 0x007b3250. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar7 = (*(code *)PTR__connect_00a24cd0)
                      (*(undefined4 *)(lVar13 + 0x98),lVar13 + 0x18,*(undefined4 *)(lVar13 + 0x14));
    return uVar7;
  }
  auStack_38[0] = 0;
  uStack_30 = 0;
  uStack_28 = 0;
  lStack_20 = lVar13 + 0x18;
  uStack_18 = *(undefined4 *)(lVar13 + 0x14);
  uVar7 = _connectx(*(undefined4 *)(lVar13 + 0x98),auStack_38,0,3,0,0,0,0);
  return uVar7;
}

