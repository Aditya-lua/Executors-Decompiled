
undefined8 FUN_0072f52c(void)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  undefined8 uVar4;
  undefined4 *puVar5;
  ulong uVar6;
  uint *puVar7;
  char *pcVar8;
  uint *puVar9;
  long *plVar10;
  long unaff_x19;
  long *unaff_x20;
  undefined1 *unaff_x21;
  long unaff_x23;
  undefined8 *unaff_x24;
  long lVar11;
  long lVar12;
  long unaff_x29;
  undefined1 auVar13 [16];
  undefined8 uStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined1 uStack0000000000000128;
  long *plStack_48;
  
  if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x20 + 0xc))))) {
    func_0x0073cbdc();
  }
  pcVar8 = (char *)0xffffffff;
  puVar9 = (uint *)0x0;
  uVar2 = func_0x007731dc(*(undefined4 *)(unaff_x23 + 0x98),0xffffffff);
  if (((*(char *)((long)unaff_x24 + 3) < '\0') &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x20 + 0xc))) {
    pcVar8 = "socket_check -> %x";
    func_0x0073cbdc();
  }
  if (uVar2 == 0xffffffff) {
    func_0x0073c9e4();
    uVar4 = 10;
    goto LAB_0072f6c4;
  }
  if ((uVar2 & 1) == 0) {
    if ((((int)*unaff_x24 < 0) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x20 + 0xc))) {
      pcVar8 = "nothing heard from the server yet";
      func_0x0073cbdc();
    }
    uVar4 = 0;
    *unaff_x21 = 0;
    goto LAB_0072f6c4;
  }
  puVar7 = puVar9;
  if (((int)*unaff_x24 < 0) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
    puVar7 = puVar9;
  }
  pcVar8 = (char *)&uStack0000000000000018;
  iVar3 = _getsockname(*(undefined4 *)(unaff_x23 + 0x98),&uStack0000000000000020);
  puVar9 = puVar7;
  if (iVar3 == 0) {
    uStack0000000000000018._0_4_ = 0x80;
    pcVar8 = (char *)&uStack0000000000000018;
    uVar4 = _accept(*(undefined4 *)(unaff_x23 + 0x98),&uStack0000000000000020);
    iVar3 = (int)uVar4;
    puVar9 = puVar7;
    if (iVar3 != -1) {
      if ((*(char *)((long)unaff_x24 + 3) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      func_0x0076d02c(uVar4,1);
      *(byte *)(unaff_x23 + 0x134) = *(byte *)(unaff_x23 + 0x134) & 0xf9 | 4;
      iVar1 = *(int *)(unaff_x23 + 0x98);
      if (iVar1 != -1) {
        lVar11 = unaff_x20[3];
        if ((lVar11 == 0) || (lVar12 = *(long *)(lVar11 + 0x20), func_0x0076b038(), lVar12 == 0)) {
          _close(iVar1);
        }
        else {
          func_0x0076bad4();
          (**(code **)(lVar11 + 0x20))(*(undefined8 *)(lVar11 + 0x28),iVar1);
          func_0x0076bad4();
        }
      }
      *(int *)(unaff_x23 + 0x98) = iVar3;
      *(int *)(unaff_x20[3] + (long)(int)unaff_x20[4] * 4 + 0x238) = iVar3;
      lVar11 = unaff_x20[2];
      puVar9 = (uint *)(lVar11 + 0xf8);
      *puVar9 = 0;
      pcVar8 = (char *)(lVar11 + 0x9c);
      *pcVar8 = 0;
      uStack0000000000000018._4_4_ = 0x80;
      in_stack_000000a8 = 0;
      uStack00000000000000a0 = 0;
      in_stack_000000b8 = 0;
      in_stack_000000b0 = 0;
      in_stack_000000c8 = 0;
      in_stack_000000c0 = 0;
      in_stack_000000d8 = 0;
      in_stack_000000d0 = 0;
      in_stack_000000e8 = 0;
      in_stack_000000e0 = 0;
      in_stack_000000f8 = 0;
      in_stack_000000f0 = 0;
      in_stack_00000108 = 0;
      in_stack_00000100 = 0;
      in_stack_00000118 = 0;
      in_stack_00000110 = 0;
      iVar3 = _getpeername(*(undefined4 *)(lVar11 + 0x98),&uStack00000000000000a0,
                           (long)&uStack0000000000000018 + 4);
      if (iVar3 == 0) {
        uVar6 = func_0x00734e00(&uStack00000000000000a0,uStack0000000000000018._4_4_);
        if ((uVar6 & 1) == 0) {
          ___error();
          puVar5 = (undefined4 *)___error();
          pcVar8 = (char *)&section_000000b8.reserved2;
          func_0x0077ea88(*puVar5,&uStack0000000000000128);
          goto code_r0x0072f880;
        }
      }
      else {
        puVar5 = (undefined4 *)___error();
        pcVar8 = (char *)&section_000000b8.reserved2;
        func_0x0077ea88(*puVar5,&uStack0000000000000128);
        puVar9 = puVar7;
code_r0x0072f880:
        func_0x0073c9e4();
      }
      func_0x0072fadc(unaff_x20[2]);
      *(byte *)(unaff_x23 + 0x134) = *(byte *)(unaff_x23 + 0x134) | 0x10;
      auVar13 = func_0x00782d28();
      *(undefined1 (*) [16])(unaff_x23 + 0x110) = auVar13;
      *(byte *)((long)unaff_x20 + 0x24) = *(byte *)((long)unaff_x20 + 0x24) | 1;
      if ((*(char *)((long)unaff_x24 + 3) < '\0') &&
         (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x20 + 0xc)))))
      {
        pcVar8 = "accepted_set(sock=%d, remote=%s port=%d)";
        func_0x0073cbdc();
      }
      if (*(long *)(unaff_x19 + 0x268) != 0) {
        func_0x0076bad4();
        pcVar8 = (char *)((long)&MACH_HEADER.magic + 1);
        iVar3 = (**(code **)(unaff_x19 + 0x268))
                          (*(undefined8 *)(unaff_x19 + 0x270),*(undefined4 *)(unaff_x23 + 0x98));
        func_0x0076bad4();
        if (iVar3 != 0) {
          uVar4 = 0x2a;
          goto LAB_0072f6c4;
        }
      }
      uVar4 = 0;
      goto LAB_0072f6c4;
    }
  }
  func_0x0073c9e4();
  uVar4 = 0x1e;
