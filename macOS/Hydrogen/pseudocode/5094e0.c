
void FUN_005094e0(undefined8 param_1,undefined8 param_2)

{
  bool in_ZR;
  undefined8 *in_x9;
  undefined8 *puVar1;
  long in_x10;
  long lVar2;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  
  if (!in_ZR) {
    lVar2 = unaff_x19 - in_x10;
    puVar1 = in_x9;
    do {
      in_x9 = puVar1 + 2;
      *puVar1 = unaff_x22;
      puVar1[1] = unaff_x21;
      lVar2 = lVar2 + -1;
      puVar1 = in_x9;
    } while (lVar2 != 0);
  }
  *in_x9 = unaff_x22;
  in_x9[1] = unaff_x21;
  *unaff_x20 = param_1;
  unaff_x20[1] = param_2;
  unaff_x20[2] = unaff_x19;
  return;
}

