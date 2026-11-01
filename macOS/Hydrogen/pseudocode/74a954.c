
undefined8 FUN_0074a954(void)

{
  bool bVar1;
  ulong *puVar2;
  uint uVar3;
  uint uVar4;
  byte bVar5;
  int iVar6;
  uint uVar7;
  undefined4 *puVar8;
  ulong uVar9;
  int *piVar10;
  undefined4 uVar11;
  char cVar12;
  long unaff_x19;
  long unaff_x20;
  ulong uVar13;
  int unaff_w21;
  undefined8 uVar14;
  long lVar15;
  ulong unaff_x23;
  uint unaff_w24;
  long unaff_x29;
  undefined1 auVar16 [16];
  long *in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined1 uStack000000000000007d;
  undefined1 uStack00000000000000af;
  undefined1 uStack00000000000001af;
  char in_stack_000005b1;
  undefined1 auStack_7ffffffe [2147483614];
  
  _strtoul();
  uVar7 = func_0x0078bbc8();
  uVar3 = 0;
  if (unaff_w24 <= uVar7) {
    uVar3 = unaff_w24;
  }
  uVar4 = 0;
  if (unaff_w24 <= uVar7) {
    uVar4 = uVar7;
  }
  if (unaff_x23 == 0) {
LAB_0074a640:
    uStack0000000000000030._0_4_ = 0x80;
    iVar6 = _getsockname(*(undefined4 *)(unaff_x20 + 0x238),auStack_7ffffffe + 0x800005ae,
                         &uStack0000000000000030);
    if (iVar6 != 0) {
code_r0x0074a65c:
      puVar8 = (undefined4 *)___error();
      func_0x0077ea88(*puVar8,&uStack00000000000000af,0x100);
      goto code_r0x0074a758;
    }
    if (in_stack_000005b1 == '\x1e') {
      lVar15 = _inet_ntop(0x1e,auStack_7ffffffe + 0x800005b6,&uStack00000000000001af,0x401);
    }
    else {
      lVar15 = _inet_ntop(in_stack_000005b1,(ulong)(auStack_7ffffffe + 0x800005ae) | 4,
                          &uStack00000000000001af,0x401);
    }
    if (lVar15 != 0) {
      bVar5 = 0;
      goto code_r0x0074a6c4;
    }
  }
  else if (unaff_x23 < 0x32) {
    ___memcpy_chk(&uStack000000000000007d);
    auStack_7ffffffe[unaff_x23 + 0x8000007b] = 0;
    uVar11 = **(undefined4 **)(unaff_x20 + 0x50);
    uVar14 = func_0x0075af24(*(undefined4 **)(unaff_x20 + 0x50) + 4);
    iVar6 = func_0x0075b008(uVar11,uVar14,*(undefined4 *)(unaff_x20 + 0x520),&uStack000000000000007d
                            ,&uStack00000000000001af,0x401);
    if (iVar6 == 0) {
      bVar5 = 1;
    }
    else {
      if (iVar6 == 1) goto code_r0x0074a760;
      if (iVar6 != 2) goto LAB_0074a640;
      bVar5 = 1;
    }
code_r0x0074a6c4:
    iVar6 = func_0x0074f754();
    if (iVar6 == 1) {
      func_0x00728b3c();
    }
    if ((in_stack_00000028 != (long *)0x0) && (lVar15 = *in_stack_00000028, lVar15 != 0)) {
      do {
        iVar6 = func_0x0072d954();
        if (iVar6 == 0) {
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
          ___memcpy_chk(auStack_7ffffffe + 0x800005ae,*(undefined8 *)(lVar15 + 0x20),
                        *(undefined4 *)(lVar15 + 0x10),0x80);
          uStack0000000000000030._0_4_ = *(undefined4 *)(lVar15 + 0x10);
          if (uVar4 < uVar3) goto code_r0x0074a758;
          uVar7 = uVar3;
          goto code_r0x0074ab3c;
        }
        puVar8 = (undefined4 *)___error();
        lVar15 = *(long *)(lVar15 + 0x28);
      } while (lVar15 != 0);
code_r0x0074a72c:
      func_0x0077ea88(*puVar8,&uStack00000000000000af,0x100);
    }
    goto code_r0x0074a758;
  }
  goto code_r0x0074a760;
code_r0x0074adf0:
  do {
    if ((unaff_w21 != 0) || ((uVar9 & 0x10000) != 0)) {
      if ((unaff_w21 == 1) && (in_stack_000005b1 != '\x02')) break;
      if ((in_stack_000005b1 == '\x1e') || (in_stack_000005b1 == '\x02')) {
        if (unaff_w21 == 0) {
          uVar14 = func_0x0076e34c();
          if ((int)uVar14 == 0) {
            uVar11 = 0;
            goto code_r0x0074ad94;
          }
          func_0x0077e9f4();
          goto code_r0x0074af00;
        }
        if (unaff_w21 == 1) {
          lVar15 = 0;
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
  goto code_r0x0074a764;
code_r0x0074ae40:
  cVar12 = *(char *)(unaff_x29 + -0xa0 + lVar15);
  if (cVar12 == '.') {
    cVar12 = ',';
  }
  else if (cVar12 == '\0') goto code_r0x0074ae50;
  auStack_7ffffffe[lVar15 + 0x80000038] = cVar12;
  lVar15 = lVar15 + 1;
  goto code_r0x0074ae40;
code_r0x0074ae50:
  auStack_7ffffffe[lVar15 + 0x80000038] = 0;
  func_0x00764560(auStack_7ffffffe + lVar15 + 0x80000038,0x14,",%d,%d");
  uVar14 = func_0x0076e34c();
  if ((int)uVar14 != 0) {
    func_0x0077e9f4();
code_r0x0074af00:
    func_0x0073c9e4();
    goto code_r0x0074a764;
  }
  uVar11 = 1;
  goto code_r0x0074ad94;
  while ((uVar7 & 0xffff) <= uVar4) {
code_r0x0074ab3c:
    iVar6 = _bind(uStack0000000000000030._4_4_,auStack_7ffffffe + 0x800005ae,
                  (undefined4)uStack0000000000000030);
    if (iVar6 == 0) {
      uStack0000000000000030._0_4_ = 0x80;
      iVar6 = _getsockname(uStack0000000000000030._4_4_,auStack_7ffffffe + 0x800005ae,
                           &uStack0000000000000030);
      if (iVar6 != 0) goto code_r0x0074a65c;
      if (unaff_x19 == 0) {
        iVar6 = _listen(uStack0000000000000030._4_4_,1);
        if (iVar6 == 0) goto code_r0x0074ad5c;
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
        iVar6 = _listen(uStack0000000000000030._4_4_,1);
        if (iVar6 == 0) {
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
          func_0x0074ef88(lVar15,unaff_x29 + -0xa0,0x2f);
          uVar9 = *(ulong *)(unaff_x20 + 0x398);
          if ((uVar9 & 0x10800) == 0x800) {
            uVar9 = uVar9 | 0x10000;
            *(ulong *)(unaff_x20 + 0x398) = uVar9;
          }
          if (unaff_w21 == 2) goto code_r0x0074ad90;
          goto code_r0x0074adf0;
        }
      }
      puVar8 = (undefined4 *)___error();
      goto code_r0x0074a72c;
    }
    piVar10 = (int *)___error();
    iVar6 = *piVar10;
    if ((bool)(bVar5 & iVar6 == 0x31)) {
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
      iVar6 = _getsockname(*(undefined4 *)(unaff_x20 + 0x238),auStack_7ffffffe + 0x800005ae,
                           &uStack0000000000000030);
      if (iVar6 != 0) goto code_r0x0074a65c;
      bVar5 = 0;
      uVar7 = uVar3;
    }
    else {
      if ((iVar6 != 0xd) && (iVar6 != 0x30)) {
        func_0x0077ea88(iVar6,&uStack00000000000000af,0x100);
        break;
      }
      uVar7 = (uVar7 & 0xffff) + 1;
    }
  }
code_r0x0074a758:
  func_0x0073c9e4();
code_r0x0074a760:
  uVar14 = 0x1e;
code_r0x0074a764:
  if (in_stack_00000028 != (long *)0x0) {
    func_0x00750010();
  }
  if ((int)uVar14 == 0) {
    if ((((*(byte *)(unaff_x20 + 0x39a) >> 1 & 1) == 0) || (-1 < *(char *)(unaff_x19 + 0xa1b))) ||
       (uVar9 = func_0x007315f4(), (uVar9 & 1) != 0)) {
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
    lVar15 = *(long *)(unaff_x19 + 0x18);
    if (((unaff_x19 != 0) && (*(char *)(lVar15 + 0x4f6) != '\0')) &&
       (((*(char *)(unaff_x19 + 0xa1d) < '\0' &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)))) {
      func_0x0073cfbc();
    }
    *(undefined1 *)(lVar15 + 0x4f6) = 0;
  }
  uVar9 = (ulong)uStack0000000000000030._4_4_;
  if (uStack0000000000000030._4_4_ != 0xffffffff) {
    func_0x0072db20();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return uVar14;
  }
  auVar16 = ___stack_chk_fail();
  puVar2 = (ulong *)(auVar16._0_8_ + 0xa1a);
  uVar13 = *puVar2;
  *puVar2 = uVar13 | 0x8000000;
  uVar14 = func_0x007738a0(auVar16._0_8_,4,auVar16._8_8_,uVar9);
  *puVar2 = *puVar2 & 0xfffffffff0000000 | *puVar2 & 0x7ffffff | uVar13 & 0x8000000;
  return uVar14;
}

