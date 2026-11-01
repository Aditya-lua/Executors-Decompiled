
void FUN_0070bd58(undefined8 param_1,undefined8 param_2,int param_3)

{
  undefined4 in_w8;
  int in_w9;
  int iVar1;
  int in_w12;
  undefined4 *unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  
  if (in_w12 == 0x3d) {
    *(int *)(unaff_x21 + 0x10) = param_3 + 2;
    iVar1 = in_w9 + 2;
    *unaff_x19 = 0x111;
  }
  else {
    *unaff_x19 = 0x2f;
    iVar1 = in_w9 + 1;
  }
  *(undefined8 *)(unaff_x19 + 1) = unaff_x20;
  unaff_x19[3] = in_w8;
  unaff_x19[4] = iVar1;
  unaff_x19[5] = 0;
  *(undefined8 *)(unaff_x19 + 6) = 0;
  return;
}

