
void FUN_0026df1c(long param_1)

{
  undefined8 *unaff_x19;
  undefined8 uVar1;
  
  uVar1 = *(undefined8 *)(param_1 + 8);
  unaff_x19[2] = *(undefined8 *)(param_1 + 0x10);
  unaff_x19[1] = uVar1;
  uVar1 = *(undefined8 *)(param_1 + 0x18);
  unaff_x19[4] = *(undefined8 *)(param_1 + 0x20);
  unaff_x19[3] = uVar1;
  uVar1 = *(undefined8 *)(param_1 + 0x28);
  unaff_x19[6] = *(undefined8 *)(param_1 + 0x30);
  unaff_x19[5] = uVar1;
  unaff_x19[7] = *(undefined8 *)(param_1 + 0x38);
  *unaff_x19 = 0x8000000000000001;
  return;
}

