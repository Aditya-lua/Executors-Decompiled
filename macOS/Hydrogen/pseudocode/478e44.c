
uint FUN_00478e44(ulong param_1,int param_2)

{
  long in_x9;
  uint uVar1;
  int in_w11;
  
  if (in_x9 + ~param_1 != 0) {
    uVar1 = 0;
    do {
      uVar1 = uVar1 + (byte)(&UNK_00891d14)[param_1];
      if ((uint)(param_2 - in_w11) < uVar1) break;
      param_1 = param_1 + 1;
    } while (in_x9 - 1U != param_1);
  }
  return (uint)param_1 & 1;
}

