
void FUN_002a9aa4(ulong param_1,long param_2,long param_3)

{
  ulong uVar1;
  ulong uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  ulong uVar7;
  ulong uVar8;
  ulong in_x9;
  long in_x10;
  ulong uVar9;
  long in_x11;
  ulong uVar10;
  long in_x12;
  ulong uVar11;
  ulong in_x13;
  long lVar12;
  
  uVar10 = in_x11 * in_x12;
  uVar8 = in_x13;
  if (CARRY8(param_1,uVar10)) {
    uVar8 = in_x13 + 1;
  }
  if (CARRY8(param_1 + uVar10,uVar10)) {
    in_x13 = in_x13 + 1;
  }
  uVar1 = in_x9 + uVar8 + in_x13;
  uVar9 = (ulong)CARRY8(in_x9,uVar8) + in_x10 + (ulong)CARRY8(in_x9 + uVar8,in_x13);
  *(ulong *)(param_2 + 0x20) = param_1 + uVar10 + uVar10;
  auVar3._8_8_ = 0;
  auVar3._0_8_ = *(ulong *)(param_3 + 0x10);
  auVar5._8_8_ = 0;
  auVar5._0_8_ = *(ulong *)(param_3 + 0x18);
  uVar11 = SUB168(auVar3 * auVar5,8);
  uVar7 = *(ulong *)(param_3 + 0x10) * *(ulong *)(param_3 + 0x18);
  uVar8 = uVar7 + uVar1;
  uVar10 = uVar11;
  if (CARRY8(uVar7,uVar1)) {
    uVar10 = uVar11 + 1;
  }
  uVar1 = uVar9 + uVar10;
  if (CARRY8(uVar8,uVar7)) {
    uVar11 = uVar11 + 1;
  }
  uVar2 = uVar1 + uVar11;
  *(ulong *)(param_2 + 0x28) = uVar8 + uVar7;
  uVar8 = *(ulong *)(param_3 + 0x18);
  auVar4._8_8_ = 0;
  auVar4._0_8_ = uVar8;
  auVar6._8_8_ = 0;
  auVar6._0_8_ = uVar8;
  lVar12 = SUB168(auVar4 * auVar6,8);
  if (CARRY8(uVar8 * uVar8,uVar2)) {
    lVar12 = lVar12 + 1;
  }
  *(ulong *)(param_2 + 0x30) = uVar8 * uVar8 + uVar2;
  *(ulong *)(param_2 + 0x38) = lVar12 + (ulong)CARRY8(uVar1,uVar11) + (ulong)CARRY8(uVar9,uVar10);
  return;
}

