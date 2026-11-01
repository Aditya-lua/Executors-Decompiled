
void FUN_005c6da4(undefined8 param_1,long param_2)

{
  long lVar1;
  long *in_x9;
  long lVar2;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  
  lVar2 = unaff_x22;
  do {
    lVar1 = *in_x9;
    in_x9 = (long *)(lVar1 + 0x380);
    lVar2 = lVar2 + -1;
  } while (lVar2 != 0);
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = unaff_x22;
  unaff_x19[2] = unaff_x20;
  *(long *)(param_2 + 8) = lVar1;
  *(undefined8 *)(param_2 + 0x10) = 0;
  *(undefined8 *)(param_2 + 0x18) = 0;
  return;
}

