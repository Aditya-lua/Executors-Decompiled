
long * FUN_0017ede8(void)

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  long *plVar4;
  long lVar5;
  long *plVar6;
  long lVar7;
  long *plVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  long extraout_x8;
  long extraout_x8_00;
  undefined8 *extraout_x8_01;
  long *unaff_x20;
  code *pcVar11;
  undefined1 auVar12 [16];
  long lStack_d0;
  long lStack_c8;
  long lStack_c0;
  long lStack_b8;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  lVar7 = *unaff_x20;
  while (lVar7 == 0) {
    __Unwind_Resume();
    func_0x00187bd4();
    lVar7 = *unaff_x20;
  }
  uVar9 = 1;
  func_0x00187bd4();
  auVar12 = __Unwind_Resume();
  pcVar2 = pcRam0000000000a2bc58;
  uStack_58 = auVar12._8_8_;
  uVar10 = 0;
  uStack_50 = uVar9;
  auVar12 = (*pcRam0000000000a2bc58)(0xa2bc58,*auVar12._0_8_);
  plVar4 = auVar12._0_8_;
  if (*plVar4 != 1) {
    if (*plVar4 == 2) goto code_r0x0017eb50;
    func_0x0079a048(0);
  }
  plVar4 = (long *)(*pcVar2)(0xa2bc58,auVar12._8_8_);
  if (plVar4[1] != 0) {
code_r0x0017eb50:
    *extraout_x8_01 = 0x8000000000000000;
    return plVar4;
  }
  auVar12 = (*pcVar2)(0xa2bc58);
  *(undefined8 *)(auVar12._0_8_ + 8) = 0xffffffffffffffff;
  if (*(long *)(auVar12._0_8_ + 0x20) == 0) {
    plVar4 = (long *)(*pcVar2)(0xa2bc58);
    plVar4[1] = 0;
    goto code_r0x0017eb50;
  }
  lVar7 = (*pcVar2)(0xa2bc58);
  uVar9 = *(undefined8 *)(*(long *)(lVar7 + 0x18) + extraout_x8 * 0x10 + -0x10);
  *(undefined8 *)(lVar7 + 8) = 0;
  lVar7 = func_0x00187bdc(&UNK_00010400,1);
  if (lVar7 != 0) {
    uStack_48 = 0;
    (*auVar12._8_8_)(uVar9,&uStack_58,uVar10,lVar7,&UNK_00010400,&uStack_48);
    plVar4 = (long *)func_0x00179758();
    if ((int)plVar4 == 7000) {
      *extraout_x8_01 = &UNK_00010400;
      extraout_x8_01[1] = lVar7;
      extraout_x8_01[2] = uStack_48;
      return plVar4;
    }
    *extraout_x8_01 = 0x8000000000000000;
    plVar4 = (long *)func_0x00187bd4(lVar7,&UNK_00010400,1);
    return plVar4;
  }
  uVar9 = func_0x007a1f00(1,&UNK_00010400,&UNK_009bf278);
  plVar8 = (long *)((long)&MACH_HEADER.magic + 1);
  func_0x00187bd4(0xa2bc58,&UNK_00010400);
  auVar12 = __Unwind_Resume(uVar9);
  pcVar2 = pcRam0000000000a2bc58;
  plVar6 = auVar12._8_8_;
  pcVar11 = *(code **)(auVar12._0_8_ + 8);
  lVar7 = plVar6[1];
  lStack_c8 = plVar6[2];
  lVar1 = plVar8[1];
  lStack_b8 = plVar8[2];
  lStack_d0 = lVar7;
  lStack_c0 = lVar1;
  plVar4 = (long *)(*pcRam0000000000a2bc58)(0xa2bc58);
  if (*plVar4 == 1) {
code_r0x0017ece8:
    lVar5 = (*pcVar2)(0xa2bc58);
    if (*(long *)(lVar5 + 8) == 0) {
      lVar5 = (*pcVar2)(0xa2bc58);
      *(undefined8 *)(lVar5 + 8) = 0xffffffffffffffff;
      if (*(long *)(lVar5 + 0x20) != 0) {
        lVar5 = (*pcVar2)(0xa2bc58);
        uVar9 = *(undefined8 *)(*(long *)(lVar5 + 0x18) + extraout_x8_00 * 0x10 + -0x10);
        *(undefined8 *)(lVar5 + 8) = 0;
        iVar3 = (*pcVar11)(uVar9,&lStack_d0,&lStack_c0);
        if (*plVar8 != 0) {
          func_0x00187bd4(lVar1,*plVar8,1);
        }
        if (*plVar6 == 0) {
          return (long *)(ulong)(iVar3 == 7000);
        }
        func_0x00187bd4(lVar7,*plVar6,1);
        return (long *)(ulong)(iVar3 == 7000);
      }
      lVar5 = (*pcVar2)(0xa2bc58);
      *(undefined8 *)(lVar5 + 8) = 0;
      lVar5 = *plVar8;
      goto joined_r0x0017edd4;
    }
  }
  else if (*plVar4 != 2) {
    func_0x0079a048(0);
    goto code_r0x0017ece8;
  }
  lVar5 = *plVar8;
joined_r0x0017edd4:
  if (lVar5 != 0) {
    func_0x00187bd4(lVar1,lVar5,1);
  }
  if (*plVar6 != 0) {
    func_0x00187bd4(lVar7,*plVar6,1);
  }
  return (long *)0x0;
}

