
void FUN_005e3370(long *param_1,long param_2)

{
  ulong uVar1;
  undefined4 *puVar2;
  ulong in_x9;
  ulong uVar3;
  long unaff_x21;
  long unaff_x22;
  ulong uVar4;
  long lVar5;
  
  param_1[3] = param_2;
  uVar3 = param_1[2];
  uVar1 = in_x9 - uVar3;
  if (uVar3 <= in_x9 && uVar1 != 0) {
    if (*param_1 - uVar3 < uVar1) {
      func_0x007afea0(param_1,uVar3,uVar1);
      lVar5 = param_1[1];
      puVar2 = (undefined4 *)(lVar5 + param_1[2] * 4);
      uVar4 = param_1[2];
    }
    else {
      lVar5 = param_1[1];
      puVar2 = (undefined4 *)(lVar5 + uVar3 * 4);
      uVar4 = uVar3;
    }
    if (1 < uVar1) {
      _bzero(puVar2,(in_x9 + ~uVar3) * 4);
      puVar2 = (undefined4 *)(lVar5 + uVar3 * -4 + (uVar4 + unaff_x21 + unaff_x22) * 4 + -4);
      uVar4 = (uVar1 + uVar4) - 1;
    }
    *puVar2 = 0;
    in_x9 = uVar4 + 1;
  }
  param_1[2] = in_x9;
  return;
}

