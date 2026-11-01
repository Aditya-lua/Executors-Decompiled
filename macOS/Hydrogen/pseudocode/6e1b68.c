
void FUN_006e1b68(ulong param_1)

{
  ulong in_x9;
  long in_x10;
  long in_x11;
  undefined4 *in_x12;
  long lVar1;
  long unaff_x19;
  
  lVar1 = in_x11;
  do {
    in_x12[-8] = 0;
    in_x12[-4] = 0;
    *in_x12 = 0;
    in_x12[4] = 0;
    in_x12 = in_x12 + 0x10;
    lVar1 = lVar1 + -4;
  } while (lVar1 != 0);
  if (in_x10 != in_x11) {
    do {
      *(undefined4 *)(in_x9 + 0xc) = 0;
      in_x9 = in_x9 + 0x10;
    } while (in_x9 < param_1);
  }
  *(ulong *)(unaff_x19 + 8) = param_1;
  return;
}

