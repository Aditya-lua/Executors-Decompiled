
void FUN_006297c8(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  long *plVar2;
  ulong uVar3;
  long *plVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  long in_x9;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000008;
  undefined *in_stack_000001a0;
  undefined *in_stack_000001a8;
  undefined *in_stack_000001b0;
  undefined1 uStack00000000000001b8;
  undefined *apuStack_90 [2];
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  undefined *apuStack_60 [2];
  ulong uStack_50;
  ulong uStack_48;
  long lStack_40;
  
  if (in_x9 == param_1) {
    return;
  }
  uVar1 = ___stack_chk_fail();
  func_0x00629ab4(&uStack0000000000000008);
  in_stack_000001a0 = &UNK_00a084d8;
  in_stack_000001a8 = &UNK_00a085b0;
  in_stack_000001b0 = &UNK_00a08608;
  func_0x0062915c(&uStack00000000000001b8,&UNK_009fac18);
  __Unwind_Resume(uVar1);
  auVar7 = __Unwind_Resume();
  plVar2 = auVar7._0_8_;
  plVar4 = plVar2 + 0xc;
  uVar3 = func_0x0065aa30(param_4,plVar4);
  if ((uVar3 & 1) == 0) {
    (**(code **)(*plVar4 + 0x38))(plVar4,auVar7._8_8_,param_4);
  }
  uVar1 = func_0x00604ce4();
  plVar4 = (long *)(**(code **)(*plVar2 + 0x10))(plVar2);
  (**(code **)(*plVar4 + 0xa8))(apuStack_90);
  uVar5 = func_0x00604c44();
  uVar6 = func_0x00604ce4();
  func_0x005ffa78(apuStack_60,auVar7._8_8_,uVar1,apuStack_90,0,uVar5,uVar6);
  apuStack_90[0] = &UNK_009f5d60;
  if (uStack_78 <= uStack_80) {
    uStack_80 = uStack_78;
  }
  if (lStack_70 != 0) {
    if (uStack_80 != 0) {
      do {
        *(undefined8 *)(lStack_70 + -8 + uStack_80 * 8) = 0;
        uStack_80 = uStack_80 - 1;
      } while (uStack_80 != 0);
    }
    func_0x00611644();
  }
  (**(code **)(*plVar2 + 0x28))(plVar2,apuStack_60);
  apuStack_60[0] = &UNK_009f5d60;
  if (uStack_48 <= uStack_50) {
    uStack_50 = uStack_48;
  }
  if (lStack_40 != 0) {
    if (uStack_50 != 0) {
      do {
        *(undefined8 *)(lStack_40 + -8 + uStack_50 * 8) = 0;
        uStack_50 = uStack_50 - 1;
      } while (uStack_50 != 0);
    }
    func_0x00611644();
  }
  return;
}

