
undefined8 FUN_0074a8c0(undefined8 param_1)

{
  bool bVar1;
  ulong *puVar2;
  byte bVar3;
  int iVar4;
  uint uVar5;
  uint uVar6;
  undefined4 *puVar7;
  ulong uVar8;
  long lVar9;
  int *piVar10;
  undefined4 uVar11;
  char cVar12;
  long unaff_x19;
  long unaff_x20;
  ulong uVar13;
  int unaff_w21;
  undefined8 uVar14;
  long unaff_x22;
  ulong unaff_x23;
  uint uVar15;
  uint uVar16;
  long unaff_x29;
  undefined1 auVar17 [16];
  long *in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined1 uStack000000000000007d;
  undefined1 uStack00000000000000af;
  undefined1 uStack00000000000001af;
  char in_stack_000005b1;
  undefined1 auStack_7ffffffe [2147483614];
  
  lVar9 = _strchr(param_1,0x3a);
  if (lVar9 == 0) {
    uVar16 = 0;
    uVar15 = 0;
joined_r0x0074aa90:
    if (unaff_x23 < 0x32) {
      ___memcpy_chk(&uStack000000000000007d);
      auStack_7ffffffe[unaff_x23 + 0x8000007b] = 0;
      uVar11 = **(undefined4 **)(unaff_x20 + 0x50);
      uVar14 = func_0x0075af24(*(undefined4 **)(unaff_x20 + 0x50) + 4);
      iVar4 = func_0x0075b008(uVar11,uVar14,*(undefined4 *)(unaff_x20 + 0x520),
                              &uStack000000000000007d,&uStack00000000000001af,0x401);
      if (iVar4 == 0) {
        bVar3 = 1;
      }
      else {
        if (iVar4 == 1) goto code_r0x0074a760;
        if (iVar4 != 2) goto LAB_0074a640;
        bVar3 = 1;
      }
code_r0x0074a6c4:
      iVar4 = func_0x0074f754();
      if (iVar4 == 1) {
        func_0x00728b3c();
      }
      if ((in_stack_00000028 != (long *)0x0) && (lVar9 = *in_stack_00000028, lVar9 != 0)) {
        do {
          iVar4 = func_0x0072d954();
          if (iVar4 == 0) {
            if ((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
              if (*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) == 0) {
                if (0 < iRam0000000000a2b570) goto code_r0x0074aad8;
              }
              else {
                bVar1 = *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8) < 1;
                if ((!bVar1 && iRam0000000000a2b570 != 0) && (bVar1 || -1 < iRam0000000000a2b570)) {
code_r0x0074aad8:
                  func_0x0073cfbc();
                }
              }
            }
            ___memcpy_chk(auStack_7ffffffe + 0x800005ae,*(undefined8 *)(lVar9 + 0x20),
                          *(undefined4 *)(lVar9 + 0x10),0x80);
            uStack0000000000000030._0_4_ = *(undefined4 *)(lVar9 + 0x10);
            if (uVar16 < uVar15) goto code_r0x0074a758;
            uVar5 = uVar15;
            goto code_r0x0074ab3c;
          }
          puVar7 = (undefined4 *)___error();
          lVar9 = *(long *)(lVar9 + 0x28);
        } while (lVar9 != 0);
code_r0x0074a72c:
        func_0x0077ea88(*puVar7,&uStack00000000000000af,0x100);
      }
      goto code_r0x0074a758;
    }
  }
  else {
    unaff_x23 = lVar9 - unaff_x22;
    iVar4 = _inet_pton(0x1e);
    if ((iVar4 == 1) || (lVar9 = _strchr(lVar9,0x3a), lVar9 == 0)) {
      uVar16 = 0;
      uVar15 = 0;
    }
    else {
      _strtoul(lVar9 + 1,0,10);
      uVar5 = func_0x0078bbc8();
      lVar9 = _strchr(lVar9,0x2d);
      uVar16 = uVar5;
      uVar15 = uVar5;
      if (lVar9 != 0) {
        _strtoul(lVar9 + 1,0,10);
        uVar6 = func_0x0078bbc8();
        uVar15 = 0;
        if (uVar5 <= uVar6) {
          uVar15 = uVar5;
        }
        uVar16 = 0;
        if (uVar5 <= uVar6) {
          uVar16 = uVar6;
        }
      }
    }
    if (unaff_x23 != 0) goto joined_r0x0074aa90;
LAB_0074a640:
    uStack0000000000000030._0_4_ = 0x80;
    iVar4 = _getsockname(*(undefined4 *)(unaff_x20 + 0x238),auStack_7ffffffe + 0x800005ae,
                         &uStack0000000000000030);
    if (iVar4 != 0) {
code_r0x0074a65c:
      puVar7 = (undefined4 *)___error();
      func_0x0077ea88(*puVar7,&uStack00000000000000af,0x100);
      goto code_r0x0074a758;
    }
    if (in_stack_000005b1 == '\x1e') {
      lVar9 = _inet_ntop(0x1e,auStack_7ffffffe + 0x800005b6,&uStack00000000000001af,0x401);
    }
    else {
      lVar9 = _inet_ntop(in_stack_000005b1,(ulong)(auStack_7ffffffe + 0x800005ae) | 4,
                         &uStack00000000000001af,0x401);
    }
    if (lVar9 != 0) {
      bVar3 = 0;
      goto code_r0x0074a6c4;
    }
  }
  goto code_r0x0074a760;
