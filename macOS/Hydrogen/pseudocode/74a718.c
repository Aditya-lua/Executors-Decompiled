
undefined8 FUN_0074a718(void)

{
  bool bVar1;
  ulong *puVar2;
  int iVar3;
  undefined4 *puVar4;
  ulong uVar5;
  int *piVar6;
  uint uVar7;
  undefined4 uVar8;
  char cVar9;
  long unaff_x19;
  long unaff_x20;
  ulong uVar10;
  int unaff_w21;
  undefined8 uVar11;
  long lVar12;
  long unaff_x23;
  uint unaff_w25;
  uint unaff_w26;
  byte unaff_w27;
  long unaff_x29;
  undefined1 auVar13 [16];
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined1 uStack00000000000000af;
  char in_stack_000005b1;
  undefined1 auStack_7ffffffe [2147483614];
  
  do {
    iVar3 = func_0x0072d954();
    if (iVar3 == 0) {
      if ((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0) {
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
      ___memcpy_chk(auStack_7ffffffe + 0x800005ae,*(undefined8 *)(unaff_x23 + 0x20),
                    *(undefined4 *)(unaff_x23 + 0x10),0x80);
      uStack0000000000000030._0_4_ = *(undefined4 *)(unaff_x23 + 0x10);
      if (unaff_w26 < unaff_w25) goto LAB_0074a758;
      uVar7 = unaff_w25;
      goto code_r0x0074ab3c;
    }
    puVar4 = (undefined4 *)___error();
    unaff_x23 = *(long *)(unaff_x23 + 0x28);
  } while (unaff_x23 != 0);
code_r0x0074a72c:
  func_0x0077ea88(*puVar4,&uStack00000000000000af,0x100);
  goto LAB_0074a758;
code_r0x0074adf0:
  do {
    if ((unaff_w21 != 0) || ((uVar5 & 0x10000) != 0)) {
      if ((unaff_w21 == 1) && (in_stack_000005b1 != '\x02')) break;
      if ((in_stack_000005b1 == '\x1e') || (in_stack_000005b1 == '\x02')) {
        if (unaff_w21 == 0) {
          uVar11 = func_0x0076e34c();
          if ((int)uVar11 != 0) {
            func_0x0077e9f4();
            goto code_r0x0074af00;
          }
          uVar8 = 0;
          goto code_r0x0074ad94;
        }
        if (unaff_w21 == 1) {
          lVar12 = 0;
          goto code_r0x0074ae40;
        }
      }
    }
    unaff_w21 = unaff_w21 + 1;
  } while (unaff_w21 != 2);
code_r0x0074ad90:
  uVar8 = 2;
code_r0x0074ad94:
  *(undefined4 *)(unaff_x20 + 0x4e8) = uVar8;
  func_0x007466c4();
  uVar11 = func_0x0072f958();
  if ((int)uVar11 == 0) {
    uStack0000000000000030._4_4_ = 0xffffffff;
  }
  goto LAB_0074a764;
code_r0x0074ae40:
  cVar9 = *(char *)(unaff_x29 + -0xa0 + lVar12);
  if (cVar9 == '.') {
    cVar9 = ',';
  }
  else if (cVar9 == '\0') goto code_r0x0074ae50;
  auStack_7ffffffe[lVar12 + 0x80000038] = cVar9;
  lVar12 = lVar12 + 1;
  goto code_r0x0074ae40;
code_r0x0074ae50:
  auStack_7ffffffe[lVar12 + 0x80000038] = 0;
  func_0x00764560(auStack_7ffffffe + lVar12 + 0x80000038,0x14,",%d,%d");
  uVar11 = func_0x0076e34c();
  if ((int)uVar11 != 0) {
    func_0x0077e9f4();
code_r0x0074af00:
    func_0x0073c9e4();
    goto LAB_0074a764;
  }
  uVar8 = 1;
  goto code_r0x0074ad94;
  while( true ) {
    piVar6 = (int *)___error();
    iVar3 = *piVar6;
    if ((unaff_w27 & iVar3 == 0x31) == 1) {
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
      iVar3 = _getsockname(*(undefined4 *)(unaff_x20 + 0x238),auStack_7ffffffe + 0x800005ae,
                           &uStack0000000000000030);
      if (iVar3 != 0) goto code_r0x0074a65c;
      unaff_w27 = 0;
      uVar7 = unaff_w25;
    }
    else {
      if ((iVar3 != 0xd) && (iVar3 != 0x30)) {
        func_0x0077ea88(iVar3,&uStack00000000000000af,0x100);
        break;
      }
      uVar7 = (uVar7 & 0xffff) + 1;
    }
    if (unaff_w26 < (uVar7 & 0xffff)) break;
code_r0x0074ab3c:
    iVar3 = _bind(uStack0000000000000030._4_4_,auStack_7ffffffe + 0x800005ae,
                  (undefined4)uStack0000000000000030);
    if (iVar3 == 0) {
      uStack0000000000000030._0_4_ = 0x80;
      iVar3 = _getsockname(uStack0000000000000030._4_4_,auStack_7ffffffe + 0x800005ae,
                           &uStack0000000000000030);
      if (iVar3 == 0) {
        if (unaff_x19 == 0) {
          iVar3 = _listen(uStack0000000000000030._4_4_,1);
          if (iVar3 == 0) goto code_r0x0074ad5c;
        }
        else {
          if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
            if (*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
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
          iVar3 = _listen(uStack0000000000000030._4_4_,1);
          if (iVar3 == 0) {
            if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
               (((*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) == 0 ||
                 (0 < *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b570))))
            {
              func_0x0073cfbc();
            }
code_r0x0074ad5c:
            func_0x0074ef88(unaff_x23,unaff_x29 + -0xa0,0x2f);
            uVar5 = *(ulong *)(unaff_x20 + 0x398);
            if ((uVar5 & 0x10800) == 0x800) {
              uVar5 = uVar5 | 0x10000;
              *(ulong *)(unaff_x20 + 0x398) = uVar5;
            }
            if (unaff_w21 == 2) goto code_r0x0074ad90;
            goto code_r0x0074adf0;
          }
        }
        puVar4 = (undefined4 *)___error();
        goto code_r0x0074a72c;
      }
code_r0x0074a65c:
      puVar4 = (undefined4 *)___error();
      func_0x0077ea88(*puVar4,&uStack00000000000000af,0x100);
      break;
    }
  }
LAB_0074a758:
  func_0x0073c9e4();
  uVar11 = 0x1e;
LAB_0074a764:
  if (in_stack_00000028 != 0) {
    func_0x00750010();
  }
  if ((int)uVar11 == 0) {
    if ((((*(byte *)(unaff_x20 + 0x39a) >> 1 & 1) == 0) || (-1 < *(char *)(unaff_x19 + 0xa1b))) ||
       (uVar5 = func_0x007315f4(), (uVar5 & 1) != 0)) {
      uVar11 = 0;
    }
    else {
      uVar11 = func_0x00794ee8();
    }
    *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) =
         *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) & 0xffffffffffffefff;
    func_0x007706e4();
    func_0x00768170();
  }
  else {
    lVar12 = *(long *)(unaff_x19 + 0x18);
    if (((unaff_x19 != 0) && (*(char *)(lVar12 + 0x4f6) != '\0')) &&
       (((*(char *)(unaff_x19 + 0xa1d) < '\0' &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)))) {
      func_0x0073cfbc();
    }
    *(undefined1 *)(lVar12 + 0x4f6) = 0;
  }
  uVar5 = (ulong)uStack0000000000000030._4_4_;
  if (uStack0000000000000030._4_4_ != 0xffffffff) {
    func_0x0072db20();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return uVar11;
  }
  auVar13 = ___stack_chk_fail();
  puVar2 = (ulong *)(auVar13._0_8_ + 0xa1a);
  uVar10 = *puVar2;
  *puVar2 = uVar10 | 0x8000000;
  uVar11 = func_0x007738a0(auVar13._0_8_,4,auVar13._8_8_,uVar5);
  *puVar2 = *puVar2 & 0xfffffffff0000000 | *puVar2 & 0x7ffffff | uVar10 & 0x8000000;
  return uVar11;
}

