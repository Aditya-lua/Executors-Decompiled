
uint FUN_00478d30(long param_1,int param_2)

{
  bool in_ZR;
  long in_x9;
  uint uVar1;
  int in_w11;
  
  if (!in_ZR) {
    uVar1 = 0;
    do {
      uVar1 = uVar1 + (byte)(&UNK_0089198b)[param_1];
      if ((uint)(param_2 - in_w11) < uVar1) break;
      param_1 = param_1 + 1;
    } while (in_x9 + -1 != param_1);
  }
  return (uint)param_1 & 1;
}

