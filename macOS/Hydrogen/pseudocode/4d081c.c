
void thunk_FUN_004d0820(undefined8 param_1)

{
  long lVar1;
  long lVar2;
  undefined1 auVar3 [16];
  ulong uVar4;
  ulong *extraout_x8;
  ulong uVar5;
  long *unaff_x20;
  long *plVar6;
  undefined8 uVar7;
  ulong uVar8;
  undefined1 auVar9 [16];
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  ulong uStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  ulong *puStack_68;
  undefined8 uStack_60;
  ulong uStack_58;
  
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000010,in_stack_00000008 << 2,4);
  }
  auVar9 = __Unwind_Resume(param_1);
  plVar6 = auVar9._0_8_;
  uVar7 = 0;
  lVar1 = *plVar6;
  lVar2 = plVar6[1];
  uVar5 = lVar2 - lVar1;
  uVar8 = uVar5 >> 2;
  uVar5 = (uVar8 + (uVar5 >> 1)) * 8;
  auVar3._8_8_ = 0;
  auVar3._0_8_ = uVar8;
  if ((SUB168(auVar3 * ZEXT816(0x18),8) == 0) && (uVar5 < 0x7ffffffffffffff9)) {
    if (uVar5 != 0) {
      uVar7 = 8;
      uVar4 = func_0x00187bd0(uVar5,8);
      unaff_x20 = plVar6;
      if (uVar4 != 0) goto LAB_004d08dc;
      goto LAB_004d08c4;
    }
  }
  else {
LAB_004d08c4:
    plVar6 = unaff_x20;
    func_0x007a1f00(uVar7,uVar5,auVar9._8_8_);
  }
  uVar8 = 0;
  uVar4 = 8;
LAB_004d08dc:
  puStack_68 = &uStack_90;
  uStack_90 = 0;
  lStack_70 = plVar6[3];
  lStack_78 = plVar6[2];
  uStack_60 = 0;
  lStack_88 = lVar1;
  lStack_80 = lVar2;
  uStack_58 = uVar4;
  func_0x004dc7dc(&lStack_88,&puStack_68);
  extraout_x8[1] = uVar4;
  *extraout_x8 = uVar8;
  extraout_x8[2] = uStack_90;
  return;
}

