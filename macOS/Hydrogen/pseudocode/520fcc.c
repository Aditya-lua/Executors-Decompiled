
void FUN_00520fcc(long param_1,long param_2)

{
  undefined1 uVar1;
  undefined8 *in_x9;
  long in_x10;
  undefined8 *puVar2;
  undefined8 *in_x11;
  undefined8 *in_x12;
  long lVar3;
  long *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  lVar3 = in_x10;
  do {
    uVar5 = in_x12[-3];
    uVar4 = in_x12[-2];
    uVar6 = in_x12[-1];
    uVar7 = *in_x12;
    uVar9 = in_x12[1];
    uVar8 = in_x12[2];
    uVar10 = in_x12[3];
    in_x11[-4] = in_x12[-4];
    in_x11[-3] = uVar5;
    in_x11[-2] = uVar4;
    in_x11[-1] = uVar6;
    *in_x11 = uVar7;
    in_x11[1] = uVar9;
    in_x11[2] = uVar8;
    in_x11[3] = uVar10;
    in_x11 = in_x11 + 8;
    in_x12 = in_x12 + 8;
    lVar3 = lVar3 + -4;
  } while (lVar3 != 0);
  puVar2 = (undefined8 *)(param_2 + in_x10 * 0x10 + 8);
  do {
    if (in_x9 == (undefined8 *)(unaff_x26 + unaff_x25 * 0x10)) break;
    uVar4 = in_x9[1];
    puVar2[-1] = *in_x9;
    *puVar2 = uVar4;
    puVar2 = puVar2 + 2;
    param_1 = param_1 + -1;
    in_x9 = in_x9 + 2;
  } while (param_1 != 0);
  uVar1 = *(undefined1 *)(unaff_x22 + 0x40);
  unaff_x19[4] = in_stack_00000010;
  unaff_x19[3] = in_stack_00000008;
  *unaff_x19 = unaff_x25;
  unaff_x19[1] = param_2;
  unaff_x19[2] = unaff_x25;
  unaff_x19[5] = in_stack_00000018;
  unaff_x19[6] = unaff_x23;
  unaff_x19[7] = unaff_x24;
  *(undefined1 *)(unaff_x19 + 8) = uVar1;
  return;
}

