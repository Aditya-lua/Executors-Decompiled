
void FUN_005e34c8(undefined8 *param_1,undefined8 param_2,long param_3)

{
  undefined4 in_w9;
  undefined8 in_x10;
  undefined4 uVar1;
  long lVar2;
  dword *pdVar3;
  
  if (*(long *)(param_3 + 0x10) == 0) {
    uVar1 = 0;
    pdVar3 = &MACH_HEADER.cputype;
    lVar2 = 0;
  }
  else {
    pdVar3 = *(undefined4 **)(param_3 + 8) + 1;
    uVar1 = **(undefined4 **)(param_3 + 8);
    lVar2 = *(long *)(param_3 + 0x10) + -1;
  }
  *param_1 = 4;
  param_1[1] = in_x10;
  param_1[2] = 0;
  *(undefined4 *)(param_1 + 3) = in_w9;
  param_1[4] = param_3;
  param_1[5] = pdVar3;
  param_1[6] = lVar2;
  param_1[7] = 0;
  *(undefined4 *)(param_1 + 8) = uVar1;
  param_1[9] = param_2;
  return;
}

