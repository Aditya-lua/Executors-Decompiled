
undefined8 thunk_FUN_005cc530(void)

{
  char *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 extraout_x1;
  long lVar4;
  undefined8 *unaff_x20;
  long *plVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 *unaff_x26;
  char unaff_w27;
  undefined8 *unaff_x28;
  undefined8 *puVar8;
  char in_wzr;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  
  do {
    puVar8 = unaff_x28 + 1;
    plVar5 = (long *)*unaff_x28;
    iVar2 = func_0x005ccb98(plVar5);
    if (iVar2 != 0) {
      uVar6 = 1;
      if (in_stack_00000008 == 0) {
        return 1;
      }
      goto code_r0x005cc5ec;
    }
    if (*plVar5 == 10) {
      lVar7 = plVar5[4];
      pcVar1 = (char *)(lVar7 + 8);
      if (*pcVar1 == '\0') {
        *pcVar1 = unaff_w27;
      }
      else {
        func_0x007aff64(pcVar1,extraout_x1,1000000000);
      }
      uVar6 = *unaff_x20;
      if (*(long *)(lVar7 + 0x20) != 0) {
        lVar4 = *(long *)(lVar7 + 0x20) << 3;
        do {
          func_0x005d5ff8(uVar6);
          lVar4 = lVar4 + -8;
        } while (lVar4 != 0);
      }
      func_0x005d6394(uVar6,lVar7 + 0x28);
      if (*pcVar1 == '\x01') {
        *pcVar1 = in_wzr;
      }
      else {
        func_0x007b05dc(pcVar1,0);
      }
    }
    unaff_x28 = puVar8;
  } while (puVar8 != unaff_x26);
  uVar3 = 0;
  uVar6 = 0;
  if (in_stack_00000008 != 0) {
code_r0x005cc5ec:
    uVar3 = uVar6;
    func_0x00187bd4(in_stack_00000010,in_stack_00000008 << 3,8);
  }
  return uVar3;
}

