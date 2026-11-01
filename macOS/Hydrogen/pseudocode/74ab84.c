
/* WARNING: Removing unreachable block (ram,0x0074ab78) */
/* WARNING: Removing unreachable block (ram,0x0074ab7c) */

undefined8 FUN_0074ab84(void)

{
  bool bVar1;
  ulong *puVar2;
  int iVar3;
  ulong uVar4;
  int *piVar5;
  undefined4 *puVar6;
  undefined4 uVar7;
  char cVar8;
  long unaff_x19;
  long unaff_x20;
  ulong uVar9;
  int unaff_w21;
  undefined8 uVar10;
  long lVar11;
  long unaff_x22;
  undefined4 unaff_w24;
  uint unaff_w25;
  uint unaff_w26;
  long unaff_x29;
  undefined1 auVar12 [16];
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined1 uStack00000000000000af;
  char in_stack_000005b1;
  undefined1 auStack_7ffffffe [2147483614];
  
  if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0) ||
     (0 < *(int *)(*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) + 8))) {
    func_0x0077ea88(0x31,&uStack00000000000000af,0x100);
    func_0x0073cab8();
  }
  uStack0000000000000030._0_4_ = unaff_w24;
  iVar3 = _getsockname(*(undefined4 *)(unaff_x20 + 0x238),auStack_7ffffffe + 0x800005ae,
                       &uStack0000000000000030);
  if (iVar3 == 0) {
    for (; (unaff_w25 & 0xffff) <= unaff_w26; unaff_w25 = (unaff_w25 & 0xffff) + 1) {
      iVar3 = _bind(uStack0000000000000030._4_4_,auStack_7ffffffe + 0x800005ae,
                    (undefined4)uStack0000000000000030);
      if (iVar3 == 0) {
        uStack0000000000000030._0_4_ = 0x80;
        iVar3 = _getsockname(uStack0000000000000030._4_4_,auStack_7ffffffe + 0x800005ae,
                             &uStack0000000000000030);
        if (iVar3 != 0) goto LAB_0074a65c;
        if (unaff_x19 == 0) {
          iVar3 = _listen(uStack0000000000000030._4_4_,1);
          if (iVar3 == 0) goto code_r0x0074ad5c;
        }
        else {
          if (*(char *)(unaff_x22 + 3) < '\0') {
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
            if ((*(char *)(unaff_x22 + 3) < '\0') &&
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
            func_0x0074ef88();
            uVar4 = *(ulong *)(unaff_x20 + 0x398);
            if ((uVar4 & 0x10800) == 0x800) {
              uVar4 = uVar4 | 0x10000;
              *(ulong *)(unaff_x20 + 0x398) = uVar4;
            }
            if (unaff_w21 == 2) goto code_r0x0074ad90;
            goto code_r0x0074adf0;
          }
        }
        puVar6 = (undefined4 *)___error();
        func_0x0077ea88(*puVar6,&uStack00000000000000af,0x100);
        break;
      }
      piVar5 = (int *)___error();
      iVar3 = *piVar5;
      if ((iVar3 != 0xd) && (iVar3 != 0x30)) {
        func_0x0077ea88(iVar3,&uStack00000000000000af,0x100);
        break;
      }
    }
  }
  else {
LAB_0074a65c:
    puVar6 = (undefined4 *)___error();
    func_0x0077ea88(*puVar6,&uStack00000000000000af,0x100);
  }
  func_0x0073c9e4();
  uVar10 = 0x1e;
  goto code_r0x0074a764;
code_r0x0074ae40:
  cVar8 = *(char *)(unaff_x29 + -0xa0 + lVar11);
  if (cVar8 == '.') {
    cVar8 = ',';
  }
  else if (cVar8 == '\0') goto code_r0x0074ae50;
  auStack_7ffffffe[lVar11 + 0x80000038] = cVar8;
  lVar11 = lVar11 + 1;
  goto code_r0x0074ae40;
code_r0x0074ae50:
  auStack_7ffffffe[lVar11 + 0x80000038] = 0;
  func_0x00764560(auStack_7ffffffe + lVar11 + 0x80000038,0x14,",%d,%d");
  uVar10 = func_0x0076e34c();
  if ((int)uVar10 != 0) {
    func_0x0077e9f4();
code_r0x0074af00:
    func_0x0073c9e4();
    goto code_r0x0074a764;
  }
  uVar7 = 1;
  goto code_r0x0074ad94;
code_r0x0074adf0:
  do {
    if ((unaff_w21 != 0) || ((uVar4 & 0x10000) != 0)) {
      if ((unaff_w21 == 1) && (in_stack_000005b1 != '\x02')) break;
      if ((in_stack_000005b1 == '\x1e') || (in_stack_000005b1 == '\x02')) {
        if (unaff_w21 == 0) {
          uVar10 = func_0x0076e34c();
          if ((int)uVar10 != 0) {
            func_0x0077e9f4();
            goto code_r0x0074af00;
          }
          uVar7 = 0;
          goto code_r0x0074ad94;
        }
        if (unaff_w21 == 1) {
          lVar11 = 0;
          goto code_r0x0074ae40;
        }
      }
    }
    unaff_w21 = unaff_w21 + 1;
  } while (unaff_w21 != 2);
code_r0x0074ad90:
  uVar7 = 2;
code_r0x0074ad94:
  *(undefined4 *)(unaff_x20 + 0x4e8) = uVar7;
  func_0x007466c4();
  uVar10 = func_0x0072f958();
  if ((int)uVar10 == 0) {
    uStack0000000000000030._4_4_ = 0xffffffff;
  }
code_r0x0074a764:
  if (in_stack_00000028 != 0) {
    func_0x00750010();
  }
  if ((int)uVar10 == 0) {
    if ((((*(byte *)(unaff_x20 + 0x39a) >> 1 & 1) == 0) || (-1 < *(char *)(unaff_x19 + 0xa1b))) ||
       (uVar4 = func_0x007315f4(), (uVar4 & 1) != 0)) {
      uVar10 = 0;
    }
    else {
      uVar10 = func_0x00794ee8();
    }
    *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) =
         *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x398) & 0xffffffffffffefff;
    func_0x007706e4();
    func_0x00768170();
  }
  else {
    lVar11 = *(long *)(unaff_x19 + 0x18);
    if ((((unaff_x19 != 0) && (*(char *)(lVar11 + 0x4f6) != '\0')) &&
        ((*(char *)(unaff_x19 + 0xa1d) < '\0' &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))))) && (0 < iRam0000000000a2b570)) {
      func_0x0073cfbc();
    }
    *(undefined1 *)(lVar11 + 0x4f6) = 0;
  }
  uVar4 = (ulong)uStack0000000000000030._4_4_;
  if (uStack0000000000000030._4_4_ != 0xffffffff) {
    func_0x0072db20();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
    return uVar10;
  }
  auVar12 = ___stack_chk_fail();
  puVar2 = (ulong *)(auVar12._0_8_ + 0xa1a);
  uVar9 = *puVar2;
  *puVar2 = uVar9 | 0x8000000;
  uVar10 = func_0x007738a0(auVar12._0_8_,4,auVar12._8_8_,uVar4);
  *puVar2 = *puVar2 & 0xfffffffff0000000 | *puVar2 & 0x7ffffff | uVar9 & 0x8000000;
  return uVar10;
}

