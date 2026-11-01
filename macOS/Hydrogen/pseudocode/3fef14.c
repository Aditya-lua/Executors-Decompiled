
void FUN_003fef14(long param_1)

{
  undefined8 *in_x9;
  undefined8 *puVar1;
  undefined8 uVar2;
  long unaff_x19;
  long unaff_x20;
  undefined8 uVar3;
  undefined8 uVar4;
  
  puVar1 = (undefined8 *)(unaff_x20 + unaff_x19 * 0x18 + -8);
  do {
    uVar3 = in_x9[-1];
    uVar2 = in_x9[-2];
    uVar4 = puVar1[-2];
    in_x9[-1] = puVar1[-1];
    in_x9[-2] = uVar4;
    puVar1[-1] = uVar3;
    puVar1[-2] = uVar2;
    uVar2 = *in_x9;
    *in_x9 = *puVar1;
    *puVar1 = uVar2;
    param_1 = param_1 + -1;
    in_x9 = in_x9 + 3;
    puVar1 = puVar1 + -3;
  } while (param_1 != 0);
  return;
}

