
undefined8 FUN_004a83ac(void)

{
  char *pcVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined8 extraout_x1;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar5;
  long *plVar6;
  long unaff_x22;
  long unaff_x23;
  long lVar7;
  long unaff_x24;
  long lVar8;
  long unaff_x25;
  long lVar9;
  char in_wzr;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  do {
    unaff_x23 = unaff_x23 + 8;
    if (unaff_x24 == unaff_x23) {
      if (unaff_x22 != 0) {
        func_0x00187bd4();
      }
      func_0x005dadec(&uStack0000000000000008);
      unaff_x19 = in_stack_00000010;
      unaff_x22 = uStack0000000000000008;
      if (in_stack_00000018 == 0) goto LAB_004a84a8;
      lVar7 = 0;
      lVar8 = in_stack_00000018 * 8;
      goto LAB_004a8430;
    }
  } while ((**(long **)(unaff_x19 + unaff_x23) != unaff_x25) ||
          (uVar3 = func_0x004ae0d0(*(long **)(unaff_x19 + unaff_x23) + 1), (uVar3 & 1) == 0));
LAB_004a83d8:
  uVar5 = 1;
  uVar4 = 1;
joined_r0x004a84b0:
  if (unaff_x22 != 0) {
    func_0x00187bd4(unaff_x19,unaff_x22 << 3,8);
    uVar4 = uVar5;
  }
  return uVar4;
  while( true ) {
    if (*plVar6 == 10) {
      lVar9 = plVar6[4];
      pcVar1 = (char *)(lVar9 + 8);
      if (*pcVar1 == '\0') {
        *pcVar1 = '\x01';
      }
      else {
        func_0x007aff64(pcVar1,extraout_x1,1000000000);
      }
      func_0x004b023c(lVar9 + 0x28,*unaff_x20);
      if (*pcVar1 == '\x01') {
        *pcVar1 = in_wzr;
      }
      else {
        func_0x007b05dc(pcVar1,0);
      }
    }
    lVar7 = lVar7 + 8;
    if (lVar8 == lVar7) break;
LAB_004a8430:
    plVar6 = *(long **)(unaff_x19 + lVar7);
    iVar2 = func_0x004a2ad0(plVar6);
    if (iVar2 != 0) goto LAB_004a83d8;
  }
LAB_004a84a8:
  uVar5 = 0;
  uVar4 = 0;
  goto joined_r0x004a84b0;
}

