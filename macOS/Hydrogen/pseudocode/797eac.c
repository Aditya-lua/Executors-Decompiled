
void FUN_00797eac(void)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  long *plVar4;
  ulong extraout_x8;
  ulong uVar5;
  long lVar6;
  undefined8 *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  undefined *unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  long lVar7;
  ulong uVar8;
  long lVar9;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  
  while ((iVar2 = func_0x0077e6f8(), iVar2 == 0 ||
         (iVar2 = func_0x0077e860(*(undefined8 *)(*(long *)(unaff_x22 + 8) + unaff_x25 + 8),
                                  *(undefined8 *)(unaff_x23 + 0x18)), iVar2 == 0))) {
    do {
      unaff_x24 = unaff_x24 + 1;
      uVar5 = *(ulong *)(unaff_x22 + 0x10);
      unaff_x25 = unaff_x25 + 0xa8;
      if (uVar5 <= unaff_x24) goto code_r0x00797f5c;
    } while (*(long *)(*(long *)(unaff_x22 + 8) + unaff_x25) == 0);
  }
  plVar4 = (long *)(*(long *)(unaff_x22 + 8) + unaff_x24 * 0xa8);
code_r0x00797f1c:
  uVar3 = 0;
  *unaff_x19 = plVar4;
  lVar6 = *(long *)PTR____stack_chk_guard_009b01e8;
joined_r0x00797f34:
  do {
    if (lVar6 == in_stack_00000038) {
      return;
    }
    ___stack_chk_fail(uVar3);
    uVar5 = extraout_x8;
code_r0x00797f5c:
    if (uVar5 != 0) {
      if (unaff_x23 == (undefined *)0x0) {
        lVar6 = 0;
        lVar7 = 0;
        uVar8 = 0;
        lVar9 = *(long *)(unaff_x22 + 8);
        unaff_x23 = &UNK_00a1f5c0;
        do {
          if (((*(long *)(lVar9 + lVar6) == 0) && ((*(byte *)(lVar9 + lVar6 + 0xa0) & 1) != 0)) &&
             (*(long *)(lVar9 + lVar6 + 8) == 0)) {
            if (lVar7 == 0) {
              lVar7 = _strlen();
            }
            uVar3 = func_0x0074edd8(&UNK_00a1f5c0,lVar9 + lVar6 + 0x50,0x20);
            if ((int)uVar3 != 0) goto LAB_0079819c;
            lVar9 = *(long *)(unaff_x22 + 8);
            lVar1 = lVar9 + lVar6;
            if (((*(long *)(lVar1 + 0x70) == in_stack_00000018 &&
                 *(long *)(lVar1 + 0x78) == in_stack_00000020) &&
                *(long *)(lVar1 + 0x80) == in_stack_00000028) &&
                *(long *)(lVar1 + 0x88) == in_stack_00000030) goto code_r0x007980dc;
            uVar5 = *(ulong *)(unaff_x22 + 0x10);
          }
          uVar8 = uVar8 + 1;
          lVar6 = lVar6 + 0xa8;
        } while (uVar8 < uVar5);
      }
      else {
        lVar6 = 0;
        lVar7 = 0;
        uVar8 = 0;
        do {
          if (((*(long *)(*(long *)(unaff_x22 + 8) + lVar6) == 0) &&
              (lVar9 = *(long *)(unaff_x22 + 8) + lVar6, (*(byte *)(lVar9 + 0xa0) & 1) != 0)) &&
             (iVar2 = func_0x0077e860(*(undefined8 *)(lVar9 + 8),*(undefined8 *)(unaff_x23 + 0x18)),
             iVar2 != 0)) {
            if (lVar7 == 0) {
              lVar7 = _strlen();
            }
            uVar3 = func_0x0074edd8(&UNK_00a1f5c0,*(long *)(unaff_x22 + 8) + lVar6 + 0x50,0x20);
            if ((int)uVar3 != 0) goto LAB_0079819c;
            lVar9 = *(long *)(unaff_x22 + 8) + lVar6;
            if (((*(long *)(lVar9 + 0x70) == in_stack_00000018 &&
                 *(long *)(lVar9 + 0x78) == in_stack_00000020) &&
                *(long *)(lVar9 + 0x80) == in_stack_00000028) &&
                *(long *)(lVar9 + 0x88) == in_stack_00000030) goto code_r0x007980dc;
          }
          uVar8 = uVar8 + 1;
          lVar6 = lVar6 + 0xa8;
        } while (uVar8 < *(ulong *)(unaff_x22 + 0x10));
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
    uVar3 = 0;
LAB_0079819c:
    lVar6 = *(long *)PTR____stack_chk_guard_009b01e8;
  } while( true );
code_r0x007980dc:
  if (((unaff_x21 != 0) && (*(char *)(unaff_x21 + 0xa1d) < '\0')) &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x21 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x21 + 0x18) + 8))) && (0 < iRam0000000000a2b590)))) {
    func_0x0073d22c();
  }
  lVar6 = (*pcRam0000000000a2b600)();
  plVar4 = (long *)(*(long *)(unaff_x22 + 8) + uVar8 * 0xa8);
  *plVar4 = lVar6;
  if (lVar6 != 0) goto code_r0x00797f1c;
  uVar3 = 0x1b;
  lVar6 = *(long *)PTR____stack_chk_guard_009b01e8;
  goto joined_r0x00797f34;
}

