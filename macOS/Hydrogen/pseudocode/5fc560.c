
void FUN_005fc560(ulong param_1)

{
  ulong *puVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong unaff_x26;
  long unaff_x27;
  long unaff_x28;
  
  uVar4 = 0;
  uVar7 = 1;
  uVar6 = 0;
  do {
    uVar5 = uVar7;
    uVar7 = *(ulong *)(unaff_x28 + uVar6 * 8);
    uVar9 = uVar7 * param_1;
    auVar2._8_8_ = 0;
    auVar2._0_8_ = uVar7;
    auVar3._8_8_ = 0;
    auVar3._0_8_ = param_1;
    uVar8 = SUB168(auVar2 * auVar3,8);
    if (CARRY8(uVar9,uVar4)) {
      uVar8 = uVar8 + 1;
    }
    *(ulong *)(unaff_x27 + uVar6 * 8) = uVar9 + uVar4;
    uVar4 = uVar8;
    uVar7 = (ulong)((int)uVar5 + 1);
    uVar6 = uVar5;
  } while (uVar5 < unaff_x26);
  puVar1 = (ulong *)(unaff_x27 + unaff_x26 * 8);
  *puVar1 = uVar8;
  puVar1[1] = 0;
  return;
}

