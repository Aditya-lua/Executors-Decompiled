
void FUN_0024e918(undefined8 param_1)

{
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uStack0000000000000080;
  undefined4 uStack0000000000000088;
  
  uStack0000000000000088 = 0x100001;
  uStack0000000000000080 = param_1;
  func_0x00248ae4();
  *(undefined1 *)(unaff_x21 + 0x335) = 1;
  uVar1 = *unaff_x19;
  uVar3 = unaff_x19[3];
  uVar2 = unaff_x19[2];
  unaff_x20[1] = unaff_x19[1];
  *unaff_x20 = uVar1;
  unaff_x20[3] = uVar3;
  unaff_x20[2] = uVar2;
  uVar1 = unaff_x19[4];
  unaff_x20[5] = unaff_x19[5];
  unaff_x20[4] = uVar1;
  unaff_x20[6] = unaff_x19[6];
  return;
}

