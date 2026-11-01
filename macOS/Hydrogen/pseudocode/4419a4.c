
void FUN_004419a4(ulong *param_1)

{
  ulong in_x9;
  undefined *in_x10;
  undefined *in_x11;
  ulong in_x12;
  ulong in_x13;
  char *in_x14;
  ulong uVar1;
  long in_x15;
  
  do {
    if (*in_x14 == '\0') {
      uVar1 = (long)in_x14 - (long)in_x10;
      in_x11 = &UNK_008889b4;
      if (uVar1 < in_x9) {
        in_x11 = in_x10;
      }
      in_x13 = 0x21;
      if (uVar1 < in_x9) {
        in_x13 = uVar1;
      }
      in_x12 = (ulong)(in_x9 <= uVar1);
      break;
    }
    in_x14 = in_x14 + 1;
    in_x15 = in_x15 + -1;
  } while (in_x15 != 0);
  param_1[1] = (ulong)in_x11;
  param_1[2] = in_x13;
  *param_1 = in_x12;
  return;
}

