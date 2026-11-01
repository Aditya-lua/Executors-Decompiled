
void FUN_005fa23c(long param_1,long param_2,long *param_3,ulong *param_4)

{
  ulong uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  byte in_CY;
  ulong in_x9;
  long in_x10;
  ulong in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong uVar8;
  ulong in_x14;
  ulong uVar9;
  
  auVar2._8_8_ = 0;
  auVar2._0_8_ = in_x11;
  auVar5._8_8_ = 0;
  auVar5._0_8_ = in_x12;
  uVar9 = param_4[1] * in_x13;
  auVar3._8_8_ = 0;
  auVar3._0_8_ = in_x13;
  auVar6._8_8_ = 0;
  auVar6._0_8_ = param_4[1];
  uVar1 = uVar9 + in_x14 + in_x9;
  uVar8 = *param_4 * param_3[0xe];
  auVar4._8_8_ = 0;
  auVar4._0_8_ = param_3[0xe];
  auVar7._8_8_ = 0;
  auVar7._0_8_ = *param_4;
  *(ulong *)(param_2 + 0x70) = uVar8 + uVar1;
  *(ulong *)(param_2 + 0x78) =
       param_1 + in_x10 + (ulong)in_CY + SUB168(auVar2 * auVar5,8) + (ulong)CARRY8(in_x14,in_x9) +
       SUB168(auVar3 * auVar6,8) + (ulong)CARRY8(uVar9,in_x14 + in_x9) + SUB168(auVar4 * auVar7,8) +
       (ulong)CARRY8(uVar8,uVar1) + param_4[0xf] * *param_3 + param_4[0xe] * param_3[1] +
       param_4[0xd] * param_3[2] + param_4[0xc] * param_3[3] + param_4[0xb] * param_3[4] +
       param_4[10] * param_3[5] + param_4[9] * param_3[6] + param_4[8] * param_3[7] +
       param_4[7] * param_3[8] + param_4[6] * param_3[9] + param_4[5] * param_3[10] +
       param_4[4] * param_3[0xb] + param_4[3] * param_3[0xc] + param_4[2] * param_3[0xd] +
       param_4[1] * param_3[0xe] + *param_4 * param_3[0xf];
  return;
}