code_r0x0074adf0:
  do {
    if ((unaff_w21 != 0) || ((uVar8 & 0x10000) != 0)) {
      if ((unaff_w21 == 1) && (in_stack_000005b1 != '\x02')) break;
      if ((in_stack_000005b1 == '\x1e') || (in_stack_000005b1 == '\x02')) {
        if (unaff_w21 == 0) {
          uVar14 = func_0x0076e34c();
          if ((int)uVar14 != 0) {
            func_0x0077e9f4();
            goto code_r0x0074af00;
          }
          uVar11 = 0;
          goto code_r0x0074ad94;
        }
        if (unaff_w21 == 1) {
          lVar9 = 0;
          goto code_r0x0074ae40;
        }
      }
    }
    unaff_w21 = unaff_w21 + 1;
  } while (unaff_w21 != 2);
code_r0x0074ad90:
  uVar11 = 2;
code_r0x0074ad94:
  *(undefined4 *)(unaff_x20 + 0x4e8) = uVar11;
  func_0x007466c4();
  uVar14 = func_0x0072f958();
  if ((int)uVar14 == 0) {
    uStack0000000000000030._4_4_ = 0xffffffff;
  }
  goto LAB_0074a764;
code_r0x0074ae40:
  cVar12 = *(char *)(unaff_x29 + -0xa0 + lVar9);
  if (cVar12 == '.') {
    cVar12 = ',';
  }
  else if (cVar12 == '\0') goto code_r0x0074ae50;
  auStack_7ffffffe[lVar9 + 0x80000038] = cVar12;
  lVar9 = lVar9 + 1;
  goto code_r0x0074ae40;
