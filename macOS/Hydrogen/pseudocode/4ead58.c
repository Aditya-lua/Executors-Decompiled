
void FUN_004ead58(long param_1,long param_2)

{
  undefined8 *unaff_x19;
  byte unaff_w20;
  
  *(byte *)(param_2 + param_1) = unaff_w20 | 0x30;
  *unaff_x19 = 3;
  unaff_x19[1] = param_2;
  unaff_x19[2] = param_1 + 1;
  return;
}

