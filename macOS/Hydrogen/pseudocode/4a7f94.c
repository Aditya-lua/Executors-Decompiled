
undefined8 FUN_004a7f94(void)

{
  char *pcVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  undefined8 extraout_x1;
  long lVar6;
  undefined8 uVar7;
  long *plVar8;
  long unaff_x22;
  long lVar9;
  long lVar10;
  long lVar11;
  char in_wzr;
  undefined1 auVar12 [16];
  long lStack_68;
  long lStack_60;
  long lStack_58;
  
  if (unaff_x22 != 0) {
    func_0x00187bd4();
  }
  auVar12 = __Unwind_Resume();
  puVar5 = auVar12._8_8_;
  func_0x005dba30(&lStack_68);
  lVar6 = lStack_60;
  lVar11 = lStack_68;
  if (lStack_58 != 0) {
    lVar9 = 0;
    lVar10 = lStack_58 * 8;
    do {
      if ((**(long **)(lVar6 + lVar9) == -0x7ffffffffffffffe) &&
         (uVar3 = func_0x004ae0d0(*(long **)(lVar6 + lVar9) + 1,puVar5), (uVar3 & 1) != 0))
      goto LAB_004a8028;
      lVar9 = lVar9 + 8;
    } while (lVar10 != lVar9);
  }
  if (lVar11 != 0) {
    func_0x00187bd4(lVar6,lVar11 << 3,8);
  }
  func_0x005dbb64(&lStack_68,auVar12._0_8_);
  if (lStack_58 != 0) {
    lVar9 = 0;
    do {
      plVar8 = *(long **)(lStack_60 + lVar9);
      iVar2 = func_0x004a2ad0(plVar8,puVar5);
      lVar6 = lStack_60;
      lVar11 = lStack_68;
      if (iVar2 != 0) goto LAB_004a8028;
      if (*plVar8 == 10) {
        lVar11 = plVar8[4];
        pcVar1 = (char *)(lVar11 + 8);
        if (*pcVar1 == '\0') {
          *pcVar1 = '\x01';
        }
        else {
          func_0x007aff64(pcVar1,extraout_x1,1000000000);
        }
        func_0x004b023c(lVar11 + 0x28,*puVar5);
        if (*pcVar1 == '\x01') {
          *pcVar1 = in_wzr;
        }
        else {
          func_0x007b05dc(pcVar1,0);
        }
      }
      lVar9 = lVar9 + 8;
    } while (lStack_58 * 8 != lVar9);
  }
  uVar7 = 0;
  uVar4 = 0;
joined_r0x004a8030:
  if (lStack_68 != 0) {
    func_0x00187bd4(lStack_60,lStack_68 << 3,8);
    uVar4 = uVar7;
  }
  return uVar4;
LAB_004a8028:
  uVar7 = 1;
  uVar4 = 1;
  lStack_60 = lVar6;
  lStack_68 = lVar11;
  goto joined_r0x004a8030;
}

