
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_007373ec(ulong param_1)

{
  bool bVar1;
  undefined1 uVar2;
  bool bVar3;
  undefined1 in_ZR;
  bool bVar4;
  int iVar5;
  long lVar6;
  undefined8 uVar7;
  uint uVar8;
  ulong uVar9;
  long in_x9;
  long unaff_x19;
  int unaff_w20;
  ulong unaff_x23;
  ulong *unaff_x25;
  long unaff_x26;
  long unaff_x27;
  byte *unaff_x28;
  byte *pbVar10;
  ulong in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000048;
  
code_r0x007373ec:
  uVar8 = (uint)param_1;
  if ((bool)in_ZR) goto LAB_007373c4;
  pbVar10 = unaff_x28;
  if (uVar8 != 0x2c) goto LAB_007373b8;
code_r0x007373f8:
  uVar8 = (uint)param_1;
  unaff_x28 = pbVar10 + in_x9;
  if (unaff_x27 == 0) {
LAB_00737758:
    if (uVar8 != 0) {
      for (; param_1 = (ulong)*unaff_x28,
          *unaff_x28 < 0x2d && (unaff_x26 << (param_1 & 0x3f) & unaff_x23) != 0;
          unaff_x28 = unaff_x28 + 1) {
      }
      in_x9 = 0;
      unaff_x27 = 0;
      do {
        uVar8 = (uint)param_1;
        if (0x1f < uVar8) {
          in_ZR = uVar8 == 0x20;
          goto code_r0x007373ec;
        }
        if (uVar8 != 9) {
          pbVar10 = unaff_x28;
          if (uVar8 == 0) goto code_r0x007373f8;
LAB_007373b8:
          if (3 < uVar8 - 10) {
            unaff_x27 = in_x9 + 1;
          }
        }
LAB_007373c4:
        param_1 = (ulong)unaff_x28[in_x9 + 1];
        in_x9 = in_x9 + 1;
      } while( true );
    }
  }
  else {
    if ((unaff_x19 != 0) && (*(char *)((long)unaff_x25 + 3) < '\0')) {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0) {
        if (0 < iRam0000000000a2b560) goto code_r0x00737430;
      }
      else if (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8) && 0 < iRam0000000000a2b560) {
code_r0x00737430:
        func_0x0073ce84();
      }
    }
    if ((unaff_w20 == 0) || (unaff_x27 != 7)) {
      uVar9 = *unaff_x25;
      if (unaff_w20 != 0) {
        bVar4 = false;
        uVar8 = (uint)uVar9;
        goto joined_r0x00737478;
      }
      if ((uVar9 >> 0x26 & 1) == 0) {
        lVar6 = func_0x00774084();
        if (lVar6 - 4U < 0xfffffffffffffffa || lVar6 == -2) goto code_r0x00737818;
        bVar4 = false;
LAB_00737558:
        iVar5 = func_0x0077e76c(pbVar10,"identity",unaff_x27);
        if (((iVar5 != 0) && ("identity"[unaff_x27] == '\0')) ||
           ((iVar5 = func_0x0077e76c(pbVar10,"none",unaff_x27), iVar5 != 0 &&
            ("none"[unaff_x27] == '\0')))) {
          unaff_x23 = 0x100100000200;
          goto joined_r0x0073751c;
        }
        iVar5 = func_0x0077e76c(pbVar10,"deflate",unaff_x27);
        unaff_x23 = 0x100100000200;
        if ((iVar5 == 0) || ("deflate"[unaff_x27] != '\0')) {
          iVar5 = func_0x0077e76c(pbVar10,"gzip",unaff_x27);
          bVar3 = bVar4;
          bVar1 = bVar4;
          if (((iVar5 != 0) && ("gzip"[unaff_x27] == '\0')) ||
             ((iVar5 = func_0x0077e76c(pbVar10,"x-gzip",unaff_x27), iVar5 != 0 &&
              ("x-gzip"[unaff_x27] == '\0')))) goto joined_r0x0073751c;
        }
        else if (bVar4) goto LAB_007376c8;
        goto LAB_00737660;
      }
LAB_0073777c:
      if (-1 < (int)uVar9) {
        return 0;
      }
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) != 0) {
        iVar5 = *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8);
        goto joined_r0x00737794;
      }
joined_r0x00737838:
      if (iRam0000000000a2b560 < 1) {
        return 0;
      }
    }
    else {
      iVar5 = func_0x0077e76c(pbVar10,"chunked",7);
      bVar4 = iVar5 != 0;
      uVar9 = *unaff_x25;
      uVar8 = (uint)uVar9;
joined_r0x00737478:
      if (((uVar8 >> 0x19 & 1) == 0) && (uVar2 = !bVar4, bVar4 = true, (bool)uVar2))
      goto LAB_0073777c;
      lVar6 = func_0x00774084();
      if (lVar6 - 4U < 0xfffffffffffffffb) goto code_r0x00737818;
      iVar5 = func_0x0077e76c(pbVar10,in_stack_00000040,unaff_x27);
      if ((iVar5 == 0) || (*(char *)(in_stack_00000040 + unaff_x27) != '\0')) {
        if ((in_stack_00000038 == 0) ||
           ((iVar5 = func_0x0077e76c(pbVar10,in_stack_00000038,unaff_x27), iVar5 == 0 ||
            (*(char *)(in_stack_00000038 + unaff_x27) != '\0')))) {
          unaff_x26 = 1;
          goto LAB_00737558;
        }
        unaff_x23 = 0x100100000200;
      }
      unaff_x26 = 1;
joined_r0x0073751c:
      bVar3 = false;
      bVar1 = bVar4;
joined_r0x0073751c:
      bVar4 = bVar3;
      if (!bVar1) {
LAB_00737660:
        if (((in_stack_00000030 & 0x100000000) == 0 && !bVar4) &&
           (lVar6 = func_0x00774130(), lVar6 != 0)) {
code_r0x00737818:
          func_0x0073c9e4();
          return 0x3d;
        }
code_r0x007376d8:
        uVar7 = func_0x00773f84(&uStack0000000000000048);
        if ((*(char *)((long)unaff_x25 + 3) < '\0') &&
           (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b560)))) {
          func_0x0073ce84();
        }
        if ((int)uVar7 != 0) {
          return uVar7;
        }
        uVar7 = func_0x007740b0();
        if ((int)uVar7 != 0) {
          func_0x00774044();
          return uVar7;
        }
        uVar8 = (uint)*unaff_x28;
        goto LAB_00737758;
      }
LAB_007376c8:
      lVar6 = func_0x00774174();
      if (lVar6 == 0) goto code_r0x007376d8;
      if (-1 < *(char *)((long)unaff_x25 + 3)) {
        return 0;
      }
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0) goto joined_r0x00737838;
      iVar5 = *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8);
joined_r0x00737794:
      if (iVar5 < 1) {
        return 0;
      }
      if (iRam0000000000a2b560 < 1) {
        return 0;
      }
    }
    func_0x0073ce84();
  }
  return 0;
}

