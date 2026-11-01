
ulong FUN_0073041c(void)

{
  uint uVar1;
  undefined4 uVar2;
  ushort uVar3;
  uint uVar4;
  int iVar5;
  undefined4 *puVar6;
  undefined1 *puVar7;
  int in_w8;
  long *unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  ulong uVar8;
  int unaff_w22;
  undefined8 uVar9;
  undefined1 *puVar10;
  int unaff_w23;
  long lVar11;
  long lVar12;
  long unaff_x24;
  long unaff_x26;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar13 [16];
  undefined1 auVar14 [12];
  int iStack0000000000000030;
  undefined4 uStack0000000000000034;
  undefined8 in_stack_00000040;
  undefined1 uStack0000000000000150;
  undefined4 auStack_38 [2];
  undefined8 uStack_30;
  undefined4 uStack_28;
  long lStack_20;
  undefined4 uStack_18;
  
  if (0 < in_w8) {
    func_0x0073cab8();
  }
  func_0x00750010();
  if (unaff_w23 == unaff_w22) {
    uVar3 = (ushort)(unaff_w21 >> 8);
    if (unaff_w22 == 2) {
      iVar5 = _inet_pton(2,&uStack0000000000000150,unaff_x29 - 0xf0U | 4);
      if (iVar5 < 1) goto LAB_007305b0;
      *(undefined1 *)(unaff_x29 + -0xef) = 2;
      *(ushort *)(unaff_x29 + -0xee) = uVar3 & 0xff | (ushort)((unaff_w21 & 0xff00ff) << 8);
      uVar9 = 0x10;
    }
    else if (unaff_w22 == 0x1e) {
      puVar7 = (undefined1 *)_strchr(&uStack0000000000000150,0x25);
      puVar10 = puVar7;
      if (puVar7 != (undefined1 *)0x0) {
        puVar10 = puVar7 + 1;
        *puVar7 = 0;
      }
      iVar5 = _inet_pton(0x1e,&uStack0000000000000150,unaff_x29 - 0xf0U | 8);
      if (0 < iVar5) {
        *(undefined1 *)(unaff_x29 + -0xef) = 0x1e;
        *(ushort *)(unaff_x29 + -0xee) = uVar3 & 0xff | (ushort)((unaff_w21 & 0xff00ff) << 8);
        if (puVar10 != (undefined1 *)0x0) {
          uVar8 = _strtoul(puVar10,0,10);
          if (uVar8 >> 0x20 != 0) goto LAB_00730454;
          *(int *)(unaff_x29 + -0xd8) = (int)uVar8;
        }
      }
      uVar9 = 0x1c;
    }
    else {
LAB_007305b0:
      uVar9 = 0;
    }
    iVar5 = _bind(uStack0000000000000034,unaff_x29 + -0xf0,uVar9);
    while (iVar5 < 0) {
      unaff_w21 = unaff_w21 + 1;
      if ((iStack0000000000000030 < 2) || ((unaff_w21 & 0xffff) == 0)) {
        puVar6 = (undefined4 *)___error();
        uVar2 = *puVar6;
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
      iVar5 = _bind(uStack0000000000000034,unaff_x29 + -0xf0,uVar9);
      iStack0000000000000030 = iStack0000000000000030 + -1;
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
    iVar5 = func_0x0076d02c(*(undefined4 *)(unaff_x26 + 0x98),1);
    if (iVar5 < 0) {
      puVar6 = (undefined4 *)___error();
      *(undefined4 *)(unaff_x26 + 0x130) = *puVar6;
      uVar8 = 1;
      goto LAB_0072fe24;
    }
    *(byte *)(unaff_x26 + 0x134) =
         *(byte *)(unaff_x26 + 0x134) & 0xf7 | (*(int *)(unaff_x26 + 0xc) != 2) << 3;
    if (in_stack_00000040._4_4_ == 0) {
      uVar8 = 0;
    }
    else {
      func_0x0072fadc(unaff_x19[2]);
      auVar13 = func_0x00782d28();
      uVar8 = 0;
      *(undefined1 (*) [16])(unaff_x26 + 0x110) = auVar13;
      *(byte *)((long)unaff_x19 + 0x24) = *(byte *)((long)unaff_x19 + 0x24) | 1;
    }
  }
  else {
LAB_00730454:
    uVar4 = 1;
FUN_007306c0:
    uVar1 = 7;
    if (uVar4 != 1) {
      uVar1 = uVar4;
    }
    uVar8 = (ulong)uVar1;
LAB_0072fe24:
    iVar5 = *(int *)(unaff_x26 + 0x98);
    if (iVar5 != -1) {
      lVar11 = unaff_x19[3];
      if ((lVar11 == 0) || (lVar12 = *(long *)(lVar11 + 0x20), func_0x0076b038(), lVar12 == 0)) {
        _close(iVar5);
      }
      else {
        func_0x0076bad4();
        (**(code **)(lVar11 + 0x20))(*(undefined8 *)(lVar11 + 0x28),iVar5);
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
    return uVar8;
  }
  auVar14 = ___stack_chk_fail();
  lVar11 = auVar14._0_8_;
  if (auVar14._8_4_ == 0) {
                    /* WARNING: Could not recover jumptable at 0x007b3250. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar8 = (*(code *)PTR__connect_00a24cd0)
                      (*(undefined4 *)(lVar11 + 0x98),lVar11 + 0x18,*(undefined4 *)(lVar11 + 0x14));
    return uVar8;
  }
  auStack_38[0] = 0;
  uStack_30 = 0;
  uStack_28 = 0;
  lStack_20 = lVar11 + 0x18;
  uStack_18 = *(undefined4 *)(lVar11 + 0x14);
  uVar8 = _connectx(*(undefined4 *)(lVar11 + 0x98),auStack_38,0,3,0,0,0,0);
  return uVar8;
}

