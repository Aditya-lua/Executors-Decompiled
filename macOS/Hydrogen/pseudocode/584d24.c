
void FUN_00584d24(void)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  code *pcVar7;
  long lVar8;
  undefined *puVar9;
  undefined *puVar10;
  long *extraout_x8;
  ulong uVar11;
  undefined1 auVar12 [16];
  long lStack_60;
  long *plStack_58;
  long lStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  long lStack_30;
  undefined4 uStack_28;
  
  func_0x00580a24();
  __Unwind_Resume();
  auVar12 = func_0x007a2668();
  lVar8 = auVar12._0_8_;
  uStack_40 = *(undefined8 *)(lVar8 + 0x38);
  uStack_38 = *(undefined8 *)(lVar8 + 0x40);
  uVar11 = auVar12._8_8_ & 0xffffffff;
  if ((uVar11 < *(ulong *)(lVar8 + 0x28)) &&
     (plVar1 = (long *)(*(long *)(lVar8 + 0x20) + uVar11 * 0x20), *plVar1 != -0x8000000000000000)) {
    lStack_30 = plVar1[3];
  }
  else {
    lStack_30 = -1;
  }
  uStack_28 = auVar12._8_4_;
  uStack_48 = 0;
  func_0x0055b13c(&lStack_60,&uStack_48,&UNK_009f0678);
  if (lStack_50 != 2) {
    *extraout_x8 = 0;
joined_r0x00584e28:
    if (lStack_60 == 0) {
      return;
    }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(plStack_58,lStack_60 * 0x18,8);
    return;
  }
  lVar8 = plStack_58[3];
  lVar2 = plStack_58[4];
  lVar3 = plStack_58[5];
  lVar4 = *plStack_58;
  lVar5 = plStack_58[1];
  lVar6 = plStack_58[2];
  if (*(char *)(lVar8 + 0x18) != '\x01') {
    lVar2 = plStack_58[1];
    lVar3 = plStack_58[2];
    lVar4 = lVar8;
    lVar5 = plStack_58[4];
    lVar6 = plStack_58[5];
    lVar8 = *plStack_58;
  }
  if (*(char *)(lVar8 + 0x18) == '\x01') {
    if (*(char *)(lVar4 + 0x18) == '\x02') {
      *extraout_x8 = lVar8;
      extraout_x8[1] = lVar2;
      extraout_x8[2] = lVar3;
      extraout_x8[3] = lVar4;
      extraout_x8[4] = lVar5;
      extraout_x8[5] = lVar6;
      goto joined_r0x00584e28;
    }
    puVar10 = &UNK_009f0900;
    puVar9 = &UNK_008ad167;
  }
  else {
    puVar10 = &UNK_009f0918;
    puVar9 = &UNK_008ad1a7;
  }
  func_0x007a247c(puVar9,0x40,puVar10);
                    /* WARNING: Does not return */
  pcVar7 = (code *)SoftwareBreakpoint(1,0x584e98);
  (*pcVar7)();
}

