
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0025769c(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 *unaff_x19;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar1 = *param_1;
  uVar3 = param_1[3];
  uVar2 = param_1[2];
  param_2[1] = param_1[1];
  *param_2 = uVar1;
  param_2[3] = uVar3;
  param_2[2] = uVar2;
  uVar1 = param_1[4];
  param_2[5] = param_1[5];
  param_2[4] = uVar1;
  uVar1 = *(undefined8 *)((long)param_1 + 0x2a);
  *(undefined8 *)((long)param_2 + 0x32) = *(undefined8 *)((long)param_1 + 0x32);
  *(undefined8 *)((long)param_2 + 0x2a) = uVar1;
  uVar1 = _UNK_0082a3d0;
  unaff_x19[1] = _UNK_0082a3d8;
  *unaff_x19 = uVar1;
  unaff_x19[2] = param_2;
  unaff_x19[3] = 0x3a;
  return;
}

