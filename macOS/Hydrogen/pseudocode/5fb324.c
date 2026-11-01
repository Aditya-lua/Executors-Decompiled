
void FUN_005fb324(ulong param_1,undefined8 param_2,long param_3,long param_4)

{
  ulong uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined8 in_x9;
  ulong uVar8;
  long in_x10;
  ulong uVar9;
  long in_x11;
  ulong uVar10;
  ulong in_x12;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  long in_x16;
  
  uVar9 = in_x11 + in_x10 + (ulong)CARRY8(in_x12,param_1);
  *(undefined8 *)(in_x16 + 0x60) = in_x9;
  uVar13 = *(ulong *)(param_4 + 0x78) * *(ulong *)(param_3 + 0x70);
  auVar2._8_8_ = 0;
  auVar2._0_8_ = *(ulong *)(param_3 + 0x70);
  auVar5._8_8_ = 0;
  auVar5._0_8_ = *(ulong *)(param_4 + 0x78);
  uVar8 = SUB168(auVar2 * auVar5,8);
  uVar1 = in_x12 + param_1 + uVar13;
  uVar11 = *(ulong *)(param_4 + 0x70) * *(ulong *)(param_3 + 0x78);
  auVar3._8_8_ = 0;
  auVar3._0_8_ = *(ulong *)(param_3 + 0x78);
  auVar6._8_8_ = 0;
  auVar6._0_8_ = *(ulong *)(param_4 + 0x70);
  uVar10 = SUB168(auVar3 * auVar6,8);
  if (CARRY8(in_x12 + param_1,uVar13)) {
    uVar8 = uVar8 + 1;
  }
  if (CARRY8(uVar11,uVar1)) {
    uVar10 = uVar10 + 1;
  }
  uVar13 = uVar9 + uVar8;
  *(ulong *)(in_x16 + 0x68) = uVar11 + uVar1;
  auVar4._8_8_ = 0;
  auVar4._0_8_ = *(ulong *)(param_3 + 0x78);
  auVar7._8_8_ = 0;
  auVar7._0_8_ = *(ulong *)(param_4 + 0x78);
  lVar12 = SUB168(auVar4 * auVar7,8);
  if (CARRY8(uVar9,uVar8)) {
    lVar12 = lVar12 + 1;
  }
  uVar1 = uVar10 + uVar13;
  uVar8 = *(ulong *)(param_4 + 0x78) * *(ulong *)(param_3 + 0x78);
  *(ulong *)(in_x16 + 0x70) = uVar1 + uVar8;
  *(ulong *)(in_x16 + 0x78) = lVar12 + (ulong)CARRY8(uVar10,uVar13) + (ulong)CARRY8(uVar1,uVar8);
  return;
}

