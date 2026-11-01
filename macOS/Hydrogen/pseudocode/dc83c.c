
void FUN_000dc83c(long param_1,int param_2)

{
  undefined1 *in_x9;
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0x4000);
  *in_x9 = 1;
  *(undefined4 *)(in_x9 + 4) = 1;
  *(undefined8 *)(&UNK_00006020 + param_1) = 0;
  *(undefined8 *)(&UNK_00006018 + param_1) = 0;
  *(undefined4 *)(in_x9 + 0x38) = *(undefined4 *)(lVar1 + 0x198);
  if (param_2 < 0) {
    param_2 = *(int *)(in_x9 + 0x40);
  }
  *(int *)(in_x9 + 0x3c) = param_2;
  *(undefined4 *)(in_x9 + 0x30) = 0x7f7fffff;
  in_x9[0x34] = 1;
  *(undefined8 *)(param_1 + 0x6000) = *(undefined8 *)PTR____stdoutp_009b0200;
  return;
}

