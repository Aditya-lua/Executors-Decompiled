
void FUN_006b30cc(undefined8 param_1,long param_2)

{
  undefined4 *in_x9;
  long in_x10;
  long in_x11;
  undefined8 *in_x12;
  undefined8 *puVar1;
  long lVar2;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *unaff_x22;
  undefined8 unaff_x23;
  long unaff_x25;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  
  puVar1 = (undefined8 *)(param_2 + unaff_x25 * 4 + -0x20);
  lVar2 = in_x11;
  do {
    uVar5 = *in_x12;
    uVar4 = in_x12[3];
    uVar3 = in_x12[2];
    uVar9 = in_x12[-3];
    uVar8 = in_x12[-4];
    uVar7 = in_x12[-1];
    uVar6 = in_x12[-2];
    puVar1[1] = in_x12[1];
    *puVar1 = uVar5;
    puVar1[3] = uVar4;
    puVar1[2] = uVar3;
    puVar1[-3] = uVar9;
    puVar1[-4] = uVar8;
    puVar1[-1] = uVar7;
    puVar1[-2] = uVar6;
    in_x12 = in_x12 + -8;
    puVar1 = puVar1 + -8;
    lVar2 = lVar2 + -0x10;
  } while (lVar2 != 0);
  if (in_x10 != in_x11) {
    do {
      unaff_x22 = unaff_x22 + -1;
      in_x9 = in_x9 + -1;
      *in_x9 = *unaff_x22;
    } while (unaff_x22 != unaff_x20);
  }
  *(undefined4 **)(unaff_x19 + 0x1d8) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x1e0) = unaff_x23;
  *(undefined8 *)(unaff_x19 + 0x1e8) = param_1;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x1e0) = unaff_x23;
  return;
}

