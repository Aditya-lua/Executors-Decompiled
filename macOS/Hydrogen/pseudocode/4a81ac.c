
undefined8 FUN_004a81ac(void)

{
  char *pcVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined8 extraout_x1;
  long lVar5;
  undefined8 *unaff_x20;
  undefined8 uVar6;
  long *plVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  char in_wzr;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  func_0x005dbf24(&uStack0000000000000008);
  lVar5 = in_stack_00000010;
  lVar8 = uStack0000000000000008;
  if (in_stack_00000018 != 0) {
    lVar9 = 0;
    lVar10 = in_stack_00000018 * 8;
    do {
      if ((**(long **)(lVar5 + lVar9) == -0x7ffffffffffffffe) &&
         (uVar3 = func_0x004ae0d0(*(long **)(lVar5 + lVar9) + 1), (uVar3 & 1) != 0))
      goto LAB_004a8200;
      lVar9 = lVar9 + 8;
    } while (lVar10 != lVar9);
  }
  if (lVar8 != 0) {
    func_0x00187bd4(lVar5,lVar8 << 3,8);
  }
  func_0x005dc058(&uStack0000000000000008);
  lVar5 = in_stack_00000010;
  lVar8 = uStack0000000000000008;
  if (in_stack_00000018 != 0) {
    lVar9 = 0;
    lVar10 = in_stack_00000018 * 8;
    do {
      plVar7 = *(long **)(lVar5 + lVar9);
      iVar2 = func_0x004a2ad0(plVar7);
      if (iVar2 != 0) goto LAB_004a8200;
      if (*plVar7 == 10) {
        lVar11 = plVar7[4];
        pcVar1 = (char *)(lVar11 + 8);
        if (*pcVar1 == '\0') {
          *pcVar1 = '\x01';
        }
        else {
          func_0x007aff64(pcVar1,extraout_x1,1000000000);
        }
        func_0x004b023c(lVar11 + 0x28,*unaff_x20);
        if (*pcVar1 == '\x01') {
          *pcVar1 = in_wzr;
        }
        else {
          func_0x007b05dc(pcVar1,0);
        }
      }
      lVar9 = lVar9 + 8;
    } while (lVar10 != lVar9);
  }
  uVar6 = 0;
  uVar4 = 0;
joined_r0x004a8208:
  if (lVar8 != 0) {
    func_0x00187bd4(lVar5,lVar8 << 3,8);
    uVar4 = uVar6;
  }
  return uVar4;
LAB_004a8200:
  uVar6 = 1;
  uVar4 = 1;
  goto joined_r0x004a8208;
}

