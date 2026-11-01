
undefined8
FUN_006727c0(undefined8 param_1,undefined8 *param_2,undefined8 param_3,uint *param_4,
            undefined8 param_5,uint *param_6)

{
  bool in_ZR;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  
  if ((in_ZR) && (*(ulong *)(param_6 + 2) < *(ulong *)(param_4 + 2))) {
    uVar1 = param_2[2];
    uVar4 = param_2[1];
    uVar3 = *param_2;
    uVar2 = *(undefined8 *)(param_6 + 4);
    uVar5 = *(undefined8 *)param_6;
    param_2[1] = *(undefined8 *)(param_6 + 2);
    *param_2 = uVar5;
    param_2[2] = uVar2;
    *(undefined8 *)(param_6 + 2) = uVar4;
    *(undefined8 *)param_6 = uVar3;
    *(undefined8 *)(param_6 + 4) = uVar1;
    return 1;
  }
  uVar1 = param_2[2];
  uVar4 = param_2[1];
  uVar3 = *param_2;
  uVar2 = *(undefined8 *)(param_4 + 4);
  uVar5 = *(undefined8 *)param_4;
  param_2[1] = *(undefined8 *)(param_4 + 2);
  *param_2 = uVar5;
  param_2[2] = uVar2;
  *(undefined8 *)(param_4 + 2) = uVar4;
  *(undefined8 *)param_4 = uVar3;
  *(undefined8 *)(param_4 + 4) = uVar1;
  if ((*param_6 < *param_4) ||
     ((*param_6 == *param_4 && (*(ulong *)(param_6 + 2) < *(ulong *)(param_4 + 2))))) {
    uVar1 = *(undefined8 *)(param_4 + 4);
    uVar4 = *(undefined8 *)(param_4 + 2);
    uVar3 = *(undefined8 *)param_4;
    uVar2 = *(undefined8 *)(param_6 + 4);
    uVar5 = *(undefined8 *)param_6;
    *(undefined8 *)(param_4 + 2) = *(undefined8 *)(param_6 + 2);
    *(undefined8 *)param_4 = uVar5;
    *(undefined8 *)(param_4 + 4) = uVar2;
    *(undefined8 *)(param_6 + 2) = uVar4;
    *(undefined8 *)param_6 = uVar3;
    *(undefined8 *)(param_6 + 4) = uVar1;
    return 2;
  }
  return 1;
}

