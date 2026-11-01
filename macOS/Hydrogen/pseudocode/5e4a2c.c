
void FUN_005e4a2c(long param_1)

{
  long in_x9;
  uint *puVar1;
  long in_x10;
  uint *puVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  undefined8 unaff_x26;
  
  param_1 = param_1 - in_x10;
  puVar1 = (uint *)(in_x9 + in_x10 * 4);
  puVar2 = (uint *)(unaff_x20 + in_x10 * 4);
  do {
    *puVar2 = *puVar2 ^ *puVar1;
    param_1 = param_1 + -1;
    puVar1 = puVar1 + 1;
    puVar2 = puVar2 + 1;
  } while (param_1 != 0);
  if (unaff_x25 <= unaff_x24) {
    unaff_x25 = unaff_x24;
  }
  *unaff_x19 = unaff_x23;
  unaff_x19[1] = unaff_x20;
  unaff_x19[2] = unaff_x26;
  unaff_x19[3] = unaff_x25;
  return;
}

