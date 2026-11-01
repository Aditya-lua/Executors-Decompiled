
uint FUN_00478c44(long param_1)

{
  long in_x9;
  uint in_w10;
  uint in_w11;
  
  do {
    in_w10 = in_w10 + (byte)(&UNK_008913a0)[param_1];
    if (in_w11 < in_w10) break;
    param_1 = param_1 + 1;
  } while (in_x9 != param_1);
  return (uint)param_1 & 1;
}

