
undefined8 FUN_004ab9e0(void)

{
  char *pcVar1;
  undefined8 uVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 *extraout_x1;
  undefined8 extraout_x1_00;
  char *unaff_x21;
  long *plVar5;
  long unaff_x22;
  long lVar6;
  long lVar7;
  char in_wzr;
  long lStack_68;
  long lStack_60;
  long lStack_58;
  
  if (*unaff_x21 == '\x01') {
    *unaff_x21 = in_wzr;
  }
  else {
    func_0x007b05dc();
  }
  if (unaff_x22 != 0) {
    func_0x00187bd4();
  }
  __Unwind_Resume();
  func_0x005cf868(&lStack_68);
  if (lStack_58 != 0) {
    lVar6 = 0;
    do {
      plVar5 = *(long **)(lStack_60 + lVar6);
      iVar3 = func_0x004a2ad0(plVar5,extraout_x1);
      if (iVar3 != 0) {
        uVar2 = 1;
        if (lStack_68 == 0) {
          return 1;
        }
        goto code_r0x004abaf8;
      }
      if (*plVar5 == 10) {
        lVar7 = plVar5[4];
        pcVar1 = (char *)(lVar7 + 8);
        if (*pcVar1 == '\0') {
          *pcVar1 = '\x01';
        }
        else {
          func_0x007aff64(pcVar1,extraout_x1_00,1000000000);
        }
        func_0x004b023c(lVar7 + 0x28,*extraout_x1);
        if (*pcVar1 == '\x01') {
          *pcVar1 = in_wzr;
        }
        else {
          func_0x007b05dc(pcVar1,0);
        }
      }
      lVar6 = lVar6 + 8;
    } while (lStack_58 * 8 != lVar6);
  }
  uVar4 = 0;
  uVar2 = 0;
  if (lStack_68 != 0) {
code_r0x004abaf8:
    uVar4 = uVar2;
    func_0x00187bd4(lStack_60,lStack_68 << 3,8);
  }
  return uVar4;
}

