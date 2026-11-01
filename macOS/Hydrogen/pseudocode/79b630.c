
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0079b630(ulong *param_1,ulong param_2,ulong param_3,long param_4,ulong param_5)

{
  undefined8 *puVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined8 uVar4;
  ulong uVar5;
  undefined8 *extraout_x8;
  ulong uVar6;
  ulong *unaff_x19;
  ulong unaff_x20;
  int in_stack_00000000;
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  undefined8 uStack_38;
  long lStack_30;
  long lStack_28;
  ulong uStack_20;
  ulong *puStack_18;
  
  if (CARRY8(param_2,param_3)) {
LAB_0079b6fc:
    func_0x007a1f00(0,param_2,&UNK_009c31b8);
  }
  else {
    unaff_x20 = param_3 + param_2;
    if (param_3 + param_2 <= *param_1 * 2) {
      unaff_x20 = *param_1 * 2;
    }
    uVar6 = 4;
    if (0x400 < param_5) {
      uVar6 = 1;
    }
    uVar5 = 8;
    if (param_5 != 1) {
      uVar5 = uVar6;
    }
    if (unaff_x20 <= uVar5) {
      unaff_x20 = uVar5;
    }
    uVar6 = (param_4 + param_5) - 1 & -param_4;
    auVar2._8_8_ = 0;
    auVar2._0_8_ = uVar6;
    auVar3._8_8_ = 0;
    auVar3._0_8_ = unaff_x20;
    unaff_x19 = param_1;
    if (SUB168(auVar2 * auVar3,8) != 0) goto LAB_0079b6fc;
    uVar5 = 0;
    if (0x8000000000000000U - param_4 < uVar6 * unaff_x20) goto LAB_0079b70c;
    func_0x0079a108();
    if (in_stack_00000000 != 1) {
      *param_1 = unaff_x20;
      param_1[1] = in_stack_00000008;
      return;
    }
  }
  uVar5 = in_stack_00000008;
  param_2 = in_stack_00000010;
LAB_0079b70c:
  func_0x007a1f00(uVar5,param_2,&UNK_009c31b8);
  uStack_38 = 0;
  lStack_30 = 1;
  lStack_28 = 0;
  uStack_20 = unaff_x20;
  puStack_18 = unaff_x19;
  func_0x0079b61c(&uStack_38,0,0x17,1,1);
  uVar4 = _UNK_008287d7;
  puVar1 = (undefined8 *)(lStack_30 + lStack_28);
  puVar1[1] = CONCAT17(UNK_008287e6,_UNK_008287df);
  *puVar1 = uVar4;
  *(ulong *)((long)puVar1 + 0xf) = CONCAT71(_UNK_008287e7,UNK_008287e6);
  extraout_x8[2] = lStack_30;
  extraout_x8[1] = uStack_38;
  extraout_x8[3] = lStack_28 + 0x17;
  *extraout_x8 = 0x800000000000001e;
  return;
}

