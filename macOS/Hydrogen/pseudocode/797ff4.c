
void FUN_00797ff4(long param_1)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  ulong extraout_x8;
  ulong uVar5;
  long *plVar6;
  undefined8 *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  undefined *unaff_x23;
  undefined *unaff_x24;
  long lVar7;
  long unaff_x25;
  ulong unaff_x26;
  long unaff_x27;
  long lVar8;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  
code_r0x00797ff4:
  param_1 = param_1 + unaff_x27;
  if (((*(long *)(param_1 + 0x70) != in_stack_00000018 ||
       *(long *)(param_1 + 0x78) != in_stack_00000020) ||
      *(long *)(param_1 + 0x80) != in_stack_00000028) ||
      *(long *)(param_1 + 0x88) != in_stack_00000030) goto LAB_00797f7c;
LAB_007980dc:
  if ((((unaff_x21 != 0) && (*(char *)(unaff_x21 + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x21 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x21 + 0x18) + 8))))) && (0 < iRam0000000000a2b590)) {
    func_0x0073d22c();
  }
  lVar3 = (*pcRam0000000000a2b600)();
  plVar6 = (long *)(*(long *)(unaff_x22 + 8) + unaff_x26 * 0xa8);
  *plVar6 = lVar3;
  if (lVar3 == 0) {
    uVar4 = 0x1b;
    lVar3 = *(long *)PTR____stack_chk_guard_009b01e8;
  }
  else {
    uVar4 = 0;
    *unaff_x19 = plVar6;
    lVar3 = *(long *)PTR____stack_chk_guard_009b01e8;
  }
  do {
    if (lVar3 == in_stack_00000038) {
      return;
    }
    ___stack_chk_fail(uVar4);
    if (extraout_x8 != 0) {
      if (unaff_x23 == (undefined *)0x0) {
        lVar3 = 0;
        lVar7 = 0;
        unaff_x26 = 0;
        lVar8 = *(long *)(unaff_x22 + 8);
        unaff_x23 = &UNK_00a1f5c0;
        uVar5 = extraout_x8;
        do {
          if (((*(long *)(lVar8 + lVar3) == 0) && ((*(byte *)(lVar8 + lVar3 + 0xa0) & 1) != 0)) &&
             (*(long *)(lVar8 + lVar3 + 8) == 0)) {
            if (lVar7 == 0) {
              lVar7 = _strlen();
            }
            uVar4 = func_0x0074edd8(&UNK_00a1f5c0,lVar8 + lVar3 + 0x50,0x20);
            if ((int)uVar4 != 0) goto code_r0x0079819c;
            lVar8 = *(long *)(unaff_x22 + 8);
            lVar1 = lVar8 + lVar3;
            if (((*(long *)(lVar1 + 0x70) == in_stack_00000018 &&
                 *(long *)(lVar1 + 0x78) == in_stack_00000020) &&
                *(long *)(lVar1 + 0x80) == in_stack_00000028) &&
                *(long *)(lVar1 + 0x88) == in_stack_00000030) goto LAB_007980dc;
            uVar5 = *(ulong *)(unaff_x22 + 0x10);
          }
          unaff_x26 = unaff_x26 + 1;
          lVar3 = lVar3 + 0xa8;
        } while (unaff_x26 < uVar5);
      }
      else {
        unaff_x27 = 0;
        unaff_x25 = 0;
        unaff_x26 = 0;
        unaff_x24 = &UNK_00a1f5c0;
        do {
          if (((*(long *)(*(long *)(unaff_x22 + 8) + unaff_x27) == 0) &&
              (lVar3 = *(long *)(unaff_x22 + 8) + unaff_x27, (*(byte *)(lVar3 + 0xa0) & 1) != 0)) &&
             (iVar2 = func_0x0077e860(*(undefined8 *)(lVar3 + 8),*(undefined8 *)(unaff_x23 + 0x18)),
             iVar2 != 0)) {
            if (unaff_x25 == 0) {
              unaff_x25 = _strlen();
            }
            uVar4 = func_0x0074edd8(unaff_x24,*(long *)(unaff_x22 + 8) + unaff_x27 + 0x50,0x20);
            if ((int)uVar4 != 0) goto code_r0x0079819c;
            param_1 = *(long *)(unaff_x22 + 8);
            goto code_r0x00797ff4;
          }
LAB_00797f7c:
          unaff_x26 = unaff_x26 + 1;
          unaff_x27 = unaff_x27 + 0xa8;
        } while (unaff_x26 < *(ulong *)(unaff_x22 + 0x10));
      }
    }
    if ((unaff_x21 != 0) && (*(char *)(unaff_x21 + 0xa1d) < '\0')) {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x21 + 0x18) == 0) {
        if (0 < iRam0000000000a2b590) goto code_r0x00798184;
      }
      else if (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x21 + 0x18) + 8) && 0 < iRam0000000000a2b590) {
code_r0x00798184:
        func_0x0073d22c();
      }
    }
    uVar4 = 0;
code_r0x0079819c:
    lVar3 = *(long *)PTR____stack_chk_guard_009b01e8;
  } while( true );
}

