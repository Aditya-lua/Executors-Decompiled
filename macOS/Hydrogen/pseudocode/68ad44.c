
void FUN_0068ad44(undefined8 *param_1,undefined8 param_2)

{
  undefined8 in_x9;
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 unaff_x23;
  undefined8 *unaff_x24;
  
  puVar1 = param_1;
  do {
    puVar2 = puVar1 + 1;
    *puVar1 = *unaff_x20;
    puVar1 = puVar2;
    unaff_x20 = unaff_x20 + 1;
  } while (puVar2 != unaff_x24);
  *unaff_x19 = param_2;
  unaff_x19[1] = param_1;
  unaff_x19[2] = unaff_x24;
  unaff_x19[3] = in_x9;
  if (unaff_x21 != 0) {
    __ZdlPv();
    unaff_x24 = (undefined8 *)unaff_x19[2];
  }
  *unaff_x24 = unaff_x23;
  unaff_x19[2] = unaff_x19[2] + 8;
  return;
}

