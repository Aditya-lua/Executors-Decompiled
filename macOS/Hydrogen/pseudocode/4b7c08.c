
void FUN_004b7c08(undefined8 *param_1,ulong param_2)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  
  uVar2 = param_2 + (param_2 >> 1);
  do {
    do {
      if (uVar2 == 0) {
        return;
      }
      uVar2 = uVar2 - 1;
      uVar3 = uVar2 - param_2;
      if (uVar2 < param_2) {
        uVar3 = 0;
        uVar4 = *param_1;
        *param_1 = param_1[uVar2];
        param_1[uVar2] = uVar4;
      }
      uVar1 = param_2;
      if (uVar2 <= param_2) {
        uVar1 = uVar2;
      }
      uVar5 = uVar3 << 1 | 1;
    } while (uVar1 <= uVar5);
    do {
      uVar7 = uVar3 * 2 + 2;
      if (uVar7 < uVar1) {
        if ((ulong)param_1[uVar5] < (ulong)param_1[uVar7]) {
          uVar5 = uVar5 + 1;
        }
        uVar6 = param_1[uVar3];
        uVar8 = param_1[uVar5];
        uVar7 = uVar5;
        if (uVar8 <= uVar6) break;
      }
      else {
        uVar6 = param_1[uVar3];
        uVar8 = param_1[uVar5];
        uVar7 = uVar5;
        if (uVar8 <= uVar6) break;
      }
      param_1[uVar3] = uVar8;
      param_1[uVar7] = uVar6;
      uVar5 = uVar7 << 1 | 1;
      uVar3 = uVar7;
    } while (uVar5 < uVar1);
  } while( true );
}