LAB_0072f6c4:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return uVar4;
  }
  auVar13 = ___stack_chk_fail(uVar4);
  lVar12 = auVar13._8_8_;
  lVar11 = auVar13._0_8_;
  plStack_48 = (long *)0x0;
  func_0x00730b8c();
  puVar7 = (uint *)(*pcRam0000000000a2b608)(1,0x138);
  if (puVar7 == (uint *)0x0) {
    plVar10 = (long *)0x0;
    uVar4 = 0x1b;
  }
  else {
    *puVar7 = (uint)*(byte *)(lVar12 + 0x52a);
    puVar7[0x26] = *puVar9;
    *(byte *)(puVar7 + 0x4d) = (byte)puVar7[0x4d] & 0xfb | 2;
    uVar4 = func_0x00730fe0(&plStack_48,0xa2b3e0,puVar7);
    if ((int)uVar4 == 0) {
      func_0x00731058(lVar11,lVar12,pcVar8);
      auVar13 = func_0x00782d28();
      *(undefined1 (*) [16])(puVar7 + 0x40) = auVar13;
      *(uint *)(lVar12 + (long)(int)pcVar8 * 4 + 0x238) = puVar7[0x26];
      func_0x0072fadc(plStack_48[2],lVar11);
      if ((lVar11 != 0) && (*(char *)(lVar11 + 0xa1d) < '\0')) {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar11 + 0x18) == 0) {
          if (plStack_48 == (long *)0x0) {
            return 0;
          }
        }
        else {
          if (*(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar11 + 0x18) + 8) < 1) {
            return 0;
          }
          if (plStack_48 == (long *)0x0) {
            return 0;
          }
        }
        if (0 < *(int *)(*plStack_48 + 0xc)) {
          func_0x0073cbdc(lVar11,plStack_48,"set filter for listen socket fd=%d ip=%s:%d");
        }
      }
      return 0;
    }
    plVar10 = plStack_48;
  }
  (*pcRam0000000000a2b5f0)(plVar10);
  plStack_48 = (long *)0x0;
  (*pcRam0000000000a2b5f0)(puVar7);
  return uVar4;
}

