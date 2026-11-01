
undefined8 FUN_00612c38(void)

{
  uint uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  code *pcVar4;
  int iVar5;
  undefined8 uVar6;
  long *plVar7;
  undefined8 *puVar8;
  char *pcVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x29;
  undefined1 auVar14 [12];
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  byte bStack_32;
  byte bStack_31;
  
  if (unaff_x20 == 0) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
      return 0;
    }
  }
  else {
    func_0x006986fc(&uStack0000000000000010,0);
    uStack0000000000000008 = 0;
    (**(code **)(*unaff_x19 + 0x120))();
    func_0x005f0d78(&uStack0000000000000010,1);
    iVar5 = func_0x006118e8(&uStack0000000000000010,&uStack0000000000000008);
    uVar6 = uStack0000000000000008;
    if (iVar5 == 0) {
      uVar6 = 0;
    }
    func_0x006989cc(&uStack0000000000000010);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
      return uVar6;
    }
  }
  uVar6 = ___stack_chk_fail();
  func_0x006989cc(&uStack0000000000000010);
  __Unwind_Resume(uVar6);
  uVar6 = __Unwind_Resume();
  func_0x006989cc(&uStack0000000000000010);
  auVar14 = __Unwind_Resume(uVar6);
  uVar10 = auVar14._8_4_;
  plVar7 = auVar14._0_8_;
  if (uVar10 != 0) {
    uVar13 = 0;
    uVar11 = 0x20;
    do {
      uVar1 = uVar13 + uVar11 >> 1;
      uVar12 = uVar1;
      if (uVar10 >> (ulong)(uVar1 & 0x1f) != 0) {
        uVar12 = uVar11;
        uVar13 = uVar1;
      }
      uVar11 = uVar12;
    } while (1 < uVar12 - uVar13);
    if (7 < uVar12) {
      if (0xfffffff9 < uVar12) {
        puVar8 = (undefined8 *)___cxa_allocate_exception(0x28);
        pcVar9 = (char *)__Znwm(0x28);
        *(ulong *)(pcVar9 + 0x1d) =
             CONCAT53(s_RoundUpToMultipleOf__integer_ove_008e5516._32_5_,
                      s_RoundUpToMultipleOf__integer_ove_008e5516._29_3_);
        uVar3 = s_RoundUpToMultipleOf__integer_ove_008e5516._16_8_;
        uVar2 = s_RoundUpToMultipleOf__integer_ove_008e5516._0_8_;
        uVar6 = CONCAT35(s_RoundUpToMultipleOf__integer_ove_008e5516._29_3_,
                         s_RoundUpToMultipleOf__integer_ove_008e5516._24_5_);
        *(undefined8 *)(pcVar9 + 8) = s_RoundUpToMultipleOf__integer_ove_008e5516._8_8_;
        *(undefined8 *)pcVar9 = uVar2;
        *(undefined8 *)(pcVar9 + 0x18) = uVar6;
        *(undefined8 *)(pcVar9 + 0x10) = uVar3;
        pcVar9[0x25] = '\0';
        *puVar8 = &UNK_009b2ec8;
        *(undefined4 *)(puVar8 + 1) = 1;
        func_0x00017634(puVar8 + 2,pcVar9,0x25);
        *puVar8 = &UNK_009b2f08;
        ___cxa_throw(puVar8,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
        pcVar4 = (code *)SoftwareBreakpoint(1,0x612df4);
        (*pcVar4)();
      }
      goto LAB_00612df8;
    }
  }
  uVar12 = 7;
LAB_00612df8:
  uVar13 = (uVar12 + 6) / 7;
  uVar13 = (uVar13 + ((uVar12 + 6) - uVar13 >> 1) >> 2) * 7;
  while (uVar13 = uVar13 - 7, uVar13 != 0) {
    bStack_31 = (byte)(uVar10 >> (ulong)(uVar13 & 0x1f)) | 0x80;
    (**(code **)(*plVar7 + 0x38))(plVar7,&bStack_31,1,0,1);
  }
  bStack_32 = auVar14[8] & 0x7f;
  uVar6 = (**(code **)(*plVar7 + 0x38))(plVar7,&bStack_32,1,0,1);
  return uVar6;
}

