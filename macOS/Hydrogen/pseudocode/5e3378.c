
void FUN_005e3378(long *param_1)

{
  ulong uVar1;
  undefined4 *puVar2;
  ulong in_x9;
  ulong unaff_x20;
  long unaff_x21;
  long unaff_x22;
  ulong uVar3;
  long lVar4;
  
  uVar1 = in_x9 - unaff_x20;
  if (unaff_x20 <= in_x9 && uVar1 != 0) {
    if (*param_1 - unaff_x20 < uVar1) {
      func_0x007afea0();
      lVar4 = param_1[1];
      puVar2 = (undefined4 *)(lVar4 + param_1[2] * 4);
      uVar3 = param_1[2];
    }
    else {
      lVar4 = param_1[1];
      puVar2 = (undefined4 *)(lVar4 + unaff_x20 * 4);
      uVar3 = unaff_x20;
    }
    if (1 < uVar1) {
      _bzero(puVar2,(in_x9 + ~unaff_x20) * 4);
      puVar2 = (undefined4 *)(lVar4 + unaff_x20 * -4 + (uVar3 + unaff_x21 + unaff_x22) * 4 + -4);
      uVar3 = (uVar1 + uVar3) - 1;
    }
    *puVar2 = 0;
    in_x9 = uVar3 + 1;
  }
  param_1[2] = in_x9;
  return;
}

