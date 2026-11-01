
void FUN_00400cd8(undefined8 *param_1,long param_2,undefined8 param_3,undefined8 *param_4)

{
  long lVar1;
  undefined8 uVar2;
  long unaff_x22;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  lVar1 = unaff_x22 + param_2 * 0x18;
  uVar5 = *(undefined8 *)(lVar1 + 0x118);
  uVar3 = *(undefined8 *)(lVar1 + 0x110);
  uVar2 = *(undefined8 *)(lVar1 + 0x120);
  uVar6 = param_4[1];
  uVar4 = *param_4;
  *(undefined8 *)(lVar1 + 0x120) = param_4[2];
  *(undefined8 *)(lVar1 + 0x118) = uVar6;
  *(undefined8 *)(lVar1 + 0x110) = uVar4;
  param_1[1] = uVar5;
  *param_1 = uVar3;
  param_1[2] = uVar2;
  return;
}

