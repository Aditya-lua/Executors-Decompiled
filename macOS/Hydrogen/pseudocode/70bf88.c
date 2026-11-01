
void FUN_0070bf88(undefined8 param_1,undefined8 param_2,int param_3)

{
  bool in_ZR;
  undefined4 in_w8;
  int in_w9;
  int iVar1;
  int in_w10;
  undefined4 *unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  
  if (in_ZR) {
    *(int *)(unaff_x21 + 0x10) = param_3 + 3;
    iVar1 = in_w9 + 3;
    *unaff_x19 = 0x115;
  }
  else if (in_w10 == 0x2e) {
    *(int *)(unaff_x21 + 0x10) = param_3 + 3;
    iVar1 = in_w9 + 3;
    *unaff_x19 = 0x106;
  }
  else {
    *unaff_x19 = 0x105;
    iVar1 = in_w9 + 2;
  }
  *(undefined8 *)(unaff_x19 + 1) = unaff_x20;
  unaff_x19[3] = in_w8;
  unaff_x19[4] = iVar1;
  unaff_x19[5] = 0;
  *(undefined8 *)(unaff_x19 + 6) = 0;
  return;
}

