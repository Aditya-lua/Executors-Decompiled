
void FUN_002402c8(void)

{
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  _memcpy();
  *(long *)(unaff_x21 + 0x10) = unaff_x24 + unaff_x23;
  unaff_x19[4] = unaff_x21;
  unaff_x19[5] = unaff_x22;
  uVar1 = *unaff_x20;
  uVar3 = unaff_x20[3];
  uVar2 = unaff_x20[2];
  unaff_x19[1] = unaff_x20[1];
  *unaff_x19 = uVar1;
  unaff_x19[3] = uVar3;
  unaff_x19[2] = uVar2;
  return;
}

