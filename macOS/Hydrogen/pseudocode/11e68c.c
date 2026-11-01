
void FUN_0011e68c(long param_1,undefined4 param_2,int param_3)

{
  char in_NG;
  char in_OV;
  undefined4 in_w8;
  
  if (in_NG == in_OV) {
    *(undefined4 *)(param_1 + 0x34) = param_2;
    in_w8 = param_2;
  }
  *(undefined4 *)(param_1 + 0x38) = in_w8;
  *(undefined4 *)(param_1 + 0x3c) = in_w8;
  *(undefined1 *)(param_1 + 0x30) = 1;
  *(int *)(param_1 + 0x28) = *(int *)(param_1 + 0x28) - param_3;
  return;
}

