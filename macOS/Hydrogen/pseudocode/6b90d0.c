
void FUN_006b90d0(long param_1,undefined4 param_2)

{
  ulong uVar1;
  int iVar2;
  undefined8 uVar3;
  long in_x9;
  undefined4 in_w10;
  undefined4 in_register_00004054;
  ulong uVar4;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 unaff_w21;
  undefined4 unaff_w22;
  ulong unaff_x23;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  
  uVar4 = *(ulong *)(param_1 + 8);
  if (-1 < (char)in_w10) {
    uVar4 = CONCAT44(in_register_00004054,in_w10);
    in_x9 = param_1;
  }
  uVar1 = uVar4;
  if (unaff_x23 <= uVar4) {
    uVar1 = unaff_x23;
  }
  iVar2 = _memcmp(param_2,in_x9,uVar1);
  if (iVar2 == 0) {
    if (uVar4 <= unaff_x23) {
      return;
    }
  }
  else if (-1 < iVar2) {
    return;
  }
  *unaff_x20 = unaff_w21;
  *(undefined4 *)(unaff_x19 + -0x20) = unaff_w22;
  uVar3 = *(undefined8 *)(unaff_x20 + 6);
  uVar7 = *(undefined8 *)(unaff_x20 + 4);
  uVar5 = *(undefined8 *)(unaff_x20 + 2);
  uVar8 = *(undefined8 *)(unaff_x19 + -0x10);
  uVar6 = *(undefined8 *)(unaff_x19 + -0x18);
  *(undefined8 *)(unaff_x20 + 6) = *(undefined8 *)(unaff_x19 + -8);
  *(undefined8 *)(unaff_x20 + 4) = uVar8;
  *(undefined8 *)(unaff_x20 + 2) = uVar6;
  *(undefined8 *)(unaff_x19 + -0x10) = uVar7;
  *(undefined8 *)(unaff_x19 + -0x18) = uVar5;
  *(undefined8 *)(unaff_x19 + -8) = uVar3;
  return;
}

