
ulong FUN_00730380(void)

{
  uint uVar1;
  undefined4 uVar2;
  undefined1 uVar3;
  ushort uVar4;
  int iVar5;
  uint uVar6;
  undefined4 *puVar7;
  undefined1 *puVar8;
  undefined1 uVar9;
  long *unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  ulong uVar10;
  int unaff_w22;
  undefined8 uVar11;
  undefined1 *puVar12;
  long lVar13;
  long lVar14;
  long unaff_x25;
  long unaff_x26;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar15 [16];
  undefined1 auVar16 [12];
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
  
  if (unaff_x25 == 0) {
    uVar3 = *(undefined1 *)(in_stack_00000038 + 0x52b);
    if (unaff_w22 == 2) {
      uVar9 = 1;
code_r0x007303b8:
      *(undefined1 *)(in_stack_00000038 + 0x52b) = uVar9;
    }
    else if (unaff_w22 == 0x1e) {
      uVar9 = 2;
      goto code_r0x007303b8;
    }
    iVar5 = func_0x0074f754();
    if (iVar5 == 1) {
      func_0x00728b3c();
    }
    *(undefined1 *)(in_stack_00000038 + 0x52b) = uVar3;
    if (in_stack_00000048 == (long *)0x0) {
      *(uint *)(&UNK_00001344 + unaff_x20) = *(uint *)(&UNK_00001344 + unaff_x20) & 0xffffffdf;
      puVar7 = (undefined4 *)___error();
      uVar2 = *puVar7;
      *(undefined4 *)(unaff_x20 + 0xc54) = uVar2;
      func_0x0077ea88(uVar2,&uStack0000000000000050,0x100);
      goto LAB_007306b4;
    }
    iVar5 = *(int *)(*in_stack_00000048 + 4);
    func_0x0074ef88(*in_stack_00000048,&uStack0000000000000150,0x100);
    if ((*(char *)(unaff_x28 + 3) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x20 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x20 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
    func_0x00750010();
    if (iVar5 != unaff_w22) {
code_r0x00730454:
      uVar6 = 1;
      goto code_r0x007306c0;
    }
    uVar4 = (ushort)(unaff_w21 >> 8);
    if (unaff_w22 == 2) {
      iVar5 = _inet_pton(2,&uStack0000000000000150,unaff_x29 - 0xf0U | 4);
      if (iVar5 < 1) goto LAB_007305b0;
      *(undefined1 *)(unaff_x29 + -0xef) = 2;
      *(ushort *)(unaff_x29 + -0xee) = uVar4 & 0xff | (ushort)((unaff_w21 & 0xff00ff) << 8);
      uVar11 = 0x10;
    }
    else if (unaff_w22 == 0x1e) {
      puVar8 = (undefined1 *)_strchr(&uStack0000000000000150,0x25);
      puVar12 = puVar8;
      if (puVar8 != (undefined1 *)0x0) {
        puVar12 = puVar8 + 1;
        *puVar8 = 0;
      }
      iVar5 = _inet_pton(0x1e,&uStack0000000000000150,unaff_x29 - 0xf0U | 8);
      if (0 < iVar5) {
        *(undefined1 *)(unaff_x29 + -0xef) = 0x1e;
        *(ushort *)(unaff_x29 + -0xee) = uVar4 & 0xff | (ushort)((unaff_w21 & 0xff00ff) << 8);
        if (puVar12 != (undefined1 *)0x0) {
          uVar10 = _strtoul(puVar12,0,10);
          if (uVar10 >> 0x20 != 0) goto code_r0x00730454;
          *(int *)(unaff_x29 + -0xd8) = (int)uVar10;
        }
      }
      uVar11 = 0x1c;
    }
    else {
LAB_007305b0:
      uVar11 = 0;
    }
    iVar5 = _bind(uStack0000000000000034,unaff_x29 + -0xf0,uVar11);
    while (iVar5 < 0) {
      unaff_w21 = unaff_w21 + 1;
      if ((iStack0000000000000030 < 2) || ((unaff_w21 & 0xffff) == 0)) {
        puVar7 = (undefined4 *)___error();
        uVar2 = *puVar7;
        *(undefined4 *)(unaff_x20 + 0xc54) = uVar2;
        func_0x0077ea88(uVar2,&uStack0000000000000150,0x100);
        goto LAB_007306b4;
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
      iVar5 = _bind(uStack0000000000000034,unaff_x29 + -0xf0,uVar11);
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
    *(ulong *)(in_stack_00000038 + 0x398) = *(ulong *)(in_stack_00000038 + 0x398) | 0x100000;
    iVar5 = func_0x0076d02c(*(undefined4 *)(unaff_x26 + 0x98),1);
    if (iVar5 < 0) {
      puVar7 = (undefined4 *)___error();
      *(undefined4 *)(unaff_x26 + 0x130) = *puVar7;
      uVar10 = 1;
      goto code_r0x0072fe24;
    }
    *(byte *)(unaff_x26 + 0x134) =
         *(byte *)(unaff_x26 + 0x134) & 0xf7 | (*(int *)(unaff_x26 + 0xc) != 2) << 3;
    if (in_stack_00000040._4_4_ == 0) {
      uVar10 = 0;
    }
    else {
      func_0x0072fadc(unaff_x19[2]);
      auVar15 = func_0x00782d28();
      uVar10 = 0;
      *(undefined1 (*) [16])(unaff_x26 + 0x110) = auVar15;
      *(byte *)((long)unaff_x19 + 0x24) = *(byte *)((long)unaff_x19 + 0x24) | 1;
    }
  }
  else {
    puVar7 = (undefined4 *)___error();
    uVar2 = *puVar7;
    *(undefined4 *)(unaff_x20 + 0xc54) = uVar2;
    func_0x0077ea88(uVar2,&uStack0000000000000050,0x100);
LAB_007306b4:
    func_0x0073c9e4();
    uVar6 = 0x2d;
code_r0x007306c0:
    uVar1 = 7;
    if (uVar6 != 1) {
      uVar1 = uVar6;
    }
    uVar10 = (ulong)uVar1;
code_r0x0072fe24:
    iVar5 = *(int *)(unaff_x26 + 0x98);
    if (iVar5 != -1) {
      lVar13 = unaff_x19[3];
      if ((lVar13 == 0) || (lVar14 = *(long *)(lVar13 + 0x20), func_0x0076b038(), lVar14 == 0)) {
        _close(iVar5);
      }
      else {
        func_0x0076bad4();
        (**(code **)(lVar13 + 0x20))(*(undefined8 *)(lVar13 + 0x28),iVar5);
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
    return uVar10;
  }
  auVar16 = ___stack_chk_fail();
  lVar13 = auVar16._0_8_;
  if (auVar16._8_4_ == 0) {
                    /* WARNING: Could not recover jumptable at 0x007b3250. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar10 = (*(code *)PTR__connect_00a24cd0)
                       (*(undefined4 *)(lVar13 + 0x98),lVar13 + 0x18,*(undefined4 *)(lVar13 + 0x14))
    ;
    return uVar10;
  }
  auStack_38[0] = 0;
  uStack_30 = 0;
  uStack_28 = 0;
  lStack_20 = lVar13 + 0x18;
  uStack_18 = *(undefined4 *)(lVar13 + 0x14);
  uVar10 = _connectx(*(undefined4 *)(lVar13 + 0x98),auStack_38,0,3,0,0,0,0);
  return uVar10;
}

