
ulong FUN_00730554(void)

{
  uint uVar1;
  undefined4 uVar2;
  int iVar3;
  uint uVar4;
  undefined4 *puVar5;
  ulong uVar6;
  undefined2 in_w8;
  long *unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  long unaff_x22;
  long lVar7;
  long lVar8;
  long unaff_x24;
  long unaff_x26;
  int unaff_w27;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar9 [16];
  undefined1 auVar10 [12];
  undefined8 in_stack_00000040;
  undefined1 uStack0000000000000150;
  undefined4 auStack_38 [2];
  undefined8 uStack_30;
  undefined4 uStack_28;
  long lStack_20;
  undefined4 uStack_18;
  
  *(undefined2 *)(unaff_x29 + -0xee) = in_w8;
  if (unaff_x22 == 0) {
LAB_00730344:
    iVar3 = _bind();
    if (iVar3 < 0) {
      do {
        unaff_w21 = unaff_w21 + 1;
        if ((unaff_w27 < 2) || ((unaff_w21 & 0xffff) == 0)) {
          puVar5 = (undefined4 *)___error();
          uVar2 = *puVar5;
          *(undefined4 *)(unaff_x20 + 0xc54) = uVar2;
          func_0x0077ea88(uVar2,&uStack0000000000000150,0x100);
          func_0x0073c9e4();
          uVar4 = 0x2d;
          goto FUN_007306c0;
        }
        if ((*(char *)(unaff_x28 + 3) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x20 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x20 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        *(ushort *)(unaff_x29 + -0xee) =
             (ushort)(unaff_w21 >> 8) & 0xff | (ushort)((unaff_w21 & 0xff00ff) << 8);
        iVar3 = _bind();
        unaff_w27 = unaff_w27 + -1;
      } while (iVar3 < 0);
    }
    if ((*(char *)(unaff_x28 + 3) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x20 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x20 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
    *(ulong *)(unaff_x24 + 0x398) = *(ulong *)(unaff_x24 + 0x398) | 0x100000;
    iVar3 = func_0x0076d02c(*(undefined4 *)(unaff_x26 + 0x98),1);
    if (iVar3 < 0) {
      puVar5 = (undefined4 *)___error();
      *(undefined4 *)(unaff_x26 + 0x130) = *puVar5;
      uVar6 = 1;
      goto LAB_0072fe24;
    }
    *(byte *)(unaff_x26 + 0x134) =
         *(byte *)(unaff_x26 + 0x134) & 0xf7 | (*(int *)(unaff_x26 + 0xc) != 2) << 3;
    if (in_stack_00000040._4_4_ == 0) {
      uVar6 = 0;
    }
    else {
      func_0x0072fadc(unaff_x19[2]);
      auVar9 = func_0x00782d28();
      uVar6 = 0;
      *(undefined1 (*) [16])(unaff_x26 + 0x110) = auVar9;
      *(byte *)((long)unaff_x19 + 0x24) = *(byte *)((long)unaff_x19 + 0x24) | 1;
    }
  }
  else {
    uVar6 = _strtoul();
    if (uVar6 >> 0x20 == 0) {
      *(int *)(unaff_x29 + -0xd8) = (int)uVar6;
      goto LAB_00730344;
    }
    uVar4 = 1;
FUN_007306c0:
    uVar1 = 7;
    if (uVar4 != 1) {
      uVar1 = uVar4;
    }
    uVar6 = (ulong)uVar1;
LAB_0072fe24:
    iVar3 = *(int *)(unaff_x26 + 0x98);
    if (iVar3 != -1) {
      lVar7 = unaff_x19[3];
      if ((lVar7 == 0) || (lVar8 = *(long *)(lVar7 + 0x20), func_0x0076b038(), lVar8 == 0)) {
        _close(iVar3);
      }
      else {
        func_0x0076bad4();
        (**(code **)(lVar7 + 0x20))(*(undefined8 *)(lVar7 + 0x28),iVar3);
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
    return uVar6;
  }
  auVar10 = ___stack_chk_fail();
  lVar7 = auVar10._0_8_;
  if (auVar10._8_4_ == 0) {
                    /* WARNING: Could not recover jumptable at 0x007b3250. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar6 = (*(code *)PTR__connect_00a24cd0)
                      (*(undefined4 *)(lVar7 + 0x98),lVar7 + 0x18,*(undefined4 *)(lVar7 + 0x14));
    return uVar6;
  }
  auStack_38[0] = 0;
  uStack_30 = 0;
  uStack_28 = 0;
  lStack_20 = lVar7 + 0x18;
  uStack_18 = *(undefined4 *)(lVar7 + 0x14);
  uVar6 = _connectx(*(undefined4 *)(lVar7 + 0x98),auStack_38,0,3,0,0,0,0);
  return uVar6;
}

