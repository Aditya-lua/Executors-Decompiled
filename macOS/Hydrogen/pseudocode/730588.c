
undefined8 FUN_00730588(void)

{
  undefined4 uVar1;
  int iVar2;
  undefined4 *puVar3;
  long *unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  undefined1 unaff_w22;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  long unaff_x24;
  long unaff_x26;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar7 [16];
  undefined1 auVar8 [12];
  int iStack0000000000000030;
  undefined4 uStack0000000000000034;
  undefined8 in_stack_00000040;
  undefined1 uStack0000000000000150;
  undefined4 auStack_38 [2];
  undefined8 uStack_30;
  undefined4 uStack_28;
  long lStack_20;
  undefined4 uStack_18;
  
  iVar2 = _inet_pton(2);
  if (iVar2 < 1) {
    uVar4 = 0;
  }
  else {
    *(undefined1 *)(unaff_x29 + -0xef) = unaff_w22;
    *(ushort *)(unaff_x29 + -0xee) =
         (ushort)(unaff_w21 >> 8) & 0xff | (ushort)((unaff_w21 & 0xff00ff) << 8);
    uVar4 = 0x10;
  }
  iVar2 = _bind(uStack0000000000000034,unaff_x29 + -0xf0,uVar4);
  while (iVar2 < 0) {
    unaff_w21 = unaff_w21 + 1;
    if ((iStack0000000000000030 < 2) || ((unaff_w21 & 0xffff) == 0)) {
      puVar3 = (undefined4 *)___error();
      uVar1 = *puVar3;
      *(undefined4 *)(unaff_x20 + 0xc54) = uVar1;
      func_0x0077ea88(uVar1,&uStack0000000000000150,0x100);
      func_0x0073c9e4();
      uVar4 = 0x2d;
      goto LAB_0072fe24;
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
    iVar2 = _bind(uStack0000000000000034,unaff_x29 + -0xf0,uVar4);
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
  iVar2 = func_0x0076d02c(*(undefined4 *)(unaff_x26 + 0x98),1);
  if (iVar2 < 0) {
    puVar3 = (undefined4 *)___error();
    *(undefined4 *)(unaff_x26 + 0x130) = *puVar3;
    uVar4 = 1;
LAB_0072fe24:
    iVar2 = *(int *)(unaff_x26 + 0x98);
    if (iVar2 != -1) {
      lVar5 = unaff_x19[3];
      if ((lVar5 == 0) || (lVar6 = *(long *)(lVar5 + 0x20), func_0x0076b038(), lVar6 == 0)) {
        _close(iVar2);
      }
      else {
        func_0x0076bad4();
        (**(code **)(lVar5 + 0x20))(*(undefined8 *)(lVar5 + 0x28),iVar2);
        func_0x0076bad4();
      }
      *(undefined4 *)(unaff_x26 + 0x98) = 0xffffffff;
    }
  }
  else {
    *(byte *)(unaff_x26 + 0x134) =
         *(byte *)(unaff_x26 + 0x134) & 0xf7 | (*(int *)(unaff_x26 + 0xc) != 2) << 3;
    if (in_stack_00000040._4_4_ == 0) {
      uVar4 = 0;
    }
    else {
      func_0x0072fadc(unaff_x19[2]);
      auVar7 = func_0x00782d28();
      uVar4 = 0;
      *(undefined1 (*) [16])(unaff_x26 + 0x110) = auVar7;
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
    return uVar4;
  }
  auVar8 = ___stack_chk_fail();
  lVar5 = auVar8._0_8_;
  if (auVar8._8_4_ == 0) {
                    /* WARNING: Could not recover jumptable at 0x007b3250. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar4 = (*(code *)PTR__connect_00a24cd0)
                      (*(undefined4 *)(lVar5 + 0x98),lVar5 + 0x18,*(undefined4 *)(lVar5 + 0x14));
    return uVar4;
  }
  auStack_38[0] = 0;
  uStack_30 = 0;
  uStack_28 = 0;
  lStack_20 = lVar5 + 0x18;
  uStack_18 = *(undefined4 *)(lVar5 + 0x14);
  uVar4 = _connectx(*(undefined4 *)(lVar5 + 0x98),auStack_38,0,3,0,0,0,0);
  return uVar4;
}

