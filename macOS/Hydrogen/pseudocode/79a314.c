
undefined8
FUN_0079a314(long param_1,ulong param_2,undefined8 param_3,undefined8 param_4,long param_5,
            long param_6)

{
  ulong uVar1;
  undefined1 auVar2 [16];
  bool in_CY;
  undefined8 uVar3;
  ulong in_x10;
  ulong uVar4;
  ulong *unaff_x19;
  undefined1 auVar5 [16];
  int in_stack_00000000;
  ulong in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined1 auStack_48 [16];
  long lStack_38;
  undefined8 uStack_30;
  ulong uStack_20;
  
  uVar4 = 4;
  if (in_CY) {
    uVar4 = 1;
  }
  uVar1 = 8;
  if (param_6 != 1) {
    uVar1 = uVar4;
  }
  if (in_x10 <= uVar1) {
    in_x10 = uVar1;
  }
  uVar4 = (param_5 + param_6) - 1U & -param_5;
  auVar5._8_8_ = 0;
  auVar5._0_8_ = uVar4;
  auVar2._8_8_ = 0;
  auVar2._0_8_ = in_x10;
  if (SUB168(auVar5 * auVar2,8) == 0) {
    if (0x8000000000000000U - param_1 < uVar4 * in_x10) goto LAB_0079a3c4;
    uVar3 = func_0x0079a108();
    if (in_stack_00000000 != 1) {
      *unaff_x19 = in_x10;
      unaff_x19[1] = in_stack_00000008;
      return uVar3;
    }
  }
  else {
    func_0x007a1f00(param_2,param_3,&UNK_009c0210);
  }
  param_2 = in_stack_00000008;
  param_3 = in_stack_00000010;
LAB_0079a3c4:
  auVar5 = func_0x007a1f00(param_2,param_3,&UNK_009c0210);
  uVar3 = *auVar5._0_8_;
  uStack_20 = in_x10;
  func_0x00469240(auStack_48,auVar5._8_8_,&UNK_0081b47d,0xe);
  func_0x00193394(&lStack_38,uVar3);
  func_0x004653b0(auStack_48,&UNK_0081b48b,7,&lStack_38,&UNK_009c1390);
  uVar3 = func_0x00465628();
  if (lStack_38 != 0) {
    func_0x00187bd4(uStack_30,lStack_38,1);
  }
  return uVar3;
}

