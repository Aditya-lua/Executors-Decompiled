
bool FUN_0019ccd8(code *param_1,undefined8 param_2)

{
  ulong uVar1;
  int in_w9;
  
  if (in_w9 == 1) {
    uVar1 = (*param_1)(param_2,&UNK_0081ca6a,0x17);
  }
  else {
    uVar1 = (*param_1)(param_2,&UNK_0081ca90,0x10);
  }
  return (uVar1 & 1) != 0;
}

