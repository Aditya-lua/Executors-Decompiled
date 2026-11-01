
void FUN_005c6fd0(long param_1,undefined8 param_2,long param_3)

{
  long lVar1;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  
  lVar1 = unaff_x22;
  do {
    param_1 = *(long *)(param_1 + 0x328);
    lVar1 = lVar1 + -1;
  } while (lVar1 != 0);
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = unaff_x22;
  unaff_x19[2] = unaff_x20;
  *(long *)(param_3 + 8) = param_1;
  *(undefined8 *)(param_3 + 0x10) = 0;
  *(undefined8 *)(param_3 + 0x18) = 0;
  return;
}

