
undefined8 FUN_004a7b3c(undefined8 param_1,undefined8 *param_2)

{
  char *pcVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  int iVar5;
  undefined8 uVar6;
  undefined8 extraout_x1;
  long *plVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  char in_wzr;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  func_0x005dc67c(&uStack0000000000000008);
  lVar3 = in_stack_00000010;
  lVar2 = uStack0000000000000008;
  if (in_stack_00000018 != 0) {
    lVar8 = 0;
    lVar9 = in_stack_00000018 * 8;
    do {
      plVar7 = *(long **)(lVar3 + lVar8);
      iVar5 = func_0x004a2ad0(plVar7,param_2);
      if (iVar5 != 0) {
        uVar4 = 1;
        if (lVar2 == 0) {
          return 1;
        }
        goto LAB_004a7bf4;
      }
      if (*plVar7 == 10) {
        lVar10 = plVar7[4];
        pcVar1 = (char *)(lVar10 + 8);
        if (*pcVar1 == '\0') {
          *pcVar1 = '\x01';
        }
        else {
          func_0x007aff64(pcVar1,extraout_x1,1000000000);
        }
        func_0x004b023c(lVar10 + 0x28,*param_2);
        if (*pcVar1 == '\x01') {
          *pcVar1 = in_wzr;
        }
        else {
          func_0x007b05dc(pcVar1,0);
        }
      }
      lVar8 = lVar8 + 8;
    } while (lVar9 != lVar8);
  }
  uVar6 = 0;
  uVar4 = 0;
  if (lVar2 != 0) {
LAB_004a7bf4:
    uVar6 = uVar4;
    func_0x00187bd4(lVar3,lVar2 << 3,8);
  }
  return uVar6;
}

