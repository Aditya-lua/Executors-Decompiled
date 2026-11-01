
void FUN_005fc500(ulong param_1)

{
  undefined8 *puVar1;
  ulong *puVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  bool in_ZR;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong unaff_x26;
  long unaff_x27;
  long unaff_x28;
  
  if (in_ZR) {
    if (unaff_x28 != unaff_x27) {
      _memcpy();
    }
    puVar1 = (undefined8 *)(unaff_x27 + unaff_x26 * 8);
    *puVar1 = 0;
    puVar1[1] = 0;
  }
  else {
    if (unaff_x26 == 0) {
      uVar8 = 0;
    }
    else {
      uVar5 = 0;
      uVar9 = 1;
      uVar7 = 0;
      do {
        uVar6 = uVar9;
        uVar8 = *(ulong *)(unaff_x28 + uVar7 * 8);
        uVar9 = uVar8 * param_1;
        auVar3._8_8_ = 0;
        auVar3._0_8_ = uVar8;
        auVar4._8_8_ = 0;
        auVar4._0_8_ = param_1;
        uVar8 = SUB168(auVar3 * auVar4,8);
        if (CARRY8(uVar9,uVar5)) {
          uVar8 = uVar8 + 1;
        }
        *(ulong *)(unaff_x27 + uVar7 * 8) = uVar9 + uVar5;
        uVar5 = uVar8;
        uVar9 = (ulong)((int)uVar6 + 1);
        uVar7 = uVar6;
      } while (uVar6 < unaff_x26);
    }
    puVar2 = (ulong *)(unaff_x27 + unaff_x26 * 8);
    *puVar2 = uVar8;
    puVar2[1] = 0;
  }
  return;
}

