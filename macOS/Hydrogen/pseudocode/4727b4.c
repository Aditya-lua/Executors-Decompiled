
void FUN_004727b4(undefined1 *param_1,byte *param_2,long param_3)

{
  ulong uVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  byte in_CY;
  undefined1 uVar7;
  ulong uVar8;
  ulong in_x9;
  ulong in_x10;
  ulong in_x11;
  ulong uVar9;
  
  while (param_3 = param_3 + -1, (in_CY & 1) == 0) {
    if (param_3 == 0) {
      if (in_x9 != 0 || in_x10 != 0) {
        uVar7 = 0;
        *(ulong *)(param_1 + 0x10) = in_x9;
        *(ulong *)(param_1 + 0x18) = in_x10;
        goto code_r0x00472834;
      }
      param_1[1] = 4;
      goto code_r0x00472830;
    }
    auVar3._8_8_ = 0;
    auVar3._0_8_ = in_x10;
    auVar5._8_8_ = 0;
    auVar5._0_8_ = in_x11;
    auVar4._8_8_ = 0;
    auVar4._0_8_ = in_x9;
    auVar6._8_8_ = 0;
    auVar6._0_8_ = in_x11;
    uVar9 = SUB168(auVar4 * auVar6,8);
    uVar1 = uVar9 + in_x10 * 10;
    uVar2 = *param_2 - 0x30;
    if (9 < uVar2) {
      uVar7 = 1;
      goto LAB_0047282c;
    }
    if (CARRY8(uVar9,in_x10 * 10) || SUB168(auVar3 * auVar5,8) != 0) break;
    uVar8 = in_x9 * 10;
    uVar9 = (ulong)uVar2;
    in_x9 = uVar8 + uVar9;
    in_x10 = uVar1 + CARRY8(uVar8,uVar9);
    param_2 = param_2 + 1;
    in_CY = CARRY8(uVar1,(ulong)CARRY8(uVar8,uVar9));
  }
  uVar7 = 2;
LAB_0047282c:
  param_1[1] = uVar7;
code_r0x00472830:
  uVar7 = 1;
code_r0x00472834:
  *param_1 = uVar7;
  return;
}

