
void FUN_005f6368(ulong param_1,long param_2,long param_3,long param_4)

{
  ulong uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  ulong in_x9;
  ulong uVar8;
  ulong in_x10;
  ulong in_x11;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  
  uVar11 = *(ulong *)(param_4 + 0x18) * in_x9;
  auVar2._8_8_ = 0;
  auVar2._0_8_ = in_x9;
  auVar5._8_8_ = 0;
  auVar5._0_8_ = *(ulong *)(param_4 + 0x18);
  uVar8 = SUB168(auVar2 * auVar5,8);
  uVar1 = param_1 + uVar11;
  if (CARRY8(param_1,uVar11)) {
    uVar8 = uVar8 + 1;
  }
  uVar9 = *(ulong *)(param_4 + 0x10) * in_x11;
  auVar3._8_8_ = 0;
  auVar3._0_8_ = in_x11;
  auVar6._8_8_ = 0;
  auVar6._0_8_ = *(ulong *)(param_4 + 0x10);
  uVar11 = SUB168(auVar3 * auVar6,8);
  if (CARRY8(uVar1,uVar9)) {
    uVar11 = uVar11 + 1;
  }
  *(ulong *)(param_2 + 8) = uVar1 + uVar9;
  auVar4._8_8_ = 0;
  auVar4._0_8_ = *(ulong *)(param_3 + 0x18);
  auVar7._8_8_ = 0;
  auVar7._0_8_ = *(ulong *)(param_4 + 0x18);
  lVar10 = SUB168(auVar4 * auVar7,8);
  if (CARRY8(in_x10,uVar8)) {
    lVar10 = lVar10 + 1;
  }
  uVar1 = in_x10 + uVar8 + uVar11;
  uVar9 = *(ulong *)(param_4 + 0x18) * *(ulong *)(param_3 + 0x18);
  *(ulong *)(param_2 + 0x10) = uVar1 + uVar9;
  *(ulong *)(param_2 + 0x18) =
       lVar10 + (ulong)CARRY8(in_x10 + uVar8,uVar11) + (ulong)CARRY8(uVar1,uVar9);
  return;
}

