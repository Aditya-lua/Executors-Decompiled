
void FUN_006743b0(uint *param_1,long *param_2,uint *param_3)

{
  uint uVar1;
  ulong uVar2;
  ulong uVar3;
  uint *puVar4;
  uint in_w9;
  ulong in_x10;
  ulong uVar5;
  ulong uVar6;
  ulong in_x11;
  ulong in_x12;
  undefined8 in_x13;
  uint in_w14;
  undefined8 *in_x15;
  undefined8 uVar7;
  undefined8 uVar8;
  
  uVar7 = *(undefined8 *)(param_1 + 4);
  uVar8 = *(undefined8 *)param_1;
  in_x15[1] = *(undefined8 *)(param_1 + 2);
  *in_x15 = uVar8;
  in_x15[2] = uVar7;
  if (in_x12 < 2) {
LAB_006743c8:
    *param_1 = in_w9;
    param_1[1] = in_w14;
    *(ulong *)(param_1 + 2) = in_x11;
    *(undefined8 *)(param_1 + 4) = in_x13;
    return;
  }
  do {
    uVar2 = in_x10 - 1;
    uVar3 = uVar2 >> 1;
    puVar4 = param_3;
    if (in_x10 < 3) {
LAB_006744d8:
      uVar1 = *puVar4;
    }
    else {
      uVar5 = uVar3 + ((long)param_3 - *param_2 >> 3) * -0x5555555555555555;
      if (0 < (long)uVar5) {
        puVar4 = (uint *)(param_2[uVar5 / 0xaa] + (uVar5 % 0xaa) * 0x18);
        goto LAB_006744d8;
      }
      uVar6 = (0xa9 - uVar5) / 0xaa;
      puVar4 = (uint *)(param_2[-uVar6] + (uVar6 * 0xaa - (0xa9 - uVar5)) * 0x18 + 0xfd8);
      uVar1 = *puVar4;
    }
    if (in_w9 <= uVar1) {
      if (uVar1 != in_w9) break;
      if (in_x11 <= *(ulong *)(puVar4 + 2)) goto LAB_006743c8;
    }
    uVar8 = *(undefined8 *)(puVar4 + 2);
    uVar7 = *(undefined8 *)puVar4;
    *(undefined8 *)(param_1 + 4) = *(undefined8 *)(puVar4 + 4);
    *(undefined8 *)(param_1 + 2) = uVar8;
    *(undefined8 *)param_1 = uVar7;
    param_1 = puVar4;
    in_x10 = uVar3;
  } while (1 < uVar2);
  *param_1 = in_w9;
  param_1[1] = in_w14;
  *(ulong *)(param_1 + 2) = in_x11;
  *(undefined8 *)(param_1 + 4) = in_x13;
  return;
}