code_r0x0074ae50:
  auStack_7ffffffe[lVar9 + 0x80000038] = 0;
  func_0x00764560(auStack_7ffffffe + lVar9 + 0x80000038,0x14,",%d,%d");
  uVar14 = func_0x0076e34c();
  if ((int)uVar14 != 0) {
    func_0x0077e9f4();
code_r0x0074af00:
    func_0x0073c9e4();
    goto LAB_0074a764;
  }
  uVar11 = 1;
  goto code_r0x0074ad94;
  while ((uVar5 & 0xffff) <= uVar16) {
code_r0x0074ab3c:
    iVar4 = _bind(uStack0000000000000030._4_4_,auStack_7ffffffe + 0x800005ae,
                  (undefined4)uStack0000000000000030);
    if (iVar4 == 0) {
      uStack0000000000000030._0_4_ = 0x80;
      iVar4 = _getsockname(uStack0000000000000030._4_4_,auStack_7ffffffe + 0x800005ae,
                           &uStack0000000000000030);
      if (iVar4 != 0) goto code_r0x0074a65c;
      if (unaff_x19 == 0) {
        iVar4 = _listen(uStack0000000000000030._4_4_,1);
        if (iVar4 == 0) goto code_r0x0074ad5c;
      }
      else {
        if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
          if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0) {
            if (0 < iRam0000000000a2b570) goto code_r0x0074acb0;
          }
          else {
            bVar1 = *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + unaff_x19 + 0x18) + 8) < 1;
            if ((!bVar1 && iRam0000000000a2b570 != 0) && (bVar1 || -1 < iRam0000000000a2b570)) {
code_r0x0074acb0:
              func_0x0073cfbc();
            }
          }
        }
        iVar4 = _listen(uStack0000000000000030._4_4_,1);
        if (iVar4 == 0) {
          if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
             (((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
            func_0x0073cfbc();
          }
code_r0x0074ad5c:
          func_0x0074ef88(lVar9,unaff_x29 + -0xa0,0x2f);
          uVar8 = *(ulong *)(unaff_x20 + 0x398);
          if ((uVar8 & 0x10800) == 0x800) {
            uVar8 = uVar8 | 0x10000;
            *(ulong *)(unaff_x20 + 0x398) = uVar8;
          }
          if (unaff_w21 == 2) goto code_r0x0074ad90;
          goto code_r0x0074adf0;
        }
      }
      puVar7 = (undefined4 *)___error();
      goto code_r0x0074a72c;
    }
    piVar10 = (int *)___error();
    iVar4 = *piVar10;
    if ((bool)(bVar3 & iVar4 == 0x31)) {
      if (((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0077ea88(0x31,&uStack00000000000000af,0x100);
        func_0x0073cab8();
      }
      uStack0000000000000030._0_4_ = 0x80;
      iVar4 = _getsockname(*(undefined4 *)(unaff_x20 + 0x238),auStack_7ffffffe + 0x800005ae,
                           &uStack0000000000000030);
      if (iVar4 != 0) goto code_r0x0074a65c;
      bVar3 = 0;
      uVar5 = uVar15;
    }
    else {
      if ((iVar4 != 0xd) && (iVar4 != 0x30)) {
        func_0x0077ea88(iVar4,&uStack00000000000000af,0x100);
        break;
      }
      uVar5 = (uVar5 & 0xffff) + 1;
    }
  }
code_r0x0074a758:
  func_0x0073c9e4();
code_r0x0074a760:
  uVar14 = 0x1e;
LAB_0074a764:
  if (in_stack_00000028 != (long *)0x0) {
    func_0x00750010();
  }
  if ((int)uVar14 == 0) {
    if ((((*(byte *)(unaff_x20 + 0x39a) >> 1 & 1) == 0) || (-1 < *(char *)(unaff_x19 + 0xa1b))) ||
       (uVar8 = func_0x007315f4(), (uVar8 & 1) != 0)) {
      uVar14 = 0;
    }
    else {
      uVar14 = func_0x00794ee8();
    }
    *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) =
         *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) & 0xffffffffffffefff;
    func_0x007706e4();
    func_0x00768170();
  }
  else {
    lVar9 = *(long *)(unaff_x19 + 0x18);
    if ((((unaff_x19 != 0) && (*(char *)(lVar9 + 0x4f6) != '\0')) &&
        ((*(char *)(unaff_x19 + 0xa1d) < '\0' &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))))) && (0 < iRam0000000000a2b570)) {
      func_0x0073cfbc();
    }
    *(undefined1 *)(lVar9 + 0x4f6) = 0;
  }
  uVar8 = (ulong)uStack0000000000000030._4_4_;
  if (uStack0000000000000030._4_4_ != 0xffffffff) {
    func_0x0072db20();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return uVar14;
  }
  auVar17 = ___stack_chk_fail();
  puVar2 = (ulong *)(auVar17._0_8_ + 0xa1a);
  uVar13 = *puVar2;
  *puVar2 = uVar13 | 0x8000000;
  uVar14 = func_0x007738a0(auVar17._0_8_,4,auVar17._8_8_,uVar8);
  *puVar2 = *puVar2 & 0xfffffffff0000000 | *puVar2 & 0x7ffffff | uVar13 & 0x8000000;
  return uVar14;
}

