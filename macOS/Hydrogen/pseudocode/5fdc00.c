
void FUN_005fdc00(long param_1,long param_2,long param_3,long param_4,ulong param_5)

{
  ulong *puVar1;
  ulong *puVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  
  if (param_1 != param_2) {
    _memcpy(param_1,param_2,param_5 << 3);
  }
  if ((param_3 != 0) && (param_5 != 0)) {
    do {
      uVar5 = 0;
      uVar6 = 0;
      param_3 = param_3 + -1;
      do {
        uVar8 = *(ulong *)(param_1 + uVar5 * 8);
        *(ulong *)(param_1 + uVar5 * 8) = uVar6 | uVar8 << 1;
        uVar6 = uVar8 >> 0x3f;
        uVar5 = uVar5 + 1;
      } while (param_5 != uVar5);
      uVar5 = param_5;
      if ((long)uVar8 < 0) {
LAB_005fdca4:
        uVar6 = 0;
        uVar5 = 0;
        do {
          puVar1 = (ulong *)(param_1 + uVar5 * 8);
          puVar2 = (ulong *)(param_4 + uVar5 * 8);
          uVar9 = *puVar2;
          uVar8 = *puVar1;
          uVar3 = uVar8 - uVar9;
          *puVar1 = uVar3 - uVar6;
          uVar7 = puVar2[1];
          uVar4 = puVar1[1] - uVar7;
          uVar8 = (-(ulong)(uVar3 < uVar6) - (ulong)(uVar8 < uVar9)) + uVar4;
          uVar6 = (ulong)(uVar4 < uVar8);
          if (puVar1[1] < uVar7) {
            uVar6 = uVar6 + 1;
          }
          puVar1[1] = uVar8;
          uVar5 = uVar5 + 2;
        } while (uVar5 < param_5);
      }
      else {
        do {
          if (uVar5 == 0) goto LAB_005fdca4;
          uVar6 = *(ulong *)(param_1 + -8 + uVar5 * 8);
          uVar8 = *(ulong *)(param_4 + -8 + uVar5 * 8);
          if (uVar8 < uVar6) goto LAB_005fdca4;
          uVar5 = uVar5 - 1;
        } while (uVar8 <= uVar6);
      }
    } while (param_3 != 0);
  }
  return;
}

