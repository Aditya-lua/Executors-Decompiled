
void FUN_006b90d4(long param_1,undefined4 param_2)

{
  ulong uVar1;
  ulong uVar2;
  int iVar3;
  undefined8 uVar4;
  long in_x9;
  ulong in_x10;
  int in_w11;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 unaff_w21;
  undefined4 unaff_w22;
  ulong unaff_x23;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  
  uVar1 = *(ulong *)(param_1 + 8);
  if (-1 < in_w11) {
    uVar1 = in_x10;
    in_x9 = param_1;
  }
  uVar2 = uVar1;
  if (unaff_x23 <= uVar1) {
    uVar2 = unaff_x23;
  }
  iVar3 = _memcmp(param_2,in_x9,uVar2);
  if (iVar3 == 0) {
    if (uVar1 <= unaff_x23) {
      return;
    }
  }
  else if (-1 < iVar3) {
    return;
  }
  *unaff_x20 = unaff_w21;
  *(undefined4 *)(unaff_x19 + -0x20) = unaff_w22;
  uVar4 = *(undefined8 *)(unaff_x20 + 6);
  uVar7 = *(undefined8 *)(unaff_x20 + 4);
  uVar5 = *(undefined8 *)(unaff_x20 + 2);
  uVar8 = *(undefined8 *)(unaff_x19 + -0x10);
  uVar6 = *(undefined8 *)(unaff_x19 + -0x18);
  *(undefined8 *)(unaff_x20 + 6) = *(undefined8 *)(unaff_x19 + -8);
  *(undefined8 *)(unaff_x20 + 4) = uVar8;
  *(undefined8 *)(unaff_x20 + 2) = uVar6;
  *(undefined8 *)(unaff_x19 + -0x10) = uVar7;
  *(undefined8 *)(unaff_x19 + -0x18) = uVar5;
  *(undefined8 *)(unaff_x19 + -8) = uVar4;
  return;
}

