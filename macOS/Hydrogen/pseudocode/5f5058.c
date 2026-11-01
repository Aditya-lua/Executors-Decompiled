
void FUN_005f5058(ulong param_1,long param_2,long param_3,long param_4)

{
  ulong uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  ulong uVar8;
  ulong in_x9;
  ulong uVar9;
  ulong in_x10;
  ulong in_x11;
  ulong uVar10;
  ulong in_x12;
  long lVar11;
  ulong in_x13;
  ulong in_x14;
  
  auVar2._8_8_ = 0;
  auVar2._0_8_ = in_x9;
  auVar5._8_8_ = 0;
  auVar5._0_8_ = in_x12;
  uVar9 = SUB168(auVar2 * auVar5,8);
  if (CARRY8(param_1,in_x14)) {
    uVar9 = uVar9 + 1;
  }
  auVar3._8_8_ = 0;
  auVar3._0_8_ = in_x11;
  auVar6._8_8_ = 0;
  auVar6._0_8_ = in_x13;
  uVar10 = SUB168(auVar3 * auVar6,8);
  if (CARRY8(in_x13 * in_x11,param_1 + in_x14)) {
    uVar10 = uVar10 + 1;
  }
  *(ulong *)(param_2 + 0x28) = in_x13 * in_x11 + param_1 + in_x14;
  auVar4._8_8_ = 0;
  auVar4._0_8_ = *(ulong *)(param_3 + 0x18);
  auVar7._8_8_ = 0;
  auVar7._0_8_ = *(ulong *)(param_4 + 0x18);
  lVar11 = SUB168(auVar4 * auVar7,8);
  if (CARRY8(in_x10,uVar9)) {
    lVar11 = lVar11 + 1;
  }
  uVar1 = uVar10 + in_x10 + uVar9;
  uVar8 = *(ulong *)(param_4 + 0x18) * *(ulong *)(param_3 + 0x18);
  *(ulong *)(param_2 + 0x30) = uVar1 + uVar8;
  *(ulong *)(param_2 + 0x38) =
       lVar11 + (ulong)CARRY8(uVar10,in_x10 + uVar9) + (ulong)CARRY8(uVar1,uVar8);
  return;
}

