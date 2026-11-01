
undefined8 thunk_FUN_00584078(void)

{
  long *plVar1;
  long *plVar2;
  long unaff_x21;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  ulong auStack_d8 [3];
  long lStack_c0;
  ulong uStack_b8;
  undefined8 uStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  ulong auStack_90 [3];
  long lStack_78;
  ulong uStack_70;
  undefined8 uStack_68;
  long lStack_60;
  long lStack_58;
  long lStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  
  func_0x00580b10(unaff_x21 + 0x60);
  __Unwind_Resume();
  func_0x007a2668();
  auVar3 = func_0x007a2668();
  plVar2 = auVar3._8_8_;
  plVar1 = auVar3._0_8_;
  lStack_50 = plVar1[2];
  if (lStack_50 != plVar2[2]) {
    return 0;
  }
  auStack_d8[2] = *plVar1;
  lStack_c0 = plVar1[1];
  lStack_98 = lStack_50;
  if (auStack_d8[2] == 0) {
    lStack_98 = 0;
  }
  auStack_d8[0] = (ulong)(auStack_d8[2] != 0);
  auStack_90[2] = *plVar2;
  lStack_78 = plVar2[1];
  if (auStack_90[2] == 0) {
    lStack_50 = 0;
  }
  auStack_90[0] = (ulong)(auStack_90[2] != 0);
  auStack_d8[1] = 0;
  uStack_b0 = 0;
  auStack_90[1] = 0;
  uStack_68 = 0;
  uStack_48 = 0;
  uStack_40 = 0;
  uStack_38 = 0;
  uStack_b8 = auStack_d8[0];
  lStack_a8 = auStack_d8[2];
  lStack_a0 = lStack_c0;
  uStack_70 = auStack_90[0];
  lStack_60 = auStack_90[2];
  lStack_58 = lStack_78;
  while( true ) {
    auVar3 = func_0x0058027c(auStack_d8);
    plVar1 = auVar3._0_8_;
    if (plVar1 == (long *)0x0) {
      return 1;
    }
    auVar4 = func_0x0058027c(auStack_90);
    plVar2 = auVar4._0_8_;
    if (plVar2 == (long *)0x0) break;
    if (((*plVar1 != *plVar2) || (plVar1[1] != plVar2[1] || plVar1[2] != plVar2[2])) ||
       (*auVar3._8_8_ != *auVar4._8_8_)) {
      return 0;
    }
  }
  return 1;
}

